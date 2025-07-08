package org.example.healthtrack.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActivitePhysiqueDto implements Serializable {
    Long idActivitePhysique;
    Date date;
    String type;
    Time duree;
    int pas;
    Long utilisateurIdUtilisateur;
}