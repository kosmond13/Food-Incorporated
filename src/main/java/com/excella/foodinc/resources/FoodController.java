package com.excella.foodinc.resources;

import org.reactivestreams.Publisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.List;

import com.excella.foodinc.services.FoodService;
import com.excella.foodinc.domains.Food;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/foodinc", produces = MediaType.APPLICATION_JSON_VALUE)

public class FoodController {

    @Autowired
    private FoodService foodService;

    @RequestMapping
    public Publisher<List<Food>> handleNutritionRequest (@RequestParam String food) {
        return foodService.getNutrition(food);
    }

}
