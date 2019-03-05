package com.excella.foodinc.services;

import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;
import org.springframework.stereotype.Service;
import java.util.List;

import com.excella.foodinc.domains.Food;
import com.excella.foodinc.repository.FoodRepository;


@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public Mono<List<Food>> getNutrition (String foodType) {

        List<Food> foodItem = foodRepository.findByName(foodType);
        return Mono.just(foodItem);

    }

}