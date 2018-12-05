package org.pajacyk.Zadanie3.Zadanie33;

public class Test {
    public static void main(String[] args) {

        /**zadeklaruj zmienną typu Date o nazwie start i utwórz obiekt z wartościami (2015, 7, 23)
        – zadeklaruj zmienną typu Date o nazwie end i utwórz obiekt z wartościami (2017, 7, 11)*/

        Date start = new Date(2015, 7, 23);
        Date end = new Date(2017, 7, 11);

        /**wypisz wartości obiektów do których odnoszą się zmienne start i end*/
        System.out.println("start ="+start);
        System.out.println("end ="+end);

        /**zadeklaruj zmienną typu Date o nazwie today*/
        Date today = new Date(2018, 12, 14);
        System.out.println("today ="+today);

        /**przypisz zmiennej today wartość zmiennej start*/
        today = start;

        /** wypisz wartość obiektu do którego odnosi się today*/
        System.out.println("today ="+today);

        /**zmień wartość pól year i day poprzez zmienną today odpowiednio na 2016 i 17*/
        today.rok = 2016;
        today.dzien = 17;

        /**– wypisz wartość obiektów do których odnoszą się today i start*/
        System.out.println("today ="+today);
        System.out.println("start ="+start);

        /**przypisz zmiennej end wartość zmiennej today*/

        today = end;

        /**wypisz wartość zmiennej end*/
        System.out.println("end ="+end);

    }
}
