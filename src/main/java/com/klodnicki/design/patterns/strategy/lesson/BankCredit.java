package com.klodnicki.design.patterns.strategy.lesson;

public class BankCredit implements PaymentStrategy{

    private String name;
    private String bankName;

    public BankCredit(String name, String bankName) {
        this.name = name;
        this.bankName = bankName;
    }
    @Override
    public void pay(int amount) {
        System.out.println(name + " zapłacił kredytem z banku: " + bankName);
    }
}
