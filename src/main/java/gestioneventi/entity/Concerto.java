package gestioneventi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Concerto extends Evento {
	public enum GenereConcerto {
		CLASSICO, ROCK, POP
	}

	@Column
	private GenereConcerto genere;

	@Column
	private boolean inStreaming;

	public Concerto() {
		// Costruttore vuoto per JPA
	}

	public Concerto(GenereConcerto genere, boolean inStreaming) {
		this.genere = genere;
		this.inStreaming = inStreaming;
	}

	public GenereConcerto getGenere() {
		return genere;
	}

	public void setGenere(GenereConcerto genere) {
		this.genere = genere;
	}

	public boolean isInStreaming() {
		return inStreaming;
	}

	public void setInStreaming(boolean inStreaming) {
		this.inStreaming = inStreaming;
	}
}
