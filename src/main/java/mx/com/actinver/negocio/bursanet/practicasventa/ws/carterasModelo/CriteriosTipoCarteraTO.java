/**
 * CriteriosTipoCarteraTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class CriteriosTipoCarteraTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO tipoCarteraTO;

    public CriteriosTipoCarteraTO() {
    }

    public CriteriosTipoCarteraTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO tipoCarteraTO) {
           this.tipoCarteraTO = tipoCarteraTO;
    }


    /**
     * Gets the tipoCarteraTO value for this CriteriosTipoCarteraTO.
     * 
     * @return tipoCarteraTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO getTipoCarteraTO() {
        return tipoCarteraTO;
    }


    /**
     * Sets the tipoCarteraTO value for this CriteriosTipoCarteraTO.
     * 
     * @param tipoCarteraTO
     */
    public void setTipoCarteraTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO tipoCarteraTO) {
        this.tipoCarteraTO = tipoCarteraTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriteriosTipoCarteraTO)) return false;
        CriteriosTipoCarteraTO other = (CriteriosTipoCarteraTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoCarteraTO==null && other.getTipoCarteraTO()==null) || 
             (this.tipoCarteraTO!=null &&
              this.tipoCarteraTO.equals(other.getTipoCarteraTO())));
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
        if (getTipoCarteraTO() != null) {
            _hashCode += getTipoCarteraTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriteriosTipoCarteraTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosTipoCarteraTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCarteraTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoCarteraTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoCarteraTO"));
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
