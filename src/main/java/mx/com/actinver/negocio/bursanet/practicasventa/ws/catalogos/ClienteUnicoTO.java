/**
 * ClienteUnicoTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class ClienteUnicoTO  implements java.io.Serializable {
    private java.lang.String numeroClienteUnico;

    private java.lang.Boolean numeroCteUnicoAprobado;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstatusEnrolamientoTO estatusEnrolamientoTO;

    public ClienteUnicoTO() {
    }

    public ClienteUnicoTO(
           java.lang.String numeroClienteUnico,
           java.lang.Boolean numeroCteUnicoAprobado,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstatusEnrolamientoTO estatusEnrolamientoTO) {
           this.numeroClienteUnico = numeroClienteUnico;
           this.numeroCteUnicoAprobado = numeroCteUnicoAprobado;
           this.estatusEnrolamientoTO = estatusEnrolamientoTO;
    }


    /**
     * Gets the numeroClienteUnico value for this ClienteUnicoTO.
     * 
     * @return numeroClienteUnico
     */
    public java.lang.String getNumeroClienteUnico() {
        return numeroClienteUnico;
    }


    /**
     * Sets the numeroClienteUnico value for this ClienteUnicoTO.
     * 
     * @param numeroClienteUnico
     */
    public void setNumeroClienteUnico(java.lang.String numeroClienteUnico) {
        this.numeroClienteUnico = numeroClienteUnico;
    }


    /**
     * Gets the numeroCteUnicoAprobado value for this ClienteUnicoTO.
     * 
     * @return numeroCteUnicoAprobado
     */
    public java.lang.Boolean getNumeroCteUnicoAprobado() {
        return numeroCteUnicoAprobado;
    }


    /**
     * Sets the numeroCteUnicoAprobado value for this ClienteUnicoTO.
     * 
     * @param numeroCteUnicoAprobado
     */
    public void setNumeroCteUnicoAprobado(java.lang.Boolean numeroCteUnicoAprobado) {
        this.numeroCteUnicoAprobado = numeroCteUnicoAprobado;
    }


    /**
     * Gets the estatusEnrolamientoTO value for this ClienteUnicoTO.
     * 
     * @return estatusEnrolamientoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstatusEnrolamientoTO getEstatusEnrolamientoTO() {
        return estatusEnrolamientoTO;
    }


    /**
     * Sets the estatusEnrolamientoTO value for this ClienteUnicoTO.
     * 
     * @param estatusEnrolamientoTO
     */
    public void setEstatusEnrolamientoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstatusEnrolamientoTO estatusEnrolamientoTO) {
        this.estatusEnrolamientoTO = estatusEnrolamientoTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClienteUnicoTO)) return false;
        ClienteUnicoTO other = (ClienteUnicoTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numeroClienteUnico==null && other.getNumeroClienteUnico()==null) || 
             (this.numeroClienteUnico!=null &&
              this.numeroClienteUnico.equals(other.getNumeroClienteUnico()))) &&
            ((this.numeroCteUnicoAprobado==null && other.getNumeroCteUnicoAprobado()==null) || 
             (this.numeroCteUnicoAprobado!=null &&
              this.numeroCteUnicoAprobado.equals(other.getNumeroCteUnicoAprobado()))) &&
            ((this.estatusEnrolamientoTO==null && other.getEstatusEnrolamientoTO()==null) || 
             (this.estatusEnrolamientoTO!=null &&
              this.estatusEnrolamientoTO.equals(other.getEstatusEnrolamientoTO())));
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
        if (getNumeroClienteUnico() != null) {
            _hashCode += getNumeroClienteUnico().hashCode();
        }
        if (getNumeroCteUnicoAprobado() != null) {
            _hashCode += getNumeroCteUnicoAprobado().hashCode();
        }
        if (getEstatusEnrolamientoTO() != null) {
            _hashCode += getEstatusEnrolamientoTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClienteUnicoTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "clienteUnicoTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroClienteUnico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroClienteUnico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroCteUnicoAprobado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numeroCteUnicoAprobado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estatusEnrolamientoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estatusEnrolamientoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estatusEnrolamientoTO"));
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
