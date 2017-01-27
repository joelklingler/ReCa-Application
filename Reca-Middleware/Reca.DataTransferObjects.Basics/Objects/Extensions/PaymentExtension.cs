using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.CompilerServices;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Basics.Interfaces;

namespace Reca.DataTransferObjects.Basics.Objects.Extensions
{
  public static class PaymentExtension
  {
    public static Payment GetData(this IPayment obj)
    {
      if (obj == null)
      {
        return null;
      }
      var payment = new Payment();
      payment.Id = obj.Id;
      payment.AdditionalInformation = obj.AdditionalInformation;
      payment.IBAN = obj.IBAN;
      payment.Invoice = obj.IInvoice.GetData();
      payment.PaymentDate = obj.PaymentDate;
      return payment;
    }

    public static void SetData(Payment src, IPayment trg)
    {
      trg.Id = src.Id;
      trg.AdditionalInformation = src.AdditionalInformation;
      trg.IBAN = src.IBAN;
      InvoiceExtension.SetData(src.Invoice, trg.IInvoice);
      trg.PaymentDate = src.PaymentDate;
    }

    public static void SetData(ICollection<Payment> src, ICollection<IPayment> trg)
    {
      foreach (Payment payment in src)
      {
        IPayment pay = new TechnicalService.Finance.Entities.Payment();
        SetData(payment, pay);
        trg.Add(pay);
      }
    }
  }
}
