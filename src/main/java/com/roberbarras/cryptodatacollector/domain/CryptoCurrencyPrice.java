package com.roberbarras.cryptodatacollector.domain;

public class CryptoCurrencyPrice {
    private String currency;
    private double price;

    public CryptoCurrencyPrice(String currency, double price) {
        this.currency = currency;
        this.price = price;
    }

    public String getCurrency() {
        return currency;
    }

    public double getPrice() {
        return price;
    }
}