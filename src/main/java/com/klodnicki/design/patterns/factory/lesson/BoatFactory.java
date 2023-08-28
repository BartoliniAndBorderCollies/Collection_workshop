package com.klodnicki.design.patterns.factory.lesson;

public class BoatFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Boat();
    }
}
