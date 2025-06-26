package org.example.healthtrack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Alimentation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlimentation;
    private String repas;
    private LocalDateTime dateAlimentation;
    private int calorie;
    @ManyToOne
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
}
