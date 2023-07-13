package gestioneventi.entity;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Evento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column
	private String titolo;

	@Column
	private String descrizione;

	public Evento() {
		// Costruttore vuoto per JPA
	}

	public Evento(String titolo, String descrizione) {
		this.titolo = titolo;
		this.descrizione = descrizione;
	}

	public Long getId() {
		return id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
}