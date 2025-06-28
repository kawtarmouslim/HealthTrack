package org.example.healthtrack.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class RepartitionCaloriqueDTO {
    private String repas;
    private int totalCalories;
}
