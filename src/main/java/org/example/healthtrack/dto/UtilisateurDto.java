package org.example.healthtrack.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UtilisateurDto implements Serializable {
    Long idUtilisateur;
    String nomComplete;
    Integer age;
    String sexe;
    double poids;
    double taille;
    String email;
    String password;
}