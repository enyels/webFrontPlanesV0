/**
 * PersonaTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class PersonaTO  implements java.io.Serializable {
    private java.lang.Long id;

    private java.lang.String nombre;

    private java.lang.String apPaterno;

    private java.lang.String apMaterno;

    private java.lang.String rfc;

    private java.lang.String curp;

    private java.lang.String sFechaNacimiento;

    private java.util.Calendar fechaNacimiento;

    private java.lang.String email;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UsuarioTO usuarioTO;

    public PersonaTO() {
    }

    public PersonaTO(
           java.lang.Long id,
           java.lang.String nombre,
           java.lang.String apPaterno,
           java.lang.String apMaterno,
           java.lang.String rfc,
           java.lang.String curp,
           java.lang.String sFechaNacimiento,
           java.util.Calendar fechaNacimiento,
           java.lang.String email,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UsuarioTO usuarioTO) {
           this.id = id;
           this.nombre = nombre;
           this.apPaterno = apPaterno;
           this.apMaterno = apMaterno;
           this.rfc = rfc;
           this.curp = curp;
           this.sFechaNacimiento = sFechaNacimiento;
           this.fechaNacimiento = fechaNacimiento;
           this.email = email;
           this.usuarioTO = usuarioTO;
    }


    /**
     * Gets the id value for this PersonaTO.
     * 
     * @return id
     */
    public java.lang.Long getId() {
        return id;
    }


    /**
     * Sets the id value for this PersonaTO.
     * 
     * @param id
     */
    public void setId(java.lang.Long id) {
        this.id = id;
    }


    /**
     * Gets the nombre value for this PersonaTO.
     * 
     * @return nombre
     */
    public java.lang.String getNombre() {
        return nombre;
    }


    /**
     * Sets the nombre value for this PersonaTO.
     * 
     * @param nombre
     */
    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }


    /**
     * Gets the apPaterno value for this PersonaTO.
     * 
     * @return apPaterno
     */
    public java.lang.String getApPaterno() {
        return apPaterno;
    }


    /**
     * Sets the apPaterno value for this PersonaTO.
     * 
     * @param apPaterno
     */
    public void setApPaterno(java.lang.String apPaterno) {
        this.apPaterno = apPaterno;
    }


    /**
     * Gets the apMaterno value for this PersonaTO.
     * 
     * @return apMaterno
     */
    public java.lang.String getApMaterno() {
        return apMaterno;
    }


    /**
     * Sets the apMaterno value for this PersonaTO.
     * 
     * @param apMaterno
     */
    public void setApMaterno(java.lang.String apMaterno) {
        this.apMaterno = apMaterno;
    }


    /**
     * Gets the rfc value for this PersonaTO.
     * 
     * @return rfc
     */
    public java.lang.String getRfc() {
        return rfc;
    }


    /**
     * Sets the rfc value for this PersonaTO.
     * 
     * @param rfc
     */
    public void setRfc(java.lang.String rfc) {
        this.rfc = rfc;
    }


    /**
     * Gets the curp value for this PersonaTO.
     * 
     * @return curp
     */
    public java.lang.String getCurp() {
        return curp;
    }


    /**
     * Sets the curp value for this PersonaTO.
     * 
     * @param curp
     */
    public void setCurp(java.lang.String curp) {
        this.curp = curp;
    }


    /**
     * Gets the sFechaNacimiento value for this PersonaTO.
     * 
     * @return sFechaNacimiento
     */
    public java.lang.String getSFechaNacimiento() {
        return sFechaNacimiento;
    }


    /**
     * Sets the sFechaNacimiento value for this PersonaTO.
     * 
     * @param sFechaNacimiento
     */
    public void setSFechaNacimiento(java.lang.String sFechaNacimiento) {
        this.sFechaNacimiento = sFechaNacimiento;
    }


    /**
     * Gets the fechaNacimiento value for this PersonaTO.
     * 
     * @return fechaNacimiento
     */
    public java.util.Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }


    /**
     * Sets the fechaNacimiento value for this PersonaTO.
     * 
     * @param fechaNacimiento
     */
    public void setFechaNacimiento(java.util.Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    /**
     * Gets the email value for this PersonaTO.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this PersonaTO.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the usuarioTO value for this PersonaTO.
     * 
     * @return usuarioTO
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UsuarioTO getUsuarioTO() {
        return usuarioTO;
    }


    /**
     * Sets the usuarioTO value for this PersonaTO.
     * 
     * @param usuarioTO
     */
    public void setUsuarioTO(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.UsuarioTO usuarioTO) {
        this.usuarioTO = usuarioTO;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PersonaTO)) return false;
        PersonaTO other = (PersonaTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nombre==null && other.getNombre()==null) || 
             (this.nombre!=null &&
              this.nombre.equals(other.getNombre()))) &&
            ((this.apPaterno==null && other.getApPaterno()==null) || 
             (this.apPaterno!=null &&
              this.apPaterno.equals(other.getApPaterno()))) &&
            ((this.apMaterno==null && other.getApMaterno()==null) || 
             (this.apMaterno!=null &&
              this.apMaterno.equals(other.getApMaterno()))) &&
            ((this.rfc==null && other.getRfc()==null) || 
             (this.rfc!=null &&
              this.rfc.equals(other.getRfc()))) &&
            ((this.curp==null && other.getCurp()==null) || 
             (this.curp!=null &&
              this.curp.equals(other.getCurp()))) &&
            ((this.sFechaNacimiento==null && other.getSFechaNacimiento()==null) || 
             (this.sFechaNacimiento!=null &&
              this.sFechaNacimiento.equals(other.getSFechaNacimiento()))) &&
            ((this.fechaNacimiento==null && other.getFechaNacimiento()==null) || 
             (this.fechaNacimiento!=null &&
              this.fechaNacimiento.equals(other.getFechaNacimiento()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.usuarioTO==null && other.getUsuarioTO()==null) || 
             (this.usuarioTO!=null &&
              this.usuarioTO.equals(other.getUsuarioTO())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNombre() != null) {
            _hashCode += getNombre().hashCode();
        }
        if (getApPaterno() != null) {
            _hashCode += getApPaterno().hashCode();
        }
        if (getApMaterno() != null) {
            _hashCode += getApMaterno().hashCode();
        }
        if (getRfc() != null) {
            _hashCode += getRfc().hashCode();
        }
        if (getCurp() != null) {
            _hashCode += getCurp().hashCode();
        }
        if (getSFechaNacimiento() != null) {
            _hashCode += getSFechaNacimiento().hashCode();
        }
        if (getFechaNacimiento() != null) {
            _hashCode += getFechaNacimiento().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getUsuarioTO() != null) {
            _hashCode += getUsuarioTO().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PersonaTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "personaTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nombre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apPaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apPaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apMaterno");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apMaterno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rfc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("curp");
        elemField.setXmlName(new javax.xml.namespace.QName("", "curp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SFechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sFechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaNacimiento");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fechaNacimiento"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usuarioTO");
        elemField.setXmlName(new javax.xml.namespace.QName("", "usuarioTO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "usuarioTO"));
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
