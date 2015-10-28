/**
 * LimiteGlobalTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class LimiteGlobalTO  implements java.io.Serializable {
    private java.lang.Long id;

    private java.lang.Double porcentaje;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO[] agrupadores;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO perfilTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperacionTO tipoOperacionTO;

    public LimiteGlobalTO() {
    }

    public LimiteGlobalTO(
           java.lang.Long id,
           java.lang.Double porcentaje,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO[] agrupadores,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO perfilTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperacionTO tipoOperacionTO) {
           this.id = id;
           this.porcentaje = porcentaje;
           this.agrupadores = agrupadores;
           this.perfilTO = perfilTO;
           this.tipoOperacionTO = tipoOperacionTO;
    }


    /**
     * Gets the id value for this LimiteGlobalTO.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this LimiteGlobalTO.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the porcentaje value for this LimiteGlobalTO.
     * 
     * @return porcentaje
     */
    public java.lang.Double getPorcentaje() {
        return porcentaje;
    }


    /**
     * Sets the porcentaje value for this LimiteGlobalTO.
     * 
     * @param porcentaje
     */
    public void setPorcentaje(java.lang.Double porcentaje) {
        this.porcentaje = porcentaje;
    }


    /**
     * Gets the agrupadores value for this LimiteGlobalTO.
     * 
     * @return agrupadores
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO[] getAgrupadores() {
        return agrupadores;
    }


    /**
     * Sets the agrupadores value for this LimiteGlobalTO.
     * 
     * @param agrupadores
     */
    public void setAgrupadores(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO[] agrupadores) {
        this.agrupadores = agrupadores;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO getAgrupadores(int i) {
        return this.agrupadores[i];
    }

    public void setAgrupadores(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.AgrupadorTO _value) {
        this.agrupadores[i] = _value;
    }


    /**
     * Gets the perfilTO value for this LimiteGlobalTO.
     * 
     * @return perfilTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO getPerfilTO() {
        return perfilTO;
    }


    /**
     * Sets the perfilTO value for this LimiteGlobalTO.
     * 
     * @param perfilTO
     */
    public void setPerfilTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO perfilTO) {
        this.perfilTO = perfilTO;
    }


    /**
     * Gets the tipoOperacionTO value for this LimiteGlobalTO.
     * 
     * @return tipoOperacionTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperacionTO getTipoOperacionTO() {
        return tipoOperacionTO;
    }


    /**
     * Sets the tipoOperacionTO value for this LimiteGlobalTO.
     * 
     * @param tipoOperacionTO
     */
    public void setTipoOperacionTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperacionTO tipoOperacionTO) {
        this.tipoOperacionTO = tipoOperacionTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LimiteGlobalTO)) return false;
        LimiteGlobalTO other = (LimiteGlobalTO) obj;
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
            ((this.agrupadores==null && other.getAgrupadores()==null) || 
             (this.agrupadores!=null &&
              java.util.Arrays.equals(this.agrupadores, other.getAgrupadores()))) &&
            ((this.perfilTO==null && other.getPerfilTO()==null) || 
             (this.perfilTO!=null &&
              this.perfilTO.equals(other.getPerfilTO()))) &&
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
        if (getAgrupadores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAgrupadores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAgrupadores(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPerfilTO() != null) {
            _hashCode += getPerfilTO().hashCode();
        }
        if (getTipoOperacionTO() != null) {
            _hashCode += getTipoOperacionTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LimiteGlobalTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "limiteGlobalTO"));
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
        elemField.setFieldName("agrupadores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agrupadores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "agrupadorTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfilTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfilTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "perfilTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
