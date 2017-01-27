using System;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Reca.Customers;
using Reca.DataTransferObjects.Basics.Objects;
using Reca.Finance;
using Reca.Rentals;
using Reca.Vehicles;

namespace Reca.Finances.Test
{
  [TestClass]
  public class FinanceServiceTest
  {
    [TestMethod]
    public void GetAllInvoicesTest()
    {
      using (FinanceService service = new FinanceService())
      {
        var res = service.GetAllInvoices();
        Assert.IsNotNull(res);
      }
    }

    //[TestMethod]
    //public void CrudInvoiceTest()
    //{
    //  // arrange
    //  Invoice inv = new Invoice();
    //  using (CustomerService service = new CustomerService())
    //  {
    //    inv.Customer = service.GetAllCustomers().FirstOrDefault();
    //  }
    //  using (RentalService service = new RentalService())
    //  {
    //    inv.Rental = service.GetAllRentals().FirstOrDefault();
    //  }
    //  inv.AdditionalInformation = "test";
    //  inv.Amount = 1000;
    //  inv.InvoiceDate = DateTime.Now;
    //  inv.InvoiceState = false;
    //  inv.MaxPayDate = DateTime.Now.AddDays(30);

    //  // act create
    //  using (FinanceService service = new FinanceService())
    //  {
    //    service.CreateInvoice(inv);
    //  }
      
    //  // assert create
    //  using (FinanceService service = new FinanceService())
    //  {
    //    Invoice invoice = service.GetAllInvoices().FirstOrDefault(x => x.AdditionalInformation == "test");
    //    Assert.IsNotNull(invoice);
    //  }
    //}
  }
}
