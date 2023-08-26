package com.klodnicki.abstraction.homework2;

public class Vehicle3Man extends Vehicle implements Truck{
    public Vehicle3Man(String regNumber, String vin, String color, int price, int fuelUsage, String fuelLevel, int mileage,
                       EngineType type) {
        super(regNumber, vin, color, price, fuelUsage, fuelLevel, mileage, type);
    }

    @Override
    public void load() {
        System.out.println("Lets load this cargo!");
    }

    @Override
    public void unload() {
        System.out.println("Time for unloading it!");
    }

    @Override
    public int drive(int mileage) {
        return mileage+620;
    }

    @Override
    public String refuel(String fuelLevel) {
        return "Full!";
    }
}
