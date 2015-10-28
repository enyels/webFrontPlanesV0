/**
 * CriteriosProductoTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class CriteriosProductoTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PaginacionTO paginacionTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO productoTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.SubGrupoTO subGrupoTO;

    private java.lang.String criterioEmision;

    private java.lang.String criterioTipoValor;

    private java.lang.String criterioSerie;

    private java.lang.String[] emisiones;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO[] tiposValor;

    private java.lang.String[] series;

    public CriteriosProductoTO() {
    }

    public CriteriosProductoTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PaginacionTO paginacionTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO productoTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.SubGrupoTO subGrupoTO,
           java.lang.String criterioEmision,
           java.lang.String criterioTipoValor,
           java.lang.String criterioSerie,
           java.lang.String[] emisiones,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO[] tiposValor,
           java.lang.String[] series) {
           this.paginacionTO = paginacionTO;
           this.productoTO = productoTO;
           this.subGrupoTO = subGrupoTO;
           this.criterioEmision = criterioEmision;
           this.criterioTipoValor = criterioTipoValor;
           this.criterioSerie = criterioSerie;
           this.emisiones = emisiones;
           this.tiposValor = tiposValor;
           this.series = series;
    }


    /**
     * Gets the paginacionTO value for this CriteriosProductoTO.
     * 
     * @return paginacionTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PaginacionTO getPaginacionTO() {
        return paginacionTO;
    }


    /**
     * Sets the paginacionTO value for this CriteriosProductoTO.
     * 
     * @param paginacionTO
     */
    public void setPaginacionTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PaginacionTO paginacionTO) {
        this.paginacionTO = paginacionTO;
    }


    /**
     * Gets the productoTO value for this CriteriosProductoTO.
     * 
     * @return productoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO getProductoTO() {
        return productoTO;
    }


    /**
     * Sets the productoTO value for this CriteriosProductoTO.
     * 
     * @param productoTO
     */
    public void setProductoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ProductoTO productoTO) {
        this.productoTO = productoTO;
    }


    /**
     * Gets the subGrupoTO value for this CriteriosProductoTO.
     * 
     * @return subGrupoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.SubGrupoTO getSubGrupoTO() {
        return subGrupoTO;
    }


    /**
     * Sets the subGrupoTO value for this CriteriosProductoTO.
     * 
     * @param subGrupoTO
     */
    public void setSubGrupoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.SubGrupoTO subGrupoTO) {
        this.subGrupoTO = subGrupoTO;
    }


    /**
     * Gets the criterioEmision value for this CriteriosProductoTO.
     * 
     * @return criterioEmision
     */
    public java.lang.String getCriterioEmision() {
        return criterioEmision;
    }


    /**
     * Sets the criterioEmision value for this CriteriosProductoTO.
     * 
     * @param criterioEmision
     */
    public void setCriterioEmision(java.lang.String criterioEmision) {
        this.criterioEmision = criterioEmision;
    }


    /**
     * Gets the criterioTipoValor value for this CriteriosProductoTO.
     * 
     * @return criterioTipoValor
     */
    public java.lang.String getCriterioTipoValor() {
        return criterioTipoValor;
    }


    /**
     * Sets the criterioTipoValor value for this CriteriosProductoTO.
     * 
     * @param criterioTipoValor
     */
    public void setCriterioTipoValor(java.lang.String criterioTipoValor) {
        this.criterioTipoValor = criterioTipoValor;
    }


    /**
     * Gets the criterioSerie value for this CriteriosProductoTO.
     * 
     * @return criterioSerie
     */
    public java.lang.String getCriterioSerie() {
        return criterioSerie;
    }


    /**
     * Sets the criterioSerie value for this CriteriosProductoTO.
     * 
     * @param criterioSerie
     */
    public void setCriterioSerie(java.lang.String criterioSerie) {
        this.criterioSerie = criterioSerie;
    }


    /**
     * Gets the emisiones value for this CriteriosProductoTO.
     * 
     * @return emisiones
     */
    public java.lang.String[] getEmisiones() {
        return emisiones;
    }


    /**
     * Sets the emisiones value for this CriteriosProductoTO.
     * 
     * @param emisiones
     */
    public void setEmisiones(java.lang.String[] emisiones) {
        this.emisiones = emisiones;
    }

    public java.lang.String getEmisiones(int i) {
        return this.emisiones[i];
    }

    public void setEmisiones(int i, java.lang.String _value) {
        this.emisiones[i] = _value;
    }


    /**
     * Gets the tiposValor value for this CriteriosProductoTO.
     * 
     * @return tiposValor
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO[] getTiposValor() {
        return tiposValor;
    }


    /**
     * Sets the tiposValor value for this CriteriosProductoTO.
     * 
     * @param tiposValor
     */
    public void setTiposValor(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO[] tiposValor) {
        this.tiposValor = tiposValor;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO getTiposValor(int i) {
        return this.tiposValor[i];
    }

    public void setTiposValor(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO _value) {
        this.tiposValor[i] = _value;
    }


    /**
     * Gets the series value for this CriteriosProductoTO.
     * 
     * @return series
     */
    public java.lang.String[] getSeries() {
        return series;
    }


    /**
     * Sets the series value for this CriteriosProductoTO.
     * 
     * @param series
     */
    public void setSeries(java.lang.String[] series) {
        this.series = series;
    }

    public java.lang.String getSeries(int i) {
        return this.series[i];
    }

    public void setSeries(int i, java.lang.String _value) {
        this.series[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriteriosProductoTO)) return false;
        CriteriosProductoTO other = (CriteriosProductoTO) obj;
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
            ((this.productoTO==null && other.getProductoTO()==null) || 
             (this.productoTO!=null &&
              this.productoTO.equals(other.getProductoTO()))) &&
            ((this.subGrupoTO==null && other.getSubGrupoTO()==null) || 
             (this.subGrupoTO!=null &&
              this.subGrupoTO.equals(other.getSubGrupoTO()))) &&
            ((this.criterioEmision==null && other.getCriterioEmision()==null) || 
             (this.criterioEmision!=null &&
              this.criterioEmision.equals(other.getCriterioEmision()))) &&
            ((this.criterioTipoValor==null && other.getCriterioTipoValor()==null) || 
             (this.criterioTipoValor!=null &&
              this.criterioTipoValor.equals(other.getCriterioTipoValor()))) &&
            ((this.criterioSerie==null && other.getCriterioSerie()==null) || 
             (this.criterioSerie!=null &&
              this.criterioSerie.equals(other.getCriterioSerie()))) &&
            ((this.emisiones==null && other.getEmisiones()==null) || 
             (this.emisiones!=null &&
              java.util.Arrays.equals(this.emisiones, other.getEmisiones()))) &&
            ((this.tiposValor==null && other.getTiposValor()==null) || 
             (this.tiposValor!=null &&
              java.util.Arrays.equals(this.tiposValor, other.getTiposValor()))) &&
            ((this.series==null && other.getSeries()==null) || 
             (this.series!=null &&
              java.util.Arrays.equals(this.series, other.getSeries())));
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
        if (getProductoTO() != null) {
            _hashCode += getProductoTO().hashCode();
        }
        if (getSubGrupoTO() != null) {
            _hashCode += getSubGrupoTO().hashCode();
        }
        if (getCriterioEmision() != null) {
            _hashCode += getCriterioEmision().hashCode();
        }
        if (getCriterioTipoValor() != null) {
            _hashCode += getCriterioTipoValor().hashCode();
        }
        if (getCriterioSerie() != null) {
            _hashCode += getCriterioSerie().hashCode();
        }
        if (getEmisiones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmisiones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmisiones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTiposValor() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTiposValor());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTiposValor(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSeries() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeries());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeries(), i);
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
        new org.apache.axis.description.TypeDesc(CriteriosProductoTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "criteriosProductoTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paginacionTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paginacionTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "paginacionTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "productoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subGrupoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subGrupoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "subGrupoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterioEmision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criterioEmision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterioTipoValor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criterioTipoValor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criterioSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criterioSerie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emisiones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emisiones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tiposValor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tiposValor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoValorTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("series");
        elemField.setXmlName(new javax.xml.namespace.QName("", "series"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
