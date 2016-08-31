package br.com.fiap.bean;

import java.util.List;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.fiap.entity.Comentarios;
import br.com.fiap.interceptor.MonitorInterceptor;

@Stateless
@Interceptors({ MonitorInterceptor.class })
public class ComentariosBean implements ComentariosBeanRemote {
	@PersistenceContext(unitName = "fiapPU")
	private EntityManager em;

	@Override
	public void add(Comentarios comentario) {
		em.persist(comentario);
	}

	@Override
	public List<Comentarios> getAll() {
		TypedQuery<Comentarios> query = em.createQuery("select u from Comentarios u", Comentarios.class);
		return query.getResultList();
	}
}