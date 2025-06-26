package org.example.healthtrack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Time;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Sommeil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSommeil;
    private Time coucher;
    private Time réveil;
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
}