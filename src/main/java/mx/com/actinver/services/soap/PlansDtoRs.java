/**
 * PlansDtoRs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mx.com.actinver.services.soap;

public class PlansDtoRs  extends mx.com.actinver.services.soap.ResponseDto  implements java.io.Serializable {
    private mx.com.actinver.services.soap.PlanDto planDto;

    private mx.com.actinver.services.soap.DetailsPlanDto[] plansClientDto;

    public PlansDtoRs() {
    }

    public PlansDtoRs(
           int status,
           mx.com.actinver.services.soap.ItemDto[] messages,
           mx.com.actinver.services.soap.PlanDto planDto,
           mx.com.actinver.services.soap.DetailsPlanDto[] plansClientDto) {
        super(
            status,
            messages);
        this.planDto = planDto;
        this.plansClientDto = plansClientDto;
    }


    /**
     * Gets the planDto value for this PlansDtoRs.
     * 
     * @return planDto
     */
    public mx.com.actinver.services.soap.PlanDto getPlanDto() {
        return planDto;
    }


    /**
     * Sets the planDto value for this PlansDtoRs.
     * 
     * @param planDto
     */
    public void setPlanDto(mx.com.actinver.services.soap.PlanDto planDto) {
        this.planDto = planDto;
    }


    /**
     * Gets the plansClientDto value for this PlansDtoRs.
     * 
     * @return plansClientDto
     */
    public mx.com.actinver.services.soap.DetailsPlanDto[] getPlansClientDto() {
        return plansClientDto;
    }


    /**
     * Sets the plansClientDto value for this PlansDtoRs.
     * 
     * @param plansClientDto
     */
    public void setPlansClientDto(mx.com.actinver.services.soap.DetailsPlanDto[] plansClientDto) {
        this.plansClientDto = plansClientDto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PlansDtoRs)) return false;
        PlansDtoRs other = (PlansDtoRs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.planDto==null && other.getPlanDto()==null) || 
             (this.planDto!=null &&
              this.planDto.equals(other.getPlanDto()))) &&
            ((this.plansClientDto==null && other.getPlansClientDto()==null) || 
             (this.plansClientDto!=null &&
              java.util.Arrays.equals(this.plansClientDto, other.getPlansClientDto())));
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
        if (getPlanDto() != null) {
            _hashCode += getPlanDto().hashCode();
        }
        if (getPlansClientDto() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPlansClientDto());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPlansClientDto(), i);
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
        new org.apache.axis.description.TypeDesc(PlansDtoRs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://soap.services.actinver.com.mx/", "PlansDtoRs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planDto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "planDto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.services.actinver.com.mx/", "PlanDto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("plansClientDto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "plansClientDto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://soap.services.actinver.com.mx/", "DetailsPlanDto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("", "detailsPlanDto"));
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
