namespace Reca.TechnicalService.Basics.Interfaces
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
  }
}