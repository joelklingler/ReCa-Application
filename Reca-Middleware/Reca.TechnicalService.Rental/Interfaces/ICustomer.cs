using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Reca.TechnicalService.Rental.Entities;

namespace Reca.TechnicalService.Rental.Interfaces
{
  public interface ICustomer
  {
    int Id { get; set; }
    string FirstName { get; set; }
    string LastName { get; set; }
    string CommunicationAddress { get; set; }
    string CommunicationEmail { get; set; }
    string CommunicationTelephone { get; set; }
    string Insurance { get; set; }
    ICollection<Invoice> Invoice { get; set; }
    ICollection<Reca.TechnicalService.Rental.Entities.Rental> Rental { get; set; }
  }
}
