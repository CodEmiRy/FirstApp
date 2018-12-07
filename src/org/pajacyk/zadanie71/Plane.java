package org.pajacyk.zadanie71;

public class Plane extends Vehicle {
    @Override
    public void start() {
        System.out.print("Plane ");
        super.start();
    }

    public void lot(){

        System.out.println("Odlot XD");
    }
}
