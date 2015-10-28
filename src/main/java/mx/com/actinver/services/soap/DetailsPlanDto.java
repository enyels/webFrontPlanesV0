/**
 * DetailsPlanDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.services.soap;

public class DetailsPlanDto  implements java.io.Serializable {
    private java.lang.String idPlan;

    private java.lang.Long idContrato;

    private java.lang.Long idUsuario;

    private java.lang.String nombrePlan;

    private java.lang.String emisora;

    private java.lang.String serie;

    private java.lang.Long comision;

    private java.lang.Long costo;

    private java.lang.String tipoOperacion;

    public DetailsPlanDto() {
    }

    public DetailsPlanDto(
           java.lang.String idPlan,
           java.lang.Long idContrato,
           java.lang.Long idUsuario,
           java.lang.String nombrePlan,
           java.lang.String emisora,
           java.lang.String serie,
           java.lang.Long comision,
           java.lang.Long costo,
           java.lang.String tipoOperacion) {
           this.idPlan = idPlan;
           this.idContrato = idContrato;
           this.idUsuario = idUsuario;
           this.nombrePlan = nombrePlan;
           this.emisora = emisora;
           this.serie = serie;
           this.comision = comision;
           this.costo = costo;
           this.tipoOperacion = tipoOperacion;
    }


    /**
     * Gets the idPlan value for this DetailsPlanDto.
     * 
     * @return idPlan
     */
    public java.lang.String getIdPlan() {
        return idPlan;
    }


    /**
     * Sets the idPlan value for this DetailsPlanDto.
     * 
     * @param idPlan
     */
    public void setIdPlan(java.lang.String idPlan) {
        this.idPlan = idPlan;
    }


    /**
     * Gets the idContrato value for this DetailsPlanDto.
     * 
     * @return idContrato
     */
    public java.lang.Long getIdContrato() {
        return idContrato;
    }


    /**
     * Sets the idContrato value for this DetailsPlanDto.
     * 
     * @param idContrato
     */
    public void setIdContrato(java.lang.Long idContrato) {
        this.idContrato = idContrato;
    }


    /**
     * Gets the idUsuario value for this DetailsPlanDto.
     * 
     * @return idUsuario
     */
    public java.lang.Long getIdUsuario() {
        return idUsuario;
    }


    /**
     * Sets the idUsuario value for this DetailsPlanDto.
     * 
     * @param idUsuario
     */
    public void setIdUsuario(java.lang.Long idUsuario) {
        this.idUsuario = idUsuario;
    }


    /**
     * Gets the nombrePlan value for this DetailsPlanDto.
     * 
     * @return nombrePlan
     */
    public java.lang.String getNombrePlan() {
        return nombrePlan;
    }


    /**
     * Sets the nombrePlan value for this DetailsPlanDto.
     * 
     * @param nombrePlan
     */
    public void setNombrePlan(java.lang.String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }


    /**
     * Gets the emisora value for this DetailsPlanDto.
     * 
     * @return emisora
     */
    public java.lang.String getEmisora() {
        return emisora;
    }


    /**
     * Sets the emisora value for this DetailsPlanDto.
     * 
     * @param emisora
     */
    public void setEmisora(java.lang.String emisora) {
        this.emisora = emisora;
    }


    /**
     * Gets the serie value for this DetailsPlanDto.
     * 
     * @return serie
     */
    public java.lang.String getSerie() {
        return serie;
    }


    /**
     * Sets the serie value for this DetailsPlanDto.
     * 
     * @param serie
     */
    public void setSerie(java.lang.String serie) {
        this.serie = serie;
    }


    /**
     * Gets the comision value for this DetailsPlanDto.
     * 
     * @return comision
     */
    public java.lang.Long getComision() {
        return comision;
    }


    /**
     * Sets the comision value for this DetailsPlanDto.
     * 
     * @param comision
     */
    public void setComision(java.lang.Long comision) {
        this.comision = comision;
    }


    /**
     * Gets the costo value for this DetailsPlanDto.
     * 
     * @return costo
     */
    public java.lang.Long getCosto() {
        return costo;
    }


    /**
     * Sets the costo value for this DetailsPlanDto.
     * 
     * @param costo
     */
    public void setCosto(java.lang.Long costo) {
        this.costo = costo;
    }


    /**
     * Gets the tipoOperacion value for this DetailsPlanDto.
     * 
     * @return tipoOperacion
     */
    public java.lang.String getTipoOperacion() {
        return tipoOperacion;
    }


    /**
     * Sets the tipoOperacion value for this DetailsPlanDto.
     * 
     * @param tipoOperacion
     */
    public void setTipoOperacion(java.lang.String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DetailsPlanDto)) return false;
        DetailsPlanDto other = (DetailsPlanDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idPlan==null && other.getIdPlan()==null) || 
             (this.idPlan!=null &&
              this.idPlan.equals(other.getIdPlan()))) &&
            ((this.idContrato==null && other.getIdContrato()==null) || 
             (this.idContrato!=null &&
              this.idContrato.equals(other.getIdContrato()))) &&
            ((this.idUsuario==null && other.getIdUsuario()==null) || 
             (this.idUsuario!=null &&
              this.idUsuario.equals(other.getIdUsuario()))) &&
            ((this.nombrePlan==null && other.getNombrePlan()==null) || 
             (this.nombrePlan!=null &&
              this.nombrePlan.equals(other.getNombrePlan()))) &&
            ((this.emisora==null && other.getEmisora()==null) || 
             (this.emisora!=null &&
              this.emisora.equals(other.getEmisora()))) &&
            ((this.serie==null && other.getSerie()==null) || 
             (this.serie!=null &&
              this.serie.equals(other.getSerie()))) &&
            ((this.comision==null && other.getComision()==null) || 
             (this.comision!=null &&
              this.comision.equals(other.getComision()))) &&
            ((this.costo==null && other.getCosto()==null) || 
             (this.costo!=null &&
              this.costo.equals(other.getCosto()))) &&
            ((this.tipoOperacion==null && other.getTipoOperacion()==null) || 
             (this.tipoOperacion!=null &&
              this.tipoOperacion.equals(other.getTipoOperacion())));
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
        if (getIdPlan() != null) {
            _hashCode += getIdPlan().hashCode();
        }
        if (getIdContrato() != null) {
            _hashCode += getIdContrato().hashCode();
        }
        if (getIdUsuario() != null) {
            _hashCode += getIdUsuario().hashCode();
        }
        if (getNombrePlan() != null) {
            _hashCode += getNombrePlan().hashCode();
        }
        if (getEmisora() != null) {
            _hashCode += getEmisora().hashCode();
        }
        if (getSerie() != null) {
            _hashCode += getSerie().hashCode();
        }
        if (getComision() != null) {
            _hashCode += getComision().hashCode();
        }
        if (getCosto() != null) {
            _hashCode += getCosto().hashCode();
        }
        if (getTipoOperacion() != null) {
            _hashCode += getTipoOperacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DetailsPlanDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.services.actinver.com.mx/", "DetailsPlanDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idPlan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("idUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idUsuario"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emisora");
        elemField.setXmlName(new javax.xml.namespace.QName("", "emisora"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serie");
        elemField.setXmlName(new javax.xml.namespace.QName("", "serie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comision");
        elemField.setXmlName(new javax.xml.namespace.QName("", "comision"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoOperacion");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoOperacion"));
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
