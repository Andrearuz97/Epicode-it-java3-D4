package gestioneventi.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class GaraDiAtletica extends Evento {
	@OneToMany
	private Set<Persona> setAtleti;

	private Persona vincitore;

	public GaraDiAtletica() {
		// Costruttore vuoto per JPA
	}

	public GaraDiAtletica(Set<Persona> setAtleti, Persona vincitore) {
		this.setAtleti = setAtleti;
		this.vincitore = vincitore;
	}

	public Set<Persona> getSetAtleti() {
		return setAtleti;
	}

	public void setSetAtleti(Set<Persona> setAtleti) {
		this.setAtleti = setAtleti;
	}

	public Persona getVincitore() {
		return vincitore;
	}

	public void setVincitore(Persona vincitore) {
		this.vincitore = vincitore;
	}
}
