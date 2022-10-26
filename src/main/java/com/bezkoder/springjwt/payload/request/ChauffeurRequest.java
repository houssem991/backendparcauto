package com.bezkoder.springjwt.payload.request;


import java.time.LocalDate;

public class ChauffeurRequest {


	private String firstname;

	private String lastname;

	private String cin;
	private LocalDate datenaissance;
	private long idvehicule;
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public LocalDate getDatenaissance() {
		return datenaissance;
	}

	public void setDatenaissance(LocalDate datenaissance) {
		this.datenaissance = datenaissance;
	}

	public void setIdvehicule(long idvehicule) {
		this.idvehicule = idvehicule;
	}

	public long getIdvehicule() {
		return idvehicule;
	}
}
