/**
 * ClienteTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class ClienteTO  extends mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PersonaTO  implements java.io.Serializable {
    private java.lang.Boolean esTitular;

    private java.lang.String razonSocial;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoPersonaTO tipoPersonaTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO contratoTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO estadoTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.NacionalidadTO nacionalidadTO;

    private java.lang.String correoE;

    public ClienteTO() {
    }

    public ClienteTO(
           java.lang.Long id,
           java.lang.String nombre,
           java.lang.String apPaterno,
           java.lang.String apMaterno,
           java.lang.String rfc,
           java.lang.String curp,
           java.lang.String sFechaNacimiento,
           java.util.Calendar fechaNacimiento,
           java.lang.String email,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UsuarioTO usuarioTO,
           java.lang.Boolean esTitular,
           java.lang.String razonSocial,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoPersonaTO tipoPersonaTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO contratoTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO estadoTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.NacionalidadTO nacionalidadTO,
           java.lang.String correoE) {
        super(
            id,
            nombre,
            apPaterno,
            apMaterno,
            rfc,
            curp,
            sFechaNacimiento,
            fechaNacimiento,
            email,
            usuarioTO);
        this.esTitular = esTitular;
        this.razonSocial = razonSocial;
        this.tipoPersonaTO = tipoPersonaTO;
        this.contratoTO = contratoTO;
        this.estadoTO = estadoTO;
        this.nacionalidadTO = nacionalidadTO;
        this.correoE = correoE;
    }


    /**
     * Gets the esTitular value for this ClienteTO.
     * 
     * @return esTitular
     */
    public java.lang.Boolean getEsTitular() {
        return esTitular;
    }


    /**
     * Sets the esTitular value for this ClienteTO.
     * 
     * @param esTitular
     */
    public void setEsTitular(java.lang.Boolean esTitular) {
        this.esTitular = esTitular;
    }


    /**
     * Gets the razonSocial value for this ClienteTO.
     * 
     * @return razonSocial
     */
    public java.lang.String getRazonSocial() {
        return razonSocial;
    }


    /**
     * Sets the razonSocial value for this ClienteTO.
     * 
     * @param razonSocial
     */
    public void setRazonSocial(java.lang.String razonSocial) {
        this.razonSocial = razonSocial;
    }


    /**
     * Gets the tipoPersonaTO value for this ClienteTO.
     * 
     * @return tipoPersonaTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoPersonaTO getTipoPersonaTO() {
        return tipoPersonaTO;
    }


    /**
     * Sets the tipoPersonaTO value for this ClienteTO.
     * 
     * @param tipoPersonaTO
     */
    public void setTipoPersonaTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoPersonaTO tipoPersonaTO) {
        this.tipoPersonaTO = tipoPersonaTO;
    }


    /**
     * Gets the contratoTO value for this ClienteTO.
     * 
     * @return contratoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO getContratoTO() {
        return contratoTO;
    }


    /**
     * Sets the contratoTO value for this ClienteTO.
     * 
     * @param contratoTO
     */
    public void setContratoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO contratoTO) {
        this.contratoTO = contratoTO;
    }


    /**
     * Gets the estadoTO value for this ClienteTO.
     * 
     * @return estadoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO getEstadoTO() {
        return estadoTO;
    }


    /**
     * Sets the estadoTO value for this ClienteTO.
     * 
     * @param estadoTO
     */
    public void setEstadoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO estadoTO) {
        this.estadoTO = estadoTO;
    }


    /**
     * Gets the nacionalidadTO value for this ClienteTO.
     * 
     * @return nacionalidadTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.NacionalidadTO getNacionalidadTO() {
        return nacionalidadTO;
    }


    /**
     * Sets the nacionalidadTO value for this ClienteTO.
     * 
     * @param nacionalidadTO
     */
    public void setNacionalidadTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.NacionalidadTO nacionalidadTO) {
        this.nacionalidadTO = nacionalidadTO;
    }


    /**
     * Gets the correoE value for this ClienteTO.
     * 
     * @return correoE
     */
    public java.lang.String getCorreoE() {
        return correoE;
    }


    /**
     * Sets the correoE value for this ClienteTO.
     * 
     * @param correoE
     */
    public void setCorreoE(java.lang.String correoE) {
        this.correoE = correoE;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClienteTO)) return false;
        ClienteTO other = (ClienteTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.esTitular==null && other.getEsTitular()==null) || 
             (this.esTitular!=null &&
              this.esTitular.equals(other.getEsTitular()))) &&
            ((this.razonSocial==null && other.getRazonSocial()==null) || 
             (this.razonSocial!=null &&
              this.razonSocial.equals(other.getRazonSocial()))) &&
            ((this.tipoPersonaTO==null && other.getTipoPersonaTO()==null) || 
             (this.tipoPersonaTO!=null &&
              this.tipoPersonaTO.equals(other.getTipoPersonaTO()))) &&
            ((this.contratoTO==null && other.getContratoTO()==null) || 
             (this.contratoTO!=null &&
              this.contratoTO.equals(other.getContratoTO()))) &&
            ((this.estadoTO==null && other.getEstadoTO()==null) || 
             (this.estadoTO!=null &&
              this.estadoTO.equals(other.getEstadoTO()))) &&
            ((this.nacionalidadTO==null && other.getNacionalidadTO()==null) || 
             (this.nacionalidadTO!=null &&
              this.nacionalidadTO.equals(other.getNacionalidadTO()))) &&
            ((this.correoE==null && other.getCorreoE()==null) || 
             (this.correoE!=null &&
              this.correoE.equals(other.getCorreoE())));
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
        if (getEsTitular() != null) {
            _hashCode += getEsTitular().hashCode();
        }
        if (getRazonSocial() != null) {
            _hashCode += getRazonSocial().hashCode();
        }
        if (getTipoPersonaTO() != null) {
            _hashCode += getTipoPersonaTO().hashCode();
        }
        if (getContratoTO() != null) {
            _hashCode += getContratoTO().hashCode();
        }
        if (getEstadoTO() != null) {
            _hashCode += getEstadoTO().hashCode();
        }
        if (getNacionalidadTO() != null) {
            _hashCode += getNacionalidadTO().hashCode();
        }
        if (getCorreoE() != null) {
            _hashCode += getCorreoE().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClienteTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "clienteTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esTitular");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esTitular"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("razonSocial");
        elemField.setXmlName(new javax.xml.namespace.QName("", "razonSocial"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoPersonaTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoPersonaTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoPersonaTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contratoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contratoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "contratoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estadoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nacionalidadTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nacionalidadTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "nacionalidadTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correoE");
        elemField.setXmlName(new javax.xml.namespace.QName("", "correoE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
