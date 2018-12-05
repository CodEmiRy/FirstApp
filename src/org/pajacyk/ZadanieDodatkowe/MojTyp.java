package org.pajacyk.ZadanieDodatkowe;

public class MojTyp {

    static {
        System.out.println("blok static");
    }

    {
        System.out.println("blok");
    }

    public MojTyp() {
        System.out.println("blok konstruktor");
    }
}
