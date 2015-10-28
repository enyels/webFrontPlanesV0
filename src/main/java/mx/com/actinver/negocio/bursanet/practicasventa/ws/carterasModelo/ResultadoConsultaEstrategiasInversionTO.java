/**
 * ResultadoConsultaEstrategiasInversionTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class ResultadoConsultaEstrategiasInversionTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO[] listaEstrategiasInversionTO;

    private java.lang.Integer status;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO singleEstrategiaInversionTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages messages;

    public ResultadoConsultaEstrategiasInversionTO() {
    }

    public ResultadoConsultaEstrategiasInversionTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO[] listaEstrategiasInversionTO,
           java.lang.Integer status,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO singleEstrategiaInversionTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages messages) {
           this.listaEstrategiasInversionTO = listaEstrategiasInversionTO;
           this.status = status;
           this.singleEstrategiaInversionTO = singleEstrategiaInversionTO;
           this.messages = messages;
    }


    /**
     * Gets the listaEstrategiasInversionTO value for this ResultadoConsultaEstrategiasInversionTO.
     * 
     * @return listaEstrategiasInversionTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO[] getListaEstrategiasInversionTO() {
        return listaEstrategiasInversionTO;
    }


    /**
     * Sets the listaEstrategiasInversionTO value for this ResultadoConsultaEstrategiasInversionTO.
     * 
     * @param listaEstrategiasInversionTO
     */
    public void setListaEstrategiasInversionTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO[] listaEstrategiasInversionTO) {
        this.listaEstrategiasInversionTO = listaEstrategiasInversionTO;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO getListaEstrategiasInversionTO(int i) {
        return this.listaEstrategiasInversionTO[i];
    }

    public void setListaEstrategiasInversionTO(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO _value) {
        this.listaEstrategiasInversionTO[i] = _value;
    }


    /**
     * Gets the status value for this ResultadoConsultaEstrategiasInversionTO.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ResultadoConsultaEstrategiasInversionTO.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the singleEstrategiaInversionTO value for this ResultadoConsultaEstrategiasInversionTO.
     * 
     * @return singleEstrategiaInversionTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO getSingleEstrategiaInversionTO() {
        return singleEstrategiaInversionTO;
    }


    /**
     * Sets the singleEstrategiaInversionTO value for this ResultadoConsultaEstrategiasInversionTO.
     * 
     * @param singleEstrategiaInversionTO
     */
    public void setSingleEstrategiaInversionTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstrategiaInversionTO singleEstrategiaInversionTO) {
        this.singleEstrategiaInversionTO = singleEstrategiaInversionTO;
    }


    /**
     * Gets the messages value for this ResultadoConsultaEstrategiasInversionTO.
     * 
     * @return messages
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this ResultadoConsultaEstrategiasInversionTO.
     * 
     * @param messages
     */
    public void setMessages(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages messages) {
        this.messages = messages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultadoConsultaEstrategiasInversionTO)) return false;
        ResultadoConsultaEstrategiasInversionTO other = (ResultadoConsultaEstrategiasInversionTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listaEstrategiasInversionTO==null && other.getListaEstrategiasInversionTO()==null) || 
             (this.listaEstrategiasInversionTO!=null &&
              java.util.Arrays.equals(this.listaEstrategiasInversionTO, other.getListaEstrategiasInversionTO()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.singleEstrategiaInversionTO==null && other.getSingleEstrategiaInversionTO()==null) || 
             (this.singleEstrategiaInversionTO!=null &&
              this.singleEstrategiaInversionTO.equals(other.getSingleEstrategiaInversionTO()))) &&
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
        if (getListaEstrategiasInversionTO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaEstrategiasInversionTO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaEstrategiasInversionTO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getSingleEstrategiaInversionTO() != null) {
            _hashCode += getSingleEstrategiaInversionTO().hashCode();
        }
        if (getMessages() != null) {
            _hashCode += getMessages().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultadoConsultaEstrategiasInversionTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "ResultadoConsultaEstrategiasInversionTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaEstrategiasInversionTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaEstrategiasInversionTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estrategiaInversionTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("singleEstrategiaInversionTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "singleEstrategiaInversionTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estrategiaInversionTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
