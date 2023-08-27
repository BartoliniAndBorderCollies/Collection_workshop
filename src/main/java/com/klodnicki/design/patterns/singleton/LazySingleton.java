package com.klodnicki.design.patterns.singleton;

public class LazySingleton {
    // lazy dopiero stworzy instancję jak użyję metody getInstance i ta instancja wczesniej nie zostala stworzona
    private static LazySingleton instance;
    private LazySingleton(){}

    public LazySingleton getInstance(){
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
