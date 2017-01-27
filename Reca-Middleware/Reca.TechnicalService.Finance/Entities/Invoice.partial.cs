using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Basics.Interfaces;

namespace Reca.TechnicalService.Finance.Entities
{
  public partial class Invoice : IInvoice
  {
    public ICustomer ICustomer
    {
      get { return this.Customer; }
      set { this.Customer = (FinanceCustomer)value; }
    }

    public IRental IRental
    {
      get { return this.Rental; }
      set { this.Rental = (FinanceRental)value; }
    }

    public ICollection<IPayment> IPayment
    {
      get { return this.Payment.Select(e => e as IPayment).ToList(); }
      set { this.Payment = value as ICollection<Payment>; }
    }
  }
}
