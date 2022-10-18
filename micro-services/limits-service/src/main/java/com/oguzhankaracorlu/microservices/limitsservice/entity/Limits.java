package com.oguzhankaracorlu.microservices.limitsservice.entity;

/**
 * @author oguzhan.karacorlu on 18.10.2022
 * @project limits-service
 */
public class Limits {
    private int minumum;
    private int maximum;

    public Limits(int minumum, int maximum) {
        this.minumum = minumum;
        this.maximum = maximum;
    }

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

    @Override
    public String toString() {
        return "Limits{" +
                "minumum=" + minumum +
                ", maximum=" + maximum +
                '}';
    }
}
