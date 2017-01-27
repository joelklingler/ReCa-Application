//------------------------------------------------------------------------------
// <auto-generated>
//     Der Code wurde von einer Vorlage generiert.
//
//     Manuelle Änderungen an dieser Datei führen möglicherweise zu unerwartetem Verhalten der Anwendung.
//     Manuelle Änderungen an dieser Datei werden überschrieben, wenn der Code neu generiert wird.
// </auto-generated>
//------------------------------------------------------------------------------

namespace Reca.TechnicalService.Rentals.Entities
{
    using System;
    using System.Collections.Generic;
    
    public partial class RentalVehicle
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2214:DoNotCallOverridableMethodsInConstructors")]
        public RentalVehicle()
        {
            this.Rental = new HashSet<Rental>();
        }
    
        public int Id { get; set; }
        public string LicenseNumber { get; set; }
        public string VehicleType { get; set; }
        public Nullable<System.DateTime> VehicleYear { get; set; }
        public string VehicleColor { get; set; }
        public Nullable<int> MaxPersonsCount { get; set; }
        public string VehicleBrand { get; set; }
        public Nullable<decimal> VehicleCost { get; set; }
        public string VehicleInsurance { get; set; }
        public Nullable<bool> VehicleStatus { get; set; }
    
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Usage", "CA2227:CollectionPropertiesShouldBeReadOnly")]
        public virtual ICollection<Rental> Rental { get; set; }
    }
}
