/**
 * IVehicleService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface IVehicleService extends java.rmi.Remote {
    public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle getVehicleById(java.lang.Integer id) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle[] getAllVehicles() throws java.rmi.RemoteException;
    public void createVehicle(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle vehicle) throws java.rmi.RemoteException;
    public void updateVehicle(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle vehicle) throws java.rmi.RemoteException;
    public void deleteVehicle(java.lang.Integer vehicle) throws java.rmi.RemoteException;
    public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle[] getAvailableVehicles(java.util.Calendar startDate, java.util.Calendar endDate) throws java.rmi.RemoteException;
}
