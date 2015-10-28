/**
 * PaginacionTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class PaginacionTO  implements java.io.Serializable {
    private java.lang.Integer numPagina;

    private java.lang.Integer numRegistros;

    private java.lang.Integer totalRegistros;

    public PaginacionTO() {
    }

    public PaginacionTO(
           java.lang.Integer numPagina,
           java.lang.Integer numRegistros,
           java.lang.Integer totalRegistros) {
           this.numPagina = numPagina;
           this.numRegistros = numRegistros;
           this.totalRegistros = totalRegistros;
    }


    /**
     * Gets the numPagina value for this PaginacionTO.
     * 
     * @return numPagina
     */
    public java.lang.Integer getNumPagina() {
        return numPagina;
    }


    /**
     * Sets the numPagina value for this PaginacionTO.
     * 
     * @param numPagina
     */
    public void setNumPagina(java.lang.Integer numPagina) {
        this.numPagina = numPagina;
    }


    /**
     * Gets the numRegistros value for this PaginacionTO.
     * 
     * @return numRegistros
     */
    public java.lang.Integer getNumRegistros() {
        return numRegistros;
    }


    /**
     * Sets the numRegistros value for this PaginacionTO.
     * 
     * @param numRegistros
     */
    public void setNumRegistros(java.lang.Integer numRegistros) {
        this.numRegistros = numRegistros;
    }


    /**
     * Gets the totalRegistros value for this PaginacionTO.
     * 
     * @return totalRegistros
     */
    public java.lang.Integer getTotalRegistros() {
        return totalRegistros;
    }


    /**
     * Sets the totalRegistros value for this PaginacionTO.
     * 
     * @param totalRegistros
     */
    public void setTotalRegistros(java.lang.Integer totalRegistros) {
        this.totalRegistros = totalRegistros;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PaginacionTO)) return false;
        PaginacionTO other = (PaginacionTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numPagina==null && other.getNumPagina()==null) || 
             (this.numPagina!=null &&
              this.numPagina.equals(other.getNumPagina()))) &&
            ((this.numRegistros==null && other.getNumRegistros()==null) || 
             (this.numRegistros!=null &&
              this.numRegistros.equals(other.getNumRegistros()))) &&
            ((this.totalRegistros==null && other.getTotalRegistros()==null) || 
             (this.totalRegistros!=null &&
              this.totalRegistros.equals(other.getTotalRegistros())));
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
        if (getNumPagina() != null) {
            _hashCode += getNumPagina().hashCode();
        }
        if (getNumRegistros() != null) {
            _hashCode += getNumRegistros().hashCode();
        }
        if (getTotalRegistros() != null) {
            _hashCode += getTotalRegistros().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PaginacionTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "paginacionTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPagina");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numPagina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numRegistros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numRegistros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalRegistros");
        elemField.setXmlName(new javax.xml.namespace.QName("", "totalRegistros"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
