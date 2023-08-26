package com.klodnicki.abstraction.homework2;

public class Vehicle4Volvo extends Vehicle implements WorkingMachine{
    public Vehicle4Volvo(String regNumber, String vin, String color, int price, int fuelUsage, String fuelLevel,
                         int mileage, EngineType type) {
        super(regNumber, vin, color, price, fuelUsage, fuelLevel, mileage, type);
    }

    @Override
    public int drive(int mileage) {
        return mileage+20;
    }

    @Override
    public String refuel(String fuelLevel) {
        return "Full!";
    }

    @Override
    public void work() {
        System.out.println("Time to demolish this old house!");
    }
}
