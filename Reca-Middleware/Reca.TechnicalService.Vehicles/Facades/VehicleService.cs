using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Basics.Interfaces;
using Reca.TechnicalService.Vehicles.Entities;

namespace Reca.TechnicalService.Vehicles.Facades
{
  public class VehicleService : IDisposable
  {
    private VehicleEntites _context;

    public VehicleEntites Context
    {
      get
      {
        if (_context == null)
        {
          _context = new VehicleEntites();
        }
        return _context;
      }
    }

    public void Dispose()
    {
      Context.Dispose();
    }

    public IList<IVehicle> GetVehicles()
    {
      return Context.Vehicle.ToList<IVehicle>();
    }

    public IVehicle GetVehicleById(int id)
    {
      return Context.Vehicle.FirstOrDefault(x => x.Id == id);
    }

    public IVehicle Create()
    {
      var item = Context.Vehicle.Create();
      Context.Vehicle.Add(item);
      return item;
    }

    public void Save()
    {
      Context.SaveChanges();
    }

    public void Delete(int id)
    {
      var itemToDelete = Context.Vehicle.FirstOrDefault(x => x.Id == id);
      if (itemToDelete != null)
      {
        Context.Vehicle.Remove(itemToDelete);
        Save();
      }
    }
  }
}
