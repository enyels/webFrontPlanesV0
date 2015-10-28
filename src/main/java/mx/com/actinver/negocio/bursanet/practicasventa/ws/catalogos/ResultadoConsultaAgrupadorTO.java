/**
 * ResultadoConsultaAgrupadorTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class ResultadoConsultaAgrupadorTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO[] agrupadoresTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.LimiteGlobalTO limiteGlobalTO;

    private java.lang.Integer status;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Messages messages;

    public ResultadoConsultaAgrupadorTO() {
    }

    public ResultadoConsultaAgrupadorTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO[] agrupadoresTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.LimiteGlobalTO limiteGlobalTO,
           java.lang.Integer status,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Messages messages) {
           this.agrupadoresTO = agrupadoresTO;
           this.limiteGlobalTO = limiteGlobalTO;
           this.status = status;
           this.messages = messages;
    }


    /**
     * Gets the agrupadoresTO value for this ResultadoConsultaAgrupadorTO.
     * 
     * @return agrupadoresTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO[] getAgrupadoresTO() {
        return agrupadoresTO;
    }


    /**
     * Sets the agrupadoresTO value for this ResultadoConsultaAgrupadorTO.
     * 
     * @param agrupadoresTO
     */
    public void setAgrupadoresTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO[] agrupadoresTO) {
        this.agrupadoresTO = agrupadoresTO;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO getAgrupadoresTO(int i) {
        return this.agrupadoresTO[i];
    }

    public void setAgrupadoresTO(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO _value) {
        this.agrupadoresTO[i] = _value;
    }


    /**
     * Gets the limiteGlobalTO value for this ResultadoConsultaAgrupadorTO.
     * 
     * @return limiteGlobalTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.LimiteGlobalTO getLimiteGlobalTO() {
        return limiteGlobalTO;
    }


    /**
     * Sets the limiteGlobalTO value for this ResultadoConsultaAgrupadorTO.
     * 
     * @param limiteGlobalTO
     */
    public void setLimiteGlobalTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.LimiteGlobalTO limiteGlobalTO) {
        this.limiteGlobalTO = limiteGlobalTO;
    }


    /**
     * Gets the status value for this ResultadoConsultaAgrupadorTO.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ResultadoConsultaAgrupadorTO.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the messages value for this ResultadoConsultaAgrupadorTO.
     * 
     * @return messages
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Messages getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this ResultadoConsultaAgrupadorTO.
     * 
     * @param messages
     */
    public void setMessages(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.Messages messages) {
        this.messages = messages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultadoConsultaAgrupadorTO)) return false;
        ResultadoConsultaAgrupadorTO other = (ResultadoConsultaAgrupadorTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agrupadoresTO==null && other.getAgrupadoresTO()==null) || 
             (this.agrupadoresTO!=null &&
              java.util.Arrays.equals(this.agrupadoresTO, other.getAgrupadoresTO()))) &&
            ((this.limiteGlobalTO==null && other.getLimiteGlobalTO()==null) || 
             (this.limiteGlobalTO!=null &&
              this.limiteGlobalTO.equals(other.getLimiteGlobalTO()))) &&
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
        if (getAgrupadoresTO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAgrupadoresTO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAgrupadoresTO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLimiteGlobalTO() != null) {
            _hashCode += getLimiteGlobalTO().hashCode();
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
        new org.apache.axis.description.TypeDesc(ResultadoConsultaAgrupadorTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaAgrupadorTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agrupadoresTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agrupadoresTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "agrupadorTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limiteGlobalTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limiteGlobalTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "limiteGlobalTO"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Messages"));
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
