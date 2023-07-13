package gestioneventi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PartitaDiCalcio extends Evento {
	@Column
	private String squadraDiCasa;

	@Column
	private String squadraOspite;

	@Column
	private String squadraVincente;

	@Column
	private int numeroGolSquadraDiCasa;

	@Column
	private int numeroGolSquadraOspite;

	public PartitaDiCalcio() {
		// Costruttore vuoto per JPA
	}

	public PartitaDiCalcio(String squadraDiCasa, String squadraOspite, String squadraVincente,
			int numeroGolSquadraDiCasa, int numeroGolSquadraOspite) {
		this.squadraDiCasa = squadraDiCasa;
		this.squadraOspite = squadraOspite;
		this.squadraVincente = squadraVincente;
		this.numeroGolSquadraDiCasa = numeroGolSquadraDiCasa;
		this.numeroGolSquadraOspite = numeroGolSquadraOspite;
	}

	// Getter e setter
	public String getSquadraDiCasa() {
		return squadraDiCasa;
	}

	public void setSquadraDiCasa(String squadraDiCasa) {
		this.squadraDiCasa = squadraDiCasa;
	}

	public String getSquadraOspite() {
		return squadraOspite;
	}

	public void setSquadraOspite(String squadraOspite) {
		this.squadraOspite = squadraOspite;
	}

	public String getSquadraVincente() {
		return squadraVincente;
	}

	public void setSquadraVincente(String squadraVincente) {
		this.squadraVincente = squadraVincente;
	}

	public int getNumeroGolSquadraDiCasa() {
		return numeroGolSquadraDiCasa;
	}

	public void setNumeroGolSquadraDiCasa(int numeroGolSquadraDiCasa) {
		this.numeroGolSquadraDiCasa = numeroGolSquadraDiCasa;
	}

	public int getNumeroGolSquadraOspite() {
		return numeroGolSquadraOspite;
	}

	public void setNumeroGolSquadraOspite(int numeroGolSquadraOspite) {
		this.numeroGolSquadraOspite = numeroGolSquadraOspite;
	}
}
