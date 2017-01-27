using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Basics.Interfaces;
using Reca.TechnicalService.Finance.Entities;

namespace Reca.TechnicalService.Finance.Facades
{
  public class FinanceService : IDisposable
  {
    private FInanceEntites _context;

    private FInanceEntites Context
    {
      get
      {
        if (_context == null)
        {
          _context = new FInanceEntites();
        }
        return _context;
      }
    }
    
    public void Dispose()
    {
      _context.Dispose();
    }

    public IList<IInvoice> GetAllInvoices()
    {
      return Context.Invoice.ToList<IInvoice>();
    }

    public IList<IPayment> GetAllPayments()
    {
      return Context.Payment.ToList<IPayment>();
    }

    public IInvoice CreateInvoice()
    {
      var item = Context.Invoice.Create();
      Context.Invoice.Add(item);
      return item;
    }

    public IPayment CreatePayment()
    {
      var item = Context.Payment.Create();
      Context.Payment.Add(item);
      return item;
    }

    public void Save()
    {
      Context.SaveChanges();
    }
  }
}
