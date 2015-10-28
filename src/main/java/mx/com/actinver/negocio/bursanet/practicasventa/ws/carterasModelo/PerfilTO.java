/**
 * PerfilTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class PerfilTO  extends mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CatalogoTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO estadoTO;

    private java.lang.Double resultadoCalificacion;

    private java.lang.Boolean esMostrarTodo;

    public PerfilTO() {
    }

    public PerfilTO(
           java.lang.String descripcion,
           java.lang.Long id,
           java.lang.String nombre,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO estadoTO,
           java.lang.Double resultadoCalificacion,
           java.lang.Boolean esMostrarTodo) {
        super(
            descripcion,
            id,
            nombre);
        this.estadoTO = estadoTO;
        this.resultadoCalificacion = resultadoCalificacion;
        this.esMostrarTodo = esMostrarTodo;
    }


    /**
     * Gets the estadoTO value for this PerfilTO.
     * 
     * @return estadoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO getEstadoTO() {
        return estadoTO;
    }


    /**
     * Sets the estadoTO value for this PerfilTO.
     * 
     * @param estadoTO
     */
    public void setEstadoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO estadoTO) {
        this.estadoTO = estadoTO;
    }


    /**
     * Gets the resultadoCalificacion value for this PerfilTO.
     * 
     * @return resultadoCalificacion
     */
    public java.lang.Double getResultadoCalificacion() {
        return resultadoCalificacion;
    }


    /**
     * Sets the resultadoCalificacion value for this PerfilTO.
     * 
     * @param resultadoCalificacion
     */
    public void setResultadoCalificacion(java.lang.Double resultadoCalificacion) {
        this.resultadoCalificacion = resultadoCalificacion;
    }


    /**
     * Gets the esMostrarTodo value for this PerfilTO.
     * 
     * @return esMostrarTodo
     */
    public java.lang.Boolean getEsMostrarTodo() {
        return esMostrarTodo;
    }


    /**
     * Sets the esMostrarTodo value for this PerfilTO.
     * 
     * @param esMostrarTodo
     */
    public void setEsMostrarTodo(java.lang.Boolean esMostrarTodo) {
        this.esMostrarTodo = esMostrarTodo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PerfilTO)) return false;
        PerfilTO other = (PerfilTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.estadoTO==null && other.getEstadoTO()==null) || 
             (this.estadoTO!=null &&
              this.estadoTO.equals(other.getEstadoTO()))) &&
            ((this.resultadoCalificacion==null && other.getResultadoCalificacion()==null) || 
             (this.resultadoCalificacion!=null &&
              this.resultadoCalificacion.equals(other.getResultadoCalificacion()))) &&
            ((this.esMostrarTodo==null && other.getEsMostrarTodo()==null) || 
             (this.esMostrarTodo!=null &&
              this.esMostrarTodo.equals(other.getEsMostrarTodo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getEstadoTO() != null) {
            _hashCode += getEstadoTO().hashCode();
        }
        if (getResultadoCalificacion() != null) {
            _hashCode += getResultadoCalificacion().hashCode();
        }
        if (getEsMostrarTodo() != null) {
            _hashCode += getEsMostrarTodo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PerfilTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "perfilTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estadoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadoCalificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "resultadoCalificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esMostrarTodo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esMostrarTodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
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
