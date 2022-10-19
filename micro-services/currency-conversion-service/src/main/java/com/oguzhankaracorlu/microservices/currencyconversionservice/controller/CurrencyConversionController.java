package com.oguzhankaracorlu.microservices.currencyconversionservice.controller;

import com.oguzhankaracorlu.microservices.currencyconversionservice.entity.CurrencyConversion;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @author oguzhan.karacorlu on 19.10.2022
 * @project currency-conversion-service
 */
@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversion(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {
        return new CurrencyConversion(10001L, from, to, "8100", BigDecimal.ONE, quantity, BigDecimal.ONE);
    }

}
