/**
 * CriteriosAgrupadorTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class CriteriosAgrupadorTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO agrupadorTO;

    private java.lang.Boolean incluirSubGrupos;

    public CriteriosAgrupadorTO() {
    }

    public CriteriosAgrupadorTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO agrupadorTO,
           java.lang.Boolean incluirSubGrupos) {
           this.agrupadorTO = agrupadorTO;
           this.incluirSubGrupos = incluirSubGrupos;
    }


    /**
     * Gets the agrupadorTO value for this CriteriosAgrupadorTO.
     * 
     * @return agrupadorTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO getAgrupadorTO() {
        return agrupadorTO;
    }


    /**
     * Sets the agrupadorTO value for this CriteriosAgrupadorTO.
     * 
     * @param agrupadorTO
     */
    public void setAgrupadorTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO agrupadorTO) {
        this.agrupadorTO = agrupadorTO;
    }


    /**
     * Gets the incluirSubGrupos value for this CriteriosAgrupadorTO.
     * 
     * @return incluirSubGrupos
     */
    public java.lang.Boolean getIncluirSubGrupos() {
        return incluirSubGrupos;
    }


    /**
     * Sets the incluirSubGrupos value for this CriteriosAgrupadorTO.
     * 
     * @param incluirSubGrupos
     */
    public void setIncluirSubGrupos(java.lang.Boolean incluirSubGrupos) {
        this.incluirSubGrupos = incluirSubGrupos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriteriosAgrupadorTO)) return false;
        CriteriosAgrupadorTO other = (CriteriosAgrupadorTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agrupadorTO==null && other.getAgrupadorTO()==null) || 
             (this.agrupadorTO!=null &&
              this.agrupadorTO.equals(other.getAgrupadorTO()))) &&
            ((this.incluirSubGrupos==null && other.getIncluirSubGrupos()==null) || 
             (this.incluirSubGrupos!=null &&
              this.incluirSubGrupos.equals(other.getIncluirSubGrupos())));
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
        if (getAgrupadorTO() != null) {
            _hashCode += getAgrupadorTO().hashCode();
        }
        if (getIncluirSubGrupos() != null) {
            _hashCode += getIncluirSubGrupos().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriteriosAgrupadorTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosAgrupadorTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agrupadorTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agrupadorTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "agrupadorTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("incluirSubGrupos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "incluirSubGrupos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
