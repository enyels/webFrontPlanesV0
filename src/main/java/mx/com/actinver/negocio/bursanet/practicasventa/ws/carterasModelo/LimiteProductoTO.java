/**
 * LimiteProductoTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class LimiteProductoTO  implements java.io.Serializable {
    private java.lang.Double porcentaje;

    private java.lang.Double monto;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO productoTO;

    public LimiteProductoTO() {
    }

    public LimiteProductoTO(
           java.lang.Double porcentaje,
           java.lang.Double monto,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO productoTO) {
           this.porcentaje = porcentaje;
           this.monto = monto;
           this.productoTO = productoTO;
    }


    /**
     * Gets the porcentaje value for this LimiteProductoTO.
     * 
     * @return porcentaje
     */
    public java.lang.Double getPorcentaje() {
        return porcentaje;
    }


    /**
     * Sets the porcentaje value for this LimiteProductoTO.
     * 
     * @param porcentaje
     */
    public void setPorcentaje(java.lang.Double porcentaje) {
        this.porcentaje = porcentaje;
    }


    /**
     * Gets the monto value for this LimiteProductoTO.
     * 
     * @return monto
     */
    public java.lang.Double getMonto() {
        return monto;
    }


    /**
     * Sets the monto value for this LimiteProductoTO.
     * 
     * @param monto
     */
    public void setMonto(java.lang.Double monto) {
        this.monto = monto;
    }


    /**
     * Gets the productoTO value for this LimiteProductoTO.
     * 
     * @return productoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO getProductoTO() {
        return productoTO;
    }


    /**
     * Sets the productoTO value for this LimiteProductoTO.
     * 
     * @param productoTO
     */
    public void setProductoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO productoTO) {
        this.productoTO = productoTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LimiteProductoTO)) return false;
        LimiteProductoTO other = (LimiteProductoTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.porcentaje==null && other.getPorcentaje()==null) || 
             (this.porcentaje!=null &&
              this.porcentaje.equals(other.getPorcentaje()))) &&
            ((this.monto==null && other.getMonto()==null) || 
             (this.monto!=null &&
              this.monto.equals(other.getMonto()))) &&
            ((this.productoTO==null && other.getProductoTO()==null) || 
             (this.productoTO!=null &&
              this.productoTO.equals(other.getProductoTO())));
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
        if (getPorcentaje() != null) {
            _hashCode += getPorcentaje().hashCode();
        }
        if (getMonto() != null) {
            _hashCode += getMonto().hashCode();
        }
        if (getProductoTO() != null) {
            _hashCode += getProductoTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LimiteProductoTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "limiteProductoTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porcentaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "porcentaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("monto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "monto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "productoTO"));
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
