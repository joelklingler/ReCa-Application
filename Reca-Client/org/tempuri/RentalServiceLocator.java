/**
 * RentalServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class RentalServiceLocator extends org.apache.axis.client.Service implements org.tempuri.RentalService {

    public RentalServiceLocator() {
    }


    public RentalServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RentalServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IRentalService
    private java.lang.String BasicHttpBinding_IRentalService_address = "http://recamiddleware.cloudapp.net:8081/RentalService.svc";

    public java.lang.String getBasicHttpBinding_IRentalServiceAddress() {
        return BasicHttpBinding_IRentalService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IRentalServiceWSDDServiceName = "BasicHttpBinding_IRentalService";

    public java.lang.String getBasicHttpBinding_IRentalServiceWSDDServiceName() {
        return BasicHttpBinding_IRentalServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_IRentalServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IRentalServiceWSDDServiceName = name;
    }

    public org.tempuri.IRentalService getBasicHttpBinding_IRentalService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IRentalService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IRentalService(endpoint);
    }

    public org.tempuri.IRentalService getBasicHttpBinding_IRentalService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.tempuri.BasicHttpBinding_IRentalServiceStub _stub = new org.tempuri.BasicHttpBinding_IRentalServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IRentalServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IRentalServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IRentalService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.tempuri.IRentalService.class.isAssignableFrom(serviceEndpointInterface)) {
                org.tempuri.BasicHttpBinding_IRentalServiceStub _stub = new org.tempuri.BasicHttpBinding_IRentalServiceStub(new java.net.URL(BasicHttpBinding_IRentalService_address), this);
                _stub.setPortName(getBasicHttpBinding_IRentalServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BasicHttpBinding_IRentalService".equals(inputPortName)) {
            return getBasicHttpBinding_IRentalService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "RentalService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IRentalService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IRentalService".equals(portName)) {
            setBasicHttpBinding_IRentalServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
