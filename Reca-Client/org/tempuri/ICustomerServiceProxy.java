package org.tempuri;

public class ICustomerServiceProxy implements org.tempuri.ICustomerService {
  private String _endpoint = null;
  private org.tempuri.ICustomerService iCustomerService = null;
  
  public ICustomerServiceProxy() {
    _initICustomerServiceProxy();
  }
  
  public ICustomerServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initICustomerServiceProxy();
  }
  
  private void _initICustomerServiceProxy() {
    try {
      iCustomerService = (new org.tempuri.CustomerServiceLocator()).getBasicHttpBinding_ICustomerService();
      if (iCustomerService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iCustomerService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iCustomerService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iCustomerService != null)
      ((javax.xml.rpc.Stub)iCustomerService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.ICustomerService getICustomerService() {
    if (iCustomerService == null)
      _initICustomerServiceProxy();
    return iCustomerService;
  }
  
  public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer getCustomerById(java.lang.Integer id) throws java.rmi.RemoteException{
    if (iCustomerService == null)
      _initICustomerServiceProxy();
    return iCustomerService.getCustomerById(id);
  }
  
  public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer[] getAllCustomers() throws java.rmi.RemoteException{
    if (iCustomerService == null)
      _initICustomerServiceProxy();
    return iCustomerService.getAllCustomers();
  }
  
  public void createCustomer(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer customer) throws java.rmi.RemoteException{
    if (iCustomerService == null)
      _initICustomerServiceProxy();
    iCustomerService.createCustomer(customer);
  }
  
  public void updateCustomer(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer customer) throws java.rmi.RemoteException{
    if (iCustomerService == null)
      _initICustomerServiceProxy();
    iCustomerService.updateCustomer(customer);
  }
  
  public void deleteCustomer(java.lang.Integer id) throws java.rmi.RemoteException{
    if (iCustomerService == null)
      _initICustomerServiceProxy();
    iCustomerService.deleteCustomer(id);
  }
  
  
}