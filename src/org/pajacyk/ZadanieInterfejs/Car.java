package org.pajacyk.ZadanieInterfejs;

public class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("wystartowało Auto");
    }

}
