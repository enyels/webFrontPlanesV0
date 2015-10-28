/**
 * PlanDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.services.soap;

public class PlanDto  implements java.io.Serializable {
    private java.lang.Long idBurPlan;

    private java.lang.String idPlan;

    private java.lang.String plan;

    private java.lang.Long idEmpresa;

    private java.lang.Double costo;

    private java.lang.String idperiodicidad;

    private java.lang.String idAsigna;

    private java.lang.String idCobro;

    private java.lang.String fechaAlta;

    private java.lang.String fechaBaja;

    private java.lang.Long usuario;

    private int estatus;

    private int descripcion;

    private java.lang.Long idContrato;

    private java.lang.String nombrePlan;

    public PlanDto() {
    }

    public PlanDto(
           java.lang.Long idBurPlan,
           java.lang.String idPlan,
           java.lang.String plan,
           java.lang.Long idEmpresa,
           java.lang.Double costo,
           java.lang.String idperiodicidad,
           java.lang.String idAsigna,
           java.lang.String idCobro,
           java.lang.String fechaAlta,
           java.lang.String fechaBaja,
           java.lang.Long usuario,
           int estatus,
           int descripcion,
           java.lang.Long idContrato,
           java.lang.String nombrePlan) {
           this.idBurPlan = idBurPlan;
           this.idPlan = idPlan;
           this.plan = plan;
           this.idEmpresa = idEmpresa;
           this.costo = costo;
           this.idperiodicidad = idperiodicidad;
           this.idAsigna = idAsigna;
           this.idCobro = idCobro;
           this.fechaAlta = fechaAlta;
           this.fechaBaja = fechaBaja;
           this.usuario = usuario;
           this.estatus = estatus;
           this.descripcion = descripcion;
           this.idContrato = idContrato;
           this.nombrePlan = nombrePlan;
    }


    /**
     * Gets the idBurPlan value for this PlanDto.
     * 
     * @return idBurPlan
     */
    public java.lang.Long getIdBurPlan() {
        return idBurPlan;
    }


    /**
     * Sets the idBurPlan value for this PlanDto.
     * 
     * @param idBurPlan
     */
    public void setIdBurPlan(java.lang.Long idBurPlan) {
        this.idBurPlan = idBurPlan;
    }


    /**
     * Gets the idPlan value for this PlanDto.
     * 
     * @return idPlan
     */
    public java.lang.String getIdPlan() {
        return idPlan;
    }


    /**
     * Sets the idPlan value for this PlanDto.
     * 
     * @param idPlan
     */
    public void setIdPlan(java.lang.String idPlan) {
        this.idPlan = idPlan;
    }


    /**
     * Gets the plan value for this PlanDto.
     * 
     * @return plan
     */
    public java.lang.String getPlan() {
        return plan;
    }


    /**
     * Sets the plan value for this PlanDto.
     * 
     * @param plan
     */
    public void setPlan(java.lang.String plan) {
        this.plan = plan;
    }


    /**
     * Gets the idEmpresa value for this PlanDto.
     * 
     * @return idEmpresa
     */
    public java.lang.Long getIdEmpresa() {
        return idEmpresa;
    }


    /**
     * Sets the idEmpresa value for this PlanDto.
     * 
     * @param idEmpresa
     */
    public void setIdEmpresa(java.lang.Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }


    /**
     * Gets the costo value for this PlanDto.
     * 
     * @return costo
     */
    public java.lang.Double getCosto() {
        return costo;
    }


    /**
     * Sets the costo value for this PlanDto.
     * 
     * @param costo
     */
    public void setCosto(java.lang.Double costo) {
        this.costo = costo;
    }


    /**
     * Gets the idperiodicidad value for this PlanDto.
     * 
     * @return idperiodicidad
     */
    public java.lang.String getIdperiodicidad() {
        return idperiodicidad;
    }


    /**
     * Sets the idperiodicidad value for this PlanDto.
     * 
     * @param idperiodicidad
     */
    public void setIdperiodicidad(java.lang.String idperiodicidad) {
        this.idperiodicidad = idperiodicidad;
    }


    /**
     * Gets the idAsigna value for this PlanDto.
     * 
     * @return idAsigna
     */
    public java.lang.String getIdAsigna() {
        return idAsigna;
    }


    /**
     * Sets the idAsigna value for this PlanDto.
     * 
     * @param idAsigna
     */
    public void setIdAsigna(java.lang.String idAsigna) {
        this.idAsigna = idAsigna;
    }


    /**
     * Gets the idCobro value for this PlanDto.
     * 
     * @return idCobro
     */
    public java.lang.String getIdCobro() {
        return idCobro;
    }


    /**
     * Sets the idCobro value for this PlanDto.
     * 
     * @param idCobro
     */
    public void setIdCobro(java.lang.String idCobro) {
        this.idCobro = idCobro;
    }


    /**
     * Gets the fechaAlta value for this PlanDto.
     * 
     * @return fechaAlta
     */
    public java.lang.String getFechaAlta() {
        return fechaAlta;
    }


    /**
     * Sets the fechaAlta value for this PlanDto.
     * 
     * @param fechaAlta
     */
    public void setFechaAlta(java.lang.String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }


    /**
     * Gets the fechaBaja value for this PlanDto.
     * 
     * @return fechaBaja
     */
    public java.lang.String getFechaBaja() {
        return fechaBaja;
    }


    /**
     * Sets the fechaBaja value for this PlanDto.
     * 
     * @param fechaBaja
     */
    public void setFechaBaja(java.lang.String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }


    /**
     * Gets the usuario value for this PlanDto.
     * 
     * @return usuario
     */
    public java.lang.Long getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this PlanDto.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.Long usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the estatus value for this PlanDto.
     * 
     * @return estatus
     */
    public int getEstatus() {
        return estatus;
    }


    /**
     * Sets the estatus value for this PlanDto.
     * 
     * @param estatus
     */
    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }


    /**
     * Gets the descripcion value for this PlanDto.
     * 
     * @return descripcion
     */
    public int getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this PlanDto.
     * 
     * @param descripcion
     */
    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }


    /**
     * Gets the idContrato value for this PlanDto.
     * 
     * @return idContrato
     */
    public java.lang.Long getIdContrato() {
        return idContrato;
    }


    /**
     * Sets the idContrato value for this PlanDto.
     * 
     * @param idContrato
     */
    public void setIdContrato(java.lang.Long idContrato) {
        this.idContrato = idContrato;
    }


    /**
     * Gets the nombrePlan value for this PlanDto.
     * 
     * @return nombrePlan
     */
    public java.lang.String getNombrePlan() {
        return nombrePlan;
    }


    /**
     * Sets the nombrePlan value for this PlanDto.
     * 
     * @param nombrePlan
     */
    public void setNombrePlan(java.lang.String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlanDto)) return false;
        PlanDto other = (PlanDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idBurPlan==null && other.getIdBurPlan()==null) || 
             (this.idBurPlan!=null &&
              this.idBurPlan.equals(other.getIdBurPlan()))) &&
            ((this.idPlan==null && other.getIdPlan()==null) || 
             (this.idPlan!=null &&
              this.idPlan.equals(other.getIdPlan()))) &&
            ((this.plan==null && other.getPlan()==null) || 
             (this.plan!=null &&
              this.plan.equals(other.getPlan()))) &&
            ((this.idEmpresa==null && other.getIdEmpresa()==null) || 
             (this.idEmpresa!=null &&
              this.idEmpresa.equals(other.getIdEmpresa()))) &&
            ((this.costo==null && other.getCosto()==null) || 
             (this.costo!=null &&
              this.costo.equals(other.getCosto()))) &&
            ((this.idperiodicidad==null && other.getIdperiodicidad()==null) || 
             (this.idperiodicidad!=null &&
              this.idperiodicidad.equals(other.getIdperiodicidad()))) &&
            ((this.idAsigna==null && other.getIdAsigna()==null) || 
             (this.idAsigna!=null &&
              this.idAsigna.equals(other.getIdAsigna()))) &&
            ((this.idCobro==null && other.getIdCobro()==null) || 
             (this.idCobro!=null &&
              this.idCobro.equals(other.getIdCobro()))) &&
            ((this.fechaAlta==null && other.getFechaAlta()==null) || 
             (this.fechaAlta!=null &&
              this.fechaAlta.equals(other.getFechaAlta()))) &&
            ((this.fechaBaja==null && other.getFechaBaja()==null) || 
             (this.fechaBaja!=null &&
              this.fechaBaja.equals(other.getFechaBaja()))) &&
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            this.estatus == other.getEstatus() &&
            this.descripcion == other.getDescripcion() &&
            ((this.idContrato==null && other.getIdContrato()==null) || 
             (this.idContrato!=null &&
              this.idContrato.equals(other.getIdContrato()))) &&
            ((this.nombrePlan==null && other.getNombrePlan()==null) || 
             (this.nombrePlan!=null &&
              this.nombrePlan.equals(other.getNombrePlan())));
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
        if (getIdBurPlan() != null) {
            _hashCode += getIdBurPlan().hashCode();
        }
        if (getIdPlan() != null) {
            _hashCode += getIdPlan().hashCode();
        }
        if (getPlan() != null) {
            _hashCode += getPlan().hashCode();
        }
        if (getIdEmpresa() != null) {
            _hashCode += getIdEmpresa().hashCode();
        }
        if (getCosto() != null) {
            _hashCode += getCosto().hashCode();
        }
        if (getIdperiodicidad() != null) {
            _hashCode += getIdperiodicidad().hashCode();
        }
        if (getIdAsigna() != null) {
            _hashCode += getIdAsigna().hashCode();
        }
        if (getIdCobro() != null) {
            _hashCode += getIdCobro().hashCode();
        }
        if (getFechaAlta() != null) {
            _hashCode += getFechaAlta().hashCode();
        }
        if (getFechaBaja() != null) {
            _hashCode += getFechaBaja().hashCode();
        }
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        _hashCode += getEstatus();
        _hashCode += getDescripcion();
        if (getIdContrato() != null) {
            _hashCode += getIdContrato().hashCode();
        }
        if (getNombrePlan() != null) {
            _hashCode += getNombrePlan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlanDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.services.actinver.com.mx/", "PlanDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idBurPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idBurPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idperiodicidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idperiodicidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idAsigna");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idAsigna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCobro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idCobro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaAlta");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaAlta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaBaja");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaBaja"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idContrato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idContrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombrePlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombrePlan"));
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
