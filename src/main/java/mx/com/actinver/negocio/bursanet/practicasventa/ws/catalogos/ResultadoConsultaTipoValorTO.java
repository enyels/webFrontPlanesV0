/**
 * ResultadoConsultaTipoValorTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class ResultadoConsultaTipoValorTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO[] tiposValor;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PaginacionTO paginacion;

    public ResultadoConsultaTipoValorTO() {
    }

    public ResultadoConsultaTipoValorTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO[] tiposValor,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PaginacionTO paginacion) {
           this.tiposValor = tiposValor;
           this.paginacion = paginacion;
    }


    /**
     * Gets the tiposValor value for this ResultadoConsultaTipoValorTO.
     * 
     * @return tiposValor
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO[] getTiposValor() {
        return tiposValor;
    }


    /**
     * Sets the tiposValor value for this ResultadoConsultaTipoValorTO.
     * 
     * @param tiposValor
     */
    public void setTiposValor(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO[] tiposValor) {
        this.tiposValor = tiposValor;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO getTiposValor(int i) {
        return this.tiposValor[i];
    }

    public void setTiposValor(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoValorTO _value) {
        this.tiposValor[i] = _value;
    }


    /**
     * Gets the paginacion value for this ResultadoConsultaTipoValorTO.
     * 
     * @return paginacion
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PaginacionTO getPaginacion() {
        return paginacion;
    }


    /**
     * Sets the paginacion value for this ResultadoConsultaTipoValorTO.
     * 
     * @param paginacion
     */
    public void setPaginacion(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PaginacionTO paginacion) {
        this.paginacion = paginacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultadoConsultaTipoValorTO)) return false;
        ResultadoConsultaTipoValorTO other = (ResultadoConsultaTipoValorTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tiposValor==null && other.getTiposValor()==null) || 
             (this.tiposValor!=null &&
              java.util.Arrays.equals(this.tiposValor, other.getTiposValor()))) &&
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
        if (getTiposValor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTiposValor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTiposValor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPaginacion() != null) {
            _hashCode += getPaginacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultadoConsultaTipoValorTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaTipoValorTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tiposValor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tiposValor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoValorTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
