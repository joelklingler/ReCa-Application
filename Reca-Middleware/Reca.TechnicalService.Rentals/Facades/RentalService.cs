using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Basics.Interfaces;
using Reca.TechnicalService.Rentals.Entities;

namespace Reca.TechnicalService.Rentals.Facades
{
  public class RentalService : IDisposable
  {
    private RentalEntites _context;

    public RentalEntites Context
    {
      get
      {
        if (_context == null)
        {
          _context = new RentalEntites();
        }
        return _context;
      }
    }

    public IList<IRental> Rentals
    {
      get
      {
        return Context.Rental
          .Include(e => e.Customer)
          .Include(e => e.Vehicle)
          .ToList<IRental>();
      }
    }

    public void Dispose()
    {
      _context.Dispose();
    }

    public IList<IRental> GetAllRentals()
    {
      return Rentals;
    }

    public IRental RentalById(int id)
    {
      return Rentals.FirstOrDefault(x => x.Id == id);
    }

    public IList<IRental> GetAllRentalsByCustomer(int id)
    {
      return Rentals.Where(x => x.ICustomer.Id == id).ToList();
    }

    public IList<IRental> GetAllRentalsByVehicle(int id)
    {
      return Rentals.Where(x => x.IVehicle.Id == id).ToList();
    }

    public IRental Create()
    {
      var item = Context.Rental.Create();
      Context.Rental.Add(item);
      return item;
    }

    public void Save()
    {
      Context.SaveChanges();
    }

    public void Delete(int id)
    {
      var itemToDelete = Context.Rental.FirstOrDefault(x => x.Id == id);
      if (itemToDelete != null)
      {
        Context.Rental.Remove(itemToDelete);
        Save();
      }
    }
  }
}
