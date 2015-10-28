/**
 * ProductoTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class ProductoTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ComisionTO comisionTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EmisoraTO emisoraTO;

    private java.lang.Long id;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.IvaTO ivaTO;

    private java.lang.String nombre;

    private java.lang.Double precio;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.SerieTO serieTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO tipoValorTO;

    private java.lang.Boolean origenFix;

    private java.lang.Boolean origenA2K;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoMercadoTO tipoMercadoTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO estadoTO;

    private boolean excluirDeLimites;

    public ProductoTO() {
    }

    public ProductoTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ComisionTO comisionTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EmisoraTO emisoraTO,
           java.lang.Long id,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.IvaTO ivaTO,
           java.lang.String nombre,
           java.lang.Double precio,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.SerieTO serieTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO tipoValorTO,
           java.lang.Boolean origenFix,
           java.lang.Boolean origenA2K,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoMercadoTO tipoMercadoTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO estadoTO,
           boolean excluirDeLimites) {
           this.comisionTO = comisionTO;
           this.emisoraTO = emisoraTO;
           this.id = id;
           this.ivaTO = ivaTO;
           this.nombre = nombre;
           this.precio = precio;
           this.serieTO = serieTO;
           this.tipoValorTO = tipoValorTO;
           this.origenFix = origenFix;
           this.origenA2K = origenA2K;
           this.tipoMercadoTO = tipoMercadoTO;
           this.estadoTO = estadoTO;
           this.excluirDeLimites = excluirDeLimites;
    }


    /**
     * Gets the comisionTO value for this ProductoTO.
     * 
     * @return comisionTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ComisionTO getComisionTO() {
        return comisionTO;
    }


    /**
     * Sets the comisionTO value for this ProductoTO.
     * 
     * @param comisionTO
     */
    public void setComisionTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ComisionTO comisionTO) {
        this.comisionTO = comisionTO;
    }


    /**
     * Gets the emisoraTO value for this ProductoTO.
     * 
     * @return emisoraTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EmisoraTO getEmisoraTO() {
        return emisoraTO;
    }


    /**
     * Sets the emisoraTO value for this ProductoTO.
     * 
     * @param emisoraTO
     */
    public void setEmisoraTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EmisoraTO emisoraTO) {
        this.emisoraTO = emisoraTO;
    }


    /**
     * Gets the id value for this ProductoTO.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this ProductoTO.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the ivaTO value for this ProductoTO.
     * 
     * @return ivaTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.IvaTO getIvaTO() {
        return ivaTO;
    }


    /**
     * Sets the ivaTO value for this ProductoTO.
     * 
     * @param ivaTO
     */
    public void setIvaTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.IvaTO ivaTO) {
        this.ivaTO = ivaTO;
    }


    /**
     * Gets the nombre value for this ProductoTO.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this ProductoTO.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the precio value for this ProductoTO.
     * 
     * @return precio
     */
    public java.lang.Double getPrecio() {
        return precio;
    }


    /**
     * Sets the precio value for this ProductoTO.
     * 
     * @param precio
     */
    public void setPrecio(java.lang.Double precio) {
        this.precio = precio;
    }


    /**
     * Gets the serieTO value for this ProductoTO.
     * 
     * @return serieTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.SerieTO getSerieTO() {
        return serieTO;
    }


    /**
     * Sets the serieTO value for this ProductoTO.
     * 
     * @param serieTO
     */
    public void setSerieTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.SerieTO serieTO) {
        this.serieTO = serieTO;
    }


    /**
     * Gets the tipoValorTO value for this ProductoTO.
     * 
     * @return tipoValorTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO getTipoValorTO() {
        return tipoValorTO;
    }


    /**
     * Sets the tipoValorTO value for this ProductoTO.
     * 
     * @param tipoValorTO
     */
    public void setTipoValorTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoValorTO tipoValorTO) {
        this.tipoValorTO = tipoValorTO;
    }


    /**
     * Gets the origenFix value for this ProductoTO.
     * 
     * @return origenFix
     */
    public java.lang.Boolean getOrigenFix() {
        return origenFix;
    }


    /**
     * Sets the origenFix value for this ProductoTO.
     * 
     * @param origenFix
     */
    public void setOrigenFix(java.lang.Boolean origenFix) {
        this.origenFix = origenFix;
    }


    /**
     * Gets the origenA2K value for this ProductoTO.
     * 
     * @return origenA2K
     */
    public java.lang.Boolean getOrigenA2K() {
        return origenA2K;
    }


    /**
     * Sets the origenA2K value for this ProductoTO.
     * 
     * @param origenA2K
     */
    public void setOrigenA2K(java.lang.Boolean origenA2K) {
        this.origenA2K = origenA2K;
    }


    /**
     * Gets the tipoMercadoTO value for this ProductoTO.
     * 
     * @return tipoMercadoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoMercadoTO getTipoMercadoTO() {
        return tipoMercadoTO;
    }


    /**
     * Sets the tipoMercadoTO value for this ProductoTO.
     * 
     * @param tipoMercadoTO
     */
    public void setTipoMercadoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoMercadoTO tipoMercadoTO) {
        this.tipoMercadoTO = tipoMercadoTO;
    }


    /**
     * Gets the estadoTO value for this ProductoTO.
     * 
     * @return estadoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO getEstadoTO() {
        return estadoTO;
    }


    /**
     * Sets the estadoTO value for this ProductoTO.
     * 
     * @param estadoTO
     */
    public void setEstadoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO estadoTO) {
        this.estadoTO = estadoTO;
    }


    /**
     * Gets the excluirDeLimites value for this ProductoTO.
     * 
     * @return excluirDeLimites
     */
    public boolean isExcluirDeLimites() {
        return excluirDeLimites;
    }


    /**
     * Sets the excluirDeLimites value for this ProductoTO.
     * 
     * @param excluirDeLimites
     */
    public void setExcluirDeLimites(boolean excluirDeLimites) {
        this.excluirDeLimites = excluirDeLimites;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductoTO)) return false;
        ProductoTO other = (ProductoTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.comisionTO==null && other.getComisionTO()==null) || 
             (this.comisionTO!=null &&
              this.comisionTO.equals(other.getComisionTO()))) &&
            ((this.emisoraTO==null && other.getEmisoraTO()==null) || 
             (this.emisoraTO!=null &&
              this.emisoraTO.equals(other.getEmisoraTO()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.ivaTO==null && other.getIvaTO()==null) || 
             (this.ivaTO!=null &&
              this.ivaTO.equals(other.getIvaTO()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.precio==null && other.getPrecio()==null) || 
             (this.precio!=null &&
              this.precio.equals(other.getPrecio()))) &&
            ((this.serieTO==null && other.getSerieTO()==null) || 
             (this.serieTO!=null &&
              this.serieTO.equals(other.getSerieTO()))) &&
            ((this.tipoValorTO==null && other.getTipoValorTO()==null) || 
             (this.tipoValorTO!=null &&
              this.tipoValorTO.equals(other.getTipoValorTO()))) &&
            ((this.origenFix==null && other.getOrigenFix()==null) || 
             (this.origenFix!=null &&
              this.origenFix.equals(other.getOrigenFix()))) &&
            ((this.origenA2K==null && other.getOrigenA2K()==null) || 
             (this.origenA2K!=null &&
              this.origenA2K.equals(other.getOrigenA2K()))) &&
            ((this.tipoMercadoTO==null && other.getTipoMercadoTO()==null) || 
             (this.tipoMercadoTO!=null &&
              this.tipoMercadoTO.equals(other.getTipoMercadoTO()))) &&
            ((this.estadoTO==null && other.getEstadoTO()==null) || 
             (this.estadoTO!=null &&
              this.estadoTO.equals(other.getEstadoTO()))) &&
            this.excluirDeLimites == other.isExcluirDeLimites();
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
        if (getComisionTO() != null) {
            _hashCode += getComisionTO().hashCode();
        }
        if (getEmisoraTO() != null) {
            _hashCode += getEmisoraTO().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getIvaTO() != null) {
            _hashCode += getIvaTO().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getPrecio() != null) {
            _hashCode += getPrecio().hashCode();
        }
        if (getSerieTO() != null) {
            _hashCode += getSerieTO().hashCode();
        }
        if (getTipoValorTO() != null) {
            _hashCode += getTipoValorTO().hashCode();
        }
        if (getOrigenFix() != null) {
            _hashCode += getOrigenFix().hashCode();
        }
        if (getOrigenA2K() != null) {
            _hashCode += getOrigenA2K().hashCode();
        }
        if (getTipoMercadoTO() != null) {
            _hashCode += getTipoMercadoTO().hashCode();
        }
        if (getEstadoTO() != null) {
            _hashCode += getEstadoTO().hashCode();
        }
        _hashCode += (isExcluirDeLimites() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductoTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "productoTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comisionTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comisionTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "comisionTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emisoraTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emisoraTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "emisoraTO"));
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
        elemField.setFieldName("ivaTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ivaTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "ivaTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "precio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serieTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serieTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "serieTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoValorTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoValorTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoValorTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origenFix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origenFix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origenA2K");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origenA2K"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoMercadoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoMercadoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoMercadoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estadoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excluirDeLimites");
        elemField.setXmlName(new javax.xml.namespace.QName("", "excluirDeLimites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
