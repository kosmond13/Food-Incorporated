package com.excella.foodinc.resources;

import org.reactivestreams.Publisher;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.excella.foodinc.services.FoodService;
import com.excella.foodinc.DTOs.FoodTO;

@RestController
@RequestMapping(value = "/foodinc", produces = MediaType.APPLICATION_JSON_VALUE)

class FoodController {

    FoodService foodService = new FoodService();

    @RequestMapping
    public Publisher<FoodTO> handleNutritionRequest (@RequestParam String food) {
        return foodService.getNutrition(food);
    }

}
