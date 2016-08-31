package br.com.fiap.bean;

import java.util.List;

import javax.ejb.Remote;

import br.com.fiap.entity.Comentarios;

@Remote
public interface ComentariosBeanRemote {
	void add(Comentarios comentario);
	List<Comentarios> getAll();
}
