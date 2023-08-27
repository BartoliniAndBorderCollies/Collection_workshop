package com.klodnicki.design.patterns.strategy;

public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolder;

    public CreditCardPayment(String cardNumber, String cardHolder) {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Zapłacono " + amount + " zł używając karty o 4 ostatnich cyfrach: " + cardNumber.substring(cardNumber.length() - 4));
    }
}
