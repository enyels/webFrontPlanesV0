/**
 * FacultadTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class FacultadTO  extends mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ModuloTO[] modulos;

    private java.lang.Boolean activa;

    private java.lang.Boolean esAutorizable;

    private java.lang.Long idProcesoLimita;

    public FacultadTO() {
    }

    public FacultadTO(
           java.lang.String descripcion,
           java.lang.Long id,
           java.lang.String nombre,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ModuloTO[] modulos,
           java.lang.Boolean activa,
           java.lang.Boolean esAutorizable,
           java.lang.Long idProcesoLimita) {
        super(
            descripcion,
            id,
            nombre);
        this.modulos = modulos;
        this.activa = activa;
        this.esAutorizable = esAutorizable;
        this.idProcesoLimita = idProcesoLimita;
    }


    /**
     * Gets the modulos value for this FacultadTO.
     * 
     * @return modulos
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ModuloTO[] getModulos() {
        return modulos;
    }


    /**
     * Sets the modulos value for this FacultadTO.
     * 
     * @param modulos
     */
    public void setModulos(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ModuloTO[] modulos) {
        this.modulos = modulos;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ModuloTO getModulos(int i) {
        return this.modulos[i];
    }

    public void setModulos(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ModuloTO _value) {
        this.modulos[i] = _value;
    }


    /**
     * Gets the activa value for this FacultadTO.
     * 
     * @return activa
     */
    public java.lang.Boolean getActiva() {
        return activa;
    }


    /**
     * Sets the activa value for this FacultadTO.
     * 
     * @param activa
     */
    public void setActiva(java.lang.Boolean activa) {
        this.activa = activa;
    }


    /**
     * Gets the esAutorizable value for this FacultadTO.
     * 
     * @return esAutorizable
     */
    public java.lang.Boolean getEsAutorizable() {
        return esAutorizable;
    }


    /**
     * Sets the esAutorizable value for this FacultadTO.
     * 
     * @param esAutorizable
     */
    public void setEsAutorizable(java.lang.Boolean esAutorizable) {
        this.esAutorizable = esAutorizable;
    }


    /**
     * Gets the idProcesoLimita value for this FacultadTO.
     * 
     * @return idProcesoLimita
     */
    public java.lang.Long getIdProcesoLimita() {
        return idProcesoLimita;
    }


    /**
     * Sets the idProcesoLimita value for this FacultadTO.
     * 
     * @param idProcesoLimita
     */
    public void setIdProcesoLimita(java.lang.Long idProcesoLimita) {
        this.idProcesoLimita = idProcesoLimita;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FacultadTO)) return false;
        FacultadTO other = (FacultadTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.modulos==null && other.getModulos()==null) || 
             (this.modulos!=null &&
              java.util.Arrays.equals(this.modulos, other.getModulos()))) &&
            ((this.activa==null && other.getActiva()==null) || 
             (this.activa!=null &&
              this.activa.equals(other.getActiva()))) &&
            ((this.esAutorizable==null && other.getEsAutorizable()==null) || 
             (this.esAutorizable!=null &&
              this.esAutorizable.equals(other.getEsAutorizable()))) &&
            ((this.idProcesoLimita==null && other.getIdProcesoLimita()==null) || 
             (this.idProcesoLimita!=null &&
              this.idProcesoLimita.equals(other.getIdProcesoLimita())));
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
        if (getModulos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getModulos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getModulos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getActiva() != null) {
            _hashCode += getActiva().hashCode();
        }
        if (getEsAutorizable() != null) {
            _hashCode += getEsAutorizable().hashCode();
        }
        if (getIdProcesoLimita() != null) {
            _hashCode += getIdProcesoLimita().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FacultadTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "facultadTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "modulos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "moduloTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("activa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "activa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esAutorizable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esAutorizable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idProcesoLimita");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idProcesoLimita"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
