/**
 * PlanDtoRs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.services.soap;

public class PlanDtoRs  extends mx.com.actinver.services.soap.ResponseDto  implements java.io.Serializable {
    private java.lang.String idPlan;

    private java.lang.String plan;

    private java.lang.Long idEmpresa;

    private java.lang.Double costo;

    private java.lang.String idperiodicidad;

    private java.lang.String idAsigna;

    private java.lang.String idCobro;

    private java.lang.Long usuario;

    private int estatus;

    private java.lang.String descripcion;

    public PlanDtoRs() {
    }

    public PlanDtoRs(
           int status,
           mx.com.actinver.services.soap.ItemDto[] messages,
           java.lang.String idPlan,
           java.lang.String plan,
           java.lang.Long idEmpresa,
           java.lang.Double costo,
           java.lang.String idperiodicidad,
           java.lang.String idAsigna,
           java.lang.String idCobro,
           java.lang.Long usuario,
           int estatus,
           java.lang.String descripcion) {
        super(
            status,
            messages);
        this.idPlan = idPlan;
        this.plan = plan;
        this.idEmpresa = idEmpresa;
        this.costo = costo;
        this.idperiodicidad = idperiodicidad;
        this.idAsigna = idAsigna;
        this.idCobro = idCobro;
        this.usuario = usuario;
        this.estatus = estatus;
        this.descripcion = descripcion;
    }


    /**
     * Gets the idPlan value for this PlanDtoRs.
     * 
     * @return idPlan
     */
    public java.lang.String getIdPlan() {
        return idPlan;
    }


    /**
     * Sets the idPlan value for this PlanDtoRs.
     * 
     * @param idPlan
     */
    public void setIdPlan(java.lang.String idPlan) {
        this.idPlan = idPlan;
    }


    /**
     * Gets the plan value for this PlanDtoRs.
     * 
     * @return plan
     */
    public java.lang.String getPlan() {
        return plan;
    }


    /**
     * Sets the plan value for this PlanDtoRs.
     * 
     * @param plan
     */
    public void setPlan(java.lang.String plan) {
        this.plan = plan;
    }


    /**
     * Gets the idEmpresa value for this PlanDtoRs.
     * 
     * @return idEmpresa
     */
    public java.lang.Long getIdEmpresa() {
        return idEmpresa;
    }


    /**
     * Sets the idEmpresa value for this PlanDtoRs.
     * 
     * @param idEmpresa
     */
    public void setIdEmpresa(java.lang.Long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }


    /**
     * Gets the costo value for this PlanDtoRs.
     * 
     * @return costo
     */
    public java.lang.Double getCosto() {
        return costo;
    }


    /**
     * Sets the costo value for this PlanDtoRs.
     * 
     * @param costo
     */
    public void setCosto(java.lang.Double costo) {
        this.costo = costo;
    }


    /**
     * Gets the idperiodicidad value for this PlanDtoRs.
     * 
     * @return idperiodicidad
     */
    public java.lang.String getIdperiodicidad() {
        return idperiodicidad;
    }


    /**
     * Sets the idperiodicidad value for this PlanDtoRs.
     * 
     * @param idperiodicidad
     */
    public void setIdperiodicidad(java.lang.String idperiodicidad) {
        this.idperiodicidad = idperiodicidad;
    }


    /**
     * Gets the idAsigna value for this PlanDtoRs.
     * 
     * @return idAsigna
     */
    public java.lang.String getIdAsigna() {
        return idAsigna;
    }


    /**
     * Sets the idAsigna value for this PlanDtoRs.
     * 
     * @param idAsigna
     */
    public void setIdAsigna(java.lang.String idAsigna) {
        this.idAsigna = idAsigna;
    }


    /**
     * Gets the idCobro value for this PlanDtoRs.
     * 
     * @return idCobro
     */
    public java.lang.String getIdCobro() {
        return idCobro;
    }


    /**
     * Sets the idCobro value for this PlanDtoRs.
     * 
     * @param idCobro
     */
    public void setIdCobro(java.lang.String idCobro) {
        this.idCobro = idCobro;
    }


    /**
     * Gets the usuario value for this PlanDtoRs.
     * 
     * @return usuario
     */
    public java.lang.Long getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this PlanDtoRs.
     * 
     * @param usuario
     */
    public void setUsuario(java.lang.Long usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the estatus value for this PlanDtoRs.
     * 
     * @return estatus
     */
    public int getEstatus() {
        return estatus;
    }


    /**
     * Sets the estatus value for this PlanDtoRs.
     * 
     * @param estatus
     */
    public void setEstatus(int estatus) {
        this.estatus = estatus;
    }


    /**
     * Gets the descripcion value for this PlanDtoRs.
     * 
     * @return descripcion
     */
    public java.lang.String getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this PlanDtoRs.
     * 
     * @param descripcion
     */
    public void setDescripcion(java.lang.String descripcion) {
        this.descripcion = descripcion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlanDtoRs)) return false;
        PlanDtoRs other = (PlanDtoRs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
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
            ((this.usuario==null && other.getUsuario()==null) || 
             (this.usuario!=null &&
              this.usuario.equals(other.getUsuario()))) &&
            this.estatus == other.getEstatus() &&
            ((this.descripcion==null && other.getDescripcion()==null) || 
             (this.descripcion!=null &&
              this.descripcion.equals(other.getDescripcion())));
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
        if (getUsuario() != null) {
            _hashCode += getUsuario().hashCode();
        }
        _hashCode += getEstatus();
        if (getDescripcion() != null) {
            _hashCode += getDescripcion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlanDtoRs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.services.actinver.com.mx/", "PlanDtoRs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
