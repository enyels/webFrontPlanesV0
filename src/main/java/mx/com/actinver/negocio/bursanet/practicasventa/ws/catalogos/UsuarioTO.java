/**
 * UsuarioTO.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos;

public class UsuarioTO  implements java.io.Serializable {
    private java.lang.Long idUsuario;

    private java.lang.String contrasenia;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.FacultadTO[] facultades;

    private java.lang.String login;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.RolTO[] roles;

    private mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOrigenTO sistemaOrigen;

    public UsuarioTO() {
    }

    public UsuarioTO(
           java.lang.Long idUsuario,
           java.lang.String contrasenia,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.FacultadTO[] facultades,
           java.lang.String login,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.RolTO[] roles,
           mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOrigenTO sistemaOrigen) {
           this.idUsuario = idUsuario;
           this.contrasenia = contrasenia;
           this.facultades = facultades;
           this.login = login;
           this.roles = roles;
           this.sistemaOrigen = sistemaOrigen;
    }


    /**
     * Gets the idUsuario value for this UsuarioTO.
     * 
     * @return idUsuario
     */
    public java.lang.Long getIdUsuario() {
        return idUsuario;
    }


    /**
     * Sets the idUsuario value for this UsuarioTO.
     * 
     * @param idUsuario
     */
    public void setIdUsuario(java.lang.Long idUsuario) {
        this.idUsuario = idUsuario;
    }


    /**
     * Gets the contrasenia value for this UsuarioTO.
     * 
     * @return contrasenia
     */
    public java.lang.String getContrasenia() {
        return contrasenia;
    }


    /**
     * Sets the contrasenia value for this UsuarioTO.
     * 
     * @param contrasenia
     */
    public void setContrasenia(java.lang.String contrasenia) {
        this.contrasenia = contrasenia;
    }


    /**
     * Gets the facultades value for this UsuarioTO.
     * 
     * @return facultades
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.FacultadTO[] getFacultades() {
        return facultades;
    }


    /**
     * Sets the facultades value for this UsuarioTO.
     * 
     * @param facultades
     */
    public void setFacultades(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.FacultadTO[] facultades) {
        this.facultades = facultades;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.FacultadTO getFacultades(int i) {
        return this.facultades[i];
    }

    public void setFacultades(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.FacultadTO _value) {
        this.facultades[i] = _value;
    }


    /**
     * Gets the login value for this UsuarioTO.
     * 
     * @return login
     */
    public java.lang.String getLogin() {
        return login;
    }


    /**
     * Sets the login value for this UsuarioTO.
     * 
     * @param login
     */
    public void setLogin(java.lang.String login) {
        this.login = login;
    }


    /**
     * Gets the roles value for this UsuarioTO.
     * 
     * @return roles
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.RolTO[] getRoles() {
        return roles;
    }


    /**
     * Sets the roles value for this UsuarioTO.
     * 
     * @param roles
     */
    public void setRoles(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.RolTO[] roles) {
        this.roles = roles;
    }

    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.RolTO getRoles(int i) {
        return this.roles[i];
    }

    public void setRoles(int i, mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.RolTO _value) {
        this.roles[i] = _value;
    }


    /**
     * Gets the sistemaOrigen value for this UsuarioTO.
     * 
     * @return sistemaOrigen
     */
    public mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOrigenTO getSistemaOrigen() {
        return sistemaOrigen;
    }


    /**
     * Sets the sistemaOrigen value for this UsuarioTO.
     * 
     * @param sistemaOrigen
     */
    public void setSistemaOrigen(mx.com.actinver.negocio.bursanet.practicasventa.ws.catalogos.TipoOrigenTO sistemaOrigen) {
        this.sistemaOrigen = sistemaOrigen;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UsuarioTO)) return false;
        UsuarioTO other = (UsuarioTO) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idUsuario==null && other.getIdUsuario()==null) || 
             (this.idUsuario!=null &&
              this.idUsuario.equals(other.getIdUsuario()))) &&
            ((this.contrasenia==null && other.getContrasenia()==null) || 
             (this.contrasenia!=null &&
              this.contrasenia.equals(other.getContrasenia()))) &&
            ((this.facultades==null && other.getFacultades()==null) || 
             (this.facultades!=null &&
              java.util.Arrays.equals(this.facultades, other.getFacultades()))) &&
            ((this.login==null && other.getLogin()==null) || 
             (this.login!=null &&
              this.login.equals(other.getLogin()))) &&
            ((this.roles==null && other.getRoles()==null) || 
             (this.roles!=null &&
              java.util.Arrays.equals(this.roles, other.getRoles()))) &&
            ((this.sistemaOrigen==null && other.getSistemaOrigen()==null) || 
             (this.sistemaOrigen!=null &&
              this.sistemaOrigen.equals(other.getSistemaOrigen())));
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
        if (getIdUsuario() != null) {
            _hashCode += getIdUsuario().hashCode();
        }
        if (getContrasenia() != null) {
            _hashCode += getContrasenia().hashCode();
        }
        if (getFacultades() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFacultades());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFacultades(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLogin() != null) {
            _hashCode += getLogin().hashCode();
        }
        if (getRoles() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoles());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoles(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSistemaOrigen() != null) {
            _hashCode += getSistemaOrigen().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UsuarioTO.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "usuarioTO"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contrasenia");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contrasenia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facultades");
        elemField.setXmlName(new javax.xml.namespace.QName("", "facultades"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "facultadTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("login");
        elemField.setXmlName(new javax.xml.namespace.QName("", "login"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "roles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "rolTO"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaOrigen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sistemaOrigen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalogos.ws.practicasventa.bursanet.negocio.actinver.com.mx/", "tipoOrigenTO"));
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
