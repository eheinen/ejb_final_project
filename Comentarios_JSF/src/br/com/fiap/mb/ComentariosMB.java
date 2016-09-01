package br.com.fiap.mb;

import java.rmi.RemoteException;
import java.time.Instant;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
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

	private boolean camposObrigatoriosValidados(){
		if (comentario != null) {
			if (comentario.getAssunto() == null || comentario.getAssunto().isEmpty())
				return false;
			if (comentario.getTitulo() == null || comentario.getTitulo().isEmpty())
				return false;
		}else{
			return false;
		}
		return true;
	}

	public String adicionarComentario() {
		try {
			if (camposObrigatoriosValidados()) {
				if (comentario.getAvaliacao() >= 0 && comentario.getAvaliacao() <= 5) {
					Date currentDateTime = Date.from(Instant.now());
					comentario.setData(currentDateTime);
					getServices().add(comentario);
				} else {
					FacesContext facesContext = FacesContext.getCurrentInstance();
					facesContext.addMessage("txt-avaliacao", new FacesMessage("A avaliação deve ser entre 0 e 5"));
				}
			}
		} catch (Exception e) {
			return null;
		}
		comentario = new Comentarios();
		return null;
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
