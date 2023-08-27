package com.klodnicki.design.patterns.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart koszyk1 = new ShoppingCart(new CreditCardPayment("1234-4343-0000-5672", "Jan Kowalski"));
        koszyk1.checkout(1000);

        ShoppingCart koszyk2 = new ShoppingCart(new PayPalPayment("janek.kowalski@wp.pl"));
        koszyk2.checkout(550);

        ShoppingCart koszyk3 = new ShoppingCart(new Cash("Kowalski"));
        koszyk3.checkout(100);

        ShoppingCart koszyk4 = new ShoppingCart(new BankCredit("Kowalski", "Credit Agricole"));
        koszyk4.checkout(5000);
    }
}
