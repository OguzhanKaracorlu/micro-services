package com.oguzhankaracorlu.microservices.limitsservice.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author oguzhan.karacorlu on 18.10.2022
 * @project limits-service
 */
@Component
@ConfigurationProperties("limits-service")
public class Configuration {
    private int minumum;
    private int maximum;

    public int getMinumum() {
        return minumum;
    }

    public void setMinumum(int minumum) {
        this.minumum = minumum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
