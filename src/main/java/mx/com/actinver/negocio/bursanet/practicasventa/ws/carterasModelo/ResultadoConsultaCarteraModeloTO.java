/**
 * ResultadoConsultaCarteraModeloTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class ResultadoConsultaCarteraModeloTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO[] carterasModeloTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosCarterasModeloTO criteriosTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO contratoTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO singleCarteraModeloTO;

    private java.lang.Integer status;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages messages;

    public ResultadoConsultaCarteraModeloTO() {
    }

    public ResultadoConsultaCarteraModeloTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO[] carterasModeloTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosCarterasModeloTO criteriosTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO contratoTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO singleCarteraModeloTO,
           java.lang.Integer status,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages messages) {
           this.carterasModeloTO = carterasModeloTO;
           this.criteriosTO = criteriosTO;
           this.contratoTO = contratoTO;
           this.singleCarteraModeloTO = singleCarteraModeloTO;
           this.status = status;
           this.messages = messages;
    }


    /**
     * Gets the carterasModeloTO value for this ResultadoConsultaCarteraModeloTO.
     * 
     * @return carterasModeloTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO[] getCarterasModeloTO() {
        return carterasModeloTO;
    }


    /**
     * Sets the carterasModeloTO value for this ResultadoConsultaCarteraModeloTO.
     * 
     * @param carterasModeloTO
     */
    public void setCarterasModeloTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO[] carterasModeloTO) {
        this.carterasModeloTO = carterasModeloTO;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO getCarterasModeloTO(int i) {
        return this.carterasModeloTO[i];
    }

    public void setCarterasModeloTO(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO _value) {
        this.carterasModeloTO[i] = _value;
    }


    /**
     * Gets the criteriosTO value for this ResultadoConsultaCarteraModeloTO.
     * 
     * @return criteriosTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosCarterasModeloTO getCriteriosTO() {
        return criteriosTO;
    }


    /**
     * Sets the criteriosTO value for this ResultadoConsultaCarteraModeloTO.
     * 
     * @param criteriosTO
     */
    public void setCriteriosTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CriteriosCarterasModeloTO criteriosTO) {
        this.criteriosTO = criteriosTO;
    }


    /**
     * Gets the contratoTO value for this ResultadoConsultaCarteraModeloTO.
     * 
     * @return contratoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO getContratoTO() {
        return contratoTO;
    }


    /**
     * Sets the contratoTO value for this ResultadoConsultaCarteraModeloTO.
     * 
     * @param contratoTO
     */
    public void setContratoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO contratoTO) {
        this.contratoTO = contratoTO;
    }


    /**
     * Gets the singleCarteraModeloTO value for this ResultadoConsultaCarteraModeloTO.
     * 
     * @return singleCarteraModeloTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO getSingleCarteraModeloTO() {
        return singleCarteraModeloTO;
    }


    /**
     * Sets the singleCarteraModeloTO value for this ResultadoConsultaCarteraModeloTO.
     * 
     * @param singleCarteraModeloTO
     */
    public void setSingleCarteraModeloTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO singleCarteraModeloTO) {
        this.singleCarteraModeloTO = singleCarteraModeloTO;
    }


    /**
     * Gets the status value for this ResultadoConsultaCarteraModeloTO.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ResultadoConsultaCarteraModeloTO.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the messages value for this ResultadoConsultaCarteraModeloTO.
     * 
     * @return messages
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this ResultadoConsultaCarteraModeloTO.
     * 
     * @param messages
     */
    public void setMessages(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages messages) {
        this.messages = messages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultadoConsultaCarteraModeloTO)) return false;
        ResultadoConsultaCarteraModeloTO other = (ResultadoConsultaCarteraModeloTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carterasModeloTO==null && other.getCarterasModeloTO()==null) || 
             (this.carterasModeloTO!=null &&
              java.util.Arrays.equals(this.carterasModeloTO, other.getCarterasModeloTO()))) &&
            ((this.criteriosTO==null && other.getCriteriosTO()==null) || 
             (this.criteriosTO!=null &&
              this.criteriosTO.equals(other.getCriteriosTO()))) &&
            ((this.contratoTO==null && other.getContratoTO()==null) || 
             (this.contratoTO!=null &&
              this.contratoTO.equals(other.getContratoTO()))) &&
            ((this.singleCarteraModeloTO==null && other.getSingleCarteraModeloTO()==null) || 
             (this.singleCarteraModeloTO!=null &&
              this.singleCarteraModeloTO.equals(other.getSingleCarteraModeloTO()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              this.messages.equals(other.getMessages())));
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
        if (getCarterasModeloTO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCarterasModeloTO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCarterasModeloTO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCriteriosTO() != null) {
            _hashCode += getCriteriosTO().hashCode();
        }
        if (getContratoTO() != null) {
            _hashCode += getContratoTO().hashCode();
        }
        if (getSingleCarteraModeloTO() != null) {
            _hashCode += getSingleCarteraModeloTO().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMessages() != null) {
            _hashCode += getMessages().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultadoConsultaCarteraModeloTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "ResultadoConsultaCarteraModeloTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carterasModeloTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carterasModeloTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "carterasModeloTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteriosTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criteriosTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "CriteriosCarterasModeloTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contratoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contratoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "contratoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("singleCarteraModeloTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "singleCarteraModeloTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "carterasModeloTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Messages"));
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
