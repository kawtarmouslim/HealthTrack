package org.example.healthtrack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alimentation {
    public Long getIdAlimentation() {
        return idAlimentation;
    }

    public void setIdAlimentation(Long idAlimentation) {
        this.idAlimentation = idAlimentation;
    }

    public String getRepas() {
        return repas;
    }

    public void setRepas(String repas) {
        this.repas = repas;
    }

    public LocalDateTime getDateAlimentation() {
        return dateAlimentation;
    }

    public void setDateAlimentation(LocalDateTime dateAlimentation) {
        this.dateAlimentation = dateAlimentation;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlimentation;
    private String repas;
    private LocalDateTime dateAlimentation;
    private int calorie;
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
}
