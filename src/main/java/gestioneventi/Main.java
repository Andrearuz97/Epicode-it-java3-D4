package gestioneventi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import gestioneventi.dao.EventoDAO;
import gestioneventi.entity.Concerto;
import gestioneventi.entity.Concerto.GenereConcerto;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("GestionEventiPU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		EventoDAO eventoDAO = new EventoDAO(entityManager);

		// Esempio di salvataggio di un concerto
		Concerto concerto = new Concerto(GenereConcerto.ROCK, true);
		concerto.setTitolo("Concerto rock in streaming");
		concerto.setDescrizione("Concerto rock imperdibile in streaming");
		eventoDAO.save(concerto);

		// Esempio di ricerca dei concerti in streaming
		List<Concerto> concertiInStreaming = eventoDAO.getConcertiInStreaming(true);
		for (Concerto c : concertiInStreaming) {
			System.out.println("Titolo: " + c.getTitolo());
			System.out.println("Genere: " + c.getGenere());
			System.out.println("In streaming: " + c.isInStreaming());
		}

		entityManager.close();
		entityManagerFactory.close();
	}
}
