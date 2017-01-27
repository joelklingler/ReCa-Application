using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.DataTransferObjects.Basics.Objects;
using Reca.DataTransferObjects.Basics.Objects.Extensions;
using Reca.TechnicalService.Finance.Facades;

namespace Reca.Composite.Finances.Facades
{
  public class FinanceController : IDisposable
  {
    public void Dispose()
    {
      _financeService.Dispose();
    }

    private FinanceService _financeService;

    private FinanceService FinanceService
    {
      get
      {
        if (_financeService == null)
        {
          _financeService = new FinanceService();
        }
        return _financeService;
      }
    }

    public Invoice GetInvoiceById(int id)
    {
      return FinanceService.GetAllInvoices().FirstOrDefault(x => x.Id == id).GetData();
    }

    public IList<Invoice> GetAllInvoices()
    {
      return FinanceService.GetAllInvoices().Select(e => e.GetData()).ToList();
    }

    public IList<Invoice> GetInvoicesByCustomerId(int id)
    {
      return FinanceService.GetAllInvoices().Where(e => e.CustomerId == id).Select(e => e.GetData()).ToList();
    }

    public IList<Payment> GetPaymentsByInvoiceId(int id)
    {
      return FinanceService.GetAllPayments().Where(e => e.InvoiceId == id).Select(e => e.GetData()).ToList();
    }

    public Payment GetPaymentById(int id)
    {
      return FinanceService.GetAllPayments().FirstOrDefault(x => x.Id == id).GetData();
    }

    public void CreatePayment(Payment pay)
    {
      var newPayment = FinanceService.CreatePayment();
      PaymentExtension.SetData(pay, newPayment);
      FinanceService.Save();
    }

    public void CreateInvoice(Invoice inv)
    {
      var newInvoice = FinanceService.CreateInvoice();
      InvoiceExtension.SetData(inv, newInvoice);
      FinanceService.Save();
    }

    public void UpdateInvoice(Invoice inv)
    {
      var oldInvoice = FinanceService.GetAllInvoices().FirstOrDefault(x => x.Id == inv.Id);
      if (oldInvoice == null)
      {
        return;
      }
      InvoiceExtension.SetData(inv, oldInvoice);
      FinanceService.Save();
    }

    public void AddPaymentToInvoice(Payment pay, Invoice inv)
    {
      var invoice = FinanceService.GetAllInvoices().FirstOrDefault(x => x.Id == pay.Id);
      var payment = FinanceService.GetAllPayments().FirstOrDefault(x => x.Id == inv.Id);
      if (invoice == null || payment == null)
      {
        return;
      }
      invoice.IPayment.Add(payment);
      payment.IInvoice = invoice;
      FinanceService.Save();
    }
  }
}
