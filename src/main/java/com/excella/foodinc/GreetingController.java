package com.excella.foodinc;

import org.reactivestreams.Publisher;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping(value = "/foodinc/greeting", produces = MediaType.APPLICATION_JSON_VALUE)

class GreetingController {

    private final MediaType mediaType = MediaType.APPLICATION_JSON_UTF8;

    @GetMapping
    Publisher<String> getGreeting() {
        return Mono.just("Hello World!\n");
    }

}

