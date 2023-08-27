package com.klodnicki.design.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        // Eager singleton
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton3 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton4 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton5 = EagerSingleton.getInstance();

        System.out.println("1. " + eagerSingleton);
        System.out.println("2. " + eagerSingleton2);
        System.out.println("3. " + eagerSingleton3);
        System.out.println("4. " + eagerSingleton4);
        System.out.println("5. " + eagerSingleton5);
    }
}
