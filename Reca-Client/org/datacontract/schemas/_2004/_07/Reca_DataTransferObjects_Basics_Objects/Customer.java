/**
 * Customer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects;

public class Customer  implements java.io.Serializable {
    private java.lang.String communicationAddress;

    private java.lang.String communicationEmail;

    private java.lang.String communicationTelephone;

    private java.lang.String firstName;

    private java.lang.Integer id;

    private java.lang.String insurance;

    private java.lang.String lastName;

    public Customer() {
    }

    public Customer(
           java.lang.String communicationAddress,
           java.lang.String communicationEmail,
           java.lang.String communicationTelephone,
           java.lang.String firstName,
           java.lang.Integer id,
           java.lang.String insurance,
           java.lang.String lastName) {
           this.communicationAddress = communicationAddress;
           this.communicationEmail = communicationEmail;
           this.communicationTelephone = communicationTelephone;
           this.firstName = firstName;
           this.id = id;
           this.insurance = insurance;
           this.lastName = lastName;
    }


    /**
     * Gets the communicationAddress value for this Customer.
     * 
     * @return communicationAddress
     */
    public java.lang.String getCommunicationAddress() {
        return communicationAddress;
    }


    /**
     * Sets the communicationAddress value for this Customer.
     * 
     * @param communicationAddress
     */
    public void setCommunicationAddress(java.lang.String communicationAddress) {
        this.communicationAddress = communicationAddress;
    }


    /**
     * Gets the communicationEmail value for this Customer.
     * 
     * @return communicationEmail
     */
    public java.lang.String getCommunicationEmail() {
        return communicationEmail;
    }


    /**
     * Sets the communicationEmail value for this Customer.
     * 
     * @param communicationEmail
     */
    public void setCommunicationEmail(java.lang.String communicationEmail) {
        this.communicationEmail = communicationEmail;
    }


    /**
     * Gets the communicationTelephone value for this Customer.
     * 
     * @return communicationTelephone
     */
    public java.lang.String getCommunicationTelephone() {
        return communicationTelephone;
    }


    /**
     * Sets the communicationTelephone value for this Customer.
     * 
     * @param communicationTelephone
     */
    public void setCommunicationTelephone(java.lang.String communicationTelephone) {
        this.communicationTelephone = communicationTelephone;
    }


    /**
     * Gets the firstName value for this Customer.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Customer.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the id value for this Customer.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Customer.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the insurance value for this Customer.
     * 
     * @return insurance
     */
    public java.lang.String getInsurance() {
        return insurance;
    }


    /**
     * Sets the insurance value for this Customer.
     * 
     * @param insurance
     */
    public void setInsurance(java.lang.String insurance) {
        this.insurance = insurance;
    }


    /**
     * Gets the lastName value for this Customer.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Customer.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Customer)) return false;
        Customer other = (Customer) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.communicationAddress==null && other.getCommunicationAddress()==null) || 
             (this.communicationAddress!=null &&
              this.communicationAddress.equals(other.getCommunicationAddress()))) &&
            ((this.communicationEmail==null && other.getCommunicationEmail()==null) || 
             (this.communicationEmail!=null &&
              this.communicationEmail.equals(other.getCommunicationEmail()))) &&
            ((this.communicationTelephone==null && other.getCommunicationTelephone()==null) || 
             (this.communicationTelephone!=null &&
              this.communicationTelephone.equals(other.getCommunicationTelephone()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.insurance==null && other.getInsurance()==null) || 
             (this.insurance!=null &&
              this.insurance.equals(other.getInsurance()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName())));
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
        if (getCommunicationAddress() != null) {
            _hashCode += getCommunicationAddress().hashCode();
        }
        if (getCommunicationEmail() != null) {
            _hashCode += getCommunicationEmail().hashCode();
        }
        if (getCommunicationTelephone() != null) {
            _hashCode += getCommunicationTelephone().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getInsurance() != null) {
            _hashCode += getInsurance().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Customer.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "Customer"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "CommunicationAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "CommunicationEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("communicationTelephone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "CommunicationTelephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("insurance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "Insurance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/Reca.DataTransferObjects.Basics.Objects", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
