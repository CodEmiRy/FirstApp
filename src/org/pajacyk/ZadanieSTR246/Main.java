package org.pajacyk.ZadanieSTR246;

public class Main {
    public static void main(String[] args) {
        Vehicle v[] = new Vehicle[7];
        v[0] = new Plane();
        v[1] = new Ship();
        v[4] = new Plane();
        v[2] = new Truck();
        v[3] = new RaceCar();
        v[6] = new Plane();

        for (int i = 0; i < v.length; i++) {
            if (v[i] instanceof Plane) {
                System.out.print(i+"  ");
                Plane p = (Plane) v[i];
                p.lot();
            }
        }

    }
}
