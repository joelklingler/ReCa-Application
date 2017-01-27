using System;
using System.Collections.Generic;
using System.Linq;
using System.ServiceModel;
using System.Text;
using System.Threading.Tasks;
using Reca.DataTransferObjects.Basics.Objects;

namespace Reca.Finance.Interfaces
{
  [ServiceContract]
  public interface IFinanceService : IDisposable
  {
    [OperationContract]
    Invoice GetInvoiceById(int id);

    [OperationContract]
    IList<Invoice> GetAllInvoices();

    [OperationContract]
    IList<Invoice> GetAllInvoicesByCustomerId(int id);

    [OperationContract]
    IList<Payment> GetAllPaymentsByInvoiceId(int id);

    [OperationContract]
    Payment GetPaymentById(int id);
  }
}
