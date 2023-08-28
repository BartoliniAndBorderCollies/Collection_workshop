package com.klodnicki.design.patterns.factory.lesson;

public class Bicycle implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Pedałuję bajcyklem");
    }
}
