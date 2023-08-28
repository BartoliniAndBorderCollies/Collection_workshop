package com.klodnicki.design.patterns.factory.lesson;

public class TruckFactory implements VehicleFactory {
    @Override
    public Vehicle createVehicle() {
        return new Truck();
    }
}
