package org.tempuri;

public class IRentalServiceProxy implements org.tempuri.IRentalService {
  private String _endpoint = null;
  private org.tempuri.IRentalService iRentalService = null;
  
  public IRentalServiceProxy() {
    _initIRentalServiceProxy();
  }
  
  public IRentalServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIRentalServiceProxy();
  }
  
  private void _initIRentalServiceProxy() {
    try {
      iRentalService = (new org.tempuri.RentalServiceLocator()).getBasicHttpBinding_IRentalService();
      if (iRentalService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iRentalService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iRentalService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iRentalService != null)
      ((javax.xml.rpc.Stub)iRentalService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IRentalService getIRentalService() {
    if (iRentalService == null)
      _initIRentalServiceProxy();
    return iRentalService;
  }
  
  public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Rental getRentalById(java.lang.Integer id) throws java.rmi.RemoteException{
    if (iRentalService == null)
      _initIRentalServiceProxy();
    return iRentalService.getRentalById(id);
  }
  
  public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Rental[] getAllRentals() throws java.rmi.RemoteException{
    if (iRentalService == null)
      _initIRentalServiceProxy();
    return iRentalService.getAllRentals();
  }
  
  public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Rental[] getAllRentalsByCustomer(java.lang.Integer id) throws java.rmi.RemoteException{
    if (iRentalService == null)
      _initIRentalServiceProxy();
    return iRentalService.getAllRentalsByCustomer(id);
  }
  
  public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Rental[] getAllRentalsByVehicle(java.lang.Integer id) throws java.rmi.RemoteException{
    if (iRentalService == null)
      _initIRentalServiceProxy();
    return iRentalService.getAllRentalsByVehicle(id);
  }
  
  public void createRental(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Rental rent) throws java.rmi.RemoteException{
    if (iRentalService == null)
      _initIRentalServiceProxy();
    iRentalService.createRental(rent);
  }
  
  public void updateRental(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Rental rent) throws java.rmi.RemoteException{
    if (iRentalService == null)
      _initIRentalServiceProxy();
    iRentalService.updateRental(rent);
  }
  
  public void deleteRental(java.lang.Integer id) throws java.rmi.RemoteException{
    if (iRentalService == null)
      _initIRentalServiceProxy();
    iRentalService.deleteRental(id);
  }
  
  
}