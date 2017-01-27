using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using Reca.Composite.Finances.Facades;
using Reca.DataTransferObjects.Basics.Objects;
using Reca.Finance.Interfaces;

namespace Reca.Finance
{
  public class FinanceService : IFinanceService
  {
    private FinanceController _controller;

    public FinanceController Controller
    {
      get
      {
        if (_controller == null)
        {
          _controller = new FinanceController();
        }
        return _controller;
      }
    }
    
    public void Dispose()
    {
      _controller.Dispose();
    }

    public Invoice GetInvoiceById(int id)
    {
      return Controller.GetInvoiceById(id);
    }

    public IList<Invoice> GetAllInvoices()
    {
      return Controller.GetAllInvoices();
    }

    public IList<Invoice> GetAllInvoicesByCustomerId(int id)
    {
      return Controller.GetInvoicesByCustomerId(id);
    }

    public IList<Payment> GetAllPaymentsByInvoiceId(int id)
    {
      return Controller.GetPaymentsByInvoiceId(id);
    }

    public Payment GetPaymentById(int id)
    {
      return Controller.GetPaymentById(id);
    }
  }
}
