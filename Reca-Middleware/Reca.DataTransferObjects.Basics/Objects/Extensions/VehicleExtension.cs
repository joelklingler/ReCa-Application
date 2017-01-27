using Reca.TechnicalService.Basics.Interfaces;

namespace Reca.DataTransferObjects.Basics.Objects.Extensions
{
  public static class VehicleExtension
  {
    public static Vehicle GetData(this IVehicle obj)
    {
      if (obj == null)
      {
        return null;
      }
      var vehicle = new Vehicle();
      vehicle.Id = obj.Id;
      vehicle.LicenseNumber = obj.LicenseNumber;
      vehicle.MaxPersonsCount = obj.MaxPersonsCount;
      vehicle.VehicleBrand = obj.VehicleBrand;
      vehicle.VehicleColor = obj.VehicleColor;
      vehicle.VehicleCost = obj.VehicleCost;
      vehicle.VehicleInsurance = obj.VehicleInsurance;
      //vehicle.VehicleStatus = obj.VehicleStatus;
      vehicle.VehicleType = obj.VehicleType;
      vehicle.VehicleYear = obj.VehicleYear;
      return vehicle;
    }

    public static void SetData(Vehicle src, IVehicle trg)
    {
      trg.Id = src.Id;
      trg.LicenseNumber = src.LicenseNumber;
      trg.MaxPersonsCount = src.MaxPersonsCount;
      trg.VehicleBrand = src.VehicleBrand;
      trg.VehicleColor = src.VehicleColor;
      trg.VehicleCost = src.VehicleCost;
      trg.VehicleInsurance = src.VehicleInsurance;
      //trg.VehicleStatus = src.VehicleStatus;
      trg.VehicleType = src.VehicleType;
      trg.VehicleYear = src.VehicleYear;
    }
  }
}