package com.excella.foodinc.services;

import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

import com.excella.foodinc.DTOs.FoodBO;
import com.excella.foodinc.DTOs.FoodTO;

public class FoodService {

    FoodBO foodBusinessObject = new FoodBO();

    public Publisher<FoodTO> getNutrition (String foodType) {

        FoodTO foodItem = foodBusinessObject.getFood(foodType);
        return Mono.just(foodItem);

    }
}