package com.klodnicki.abstraction.homework2;

public class Vehicle2Honda extends Vehicle implements Motorcycle{
    public Vehicle2Honda(String regNumber, String vin, String color, int price, int fuelUsage, String fuelLevel,
                         int mileage, EngineType type) {
        super(regNumber, vin, color, price, fuelUsage, fuelLevel, mileage, type);
    }

    @Override
    public int drive(int mileage) {
        return mileage+350;
    }

    @Override
    public String refuel(String fuelLevel) {
        return "Almost full ;)";
    }

    @Override
    public void ridingAtStairs() {
        System.out.println("Goes upstairs and downstairs on the old town");
    }
}
