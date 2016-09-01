package br.com.fiap.ejbws;

import java.util.List;

import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.fiap.entity.Comentarios;
import br.com.fiap.interceptor.MonitorInterceptor;

@Stateless
@Interceptors({ MonitorInterceptor.class })
@WebService(serviceName = "Comentario", portName = "ComentarioPort", endpointInterface = "br.com.fiap.ejbws.ComentariosBeanRemote", targetNamespace = "http://jaxws.comentarios.fiap.com.br")
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