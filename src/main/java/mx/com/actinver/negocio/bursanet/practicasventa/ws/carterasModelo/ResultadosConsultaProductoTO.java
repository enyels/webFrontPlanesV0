/**
 * ResultadosConsultaProductoTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class ResultadosConsultaProductoTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PaginacionTO paginacionTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO[] listaProductos;

    private java.lang.Integer status;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages messages;

    public ResultadosConsultaProductoTO() {
    }

    public ResultadosConsultaProductoTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PaginacionTO paginacionTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO[] listaProductos,
           java.lang.Integer status,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages messages) {
           this.paginacionTO = paginacionTO;
           this.listaProductos = listaProductos;
           this.status = status;
           this.messages = messages;
    }


    /**
     * Gets the paginacionTO value for this ResultadosConsultaProductoTO.
     * 
     * @return paginacionTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PaginacionTO getPaginacionTO() {
        return paginacionTO;
    }


    /**
     * Sets the paginacionTO value for this ResultadosConsultaProductoTO.
     * 
     * @param paginacionTO
     */
    public void setPaginacionTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PaginacionTO paginacionTO) {
        this.paginacionTO = paginacionTO;
    }


    /**
     * Gets the listaProductos value for this ResultadosConsultaProductoTO.
     * 
     * @return listaProductos
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO[] getListaProductos() {
        return listaProductos;
    }


    /**
     * Sets the listaProductos value for this ResultadosConsultaProductoTO.
     * 
     * @param listaProductos
     */
    public void setListaProductos(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO[] listaProductos) {
        this.listaProductos = listaProductos;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO getListaProductos(int i) {
        return this.listaProductos[i];
    }

    public void setListaProductos(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO _value) {
        this.listaProductos[i] = _value;
    }


    /**
     * Gets the status value for this ResultadosConsultaProductoTO.
     * 
     * @return status
     */
    public java.lang.Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ResultadosConsultaProductoTO.
     * 
     * @param status
     */
    public void setStatus(java.lang.Integer status) {
        this.status = status;
    }


    /**
     * Gets the messages value for this ResultadosConsultaProductoTO.
     * 
     * @return messages
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this ResultadosConsultaProductoTO.
     * 
     * @param messages
     */
    public void setMessages(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.Messages messages) {
        this.messages = messages;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultadosConsultaProductoTO)) return false;
        ResultadosConsultaProductoTO other = (ResultadosConsultaProductoTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.paginacionTO==null && other.getPaginacionTO()==null) || 
             (this.paginacionTO!=null &&
              this.paginacionTO.equals(other.getPaginacionTO()))) &&
            ((this.listaProductos==null && other.getListaProductos()==null) || 
             (this.listaProductos!=null &&
              java.util.Arrays.equals(this.listaProductos, other.getListaProductos()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              this.messages.equals(other.getMessages())));
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
        if (getPaginacionTO() != null) {
            _hashCode += getPaginacionTO().hashCode();
        }
        if (getListaProductos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaProductos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaProductos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMessages() != null) {
            _hashCode += getMessages().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResultadosConsultaProductoTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadosConsultaProductoTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paginacionTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paginacionTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "paginacionTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaProductos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaProductos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "productoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("", "messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "Messages"));
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
