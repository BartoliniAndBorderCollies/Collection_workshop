package com.klodnicki.design.patterns.factory.lesson;

// factory uzywam wtedy, kiedy jest potrzeba rozbudowania aplikacji w taki sposob, że jedna klasa staje się abstrakcyjną
// i w oparciu o nią mam stworzyć kolejne implementacje, obiekty itd.

public class Main {
    public static void main(String[] args) {
        VehicleFactory truckFactory = new TruckFactory();
        VehicleFactory boatFactory = new BoatFactory();
        VehicleFactory bicycleFactory = new BicycleFactory();
        VehicleFactory goCartFactory = new GoCartFactory();

        Vehicle truck = truckFactory.createVehicle();
        truck.drive();

        Vehicle boat = boatFactory.createVehicle();
        boat.drive();

        Vehicle bicycle = bicycleFactory.createVehicle();
        bicycle.drive();

        Vehicle goCart = goCartFactory.createVehicle();
        goCart.drive();

        VehicleFactory vehicleFactory = new BicycleFactory();
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.drive();
    }
}
