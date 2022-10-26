package com.bezkoder.springjwt.models;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "chauffeur")
public class Chauffeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 20)
    private String firstname;

    private String lastname;

    private String cin;
    private LocalDate  datenaissance;

    @ManyToOne()
    @JsonIgnore
    @JoinColumn(name = "vehicule_id")
    private Vehicule vehicule;







    public Chauffeur() {
    }

    public Chauffeur(Long id, @NotBlank @Size(max = 20) String firstname, String lastname, String cin, LocalDate datenaissance, Vehicule vehicule) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.cin = cin;
        this.datenaissance = datenaissance;
        this.vehicule = vehicule;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }
}

