using System;
using System.Runtime.Serialization;

namespace Reca.DataTransferObjects.Basics.Objects
{
  [DataContract]
  public class Vehicle
  {
    [DataMember]
    public int Id { get; set; }

    [DataMember]
    public string LicenseNumber { get; set; }

    [DataMember]
    public string VehicleType { get; set; }

    [DataMember]
    public DateTime? VehicleYear { get; set; }

    [DataMember]
    public string VehicleColor { get; set; }

    [DataMember]
    public int? MaxPersonsCount { get; set; }

    [DataMember]
    public string VehicleBrand { get; set; }

    [DataMember]
    public decimal? VehicleCost { get; set; }

    [DataMember]
    public string VehicleInsurance { get; set; }

    [DataMember]
    public bool? VehicleStatus { get; set; }
  }
}