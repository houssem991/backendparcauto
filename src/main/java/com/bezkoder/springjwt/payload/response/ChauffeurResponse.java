package com.bezkoder.springjwt.payload.response;

import java.time.LocalDate;

public class ChauffeurResponse {
	long id;
	private String firstname;

	private String lastname;

	private String cin;
	private LocalDate  datenaissance;
	private String immatv;
	private long idvehicule;

	public ChauffeurResponse() {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.cin = cin;
		this.datenaissance = datenaissance;
		this.immatv = immatv;
		this.idvehicule = idvehicule;

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

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

	public String getImmatv() {
		return immatv;
	}

	public void setImmatv(String immatv) {
		this.immatv = immatv;
	}

	public long getIdvehicule() {
		return idvehicule;
	}

	public void setIdvehicule(long idvehicule) {
		this.idvehicule = idvehicule;
	}
}
