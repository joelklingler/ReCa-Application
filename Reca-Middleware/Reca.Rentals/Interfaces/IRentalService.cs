using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;
using Reca.DataTransferObjects.Basics.Objects;

namespace Reca.Rentals.Interfaces
{
  [ServiceContract]
  public interface IRentalService : IDisposable
  {
    [OperationContract]
    Rental GetRentalById(int id);

    [OperationContract]
    IList<Rental> GetAllRentals();

    [OperationContract]
    IList<Rental> GetAllRentalsByCustomer(int id);

    [OperationContract]
    IList<Rental> GetAllRentalsByVehicle(int id);

    [OperationContract]
    void CreateRental(Rental rent);

    [OperationContract]
    void UpdateRental(Rental rent);

    [OperationContract]
    void DeleteRental(int id);
  }
}
