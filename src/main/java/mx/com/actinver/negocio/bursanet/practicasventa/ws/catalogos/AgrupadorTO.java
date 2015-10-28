/**
 * AgrupadorTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class AgrupadorTO  extends mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO estado;

    private java.lang.Boolean participaLimiteGlobal;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO[] subGrupos;

    private java.lang.Double limiteGlobal;

    public AgrupadorTO() {
    }

    public AgrupadorTO(
           java.lang.String descripcion,
           java.lang.Long id,
           java.lang.String nombre,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO estado,
           java.lang.Boolean participaLimiteGlobal,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO[] subGrupos,
           java.lang.Double limiteGlobal) {
        super(
            descripcion,
            id,
            nombre);
        this.estado = estado;
        this.participaLimiteGlobal = participaLimiteGlobal;
        this.subGrupos = subGrupos;
        this.limiteGlobal = limiteGlobal;
    }


    /**
     * Gets the estado value for this AgrupadorTO.
     * 
     * @return estado
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this AgrupadorTO.
     * 
     * @param estado
     */
    public void setEstado(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO estado) {
        this.estado = estado;
    }


    /**
     * Gets the participaLimiteGlobal value for this AgrupadorTO.
     * 
     * @return participaLimiteGlobal
     */
    public java.lang.Boolean getParticipaLimiteGlobal() {
        return participaLimiteGlobal;
    }


    /**
     * Sets the participaLimiteGlobal value for this AgrupadorTO.
     * 
     * @param participaLimiteGlobal
     */
    public void setParticipaLimiteGlobal(java.lang.Boolean participaLimiteGlobal) {
        this.participaLimiteGlobal = participaLimiteGlobal;
    }


    /**
     * Gets the subGrupos value for this AgrupadorTO.
     * 
     * @return subGrupos
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO[] getSubGrupos() {
        return subGrupos;
    }


    /**
     * Sets the subGrupos value for this AgrupadorTO.
     * 
     * @param subGrupos
     */
    public void setSubGrupos(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO[] subGrupos) {
        this.subGrupos = subGrupos;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO getSubGrupos(int i) {
        return this.subGrupos[i];
    }

    public void setSubGrupos(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.SubGrupoTO _value) {
        this.subGrupos[i] = _value;
    }


    /**
     * Gets the limiteGlobal value for this AgrupadorTO.
     * 
     * @return limiteGlobal
     */
    public java.lang.Double getLimiteGlobal() {
        return limiteGlobal;
    }


    /**
     * Sets the limiteGlobal value for this AgrupadorTO.
     * 
     * @param limiteGlobal
     */
    public void setLimiteGlobal(java.lang.Double limiteGlobal) {
        this.limiteGlobal = limiteGlobal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AgrupadorTO)) return false;
        AgrupadorTO other = (AgrupadorTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.participaLimiteGlobal==null && other.getParticipaLimiteGlobal()==null) || 
             (this.participaLimiteGlobal!=null &&
              this.participaLimiteGlobal.equals(other.getParticipaLimiteGlobal()))) &&
            ((this.subGrupos==null && other.getSubGrupos()==null) || 
             (this.subGrupos!=null &&
              java.util.Arrays.equals(this.subGrupos, other.getSubGrupos()))) &&
            ((this.limiteGlobal==null && other.getLimiteGlobal()==null) || 
             (this.limiteGlobal!=null &&
              this.limiteGlobal.equals(other.getLimiteGlobal())));
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
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getParticipaLimiteGlobal() != null) {
            _hashCode += getParticipaLimiteGlobal().hashCode();
        }
        if (getSubGrupos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubGrupos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubGrupos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLimiteGlobal() != null) {
            _hashCode += getLimiteGlobal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AgrupadorTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "agrupadorTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estadoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("participaLimiteGlobal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "participaLimiteGlobal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGrupos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subGrupos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "subGrupoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limiteGlobal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limiteGlobal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
