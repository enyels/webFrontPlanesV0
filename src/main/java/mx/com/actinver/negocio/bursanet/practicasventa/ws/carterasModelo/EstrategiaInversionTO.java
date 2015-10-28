/**
 * EstrategiaInversionTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class EstrategiaInversionTO  implements java.io.Serializable {
    private java.lang.Long idEstrategiaInversionTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO contratoTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO carterasModeloTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoEstrategiaTO estadoEstrategiaTO;

    private java.lang.Double montoInvertir;

    private java.lang.String nombreEstrategia;

    private java.lang.String sFechaCreacion;

    private java.lang.String sFechaActualizacion;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteGlobalTO limiteGlobalTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UsuarioTO usuarioTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO perfilTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.AgrupadorTO[] listaAgrupadores;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO tipoCarteraTO;

    public EstrategiaInversionTO() {
    }

    public EstrategiaInversionTO(
           java.lang.Long idEstrategiaInversionTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO contratoTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO carterasModeloTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoEstrategiaTO estadoEstrategiaTO,
           java.lang.Double montoInvertir,
           java.lang.String nombreEstrategia,
           java.lang.String sFechaCreacion,
           java.lang.String sFechaActualizacion,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteGlobalTO limiteGlobalTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UsuarioTO usuarioTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO perfilTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.AgrupadorTO[] listaAgrupadores,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO tipoCarteraTO) {
           this.idEstrategiaInversionTO = idEstrategiaInversionTO;
           this.contratoTO = contratoTO;
           this.carterasModeloTO = carterasModeloTO;
           this.estadoEstrategiaTO = estadoEstrategiaTO;
           this.montoInvertir = montoInvertir;
           this.nombreEstrategia = nombreEstrategia;
           this.sFechaCreacion = sFechaCreacion;
           this.sFechaActualizacion = sFechaActualizacion;
           this.limiteGlobalTO = limiteGlobalTO;
           this.usuarioTO = usuarioTO;
           this.perfilTO = perfilTO;
           this.listaAgrupadores = listaAgrupadores;
           this.tipoCarteraTO = tipoCarteraTO;
    }


    /**
     * Gets the idEstrategiaInversionTO value for this EstrategiaInversionTO.
     * 
     * @return idEstrategiaInversionTO
     */
    public java.lang.Long getIdEstrategiaInversionTO() {
        return idEstrategiaInversionTO;
    }


    /**
     * Sets the idEstrategiaInversionTO value for this EstrategiaInversionTO.
     * 
     * @param idEstrategiaInversionTO
     */
    public void setIdEstrategiaInversionTO(java.lang.Long idEstrategiaInversionTO) {
        this.idEstrategiaInversionTO = idEstrategiaInversionTO;
    }


    /**
     * Gets the contratoTO value for this EstrategiaInversionTO.
     * 
     * @return contratoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO getContratoTO() {
        return contratoTO;
    }


    /**
     * Sets the contratoTO value for this EstrategiaInversionTO.
     * 
     * @param contratoTO
     */
    public void setContratoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.ContratoTO contratoTO) {
        this.contratoTO = contratoTO;
    }


    /**
     * Gets the carterasModeloTO value for this EstrategiaInversionTO.
     * 
     * @return carterasModeloTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO getCarterasModeloTO() {
        return carterasModeloTO;
    }


    /**
     * Sets the carterasModeloTO value for this EstrategiaInversionTO.
     * 
     * @param carterasModeloTO
     */
    public void setCarterasModeloTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.CarterasModeloTO carterasModeloTO) {
        this.carterasModeloTO = carterasModeloTO;
    }


    /**
     * Gets the estadoEstrategiaTO value for this EstrategiaInversionTO.
     * 
     * @return estadoEstrategiaTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoEstrategiaTO getEstadoEstrategiaTO() {
        return estadoEstrategiaTO;
    }


    /**
     * Sets the estadoEstrategiaTO value for this EstrategiaInversionTO.
     * 
     * @param estadoEstrategiaTO
     */
    public void setEstadoEstrategiaTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoEstrategiaTO estadoEstrategiaTO) {
        this.estadoEstrategiaTO = estadoEstrategiaTO;
    }


    /**
     * Gets the montoInvertir value for this EstrategiaInversionTO.
     * 
     * @return montoInvertir
     */
    public java.lang.Double getMontoInvertir() {
        return montoInvertir;
    }


    /**
     * Sets the montoInvertir value for this EstrategiaInversionTO.
     * 
     * @param montoInvertir
     */
    public void setMontoInvertir(java.lang.Double montoInvertir) {
        this.montoInvertir = montoInvertir;
    }


    /**
     * Gets the nombreEstrategia value for this EstrategiaInversionTO.
     * 
     * @return nombreEstrategia
     */
    public java.lang.String getNombreEstrategia() {
        return nombreEstrategia;
    }


    /**
     * Sets the nombreEstrategia value for this EstrategiaInversionTO.
     * 
     * @param nombreEstrategia
     */
    public void setNombreEstrategia(java.lang.String nombreEstrategia) {
        this.nombreEstrategia = nombreEstrategia;
    }


    /**
     * Gets the sFechaCreacion value for this EstrategiaInversionTO.
     * 
     * @return sFechaCreacion
     */
    public java.lang.String getSFechaCreacion() {
        return sFechaCreacion;
    }


    /**
     * Sets the sFechaCreacion value for this EstrategiaInversionTO.
     * 
     * @param sFechaCreacion
     */
    public void setSFechaCreacion(java.lang.String sFechaCreacion) {
        this.sFechaCreacion = sFechaCreacion;
    }


    /**
     * Gets the sFechaActualizacion value for this EstrategiaInversionTO.
     * 
     * @return sFechaActualizacion
     */
    public java.lang.String getSFechaActualizacion() {
        return sFechaActualizacion;
    }


    /**
     * Sets the sFechaActualizacion value for this EstrategiaInversionTO.
     * 
     * @param sFechaActualizacion
     */
    public void setSFechaActualizacion(java.lang.String sFechaActualizacion) {
        this.sFechaActualizacion = sFechaActualizacion;
    }


    /**
     * Gets the limiteGlobalTO value for this EstrategiaInversionTO.
     * 
     * @return limiteGlobalTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteGlobalTO getLimiteGlobalTO() {
        return limiteGlobalTO;
    }


    /**
     * Sets the limiteGlobalTO value for this EstrategiaInversionTO.
     * 
     * @param limiteGlobalTO
     */
    public void setLimiteGlobalTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteGlobalTO limiteGlobalTO) {
        this.limiteGlobalTO = limiteGlobalTO;
    }


    /**
     * Gets the usuarioTO value for this EstrategiaInversionTO.
     * 
     * @return usuarioTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UsuarioTO getUsuarioTO() {
        return usuarioTO;
    }


    /**
     * Sets the usuarioTO value for this EstrategiaInversionTO.
     * 
     * @param usuarioTO
     */
    public void setUsuarioTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UsuarioTO usuarioTO) {
        this.usuarioTO = usuarioTO;
    }


    /**
     * Gets the perfilTO value for this EstrategiaInversionTO.
     * 
     * @return perfilTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO getPerfilTO() {
        return perfilTO;
    }


    /**
     * Sets the perfilTO value for this EstrategiaInversionTO.
     * 
     * @param perfilTO
     */
    public void setPerfilTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO perfilTO) {
        this.perfilTO = perfilTO;
    }


    /**
     * Gets the listaAgrupadores value for this EstrategiaInversionTO.
     * 
     * @return listaAgrupadores
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.AgrupadorTO[] getListaAgrupadores() {
        return listaAgrupadores;
    }


    /**
     * Sets the listaAgrupadores value for this EstrategiaInversionTO.
     * 
     * @param listaAgrupadores
     */
    public void setListaAgrupadores(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.AgrupadorTO[] listaAgrupadores) {
        this.listaAgrupadores = listaAgrupadores;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.AgrupadorTO getListaAgrupadores(int i) {
        return this.listaAgrupadores[i];
    }

    public void setListaAgrupadores(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.AgrupadorTO _value) {
        this.listaAgrupadores[i] = _value;
    }


    /**
     * Gets the tipoCarteraTO value for this EstrategiaInversionTO.
     * 
     * @return tipoCarteraTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO getTipoCarteraTO() {
        return tipoCarteraTO;
    }


    /**
     * Sets the tipoCarteraTO value for this EstrategiaInversionTO.
     * 
     * @param tipoCarteraTO
     */
    public void setTipoCarteraTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO tipoCarteraTO) {
        this.tipoCarteraTO = tipoCarteraTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EstrategiaInversionTO)) return false;
        EstrategiaInversionTO other = (EstrategiaInversionTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idEstrategiaInversionTO==null && other.getIdEstrategiaInversionTO()==null) || 
             (this.idEstrategiaInversionTO!=null &&
              this.idEstrategiaInversionTO.equals(other.getIdEstrategiaInversionTO()))) &&
            ((this.contratoTO==null && other.getContratoTO()==null) || 
             (this.contratoTO!=null &&
              this.contratoTO.equals(other.getContratoTO()))) &&
            ((this.carterasModeloTO==null && other.getCarterasModeloTO()==null) || 
             (this.carterasModeloTO!=null &&
              this.carterasModeloTO.equals(other.getCarterasModeloTO()))) &&
            ((this.estadoEstrategiaTO==null && other.getEstadoEstrategiaTO()==null) || 
             (this.estadoEstrategiaTO!=null &&
              this.estadoEstrategiaTO.equals(other.getEstadoEstrategiaTO()))) &&
            ((this.montoInvertir==null && other.getMontoInvertir()==null) || 
             (this.montoInvertir!=null &&
              this.montoInvertir.equals(other.getMontoInvertir()))) &&
            ((this.nombreEstrategia==null && other.getNombreEstrategia()==null) || 
             (this.nombreEstrategia!=null &&
              this.nombreEstrategia.equals(other.getNombreEstrategia()))) &&
            ((this.sFechaCreacion==null && other.getSFechaCreacion()==null) || 
             (this.sFechaCreacion!=null &&
              this.sFechaCreacion.equals(other.getSFechaCreacion()))) &&
            ((this.sFechaActualizacion==null && other.getSFechaActualizacion()==null) || 
             (this.sFechaActualizacion!=null &&
              this.sFechaActualizacion.equals(other.getSFechaActualizacion()))) &&
            ((this.limiteGlobalTO==null && other.getLimiteGlobalTO()==null) || 
             (this.limiteGlobalTO!=null &&
              this.limiteGlobalTO.equals(other.getLimiteGlobalTO()))) &&
            ((this.usuarioTO==null && other.getUsuarioTO()==null) || 
             (this.usuarioTO!=null &&
              this.usuarioTO.equals(other.getUsuarioTO()))) &&
            ((this.perfilTO==null && other.getPerfilTO()==null) || 
             (this.perfilTO!=null &&
              this.perfilTO.equals(other.getPerfilTO()))) &&
            ((this.listaAgrupadores==null && other.getListaAgrupadores()==null) || 
             (this.listaAgrupadores!=null &&
              java.util.Arrays.equals(this.listaAgrupadores, other.getListaAgrupadores()))) &&
            ((this.tipoCarteraTO==null && other.getTipoCarteraTO()==null) || 
             (this.tipoCarteraTO!=null &&
              this.tipoCarteraTO.equals(other.getTipoCarteraTO())));
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
        if (getIdEstrategiaInversionTO() != null) {
            _hashCode += getIdEstrategiaInversionTO().hashCode();
        }
        if (getContratoTO() != null) {
            _hashCode += getContratoTO().hashCode();
        }
        if (getCarterasModeloTO() != null) {
            _hashCode += getCarterasModeloTO().hashCode();
        }
        if (getEstadoEstrategiaTO() != null) {
            _hashCode += getEstadoEstrategiaTO().hashCode();
        }
        if (getMontoInvertir() != null) {
            _hashCode += getMontoInvertir().hashCode();
        }
        if (getNombreEstrategia() != null) {
            _hashCode += getNombreEstrategia().hashCode();
        }
        if (getSFechaCreacion() != null) {
            _hashCode += getSFechaCreacion().hashCode();
        }
        if (getSFechaActualizacion() != null) {
            _hashCode += getSFechaActualizacion().hashCode();
        }
        if (getLimiteGlobalTO() != null) {
            _hashCode += getLimiteGlobalTO().hashCode();
        }
        if (getUsuarioTO() != null) {
            _hashCode += getUsuarioTO().hashCode();
        }
        if (getPerfilTO() != null) {
            _hashCode += getPerfilTO().hashCode();
        }
        if (getListaAgrupadores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaAgrupadores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaAgrupadores(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTipoCarteraTO() != null) {
            _hashCode += getTipoCarteraTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EstrategiaInversionTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estrategiaInversionTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEstrategiaInversionTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idEstrategiaInversionTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contratoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contratoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "contratoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carterasModeloTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carterasModeloTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "carterasModeloTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoEstrategiaTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoEstrategiaTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estadoEstrategiaTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("montoInvertir");
        elemField.setXmlName(new javax.xml.namespace.QName("", "montoInvertir"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreEstrategia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreEstrategia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFechaCreacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sFechaCreacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFechaActualizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sFechaActualizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limiteGlobalTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limiteGlobalTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "limiteGlobalTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "usuarioTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfilTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfilTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "perfilTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaAgrupadores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaAgrupadores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "agrupadorTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCarteraTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoCarteraTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoCarteraTO"));
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
