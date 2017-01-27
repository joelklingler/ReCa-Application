using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;

namespace Reca.DataTransferObjects.Basics.Objects
{
  [DataContract]
  public class Payment
  {
    [DataMember]
    public int Id { get; set; }

    [DataMember]
    public DateTime? PaymentDate { get; set; }

    [DataMember]
    public string IBAN { get; set; }

    [DataMember]
    public string AdditionalInformation { get; set; }
    
    [DataMember]
    public Invoice Invoice { get; set; }
  }
}
