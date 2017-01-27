using System;
using System.Collections.Generic;
using System.Linq;
using Reca.TechnicalService.Basics.Interfaces;
using Reca.TechnicalService.Customers.Entities;

namespace Reca.TechnicalService.Customers
{
  public class CustomerService : IDisposable
  {
    private CustomerEntities _context;

    public CustomerEntities Context
    {
      get
      {
        if (_context == null)
        {
          _context = new CustomerEntities();
        }
        return _context;
      }
    }

    public void Dispose()
    {
      _context.Dispose();
    }

    public IList<ICustomer> GetCustomers()
    {
      return Context.Customer.ToList<ICustomer>();
    }
    
    public ICustomer GetCustomer(int id)
    {
      return Context.Customer.FirstOrDefault(x => x.Id == id);
    }

    public ICustomer Create()
    {
      var item = Context.Customer.Create();
      Context.Customer.Add(item);
      return item;
    }

    public void Save()
    {
      Context.SaveChanges();
    }

    public void Delete(int id)
    {
      var itemToDelete = Context.Customer.FirstOrDefault(x => x.Id == id);
      if (itemToDelete != null)
      {
        Context.Customer.Remove(itemToDelete);
        Save();
      }
    }
  }
}