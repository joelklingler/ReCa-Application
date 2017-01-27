using System;
using System.Collections.Generic;
using System.ServiceModel;
using Reca.Composite.Customers.Facades;
using Reca.Customers.Interfaces;
using Reca.DataTransferObjects.Basics.Objects;

namespace Reca.Customers
{
    public class CustomerService : ICustomerService
    {
        private CustomerController _controller;

        public CustomerController Controller
        {
            get
            {
                if (_controller == null)
                {
                    _controller = new CustomerController();
                }
                return _controller;
            }
        }

        public IList<Customer> GetAllCustomers()
        {
            return Controller.GetAllCustomers();
        }

        public Customer GetCustomerById(int id)
        {
            return Controller.GetCustomerById(id);
        }

        public void CreateCustomer(Customer customer)
        {
            Controller.CreateCustomer(customer);
        }

        public void UpdateCustomer(Customer customer)
        {
            Controller.UpdateCustomer(customer);
        }

        public void DeleteCustomer(int id)
        {
            Controller.DeleteCustomer(id);
        }

        public void Dispose()
        {
            _controller = null;
        }
    }
}