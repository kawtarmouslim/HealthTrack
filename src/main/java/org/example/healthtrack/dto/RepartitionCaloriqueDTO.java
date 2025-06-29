package org.example.healthtrack.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//@AllArgsConstructor
public class RepartitionCaloriqueDTO {
    private String repas;
    private Long totalCalories;

    public String getRepas() {
        return repas;
    }

    public void setRepas(String repas) {
        this.repas = repas;
    }

    public Long getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(Long totalCalories) {
        this.totalCalories = totalCalories;
    }

    public RepartitionCaloriqueDTO(String repas, Long totalCalories) {
        this.repas = repas;
        this.totalCalories = totalCalories;
    }
}
