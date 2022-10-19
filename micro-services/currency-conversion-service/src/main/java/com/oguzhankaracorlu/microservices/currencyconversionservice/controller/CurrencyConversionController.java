package com.oguzhankaracorlu.microservices.currencyconversionservice.controller;

import com.oguzhankaracorlu.microservices.currencyconversionservice.entity.CurrencyConversion;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;

/**
 * @author oguzhan.karacorlu on 19.10.2022
 * @project currency-conversion-service
 */
@RestController
public class CurrencyConversionController {

    @GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversion calculateCurrencyConversion(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal quantity) {

        HashMap<String, String> urlVariable = new HashMap<>();
        urlVariable.put("from", from);
        urlVariable.put("to", to);

        ResponseEntity<CurrencyConversion> currencyConversionResponseEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversion.class, urlVariable);
        CurrencyConversion currencyConversion = currencyConversionResponseEntity.getBody();

//        return new CurrencyConversion(currencyConversion.getId(), from, to, currencyConversion.getEnvironment(), currencyConversion.getConversionMultiple(), quantity, quantity.multiply(currencyConversion.getConversionMultiple()));
        return new CurrencyConversion(currencyConversion.getId(), from, to, quantity,currencyConversion.getConversionMultiple(),quantity.multiply(currencyConversion.getConversionMultiple()),currencyConversion.getEnvironment());
    }
}
