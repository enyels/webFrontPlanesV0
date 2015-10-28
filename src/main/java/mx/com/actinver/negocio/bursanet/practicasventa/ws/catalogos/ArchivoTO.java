/**
 * ArchivoTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class ArchivoTO  implements java.io.Serializable {
    private byte[] datos;

    private java.lang.String[] lineas;

    private java.lang.String mimeType;

    private java.lang.String nombreArchivo;

    private java.lang.Byte archivo;

    private java.lang.String contentID;

    public ArchivoTO() {
    }

    public ArchivoTO(
           byte[] datos,
           java.lang.String[] lineas,
           java.lang.String mimeType,
           java.lang.String nombreArchivo,
           java.lang.Byte archivo,
           java.lang.String contentID) {
           this.datos = datos;
           this.lineas = lineas;
           this.mimeType = mimeType;
           this.nombreArchivo = nombreArchivo;
           this.archivo = archivo;
           this.contentID = contentID;
    }


    /**
     * Gets the datos value for this ArchivoTO.
     * 
     * @return datos
     */
    public byte[] getDatos() {
        return datos;
    }


    /**
     * Sets the datos value for this ArchivoTO.
     * 
     * @param datos
     */
    public void setDatos(byte[] datos) {
        this.datos = datos;
    }


    /**
     * Gets the lineas value for this ArchivoTO.
     * 
     * @return lineas
     */
    public java.lang.String[] getLineas() {
        return lineas;
    }


    /**
     * Sets the lineas value for this ArchivoTO.
     * 
     * @param lineas
     */
    public void setLineas(java.lang.String[] lineas) {
        this.lineas = lineas;
    }

    public java.lang.String getLineas(int i) {
        return this.lineas[i];
    }

    public void setLineas(int i, java.lang.String _value) {
        this.lineas[i] = _value;
    }


    /**
     * Gets the mimeType value for this ArchivoTO.
     * 
     * @return mimeType
     */
    public java.lang.String getMimeType() {
        return mimeType;
    }


    /**
     * Sets the mimeType value for this ArchivoTO.
     * 
     * @param mimeType
     */
    public void setMimeType(java.lang.String mimeType) {
        this.mimeType = mimeType;
    }


    /**
     * Gets the nombreArchivo value for this ArchivoTO.
     * 
     * @return nombreArchivo
     */
    public java.lang.String getNombreArchivo() {
        return nombreArchivo;
    }


    /**
     * Sets the nombreArchivo value for this ArchivoTO.
     * 
     * @param nombreArchivo
     */
    public void setNombreArchivo(java.lang.String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }


    /**
     * Gets the archivo value for this ArchivoTO.
     * 
     * @return archivo
     */
    public java.lang.Byte getArchivo() {
        return archivo;
    }


    /**
     * Sets the archivo value for this ArchivoTO.
     * 
     * @param archivo
     */
    public void setArchivo(java.lang.Byte archivo) {
        this.archivo = archivo;
    }


    /**
     * Gets the contentID value for this ArchivoTO.
     * 
     * @return contentID
     */
    public java.lang.String getContentID() {
        return contentID;
    }


    /**
     * Sets the contentID value for this ArchivoTO.
     * 
     * @param contentID
     */
    public void setContentID(java.lang.String contentID) {
        this.contentID = contentID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArchivoTO)) return false;
        ArchivoTO other = (ArchivoTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.datos==null && other.getDatos()==null) || 
             (this.datos!=null &&
              java.util.Arrays.equals(this.datos, other.getDatos()))) &&
            ((this.lineas==null && other.getLineas()==null) || 
             (this.lineas!=null &&
              java.util.Arrays.equals(this.lineas, other.getLineas()))) &&
            ((this.mimeType==null && other.getMimeType()==null) || 
             (this.mimeType!=null &&
              this.mimeType.equals(other.getMimeType()))) &&
            ((this.nombreArchivo==null && other.getNombreArchivo()==null) || 
             (this.nombreArchivo!=null &&
              this.nombreArchivo.equals(other.getNombreArchivo()))) &&
            ((this.archivo==null && other.getArchivo()==null) || 
             (this.archivo!=null &&
              this.archivo.equals(other.getArchivo()))) &&
            ((this.contentID==null && other.getContentID()==null) || 
             (this.contentID!=null &&
              this.contentID.equals(other.getContentID())));
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
        if (getDatos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDatos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDatos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLineas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLineas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLineas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMimeType() != null) {
            _hashCode += getMimeType().hashCode();
        }
        if (getNombreArchivo() != null) {
            _hashCode += getNombreArchivo().hashCode();
        }
        if (getArchivo() != null) {
            _hashCode += getArchivo().hashCode();
        }
        if (getContentID() != null) {
            _hashCode += getContentID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ArchivoTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "archivoTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("datos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "datos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lineas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mimeType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mimeType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreArchivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombreArchivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("archivo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "archivo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "byte"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentID");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contentID"));
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
