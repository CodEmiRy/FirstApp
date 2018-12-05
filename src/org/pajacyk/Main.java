package org.pajacyk;

import org.pajacyk.DateInne.Date;
import org.pajacyk.ZadanieDodatkowe.MojTyp;

import static java.lang.Math.PI;
//import  java.lang.Math;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello hello");

        /**
         * ZadanieHello
         * Zadanie polega na przekazaniu napisu do konstruktora i wyświetlenie wiadomości korzystając z metody SayHello.
         * */
        Hello hello = new Hello("Siema :)");
        Hello hello2 = new Hello("Jak się masz ?:)");
        Hello hello3 = new Hello("Miło cię widzieć:)");
        hello.sayHello();
        hello2.sayHello();
        hello3.sayHello();


        /**
         * ZadanieDodatkowe
         * Zadanie polega na sprawdzeniu kolejności wyświetlania bloków
         * */

        new MojTyp();


        /**
         * Typy całkowite można inicjalizować w następujący sposób: */
        int bin = 0b101;
        int oct = 073;
        int hex = 0x3f;
        System.out.println(bin);
        System.out.println(oct);
        System.out.println(hex);


        //int liczba1 = 08;


        System.out.println(1 + 2 + "3" + (4 + 5));

        /**
         *
         * */
        short s = 'A';
        char c = 65;
        System.out.println("S=  " + s);
        System.out.println(c);


        /**
         * Rzutowanie byte
         * */
        byte b1 = 1;
        byte b2 = 2;
        byte b3 = (byte) (b1 + b2);

        System.out.println(b3);

        /**
         * DateInne
         * Jak korzystamy z typu o tej samej nazwe to każda kolejna musi mieć import w deklaracji,
         * */
        Date date = new Date();
        java.util.Date date1 = new java.util.Date();


        /**
         * import static java.lang.Math.PI;
         * Jak korzystamy:
         * */
        // System.out.println(Math.sin(Math.PI));
        System.out.println(Math.sin(PI));


        /**
         jakie wyniki powinny dac
         ponizsze operacje, a nastepnie zweryfikuj je
         praktycznie
         * */

        int x = -8;
        int suma = x + 3;
        x = -x;

        double iloraz1 = x / 4;
        double iloraz2 = x / 4.0;
        // double iloraz3 = x / 0;
        double iloraz4 = x / 0.0;
        double iloraz5 = 0 / 0.0;
        int mod1 = x % 4;
        int mod2 = -x % 4;
        int mod3 = -x % -4;

        System.out.println(iloraz1);
        System.out.println(iloraz2);
        //System.out.println(iloraz3);
        System.out.println(iloraz4);
        System.out.println(iloraz5);
        System.out.println(mod1);
        System.out.println(mod2);
        System.out.println(mod3);

        /**
         * Operatory inkrementacji (++) i dekrementacji (−−)
         * zwiekszeniu/zmniejszeniu wartosci o 1
        */
        int z = 5;
        int y = z++;
        System.out.println(z);
        System.out.println(y);

        int m = 5;
        m = m++;
        System.out.println(m);

        /**
         * Operatory arytmetyczne – problemy
         */
        int i1 = 1_000_000_000;
        int i2 = 2_000_000_000;
        long i3 = i1 + i2;
        System.out.println(i3);

        /**
         * Operatory przekształcen bitowych
         */
        System.out.println(~0);
        System.out.println(~1);
        System.out.println(~-1);
        /**
         * Tablice
         */

//        int[][][] tab ={new  int[]{1,2},new int[]{3,4}, new int[]{ 5, 6}};
//       tab[0][0][0];
    }
}
