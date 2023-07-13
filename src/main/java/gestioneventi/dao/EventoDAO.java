package gestioneventi.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import gestioneventi.entity.Concerto;
import gestioneventi.entity.Evento;

public class EventoDAO {
	private EntityManager entityManager;

	public EventoDAO(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void save(Evento evento) {
		entityManager.persist(evento);
	}

	public void update(Evento evento) {
		entityManager.merge(evento);
	}

	public void delete(Evento evento) {
		entityManager.remove(evento);
	}

	public Concerto getConcertoById(Long id) {
		return entityManager.find(Concerto.class, id);
	}

	public List<Concerto> getConcertiInStreaming(boolean inStreaming) {
		String jpql = "SELECT c FROM Concerto c WHERE c.inStreaming = :inStreaming";
		TypedQuery<Concerto> query = entityManager.createQuery(jpql, Concerto.class);
		query.setParameter("inStreaming", inStreaming);
		return query.getResultList();
	}

	public List<Concerto> getConcertiPerGenere(List<Concerto.GenereConcerto> generi) {
		String jpql = "SELECT c FROM Concerto c WHERE c.genere IN :generi";
		TypedQuery<Concerto> query = entityManager.createQuery(jpql, Concerto.class);
		query.setParameter("generi", generi);
		return query.getResultList();
	}
}