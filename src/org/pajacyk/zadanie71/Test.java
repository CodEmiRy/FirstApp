package org.pajacyk.zadanie71;

public class Test {
    public static void main(String[] args) {


        Vehicle ve[] = new Vehicle[7];
        ve[0] = new Plane("plane");
        ve[1] = new Ship("Ship");
        ve[4] = new Plane("plane");
        ve[2] = new Truck("Truck");
        ve[3] = new RaceCar("plane");
        ve[6] = new Plane("plane");
        ve[5] = new Plane("plane");


        for (int i = 0; i < ve.length; i++) {

            ve[i].go();
            ve[i].stop();
            ve[i].calculateFuelConsumption();
            if (ve[i] instanceof Flying) {
                System.out.print(i + "  ");
                // Flying p = (Flying) ve[i];
                // p.callAirControl();
                ((Flying)ve[i]).callAirControl();

            }
        }

    }
}

