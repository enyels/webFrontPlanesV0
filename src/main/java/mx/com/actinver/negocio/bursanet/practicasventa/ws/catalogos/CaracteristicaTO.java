/**
 * CaracteristicaTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class CaracteristicaTO  extends mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.CatalogoTO  implements java.io.Serializable {
    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO estadoTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PosiblesValoresTO[] posiblesValores;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoCaracteristicaTO tipoCaracteristicaTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperadorTO tipoOperadorTO;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ValorTO[] valores;

    public CaracteristicaTO() {
    }

    public CaracteristicaTO(
           java.lang.String descripcion,
           java.lang.Long id,
           java.lang.String nombre,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO estadoTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PosiblesValoresTO[] posiblesValores,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoCaracteristicaTO tipoCaracteristicaTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperadorTO tipoOperadorTO,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ValorTO[] valores) {
        super(
            descripcion,
            id,
            nombre);
        this.estadoTO = estadoTO;
        this.posiblesValores = posiblesValores;
        this.tipoCaracteristicaTO = tipoCaracteristicaTO;
        this.tipoOperadorTO = tipoOperadorTO;
        this.valores = valores;
    }


    /**
     * Gets the estadoTO value for this CaracteristicaTO.
     * 
     * @return estadoTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO getEstadoTO() {
        return estadoTO;
    }


    /**
     * Sets the estadoTO value for this CaracteristicaTO.
     * 
     * @param estadoTO
     */
    public void setEstadoTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.EstadoTO estadoTO) {
        this.estadoTO = estadoTO;
    }


    /**
     * Gets the posiblesValores value for this CaracteristicaTO.
     * 
     * @return posiblesValores
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PosiblesValoresTO[] getPosiblesValores() {
        return posiblesValores;
    }


    /**
     * Sets the posiblesValores value for this CaracteristicaTO.
     * 
     * @param posiblesValores
     */
    public void setPosiblesValores(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PosiblesValoresTO[] posiblesValores) {
        this.posiblesValores = posiblesValores;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PosiblesValoresTO getPosiblesValores(int i) {
        return this.posiblesValores[i];
    }

    public void setPosiblesValores(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.PosiblesValoresTO _value) {
        this.posiblesValores[i] = _value;
    }


    /**
     * Gets the tipoCaracteristicaTO value for this CaracteristicaTO.
     * 
     * @return tipoCaracteristicaTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoCaracteristicaTO getTipoCaracteristicaTO() {
        return tipoCaracteristicaTO;
    }


    /**
     * Sets the tipoCaracteristicaTO value for this CaracteristicaTO.
     * 
     * @param tipoCaracteristicaTO
     */
    public void setTipoCaracteristicaTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoCaracteristicaTO tipoCaracteristicaTO) {
        this.tipoCaracteristicaTO = tipoCaracteristicaTO;
    }


    /**
     * Gets the tipoOperadorTO value for this CaracteristicaTO.
     * 
     * @return tipoOperadorTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperadorTO getTipoOperadorTO() {
        return tipoOperadorTO;
    }


    /**
     * Sets the tipoOperadorTO value for this CaracteristicaTO.
     * 
     * @param tipoOperadorTO
     */
    public void setTipoOperadorTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOperadorTO tipoOperadorTO) {
        this.tipoOperadorTO = tipoOperadorTO;
    }


    /**
     * Gets the valores value for this CaracteristicaTO.
     * 
     * @return valores
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ValorTO[] getValores() {
        return valores;
    }


    /**
     * Sets the valores value for this CaracteristicaTO.
     * 
     * @param valores
     */
    public void setValores(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ValorTO[] valores) {
        this.valores = valores;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ValorTO getValores(int i) {
        return this.valores[i];
    }

    public void setValores(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.ValorTO _value) {
        this.valores[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CaracteristicaTO)) return false;
        CaracteristicaTO other = (CaracteristicaTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.estadoTO==null && other.getEstadoTO()==null) || 
             (this.estadoTO!=null &&
              this.estadoTO.equals(other.getEstadoTO()))) &&
            ((this.posiblesValores==null && other.getPosiblesValores()==null) || 
             (this.posiblesValores!=null &&
              java.util.Arrays.equals(this.posiblesValores, other.getPosiblesValores()))) &&
            ((this.tipoCaracteristicaTO==null && other.getTipoCaracteristicaTO()==null) || 
             (this.tipoCaracteristicaTO!=null &&
              this.tipoCaracteristicaTO.equals(other.getTipoCaracteristicaTO()))) &&
            ((this.tipoOperadorTO==null && other.getTipoOperadorTO()==null) || 
             (this.tipoOperadorTO!=null &&
              this.tipoOperadorTO.equals(other.getTipoOperadorTO()))) &&
            ((this.valores==null && other.getValores()==null) || 
             (this.valores!=null &&
              java.util.Arrays.equals(this.valores, other.getValores())));
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
        if (getEstadoTO() != null) {
            _hashCode += getEstadoTO().hashCode();
        }
        if (getPosiblesValores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPosiblesValores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPosiblesValores(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTipoCaracteristicaTO() != null) {
            _hashCode += getTipoCaracteristicaTO().hashCode();
        }
        if (getTipoOperadorTO() != null) {
            _hashCode += getTipoOperadorTO().hashCode();
        }
        if (getValores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getValores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getValores(), i);
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
        new org.apache.axis.description.TypeDesc(CaracteristicaTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "caracteristicaTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "estadoTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "estadoTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posiblesValores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "posiblesValores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "posiblesValoresTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoCaracteristicaTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoCaracteristicaTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoCaracteristicaTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoOperadorTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tipoOperadorTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoOperadorTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valores");
        elemField.setXmlName(new javax.xml.namespace.QName("", "valores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "valorTO"));
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
