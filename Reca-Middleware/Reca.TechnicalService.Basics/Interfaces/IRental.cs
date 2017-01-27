using System;

namespace Reca.TechnicalService.Basics.Interfaces
{
  public interface IRental
  {
    int Id { get; set; }
    int VehicleId { get; set; }
    int CustomerId { get; set; }
    DateTime? StartDate { get; set; }
    DateTime? EndDate { get; set; }
    ICustomer ICustomer { get; set; }
    IVehicle IVehicle { get; set; }
  }
}