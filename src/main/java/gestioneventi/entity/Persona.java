package gestioneventi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Persona {
	@Column
	private String nome;

	@Column
	private String cognome;

	public Persona() {
		// Costruttore vuoto per JPA
	}

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
}