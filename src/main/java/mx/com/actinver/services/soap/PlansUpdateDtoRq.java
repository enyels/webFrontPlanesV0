/**
 * PlansUpdateDtoRq.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.services.soap;

public class PlansUpdateDtoRq  extends mx.com.actinver.services.soap.RequestDto  implements java.io.Serializable {
    private java.lang.String idPlan;

    private java.lang.String plan;

    private long idEmpresa;

    private double costo;

    private java.lang.String idperiodicidad;

    private java.lang.String asigna;

    private java.lang.String idCobro;

    private long usuario;

    private int descripcion;

    public PlansUpdateDtoRq() {
    }

    public PlansUpdateDtoRq(
           mx.com.actinver.services.soap.LangType language,
           java.lang.String idPlan,
           java.lang.String plan,
           long idEmpresa,
           double costo,
           java.lang.String idperiodicidad,
           java.lang.String asigna,
           java.lang.String idCobro,
           long usuario,
           int descripcion) {
        super(
            language);
        this.idPlan = idPlan;
        this.plan = plan;
        this.idEmpresa = idEmpresa;
        this.costo = costo;
        this.idperiodicidad = idperiodicidad;
        this.asigna = asigna;
        this.idCobro = idCobro;
        this.usuario = usuario;
        this.descripcion = descripcion;
    }


    /**
     * Gets the idPlan value for this PlansUpdateDtoRq.
     * 
     * @return idPlan
     */
    public java.lang.String getIdPlan() {
        return idPlan;
    }


    /**
     * Sets the idPlan value for this PlansUpdateDtoRq.
     * 
     * @param idPlan
     */
    public void setIdPlan(java.lang.String idPlan) {
        this.idPlan = idPlan;
    }


    /**
     * Gets the plan value for this PlansUpdateDtoRq.
     * 
     * @return plan
     */
    public java.lang.String getPlan() {
        return plan;
    }


    /**
     * Sets the plan value for this PlansUpdateDtoRq.
     * 
     * @param plan
     */
    public void setPlan(java.lang.String plan) {
        this.plan = plan;
    }


    /**
     * Gets the idEmpresa value for this PlansUpdateDtoRq.
     * 
     * @return idEmpresa
     */
    public long getIdEmpresa() {
        return idEmpresa;
    }


    /**
     * Sets the idEmpresa value for this PlansUpdateDtoRq.
     * 
     * @param idEmpresa
     */
    public void setIdEmpresa(long idEmpresa) {
        this.idEmpresa = idEmpresa;
    }


    /**
     * Gets the costo value for this PlansUpdateDtoRq.
     * 
     * @return costo
     */
    public double getCosto() {
        return costo;
    }


    /**
     * Sets the costo value for this PlansUpdateDtoRq.
     * 
     * @param costo
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }


    /**
     * Gets the idperiodicidad value for this PlansUpdateDtoRq.
     * 
     * @return idperiodicidad
     */
    public java.lang.String getIdperiodicidad() {
        return idperiodicidad;
    }


    /**
     * Sets the idperiodicidad value for this PlansUpdateDtoRq.
     * 
     * @param idperiodicidad
     */
    public void setIdperiodicidad(java.lang.String idperiodicidad) {
        this.idperiodicidad = idperiodicidad;
    }


    /**
     * Gets the asigna value for this PlansUpdateDtoRq.
     * 
     * @return asigna
     */
    public java.lang.String getAsigna() {
        return asigna;
    }


    /**
     * Sets the asigna value for this PlansUpdateDtoRq.
     * 
     * @param asigna
     */
    public void setAsigna(java.lang.String asigna) {
        this.asigna = asigna;
    }


    /**
     * Gets the idCobro value for this PlansUpdateDtoRq.
     * 
     * @return idCobro
     */
    public java.lang.String getIdCobro() {
        return idCobro;
    }


    /**
     * Sets the idCobro value for this PlansUpdateDtoRq.
     * 
     * @param idCobro
     */
    public void setIdCobro(java.lang.String idCobro) {
        this.idCobro = idCobro;
    }


    /**
     * Gets the usuario value for this PlansUpdateDtoRq.
     * 
     * @return usuario
     */
    public long getUsuario() {
        return usuario;
    }


    /**
     * Sets the usuario value for this PlansUpdateDtoRq.
     * 
     * @param usuario
     */
    public void setUsuario(long usuario) {
        this.usuario = usuario;
    }


    /**
     * Gets the descripcion value for this PlansUpdateDtoRq.
     * 
     * @return descripcion
     */
    public int getDescripcion() {
        return descripcion;
    }


    /**
     * Sets the descripcion value for this PlansUpdateDtoRq.
     * 
     * @param descripcion
     */
    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlansUpdateDtoRq)) return false;
        PlansUpdateDtoRq other = (PlansUpdateDtoRq) obj;
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
            this.idEmpresa == other.getIdEmpresa() &&
            this.costo == other.getCosto() &&
            ((this.idperiodicidad==null && other.getIdperiodicidad()==null) || 
             (this.idperiodicidad!=null &&
              this.idperiodicidad.equals(other.getIdperiodicidad()))) &&
            ((this.asigna==null && other.getAsigna()==null) || 
             (this.asigna!=null &&
              this.asigna.equals(other.getAsigna()))) &&
            ((this.idCobro==null && other.getIdCobro()==null) || 
             (this.idCobro!=null &&
              this.idCobro.equals(other.getIdCobro()))) &&
            this.usuario == other.getUsuario() &&
            this.descripcion == other.getDescripcion();
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
        _hashCode += new Long(getIdEmpresa()).hashCode();
        _hashCode += new Double(getCosto()).hashCode();
        if (getIdperiodicidad() != null) {
            _hashCode += getIdperiodicidad().hashCode();
        }
        if (getAsigna() != null) {
            _hashCode += getAsigna().hashCode();
        }
        if (getIdCobro() != null) {
            _hashCode += getIdCobro().hashCode();
        }
        _hashCode += new Long(getUsuario()).hashCode();
        _hashCode += getDescripcion();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PlansUpdateDtoRq.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.services.actinver.com.mx/", "PlansUpdateDtoRq"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idperiodicidad");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idperiodicidad"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("asigna");
        elemField.setXmlName(new javax.xml.namespace.QName("", "asigna"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCobro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idCobro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descripcion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descripcion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
