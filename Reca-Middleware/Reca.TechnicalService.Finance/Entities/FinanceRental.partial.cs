using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Basics.Interfaces;

namespace Reca.TechnicalService.Finance.Entities
{
  public partial class FinanceRental : IRental
  {
    public ICustomer ICustomer
    {
      get { return null; }
      set { return; }
    }

    public IVehicle IVehicle
    {
      get { return null; }
      set { return; }
    }
  }
}
