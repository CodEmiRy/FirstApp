package org.pajacyk.dzieciczenie.rodzic;

import java.util.Objects;

public class Rodzic {
    private String polePrivate= "private";
    public String polePublic= "public";
    protected String poleProtected= "protected";
     String poleBezPola= "BezPola";



    static {
        System.out.println("blok static Rodzic");
    }

    {
        System.out.println("blok Rodzic");
    }

    public Rodzic() {
        System.out.println("blok konstruktor Rodzic");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rodzic rodzic = (Rodzic) o;
        return Objects.equals(polePrivate, rodzic.polePrivate) &&
                Objects.equals(polePublic, rodzic.polePublic) &&
                Objects.equals(poleProtected, rodzic.poleProtected) &&
                Objects.equals(poleBezPola, rodzic.poleBezPola);
    }

    @Override
    public int hashCode() {
        return Objects.hash(polePrivate, polePublic, poleProtected, poleBezPola);
    }

    public String getPolePrivate() {
        return polePrivate;
    }

    public void setPolePrivate(String polePrivate) {
        this.polePrivate = polePrivate;
    }

    public String getPolePublic() {
        return polePublic;
    }

    public void setPolePublic(String polePublic) {
        this.polePublic = polePublic;
    }

    public String getPoleProtected() {
        return poleProtected;
    }

    public void setPoleProtected(String poleProtected) {
        this.poleProtected = poleProtected;
    }

    public String getPoleBezPola() {
        return poleBezPola;
    }

    public void setPoleBezPola(String poleBezPola) {
        this.poleBezPola = poleBezPola;
    }
}
