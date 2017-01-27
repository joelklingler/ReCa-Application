/**
 * IRentalService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IRentalService extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Rental getRentalById(java.lang.Integer id) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Rental[] getAllRentals() throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Rental[] getAllRentalsByCustomer(java.lang.Integer id) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Rental[] getAllRentalsByVehicle(java.lang.Integer id) throws java.rmi.RemoteException;
    public void createRental(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Rental rent) throws java.rmi.RemoteException;
    public void updateRental(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Rental rent) throws java.rmi.RemoteException;
    public void deleteRental(java.lang.Integer id) throws java.rmi.RemoteException;
}
