using System.Runtime.Serialization;
using Reca.TechnicalService.Basics.Interfaces;

namespace Reca.DataTransferObjects.Basics.Objects
{
  [DataContract]
  public class Customer : ICustomer
  {
    [DataMember]
    public int Id { get; set; }

    [DataMember]
    public string FirstName { get; set; }

    [DataMember]
    public string LastName { get; set; }

    [DataMember]
    public string CommunicationAddress { get; set; }

    [DataMember]
    public string CommunicationEmail { get; set; }

    [DataMember]
    public string CommunicationTelephone { get; set; }

    [DataMember]
    public string Insurance { get; set; }
  }
}