package org.example.healthtrack.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import org.example.healthtrack.model.Alimentation;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor

public class AlimentationDto implements Serializable {
    Long idAlimentation;
    String repas;
    LocalDateTime dateAlimentation;

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

    public Long getUtilisateur_id() {
        return utilisateur_id;
    }

    public void setUtilisateur_id(Long utilisateur_id) {
        this.utilisateur_id = utilisateur_id;
    }

    public int getCalorie() {
        return calorie;
    }

    public void setCalorie(int calorie) {
        this.calorie = calorie;
    }



    int calorie;
    Long utilisateur_id;
}