/**
 * CriteriosEstrategiasInversionTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class CriteriosEstrategiasInversionTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO contratoTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoEstrategiaTO estadoEstrategiaTO;

    public CriteriosEstrategiasInversionTO() {
    }

    public CriteriosEstrategiasInversionTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO contratoTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoEstrategiaTO estadoEstrategiaTO) {
           this.contratoTO = contratoTO;
           this.estadoEstrategiaTO = estadoEstrategiaTO;
    }


    /**
     * Gets the contratoTO value for this CriteriosEstrategiasInversionTO.
     * 
     * @return contratoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO getContratoTO() {
        return contratoTO;
    }


    /**
     * Sets the contratoTO value for this CriteriosEstrategiasInversionTO.
     * 
     * @param contratoTO
     */
    public void setContratoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO contratoTO) {
        this.contratoTO = contratoTO;
    }


    /**
     * Gets the estadoEstrategiaTO value for this CriteriosEstrategiasInversionTO.
     * 
     * @return estadoEstrategiaTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoEstrategiaTO getEstadoEstrategiaTO() {
        return estadoEstrategiaTO;
    }


    /**
     * Sets the estadoEstrategiaTO value for this CriteriosEstrategiasInversionTO.
     * 
     * @param estadoEstrategiaTO
     */
    public void setEstadoEstrategiaTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoEstrategiaTO estadoEstrategiaTO) {
        this.estadoEstrategiaTO = estadoEstrategiaTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriteriosEstrategiasInversionTO)) return false;
        CriteriosEstrategiasInversionTO other = (CriteriosEstrategiasInversionTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contratoTO==null && other.getContratoTO()==null) || 
             (this.contratoTO!=null &&
              this.contratoTO.equals(other.getContratoTO()))) &&
            ((this.estadoEstrategiaTO==null && other.getEstadoEstrategiaTO()==null) || 
             (this.estadoEstrategiaTO!=null &&
              this.estadoEstrategiaTO.equals(other.getEstadoEstrategiaTO())));
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
        if (getContratoTO() != null) {
            _hashCode += getContratoTO().hashCode();
        }
        if (getEstadoEstrategiaTO() != null) {
            _hashCode += getEstadoEstrategiaTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriteriosEstrategiasInversionTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "CriteriosEstrategiasInversionTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contratoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contratoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "contratoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoEstrategiaTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoEstrategiaTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estadoEstrategiaTO"));
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
