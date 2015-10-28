/**
 * TelefonoTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class TelefonoTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOrigenTO tipoOrigenTO;

    private java.lang.Integer consecutivo;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoTelefonoTO tipoTelefonoTO;

    private java.lang.String codigoArea;

    private java.lang.String lada;

    private java.lang.String telefono;

    private java.lang.String extension;

    public TelefonoTO() {
    }

    public TelefonoTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOrigenTO tipoOrigenTO,
           java.lang.Integer consecutivo,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoTelefonoTO tipoTelefonoTO,
           java.lang.String codigoArea,
           java.lang.String lada,
           java.lang.String telefono,
           java.lang.String extension) {
           this.tipoOrigenTO = tipoOrigenTO;
           this.consecutivo = consecutivo;
           this.tipoTelefonoTO = tipoTelefonoTO;
           this.codigoArea = codigoArea;
           this.lada = lada;
           this.telefono = telefono;
           this.extension = extension;
    }


    /**
     * Gets the tipoOrigenTO value for this TelefonoTO.
     * 
     * @return tipoOrigenTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOrigenTO getTipoOrigenTO() {
        return tipoOrigenTO;
    }


    /**
     * Sets the tipoOrigenTO value for this TelefonoTO.
     * 
     * @param tipoOrigenTO
     */
    public void setTipoOrigenTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOrigenTO tipoOrigenTO) {
        this.tipoOrigenTO = tipoOrigenTO;
    }


    /**
     * Gets the consecutivo value for this TelefonoTO.
     * 
     * @return consecutivo
     */
    public java.lang.Integer getConsecutivo() {
        return consecutivo;
    }


    /**
     * Sets the consecutivo value for this TelefonoTO.
     * 
     * @param consecutivo
     */
    public void setConsecutivo(java.lang.Integer consecutivo) {
        this.consecutivo = consecutivo;
    }


    /**
     * Gets the tipoTelefonoTO value for this TelefonoTO.
     * 
     * @return tipoTelefonoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoTelefonoTO getTipoTelefonoTO() {
        return tipoTelefonoTO;
    }


    /**
     * Sets the tipoTelefonoTO value for this TelefonoTO.
     * 
     * @param tipoTelefonoTO
     */
    public void setTipoTelefonoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoTelefonoTO tipoTelefonoTO) {
        this.tipoTelefonoTO = tipoTelefonoTO;
    }


    /**
     * Gets the codigoArea value for this TelefonoTO.
     * 
     * @return codigoArea
     */
    public java.lang.String getCodigoArea() {
        return codigoArea;
    }


    /**
     * Sets the codigoArea value for this TelefonoTO.
     * 
     * @param codigoArea
     */
    public void setCodigoArea(java.lang.String codigoArea) {
        this.codigoArea = codigoArea;
    }


    /**
     * Gets the lada value for this TelefonoTO.
     * 
     * @return lada
     */
    public java.lang.String getLada() {
        return lada;
    }


    /**
     * Sets the lada value for this TelefonoTO.
     * 
     * @param lada
     */
    public void setLada(java.lang.String lada) {
        this.lada = lada;
    }


    /**
     * Gets the telefono value for this TelefonoTO.
     * 
     * @return telefono
     */
    public java.lang.String getTelefono() {
        return telefono;
    }


    /**
     * Sets the telefono value for this TelefonoTO.
     * 
     * @param telefono
     */
    public void setTelefono(java.lang.String telefono) {
        this.telefono = telefono;
    }


    /**
     * Gets the extension value for this TelefonoTO.
     * 
     * @return extension
     */
    public java.lang.String getExtension() {
        return extension;
    }


    /**
     * Sets the extension value for this TelefonoTO.
     * 
     * @param extension
     */
    public void setExtension(java.lang.String extension) {
        this.extension = extension;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TelefonoTO)) return false;
        TelefonoTO other = (TelefonoTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipoOrigenTO==null && other.getTipoOrigenTO()==null) || 
             (this.tipoOrigenTO!=null &&
              this.tipoOrigenTO.equals(other.getTipoOrigenTO()))) &&
            ((this.consecutivo==null && other.getConsecutivo()==null) || 
             (this.consecutivo!=null &&
              this.consecutivo.equals(other.getConsecutivo()))) &&
            ((this.tipoTelefonoTO==null && other.getTipoTelefonoTO()==null) || 
             (this.tipoTelefonoTO!=null &&
              this.tipoTelefonoTO.equals(other.getTipoTelefonoTO()))) &&
            ((this.codigoArea==null && other.getCodigoArea()==null) || 
             (this.codigoArea!=null &&
              this.codigoArea.equals(other.getCodigoArea()))) &&
            ((this.lada==null && other.getLada()==null) || 
             (this.lada!=null &&
              this.lada.equals(other.getLada()))) &&
            ((this.telefono==null && other.getTelefono()==null) || 
             (this.telefono!=null &&
              this.telefono.equals(other.getTelefono()))) &&
            ((this.extension==null && other.getExtension()==null) || 
             (this.extension!=null &&
              this.extension.equals(other.getExtension())));
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
        if (getTipoOrigenTO() != null) {
            _hashCode += getTipoOrigenTO().hashCode();
        }
        if (getConsecutivo() != null) {
            _hashCode += getConsecutivo().hashCode();
        }
        if (getTipoTelefonoTO() != null) {
            _hashCode += getTipoTelefonoTO().hashCode();
        }
        if (getCodigoArea() != null) {
            _hashCode += getCodigoArea().hashCode();
        }
        if (getLada() != null) {
            _hashCode += getLada().hashCode();
        }
        if (getTelefono() != null) {
            _hashCode += getTelefono().hashCode();
        }
        if (getExtension() != null) {
            _hashCode += getExtension().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TelefonoTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "telefonoTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoOrigenTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoOrigenTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoOrigenTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consecutivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consecutivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoTelefonoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoTelefonoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoTelefonoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoArea");
        elemField.setXmlName(new javax.xml.namespace.QName("", "codigoArea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lada");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefono");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extension");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extension"));
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
