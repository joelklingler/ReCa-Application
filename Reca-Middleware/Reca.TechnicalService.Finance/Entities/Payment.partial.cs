using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Basics.Interfaces;

namespace Reca.TechnicalService.Finance.Entities
{
  public partial class Payment : IPayment
  {
    public IInvoice IInvoice
    {
      get { return this.Invoice; }
      set { this.Invoice = (Invoice) value; }
    }
  }
}
