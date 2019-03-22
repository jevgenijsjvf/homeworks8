package HW8;

import java.util.Arrays;

public class ShapeTest {
    public static void main(String[] args) {

        Shape[] shapes = {

                new Rhomb("red", 10,10),
                new Circle("green",10),
                new Rectangle("Blue",5,2),
                new Square("Violet",5),
                new Triangle("Black",5,2)
        };

        for (Shape shape:shapes) {
            shape.getName();
            shape.getArea();

        }

    }
}
