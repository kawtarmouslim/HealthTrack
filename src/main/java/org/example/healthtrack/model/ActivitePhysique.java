package org.example.healthtrack.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.sql.Time;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ActivitePhysique {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActivitePhysique;
    private Date  date;
    private  String type;
    private Time duree;
    private int pas;
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
}
