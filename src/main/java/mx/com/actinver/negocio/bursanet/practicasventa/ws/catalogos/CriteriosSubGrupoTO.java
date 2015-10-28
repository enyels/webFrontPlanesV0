/**
 * CriteriosSubGrupoTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class CriteriosSubGrupoTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO tipoValorTO;

    public CriteriosSubGrupoTO() {
    }

    public CriteriosSubGrupoTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO tipoValorTO) {
           this.tipoValorTO = tipoValorTO;
    }


    /**
     * Gets the tipoValorTO value for this CriteriosSubGrupoTO.
     * 
     * @return tipoValorTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO getTipoValorTO() {
        return tipoValorTO;
    }


    /**
     * Sets the tipoValorTO value for this CriteriosSubGrupoTO.
     * 
     * @param tipoValorTO
     */
    public void setTipoValorTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO tipoValorTO) {
        this.tipoValorTO = tipoValorTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriteriosSubGrupoTO)) return false;
        CriteriosSubGrupoTO other = (CriteriosSubGrupoTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoValorTO==null && other.getTipoValorTO()==null) || 
             (this.tipoValorTO!=null &&
              this.tipoValorTO.equals(other.getTipoValorTO())));
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
        if (getTipoValorTO() != null) {
            _hashCode += getTipoValorTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriteriosSubGrupoTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosSubGrupoTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoValorTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoValorTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoValorTO"));
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
