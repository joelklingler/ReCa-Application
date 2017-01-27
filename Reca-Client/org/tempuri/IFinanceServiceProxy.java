package org.tempuri;

public class IFinanceServiceProxy implements org.tempuri.IFinanceService {
  private String _endpoint = null;
  private org.tempuri.IFinanceService iFinanceService = null;
  
  public IFinanceServiceProxy() {
    _initIFinanceServiceProxy();
  }
  
  public IFinanceServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIFinanceServiceProxy();
  }
  
  private void _initIFinanceServiceProxy() {
    try {
      iFinanceService = (new org.tempuri.FinanceServiceLocator()).getBasicHttpBinding_IFinanceService();
      if (iFinanceService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iFinanceService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iFinanceService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iFinanceService != null)
      ((javax.xml.rpc.Stub)iFinanceService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.tempuri.IFinanceService getIFinanceService() {
    if (iFinanceService == null)
      _initIFinanceServiceProxy();
    return iFinanceService;
  }
  
  public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Invoice getInvoiceById(java.lang.Integer id) throws java.rmi.RemoteException{
    if (iFinanceService == null)
      _initIFinanceServiceProxy();
    return iFinanceService.getInvoiceById(id);
  }
  
  public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Invoice[] getAllInvoices() throws java.rmi.RemoteException{
    if (iFinanceService == null)
      _initIFinanceServiceProxy();
    return iFinanceService.getAllInvoices();
  }
  
  public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Invoice[] getInvoicesByCustomerId(java.lang.Integer id) throws java.rmi.RemoteException{
    if (iFinanceService == null)
      _initIFinanceServiceProxy();
    return iFinanceService.getInvoicesByCustomerId(id);
  }
  
  public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Payment getPaymentById(java.lang.Integer id) throws java.rmi.RemoteException{
    if (iFinanceService == null)
      _initIFinanceServiceProxy();
    return iFinanceService.getPaymentById(id);
  }
  
  public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Payment[] getPaymentsByCustomerId(java.lang.Integer id) throws java.rmi.RemoteException{
    if (iFinanceService == null)
      _initIFinanceServiceProxy();
    return iFinanceService.getPaymentsByCustomerId(id);
  }
  
  public void createInvoice(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Invoice inv) throws java.rmi.RemoteException{
    if (iFinanceService == null)
      _initIFinanceServiceProxy();
    iFinanceService.createInvoice(inv);
  }
  
  public void createPayment(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Payment pay) throws java.rmi.RemoteException{
    if (iFinanceService == null)
      _initIFinanceServiceProxy();
    iFinanceService.createPayment(pay);
  }
  
  public void addPaymentToInvoice(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Invoice inv, org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Payment pay) throws java.rmi.RemoteException{
    if (iFinanceService == null)
      _initIFinanceServiceProxy();
    iFinanceService.addPaymentToInvoice(inv, pay);
  }
  
  public void updateInvoice(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Invoice inv) throws java.rmi.RemoteException{
    if (iFinanceService == null)
      _initIFinanceServiceProxy();
    iFinanceService.updateInvoice(inv);
  }
  
  
}