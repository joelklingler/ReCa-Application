using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Rental.Entities;

namespace Reca.TechnicalService.Rental.Interfaces
{
  public interface IInvoice
  {
    int Id { get; set; }
    Nullable<System.DateTime> InvoiceDate { get; set; }
    Nullable<System.DateTime> MaxPayDate { get; set; }
    Nullable<decimal> Amount { get; set; }
    int CustomerId { get; set; }
    Nullable<bool> InvoiceState { get; set; }
    string AdditionalInformation { get; set; }
    int RentalId { get; set; }
    Customer Customer { get; set; }
    Reca.TechnicalService.Rental.Entities.Rental Rental { get; set; }
  }
}
