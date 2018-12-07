package org.pajacyk.zadanie61;

import java.util.StringTokenizer;

public class Date {
    String year;
    String month;
    String day;


    public Date(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;

    }

    @Override
    public String toString() {
        return year + "/" +
                month + "/" +
                day;
    }

    public static void main(String[] args) {
        Date date = new Date("2018", "12", "29");
        System.out.println(date.toString());
        System.out.println(date.of(date, "."));


    }

    public String of(Date s, String separator) {
        return s.year + separator +
                s.month + separator +
                s.day;
    }


    public Date ofTok(String s, String separator) {
        Date date = new Date("2018", "12", "29");

        StringTokenizer st = new StringTokenizer(s, separator);

        return date;
    }


}



