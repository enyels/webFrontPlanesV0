/**
 * TipoServicioTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class TipoServicioTO  implements java.io.Serializable {
    private java.lang.String descripcion;

    private java.lang.Boolean esSubservicio;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO estado;

    private java.lang.Long idTipoServicio;

    private java.lang.Long idTipoServicioPadre;

    private java.lang.String nombre;

    private java.lang.Boolean requiereCuestionario;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO[] subServicios;

    public TipoServicioTO() {
    }

    public TipoServicioTO(
           java.lang.String descripcion,
           java.lang.Boolean esSubservicio,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO estado,
           java.lang.Long idTipoServicio,
           java.lang.Long idTipoServicioPadre,
           java.lang.String nombre,
           java.lang.Boolean requiereCuestionario,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO[] subServicios) {
           this.descripcion = descripcion;
           this.esSubservicio = esSubservicio;
           this.estado = estado;
           this.idTipoServicio = idTipoServicio;
           this.idTipoServicioPadre = idTipoServicioPadre;
           this.nombre = nombre;
           this.requiereCuestionario = requiereCuestionario;
           this.subServicios = subServicios;
    }


    /**
     * Gets the descripcion value for this TipoServicioTO.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this TipoServicioTO.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the esSubservicio value for this TipoServicioTO.
     * 
     * @return esSubservicio
     */
    public java.lang.Boolean getEsSubservicio() {
        return esSubservicio;
    }


    /**
     * Sets the esSubservicio value for this TipoServicioTO.
     * 
     * @param esSubservicio
     */
    public void setEsSubservicio(java.lang.Boolean esSubservicio) {
        this.esSubservicio = esSubservicio;
    }


    /**
     * Gets the estado value for this TipoServicioTO.
     * 
     * @return estado
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO getEstado() {
        return estado;
    }


    /**
     * Sets the estado value for this TipoServicioTO.
     * 
     * @param estado
     */
    public void setEstado(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO estado) {
        this.estado = estado;
    }


    /**
     * Gets the idTipoServicio value for this TipoServicioTO.
     * 
     * @return idTipoServicio
     */
    public java.lang.Long getIdTipoServicio() {
        return idTipoServicio;
    }


    /**
     * Sets the idTipoServicio value for this TipoServicioTO.
     * 
     * @param idTipoServicio
     */
    public void setIdTipoServicio(java.lang.Long idTipoServicio) {
        this.idTipoServicio = idTipoServicio;
    }


    /**
     * Gets the idTipoServicioPadre value for this TipoServicioTO.
     * 
     * @return idTipoServicioPadre
     */
    public java.lang.Long getIdTipoServicioPadre() {
        return idTipoServicioPadre;
    }


    /**
     * Sets the idTipoServicioPadre value for this TipoServicioTO.
     * 
     * @param idTipoServicioPadre
     */
    public void setIdTipoServicioPadre(java.lang.Long idTipoServicioPadre) {
        this.idTipoServicioPadre = idTipoServicioPadre;
    }


    /**
     * Gets the nombre value for this TipoServicioTO.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this TipoServicioTO.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the requiereCuestionario value for this TipoServicioTO.
     * 
     * @return requiereCuestionario
     */
    public java.lang.Boolean getRequiereCuestionario() {
        return requiereCuestionario;
    }


    /**
     * Sets the requiereCuestionario value for this TipoServicioTO.
     * 
     * @param requiereCuestionario
     */
    public void setRequiereCuestionario(java.lang.Boolean requiereCuestionario) {
        this.requiereCuestionario = requiereCuestionario;
    }


    /**
     * Gets the subServicios value for this TipoServicioTO.
     * 
     * @return subServicios
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO[] getSubServicios() {
        return subServicios;
    }


    /**
     * Sets the subServicios value for this TipoServicioTO.
     * 
     * @param subServicios
     */
    public void setSubServicios(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO[] subServicios) {
        this.subServicios = subServicios;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO getSubServicios(int i) {
        return this.subServicios[i];
    }

    public void setSubServicios(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO _value) {
        this.subServicios[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TipoServicioTO)) return false;
        TipoServicioTO other = (TipoServicioTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion()))) &&
            ((this.esSubservicio==null && other.getEsSubservicio()==null) || 
             (this.esSubservicio!=null &&
              this.esSubservicio.equals(other.getEsSubservicio()))) &&
            ((this.estado==null && other.getEstado()==null) || 
             (this.estado!=null &&
              this.estado.equals(other.getEstado()))) &&
            ((this.idTipoServicio==null && other.getIdTipoServicio()==null) || 
             (this.idTipoServicio!=null &&
              this.idTipoServicio.equals(other.getIdTipoServicio()))) &&
            ((this.idTipoServicioPadre==null && other.getIdTipoServicioPadre()==null) || 
             (this.idTipoServicioPadre!=null &&
              this.idTipoServicioPadre.equals(other.getIdTipoServicioPadre()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.requiereCuestionario==null && other.getRequiereCuestionario()==null) || 
             (this.requiereCuestionario!=null &&
              this.requiereCuestionario.equals(other.getRequiereCuestionario()))) &&
            ((this.subServicios==null && other.getSubServicios()==null) || 
             (this.subServicios!=null &&
              java.util.Arrays.equals(this.subServicios, other.getSubServicios())));
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
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        if (getEsSubservicio() != null) {
            _hashCode += getEsSubservicio().hashCode();
        }
        if (getEstado() != null) {
            _hashCode += getEstado().hashCode();
        }
        if (getIdTipoServicio() != null) {
            _hashCode += getIdTipoServicio().hashCode();
        }
        if (getIdTipoServicioPadre() != null) {
            _hashCode += getIdTipoServicioPadre().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getRequiereCuestionario() != null) {
            _hashCode += getRequiereCuestionario().hashCode();
        }
        if (getSubServicios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSubServicios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSubServicios(), i);
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
        new org.apache.axis.description.TypeDesc(TipoServicioTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoServicioTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esSubservicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esSubservicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estado");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estado"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estadoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idTipoServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoServicioPadre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idTipoServicioPadre"));
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
        elemField.setFieldName("requiereCuestionario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "requiereCuestionario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subServicios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subServicios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoServicioTO"));
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
