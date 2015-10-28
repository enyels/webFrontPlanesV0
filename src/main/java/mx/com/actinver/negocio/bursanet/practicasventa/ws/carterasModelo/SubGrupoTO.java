/**
 * SubGrupoTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class SubGrupoTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.AgrupadorTO agrupadorTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CaracteristicaTO[] caracteristicas;

    private java.lang.String hashCaracteristicas;

    private java.lang.Long id;

    private java.lang.String nombre;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO[] tiposValorTO;

    private java.lang.Boolean editable;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteTO[] limitePerfiles;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO[] productos;

    public SubGrupoTO() {
    }

    public SubGrupoTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.AgrupadorTO agrupadorTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CaracteristicaTO[] caracteristicas,
           java.lang.String hashCaracteristicas,
           java.lang.Long id,
           java.lang.String nombre,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO[] tiposValorTO,
           java.lang.Boolean editable,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteTO[] limitePerfiles,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO[] productos) {
           this.agrupadorTO = agrupadorTO;
           this.caracteristicas = caracteristicas;
           this.hashCaracteristicas = hashCaracteristicas;
           this.id = id;
           this.nombre = nombre;
           this.tiposValorTO = tiposValorTO;
           this.editable = editable;
           this.limitePerfiles = limitePerfiles;
           this.productos = productos;
    }


    /**
     * Gets the agrupadorTO value for this SubGrupoTO.
     * 
     * @return agrupadorTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.AgrupadorTO getAgrupadorTO() {
        return agrupadorTO;
    }


    /**
     * Sets the agrupadorTO value for this SubGrupoTO.
     * 
     * @param agrupadorTO
     */
    public void setAgrupadorTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.AgrupadorTO agrupadorTO) {
        this.agrupadorTO = agrupadorTO;
    }


    /**
     * Gets the caracteristicas value for this SubGrupoTO.
     * 
     * @return caracteristicas
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CaracteristicaTO[] getCaracteristicas() {
        return caracteristicas;
    }


    /**
     * Sets the caracteristicas value for this SubGrupoTO.
     * 
     * @param caracteristicas
     */
    public void setCaracteristicas(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CaracteristicaTO[] caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CaracteristicaTO getCaracteristicas(int i) {
        return this.caracteristicas[i];
    }

    public void setCaracteristicas(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CaracteristicaTO _value) {
        this.caracteristicas[i] = _value;
    }


    /**
     * Gets the hashCaracteristicas value for this SubGrupoTO.
     * 
     * @return hashCaracteristicas
     */
    public java.lang.String getHashCaracteristicas() {
        return hashCaracteristicas;
    }


    /**
     * Sets the hashCaracteristicas value for this SubGrupoTO.
     * 
     * @param hashCaracteristicas
     */
    public void setHashCaracteristicas(java.lang.String hashCaracteristicas) {
        this.hashCaracteristicas = hashCaracteristicas;
    }


    /**
     * Gets the id value for this SubGrupoTO.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this SubGrupoTO.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the nombre value for this SubGrupoTO.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this SubGrupoTO.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the tiposValorTO value for this SubGrupoTO.
     * 
     * @return tiposValorTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO[] getTiposValorTO() {
        return tiposValorTO;
    }


    /**
     * Sets the tiposValorTO value for this SubGrupoTO.
     * 
     * @param tiposValorTO
     */
    public void setTiposValorTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO[] tiposValorTO) {
        this.tiposValorTO = tiposValorTO;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO getTiposValorTO(int i) {
        return this.tiposValorTO[i];
    }

    public void setTiposValorTO(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO _value) {
        this.tiposValorTO[i] = _value;
    }


    /**
     * Gets the editable value for this SubGrupoTO.
     * 
     * @return editable
     */
    public java.lang.Boolean getEditable() {
        return editable;
    }


    /**
     * Sets the editable value for this SubGrupoTO.
     * 
     * @param editable
     */
    public void setEditable(java.lang.Boolean editable) {
        this.editable = editable;
    }


    /**
     * Gets the limitePerfiles value for this SubGrupoTO.
     * 
     * @return limitePerfiles
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteTO[] getLimitePerfiles() {
        return limitePerfiles;
    }


    /**
     * Sets the limitePerfiles value for this SubGrupoTO.
     * 
     * @param limitePerfiles
     */
    public void setLimitePerfiles(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteTO[] limitePerfiles) {
        this.limitePerfiles = limitePerfiles;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteTO getLimitePerfiles(int i) {
        return this.limitePerfiles[i];
    }

    public void setLimitePerfiles(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteTO _value) {
        this.limitePerfiles[i] = _value;
    }


    /**
     * Gets the productos value for this SubGrupoTO.
     * 
     * @return productos
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO[] getProductos() {
        return productos;
    }


    /**
     * Sets the productos value for this SubGrupoTO.
     * 
     * @param productos
     */
    public void setProductos(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO[] productos) {
        this.productos = productos;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO getProductos(int i) {
        return this.productos[i];
    }

    public void setProductos(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO _value) {
        this.productos[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SubGrupoTO)) return false;
        SubGrupoTO other = (SubGrupoTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.agrupadorTO==null && other.getAgrupadorTO()==null) || 
             (this.agrupadorTO!=null &&
              this.agrupadorTO.equals(other.getAgrupadorTO()))) &&
            ((this.caracteristicas==null && other.getCaracteristicas()==null) || 
             (this.caracteristicas!=null &&
              java.util.Arrays.equals(this.caracteristicas, other.getCaracteristicas()))) &&
            ((this.hashCaracteristicas==null && other.getHashCaracteristicas()==null) || 
             (this.hashCaracteristicas!=null &&
              this.hashCaracteristicas.equals(other.getHashCaracteristicas()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.tiposValorTO==null && other.getTiposValorTO()==null) || 
             (this.tiposValorTO!=null &&
              java.util.Arrays.equals(this.tiposValorTO, other.getTiposValorTO()))) &&
            ((this.editable==null && other.getEditable()==null) || 
             (this.editable!=null &&
              this.editable.equals(other.getEditable()))) &&
            ((this.limitePerfiles==null && other.getLimitePerfiles()==null) || 
             (this.limitePerfiles!=null &&
              java.util.Arrays.equals(this.limitePerfiles, other.getLimitePerfiles()))) &&
            ((this.productos==null && other.getProductos()==null) || 
             (this.productos!=null &&
              java.util.Arrays.equals(this.productos, other.getProductos())));
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
        if (getAgrupadorTO() != null) {
            _hashCode += getAgrupadorTO().hashCode();
        }
        if (getCaracteristicas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCaracteristicas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCaracteristicas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHashCaracteristicas() != null) {
            _hashCode += getHashCaracteristicas().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getTiposValorTO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTiposValorTO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTiposValorTO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEditable() != null) {
            _hashCode += getEditable().hashCode();
        }
        if (getLimitePerfiles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLimitePerfiles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLimitePerfiles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getProductos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubGrupoTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "subGrupoTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agrupadorTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agrupadorTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "agrupadorTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caracteristicas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caracteristicas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "caracteristicaTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hashCaracteristicas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "hashCaracteristicas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tiposValorTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tiposValorTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoValorTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editable");
        elemField.setXmlName(new javax.xml.namespace.QName("", "editable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitePerfiles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limitePerfiles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "limiteTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "productoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
