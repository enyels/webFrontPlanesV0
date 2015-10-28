/**
 * PosicionTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class PosicionTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ProductoTO productoTO;

    private java.lang.String fechaPosicion;

    private java.lang.Long titulosEmision;

    private java.lang.Double importeEmision;

    private java.lang.Double importeCartera;

    private java.lang.Double porcentajeEmision;

    private java.lang.Long idAgrupador;

    private java.lang.String nombreAgrupador;

    private java.lang.Long idSubgrupo;

    private java.lang.String nombrSubgrupo;

    private java.lang.Long idPerfil;

    private java.lang.Double porcentajeLimitePSubgrupo;

    private java.lang.Long idTipoOperacion;

    private java.lang.Long agrupadorLimiteGlobal;

    private java.lang.Double porcentajeLimiteGlobal;

    private java.lang.Boolean subgrupoFueraPerfil;

    private java.lang.Boolean agrupadorFueraPerfil;

    private java.lang.Boolean esCompra;

    private java.lang.Boolean subgrupoMinFueraPerfil;

    private java.lang.Double porcentajeMinLiq;

    public PosicionTO() {
    }

    public PosicionTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ProductoTO productoTO,
           java.lang.String fechaPosicion,
           java.lang.Long titulosEmision,
           java.lang.Double importeEmision,
           java.lang.Double importeCartera,
           java.lang.Double porcentajeEmision,
           java.lang.Long idAgrupador,
           java.lang.String nombreAgrupador,
           java.lang.Long idSubgrupo,
           java.lang.String nombrSubgrupo,
           java.lang.Long idPerfil,
           java.lang.Double porcentajeLimitePSubgrupo,
           java.lang.Long idTipoOperacion,
           java.lang.Long agrupadorLimiteGlobal,
           java.lang.Double porcentajeLimiteGlobal,
           java.lang.Boolean subgrupoFueraPerfil,
           java.lang.Boolean agrupadorFueraPerfil,
           java.lang.Boolean esCompra,
           java.lang.Boolean subgrupoMinFueraPerfil,
           java.lang.Double porcentajeMinLiq) {
           this.productoTO = productoTO;
           this.fechaPosicion = fechaPosicion;
           this.titulosEmision = titulosEmision;
           this.importeEmision = importeEmision;
           this.importeCartera = importeCartera;
           this.porcentajeEmision = porcentajeEmision;
           this.idAgrupador = idAgrupador;
           this.nombreAgrupador = nombreAgrupador;
           this.idSubgrupo = idSubgrupo;
           this.nombrSubgrupo = nombrSubgrupo;
           this.idPerfil = idPerfil;
           this.porcentajeLimitePSubgrupo = porcentajeLimitePSubgrupo;
           this.idTipoOperacion = idTipoOperacion;
           this.agrupadorLimiteGlobal = agrupadorLimiteGlobal;
           this.porcentajeLimiteGlobal = porcentajeLimiteGlobal;
           this.subgrupoFueraPerfil = subgrupoFueraPerfil;
           this.agrupadorFueraPerfil = agrupadorFueraPerfil;
           this.esCompra = esCompra;
           this.subgrupoMinFueraPerfil = subgrupoMinFueraPerfil;
           this.porcentajeMinLiq = porcentajeMinLiq;
    }


    /**
     * Gets the productoTO value for this PosicionTO.
     * 
     * @return productoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ProductoTO getProductoTO() {
        return productoTO;
    }


    /**
     * Sets the productoTO value for this PosicionTO.
     * 
     * @param productoTO
     */
    public void setProductoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ProductoTO productoTO) {
        this.productoTO = productoTO;
    }


    /**
     * Gets the fechaPosicion value for this PosicionTO.
     * 
     * @return fechaPosicion
     */
    public java.lang.String getFechaPosicion() {
        return fechaPosicion;
    }


    /**
     * Sets the fechaPosicion value for this PosicionTO.
     * 
     * @param fechaPosicion
     */
    public void setFechaPosicion(java.lang.String fechaPosicion) {
        this.fechaPosicion = fechaPosicion;
    }


    /**
     * Gets the titulosEmision value for this PosicionTO.
     * 
     * @return titulosEmision
     */
    public java.lang.Long getTitulosEmision() {
        return titulosEmision;
    }


    /**
     * Sets the titulosEmision value for this PosicionTO.
     * 
     * @param titulosEmision
     */
    public void setTitulosEmision(java.lang.Long titulosEmision) {
        this.titulosEmision = titulosEmision;
    }


    /**
     * Gets the importeEmision value for this PosicionTO.
     * 
     * @return importeEmision
     */
    public java.lang.Double getImporteEmision() {
        return importeEmision;
    }


    /**
     * Sets the importeEmision value for this PosicionTO.
     * 
     * @param importeEmision
     */
    public void setImporteEmision(java.lang.Double importeEmision) {
        this.importeEmision = importeEmision;
    }


    /**
     * Gets the importeCartera value for this PosicionTO.
     * 
     * @return importeCartera
     */
    public java.lang.Double getImporteCartera() {
        return importeCartera;
    }


    /**
     * Sets the importeCartera value for this PosicionTO.
     * 
     * @param importeCartera
     */
    public void setImporteCartera(java.lang.Double importeCartera) {
        this.importeCartera = importeCartera;
    }


    /**
     * Gets the porcentajeEmision value for this PosicionTO.
     * 
     * @return porcentajeEmision
     */
    public java.lang.Double getPorcentajeEmision() {
        return porcentajeEmision;
    }


    /**
     * Sets the porcentajeEmision value for this PosicionTO.
     * 
     * @param porcentajeEmision
     */
    public void setPorcentajeEmision(java.lang.Double porcentajeEmision) {
        this.porcentajeEmision = porcentajeEmision;
    }


    /**
     * Gets the idAgrupador value for this PosicionTO.
     * 
     * @return idAgrupador
     */
    public java.lang.Long getIdAgrupador() {
        return idAgrupador;
    }


    /**
     * Sets the idAgrupador value for this PosicionTO.
     * 
     * @param idAgrupador
     */
    public void setIdAgrupador(java.lang.Long idAgrupador) {
        this.idAgrupador = idAgrupador;
    }


    /**
     * Gets the nombreAgrupador value for this PosicionTO.
     * 
     * @return nombreAgrupador
     */
    public java.lang.String getNombreAgrupador() {
        return nombreAgrupador;
    }


    /**
     * Sets the nombreAgrupador value for this PosicionTO.
     * 
     * @param nombreAgrupador
     */
    public void setNombreAgrupador(java.lang.String nombreAgrupador) {
        this.nombreAgrupador = nombreAgrupador;
    }


    /**
     * Gets the idSubgrupo value for this PosicionTO.
     * 
     * @return idSubgrupo
     */
    public java.lang.Long getIdSubgrupo() {
        return idSubgrupo;
    }


    /**
     * Sets the idSubgrupo value for this PosicionTO.
     * 
     * @param idSubgrupo
     */
    public void setIdSubgrupo(java.lang.Long idSubgrupo) {
        this.idSubgrupo = idSubgrupo;
    }


    /**
     * Gets the nombrSubgrupo value for this PosicionTO.
     * 
     * @return nombrSubgrupo
     */
    public java.lang.String getNombrSubgrupo() {
        return nombrSubgrupo;
    }


    /**
     * Sets the nombrSubgrupo value for this PosicionTO.
     * 
     * @param nombrSubgrupo
     */
    public void setNombrSubgrupo(java.lang.String nombrSubgrupo) {
        this.nombrSubgrupo = nombrSubgrupo;
    }


    /**
     * Gets the idPerfil value for this PosicionTO.
     * 
     * @return idPerfil
     */
    public java.lang.Long getIdPerfil() {
        return idPerfil;
    }


    /**
     * Sets the idPerfil value for this PosicionTO.
     * 
     * @param idPerfil
     */
    public void setIdPerfil(java.lang.Long idPerfil) {
        this.idPerfil = idPerfil;
    }


    /**
     * Gets the porcentajeLimitePSubgrupo value for this PosicionTO.
     * 
     * @return porcentajeLimitePSubgrupo
     */
    public java.lang.Double getPorcentajeLimitePSubgrupo() {
        return porcentajeLimitePSubgrupo;
    }


    /**
     * Sets the porcentajeLimitePSubgrupo value for this PosicionTO.
     * 
     * @param porcentajeLimitePSubgrupo
     */
    public void setPorcentajeLimitePSubgrupo(java.lang.Double porcentajeLimitePSubgrupo) {
        this.porcentajeLimitePSubgrupo = porcentajeLimitePSubgrupo;
    }


    /**
     * Gets the idTipoOperacion value for this PosicionTO.
     * 
     * @return idTipoOperacion
     */
    public java.lang.Long getIdTipoOperacion() {
        return idTipoOperacion;
    }


    /**
     * Sets the idTipoOperacion value for this PosicionTO.
     * 
     * @param idTipoOperacion
     */
    public void setIdTipoOperacion(java.lang.Long idTipoOperacion) {
        this.idTipoOperacion = idTipoOperacion;
    }


    /**
     * Gets the agrupadorLimiteGlobal value for this PosicionTO.
     * 
     * @return agrupadorLimiteGlobal
     */
    public java.lang.Long getAgrupadorLimiteGlobal() {
        return agrupadorLimiteGlobal;
    }


    /**
     * Sets the agrupadorLimiteGlobal value for this PosicionTO.
     * 
     * @param agrupadorLimiteGlobal
     */
    public void setAgrupadorLimiteGlobal(java.lang.Long agrupadorLimiteGlobal) {
        this.agrupadorLimiteGlobal = agrupadorLimiteGlobal;
    }


    /**
     * Gets the porcentajeLimiteGlobal value for this PosicionTO.
     * 
     * @return porcentajeLimiteGlobal
     */
    public java.lang.Double getPorcentajeLimiteGlobal() {
        return porcentajeLimiteGlobal;
    }


    /**
     * Sets the porcentajeLimiteGlobal value for this PosicionTO.
     * 
     * @param porcentajeLimiteGlobal
     */
    public void setPorcentajeLimiteGlobal(java.lang.Double porcentajeLimiteGlobal) {
        this.porcentajeLimiteGlobal = porcentajeLimiteGlobal;
    }


    /**
     * Gets the subgrupoFueraPerfil value for this PosicionTO.
     * 
     * @return subgrupoFueraPerfil
     */
    public java.lang.Boolean getSubgrupoFueraPerfil() {
        return subgrupoFueraPerfil;
    }


    /**
     * Sets the subgrupoFueraPerfil value for this PosicionTO.
     * 
     * @param subgrupoFueraPerfil
     */
    public void setSubgrupoFueraPerfil(java.lang.Boolean subgrupoFueraPerfil) {
        this.subgrupoFueraPerfil = subgrupoFueraPerfil;
    }


    /**
     * Gets the agrupadorFueraPerfil value for this PosicionTO.
     * 
     * @return agrupadorFueraPerfil
     */
    public java.lang.Boolean getAgrupadorFueraPerfil() {
        return agrupadorFueraPerfil;
    }


    /**
     * Sets the agrupadorFueraPerfil value for this PosicionTO.
     * 
     * @param agrupadorFueraPerfil
     */
    public void setAgrupadorFueraPerfil(java.lang.Boolean agrupadorFueraPerfil) {
        this.agrupadorFueraPerfil = agrupadorFueraPerfil;
    }


    /**
     * Gets the esCompra value for this PosicionTO.
     * 
     * @return esCompra
     */
    public java.lang.Boolean getEsCompra() {
        return esCompra;
    }


    /**
     * Sets the esCompra value for this PosicionTO.
     * 
     * @param esCompra
     */
    public void setEsCompra(java.lang.Boolean esCompra) {
        this.esCompra = esCompra;
    }


    /**
     * Gets the subgrupoMinFueraPerfil value for this PosicionTO.
     * 
     * @return subgrupoMinFueraPerfil
     */
    public java.lang.Boolean getSubgrupoMinFueraPerfil() {
        return subgrupoMinFueraPerfil;
    }


    /**
     * Sets the subgrupoMinFueraPerfil value for this PosicionTO.
     * 
     * @param subgrupoMinFueraPerfil
     */
    public void setSubgrupoMinFueraPerfil(java.lang.Boolean subgrupoMinFueraPerfil) {
        this.subgrupoMinFueraPerfil = subgrupoMinFueraPerfil;
    }


    /**
     * Gets the porcentajeMinLiq value for this PosicionTO.
     * 
     * @return porcentajeMinLiq
     */
    public java.lang.Double getPorcentajeMinLiq() {
        return porcentajeMinLiq;
    }


    /**
     * Sets the porcentajeMinLiq value for this PosicionTO.
     * 
     * @param porcentajeMinLiq
     */
    public void setPorcentajeMinLiq(java.lang.Double porcentajeMinLiq) {
        this.porcentajeMinLiq = porcentajeMinLiq;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PosicionTO)) return false;
        PosicionTO other = (PosicionTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productoTO==null && other.getProductoTO()==null) || 
             (this.productoTO!=null &&
              this.productoTO.equals(other.getProductoTO()))) &&
            ((this.fechaPosicion==null && other.getFechaPosicion()==null) || 
             (this.fechaPosicion!=null &&
              this.fechaPosicion.equals(other.getFechaPosicion()))) &&
            ((this.titulosEmision==null && other.getTitulosEmision()==null) || 
             (this.titulosEmision!=null &&
              this.titulosEmision.equals(other.getTitulosEmision()))) &&
            ((this.importeEmision==null && other.getImporteEmision()==null) || 
             (this.importeEmision!=null &&
              this.importeEmision.equals(other.getImporteEmision()))) &&
            ((this.importeCartera==null && other.getImporteCartera()==null) || 
             (this.importeCartera!=null &&
              this.importeCartera.equals(other.getImporteCartera()))) &&
            ((this.porcentajeEmision==null && other.getPorcentajeEmision()==null) || 
             (this.porcentajeEmision!=null &&
              this.porcentajeEmision.equals(other.getPorcentajeEmision()))) &&
            ((this.idAgrupador==null && other.getIdAgrupador()==null) || 
             (this.idAgrupador!=null &&
              this.idAgrupador.equals(other.getIdAgrupador()))) &&
            ((this.nombreAgrupador==null && other.getNombreAgrupador()==null) || 
             (this.nombreAgrupador!=null &&
              this.nombreAgrupador.equals(other.getNombreAgrupador()))) &&
            ((this.idSubgrupo==null && other.getIdSubgrupo()==null) || 
             (this.idSubgrupo!=null &&
              this.idSubgrupo.equals(other.getIdSubgrupo()))) &&
            ((this.nombrSubgrupo==null && other.getNombrSubgrupo()==null) || 
             (this.nombrSubgrupo!=null &&
              this.nombrSubgrupo.equals(other.getNombrSubgrupo()))) &&
            ((this.idPerfil==null && other.getIdPerfil()==null) || 
             (this.idPerfil!=null &&
              this.idPerfil.equals(other.getIdPerfil()))) &&
            ((this.porcentajeLimitePSubgrupo==null && other.getPorcentajeLimitePSubgrupo()==null) || 
             (this.porcentajeLimitePSubgrupo!=null &&
              this.porcentajeLimitePSubgrupo.equals(other.getPorcentajeLimitePSubgrupo()))) &&
            ((this.idTipoOperacion==null && other.getIdTipoOperacion()==null) || 
             (this.idTipoOperacion!=null &&
              this.idTipoOperacion.equals(other.getIdTipoOperacion()))) &&
            ((this.agrupadorLimiteGlobal==null && other.getAgrupadorLimiteGlobal()==null) || 
             (this.agrupadorLimiteGlobal!=null &&
              this.agrupadorLimiteGlobal.equals(other.getAgrupadorLimiteGlobal()))) &&
            ((this.porcentajeLimiteGlobal==null && other.getPorcentajeLimiteGlobal()==null) || 
             (this.porcentajeLimiteGlobal!=null &&
              this.porcentajeLimiteGlobal.equals(other.getPorcentajeLimiteGlobal()))) &&
            ((this.subgrupoFueraPerfil==null && other.getSubgrupoFueraPerfil()==null) || 
             (this.subgrupoFueraPerfil!=null &&
              this.subgrupoFueraPerfil.equals(other.getSubgrupoFueraPerfil()))) &&
            ((this.agrupadorFueraPerfil==null && other.getAgrupadorFueraPerfil()==null) || 
             (this.agrupadorFueraPerfil!=null &&
              this.agrupadorFueraPerfil.equals(other.getAgrupadorFueraPerfil()))) &&
            ((this.esCompra==null && other.getEsCompra()==null) || 
             (this.esCompra!=null &&
              this.esCompra.equals(other.getEsCompra()))) &&
            ((this.subgrupoMinFueraPerfil==null && other.getSubgrupoMinFueraPerfil()==null) || 
             (this.subgrupoMinFueraPerfil!=null &&
              this.subgrupoMinFueraPerfil.equals(other.getSubgrupoMinFueraPerfil()))) &&
            ((this.porcentajeMinLiq==null && other.getPorcentajeMinLiq()==null) || 
             (this.porcentajeMinLiq!=null &&
              this.porcentajeMinLiq.equals(other.getPorcentajeMinLiq())));
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
        if (getProductoTO() != null) {
            _hashCode += getProductoTO().hashCode();
        }
        if (getFechaPosicion() != null) {
            _hashCode += getFechaPosicion().hashCode();
        }
        if (getTitulosEmision() != null) {
            _hashCode += getTitulosEmision().hashCode();
        }
        if (getImporteEmision() != null) {
            _hashCode += getImporteEmision().hashCode();
        }
        if (getImporteCartera() != null) {
            _hashCode += getImporteCartera().hashCode();
        }
        if (getPorcentajeEmision() != null) {
            _hashCode += getPorcentajeEmision().hashCode();
        }
        if (getIdAgrupador() != null) {
            _hashCode += getIdAgrupador().hashCode();
        }
        if (getNombreAgrupador() != null) {
            _hashCode += getNombreAgrupador().hashCode();
        }
        if (getIdSubgrupo() != null) {
            _hashCode += getIdSubgrupo().hashCode();
        }
        if (getNombrSubgrupo() != null) {
            _hashCode += getNombrSubgrupo().hashCode();
        }
        if (getIdPerfil() != null) {
            _hashCode += getIdPerfil().hashCode();
        }
        if (getPorcentajeLimitePSubgrupo() != null) {
            _hashCode += getPorcentajeLimitePSubgrupo().hashCode();
        }
        if (getIdTipoOperacion() != null) {
            _hashCode += getIdTipoOperacion().hashCode();
        }
        if (getAgrupadorLimiteGlobal() != null) {
            _hashCode += getAgrupadorLimiteGlobal().hashCode();
        }
        if (getPorcentajeLimiteGlobal() != null) {
            _hashCode += getPorcentajeLimiteGlobal().hashCode();
        }
        if (getSubgrupoFueraPerfil() != null) {
            _hashCode += getSubgrupoFueraPerfil().hashCode();
        }
        if (getAgrupadorFueraPerfil() != null) {
            _hashCode += getAgrupadorFueraPerfil().hashCode();
        }
        if (getEsCompra() != null) {
            _hashCode += getEsCompra().hashCode();
        }
        if (getSubgrupoMinFueraPerfil() != null) {
            _hashCode += getSubgrupoMinFueraPerfil().hashCode();
        }
        if (getPorcentajeMinLiq() != null) {
            _hashCode += getPorcentajeMinLiq().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PosicionTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "posicionTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "productoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "productoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaPosicion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaPosicion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titulosEmision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titulosEmision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importeEmision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importeEmision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("importeCartera");
        elemField.setXmlName(new javax.xml.namespace.QName("", "importeCartera"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porcentajeEmision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "porcentajeEmision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAgrupador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idAgrupador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreAgrupador");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreAgrupador"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idSubgrupo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idSubgrupo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombrSubgrupo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombrSubgrupo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPerfil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPerfil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porcentajeLimitePSubgrupo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "porcentajeLimitePSubgrupo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idTipoOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idTipoOperacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agrupadorLimiteGlobal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agrupadorLimiteGlobal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porcentajeLimiteGlobal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "porcentajeLimiteGlobal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subgrupoFueraPerfil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subgrupoFueraPerfil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agrupadorFueraPerfil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "agrupadorFueraPerfil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("esCompra");
        elemField.setXmlName(new javax.xml.namespace.QName("", "esCompra"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subgrupoMinFueraPerfil");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subgrupoMinFueraPerfil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("porcentajeMinLiq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "porcentajeMinLiq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
