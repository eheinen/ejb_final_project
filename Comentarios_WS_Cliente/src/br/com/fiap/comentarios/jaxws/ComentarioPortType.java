/**
 * ComentarioPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.fiap.comentarios.jaxws;

public interface ComentarioPortType extends java.rmi.Remote {
    public br.com.fiap.comentarios.jaxws.Comentarios[] getAll() throws java.rmi.RemoteException;
    public void add(br.com.fiap.comentarios.jaxws.Comentarios arg0) throws java.rmi.RemoteException;
}
