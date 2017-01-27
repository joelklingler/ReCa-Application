using System;
using System.Collections.Generic;
using Reca.Composite.Vehicles;
using Reca.DataTransferObjects.Basics.Objects;
using Reca.Vehicles.Interfaces;

namespace Reca.Vehicles
{
  public class VehicleService : IVehicleService
  {
    private VehicleController _controller;

    public VehicleController Controller
    {
      get
      {
        if (_controller == null)
        {
          _controller = new VehicleController();
        }
        return _controller;
      }
    }

    public Vehicle GetVehicleById(int id)
    {
      return Controller.GetVehicleById(id);
    }

    public IList<Vehicle> GetAvailableVehicles(DateTime startDate, DateTime endDate)
    {
      return Controller.GetAvailableVehicles(startDate, endDate);
    }

    public IList<Vehicle> GetAllVehicles()
    {
      return Controller.GetAllVehicles();
    }

    public void CreateVehicle(Vehicle vehicle)
    {
      Controller.CreateVehicle(vehicle);
    }

    public void UpdateVehicle(Vehicle vehicle)
    {
      Controller.UpdateVehicle(vehicle);
    }

    public void DeleteVehicle(int id)
    {
      Controller.DeleteVehicle(id);
    }

    public void Dispose()
    {
      _controller.Dispose();
    }
  }
}