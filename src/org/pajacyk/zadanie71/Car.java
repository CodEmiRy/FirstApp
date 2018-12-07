package org.pajacyk.zadanie71;

public class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    @Override
    public double getFuelNeeds() {
        return 100;
    }

    @Override
    public double getDistance() {
        return 200;
    }
}
