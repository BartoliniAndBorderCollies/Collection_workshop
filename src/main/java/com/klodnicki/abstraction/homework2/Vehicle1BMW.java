package com.klodnicki.abstraction.homework2;

public class Vehicle1BMW extends Vehicle implements Car{
    public Vehicle1BMW(String regNumber, String vin, String color, int price, int fuelUsage, String fuelLevel, int mileage,
                       EngineType type) {
        super(regNumber, vin, color, price, fuelUsage, fuelLevel, mileage, type);
    }

    @Override
    public int drive(int mileage) {
        int totalDistance = getMileage()+mileage;
        setMileage(totalDistance);
        return totalDistance;
    }

    @Override
    public String refuel(String fuelLevel) {
        return "Full";
    }

    @Override
    public void openWindow() {
        System.out.println("Open two windows!");
    }
}
