package com.excella.foodinc;

//import lombok.extern.log4j.Log4j2;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.Import;
import org.springframework.util.StringUtils;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;
import org.springframework.test.web.reactive.server.WebTestClient;
import java.util.*;
import org.springframework.web.bind.annotation.*;
import org.junit.Test;


public class IngredientsControllerTests {
    @Autowired
    private WebTestClient webTestClient;

    @Test
    public void testGetIngredients(){
        List<String> testIngredients=Arrays.asList("crust","cheese","sauce","pepperoni");
        //assertEquals(testIngredients, webTestClient.get().uri("/foodinc/pizza"));
    }
}