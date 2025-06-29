package org.example.healthtrack.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtilisateur;
    private String nomComplete;
    private Integer age;
    private String sexe;
    private double poids;
    private  double taille;
    private String email;
    private String password;

    @OneToMany(mappedBy = "utilisateur", cascade = CascadeType.ALL)
    private List<ActivitePhysique> activites;

    @OneToMany(mappedBy = "utilisateur")
    private List<Sommeil> sommeils;

    @OneToMany(mappedBy = "utilisateur")
    private List<Poids> poidsHistorique;

    @OneToMany(mappedBy = "utilisateur")
    private List<Humeur> humeurs;

    @OneToMany(mappedBy = "utilisateur")
    private List<Alimentation> alimentations;

    public Long getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setIdUtilisateur(Long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public String getNomComplete() {
        return nomComplete;
    }

    public void setNomComplete(String nomComplete) {
        this.nomComplete = nomComplete;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ActivitePhysique> getActivites() {
        return activites;
    }

    public void setActivites(List<ActivitePhysique> activites) {
        this.activites = activites;
    }

    public List<Sommeil> getSommeils() {
        return sommeils;
    }

    public void setSommeils(List<Sommeil> sommeils) {
        this.sommeils = sommeils;
    }

    public List<Poids> getPoidsHistorique() {
        return poidsHistorique;
    }

    public void setPoidsHistorique(List<Poids> poidsHistorique) {
        this.poidsHistorique = poidsHistorique;
    }

    public List<Humeur> getHumeurs() {
        return humeurs;
    }

    public void setHumeurs(List<Humeur> humeurs) {
        this.humeurs = humeurs;
    }

    public List<Alimentation> getAlimentations() {
        return alimentations;
    }

    public void setAlimentations(List<Alimentation> alimentations) {
        this.alimentations = alimentations;
    }
}
