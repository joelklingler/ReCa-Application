using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Rental.Entities;
using Reca.TechnicalService.Rental.Interfaces;

namespace Reca.TechnicalService.Rental.Facades
{
  public class RentalService : IDisposable
  {
    private RentalEntities _context;

    public void Dispose()
    {
      _context.Dispose();
    }

    public RentalEntities Context
    {
      get
      {
        if (_context == null)
        {
          _context = new RentalEntities();
        }
        return _context;
      }
    }

    public IList<IRental> GetRentals()
    {
      return this.Context.Rental.ToList<IRental>();
    }

    public IRental Create()
    {
      var item = this.Context.Rental.Create();
      this.Context.Rental.Add(item);
      return item;
    }

    public void Save()  
    {
      this.Context.SaveChanges();
    }
  }
}
