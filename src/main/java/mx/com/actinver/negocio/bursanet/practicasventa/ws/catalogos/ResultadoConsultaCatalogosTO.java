/**
 * ResultadoConsultaCatalogosTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class ResultadoConsultaCatalogosTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoCaracteristicaTO[] listaTipoCaracteristicaTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoPersonaTO[] listaTipoPersonaTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperadorTO[] listaTipoOperadorTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperacionTO[] listaTipoOperacionTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UnidadTiempoTO[] listaUnidadTiempoTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO[] listaEstadoTO;

    public ResultadoConsultaCatalogosTO() {
    }

    public ResultadoConsultaCatalogosTO(
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoCaracteristicaTO[] listaTipoCaracteristicaTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoPersonaTO[] listaTipoPersonaTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperadorTO[] listaTipoOperadorTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperacionTO[] listaTipoOperacionTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UnidadTiempoTO[] listaUnidadTiempoTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO[] listaEstadoTO) {
           this.listaTipoCaracteristicaTO = listaTipoCaracteristicaTO;
           this.listaTipoPersonaTO = listaTipoPersonaTO;
           this.listaTipoOperadorTO = listaTipoOperadorTO;
           this.listaTipoOperacionTO = listaTipoOperacionTO;
           this.listaUnidadTiempoTO = listaUnidadTiempoTO;
           this.listaEstadoTO = listaEstadoTO;
    }


    /**
     * Gets the listaTipoCaracteristicaTO value for this ResultadoConsultaCatalogosTO.
     * 
     * @return listaTipoCaracteristicaTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoCaracteristicaTO[] getListaTipoCaracteristicaTO() {
        return listaTipoCaracteristicaTO;
    }


    /**
     * Sets the listaTipoCaracteristicaTO value for this ResultadoConsultaCatalogosTO.
     * 
     * @param listaTipoCaracteristicaTO
     */
    public void setListaTipoCaracteristicaTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoCaracteristicaTO[] listaTipoCaracteristicaTO) {
        this.listaTipoCaracteristicaTO = listaTipoCaracteristicaTO;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoCaracteristicaTO getListaTipoCaracteristicaTO(int i) {
        return this.listaTipoCaracteristicaTO[i];
    }

    public void setListaTipoCaracteristicaTO(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoCaracteristicaTO _value) {
        this.listaTipoCaracteristicaTO[i] = _value;
    }


    /**
     * Gets the listaTipoPersonaTO value for this ResultadoConsultaCatalogosTO.
     * 
     * @return listaTipoPersonaTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoPersonaTO[] getListaTipoPersonaTO() {
        return listaTipoPersonaTO;
    }


    /**
     * Sets the listaTipoPersonaTO value for this ResultadoConsultaCatalogosTO.
     * 
     * @param listaTipoPersonaTO
     */
    public void setListaTipoPersonaTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoPersonaTO[] listaTipoPersonaTO) {
        this.listaTipoPersonaTO = listaTipoPersonaTO;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoPersonaTO getListaTipoPersonaTO(int i) {
        return this.listaTipoPersonaTO[i];
    }

    public void setListaTipoPersonaTO(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoPersonaTO _value) {
        this.listaTipoPersonaTO[i] = _value;
    }


    /**
     * Gets the listaTipoOperadorTO value for this ResultadoConsultaCatalogosTO.
     * 
     * @return listaTipoOperadorTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperadorTO[] getListaTipoOperadorTO() {
        return listaTipoOperadorTO;
    }


    /**
     * Sets the listaTipoOperadorTO value for this ResultadoConsultaCatalogosTO.
     * 
     * @param listaTipoOperadorTO
     */
    public void setListaTipoOperadorTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperadorTO[] listaTipoOperadorTO) {
        this.listaTipoOperadorTO = listaTipoOperadorTO;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperadorTO getListaTipoOperadorTO(int i) {
        return this.listaTipoOperadorTO[i];
    }

    public void setListaTipoOperadorTO(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperadorTO _value) {
        this.listaTipoOperadorTO[i] = _value;
    }


    /**
     * Gets the listaTipoOperacionTO value for this ResultadoConsultaCatalogosTO.
     * 
     * @return listaTipoOperacionTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperacionTO[] getListaTipoOperacionTO() {
        return listaTipoOperacionTO;
    }


    /**
     * Sets the listaTipoOperacionTO value for this ResultadoConsultaCatalogosTO.
     * 
     * @param listaTipoOperacionTO
     */
    public void setListaTipoOperacionTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperacionTO[] listaTipoOperacionTO) {
        this.listaTipoOperacionTO = listaTipoOperacionTO;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperacionTO getListaTipoOperacionTO(int i) {
        return this.listaTipoOperacionTO[i];
    }

    public void setListaTipoOperacionTO(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperacionTO _value) {
        this.listaTipoOperacionTO[i] = _value;
    }


    /**
     * Gets the listaUnidadTiempoTO value for this ResultadoConsultaCatalogosTO.
     * 
     * @return listaUnidadTiempoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UnidadTiempoTO[] getListaUnidadTiempoTO() {
        return listaUnidadTiempoTO;
    }


    /**
     * Sets the listaUnidadTiempoTO value for this ResultadoConsultaCatalogosTO.
     * 
     * @param listaUnidadTiempoTO
     */
    public void setListaUnidadTiempoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UnidadTiempoTO[] listaUnidadTiempoTO) {
        this.listaUnidadTiempoTO = listaUnidadTiempoTO;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UnidadTiempoTO getListaUnidadTiempoTO(int i) {
        return this.listaUnidadTiempoTO[i];
    }

    public void setListaUnidadTiempoTO(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UnidadTiempoTO _value) {
        this.listaUnidadTiempoTO[i] = _value;
    }


    /**
     * Gets the listaEstadoTO value for this ResultadoConsultaCatalogosTO.
     * 
     * @return listaEstadoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO[] getListaEstadoTO() {
        return listaEstadoTO;
    }


    /**
     * Sets the listaEstadoTO value for this ResultadoConsultaCatalogosTO.
     * 
     * @param listaEstadoTO
     */
    public void setListaEstadoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO[] listaEstadoTO) {
        this.listaEstadoTO = listaEstadoTO;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO getListaEstadoTO(int i) {
        return this.listaEstadoTO[i];
    }

    public void setListaEstadoTO(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO _value) {
        this.listaEstadoTO[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResultadoConsultaCatalogosTO)) return false;
        ResultadoConsultaCatalogosTO other = (ResultadoConsultaCatalogosTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.listaTipoCaracteristicaTO==null && other.getListaTipoCaracteristicaTO()==null) || 
             (this.listaTipoCaracteristicaTO!=null &&
              java.util.Arrays.equals(this.listaTipoCaracteristicaTO, other.getListaTipoCaracteristicaTO()))) &&
            ((this.listaTipoPersonaTO==null && other.getListaTipoPersonaTO()==null) || 
             (this.listaTipoPersonaTO!=null &&
              java.util.Arrays.equals(this.listaTipoPersonaTO, other.getListaTipoPersonaTO()))) &&
            ((this.listaTipoOperadorTO==null && other.getListaTipoOperadorTO()==null) || 
             (this.listaTipoOperadorTO!=null &&
              java.util.Arrays.equals(this.listaTipoOperadorTO, other.getListaTipoOperadorTO()))) &&
            ((this.listaTipoOperacionTO==null && other.getListaTipoOperacionTO()==null) || 
             (this.listaTipoOperacionTO!=null &&
              java.util.Arrays.equals(this.listaTipoOperacionTO, other.getListaTipoOperacionTO()))) &&
            ((this.listaUnidadTiempoTO==null && other.getListaUnidadTiempoTO()==null) || 
             (this.listaUnidadTiempoTO!=null &&
              java.util.Arrays.equals(this.listaUnidadTiempoTO, other.getListaUnidadTiempoTO()))) &&
            ((this.listaEstadoTO==null && other.getListaEstadoTO()==null) || 
             (this.listaEstadoTO!=null &&
              java.util.Arrays.equals(this.listaEstadoTO, other.getListaEstadoTO())));
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
        if (getListaTipoCaracteristicaTO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaTipoCaracteristicaTO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaTipoCaracteristicaTO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaTipoPersonaTO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaTipoPersonaTO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaTipoPersonaTO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaTipoOperadorTO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaTipoOperadorTO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaTipoOperadorTO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaTipoOperacionTO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaTipoOperacionTO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaTipoOperacionTO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaUnidadTiempoTO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaUnidadTiempoTO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaUnidadTiempoTO(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getListaEstadoTO() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaEstadoTO());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaEstadoTO(), i);
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
        new org.apache.axis.description.TypeDesc(ResultadoConsultaCatalogosTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "resultadoConsultaCatalogosTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaTipoCaracteristicaTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaTipoCaracteristicaTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoCaracteristicaTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaTipoPersonaTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaTipoPersonaTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoPersonaTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaTipoOperadorTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaTipoOperadorTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoOperadorTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaTipoOperacionTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaTipoOperacionTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoOperacionTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaUnidadTiempoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaUnidadTiempoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "unidadTiempoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaEstadoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "listaEstadoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estadoTO"));
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
