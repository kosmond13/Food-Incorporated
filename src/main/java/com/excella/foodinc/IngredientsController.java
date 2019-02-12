package com.excella.foodinc;

import org.reactivestreams.Publisher;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;
import java.util.*;
import org.springframework.ui.Model;

@RestController
@RequestMapping(value = "/foodinc/controller", produces = MediaType.APPLICATION_JSON_VALUE)

class IngredientsController {

    @RequestMapping
    Publisher<List<String>> getIngredients (@RequestParam("recipe") String recipeType) {


        //map.addAttribute("recipeType", recipeType);
        if (recipeType == "pizza") {
            List<String> ingredients = Arrays.asList("crust", "cheese", "sauce", "pepperoni");
            return Mono.just(ingredients);
        }
        else {
            return null;
        }
    }

//    @GetMapping
//    Publisher<List<String>> getIngredients() {
//        @RequestMapping
//                public String
//
//        List<String> ingredients = Arrays.asList("crust", "cheese", "sauce", "pepperoni");
//        return Mono.just(ingredients);
//    }

}
//at request param
