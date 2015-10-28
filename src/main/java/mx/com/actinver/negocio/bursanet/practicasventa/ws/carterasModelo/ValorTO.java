/**
 * ValorTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class ValorTO  implements java.io.Serializable {
    private java.lang.Long id;

    private java.lang.Integer ordenComparacion;

    private java.lang.String valorComparable;

    public ValorTO() {
    }

    public ValorTO(
           java.lang.Long id,
           java.lang.Integer ordenComparacion,
           java.lang.String valorComparable) {
           this.id = id;
           this.ordenComparacion = ordenComparacion;
           this.valorComparable = valorComparable;
    }


    /**
     * Gets the id value for this ValorTO.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ValorTO.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the ordenComparacion value for this ValorTO.
     * 
     * @return ordenComparacion
     */
    public java.lang.Integer getOrdenComparacion() {
        return ordenComparacion;
    }


    /**
     * Sets the ordenComparacion value for this ValorTO.
     * 
     * @param ordenComparacion
     */
    public void setOrdenComparacion(java.lang.Integer ordenComparacion) {
        this.ordenComparacion = ordenComparacion;
    }


    /**
     * Gets the valorComparable value for this ValorTO.
     * 
     * @return valorComparable
     */
    public java.lang.String getValorComparable() {
        return valorComparable;
    }


    /**
     * Sets the valorComparable value for this ValorTO.
     * 
     * @param valorComparable
     */
    public void setValorComparable(java.lang.String valorComparable) {
        this.valorComparable = valorComparable;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValorTO)) return false;
        ValorTO other = (ValorTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.ordenComparacion==null && other.getOrdenComparacion()==null) || 
             (this.ordenComparacion!=null &&
              this.ordenComparacion.equals(other.getOrdenComparacion()))) &&
            ((this.valorComparable==null && other.getValorComparable()==null) || 
             (this.valorComparable!=null &&
              this.valorComparable.equals(other.getValorComparable())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getOrdenComparacion() != null) {
            _hashCode += getOrdenComparacion().hashCode();
        }
        if (getValorComparable() != null) {
            _hashCode += getValorComparable().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValorTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "valorTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ordenComparacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ordenComparacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valorComparable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valorComparable"));
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
