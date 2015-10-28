/**
 * RecordatorioTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class RecordatorioTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UsuarioTO usuarioTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoRecordatorioTO tipoRecordatorioTO;

    private java.util.Calendar fechaPrimerAviso;

    private java.lang.String sFechaPrimerAviso;

    private java.util.Calendar fechaAviso;

    private java.lang.String sFechaAviso;

    private java.util.Calendar fechaRecordatorio;

    private java.lang.String sFechaRecordatorio;

    private java.lang.Long idContadorAvisos;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ContratoTO contrato;

    private java.lang.String usuarioTransaccional;

    public RecordatorioTO() {
    }

    public RecordatorioTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UsuarioTO usuarioTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoRecordatorioTO tipoRecordatorioTO,
           java.util.Calendar fechaPrimerAviso,
           java.lang.String sFechaPrimerAviso,
           java.util.Calendar fechaAviso,
           java.lang.String sFechaAviso,
           java.util.Calendar fechaRecordatorio,
           java.lang.String sFechaRecordatorio,
           java.lang.Long idContadorAvisos,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ContratoTO contrato,
           java.lang.String usuarioTransaccional) {
           this.usuarioTO = usuarioTO;
           this.tipoRecordatorioTO = tipoRecordatorioTO;
           this.fechaPrimerAviso = fechaPrimerAviso;
           this.sFechaPrimerAviso = sFechaPrimerAviso;
           this.fechaAviso = fechaAviso;
           this.sFechaAviso = sFechaAviso;
           this.fechaRecordatorio = fechaRecordatorio;
           this.sFechaRecordatorio = sFechaRecordatorio;
           this.idContadorAvisos = idContadorAvisos;
           this.contrato = contrato;
           this.usuarioTransaccional = usuarioTransaccional;
    }


    /**
     * Gets the usuarioTO value for this RecordatorioTO.
     * 
     * @return usuarioTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UsuarioTO getUsuarioTO() {
        return usuarioTO;
    }


    /**
     * Sets the usuarioTO value for this RecordatorioTO.
     * 
     * @param usuarioTO
     */
    public void setUsuarioTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UsuarioTO usuarioTO) {
        this.usuarioTO = usuarioTO;
    }


    /**
     * Gets the tipoRecordatorioTO value for this RecordatorioTO.
     * 
     * @return tipoRecordatorioTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoRecordatorioTO getTipoRecordatorioTO() {
        return tipoRecordatorioTO;
    }


    /**
     * Sets the tipoRecordatorioTO value for this RecordatorioTO.
     * 
     * @param tipoRecordatorioTO
     */
    public void setTipoRecordatorioTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoRecordatorioTO tipoRecordatorioTO) {
        this.tipoRecordatorioTO = tipoRecordatorioTO;
    }


    /**
     * Gets the fechaPrimerAviso value for this RecordatorioTO.
     * 
     * @return fechaPrimerAviso
     */
    public java.util.Calendar getFechaPrimerAviso() {
        return fechaPrimerAviso;
    }


    /**
     * Sets the fechaPrimerAviso value for this RecordatorioTO.
     * 
     * @param fechaPrimerAviso
     */
    public void setFechaPrimerAviso(java.util.Calendar fechaPrimerAviso) {
        this.fechaPrimerAviso = fechaPrimerAviso;
    }


    /**
     * Gets the sFechaPrimerAviso value for this RecordatorioTO.
     * 
     * @return sFechaPrimerAviso
     */
    public java.lang.String getSFechaPrimerAviso() {
        return sFechaPrimerAviso;
    }


    /**
     * Sets the sFechaPrimerAviso value for this RecordatorioTO.
     * 
     * @param sFechaPrimerAviso
     */
    public void setSFechaPrimerAviso(java.lang.String sFechaPrimerAviso) {
        this.sFechaPrimerAviso = sFechaPrimerAviso;
    }


    /**
     * Gets the fechaAviso value for this RecordatorioTO.
     * 
     * @return fechaAviso
     */
    public java.util.Calendar getFechaAviso() {
        return fechaAviso;
    }


    /**
     * Sets the fechaAviso value for this RecordatorioTO.
     * 
     * @param fechaAviso
     */
    public void setFechaAviso(java.util.Calendar fechaAviso) {
        this.fechaAviso = fechaAviso;
    }


    /**
     * Gets the sFechaAviso value for this RecordatorioTO.
     * 
     * @return sFechaAviso
     */
    public java.lang.String getSFechaAviso() {
        return sFechaAviso;
    }


    /**
     * Sets the sFechaAviso value for this RecordatorioTO.
     * 
     * @param sFechaAviso
     */
    public void setSFechaAviso(java.lang.String sFechaAviso) {
        this.sFechaAviso = sFechaAviso;
    }


    /**
     * Gets the fechaRecordatorio value for this RecordatorioTO.
     * 
     * @return fechaRecordatorio
     */
    public java.util.Calendar getFechaRecordatorio() {
        return fechaRecordatorio;
    }


    /**
     * Sets the fechaRecordatorio value for this RecordatorioTO.
     * 
     * @param fechaRecordatorio
     */
    public void setFechaRecordatorio(java.util.Calendar fechaRecordatorio) {
        this.fechaRecordatorio = fechaRecordatorio;
    }


    /**
     * Gets the sFechaRecordatorio value for this RecordatorioTO.
     * 
     * @return sFechaRecordatorio
     */
    public java.lang.String getSFechaRecordatorio() {
        return sFechaRecordatorio;
    }


    /**
     * Sets the sFechaRecordatorio value for this RecordatorioTO.
     * 
     * @param sFechaRecordatorio
     */
    public void setSFechaRecordatorio(java.lang.String sFechaRecordatorio) {
        this.sFechaRecordatorio = sFechaRecordatorio;
    }


    /**
     * Gets the idContadorAvisos value for this RecordatorioTO.
     * 
     * @return idContadorAvisos
     */
    public java.lang.Long getIdContadorAvisos() {
        return idContadorAvisos;
    }


    /**
     * Sets the idContadorAvisos value for this RecordatorioTO.
     * 
     * @param idContadorAvisos
     */
    public void setIdContadorAvisos(java.lang.Long idContadorAvisos) {
        this.idContadorAvisos = idContadorAvisos;
    }


    /**
     * Gets the contrato value for this RecordatorioTO.
     * 
     * @return contrato
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ContratoTO getContrato() {
        return contrato;
    }


    /**
     * Sets the contrato value for this RecordatorioTO.
     * 
     * @param contrato
     */
    public void setContrato(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ContratoTO contrato) {
        this.contrato = contrato;
    }


    /**
     * Gets the usuarioTransaccional value for this RecordatorioTO.
     * 
     * @return usuarioTransaccional
     */
    public java.lang.String getUsuarioTransaccional() {
        return usuarioTransaccional;
    }


    /**
     * Sets the usuarioTransaccional value for this RecordatorioTO.
     * 
     * @param usuarioTransaccional
     */
    public void setUsuarioTransaccional(java.lang.String usuarioTransaccional) {
        this.usuarioTransaccional = usuarioTransaccional;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecordatorioTO)) return false;
        RecordatorioTO other = (RecordatorioTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.usuarioTO==null && other.getUsuarioTO()==null) || 
             (this.usuarioTO!=null &&
              this.usuarioTO.equals(other.getUsuarioTO()))) &&
            ((this.tipoRecordatorioTO==null && other.getTipoRecordatorioTO()==null) || 
             (this.tipoRecordatorioTO!=null &&
              this.tipoRecordatorioTO.equals(other.getTipoRecordatorioTO()))) &&
            ((this.fechaPrimerAviso==null && other.getFechaPrimerAviso()==null) || 
             (this.fechaPrimerAviso!=null &&
              this.fechaPrimerAviso.equals(other.getFechaPrimerAviso()))) &&
            ((this.sFechaPrimerAviso==null && other.getSFechaPrimerAviso()==null) || 
             (this.sFechaPrimerAviso!=null &&
              this.sFechaPrimerAviso.equals(other.getSFechaPrimerAviso()))) &&
            ((this.fechaAviso==null && other.getFechaAviso()==null) || 
             (this.fechaAviso!=null &&
              this.fechaAviso.equals(other.getFechaAviso()))) &&
            ((this.sFechaAviso==null && other.getSFechaAviso()==null) || 
             (this.sFechaAviso!=null &&
              this.sFechaAviso.equals(other.getSFechaAviso()))) &&
            ((this.fechaRecordatorio==null && other.getFechaRecordatorio()==null) || 
             (this.fechaRecordatorio!=null &&
              this.fechaRecordatorio.equals(other.getFechaRecordatorio()))) &&
            ((this.sFechaRecordatorio==null && other.getSFechaRecordatorio()==null) || 
             (this.sFechaRecordatorio!=null &&
              this.sFechaRecordatorio.equals(other.getSFechaRecordatorio()))) &&
            ((this.idContadorAvisos==null && other.getIdContadorAvisos()==null) || 
             (this.idContadorAvisos!=null &&
              this.idContadorAvisos.equals(other.getIdContadorAvisos()))) &&
            ((this.contrato==null && other.getContrato()==null) || 
             (this.contrato!=null &&
              this.contrato.equals(other.getContrato()))) &&
            ((this.usuarioTransaccional==null && other.getUsuarioTransaccional()==null) || 
             (this.usuarioTransaccional!=null &&
              this.usuarioTransaccional.equals(other.getUsuarioTransaccional())));
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
        if (getUsuarioTO() != null) {
            _hashCode += getUsuarioTO().hashCode();
        }
        if (getTipoRecordatorioTO() != null) {
            _hashCode += getTipoRecordatorioTO().hashCode();
        }
        if (getFechaPrimerAviso() != null) {
            _hashCode += getFechaPrimerAviso().hashCode();
        }
        if (getSFechaPrimerAviso() != null) {
            _hashCode += getSFechaPrimerAviso().hashCode();
        }
        if (getFechaAviso() != null) {
            _hashCode += getFechaAviso().hashCode();
        }
        if (getSFechaAviso() != null) {
            _hashCode += getSFechaAviso().hashCode();
        }
        if (getFechaRecordatorio() != null) {
            _hashCode += getFechaRecordatorio().hashCode();
        }
        if (getSFechaRecordatorio() != null) {
            _hashCode += getSFechaRecordatorio().hashCode();
        }
        if (getIdContadorAvisos() != null) {
            _hashCode += getIdContadorAvisos().hashCode();
        }
        if (getContrato() != null) {
            _hashCode += getContrato().hashCode();
        }
        if (getUsuarioTransaccional() != null) {
            _hashCode += getUsuarioTransaccional().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RecordatorioTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "recordatorioTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "usuarioTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoRecordatorioTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoRecordatorioTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoRecordatorioTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaPrimerAviso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaPrimerAviso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFechaPrimerAviso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sFechaPrimerAviso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaAviso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaAviso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFechaAviso");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sFechaAviso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaRecordatorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaRecordatorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFechaRecordatorio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sFechaRecordatorio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idContadorAvisos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idContadorAvisos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contrato");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "contratoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioTransaccional");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioTransaccional"));
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
