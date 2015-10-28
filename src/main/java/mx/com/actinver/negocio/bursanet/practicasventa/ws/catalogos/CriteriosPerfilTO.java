/**
 * CriteriosPerfilTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class CriteriosPerfilTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO perfilTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ContratoTO contratoTO;

    public CriteriosPerfilTO() {
    }

    public CriteriosPerfilTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO perfilTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ContratoTO contratoTO) {
           this.perfilTO = perfilTO;
           this.contratoTO = contratoTO;
    }


    /**
     * Gets the perfilTO value for this CriteriosPerfilTO.
     * 
     * @return perfilTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO getPerfilTO() {
        return perfilTO;
    }


    /**
     * Sets the perfilTO value for this CriteriosPerfilTO.
     * 
     * @param perfilTO
     */
    public void setPerfilTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO perfilTO) {
        this.perfilTO = perfilTO;
    }


    /**
     * Gets the contratoTO value for this CriteriosPerfilTO.
     * 
     * @return contratoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ContratoTO getContratoTO() {
        return contratoTO;
    }


    /**
     * Sets the contratoTO value for this CriteriosPerfilTO.
     * 
     * @param contratoTO
     */
    public void setContratoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ContratoTO contratoTO) {
        this.contratoTO = contratoTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriteriosPerfilTO)) return false;
        CriteriosPerfilTO other = (CriteriosPerfilTO) obj;
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
              this.perfilTO.equals(other.getPerfilTO()))) &&
            ((this.contratoTO==null && other.getContratoTO()==null) || 
             (this.contratoTO!=null &&
              this.contratoTO.equals(other.getContratoTO())));
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
            _hashCode += getPerfilTO().hashCode();
        }
        if (getContratoTO() != null) {
            _hashCode += getContratoTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriteriosPerfilTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosPerfilTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfilTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfilTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "perfilTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contratoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contratoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "contratoTO"));
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
