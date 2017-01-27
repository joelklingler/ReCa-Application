/**
 * ICustomerService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface ICustomerService extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer getCustomerById(java.lang.Integer id) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer[] getAllCustomers() throws java.rmi.RemoteException;
    public void createCustomer(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer customer) throws java.rmi.RemoteException;
    public void updateCustomer(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer customer) throws java.rmi.RemoteException;
    public void deleteCustomer(java.lang.Integer id) throws java.rmi.RemoteException;
}
