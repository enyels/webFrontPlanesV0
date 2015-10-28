/**
 * CriteriosCarterasModeloTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo;

public class CriteriosCarterasModeloTO  implements java.io.Serializable {
    private java.lang.Boolean carteraDefault;

    private java.lang.String nombre;

    private java.lang.String rangoFinFActualizacion;

    private java.lang.String rangoFinFCreacion;

    private java.lang.String rangoFinFEntradaVigor;

    private java.lang.String rangoFinFvigencia;

    private java.lang.String rangoInicioFActualizacion;

    private java.lang.String rangoInicioFCreacion;

    private java.lang.String rangoInicioFEntradaVigor;

    private java.lang.String rangoInicioFVigencia;

    private java.lang.String usuarioCreador;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO estadoTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO perfilTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO tipoCarteraTO;

    private java.lang.Boolean consultarTodos;

    private java.lang.Boolean esMenoresPerfil;

    public CriteriosCarterasModeloTO() {
    }

    public CriteriosCarterasModeloTO(
           java.lang.Boolean carteraDefault,
           java.lang.String nombre,
           java.lang.String rangoFinFActualizacion,
           java.lang.String rangoFinFCreacion,
           java.lang.String rangoFinFEntradaVigor,
           java.lang.String rangoFinFvigencia,
           java.lang.String rangoInicioFActualizacion,
           java.lang.String rangoInicioFCreacion,
           java.lang.String rangoInicioFEntradaVigor,
           java.lang.String rangoInicioFVigencia,
           java.lang.String usuarioCreador,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO estadoTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO perfilTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO tipoCarteraTO,
           java.lang.Boolean consultarTodos,
           java.lang.Boolean esMenoresPerfil) {
           this.carteraDefault = carteraDefault;
           this.nombre = nombre;
           this.rangoFinFActualizacion = rangoFinFActualizacion;
           this.rangoFinFCreacion = rangoFinFCreacion;
           this.rangoFinFEntradaVigor = rangoFinFEntradaVigor;
           this.rangoFinFvigencia = rangoFinFvigencia;
           this.rangoInicioFActualizacion = rangoInicioFActualizacion;
           this.rangoInicioFCreacion = rangoInicioFCreacion;
           this.rangoInicioFEntradaVigor = rangoInicioFEntradaVigor;
           this.rangoInicioFVigencia = rangoInicioFVigencia;
           this.usuarioCreador = usuarioCreador;
           this.estadoTO = estadoTO;
           this.perfilTO = perfilTO;
           this.tipoCarteraTO = tipoCarteraTO;
           this.consultarTodos = consultarTodos;
           this.esMenoresPerfil = esMenoresPerfil;
    }


    /**
     * Gets the carteraDefault value for this CriteriosCarterasModeloTO.
     * 
     * @return carteraDefault
     */
    public java.lang.Boolean getCarteraDefault() {
        return carteraDefault;
    }


    /**
     * Sets the carteraDefault value for this CriteriosCarterasModeloTO.
     * 
     * @param carteraDefault
     */
    public void setCarteraDefault(java.lang.Boolean carteraDefault) {
        this.carteraDefault = carteraDefault;
    }


    /**
     * Gets the nombre value for this CriteriosCarterasModeloTO.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this CriteriosCarterasModeloTO.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the rangoFinFActualizacion value for this CriteriosCarterasModeloTO.
     * 
     * @return rangoFinFActualizacion
     */
    public java.lang.String getRangoFinFActualizacion() {
        return rangoFinFActualizacion;
    }


    /**
     * Sets the rangoFinFActualizacion value for this CriteriosCarterasModeloTO.
     * 
     * @param rangoFinFActualizacion
     */
    public void setRangoFinFActualizacion(java.lang.String rangoFinFActualizacion) {
        this.rangoFinFActualizacion = rangoFinFActualizacion;
    }


    /**
     * Gets the rangoFinFCreacion value for this CriteriosCarterasModeloTO.
     * 
     * @return rangoFinFCreacion
     */
    public java.lang.String getRangoFinFCreacion() {
        return rangoFinFCreacion;
    }


    /**
     * Sets the rangoFinFCreacion value for this CriteriosCarterasModeloTO.
     * 
     * @param rangoFinFCreacion
     */
    public void setRangoFinFCreacion(java.lang.String rangoFinFCreacion) {
        this.rangoFinFCreacion = rangoFinFCreacion;
    }


    /**
     * Gets the rangoFinFEntradaVigor value for this CriteriosCarterasModeloTO.
     * 
     * @return rangoFinFEntradaVigor
     */
    public java.lang.String getRangoFinFEntradaVigor() {
        return rangoFinFEntradaVigor;
    }


    /**
     * Sets the rangoFinFEntradaVigor value for this CriteriosCarterasModeloTO.
     * 
     * @param rangoFinFEntradaVigor
     */
    public void setRangoFinFEntradaVigor(java.lang.String rangoFinFEntradaVigor) {
        this.rangoFinFEntradaVigor = rangoFinFEntradaVigor;
    }


    /**
     * Gets the rangoFinFvigencia value for this CriteriosCarterasModeloTO.
     * 
     * @return rangoFinFvigencia
     */
    public java.lang.String getRangoFinFvigencia() {
        return rangoFinFvigencia;
    }


    /**
     * Sets the rangoFinFvigencia value for this CriteriosCarterasModeloTO.
     * 
     * @param rangoFinFvigencia
     */
    public void setRangoFinFvigencia(java.lang.String rangoFinFvigencia) {
        this.rangoFinFvigencia = rangoFinFvigencia;
    }


    /**
     * Gets the rangoInicioFActualizacion value for this CriteriosCarterasModeloTO.
     * 
     * @return rangoInicioFActualizacion
     */
    public java.lang.String getRangoInicioFActualizacion() {
        return rangoInicioFActualizacion;
    }


    /**
     * Sets the rangoInicioFActualizacion value for this CriteriosCarterasModeloTO.
     * 
     * @param rangoInicioFActualizacion
     */
    public void setRangoInicioFActualizacion(java.lang.String rangoInicioFActualizacion) {
        this.rangoInicioFActualizacion = rangoInicioFActualizacion;
    }


    /**
     * Gets the rangoInicioFCreacion value for this CriteriosCarterasModeloTO.
     * 
     * @return rangoInicioFCreacion
     */
    public java.lang.String getRangoInicioFCreacion() {
        return rangoInicioFCreacion;
    }


    /**
     * Sets the rangoInicioFCreacion value for this CriteriosCarterasModeloTO.
     * 
     * @param rangoInicioFCreacion
     */
    public void setRangoInicioFCreacion(java.lang.String rangoInicioFCreacion) {
        this.rangoInicioFCreacion = rangoInicioFCreacion;
    }


    /**
     * Gets the rangoInicioFEntradaVigor value for this CriteriosCarterasModeloTO.
     * 
     * @return rangoInicioFEntradaVigor
     */
    public java.lang.String getRangoInicioFEntradaVigor() {
        return rangoInicioFEntradaVigor;
    }


    /**
     * Sets the rangoInicioFEntradaVigor value for this CriteriosCarterasModeloTO.
     * 
     * @param rangoInicioFEntradaVigor
     */
    public void setRangoInicioFEntradaVigor(java.lang.String rangoInicioFEntradaVigor) {
        this.rangoInicioFEntradaVigor = rangoInicioFEntradaVigor;
    }


    /**
     * Gets the rangoInicioFVigencia value for this CriteriosCarterasModeloTO.
     * 
     * @return rangoInicioFVigencia
     */
    public java.lang.String getRangoInicioFVigencia() {
        return rangoInicioFVigencia;
    }


    /**
     * Sets the rangoInicioFVigencia value for this CriteriosCarterasModeloTO.
     * 
     * @param rangoInicioFVigencia
     */
    public void setRangoInicioFVigencia(java.lang.String rangoInicioFVigencia) {
        this.rangoInicioFVigencia = rangoInicioFVigencia;
    }


    /**
     * Gets the usuarioCreador value for this CriteriosCarterasModeloTO.
     * 
     * @return usuarioCreador
     */
    public java.lang.String getUsuarioCreador() {
        return usuarioCreador;
    }


    /**
     * Sets the usuarioCreador value for this CriteriosCarterasModeloTO.
     * 
     * @param usuarioCreador
     */
    public void setUsuarioCreador(java.lang.String usuarioCreador) {
        this.usuarioCreador = usuarioCreador;
    }


    /**
     * Gets the estadoTO value for this CriteriosCarterasModeloTO.
     * 
     * @return estadoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO getEstadoTO() {
        return estadoTO;
    }


    /**
     * Sets the estadoTO value for this CriteriosCarterasModeloTO.
     * 
     * @param estadoTO
     */
    public void setEstadoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.EstadoTO estadoTO) {
        this.estadoTO = estadoTO;
    }


    /**
     * Gets the perfilTO value for this CriteriosCarterasModeloTO.
     * 
     * @return perfilTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO getPerfilTO() {
        return perfilTO;
    }


    /**
     * Sets the perfilTO value for this CriteriosCarterasModeloTO.
     * 
     * @param perfilTO
     */
    public void setPerfilTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.PerfilTO perfilTO) {
        this.perfilTO = perfilTO;
    }


    /**
     * Gets the tipoCarteraTO value for this CriteriosCarterasModeloTO.
     * 
     * @return tipoCarteraTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO getTipoCarteraTO() {
        return tipoCarteraTO;
    }


    /**
     * Sets the tipoCarteraTO value for this CriteriosCarterasModeloTO.
     * 
     * @param tipoCarteraTO
     */
    public void setTipoCarteraTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.carterasModelo.TipoCarteraTO tipoCarteraTO) {
        this.tipoCarteraTO = tipoCarteraTO;
    }


    /**
     * Gets the consultarTodos value for this CriteriosCarterasModeloTO.
     * 
     * @return consultarTodos
     */
    public java.lang.Boolean getConsultarTodos() {
        return consultarTodos;
    }


    /**
     * Sets the consultarTodos value for this CriteriosCarterasModeloTO.
     * 
     * @param consultarTodos
     */
    public void setConsultarTodos(java.lang.Boolean consultarTodos) {
        this.consultarTodos = consultarTodos;
    }


    /**
     * Gets the esMenoresPerfil value for this CriteriosCarterasModeloTO.
     * 
     * @return esMenoresPerfil
     */
    public java.lang.Boolean getEsMenoresPerfil() {
        return esMenoresPerfil;
    }


    /**
     * Sets the esMenoresPerfil value for this CriteriosCarterasModeloTO.
     * 
     * @param esMenoresPerfil
     */
    public void setEsMenoresPerfil(java.lang.Boolean esMenoresPerfil) {
        this.esMenoresPerfil = esMenoresPerfil;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CriteriosCarterasModeloTO)) return false;
        CriteriosCarterasModeloTO other = (CriteriosCarterasModeloTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carteraDefault==null && other.getCarteraDefault()==null) || 
             (this.carteraDefault!=null &&
              this.carteraDefault.equals(other.getCarteraDefault()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.rangoFinFActualizacion==null && other.getRangoFinFActualizacion()==null) || 
             (this.rangoFinFActualizacion!=null &&
              this.rangoFinFActualizacion.equals(other.getRangoFinFActualizacion()))) &&
            ((this.rangoFinFCreacion==null && other.getRangoFinFCreacion()==null) || 
             (this.rangoFinFCreacion!=null &&
              this.rangoFinFCreacion.equals(other.getRangoFinFCreacion()))) &&
            ((this.rangoFinFEntradaVigor==null && other.getRangoFinFEntradaVigor()==null) || 
             (this.rangoFinFEntradaVigor!=null &&
              this.rangoFinFEntradaVigor.equals(other.getRangoFinFEntradaVigor()))) &&
            ((this.rangoFinFvigencia==null && other.getRangoFinFvigencia()==null) || 
             (this.rangoFinFvigencia!=null &&
              this.rangoFinFvigencia.equals(other.getRangoFinFvigencia()))) &&
            ((this.rangoInicioFActualizacion==null && other.getRangoInicioFActualizacion()==null) || 
             (this.rangoInicioFActualizacion!=null &&
              this.rangoInicioFActualizacion.equals(other.getRangoInicioFActualizacion()))) &&
            ((this.rangoInicioFCreacion==null && other.getRangoInicioFCreacion()==null) || 
             (this.rangoInicioFCreacion!=null &&
              this.rangoInicioFCreacion.equals(other.getRangoInicioFCreacion()))) &&
            ((this.rangoInicioFEntradaVigor==null && other.getRangoInicioFEntradaVigor()==null) || 
             (this.rangoInicioFEntradaVigor!=null &&
              this.rangoInicioFEntradaVigor.equals(other.getRangoInicioFEntradaVigor()))) &&
            ((this.rangoInicioFVigencia==null && other.getRangoInicioFVigencia()==null) || 
             (this.rangoInicioFVigencia!=null &&
              this.rangoInicioFVigencia.equals(other.getRangoInicioFVigencia()))) &&
            ((this.usuarioCreador==null && other.getUsuarioCreador()==null) || 
             (this.usuarioCreador!=null &&
              this.usuarioCreador.equals(other.getUsuarioCreador()))) &&
            ((this.estadoTO==null && other.getEstadoTO()==null) || 
             (this.estadoTO!=null &&
              this.estadoTO.equals(other.getEstadoTO()))) &&
            ((this.perfilTO==null && other.getPerfilTO()==null) || 
             (this.perfilTO!=null &&
              this.perfilTO.equals(other.getPerfilTO()))) &&
            ((this.tipoCarteraTO==null && other.getTipoCarteraTO()==null) || 
             (this.tipoCarteraTO!=null &&
              this.tipoCarteraTO.equals(other.getTipoCarteraTO()))) &&
            ((this.consultarTodos==null && other.getConsultarTodos()==null) || 
             (this.consultarTodos!=null &&
              this.consultarTodos.equals(other.getConsultarTodos()))) &&
            ((this.esMenoresPerfil==null && other.getEsMenoresPerfil()==null) || 
             (this.esMenoresPerfil!=null &&
              this.esMenoresPerfil.equals(other.getEsMenoresPerfil())));
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
        if (getCarteraDefault() != null) {
            _hashCode += getCarteraDefault().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getRangoFinFActualizacion() != null) {
            _hashCode += getRangoFinFActualizacion().hashCode();
        }
        if (getRangoFinFCreacion() != null) {
            _hashCode += getRangoFinFCreacion().hashCode();
        }
        if (getRangoFinFEntradaVigor() != null) {
            _hashCode += getRangoFinFEntradaVigor().hashCode();
        }
        if (getRangoFinFvigencia() != null) {
            _hashCode += getRangoFinFvigencia().hashCode();
        }
        if (getRangoInicioFActualizacion() != null) {
            _hashCode += getRangoInicioFActualizacion().hashCode();
        }
        if (getRangoInicioFCreacion() != null) {
            _hashCode += getRangoInicioFCreacion().hashCode();
        }
        if (getRangoInicioFEntradaVigor() != null) {
            _hashCode += getRangoInicioFEntradaVigor().hashCode();
        }
        if (getRangoInicioFVigencia() != null) {
            _hashCode += getRangoInicioFVigencia().hashCode();
        }
        if (getUsuarioCreador() != null) {
            _hashCode += getUsuarioCreador().hashCode();
        }
        if (getEstadoTO() != null) {
            _hashCode += getEstadoTO().hashCode();
        }
        if (getPerfilTO() != null) {
            _hashCode += getPerfilTO().hashCode();
        }
        if (getTipoCarteraTO() != null) {
            _hashCode += getTipoCarteraTO().hashCode();
        }
        if (getConsultarTodos() != null) {
            _hashCode += getConsultarTodos().hashCode();
        }
        if (getEsMenoresPerfil() != null) {
            _hashCode += getEsMenoresPerfil().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CriteriosCarterasModeloTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "CriteriosCarterasModeloTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carteraDefault");
        elemField.setXmlName(new javax.xml.namespace.QName("", "carteraDefault"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("rangoFinFActualizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rangoFinFActualizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangoFinFCreacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rangoFinFCreacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangoFinFEntradaVigor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rangoFinFEntradaVigor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangoFinFvigencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rangoFinFvigencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangoInicioFActualizacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rangoInicioFActualizacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangoInicioFCreacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rangoInicioFCreacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangoInicioFEntradaVigor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rangoInicioFEntradaVigor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rangoInicioFVigencia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rangoInicioFVigencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioCreador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioCreador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("perfilTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "perfilTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://carterasModelo.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "perfilTO"));
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
        elemField.setFieldName("consultarTodos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consultarTodos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esMenoresPerfil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esMenoresPerfil"));
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
