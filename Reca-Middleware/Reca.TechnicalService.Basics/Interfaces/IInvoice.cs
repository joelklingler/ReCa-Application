using System;
using System.Collections.Generic;
using System.Diagnostics.CodeAnalysis;

namespace Reca.TechnicalService.Basics.Interfaces
{
  public interface IInvoice
  {
    int Id { get; set; }
    DateTime? InvoiceDate { get; set; }
    DateTime? MaxPayDate { get; set; }
    decimal? Amount { get; set; }
    int CustomerId { get; set; }
    bool? InvoiceState { get; set; }
    string AdditionalInformation { get; set; }
    int RentalId { get; set; }

    ICustomer ICustomer { get; set; }
    IRental IRental { get; set; }

    [SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
    ICollection<IPayment> IPayment { get; set; }
  }
}