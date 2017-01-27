using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Reca.DataTransferObjects.Basics.Objects
{
  [DataContract]
  public class Invoice
  {
    [DataMember]
    public int Id { get; set; }

    [DataMember]
    public DateTime? InvoiceDate { get; set; }

    [DataMember]
    public DateTime? MaxPayDate { get; set; }

    [DataMember]
    public decimal? Amount { get; set; }

    [DataMember]
    public bool? InvoiceState { get; set; }

    [DataMember]
    public string AdditionalInformation { get; set; }

    [DataMember]
    public Customer Customer { get; set; }

    [DataMember]
    public Rental Rental { get; set; }

    [DataMember]
    public ICollection<Payment> Payments { get; set; }
  }
}
