package org.example.healthtrack.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import org.example.healthtrack.model.Humeur;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class HumeurDto implements Serializable {
    Long idHumeur;
    String niveau;
    String commentaire;
    Long utilisateurIdUtilisateur;
}