using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Basics.Interfaces;

namespace Reca.DataTransferObjects.Basics.Objects.Extensions
{
  public static class RentalExtension
  {
    public static Rental GetData(this IRental obj)
    {
      if (obj == null)
      {
        return null;
      }
      var rental = new Rental();
      rental.Customer = obj.ICustomer.GetData();
      rental.EndDate = obj.EndDate;
      rental.StartDate = obj.StartDate;
      rental.Id = obj.Id;
      rental.StartDate = obj.StartDate;
      rental.Vehicle = obj.IVehicle.GetData();
      return rental;
    }

    public static void SetData(Rental src, IRental trg)
    {
      trg.Id = src.Id;
      VehicleExtension.SetData(src.Vehicle, trg.IVehicle);
      CustomerExtension.SetData(src.Customer, trg.ICustomer);
      trg.EndDate = src.EndDate;
      trg.StartDate = src.StartDate;
    }
  }
}
