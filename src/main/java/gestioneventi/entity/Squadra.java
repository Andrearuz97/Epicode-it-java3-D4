package gestioneventi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Squadra {
	@Column
	private String nome;

	public Squadra() {
		// Costruttore vuoto per JPA
	}

	public Squadra(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
