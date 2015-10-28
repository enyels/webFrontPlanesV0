/**
 * CriteriosTipoValorTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class CriteriosTipoValorTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO tipoValor;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PaginacionTO paginacion;

    public CriteriosTipoValorTO() {
    }

    public CriteriosTipoValorTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO tipoValor,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PaginacionTO paginacion) {
           this.tipoValor = tipoValor;
           this.paginacion = paginacion;
    }


    /**
     * Gets the tipoValor value for this CriteriosTipoValorTO.
     * 
     * @return tipoValor
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO getTipoValor() {
        return tipoValor;
    }


    /**
     * Sets the tipoValor value for this CriteriosTipoValorTO.
     * 
     * @param tipoValor
     */
    public void setTipoValor(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO tipoValor) {
        this.tipoValor = tipoValor;
    }


    /**
     * Gets the paginacion value for this CriteriosTipoValorTO.
     * 
     * @return paginacion
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PaginacionTO getPaginacion() {
        return paginacion;
    }


    /**
     * Sets the paginacion value for this CriteriosTipoValorTO.
     * 
     * @param paginacion
     */
    public void setPaginacion(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PaginacionTO paginacion) {
        this.paginacion = paginacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriteriosTipoValorTO)) return false;
        CriteriosTipoValorTO other = (CriteriosTipoValorTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoValor==null && other.getTipoValor()==null) || 
             (this.tipoValor!=null &&
              this.tipoValor.equals(other.getTipoValor()))) &&
            ((this.paginacion==null && other.getPaginacion()==null) || 
             (this.paginacion!=null &&
              this.paginacion.equals(other.getPaginacion())));
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
        if (getTipoValor() != null) {
            _hashCode += getTipoValor().hashCode();
        }
        if (getPaginacion() != null) {
            _hashCode += getPaginacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriteriosTipoValorTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosTipoValorTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoValor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoValor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoValorTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paginacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paginacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "paginacionTO"));
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
