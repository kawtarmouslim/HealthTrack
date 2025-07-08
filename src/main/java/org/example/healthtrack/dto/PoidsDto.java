package org.example.healthtrack.dto;

import lombok.*;
import org.example.healthtrack.model.Poids;

import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PoidsDto implements Serializable {
    Long idPoids;
    Date datePoids;
    Double valeur;
    Long utilisateurIdUtilisateur;
}