/**
 * Rental.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects;

public class Rental  implements java.io.Serializable {
    private org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer customer;

    private java.lang.Integer customerId;

    private java.util.Calendar endDate;

    private java.lang.Integer id;

    private java.util.Calendar startDate;

    private org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle vehicle;

    private java.lang.Integer vehicleId;

    public Rental() {
    }

    public Rental(
           org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer customer,
           java.lang.Integer customerId,
           java.util.Calendar endDate,
           java.lang.Integer id,
           java.util.Calendar startDate,
           org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle vehicle,
           java.lang.Integer vehicleId) {
           this.customer = customer;
           this.customerId = customerId;
           this.endDate = endDate;
           this.id = id;
           this.startDate = startDate;
           this.vehicle = vehicle;
           this.vehicleId = vehicleId;
    }


    /**
     * Gets the customer value for this Rental.
     * 
     * @return customer
     */
    public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer getCustomer() {
        return customer;
    }


    /**
     * Sets the customer value for this Rental.
     * 
     * @param customer
     */
    public void setCustomer(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer customer) {
        this.customer = customer;
    }


    /**
     * Gets the customerId value for this Rental.
     * 
     * @return customerId
     */
    public java.lang.Integer getCustomerId() {
        return customerId;
    }


    /**
     * Sets the customerId value for this Rental.
     * 
     * @param customerId
     */
    public void setCustomerId(java.lang.Integer customerId) {
        this.customerId = customerId;
    }


    /**
     * Gets the endDate value for this Rental.
     * 
     * @return endDate
     */
    public java.util.Calendar getEndDate() {
        return endDate;
    }


    /**
     * Sets the endDate value for this Rental.
     * 
     * @param endDate
     */
    public void setEndDate(java.util.Calendar endDate) {
        this.endDate = endDate;
    }


    /**
     * Gets the id value for this Rental.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Rental.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the startDate value for this Rental.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this Rental.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the vehicle value for this Rental.
     * 
     * @return vehicle
     */
    public org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle getVehicle() {
        return vehicle;
    }


    /**
     * Sets the vehicle value for this Rental.
     * 
     * @param vehicle
     */
    public void setVehicle(org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    /**
     * Gets the vehicleId value for this Rental.
     * 
     * @return vehicleId
     */
    public java.lang.Integer getVehicleId() {
        return vehicleId;
    }


    /**
     * Sets the vehicleId value for this Rental.
     * 
     * @param vehicleId
     */
    public void setVehicleId(java.lang.Integer vehicleId) {
        this.vehicleId = vehicleId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rental)) return false;
        Rental other = (Rental) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customer==null && other.getCustomer()==null) || 
             (this.customer!=null &&
              this.customer.equals(other.getCustomer()))) &&
            ((this.customerId==null && other.getCustomerId()==null) || 
             (this.customerId!=null &&
              this.customerId.equals(other.getCustomerId()))) &&
            ((this.endDate==null && other.getEndDate()==null) || 
             (this.endDate!=null &&
              this.endDate.equals(other.getEndDate()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.vehicle==null && other.getVehicle()==null) || 
             (this.vehicle!=null &&
              this.vehicle.equals(other.getVehicle()))) &&
            ((this.vehicleId==null && other.getVehicleId()==null) || 
             (this.vehicleId!=null &&
              this.vehicleId.equals(other.getVehicleId())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCustomer() != null) {
            _hashCode += getCustomer().hashCode();
        }
        if (getCustomerId() != null) {
            _hashCode += getCustomerId().hashCode();
        }
        if (getEndDate() != null) {
            _hashCode += getEndDate().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getVehicle() != null) {
            _hashCode += getVehicle().hashCode();
        }
        if (getVehicleId() != null) {
            _hashCode += getVehicleId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rental.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "Rental"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "Customer"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "Customer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "CustomerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "EndDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "Vehicle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "Vehicle"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "VehicleId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
