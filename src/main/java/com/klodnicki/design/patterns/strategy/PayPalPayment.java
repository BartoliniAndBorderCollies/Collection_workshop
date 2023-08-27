package com.klodnicki.design.patterns.strategy;

public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Zapłacono " + amount + " zł z konta o emailu: " + email);
    }
}
