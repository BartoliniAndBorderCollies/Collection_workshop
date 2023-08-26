package com.klodnicki.abstraction.homework2;

public class Main {

    public static void main(String[] args) {
        Vehicle1BMW vehicle1 = new Vehicle1BMW("GD123", "WBVD123", "Blue", 10000, 10,
                "Low", 100, EngineType.BENZINE);
        Vehicle vehicle2 = new Vehicle2Honda("GD12354", "WBVD124543", "White", 40000, 12,
                "Medium", 1000, EngineType.BENZINE);
        Vehicle vehicle3 = new Vehicle3Man("WW12354", "WBWWVD124543", "Blue", 100000, 29,
                "Full", 10001, EngineType.DIESEL);
        Vehicle vehicle4 = new Vehicle4Volvo("GDA11123", "WBVFFD123", "Yellow-Black", 10000000,
                80,"Full", 240, EngineType.DIESEL);


        System.out.println(vehicle1.drive(10));
        System.out.println(vehicle1.drive(10));
        System.out.println(vehicle1.drive(10));

    }


}
