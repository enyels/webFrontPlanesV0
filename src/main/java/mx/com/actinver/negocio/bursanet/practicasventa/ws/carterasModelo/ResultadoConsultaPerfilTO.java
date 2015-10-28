/**
 * ResultadoConsultaPerfilTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class ResultadoConsultaPerfilTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO[] perfilTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO contratoTO;

    private java.lang.Integer status;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages messages;

    public ResultadoConsultaPerfilTO() {
    }

    public ResultadoConsultaPerfilTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO[] perfilTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO contratoTO,
           java.lang.Integer status,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages messages) {
           this.perfilTO = perfilTO;
           this.contratoTO = contratoTO;
           this.status = status;
           this.messages = messages;
    }


    /**
     * Gets the perfilTO value for this ResultadoConsultaPerfilTO.
     * 
     * @return perfilTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO[] getPerfilTO() {
        return perfilTO;
    }


    /**
     * Sets the perfilTO value for this ResultadoConsultaPerfilTO.
     * 
     * @param perfilTO
     */
    public void setPerfilTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO[] perfilTO) {
        this.perfilTO = perfilTO;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO getPerfilTO(int i) {
        return this.perfilTO[i];
    }

    public void setPerfilTO(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO _value) {
        this.perfilTO[i] = _value;
    }


    /**
     * Gets the contratoTO value for this ResultadoConsultaPerfilTO.
     * 
     * @return contratoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO getContratoTO() {
        return contratoTO;
    }


    /**
     * Sets the contratoTO value for this ResultadoConsultaPerfilTO.
     * 
     * @param contratoTO
     */
    public void setContratoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO contratoTO) {
        this.contratoTO = contratoTO;
    }


    /**
     * Gets the status value for this ResultadoConsultaPerfilTO.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ResultadoConsultaPerfilTO.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the messages value for this ResultadoConsultaPerfilTO.
     * 
     * @return messages
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this ResultadoConsultaPerfilTO.
     * 
     * @param messages
     */
    public void setMessages(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages messages) {
        this.messages = messages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultadoConsultaPerfilTO)) return false;
        ResultadoConsultaPerfilTO other = (ResultadoConsultaPerfilTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.perfilTO==null && other.getPerfilTO()==null) || 
             (this.perfilTO!=null &&
              java.util.Arrays.equals(this.perfilTO, other.getPerfilTO()))) &&
            ((this.contratoTO==null && other.getContratoTO()==null) || 
             (this.contratoTO!=null &&
              this.contratoTO.equals(other.getContratoTO()))) &&
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
        if (getPerfilTO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerfilTO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerfilTO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getContratoTO() != null) {
            _hashCode += getContratoTO().hashCode();
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
        new org.apache.axis.description.TypeDesc(ResultadoConsultaPerfilTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaPerfilTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfilTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfilTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "perfilTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contratoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contratoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "contratoTO"));
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
