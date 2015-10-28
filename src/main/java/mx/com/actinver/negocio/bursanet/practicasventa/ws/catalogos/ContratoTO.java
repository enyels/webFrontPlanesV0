/**
 * ContratoTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class ContratoTO  implements java.io.Serializable {
    private java.lang.Long numSolContrato;

    private java.lang.String sFechaAlta;

    private java.lang.String sFechaActualizacion;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO tipoServicioTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOrigenTO tipoOrigenTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoRegistroTO tipoRegistroTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ClienteTO cliente;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO perfil;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PosicionTO[] posiciones;

    private java.lang.Double posicionTotal;

    private java.lang.Boolean isfueraPerfi;

    private java.lang.String nombrePromotor;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CorreoElectronicoTO correoElectronicoTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.IdiomaTO idioma;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ClienteUnicoTO clienteUnicoTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO estadoContratoTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TelefonoTO[] telefonos;

    public ContratoTO() {
    }

    public ContratoTO(
           java.lang.Long numSolContrato,
           java.lang.String sFechaAlta,
           java.lang.String sFechaActualizacion,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO tipoServicioTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOrigenTO tipoOrigenTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoRegistroTO tipoRegistroTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ClienteTO cliente,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO perfil,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PosicionTO[] posiciones,
           java.lang.Double posicionTotal,
           java.lang.Boolean isfueraPerfi,
           java.lang.String nombrePromotor,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CorreoElectronicoTO correoElectronicoTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.IdiomaTO idioma,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ClienteUnicoTO clienteUnicoTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO estadoContratoTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TelefonoTO[] telefonos) {
           this.numSolContrato = numSolContrato;
           this.sFechaAlta = sFechaAlta;
           this.sFechaActualizacion = sFechaActualizacion;
           this.tipoServicioTO = tipoServicioTO;
           this.tipoOrigenTO = tipoOrigenTO;
           this.tipoRegistroTO = tipoRegistroTO;
           this.cliente = cliente;
           this.perfil = perfil;
           this.posiciones = posiciones;
           this.posicionTotal = posicionTotal;
           this.isfueraPerfi = isfueraPerfi;
           this.nombrePromotor = nombrePromotor;
           this.correoElectronicoTO = correoElectronicoTO;
           this.idioma = idioma;
           this.clienteUnicoTO = clienteUnicoTO;
           this.estadoContratoTO = estadoContratoTO;
           this.telefonos = telefonos;
    }


    /**
     * Gets the numSolContrato value for this ContratoTO.
     * 
     * @return numSolContrato
     */
    public java.lang.Long getNumSolContrato() {
        return numSolContrato;
    }


    /**
     * Sets the numSolContrato value for this ContratoTO.
     * 
     * @param numSolContrato
     */
    public void setNumSolContrato(java.lang.Long numSolContrato) {
        this.numSolContrato = numSolContrato;
    }


    /**
     * Gets the sFechaAlta value for this ContratoTO.
     * 
     * @return sFechaAlta
     */
    public java.lang.String getSFechaAlta() {
        return sFechaAlta;
    }


    /**
     * Sets the sFechaAlta value for this ContratoTO.
     * 
     * @param sFechaAlta
     */
    public void setSFechaAlta(java.lang.String sFechaAlta) {
        this.sFechaAlta = sFechaAlta;
    }


    /**
     * Gets the sFechaActualizacion value for this ContratoTO.
     * 
     * @return sFechaActualizacion
     */
    public java.lang.String getSFechaActualizacion() {
        return sFechaActualizacion;
    }


    /**
     * Sets the sFechaActualizacion value for this ContratoTO.
     * 
     * @param sFechaActualizacion
     */
    public void setSFechaActualizacion(java.lang.String sFechaActualizacion) {
        this.sFechaActualizacion = sFechaActualizacion;
    }


    /**
     * Gets the tipoServicioTO value for this ContratoTO.
     * 
     * @return tipoServicioTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO getTipoServicioTO() {
        return tipoServicioTO;
    }


    /**
     * Sets the tipoServicioTO value for this ContratoTO.
     * 
     * @param tipoServicioTO
     */
    public void setTipoServicioTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoServicioTO tipoServicioTO) {
        this.tipoServicioTO = tipoServicioTO;
    }


    /**
     * Gets the tipoOrigenTO value for this ContratoTO.
     * 
     * @return tipoOrigenTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOrigenTO getTipoOrigenTO() {
        return tipoOrigenTO;
    }


    /**
     * Sets the tipoOrigenTO value for this ContratoTO.
     * 
     * @param tipoOrigenTO
     */
    public void setTipoOrigenTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOrigenTO tipoOrigenTO) {
        this.tipoOrigenTO = tipoOrigenTO;
    }


    /**
     * Gets the tipoRegistroTO value for this ContratoTO.
     * 
     * @return tipoRegistroTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoRegistroTO getTipoRegistroTO() {
        return tipoRegistroTO;
    }


    /**
     * Sets the tipoRegistroTO value for this ContratoTO.
     * 
     * @param tipoRegistroTO
     */
    public void setTipoRegistroTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoRegistroTO tipoRegistroTO) {
        this.tipoRegistroTO = tipoRegistroTO;
    }


    /**
     * Gets the cliente value for this ContratoTO.
     * 
     * @return cliente
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ClienteTO getCliente() {
        return cliente;
    }


    /**
     * Sets the cliente value for this ContratoTO.
     * 
     * @param cliente
     */
    public void setCliente(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ClienteTO cliente) {
        this.cliente = cliente;
    }


    /**
     * Gets the perfil value for this ContratoTO.
     * 
     * @return perfil
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO getPerfil() {
        return perfil;
    }


    /**
     * Sets the perfil value for this ContratoTO.
     * 
     * @param perfil
     */
    public void setPerfil(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PerfilTO perfil) {
        this.perfil = perfil;
    }


    /**
     * Gets the posiciones value for this ContratoTO.
     * 
     * @return posiciones
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PosicionTO[] getPosiciones() {
        return posiciones;
    }


    /**
     * Sets the posiciones value for this ContratoTO.
     * 
     * @param posiciones
     */
    public void setPosiciones(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PosicionTO[] posiciones) {
        this.posiciones = posiciones;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PosicionTO getPosiciones(int i) {
        return this.posiciones[i];
    }

    public void setPosiciones(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PosicionTO _value) {
        this.posiciones[i] = _value;
    }


    /**
     * Gets the posicionTotal value for this ContratoTO.
     * 
     * @return posicionTotal
     */
    public java.lang.Double getPosicionTotal() {
        return posicionTotal;
    }


    /**
     * Sets the posicionTotal value for this ContratoTO.
     * 
     * @param posicionTotal
     */
    public void setPosicionTotal(java.lang.Double posicionTotal) {
        this.posicionTotal = posicionTotal;
    }


    /**
     * Gets the isfueraPerfi value for this ContratoTO.
     * 
     * @return isfueraPerfi
     */
    public java.lang.Boolean getIsfueraPerfi() {
        return isfueraPerfi;
    }


    /**
     * Sets the isfueraPerfi value for this ContratoTO.
     * 
     * @param isfueraPerfi
     */
    public void setIsfueraPerfi(java.lang.Boolean isfueraPerfi) {
        this.isfueraPerfi = isfueraPerfi;
    }


    /**
     * Gets the nombrePromotor value for this ContratoTO.
     * 
     * @return nombrePromotor
     */
    public java.lang.String getNombrePromotor() {
        return nombrePromotor;
    }


    /**
     * Sets the nombrePromotor value for this ContratoTO.
     * 
     * @param nombrePromotor
     */
    public void setNombrePromotor(java.lang.String nombrePromotor) {
        this.nombrePromotor = nombrePromotor;
    }


    /**
     * Gets the correoElectronicoTO value for this ContratoTO.
     * 
     * @return correoElectronicoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CorreoElectronicoTO getCorreoElectronicoTO() {
        return correoElectronicoTO;
    }


    /**
     * Sets the correoElectronicoTO value for this ContratoTO.
     * 
     * @param correoElectronicoTO
     */
    public void setCorreoElectronicoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CorreoElectronicoTO correoElectronicoTO) {
        this.correoElectronicoTO = correoElectronicoTO;
    }


    /**
     * Gets the idioma value for this ContratoTO.
     * 
     * @return idioma
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.IdiomaTO getIdioma() {
        return idioma;
    }


    /**
     * Sets the idioma value for this ContratoTO.
     * 
     * @param idioma
     */
    public void setIdioma(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.IdiomaTO idioma) {
        this.idioma = idioma;
    }


    /**
     * Gets the clienteUnicoTO value for this ContratoTO.
     * 
     * @return clienteUnicoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ClienteUnicoTO getClienteUnicoTO() {
        return clienteUnicoTO;
    }


    /**
     * Sets the clienteUnicoTO value for this ContratoTO.
     * 
     * @param clienteUnicoTO
     */
    public void setClienteUnicoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ClienteUnicoTO clienteUnicoTO) {
        this.clienteUnicoTO = clienteUnicoTO;
    }


    /**
     * Gets the estadoContratoTO value for this ContratoTO.
     * 
     * @return estadoContratoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO getEstadoContratoTO() {
        return estadoContratoTO;
    }


    /**
     * Sets the estadoContratoTO value for this ContratoTO.
     * 
     * @param estadoContratoTO
     */
    public void setEstadoContratoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO estadoContratoTO) {
        this.estadoContratoTO = estadoContratoTO;
    }


    /**
     * Gets the telefonos value for this ContratoTO.
     * 
     * @return telefonos
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TelefonoTO[] getTelefonos() {
        return telefonos;
    }


    /**
     * Sets the telefonos value for this ContratoTO.
     * 
     * @param telefonos
     */
    public void setTelefonos(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TelefonoTO[] telefonos) {
        this.telefonos = telefonos;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TelefonoTO getTelefonos(int i) {
        return this.telefonos[i];
    }

    public void setTelefonos(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TelefonoTO _value) {
        this.telefonos[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContratoTO)) return false;
        ContratoTO other = (ContratoTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numSolContrato==null && other.getNumSolContrato()==null) || 
             (this.numSolContrato!=null &&
              this.numSolContrato.equals(other.getNumSolContrato()))) &&
            ((this.sFechaAlta==null && other.getSFechaAlta()==null) || 
             (this.sFechaAlta!=null &&
              this.sFechaAlta.equals(other.getSFechaAlta()))) &&
            ((this.sFechaActualizacion==null && other.getSFechaActualizacion()==null) || 
             (this.sFechaActualizacion!=null &&
              this.sFechaActualizacion.equals(other.getSFechaActualizacion()))) &&
            ((this.tipoServicioTO==null && other.getTipoServicioTO()==null) || 
             (this.tipoServicioTO!=null &&
              this.tipoServicioTO.equals(other.getTipoServicioTO()))) &&
            ((this.tipoOrigenTO==null && other.getTipoOrigenTO()==null) || 
             (this.tipoOrigenTO!=null &&
              this.tipoOrigenTO.equals(other.getTipoOrigenTO()))) &&
            ((this.tipoRegistroTO==null && other.getTipoRegistroTO()==null) || 
             (this.tipoRegistroTO!=null &&
              this.tipoRegistroTO.equals(other.getTipoRegistroTO()))) &&
            ((this.cliente==null && other.getCliente()==null) || 
             (this.cliente!=null &&
              this.cliente.equals(other.getCliente()))) &&
            ((this.perfil==null && other.getPerfil()==null) || 
             (this.perfil!=null &&
              this.perfil.equals(other.getPerfil()))) &&
            ((this.posiciones==null && other.getPosiciones()==null) || 
             (this.posiciones!=null &&
              java.util.Arrays.equals(this.posiciones, other.getPosiciones()))) &&
            ((this.posicionTotal==null && other.getPosicionTotal()==null) || 
             (this.posicionTotal!=null &&
              this.posicionTotal.equals(other.getPosicionTotal()))) &&
            ((this.isfueraPerfi==null && other.getIsfueraPerfi()==null) || 
             (this.isfueraPerfi!=null &&
              this.isfueraPerfi.equals(other.getIsfueraPerfi()))) &&
            ((this.nombrePromotor==null && other.getNombrePromotor()==null) || 
             (this.nombrePromotor!=null &&
              this.nombrePromotor.equals(other.getNombrePromotor()))) &&
            ((this.correoElectronicoTO==null && other.getCorreoElectronicoTO()==null) || 
             (this.correoElectronicoTO!=null &&
              this.correoElectronicoTO.equals(other.getCorreoElectronicoTO()))) &&
            ((this.idioma==null && other.getIdioma()==null) || 
             (this.idioma!=null &&
              this.idioma.equals(other.getIdioma()))) &&
            ((this.clienteUnicoTO==null && other.getClienteUnicoTO()==null) || 
             (this.clienteUnicoTO!=null &&
              this.clienteUnicoTO.equals(other.getClienteUnicoTO()))) &&
            ((this.estadoContratoTO==null && other.getEstadoContratoTO()==null) || 
             (this.estadoContratoTO!=null &&
              this.estadoContratoTO.equals(other.getEstadoContratoTO()))) &&
            ((this.telefonos==null && other.getTelefonos()==null) || 
             (this.telefonos!=null &&
              java.util.Arrays.equals(this.telefonos, other.getTelefonos())));
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
        if (getNumSolContrato() != null) {
            _hashCode += getNumSolContrato().hashCode();
        }
        if (getSFechaAlta() != null) {
            _hashCode += getSFechaAlta().hashCode();
        }
        if (getSFechaActualizacion() != null) {
            _hashCode += getSFechaActualizacion().hashCode();
        }
        if (getTipoServicioTO() != null) {
            _hashCode += getTipoServicioTO().hashCode();
        }
        if (getTipoOrigenTO() != null) {
            _hashCode += getTipoOrigenTO().hashCode();
        }
        if (getTipoRegistroTO() != null) {
            _hashCode += getTipoRegistroTO().hashCode();
        }
        if (getCliente() != null) {
            _hashCode += getCliente().hashCode();
        }
        if (getPerfil() != null) {
            _hashCode += getPerfil().hashCode();
        }
        if (getPosiciones() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPosiciones());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPosiciones(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPosicionTotal() != null) {
            _hashCode += getPosicionTotal().hashCode();
        }
        if (getIsfueraPerfi() != null) {
            _hashCode += getIsfueraPerfi().hashCode();
        }
        if (getNombrePromotor() != null) {
            _hashCode += getNombrePromotor().hashCode();
        }
        if (getCorreoElectronicoTO() != null) {
            _hashCode += getCorreoElectronicoTO().hashCode();
        }
        if (getIdioma() != null) {
            _hashCode += getIdioma().hashCode();
        }
        if (getClienteUnicoTO() != null) {
            _hashCode += getClienteUnicoTO().hashCode();
        }
        if (getEstadoContratoTO() != null) {
            _hashCode += getEstadoContratoTO().hashCode();
        }
        if (getTelefonos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTelefonos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTelefonos(), i);
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
        new org.apache.axis.description.TypeDesc(ContratoTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "contratoTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numSolContrato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numSolContrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFechaAlta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sFechaAlta"));
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
        elemField.setFieldName("tipoServicioTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoServicioTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoServicioTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoOrigenTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoOrigenTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoOrigenTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRegistroTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoRegistroTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoRegistroTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cliente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "clienteTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("perfil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "perfilTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posiciones");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posiciones"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "posicionTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posicionTotal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posicionTotal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isfueraPerfi");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isfueraPerfi"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombrePromotor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombrePromotor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correoElectronicoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "correoElectronicoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "correoElectronicoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idioma");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idioma"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "idiomaTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clienteUnicoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clienteUnicoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "clienteUnicoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoContratoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoContratoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estadoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telefonos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "telefonos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "telefonoTO"));
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
