/**
 * CriteriosTipoServicioTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class CriteriosTipoServicioTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO[] tiposServicio;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO tipoServicioTO;

    public CriteriosTipoServicioTO() {
    }

    public CriteriosTipoServicioTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO[] tiposServicio,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO tipoServicioTO) {
           this.tiposServicio = tiposServicio;
           this.tipoServicioTO = tipoServicioTO;
    }


    /**
     * Gets the tiposServicio value for this CriteriosTipoServicioTO.
     * 
     * @return tiposServicio
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO[] getTiposServicio() {
        return tiposServicio;
    }


    /**
     * Sets the tiposServicio value for this CriteriosTipoServicioTO.
     * 
     * @param tiposServicio
     */
    public void setTiposServicio(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO[] tiposServicio) {
        this.tiposServicio = tiposServicio;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO getTiposServicio(int i) {
        return this.tiposServicio[i];
    }

    public void setTiposServicio(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO _value) {
        this.tiposServicio[i] = _value;
    }


    /**
     * Gets the tipoServicioTO value for this CriteriosTipoServicioTO.
     * 
     * @return tipoServicioTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO getTipoServicioTO() {
        return tipoServicioTO;
    }


    /**
     * Sets the tipoServicioTO value for this CriteriosTipoServicioTO.
     * 
     * @param tipoServicioTO
     */
    public void setTipoServicioTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO tipoServicioTO) {
        this.tipoServicioTO = tipoServicioTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriteriosTipoServicioTO)) return false;
        CriteriosTipoServicioTO other = (CriteriosTipoServicioTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tiposServicio==null && other.getTiposServicio()==null) || 
             (this.tiposServicio!=null &&
              java.util.Arrays.equals(this.tiposServicio, other.getTiposServicio()))) &&
            ((this.tipoServicioTO==null && other.getTipoServicioTO()==null) || 
             (this.tipoServicioTO!=null &&
              this.tipoServicioTO.equals(other.getTipoServicioTO())));
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
        if (getTiposServicio() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTiposServicio());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTiposServicio(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTipoServicioTO() != null) {
            _hashCode += getTipoServicioTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriteriosTipoServicioTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosTipoServicioTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tiposServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tiposServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoServicioTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoServicioTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoServicioTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoServicioTO"));
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
