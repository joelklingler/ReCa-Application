using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Basics.Interfaces;

namespace Reca.TechnicalService.Rentals.Entities
{
  public partial class Rental : IRental
  {
    public ICustomer ICustomer
    {
      get { return this.Customer; }
      set { this.Customer = (RentalCustomer) value; }
    }

    public IVehicle IVehicle
    {
      get { return this.Vehicle; }
      set { this.Vehicle = (RentalVehicle)value; }
    }
  }
}
