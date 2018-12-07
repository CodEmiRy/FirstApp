package org.pajacyk.zadanie71;

public abstract class Vehicle {
    public String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract double getFuelNeeds();

    public abstract double getDistance();

    public double calculateFuelConsumption() {
        return getFuelNeeds() / getDistance();
    }

    public void go() {
        System.out.println("uruchomiony pojazd: " + this.getClass().getSimpleName() );
    }

    public void stop() {
        System.out.println("zatrzymany pojazd: "+ this.getClass().getSimpleName()) ;
    }

    @Override
    public String toString() {
        return "name='" + name;
    }

}
