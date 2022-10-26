package com.bezkoder.springjwt.payload.request;


import java.time.LocalDate;

public class VehiculeRequest {


	private String immat;

	private LocalDate datedereparation;

	private String nameassurance;
	private LocalDate echeance;
	private String vignette;
	private String taxes;
	private String etatderep;
	private String natderep;
	private int montantderep;


	public String getImmat() {
		return immat;
	}

	public void setImmat(String immat) {
		this.immat = immat;
	}


	public LocalDate getDatedereparation() {
		return datedereparation;
	}

	public void setDatedereparation(LocalDate datedereparation) {
		this.datedereparation = datedereparation;
	}

	public String getNameassurance() {
		return nameassurance;
	}

	public void setNameassurance(String nameassurance) {
		this.nameassurance = nameassurance;
	}

	public LocalDate getEcheance() {
		return echeance;
	}

	public void setEcheance(LocalDate echeance) {
		this.echeance = echeance;
	}

	public String getVignette() {
		return vignette;
	}

	public void setVignette(String vignette) {
		this.vignette = vignette;
	}

	public String getTaxes() {
		return taxes;
	}

	public void setTaxes(String taxes) {
		this.taxes = taxes;
	}

	public String getEtatderep() {
		return etatderep;
	}

	public void setEtatderep(String etatderep) {
		this.etatderep = etatderep;
	}

	public String getNatderep() {
		return natderep;
	}

	public void setNatderep(String natderep) {
		this.natderep = natderep;
	}

	public int getMontantderep() {
		return montantderep;
	}

	public void setMontantderep(int montantderep) {
		this.montantderep = montantderep;
	}


}
