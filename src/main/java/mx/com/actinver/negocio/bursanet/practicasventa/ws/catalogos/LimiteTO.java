/**
 * LimiteTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class LimiteTO  implements java.io.Serializable {
    private java.lang.Long id;

    private java.lang.Double porcentaje;

    private java.lang.Double monto;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO perfilTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO subGrupoTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.LimiteProductoTO[] limitesProducto;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperacionTO tipoOperacionTO;

    public LimiteTO() {
    }

    public LimiteTO(
           java.lang.Long id,
           java.lang.Double porcentaje,
           java.lang.Double monto,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO perfilTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO subGrupoTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.LimiteProductoTO[] limitesProducto,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperacionTO tipoOperacionTO) {
           this.id = id;
           this.porcentaje = porcentaje;
           this.monto = monto;
           this.perfilTO = perfilTO;
           this.subGrupoTO = subGrupoTO;
           this.limitesProducto = limitesProducto;
           this.tipoOperacionTO = tipoOperacionTO;
    }


    /**
     * Gets the id value for this LimiteTO.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this LimiteTO.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the porcentaje value for this LimiteTO.
     * 
     * @return porcentaje
     */
    public java.lang.Double getPorcentaje() {
        return porcentaje;
    }


    /**
     * Sets the porcentaje value for this LimiteTO.
     * 
     * @param porcentaje
     */
    public void setPorcentaje(java.lang.Double porcentaje) {
        this.porcentaje = porcentaje;
    }


    /**
     * Gets the monto value for this LimiteTO.
     * 
     * @return monto
     */
    public java.lang.Double getMonto() {
        return monto;
    }


    /**
     * Sets the monto value for this LimiteTO.
     * 
     * @param monto
     */
    public void setMonto(java.lang.Double monto) {
        this.monto = monto;
    }


    /**
     * Gets the perfilTO value for this LimiteTO.
     * 
     * @return perfilTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO getPerfilTO() {
        return perfilTO;
    }


    /**
     * Sets the perfilTO value for this LimiteTO.
     * 
     * @param perfilTO
     */
    public void setPerfilTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO perfilTO) {
        this.perfilTO = perfilTO;
    }


    /**
     * Gets the subGrupoTO value for this LimiteTO.
     * 
     * @return subGrupoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO getSubGrupoTO() {
        return subGrupoTO;
    }


    /**
     * Sets the subGrupoTO value for this LimiteTO.
     * 
     * @param subGrupoTO
     */
    public void setSubGrupoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO subGrupoTO) {
        this.subGrupoTO = subGrupoTO;
    }


    /**
     * Gets the limitesProducto value for this LimiteTO.
     * 
     * @return limitesProducto
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.LimiteProductoTO[] getLimitesProducto() {
        return limitesProducto;
    }


    /**
     * Sets the limitesProducto value for this LimiteTO.
     * 
     * @param limitesProducto
     */
    public void setLimitesProducto(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.LimiteProductoTO[] limitesProducto) {
        this.limitesProducto = limitesProducto;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.LimiteProductoTO getLimitesProducto(int i) {
        return this.limitesProducto[i];
    }

    public void setLimitesProducto(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.LimiteProductoTO _value) {
        this.limitesProducto[i] = _value;
    }


    /**
     * Gets the tipoOperacionTO value for this LimiteTO.
     * 
     * @return tipoOperacionTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperacionTO getTipoOperacionTO() {
        return tipoOperacionTO;
    }


    /**
     * Sets the tipoOperacionTO value for this LimiteTO.
     * 
     * @param tipoOperacionTO
     */
    public void setTipoOperacionTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperacionTO tipoOperacionTO) {
        this.tipoOperacionTO = tipoOperacionTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LimiteTO)) return false;
        LimiteTO other = (LimiteTO) obj;
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
            ((this.porcentaje==null && other.getPorcentaje()==null) || 
             (this.porcentaje!=null &&
              this.porcentaje.equals(other.getPorcentaje()))) &&
            ((this.monto==null && other.getMonto()==null) || 
             (this.monto!=null &&
              this.monto.equals(other.getMonto()))) &&
            ((this.perfilTO==null && other.getPerfilTO()==null) || 
             (this.perfilTO!=null &&
              this.perfilTO.equals(other.getPerfilTO()))) &&
            ((this.subGrupoTO==null && other.getSubGrupoTO()==null) || 
             (this.subGrupoTO!=null &&
              this.subGrupoTO.equals(other.getSubGrupoTO()))) &&
            ((this.limitesProducto==null && other.getLimitesProducto()==null) || 
             (this.limitesProducto!=null &&
              java.util.Arrays.equals(this.limitesProducto, other.getLimitesProducto()))) &&
            ((this.tipoOperacionTO==null && other.getTipoOperacionTO()==null) || 
             (this.tipoOperacionTO!=null &&
              this.tipoOperacionTO.equals(other.getTipoOperacionTO())));
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
        if (getPorcentaje() != null) {
            _hashCode += getPorcentaje().hashCode();
        }
        if (getMonto() != null) {
            _hashCode += getMonto().hashCode();
        }
        if (getPerfilTO() != null) {
            _hashCode += getPerfilTO().hashCode();
        }
        if (getSubGrupoTO() != null) {
            _hashCode += getSubGrupoTO().hashCode();
        }
        if (getLimitesProducto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLimitesProducto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLimitesProducto(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTipoOperacionTO() != null) {
            _hashCode += getTipoOperacionTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LimiteTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "limiteTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("perfilTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfilTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "perfilTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGrupoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subGrupoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "subGrupoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limitesProducto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limitesProducto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "limiteProductoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoOperacionTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoOperacionTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoOperacionTO"));
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
