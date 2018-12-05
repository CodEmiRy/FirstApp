package org.pajacyk.Zadanie2;

public class Przyklad1 {

    public void changeValue(MyObject i) {
        i.val=10;

    }

    public static void main(String[] args) {
        Przyklad1 p = new Przyklad1();
        MyObject a = new MyObject();
        p.changeValue(a);
        System.out.println(a);
    }

}
