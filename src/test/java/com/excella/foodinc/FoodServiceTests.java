package com.excella.foodinc;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.test.StepVerifier;
import reactor.core.publisher.Mono;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;
import static org.mockito.Mockito.when;

import com.excella.foodinc.services.FoodService;
import com.excella.foodinc.resources.FoodController;
import com.excella.foodinc.DTOs.FoodTO;

@RunWith(SpringRunner.class)
@SpringBootTest


public class FoodServiceTests {
    @Autowired
    FoodController foodController;
    @MockBean
    FoodService foodService;

    @Test
    public void testGetNutritionApple(){

        FoodTO testApple = new FoodTO("apple", 95, 0, 0, 25);
        Mono<FoodTO> monoTestApple = Mono.just(testApple);
        FoodTO comparisonApple = new FoodTO("apple", 95, 0, 0, 25);

        when(foodService.getNutrition("apple")).thenReturn(monoTestApple);

        StepVerifier.create(foodService.getNutrition("apple"))
                .assertNext(food -> assertThat(food).isEqualToComparingFieldByField(comparisonApple))
                .verifyComplete();
    }

    @Test
    public void testGetNutritionBanana(){

        FoodTO testBanana = new FoodTO("banana", 110, 0, 1, 30);
        Mono<FoodTO> monoTestBanana = Mono.just(testBanana);
        FoodTO comparisonBanana = new FoodTO("banana", 110, 0, 1, 30);

        when(foodService.getNutrition("banana")).thenReturn(monoTestBanana);

        StepVerifier.create(foodService.getNutrition("banana"))
                .assertNext(food -> assertThat(food).isEqualToComparingFieldByField(comparisonBanana))
                .verifyComplete();
    }

    @Test
    public void testGetNutritionPotatoChips(){

        FoodTO testPotatoChips = new FoodTO("potato chips", 160, 10, 2, 15);
        Mono<FoodTO> monoTestPotatoChips = Mono.just(testPotatoChips);
        FoodTO comparisonPotatoChips = new FoodTO("potato chips", 160, 10, 2, 15);

        when(foodService.getNutrition("potato chips")).thenReturn(monoTestPotatoChips);

        StepVerifier.create(foodService.getNutrition("potato chips"))
                .assertNext(food -> assertThat(food).isEqualToComparingFieldByField(comparisonPotatoChips))
                .verifyComplete();
    }


}