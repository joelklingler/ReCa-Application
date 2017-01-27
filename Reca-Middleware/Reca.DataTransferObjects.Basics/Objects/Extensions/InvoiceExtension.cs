using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Basics.Interfaces;
using Reca.TechnicalService.Finance.Entities;

namespace Reca.DataTransferObjects.Basics.Objects.Extensions
{
  public static class InvoiceExtension
  {
    public static Invoice GetData(this IInvoice obj)
    {
      if (obj == null)
      {
        return null;
      }
      var invoice = new Invoice();
      invoice.Id = obj.Id;
      invoice.Rental = obj.IRental.GetData();
      invoice.AdditionalInformation = obj.AdditionalInformation;
      invoice.Amount = obj.Amount;
      invoice.Customer = obj.ICustomer.GetData();
      invoice.InvoiceDate = obj.InvoiceDate;
      invoice.InvoiceState = obj.InvoiceState;
      invoice.MaxPayDate = obj.MaxPayDate;
      invoice.Payments = obj.IPayment.Select(e => e.GetData()).ToList();
      return invoice;
    }

    public static void SetData(Invoice src, IInvoice trg)
    {
      trg.IRental = new FinanceRental();
      trg.ICustomer = new Customer();
      trg.IPayment = new List<IPayment>();
      RentalExtension.SetData(src.Rental, trg.IRental);
      CustomerExtension.SetData(src.Customer, trg.ICustomer);
      if (src.Payments != null) PaymentExtension.SetData(src.Payments, trg.IPayment);
      trg.Id = src.Id;
      trg.InvoiceDate = src.InvoiceDate;
      trg.InvoiceState = src.InvoiceState;
      trg.MaxPayDate = src.MaxPayDate;
      trg.AdditionalInformation = src.AdditionalInformation;
      trg.Amount = src.Amount;
      trg.RentalId = src.Rental.Id;
    }
  }
}
