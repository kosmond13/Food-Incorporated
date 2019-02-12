package com.excella.foodinc;

import reactor.test.StepVerifier;
import reactor.core.Disposable;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.reactivestreams.Publisher;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import java.util.function.Function;

import com.excella.foodinc.services.FoodService;
import com.excella.foodinc.DTOs.FoodTO;
import com.excella.foodinc.DTOs.FoodBO;


public class FoodServiceTests {

    @Test
    public void testGetNutrition(){
        System.out.println("HERE");
        FoodService foodService = new FoodService();
        FoodTO testApple = new FoodTO("apple", 95, 0, 0, 25);
        Publisher<FoodTO> testFood = foodService.getNutrition("apple");

        StepVerifier.create(testFood)
                .expectNextMatches(food -> food.getName().equals("apple"))
                .expectNextMatches(food -> food.getCalories() == 95)
                .expectNextMatches(food -> food.getFat() == 0)
                .expectNextMatches(food -> food.getProtein() == 0)
                .expectNextMatches(food -> food.getCarbs() == 25)
                .verifyComplete();


//        StepVerifier.create(foodService.getNutrition("apple"))
//                .expectNext(testFood)
//                .expectComplete()
//                .verify();
    }


}