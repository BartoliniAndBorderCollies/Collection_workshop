package com.klodnicki.design.patterns.singleton;

public class EagerSingleton { // Możliwa jedna instancja klasy na aplikację tylko. Np jak chcę mieć tylko jedno połączenie
    // z bazą danych.
    // eager mi sie od razu utworzy instancje i chocbym uzywal tej klasy badz nie to i tak zajmie mi miejsce w pamieci
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){}

    public static EagerSingleton getInstance() {
        return instance;
    }
}
