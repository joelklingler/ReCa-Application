using System;

namespace Reca.TechnicalService.Basics.Interfaces
{
  public interface IVehicle
  {
    int Id { get; set; }
    string LicenseNumber { get; set; }
    string VehicleType { get; set; }
    DateTime? VehicleYear { get; set; }
    string VehicleColor { get; set; }
    int? MaxPersonsCount { get; set; }
    string VehicleBrand { get; set; }
    decimal? VehicleCost { get; set; }
    string VehicleInsurance { get; set; }
    bool? VehicleStatus { get; set; }
  }
}