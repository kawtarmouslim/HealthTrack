package org.example.healthtrack.dto;

public class BesoinCaloriqueDTO {
    private int caloriesConsommees;
    private int caloriesRecommandees;

    public BesoinCaloriqueDTO(int consommees, int recommandees) {
        this.caloriesConsommees = consommees;
        this.caloriesRecommandees = recommandees;
    }

    public int getCaloriesConsommees() {
        return caloriesConsommees;
    }

    public void setCaloriesConsommees(int caloriesConsommees) {
        this.caloriesConsommees = caloriesConsommees;
    }

    public int getCaloriesRecommandees() {
        return caloriesRecommandees;
    }

    public void setCaloriesRecommandees(int caloriesRecommandees) {
        this.caloriesRecommandees = caloriesRecommandees;
    }
}
