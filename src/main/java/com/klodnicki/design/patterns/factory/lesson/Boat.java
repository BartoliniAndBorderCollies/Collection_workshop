package com.klodnicki.design.patterns.factory.lesson;

public class Boat implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Szuruburu po oceanie");
    }
}
