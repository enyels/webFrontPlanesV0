/**
 * RemitenteTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class RemitenteTO  implements java.io.Serializable {
    private java.lang.String correoElectronico;

    private java.lang.String nombre;

    public RemitenteTO() {
    }

    public RemitenteTO(
           java.lang.String correoElectronico,
           java.lang.String nombre) {
           this.correoElectronico = correoElectronico;
           this.nombre = nombre;
    }


    /**
     * Gets the correoElectronico value for this RemitenteTO.
     * 
     * @return correoElectronico
     */
    public java.lang.String getCorreoElectronico() {
        return correoElectronico;
    }


    /**
     * Sets the correoElectronico value for this RemitenteTO.
     * 
     * @param correoElectronico
     */
    public void setCorreoElectronico(java.lang.String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }


    /**
     * Gets the nombre value for this RemitenteTO.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this RemitenteTO.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RemitenteTO)) return false;
        RemitenteTO other = (RemitenteTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.correoElectronico==null && other.getCorreoElectronico()==null) || 
             (this.correoElectronico!=null &&
              this.correoElectronico.equals(other.getCorreoElectronico()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre())));
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
        if (getCorreoElectronico() != null) {
            _hashCode += getCorreoElectronico().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RemitenteTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "remitenteTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correoElectronico");
        elemField.setXmlName(new javax.xml.namespace.QName("", "correoElectronico"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
