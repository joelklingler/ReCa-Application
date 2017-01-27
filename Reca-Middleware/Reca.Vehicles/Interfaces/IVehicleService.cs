using System;
using System.Collections.Generic;
using System.ServiceModel;
using Reca.DataTransferObjects.Basics.Objects;

namespace Reca.Vehicles.Interfaces
{
  [ServiceContract]
  public interface IVehicleService : IDisposable
  {
    [OperationContract]
    Vehicle GetVehicleById(int id);

    [OperationContract]
    IList<Vehicle> GetAllVehicles();

    [OperationContract]
    void CreateVehicle(Vehicle vehicle);

    [OperationContract]
    void UpdateVehicle(Vehicle vehicle);

    [OperationContract]
    void DeleteVehicle(int vehicle);

    [OperationContract]
    IList<Vehicle> GetAvailableVehicles(DateTime startDate, DateTime endDate);
  }
}