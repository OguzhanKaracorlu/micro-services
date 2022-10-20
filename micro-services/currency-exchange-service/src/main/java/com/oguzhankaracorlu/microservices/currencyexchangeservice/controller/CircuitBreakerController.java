package com.oguzhankaracorlu.microservices.currencyexchangeservice.controller;

import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oguzhan.karacorlu on 20.10.2022
 * @project currency-exchange-service
 */
@RestController
public class CircuitBreakerController {

    @GetMapping("/sample-api")
    public String sampleApi() {
        
        return "sample API";
    }
}
