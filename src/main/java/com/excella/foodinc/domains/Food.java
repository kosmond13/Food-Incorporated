package com.excella.foodinc.domains;

import lombok.Data;
import lombok.Value;
import org.springframework.data.annotation.Id;

@Value
@Data
public class Food{

    @Id
    private int id;

    private String name;

    private int calories;

    private int fat;

    private int protein;

    private int carbs;

    public Food (int id, String name, int calories, int fat, int protein, int carbs) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.fat = fat;
        this.protein = protein;
        this.carbs = carbs;
    }

}


