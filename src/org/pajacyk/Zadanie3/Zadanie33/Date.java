package org.pajacyk.Zadanie3.Zadanie33;

public class Date {

    int rok;
    int miesiac;
    int dzien;


    public Date(int rok, int miesiac, int dzien) {
        this.rok = rok;
        this.miesiac = miesiac;
        this.dzien = dzien;
    }

    public void  getInfo(){
        System.out.println(rok+"' "+miesiac+"' "+dzien);
    }

    @Override
    public String toString() {
        return "Date{" +
                "rok=" + rok +
                ", miesiac=" + miesiac +
                ", dzien=" + dzien +
                '}';
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public void setMiesiac(int miesiac) {
        this.miesiac = miesiac;
    }

    public void setDzien(int dzien) {
        this.dzien = dzien;
    }
}
