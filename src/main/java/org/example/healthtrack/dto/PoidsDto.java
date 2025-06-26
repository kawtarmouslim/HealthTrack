package org.example.healthtrack.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import org.example.healthtrack.model.Poids;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
public class PoidsDto implements Serializable {
    Long idPoids;
    Date datePoids;
    Double valeur;
    Long utilisateurIdUtilisateur;
}