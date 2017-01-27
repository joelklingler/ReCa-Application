/**
 * IFinanceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IFinanceService extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Invoice getInvoiceById(java.lang.Integer id) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Invoice[] getAllInvoices() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Invoice[] getInvoicesByCustomerId(java.lang.Integer id) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Payment getPaymentById(java.lang.Integer id) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Payment[] getPaymentsByCustomerId(java.lang.Integer id) throws java.rmi.RemoteException;
    public void createInvoice(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Invoice inv) throws java.rmi.RemoteException;
    public void createPayment(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Payment pay) throws java.rmi.RemoteException;
    public void addPaymentToInvoice(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Invoice inv, org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Payment pay) throws java.rmi.RemoteException;
    public void updateInvoice(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Invoice inv) throws java.rmi.RemoteException;
}
