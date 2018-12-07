package org.pajacyk.strona330;

public class ShapeTest {
    public static void main(String[] args) {
        RegularShape[] shapes = new RegularShape[3];
        shapes[0] = new Triangle(1);
        shapes[1] = new Square(1);
        shapes[2] = new Circle(1);
        RegularShape.printInfo(shapes);
    }
}
