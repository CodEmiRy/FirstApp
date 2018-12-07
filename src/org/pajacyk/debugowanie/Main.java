package org.pajacyk.debugowanie;

import javafx.print.PaperSource;

public class Main {

    static final String POLE_KLASY_MAIN = "Some static value";
    String PoleObiektuWKlasieField = "pole obiektu";

    static String returnFirstElementFromTabe(String[] table) {
        return table[0];
    }

    public static void main(String[] args) {
        String[] s = {"A", "B", "C"};
        args = s;
        Person[] people = { new Person("Ala", "Kowalska", 123123123),
                new Person("", "Nowak", 123123123),
                null,
                new Person("Petyer", "", null)};
        for (Person person : people) {
            System.out.println(person.pesel);
        }
    }

    private static class Person {
        String name;
        String lastName;
        Integer pesel;

        public Person(String name, String lastName, Integer  pesel) {
            this.name = name;
            this.lastName = lastName;
            this.pesel = pesel;
        }

    }
}
