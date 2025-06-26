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
    int calorie;
    Long utilisateurIdUtilisateur;
}