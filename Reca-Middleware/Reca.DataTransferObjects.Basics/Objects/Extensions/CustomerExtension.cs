using Reca.TechnicalService.Basics.Interfaces;

namespace Reca.DataTransferObjects.Basics.Objects.Extensions
{
  public static class CustomerExtension
  {
    public static Customer GetData(this ICustomer obj)
    {
      if (obj == null)
      {
        return null;
      }
      var customer = new Customer();
      customer.Id = obj.Id;
      customer.CommunicationTelephone = obj.CommunicationTelephone;
      customer.CommunicationAddress = obj.CommunicationAddress;
      customer.CommunicationEmail = obj.CommunicationEmail;
      customer.FirstName = obj.FirstName;
      customer.LastName = obj.LastName;
      customer.Insurance = obj.Insurance;
      return customer;
    }

    public static void SetData(Customer src, ICustomer trg)
    {
      trg.Id = src.Id;
      trg.FirstName = src.FirstName;
      trg.LastName = src.LastName;
      trg.CommunicationAddress = src.CommunicationAddress;
      trg.CommunicationEmail = src.CommunicationEmail;
      trg.CommunicationTelephone = src.CommunicationTelephone;
      trg.Insurance = src.Insurance;
    }
  }
}