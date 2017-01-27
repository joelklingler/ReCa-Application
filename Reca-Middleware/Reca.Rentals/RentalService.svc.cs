using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using Reca.Composite.Rentals.Facades;
using Reca.DataTransferObjects.Basics.Objects;
using Reca.Rentals.Interfaces;

namespace Reca.Rentals
{
  public class RentalService : IRentalService
  {
    private RentalController _controller;

    public RentalController Controller
    {
      get
      {
        if (_controller == null)
        {
          _controller = new RentalController();
        }
        return _controller;
      }
    }

    public Rental GetRentalById(int id)
    {
      return Controller.GetRentalById(id);
    }

    public IList<Rental> GetAllRentals()
    {
      return Controller.GetAllRentals();
    }

    public IList<Rental> GetAllRentalsByCustomer(int id)
    {
      return Controller.GetAllRentalsByCustomer(id);
    }

    public IList<Rental> GetAllRentalsByVehicle(int id)
    {
      return Controller.GetAllRentalsByVehicle(id);
    }

    public void CreateRental(Rental rent)
    {
      Controller.CreateRental(rent);
    }

    public void UpdateRental(Rental rent)
    {
      Controller.UpdateRental(rent);
    }

    public void DeleteRental(int id)
    {
      Controller.DeleteRental(id);
    }

    public void Dispose()
    {
      _controller.Dispose();
    }
  }
}
