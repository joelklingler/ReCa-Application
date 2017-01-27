using System;
using System.Collections.Generic;
using System.ServiceModel;
using Reca.DataTransferObjects.Basics.Objects;

namespace Reca.Customers.Interfaces
{
  [ServiceContract]
  public interface ICustomerService : IDisposable
  {
    [OperationContract]
    Customer GetCustomerById(int id);

    [OperationContract]
    IList<Customer> GetAllCustomers();

    [OperationContract]
    void CreateCustomer(Customer customer);

    [OperationContract]
    void UpdateCustomer(Customer customer);

    [OperationContract]
    void DeleteCustomer(int id);
  }
}