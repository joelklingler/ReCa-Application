using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Reca.TechnicalService.Customers.Test
{
  [TestClass]
  public class CustomerServiceTest
  {
    [TestMethod]
    public void GetCustomersTest()
    {
      using (var service = new CustomerService())
      {
        var res = service.GetCustomers();
        Assert.IsNotNull(res);
      }
    }

    [TestMethod]
    public void CreateCustomerTest()
    {
      // act
      using (var service = new CustomerService())
      {
        var res = service.Create();
        res.LastName = "Janett";
        res.FirstName = "Niclas";
        res.CommunicationTelephone = "123456789";
        res.CommunicationEmail = "niclas.janett@bluewin.ch";
        res.CommunicationAddress = "Erchenwilerstrasse 6a";
        res.Insurance = "Privathaftpflichtversicherung";
        service.Save();
      }

      // assert
      using (var service = new CustomerService())
      {
        var item = service.GetCustomers().FirstOrDefault(x => x.LastName == "Janett");
        Assert.IsNotNull(item);
      }
    }

    [TestMethod]
    public void DeleteCustomerTest()
    {
      // arrange
      CreateTestCustomer();

      // act
      DeleteTestCustomer();

      // assert
      using (var service = new CustomerService())
      {
        var customer = service.GetCustomers().FirstOrDefault(x => x.FirstName == "test");
        Assert.IsNull(customer);
      }
    }

    [TestMethod]
    public void UpdateCustomerTest()
    {
      // arrange
      CreateTestCustomer();

      // act
      using (var service = new CustomerService())
      {
        var customer = service.GetCustomers().FirstOrDefault(x => x.FirstName == "test");
        customer.LastName = "changed";
        service.Save();
      }

      // assert
      using (var service = new CustomerService())
      {
        var customer = service.GetCustomers().FirstOrDefault(x => x.FirstName == "test");
        Assert.IsNotNull(customer);
        Assert.AreEqual(customer.LastName, "changed");
      }

      // dispose
      DeleteTestCustomer();
    }

    private void CreateTestCustomer()
    {
      using (var service = new CustomerService())
      {
        var item = service.Create();
        item.LastName = "test";
        item.FirstName = "test";
        service.Save();
      }
    }

    private void DeleteTestCustomer()
    {
      using (var service = new CustomerService())
      {
        var customer = service.GetCustomers().FirstOrDefault(x => x.FirstName == "test");
        Assert.IsNotNull(customer);
        service.Delete(customer.Id);
      }
    }
  }
}