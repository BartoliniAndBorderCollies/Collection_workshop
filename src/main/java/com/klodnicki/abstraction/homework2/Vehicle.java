package com.klodnicki.abstraction.homework2;

//Tutaj zadanko, większe, bardziej skomplikowane, do przetestowania tworząc kilka tych przykładowych obiektów-samochodów.
//        A celem jest zaprojektowanie systemu wypożyczalni samochodów. Każdy pojazd ma swój numer rejestracyjny, numer vin,
//        kolor, cenę, spalanie, stan zbiornika paliwa oraz licznik przejechanych kilometrów. Samochody dzielimy na osobowe,
//        dostawcze, motocykle i maszyny robocze. W zależności od typu, pojazdy mogą mieć dodatkowe cechy jak np. liczba
//        drzwi w przypadku aut osobowych, której to cechy nie będą mieć motocykle. Pojazdy będą mieć silnik diesla, silnik
//        na benzynę lub elektryczny. Należy korzystając z klas i interfejsów stworzyć model obiektowy tego systemu.
//        Klasy powinny mieć odpowiednie konstruktory oraz metody jedź oraz tankuj, zmieniające pola licznika kilometrów
//        oraz stanu zbiornika paliwa.

public abstract class Vehicle {
    String regNumber;
    String vin;
    String color;
    int price;
    int fuelUsage;
    String fuelLevel;
    int mileage;
    EngineType type;

    public Vehicle(String regNumber, String vin, String color, int price, int fuelUsage, String fuelLevel, int mileage,
                   EngineType type) {
        this.regNumber = regNumber;
        this.vin = vin;
        this.color = color;
        this.price = price;
        this.fuelUsage = fuelUsage;
        this.fuelLevel = fuelLevel;
        this.mileage = mileage;
        this.type = type;
    }

    public abstract int drive(int mileage);

    public abstract String refuel(String fuelLevel);

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
