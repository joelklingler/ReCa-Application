using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Basics.Interfaces;

namespace Reca.DataTransferObjects.Basics.Objects
{
  [DataContract]
  public class Rental
  {
    [DataMember]
    public int Id { get; set; }

    [DataMember]
    public int VehicleId { get; set; }

    [DataMember]
    public int CustomerId { get; set; }

    [DataMember]
    public DateTime? StartDate { get; set; }

    [DataMember]
    public DateTime? EndDate { get; set; }

    [DataMember]
    public Customer Customer { get; set;  }

    [DataMember]
    public Vehicle Vehicle { get; set; }
  }
}
