using System;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Reca.TechnicalService.Fleet.Facades;
using Reca.TechnicalService.Basics.Interfaces;

namespace Reca.TechnicalService.Fleet.Test
{
  [TestClass]
  public class FleetServiceTest
  {
    [TestMethod]
    public void GetVehiclesTest()
    {
      using (FleetService service = new FleetService())
      {
        var res = service.GetVehicles();
        Assert.IsNotNull(res);
      }
    }

    [TestMethod]
    public void CreateVehicleTest()
    {
      // act
      using (FleetService service = new FleetService())
      {
        var res = service.Create();
        res.LicenseNumber = "SG123456";
        res.MaxPersonsCount = 5;
        res.VehicleBrand = "Audi";
        res.VehicleColor = "Red";
        res.VehicleCost = 125;
        res.VehicleInsurance = "Mobiliar";
        res.VehicleStatus = true;
        res.VehicleType = "SUV";
        res.VehicleYear = DateTime.Parse("01.01.2010");
        service.Save();
      }

      // assert
      using (FleetService service = new FleetService())
      {
        var item = service.GetVehicles().FirstOrDefault(x => x.LicenseNumber == "SG123456");
        Assert.IsNotNull(item);
      }
    }

    [TestMethod]
    public void UpdateVehicleTest()
    {
      // arrange
      CreateTestVehicle();

      // act
      using (FleetService service = new FleetService())
      {
        IVehicle vehicle = service.GetVehicles().FirstOrDefault(x => x.LicenseNumber == "SG000000");
        vehicle.MaxPersonsCount = 100;
        service.Save();
      }

      // assert
      using (FleetService service = new FleetService())
      {
        IVehicle vehicle = service.GetVehicles().FirstOrDefault(x => x.LicenseNumber == "SG000000");
        Assert.IsNotNull(vehicle);
        Assert.AreEqual(vehicle.MaxPersonsCount, 100);
      }

      // dispose
      DeleteTestVehicle();
    }

    [TestMethod]
    public void DeleteVehicleTest()
    {
      // arrange
      CreateTestVehicle();

      // act
      DeleteTestVehicle();

      // assert
      using (FleetService service = new FleetService())
      {
        var vehicle = service.GetVehicles().FirstOrDefault(x => x.LicenseNumber == "SG000000");
        Assert.IsNull(vehicle);
      }
    }

    private void CreateTestVehicle()
    {
      using (FleetService service = new FleetService())
      {
        var res = service.Create();
        res.LicenseNumber = "SG000000";
        res.MaxPersonsCount = 5;
        res.VehicleBrand = "Audi";
        res.VehicleColor = "Red";
        res.VehicleCost = 125;
        res.VehicleInsurance = "Mobiliar";
        res.VehicleStatus = true;
        res.VehicleType = "SUV";
        res.VehicleYear = DateTime.Parse("01.01.2010");
        service.Save();
      }
    }

    private void DeleteTestVehicle()
    {
      using (FleetService service = new FleetService())
      {
        IVehicle vehicle = service.GetVehicles().FirstOrDefault(x => x.LicenseNumber == "SG000000");
        Assert.IsNotNull(vehicle);
        service.Delete(vehicle.Id);
      }
    }
  }
}
