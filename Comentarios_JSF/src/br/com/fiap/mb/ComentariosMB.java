package br.com.fiap.mb;

import java.rmi.RemoteException;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import br.com.fiap.ejbws.ComentariosBeanRemote;
import br.com.fiap.entity.Comentarios;

@ManagedBean(name = "comentarioMB")
public class ComentariosMB {

	private Comentarios comentario;

	public ComentariosMB() {
		comentario = new Comentarios();
	}

	public Comentarios getComentario() {
		return comentario;
	}

	public void setComentario(Comentarios comentario) {
		this.comentario = comentario;
	}

	public void adicionarComentario() {
		try {
			if (comentario != null && comentario.getAssunto() != null) {
				Date currentDateTime = Date.from(Instant.now());
				comentario.setData(currentDateTime);
				getServices().add(comentario);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<Comentarios> getListaComentarios() throws RemoteException {
		try {
			return getServices().getAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	private ComentariosBeanRemote getServices() throws Exception {
		try {
			InitialContext ctx = new InitialContext();
			return (ComentariosBeanRemote) ctx
					.lookup("ejb:/Comentarios_EJB/ComentariosBean!br.com.fiap.ejbws.ComentariosBeanRemote");
		} catch (NamingException e) {
			e.printStackTrace();
		}
		throw new Exception("Não foi possivel carregar o serviço do EJB");
	}

}
