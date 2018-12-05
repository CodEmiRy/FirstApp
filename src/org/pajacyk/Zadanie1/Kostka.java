package org.pajacyk.Zadanie1;

import java.util.Random;

public class Kostka {
    public static void main(String[] args) {
        System.out.println(kostka());
    }

    public static int kostka() {
        Random r = new Random();
        int x = r.nextInt(6);
        System.out.println(x);
        return x;
    }

}
