package org.tempuri;

public class IVehicleServiceProxy implements org.tempuri.IVehicleService {
  private String _endpoint = null;
  private org.tempuri.IVehicleService iVehicleService = null;
  
  public IVehicleServiceProxy() {
    _initIVehicleServiceProxy();
  }
  
  public IVehicleServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIVehicleServiceProxy();
  }
  
  private void _initIVehicleServiceProxy() {
    try {
      iVehicleService = (new org.tempuri.VehicleServiceLocator()).getBasicHttpBinding_IVehicleService();
      if (iVehicleService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iVehicleService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iVehicleService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iVehicleService != null)
      ((javax.xml.rpc.Stub)iVehicleService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IVehicleService getIVehicleService() {
    if (iVehicleService == null)
      _initIVehicleServiceProxy();
    return iVehicleService;
  }
  
  public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle getVehicleById(java.lang.Integer id) throws java.rmi.RemoteException{
    if (iVehicleService == null)
      _initIVehicleServiceProxy();
    return iVehicleService.getVehicleById(id);
  }
  
  public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle[] getAllVehicles() throws java.rmi.RemoteException{
    if (iVehicleService == null)
      _initIVehicleServiceProxy();
    return iVehicleService.getAllVehicles();
  }
  
  public void createVehicle(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle vehicle) throws java.rmi.RemoteException{
    if (iVehicleService == null)
      _initIVehicleServiceProxy();
    iVehicleService.createVehicle(vehicle);
  }
  
  public void updateVehicle(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle vehicle) throws java.rmi.RemoteException{
    if (iVehicleService == null)
      _initIVehicleServiceProxy();
    iVehicleService.updateVehicle(vehicle);
  }
  
  public void deleteVehicle(java.lang.Integer vehicle) throws java.rmi.RemoteException{
    if (iVehicleService == null)
      _initIVehicleServiceProxy();
    iVehicleService.deleteVehicle(vehicle);
  }
  
  public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle[] getAvailableVehicles(java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException{
    if (iVehicleService == null)
      _initIVehicleServiceProxy();
    return iVehicleService.getAvailableVehicles(startDate, endDate);
  }
  
  
}