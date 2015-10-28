/**
 * CorreoElectronicoTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class CorreoElectronicoTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.RemitenteTO remitente;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.DestinatarioTO[] destinatarios;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.DestinatarioTO[] destinatariosCC;

    private java.lang.String asunto;

    private java.lang.String mensaje;

    private java.lang.String tipoContenido;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ArchivoTO[] archivosAdjuntos;

    private java.lang.Boolean debug;

    public CorreoElectronicoTO() {
    }

    public CorreoElectronicoTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.RemitenteTO remitente,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.DestinatarioTO[] destinatarios,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.DestinatarioTO[] destinatariosCC,
           java.lang.String asunto,
           java.lang.String mensaje,
           java.lang.String tipoContenido,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ArchivoTO[] archivosAdjuntos,
           java.lang.Boolean debug) {
           this.remitente = remitente;
           this.destinatarios = destinatarios;
           this.destinatariosCC = destinatariosCC;
           this.asunto = asunto;
           this.mensaje = mensaje;
           this.tipoContenido = tipoContenido;
           this.archivosAdjuntos = archivosAdjuntos;
           this.debug = debug;
    }


    /**
     * Gets the remitente value for this CorreoElectronicoTO.
     * 
     * @return remitente
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.RemitenteTO getRemitente() {
        return remitente;
    }


    /**
     * Sets the remitente value for this CorreoElectronicoTO.
     * 
     * @param remitente
     */
    public void setRemitente(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.RemitenteTO remitente) {
        this.remitente = remitente;
    }


    /**
     * Gets the destinatarios value for this CorreoElectronicoTO.
     * 
     * @return destinatarios
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.DestinatarioTO[] getDestinatarios() {
        return destinatarios;
    }


    /**
     * Sets the destinatarios value for this CorreoElectronicoTO.
     * 
     * @param destinatarios
     */
    public void setDestinatarios(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.DestinatarioTO[] destinatarios) {
        this.destinatarios = destinatarios;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.DestinatarioTO getDestinatarios(int i) {
        return this.destinatarios[i];
    }

    public void setDestinatarios(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.DestinatarioTO _value) {
        this.destinatarios[i] = _value;
    }


    /**
     * Gets the destinatariosCC value for this CorreoElectronicoTO.
     * 
     * @return destinatariosCC
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.DestinatarioTO[] getDestinatariosCC() {
        return destinatariosCC;
    }


    /**
     * Sets the destinatariosCC value for this CorreoElectronicoTO.
     * 
     * @param destinatariosCC
     */
    public void setDestinatariosCC(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.DestinatarioTO[] destinatariosCC) {
        this.destinatariosCC = destinatariosCC;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.DestinatarioTO getDestinatariosCC(int i) {
        return this.destinatariosCC[i];
    }

    public void setDestinatariosCC(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.DestinatarioTO _value) {
        this.destinatariosCC[i] = _value;
    }


    /**
     * Gets the asunto value for this CorreoElectronicoTO.
     * 
     * @return asunto
     */
    public java.lang.String getAsunto() {
        return asunto;
    }


    /**
     * Sets the asunto value for this CorreoElectronicoTO.
     * 
     * @param asunto
     */
    public void setAsunto(java.lang.String asunto) {
        this.asunto = asunto;
    }


    /**
     * Gets the mensaje value for this CorreoElectronicoTO.
     * 
     * @return mensaje
     */
    public java.lang.String getMensaje() {
        return mensaje;
    }


    /**
     * Sets the mensaje value for this CorreoElectronicoTO.
     * 
     * @param mensaje
     */
    public void setMensaje(java.lang.String mensaje) {
        this.mensaje = mensaje;
    }


    /**
     * Gets the tipoContenido value for this CorreoElectronicoTO.
     * 
     * @return tipoContenido
     */
    public java.lang.String getTipoContenido() {
        return tipoContenido;
    }


    /**
     * Sets the tipoContenido value for this CorreoElectronicoTO.
     * 
     * @param tipoContenido
     */
    public void setTipoContenido(java.lang.String tipoContenido) {
        this.tipoContenido = tipoContenido;
    }


    /**
     * Gets the archivosAdjuntos value for this CorreoElectronicoTO.
     * 
     * @return archivosAdjuntos
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ArchivoTO[] getArchivosAdjuntos() {
        return archivosAdjuntos;
    }


    /**
     * Sets the archivosAdjuntos value for this CorreoElectronicoTO.
     * 
     * @param archivosAdjuntos
     */
    public void setArchivosAdjuntos(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ArchivoTO[] archivosAdjuntos) {
        this.archivosAdjuntos = archivosAdjuntos;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ArchivoTO getArchivosAdjuntos(int i) {
        return this.archivosAdjuntos[i];
    }

    public void setArchivosAdjuntos(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ArchivoTO _value) {
        this.archivosAdjuntos[i] = _value;
    }


    /**
     * Gets the debug value for this CorreoElectronicoTO.
     * 
     * @return debug
     */
    public java.lang.Boolean getDebug() {
        return debug;
    }


    /**
     * Sets the debug value for this CorreoElectronicoTO.
     * 
     * @param debug
     */
    public void setDebug(java.lang.Boolean debug) {
        this.debug = debug;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorreoElectronicoTO)) return false;
        CorreoElectronicoTO other = (CorreoElectronicoTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.remitente==null && other.getRemitente()==null) || 
             (this.remitente!=null &&
              this.remitente.equals(other.getRemitente()))) &&
            ((this.destinatarios==null && other.getDestinatarios()==null) || 
             (this.destinatarios!=null &&
              java.util.Arrays.equals(this.destinatarios, other.getDestinatarios()))) &&
            ((this.destinatariosCC==null && other.getDestinatariosCC()==null) || 
             (this.destinatariosCC!=null &&
              java.util.Arrays.equals(this.destinatariosCC, other.getDestinatariosCC()))) &&
            ((this.asunto==null && other.getAsunto()==null) || 
             (this.asunto!=null &&
              this.asunto.equals(other.getAsunto()))) &&
            ((this.mensaje==null && other.getMensaje()==null) || 
             (this.mensaje!=null &&
              this.mensaje.equals(other.getMensaje()))) &&
            ((this.tipoContenido==null && other.getTipoContenido()==null) || 
             (this.tipoContenido!=null &&
              this.tipoContenido.equals(other.getTipoContenido()))) &&
            ((this.archivosAdjuntos==null && other.getArchivosAdjuntos()==null) || 
             (this.archivosAdjuntos!=null &&
              java.util.Arrays.equals(this.archivosAdjuntos, other.getArchivosAdjuntos()))) &&
            ((this.debug==null && other.getDebug()==null) || 
             (this.debug!=null &&
              this.debug.equals(other.getDebug())));
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
        if (getRemitente() != null) {
            _hashCode += getRemitente().hashCode();
        }
        if (getDestinatarios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDestinatarios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDestinatarios(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDestinatariosCC() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDestinatariosCC());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDestinatariosCC(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAsunto() != null) {
            _hashCode += getAsunto().hashCode();
        }
        if (getMensaje() != null) {
            _hashCode += getMensaje().hashCode();
        }
        if (getTipoContenido() != null) {
            _hashCode += getTipoContenido().hashCode();
        }
        if (getArchivosAdjuntos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArchivosAdjuntos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArchivosAdjuntos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDebug() != null) {
            _hashCode += getDebug().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorreoElectronicoTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "correoElectronicoTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remitente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "remitente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "remitenteTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatarios");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinatarios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "destinatarioTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinatariosCC");
        elemField.setXmlName(new javax.xml.namespace.QName("", "destinatariosCC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "destinatarioTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asunto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asunto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mensaje");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mensaje"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoContenido");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoContenido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archivosAdjuntos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archivosAdjuntos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "archivoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("debug");
        elemField.setXmlName(new javax.xml.namespace.QName("", "debug"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
