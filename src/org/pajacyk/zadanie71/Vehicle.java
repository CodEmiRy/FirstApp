package org.pajacyk.zadanie71;

public abstract class Vehicle {
    public String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public abstract double getFuelNeeds();

    public abstract double getDistance();

    public double calculateFuelConsumption(){
        return getFuelNeeds() / getDistance();
    };

    public void go(){
        System.out.println("uruchomiony pojazd"+ getClass());
    };

    public void stop(){
        System.out.println("zatrzymany pojazd"+ getClass());

    };

    @Override
    public String toString() {
        return "name='" + name;
    }


    //    public void start() {
//        System.out.println("start Vehicle");
//    }
}
