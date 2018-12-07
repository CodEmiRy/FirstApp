package org.pajacyk.zadanie71;

public class Ship extends Vehicle implements Sailing {


    public Ship(String name) {
        super(name);
    }

    @Override
    public void dock() {
        System.out.println("informujemy o przybyciu do portu");

    }

    @Override
    public double getFuelNeeds() {
        return 400;
    }

    @Override
    public double getDistance() {
        return 500;
    }

    @Override
    public void stop() {
        dock();
    }
}
