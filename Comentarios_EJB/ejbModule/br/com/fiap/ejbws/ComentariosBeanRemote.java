package br.com.fiap.ejbws;

import java.util.List;

import javax.ejb.Remote;
import javax.jws.WebService;

import br.com.fiap.entity.Comentarios;

@Remote
@WebService(name = "ComentarioPortType", targetNamespace = "http://jaxws.comentarios.fiap.com.br")
public interface ComentariosBeanRemote {
	void add(Comentarios comentario);
	List<Comentarios> getAll();
}
