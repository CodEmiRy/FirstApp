package org.pajacyk.strona330;

public interface RegularShape {
    // metody abstrakcyjne
    double getArea();
    double getCircumference();
    // metoda z implementacja domyslna
    default void printShapeInfo() {
        String name = getClass().getSimpleName();
        double circ = getCircumference();
        double area = getArea();
        System.out.printf("%8s [circ. = %5.2f, area = %5.2f]%n",
                name, circ, area);
    }
    // metoda statyczna
    static void printInfo(RegularShape[] list) {
        for (RegularShape shape: list) { shape.printShapeInfo(); }
    }
}

