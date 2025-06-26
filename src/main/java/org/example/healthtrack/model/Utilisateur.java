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
}
