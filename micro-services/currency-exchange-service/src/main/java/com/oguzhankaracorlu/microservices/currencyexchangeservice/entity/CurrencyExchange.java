package com.oguzhankaracorlu.microservices.currencyexchangeservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

/**
 * @author oguzhan.karacorlu on 19.10.2022
 * @project currency-exchange-service
 */
@Entity
public class CurrencyExchange {

    public Long id;
    private String source;
    private String target;
    private BigDecimal conversionMultiple;
    private String environment;


    public CurrencyExchange() {
    }

    public CurrencyExchange(Long id, String source, String target, BigDecimal conversionMultiple) {
        this.id = id;
        this.source = source;
        this.target = target;
        this.conversionMultiple = conversionMultiple;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String from) {
        this.source = from;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String to) {
        this.target = to;
    }

    public BigDecimal getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(BigDecimal conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

}
