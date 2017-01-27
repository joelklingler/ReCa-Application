/**
 * Vehicle.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects;

public class Vehicle  implements java.io.Serializable {
    private java.lang.Integer id;

    private java.lang.String licenseNumber;

    private java.lang.Integer maxPersonsCount;

    private java.lang.String vehicleBrand;

    private java.lang.String vehicleColor;

    private java.math.BigDecimal vehicleCost;

    private java.lang.String vehicleInsurance;

    private java.lang.Boolean vehicleStatus;

    private java.lang.String vehicleType;

    private java.util.Calendar vehicleYear;

    public Vehicle() {
    }

    public Vehicle(
           java.lang.Integer id,
           java.lang.String licenseNumber,
           java.lang.Integer maxPersonsCount,
           java.lang.String vehicleBrand,
           java.lang.String vehicleColor,
           java.math.BigDecimal vehicleCost,
           java.lang.String vehicleInsurance,
           java.lang.Boolean vehicleStatus,
           java.lang.String vehicleType,
           java.util.Calendar vehicleYear) {
           this.id = id;
           this.licenseNumber = licenseNumber;
           this.maxPersonsCount = maxPersonsCount;
           this.vehicleBrand = vehicleBrand;
           this.vehicleColor = vehicleColor;
           this.vehicleCost = vehicleCost;
           this.vehicleInsurance = vehicleInsurance;
           this.vehicleStatus = vehicleStatus;
           this.vehicleType = vehicleType;
           this.vehicleYear = vehicleYear;
    }


    /**
     * Gets the id value for this Vehicle.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Vehicle.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the licenseNumber value for this Vehicle.
     * 
     * @return licenseNumber
     */
    public java.lang.String getLicenseNumber() {
        return licenseNumber;
    }


    /**
     * Sets the licenseNumber value for this Vehicle.
     * 
     * @param licenseNumber
     */
    public void setLicenseNumber(java.lang.String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }


    /**
     * Gets the maxPersonsCount value for this Vehicle.
     * 
     * @return maxPersonsCount
     */
    public java.lang.Integer getMaxPersonsCount() {
        return maxPersonsCount;
    }


    /**
     * Sets the maxPersonsCount value for this Vehicle.
     * 
     * @param maxPersonsCount
     */
    public void setMaxPersonsCount(java.lang.Integer maxPersonsCount) {
        this.maxPersonsCount = maxPersonsCount;
    }


    /**
     * Gets the vehicleBrand value for this Vehicle.
     * 
     * @return vehicleBrand
     */
    public java.lang.String getVehicleBrand() {
        return vehicleBrand;
    }


    /**
     * Sets the vehicleBrand value for this Vehicle.
     * 
     * @param vehicleBrand
     */
    public void setVehicleBrand(java.lang.String vehicleBrand) {
        this.vehicleBrand = vehicleBrand;
    }


    /**
     * Gets the vehicleColor value for this Vehicle.
     * 
     * @return vehicleColor
     */
    public java.lang.String getVehicleColor() {
        return vehicleColor;
    }


    /**
     * Sets the vehicleColor value for this Vehicle.
     * 
     * @param vehicleColor
     */
    public void setVehicleColor(java.lang.String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }


    /**
     * Gets the vehicleCost value for this Vehicle.
     * 
     * @return vehicleCost
     */
    public java.math.BigDecimal getVehicleCost() {
        return vehicleCost;
    }


    /**
     * Sets the vehicleCost value for this Vehicle.
     * 
     * @param vehicleCost
     */
    public void setVehicleCost(java.math.BigDecimal vehicleCost) {
        this.vehicleCost = vehicleCost;
    }


    /**
     * Gets the vehicleInsurance value for this Vehicle.
     * 
     * @return vehicleInsurance
     */
    public java.lang.String getVehicleInsurance() {
        return vehicleInsurance;
    }


    /**
     * Sets the vehicleInsurance value for this Vehicle.
     * 
     * @param vehicleInsurance
     */
    public void setVehicleInsurance(java.lang.String vehicleInsurance) {
        this.vehicleInsurance = vehicleInsurance;
    }


    /**
     * Gets the vehicleStatus value for this Vehicle.
     * 
     * @return vehicleStatus
     */
    public java.lang.Boolean getVehicleStatus() {
        return vehicleStatus;
    }


    /**
     * Sets the vehicleStatus value for this Vehicle.
     * 
     * @param vehicleStatus
     */
    public void setVehicleStatus(java.lang.Boolean vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }


    /**
     * Gets the vehicleType value for this Vehicle.
     * 
     * @return vehicleType
     */
    public java.lang.String getVehicleType() {
        return vehicleType;
    }


    /**
     * Sets the vehicleType value for this Vehicle.
     * 
     * @param vehicleType
     */
    public void setVehicleType(java.lang.String vehicleType) {
        this.vehicleType = vehicleType;
    }


    /**
     * Gets the vehicleYear value for this Vehicle.
     * 
     * @return vehicleYear
     */
    public java.util.Calendar getVehicleYear() {
        return vehicleYear;
    }


    /**
     * Sets the vehicleYear value for this Vehicle.
     * 
     * @param vehicleYear
     */
    public void setVehicleYear(java.util.Calendar vehicleYear) {
        this.vehicleYear = vehicleYear;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Vehicle)) return false;
        Vehicle other = (Vehicle) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.licenseNumber==null && other.getLicenseNumber()==null) || 
             (this.licenseNumber!=null &&
              this.licenseNumber.equals(other.getLicenseNumber()))) &&
            ((this.maxPersonsCount==null && other.getMaxPersonsCount()==null) || 
             (this.maxPersonsCount!=null &&
              this.maxPersonsCount.equals(other.getMaxPersonsCount()))) &&
            ((this.vehicleBrand==null && other.getVehicleBrand()==null) || 
             (this.vehicleBrand!=null &&
              this.vehicleBrand.equals(other.getVehicleBrand()))) &&
            ((this.vehicleColor==null && other.getVehicleColor()==null) || 
             (this.vehicleColor!=null &&
              this.vehicleColor.equals(other.getVehicleColor()))) &&
            ((this.vehicleCost==null && other.getVehicleCost()==null) || 
             (this.vehicleCost!=null &&
              this.vehicleCost.equals(other.getVehicleCost()))) &&
            ((this.vehicleInsurance==null && other.getVehicleInsurance()==null) || 
             (this.vehicleInsurance!=null &&
              this.vehicleInsurance.equals(other.getVehicleInsurance()))) &&
            ((this.vehicleStatus==null && other.getVehicleStatus()==null) || 
             (this.vehicleStatus!=null &&
              this.vehicleStatus.equals(other.getVehicleStatus()))) &&
            ((this.vehicleType==null && other.getVehicleType()==null) || 
             (this.vehicleType!=null &&
              this.vehicleType.equals(other.getVehicleType()))) &&
            ((this.vehicleYear==null && other.getVehicleYear()==null) || 
             (this.vehicleYear!=null &&
              this.vehicleYear.equals(other.getVehicleYear())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getLicenseNumber() != null) {
            _hashCode += getLicenseNumber().hashCode();
        }
        if (getMaxPersonsCount() != null) {
            _hashCode += getMaxPersonsCount().hashCode();
        }
        if (getVehicleBrand() != null) {
            _hashCode += getVehicleBrand().hashCode();
        }
        if (getVehicleColor() != null) {
            _hashCode += getVehicleColor().hashCode();
        }
        if (getVehicleCost() != null) {
            _hashCode += getVehicleCost().hashCode();
        }
        if (getVehicleInsurance() != null) {
            _hashCode += getVehicleInsurance().hashCode();
        }
        if (getVehicleStatus() != null) {
            _hashCode += getVehicleStatus().hashCode();
        }
        if (getVehicleType() != null) {
            _hashCode += getVehicleType().hashCode();
        }
        if (getVehicleYear() != null) {
            _hashCode += getVehicleYear().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Vehicle.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "Vehicle"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "Id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("licenseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "LicenseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxPersonsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "MaxPersonsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleBrand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "VehicleBrand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleColor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "VehicleColor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "VehicleCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleInsurance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "VehicleInsurance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "VehicleStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "VehicleType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vehicleYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "VehicleYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
