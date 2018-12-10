package org.pajacyk.ZadanieInterfejs;

public interface Vehicle {

    public void start();


    static void startVehicles(Vehicle[] vehicles) {
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }

    }

}
