package org.pajacyk.zadanie71;

public class Plane extends Vehicle implements Flying {

    public Plane(String name) {
        super(name);
    }

    @Override
    public void takeOff() {
        System.out.println("takeOff z Plane");
    }

    @Override
    public void land() {
        System.out.println("land z Plane");

    }

    @Override
    public void callAirControl() {
        System.out.println("callAirControl z Plane");

    }

    @Override
    public double getFuelNeeds() {
        return 10;
    }

    @Override
    public double getDistance() {
        return 20;
    }

    @Override
    public void go() {
        land();
        super.go();
    }

    @Override
    public void stop() {
        takeOff();
        super.stop();
    }
}
