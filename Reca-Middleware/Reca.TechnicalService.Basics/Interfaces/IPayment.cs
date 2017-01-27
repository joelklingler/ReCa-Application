using System;

namespace Reca.TechnicalService.Basics.Interfaces
{
  public interface IPayment
  {
    int Id { get; set; }
    DateTime? PaymentDate { get; set; }
    string IBAN { get; set; }
    string AdditionalInformation { get; set; }
    int InvoiceId { get; set; }
    IInvoice IInvoice { get; set; }
  }
}