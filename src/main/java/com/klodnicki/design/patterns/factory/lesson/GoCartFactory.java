package com.klodnicki.design.patterns.factory.lesson;

public class GoCartFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new GoCart();
    }
}
