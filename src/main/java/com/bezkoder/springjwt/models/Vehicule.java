package com.bezkoder.springjwt.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "vehicules",
        uniqueConstraints = {
                @UniqueConstraint(columnNames = "immat")
        })
public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 20)
    private String immat;

    private LocalDate datedereparation;
    private String nameassurance;
    private LocalDate echeance;
    private String vignette;
    private String taxes;
    private String etatderep;
    private String natderep;
    private int montantderep;

    @OneToMany(mappedBy = "vehicule" , fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private Set<Chauffeur> chauffeurs;





    public Vehicule() {
    }

    public Vehicule(Long id, @NotBlank @Size(max = 20) String immat, LocalDate datedereparation, String nameassurance, LocalDate echeance, String vignette, String taxes, String etatderep, String natderep, int montantderep) {
        this.id = id;
        this.immat = immat;
        this.datedereparation = datedereparation;
        this.nameassurance = nameassurance;
        this.echeance = echeance;
        this.vignette = vignette;
        this.taxes = taxes;
        this.etatderep = etatderep;
        this.natderep = natderep;
        this.montantderep = montantderep;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImmat() {
        return immat;
    }

    public void setImmat(String immat) {
        this.immat = immat;
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

    public LocalDate getDatedereparation() {
        return datedereparation;
    }

    public void setDatedereparation(LocalDate datedereparation) {
        this.datedereparation = datedereparation;
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

    public Set<Chauffeur> getChauffeurs() {
        return chauffeurs;
    }

    public void setChauffeurs(Set<Chauffeur> chauffeurs) {
        this.chauffeurs = chauffeurs;
    }
}

