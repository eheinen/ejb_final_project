/**
 * Comentarios.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.comentarios.jaxws;

public class Comentarios  implements java.io.Serializable {
    private java.lang.String assunto;

    private int avaliacao;

    private java.util.Date data;

    private java.lang.Integer id;

    private java.lang.String titulo;

    public Comentarios() {
    }

    public Comentarios(
           java.lang.String assunto,
           int avaliacao,
           java.util.Date data,
           java.lang.Integer id,
           java.lang.String titulo) {
           this.assunto = assunto;
           this.avaliacao = avaliacao;
           this.data = data;
           this.id = id;
           this.titulo = titulo;
    }


    /**
     * Gets the assunto value for this Comentarios.
     * 
     * @return assunto
     */
    public java.lang.String getAssunto() {
        return assunto;
    }


    /**
     * Sets the assunto value for this Comentarios.
     * 
     * @param assunto
     */
    public void setAssunto(java.lang.String assunto) {
        this.assunto = assunto;
    }


    /**
     * Gets the avaliacao value for this Comentarios.
     * 
     * @return avaliacao
     */
    public int getAvaliacao() {
        return avaliacao;
    }


    /**
     * Sets the avaliacao value for this Comentarios.
     * 
     * @param avaliacao
     */
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }


    /**
     * Gets the data value for this Comentarios.
     * 
     * @return data
     */
    public java.util.Date getData() {
        return data;
    }


    /**
     * Sets the data value for this Comentarios.
     * 
     * @param data
     */
    public void setData(java.util.Date data) {
        this.data = data;
    }


    /**
     * Gets the id value for this Comentarios.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Comentarios.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the titulo value for this Comentarios.
     * 
     * @return titulo
     */
    public java.lang.String getTitulo() {
        return titulo;
    }


    /**
     * Sets the titulo value for this Comentarios.
     * 
     * @param titulo
     */
    public void setTitulo(java.lang.String titulo) {
        this.titulo = titulo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Comentarios)) return false;
        Comentarios other = (Comentarios) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.assunto==null && other.getAssunto()==null) || 
             (this.assunto!=null &&
              this.assunto.equals(other.getAssunto()))) &&
            this.avaliacao == other.getAvaliacao() &&
            ((this.data==null && other.getData()==null) || 
             (this.data!=null &&
              this.data.equals(other.getData()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.titulo==null && other.getTitulo()==null) || 
             (this.titulo!=null &&
              this.titulo.equals(other.getTitulo())));
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
        if (getAssunto() != null) {
            _hashCode += getAssunto().hashCode();
        }
        _hashCode += getAvaliacao();
        if (getData() != null) {
            _hashCode += getData().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getTitulo() != null) {
            _hashCode += getTitulo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Comentarios.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://jaxws.comentarios.fiap.com.br", "comentarios"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assunto");
        elemField.setXmlName(new javax.xml.namespace.QName("", "assunto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaliacao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "avaliacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("data");
        elemField.setXmlName(new javax.xml.namespace.QName("", "data"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titulo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titulo"));
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
