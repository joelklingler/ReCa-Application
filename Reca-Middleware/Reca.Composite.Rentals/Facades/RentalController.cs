using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.DataTransferObjects.Basics.Objects;
using Reca.DataTransferObjects.Basics.Objects.Extensions;
using Reca.TechnicalService.Rentals.Facades;

namespace Reca.Composite.Rentals.Facades
{
  public class RentalController : IDisposable
  {
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

    public void Dispose()
    {
      _rentalService.Dispose();
    }

    public IList<Rental> GetAllRentals()
    {
      return RentalService.GetAllRentals().Select(e => e.GetData()).ToList();
    }

    public Rental GetRentalById(int id)
    {
      return RentalService.GetAllRentals().FirstOrDefault(x => x.Id == id).GetData();
    }

    public IList<Rental> GetAllRentalsByCustomer(int id)
    {
      return RentalService.GetAllRentalsByCustomer(id).Select(e => e.GetData()).ToList();
    }

    public IList<Rental> GetAllRentalsByVehicle(int id)
    {
      return RentalService.GetAllRentalsByVehicle(id).Select(e => e.GetData()).ToList();
    }

    public void CreateRental(Rental rental)
    {
      var newRental = RentalService.Create();
      RentalExtension.SetData(rental, newRental);
      RentalService.Save();
    }

    public void UpdateRental(Rental rental)
    {
      var oldRental = RentalService.GetAllRentals().FirstOrDefault(x => x.Id == rental.Id);
      if (oldRental == null)
      {
        return;
      }
      RentalExtension.SetData(rental, oldRental);
      RentalService.Save();
    }

    public void DeleteRental(int id)
    {
      RentalService.Delete(id);
    }
  }
}
