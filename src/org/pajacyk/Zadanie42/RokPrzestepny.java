package org.pajacyk.Zadanie42;


public class RokPrzestepny {
    public static void main(String[] args) {
        System.out.println(isLeapYear(800));
        System.out.println(isLeapYear(2019));
        System.out.println(isLeapYear(444));
        System.out.println(isLeapYear(400));
        System.out.println(isLeapYear(2018));
        System.out.println(isLeapYear(5000));
    }

    public static boolean isLeapYear(int year) {
        return year%4==0&year%100!=0|(year%100==0&year%400==0);

    }
}
