package org.example.healthtrack.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Humeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idHumeur;
    private  String niveau;
    private   String commentaire;
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
}
