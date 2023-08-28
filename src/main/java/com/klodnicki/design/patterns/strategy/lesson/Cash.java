package com.klodnicki.design.patterns.strategy.lesson;

public class Cash implements PaymentStrategy{

    private String name;

    public Cash(String name) {
        this.name = name;
    }

    @Override
    public void pay(int amount) {
        System.out.println(name + " zapłacił gotówką.");
    }
}
