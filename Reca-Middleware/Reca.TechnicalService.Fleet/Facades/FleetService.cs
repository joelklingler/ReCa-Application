using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Fleet.Entities;
using Reca.TechnicalService.Basics.Interfaces;

namespace Reca.TechnicalService.Fleet.Facades
{
  public class FleetService : IDisposable
  {
    private FleetEntities _context;

    public void Dispose()
    {
      _context.Dispose();
    }

    public FleetEntities Context
    {
      get
      {
        if (_context == null)
        {
          _context = new FleetEntities();
        }
        return _context;
      }
    }

    public IList<IVehicle> GetVehicles()
    {
      return this.Context.Vehicle.ToList<IVehicle>();
    }

    public IVehicle GetVehicle(int id)
    {
      return this.Context.Vehicle.FirstOrDefault(x => x.Id == id);
    }

    public IVehicle Create()
    {
      var item = this.Context.Vehicle.Create();
      this.Context.Vehicle.Add(item);
      return item;
    }

    public void Save()
    {
      this.Context.SaveChanges();
    }

    public void Delete(int id)
    {
      var itemToDelete = this.Context.Vehicle.FirstOrDefault(x => x.Id == id);
      if (itemToDelete != null)
      {
        this.Context.Vehicle.Remove(itemToDelete);
        Save();
      }
    }
  }
}
