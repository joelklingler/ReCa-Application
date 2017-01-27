using System;
using System.Collections.Generic;
using System.Linq;
using Reca.DataTransferObjects.Basics.Objects;
using Reca.DataTransferObjects.Basics.Objects.Extensions;
using Reca.TechnicalService.Rentals.Facades;
using Reca.TechnicalService.Vehicles.Facades;

namespace Reca.Composite.Vehicles
{
  public class VehicleController : IDisposable
  {
    private VehicleService _vehicleService;

    private RentalService _rentalService;

    private RentalService RentalService
    {
      get
      {
        if (_rentalService == null)
        {
          _rentalService = new RentalService();
        }
        return _rentalService;
      }
    }

    private VehicleService VehicleService
    {
      get
      {
        if (_vehicleService == null)
        {
          _vehicleService = new VehicleService();
        }
        return _vehicleService;
      }
    }

    public void Dispose()
    {
      _vehicleService.Dispose();
    }

    public IList<Vehicle> GetAllVehicles()
    {
      return VehicleService.GetVehicles().Select(e => e.GetData()).ToList();
    }

    public IList<Vehicle> GetAvailableVehicles(DateTime startDate, DateTime endDate)
    {
      // Load all rentals
      IList<Rental> rentals = RentalService.GetAllRentals().Select(e => e.GetData()).ToList();

      // Get all active rentals.
      IList<Rental> active = new List<Rental>();
      foreach (Rental rental in rentals)
      {
        bool startIsAfterStart = DateTime.Compare(rental.StartDate.Value, startDate) <= 0;
        bool startIsBeforeEnd = DateTime.Compare(rental.EndDate.Value, startDate) >= 0;
        bool startIsBetween = startIsAfterStart && startIsBeforeEnd;

        bool endIsAfterStart = DateTime.Compare(rental.StartDate.Value, endDate) <= 0;
        bool endIsBeforeEnd = DateTime.Compare(rental.EndDate.Value, endDate) >= 0;
        bool endIsBetween = endIsAfterStart && endIsBeforeEnd;

        bool durationIsOverRental = !startIsAfterStart && !endIsBeforeEnd;
        if (startIsBetween || endIsBetween || durationIsOverRental)
        {
          active.Add(rental);
        }
      }
      IList<Vehicle> usedVehicles = active.Select(e => e.Vehicle).ToList();
      IList<Vehicle> allVehicles = VehicleService.GetVehicles().Select(e => e.GetData()).ToList();
      foreach (Vehicle usedVehicle in usedVehicles)
      {
        allVehicles.Remove(allVehicles.FirstOrDefault(x => x.Id == usedVehicle.Id));
      }
      return allVehicles;
    }

    public Vehicle GetVehicleById(int id)
    {
      return VehicleService.GetVehicleById(id).GetData();
    }

    public void CreateVehicle(Vehicle veh)
    {
      var newVehicle = VehicleService.Create();
      VehicleExtension.SetData(veh, newVehicle);
      VehicleService.Save();
    }

    public void UpdateVehicle(Vehicle veh)
    {
      var oldVehicle = VehicleService.GetVehicleById(veh.Id);
      if (oldVehicle == null)
      {
        return;
      }
      VehicleExtension.SetData(veh, oldVehicle);
      VehicleService.Save();
    }

    public void DeleteVehicle(int id)
    {
      VehicleService.Delete(id);
    }
  }
}