using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Rental.Entities;
using Reca.TechnicalService.Customers.Interfaces;

namespace Reca.TechnicalService.Rental.Interfaces
{
  public interface IRental
  {
    int Id { get; set; }
    int VehicleId { get; set; }
    int CustomerId { get; set; }
    Nullable<System.DateTime> StartDate { get; set; }
    Nullable<System.DateTime> EndDate { get; set; }
    ICustomer Customer { get; set; }
    [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
    ICollection<Invoice> Invoice { get; set; }
    Vehicle Vehicle { get; set; }
  }
}
