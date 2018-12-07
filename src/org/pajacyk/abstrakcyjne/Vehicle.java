package org.pajacyk.abstrakcyjne;

public abstract class Vehicle {

    public void start(){
        startEngine();
        horn();
        move();
    }

    protected abstract void move();

    abstract void horn();

    private void startEngine() {
        System.out.println("uruchom silnik");
    }
}
