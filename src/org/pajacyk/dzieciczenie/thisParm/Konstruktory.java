package org.pajacyk.dzieciczenie.thisParm;

public class Konstruktory {
    String s = "konstruktor";
    public Konstruktory() {
        System.out.println("konstruuktor bezparametrowy");
    }

    public Konstruktory(String s) {
        this();
        this.s = s;
     System.out.println(s);
    }
}
