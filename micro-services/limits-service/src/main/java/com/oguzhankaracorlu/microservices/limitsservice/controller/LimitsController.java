package com.oguzhankaracorlu.microservices.limitsservice.controller;

import com.oguzhankaracorlu.microservices.limitsservice.configuration.Configuration;
import com.oguzhankaracorlu.microservices.limitsservice.entity.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author oguzhan.karacorlu on 18.10.2022
 * @project limits-service
 */
@RestController
public class LimitsController {
    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public Limits getAll() {
        return new Limits(configuration.getMinumum(), configuration.getMaximum());
    }
}
