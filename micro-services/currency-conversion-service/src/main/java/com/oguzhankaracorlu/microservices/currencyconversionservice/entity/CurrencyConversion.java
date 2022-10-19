package com.oguzhankaracorlu.microservices.currencyconversionservice.entity;

import java.math.BigDecimal;

/**
 * @author oguzhan.karacorlu on 19.10.2022
 * @project currency-conversion-service
 */
public class CurrencyConversion {

    public Long id;
    private String source;
    private String target;
    private String environment;
    private BigDecimal conversionMultiple;
    private BigDecimal amount;
    private BigDecimal totalCalculate;

    public CurrencyConversion() {
    }

    public CurrencyConversion(Long id, String source, String target,
                              BigDecimal amount, BigDecimal conversionMultiple, BigDecimal totalCalculate, String environment) {
        this.id = id;
        this.source = source;
        this.target = target;
        this.environment = environment;
        this.conversionMultiple = conversionMultiple;
        this.amount = amount;
        this.totalCalculate = totalCalculate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getTotalCalculate() {
        return totalCalculate;
    }

    public void setTotalCalculate(BigDecimal totalCalculate) {
        this.totalCalculate = totalCalculate;
    }
}
