using System.Collections.Generic;
using System.Linq;
using Reca.DataTransferObjects.Basics.Objects;
using Reca.DataTransferObjects.Basics.Objects.Extensions;
using Reca.TechnicalService.Customers;

namespace Reca.Composite.Customers.Facades
{
  public class CustomerController
  {
    private CustomerService _customerService;

    private CustomerService CustomerService
    {
      get
      {
        if (_customerService == null)
        {
          _customerService = new CustomerService();
        }
        return _customerService;
      }
    }

    public IList<Customer> GetAllCustomers()
    {
      return CustomerService.GetCustomers().Select(e => e.GetData()).ToList();
    }

    public Customer GetCustomerById(int id)
    {
      return CustomerService.GetCustomer(id).GetData();
    }

    public void CreateCustomer(Customer customer)
    {
      var newCustomer = CustomerService.Create();
      CustomerExtension.SetData(customer, newCustomer);
      CustomerService.Save();
    }

    public void UpdateCustomer(Customer customer)
    {
      var oldCustomer = CustomerService.GetCustomer(customer.Id);
      if (oldCustomer == null)
      {
        return;
      }
      CustomerExtension.SetData(customer, oldCustomer);
      CustomerService.Save();
    }

    public void DeleteCustomer(int id)
    {
      CustomerService.Delete(id);
    }
  }
}