using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Rental.Entities;

namespace Reca.TechnicalService.Rental.Interfaces
{
  public interface IVehicle
  {
    int Id { get; set; }
    string LicenseNumber { get; set; }
    string VehicleType { get; set; }
    Nullable<System.DateTime> VehicleYear { get; set; }
    string VehicleColor { get; set; }
    Nullable<int> MaxPersonsCount { get; set; }
    string VehicleBrand { get; set; }
    Nullable<decimal> VehicleCost { get; set; }
    string VehicleInsurance { get; set; }
    Nullable<bool> VehicleStatus { get; set; }
    ICollection<Reca.TechnicalService.Rental.Entities.Rental> Rental { get; set; }
  }
}
