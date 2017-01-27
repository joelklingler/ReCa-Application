using System;
using System.Linq;
using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace Reca.Vehicles.Test
{
  [TestClass]
  public class VehicleServiceTest
  {
    [TestMethod]
    public void GetAllVehiclesTest()
    {
      // arrange
      using (VehicleService service = new VehicleService())
      {
        // act
        var res = service.GetAllVehicles();

        // assert
        Assert.IsNotNull(res);
        Assert.IsTrue(res.Any());
      }
    }

    [TestMethod]
    public void GetAllAvaiableVehiclesTest()
    {
      // arrange
      int vehicleCount;
      int bookedOne;
      int bookedTwo;
      int bookedThree;
      int bookedFour;
      int bookedFive;
      int free;
      DateTime startDateBehind = DateTime.Parse("2016-05-20");
      DateTime startDateAfter = DateTime.Parse("2016-05-30");
      DateTime startDateFuture = DateTime.Parse("2017-01-01");
      DateTime endDateBefore = DateTime.Parse("2016-06-01");
      DateTime endDateAfter = DateTime.Parse("2016-06-10");
      DateTime endDateFuture = DateTime.Parse("2018-01-01");

      using (VehicleService service = new VehicleService())
      {
        vehicleCount = service.GetAllVehicles().Count;

        // act
        bookedOne = service.GetAvailableVehicles(startDateBehind, endDateAfter).Count;
        bookedTwo = service.GetAvailableVehicles(startDateAfter, endDateAfter).Count;
        bookedThree = service.GetAvailableVehicles(startDateBehind, endDateBefore).Count;
        bookedFour = service.GetAvailableVehicles(startDateAfter, endDateAfter).Count;
        bookedFive = service.GetAvailableVehicles(startDateBehind, endDateBefore).Count;
        free = service.GetAvailableVehicles(startDateFuture, endDateFuture).Count;
      }

      // Assert
      Assert.AreNotEqual(vehicleCount, bookedOne);
      Assert.AreNotEqual(vehicleCount, bookedTwo);
      Assert.AreNotEqual(vehicleCount, bookedThree);
      Assert.AreNotEqual(vehicleCount, bookedFour);
      Assert.AreNotEqual(vehicleCount, bookedFive);
      Assert.AreEqual(vehicleCount, free);
    }
  }
}
