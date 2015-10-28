/**
 * CarterasModeloTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class CarterasModeloTO  implements java.io.Serializable {
    private java.lang.Long id;

    private java.lang.String nombre;

    private java.lang.String sFechaCreacion;

    private java.lang.String sFechaVigencia;

    private java.lang.String sFechaUltimaModificacion;

    private java.lang.String sFechaEntradaVigor;

    private java.lang.Integer periodoActualizacion;

    private java.lang.Boolean esCarteraDefault;

    private java.lang.Boolean vigente;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO estadoTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UsuarioTO usuarioTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO tipoCarteraTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO perfilTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO[] perfilesAsociados;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteGlobalTO limiteGlobalTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteTO[] limites;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UnidadTiempoTO unidadTiempoTOVigor;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UnidadTiempoTO unidadTiempoTOVigencia;

    public CarterasModeloTO() {
    }

    public CarterasModeloTO(
           java.lang.Long id,
           java.lang.String nombre,
           java.lang.String sFechaCreacion,
           java.lang.String sFechaVigencia,
           java.lang.String sFechaUltimaModificacion,
           java.lang.String sFechaEntradaVigor,
           java.lang.Integer periodoActualizacion,
           java.lang.Boolean esCarteraDefault,
           java.lang.Boolean vigente,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO estadoTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UsuarioTO usuarioTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO tipoCarteraTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO perfilTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO[] perfilesAsociados,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteGlobalTO limiteGlobalTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteTO[] limites,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UnidadTiempoTO unidadTiempoTOVigor,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UnidadTiempoTO unidadTiempoTOVigencia) {
           this.id = id;
           this.nombre = nombre;
           this.sFechaCreacion = sFechaCreacion;
           this.sFechaVigencia = sFechaVigencia;
           this.sFechaUltimaModificacion = sFechaUltimaModificacion;
           this.sFechaEntradaVigor = sFechaEntradaVigor;
           this.periodoActualizacion = periodoActualizacion;
           this.esCarteraDefault = esCarteraDefault;
           this.vigente = vigente;
           this.estadoTO = estadoTO;
           this.usuarioTO = usuarioTO;
           this.tipoCarteraTO = tipoCarteraTO;
           this.perfilTO = perfilTO;
           this.perfilesAsociados = perfilesAsociados;
           this.limiteGlobalTO = limiteGlobalTO;
           this.limites = limites;
           this.unidadTiempoTOVigor = unidadTiempoTOVigor;
           this.unidadTiempoTOVigencia = unidadTiempoTOVigencia;
    }


    /**
     * Gets the id value for this CarterasModeloTO.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this CarterasModeloTO.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the nombre value for this CarterasModeloTO.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this CarterasModeloTO.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the sFechaCreacion value for this CarterasModeloTO.
     * 
     * @return sFechaCreacion
     */
    public java.lang.String getSFechaCreacion() {
        return sFechaCreacion;
    }


    /**
     * Sets the sFechaCreacion value for this CarterasModeloTO.
     * 
     * @param sFechaCreacion
     */
    public void setSFechaCreacion(java.lang.String sFechaCreacion) {
        this.sFechaCreacion = sFechaCreacion;
    }


    /**
     * Gets the sFechaVigencia value for this CarterasModeloTO.
     * 
     * @return sFechaVigencia
     */
    public java.lang.String getSFechaVigencia() {
        return sFechaVigencia;
    }


    /**
     * Sets the sFechaVigencia value for this CarterasModeloTO.
     * 
     * @param sFechaVigencia
     */
    public void setSFechaVigencia(java.lang.String sFechaVigencia) {
        this.sFechaVigencia = sFechaVigencia;
    }


    /**
     * Gets the sFechaUltimaModificacion value for this CarterasModeloTO.
     * 
     * @return sFechaUltimaModificacion
     */
    public java.lang.String getSFechaUltimaModificacion() {
        return sFechaUltimaModificacion;
    }


    /**
     * Sets the sFechaUltimaModificacion value for this CarterasModeloTO.
     * 
     * @param sFechaUltimaModificacion
     */
    public void setSFechaUltimaModificacion(java.lang.String sFechaUltimaModificacion) {
        this.sFechaUltimaModificacion = sFechaUltimaModificacion;
    }


    /**
     * Gets the sFechaEntradaVigor value for this CarterasModeloTO.
     * 
     * @return sFechaEntradaVigor
     */
    public java.lang.String getSFechaEntradaVigor() {
        return sFechaEntradaVigor;
    }


    /**
     * Sets the sFechaEntradaVigor value for this CarterasModeloTO.
     * 
     * @param sFechaEntradaVigor
     */
    public void setSFechaEntradaVigor(java.lang.String sFechaEntradaVigor) {
        this.sFechaEntradaVigor = sFechaEntradaVigor;
    }


    /**
     * Gets the periodoActualizacion value for this CarterasModeloTO.
     * 
     * @return periodoActualizacion
     */
    public java.lang.Integer getPeriodoActualizacion() {
        return periodoActualizacion;
    }


    /**
     * Sets the periodoActualizacion value for this CarterasModeloTO.
     * 
     * @param periodoActualizacion
     */
    public void setPeriodoActualizacion(java.lang.Integer periodoActualizacion) {
        this.periodoActualizacion = periodoActualizacion;
    }


    /**
     * Gets the esCarteraDefault value for this CarterasModeloTO.
     * 
     * @return esCarteraDefault
     */
    public java.lang.Boolean getEsCarteraDefault() {
        return esCarteraDefault;
    }


    /**
     * Sets the esCarteraDefault value for this CarterasModeloTO.
     * 
     * @param esCarteraDefault
     */
    public void setEsCarteraDefault(java.lang.Boolean esCarteraDefault) {
        this.esCarteraDefault = esCarteraDefault;
    }


    /**
     * Gets the vigente value for this CarterasModeloTO.
     * 
     * @return vigente
     */
    public java.lang.Boolean getVigente() {
        return vigente;
    }


    /**
     * Sets the vigente value for this CarterasModeloTO.
     * 
     * @param vigente
     */
    public void setVigente(java.lang.Boolean vigente) {
        this.vigente = vigente;
    }


    /**
     * Gets the estadoTO value for this CarterasModeloTO.
     * 
     * @return estadoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO getEstadoTO() {
        return estadoTO;
    }


    /**
     * Sets the estadoTO value for this CarterasModeloTO.
     * 
     * @param estadoTO
     */
    public void setEstadoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO estadoTO) {
        this.estadoTO = estadoTO;
    }


    /**
     * Gets the usuarioTO value for this CarterasModeloTO.
     * 
     * @return usuarioTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UsuarioTO getUsuarioTO() {
        return usuarioTO;
    }


    /**
     * Sets the usuarioTO value for this CarterasModeloTO.
     * 
     * @param usuarioTO
     */
    public void setUsuarioTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UsuarioTO usuarioTO) {
        this.usuarioTO = usuarioTO;
    }


    /**
     * Gets the tipoCarteraTO value for this CarterasModeloTO.
     * 
     * @return tipoCarteraTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO getTipoCarteraTO() {
        return tipoCarteraTO;
    }


    /**
     * Sets the tipoCarteraTO value for this CarterasModeloTO.
     * 
     * @param tipoCarteraTO
     */
    public void setTipoCarteraTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO tipoCarteraTO) {
        this.tipoCarteraTO = tipoCarteraTO;
    }


    /**
     * Gets the perfilTO value for this CarterasModeloTO.
     * 
     * @return perfilTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO getPerfilTO() {
        return perfilTO;
    }


    /**
     * Sets the perfilTO value for this CarterasModeloTO.
     * 
     * @param perfilTO
     */
    public void setPerfilTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO perfilTO) {
        this.perfilTO = perfilTO;
    }


    /**
     * Gets the perfilesAsociados value for this CarterasModeloTO.
     * 
     * @return perfilesAsociados
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO[] getPerfilesAsociados() {
        return perfilesAsociados;
    }


    /**
     * Sets the perfilesAsociados value for this CarterasModeloTO.
     * 
     * @param perfilesAsociados
     */
    public void setPerfilesAsociados(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO[] perfilesAsociados) {
        this.perfilesAsociados = perfilesAsociados;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO getPerfilesAsociados(int i) {
        return this.perfilesAsociados[i];
    }

    public void setPerfilesAsociados(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO _value) {
        this.perfilesAsociados[i] = _value;
    }


    /**
     * Gets the limiteGlobalTO value for this CarterasModeloTO.
     * 
     * @return limiteGlobalTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteGlobalTO getLimiteGlobalTO() {
        return limiteGlobalTO;
    }


    /**
     * Sets the limiteGlobalTO value for this CarterasModeloTO.
     * 
     * @param limiteGlobalTO
     */
    public void setLimiteGlobalTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteGlobalTO limiteGlobalTO) {
        this.limiteGlobalTO = limiteGlobalTO;
    }


    /**
     * Gets the limites value for this CarterasModeloTO.
     * 
     * @return limites
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteTO[] getLimites() {
        return limites;
    }


    /**
     * Sets the limites value for this CarterasModeloTO.
     * 
     * @param limites
     */
    public void setLimites(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteTO[] limites) {
        this.limites = limites;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteTO getLimites(int i) {
        return this.limites[i];
    }

    public void setLimites(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.LimiteTO _value) {
        this.limites[i] = _value;
    }


    /**
     * Gets the unidadTiempoTOVigor value for this CarterasModeloTO.
     * 
     * @return unidadTiempoTOVigor
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UnidadTiempoTO getUnidadTiempoTOVigor() {
        return unidadTiempoTOVigor;
    }


    /**
     * Sets the unidadTiempoTOVigor value for this CarterasModeloTO.
     * 
     * @param unidadTiempoTOVigor
     */
    public void setUnidadTiempoTOVigor(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UnidadTiempoTO unidadTiempoTOVigor) {
        this.unidadTiempoTOVigor = unidadTiempoTOVigor;
    }


    /**
     * Gets the unidadTiempoTOVigencia value for this CarterasModeloTO.
     * 
     * @return unidadTiempoTOVigencia
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UnidadTiempoTO getUnidadTiempoTOVigencia() {
        return unidadTiempoTOVigencia;
    }


    /**
     * Sets the unidadTiempoTOVigencia value for this CarterasModeloTO.
     * 
     * @param unidadTiempoTOVigencia
     */
    public void setUnidadTiempoTOVigencia(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.UnidadTiempoTO unidadTiempoTOVigencia) {
        this.unidadTiempoTOVigencia = unidadTiempoTOVigencia;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CarterasModeloTO)) return false;
        CarterasModeloTO other = (CarterasModeloTO) obj;
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
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.sFechaCreacion==null && other.getSFechaCreacion()==null) || 
             (this.sFechaCreacion!=null &&
              this.sFechaCreacion.equals(other.getSFechaCreacion()))) &&
            ((this.sFechaVigencia==null && other.getSFechaVigencia()==null) || 
             (this.sFechaVigencia!=null &&
              this.sFechaVigencia.equals(other.getSFechaVigencia()))) &&
            ((this.sFechaUltimaModificacion==null && other.getSFechaUltimaModificacion()==null) || 
             (this.sFechaUltimaModificacion!=null &&
              this.sFechaUltimaModificacion.equals(other.getSFechaUltimaModificacion()))) &&
            ((this.sFechaEntradaVigor==null && other.getSFechaEntradaVigor()==null) || 
             (this.sFechaEntradaVigor!=null &&
              this.sFechaEntradaVigor.equals(other.getSFechaEntradaVigor()))) &&
            ((this.periodoActualizacion==null && other.getPeriodoActualizacion()==null) || 
             (this.periodoActualizacion!=null &&
              this.periodoActualizacion.equals(other.getPeriodoActualizacion()))) &&
            ((this.esCarteraDefault==null && other.getEsCarteraDefault()==null) || 
             (this.esCarteraDefault!=null &&
              this.esCarteraDefault.equals(other.getEsCarteraDefault()))) &&
            ((this.vigente==null && other.getVigente()==null) || 
             (this.vigente!=null &&
              this.vigente.equals(other.getVigente()))) &&
            ((this.estadoTO==null && other.getEstadoTO()==null) || 
             (this.estadoTO!=null &&
              this.estadoTO.equals(other.getEstadoTO()))) &&
            ((this.usuarioTO==null && other.getUsuarioTO()==null) || 
             (this.usuarioTO!=null &&
              this.usuarioTO.equals(other.getUsuarioTO()))) &&
            ((this.tipoCarteraTO==null && other.getTipoCarteraTO()==null) || 
             (this.tipoCarteraTO!=null &&
              this.tipoCarteraTO.equals(other.getTipoCarteraTO()))) &&
            ((this.perfilTO==null && other.getPerfilTO()==null) || 
             (this.perfilTO!=null &&
              this.perfilTO.equals(other.getPerfilTO()))) &&
            ((this.perfilesAsociados==null && other.getPerfilesAsociados()==null) || 
             (this.perfilesAsociados!=null &&
              java.util.Arrays.equals(this.perfilesAsociados, other.getPerfilesAsociados()))) &&
            ((this.limiteGlobalTO==null && other.getLimiteGlobalTO()==null) || 
             (this.limiteGlobalTO!=null &&
              this.limiteGlobalTO.equals(other.getLimiteGlobalTO()))) &&
            ((this.limites==null && other.getLimites()==null) || 
             (this.limites!=null &&
              java.util.Arrays.equals(this.limites, other.getLimites()))) &&
            ((this.unidadTiempoTOVigor==null && other.getUnidadTiempoTOVigor()==null) || 
             (this.unidadTiempoTOVigor!=null &&
              this.unidadTiempoTOVigor.equals(other.getUnidadTiempoTOVigor()))) &&
            ((this.unidadTiempoTOVigencia==null && other.getUnidadTiempoTOVigencia()==null) || 
             (this.unidadTiempoTOVigencia!=null &&
              this.unidadTiempoTOVigencia.equals(other.getUnidadTiempoTOVigencia())));
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
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getSFechaCreacion() != null) {
            _hashCode += getSFechaCreacion().hashCode();
        }
        if (getSFechaVigencia() != null) {
            _hashCode += getSFechaVigencia().hashCode();
        }
        if (getSFechaUltimaModificacion() != null) {
            _hashCode += getSFechaUltimaModificacion().hashCode();
        }
        if (getSFechaEntradaVigor() != null) {
            _hashCode += getSFechaEntradaVigor().hashCode();
        }
        if (getPeriodoActualizacion() != null) {
            _hashCode += getPeriodoActualizacion().hashCode();
        }
        if (getEsCarteraDefault() != null) {
            _hashCode += getEsCarteraDefault().hashCode();
        }
        if (getVigente() != null) {
            _hashCode += getVigente().hashCode();
        }
        if (getEstadoTO() != null) {
            _hashCode += getEstadoTO().hashCode();
        }
        if (getUsuarioTO() != null) {
            _hashCode += getUsuarioTO().hashCode();
        }
        if (getTipoCarteraTO() != null) {
            _hashCode += getTipoCarteraTO().hashCode();
        }
        if (getPerfilTO() != null) {
            _hashCode += getPerfilTO().hashCode();
        }
        if (getPerfilesAsociados() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPerfilesAsociados());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPerfilesAsociados(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLimiteGlobalTO() != null) {
            _hashCode += getLimiteGlobalTO().hashCode();
        }
        if (getLimites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLimites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLimites(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnidadTiempoTOVigor() != null) {
            _hashCode += getUnidadTiempoTOVigor().hashCode();
        }
        if (getUnidadTiempoTOVigencia() != null) {
            _hashCode += getUnidadTiempoTOVigencia().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CarterasModeloTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "carterasModeloTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
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
        elemField.setFieldName("SFechaCreacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sFechaCreacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFechaVigencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sFechaVigencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFechaUltimaModificacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sFechaUltimaModificacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFechaEntradaVigor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sFechaEntradaVigor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodoActualizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "periodoActualizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esCarteraDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esCarteraDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vigente");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vigente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estadoTO"));
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
        elemField.setFieldName("tipoCarteraTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoCarteraTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoCarteraTO"));
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
        elemField.setFieldName("perfilesAsociados");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfilesAsociados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "perfilTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limiteGlobalTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limiteGlobalTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "limiteGlobalTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("limites");
        elemField.setXmlName(new javax.xml.namespace.QName("", "limites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "limiteTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadTiempoTOVigor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidadTiempoTOVigor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "unidadTiempoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unidadTiempoTOVigencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unidadTiempoTOVigencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "unidadTiempoTO"));
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
