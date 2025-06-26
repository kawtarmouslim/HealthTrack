package org.example.healthtrack.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import org.example.healthtrack.model.Sommeil;

import java.io.Serializable;
import java.sql.Time;

@Getter
@Setter
@AllArgsConstructor
public class SommeilDto implements Serializable {
    Long idSommeil;
    Time coucher;
    Time réveil;
    Long utilisateurIdUtilisateur;
}