package dog;

public class SquareTest {
    public static void main(String[] args) {

        Square square = new Square(5, 6);
        System.out.println("Square(5,6) P = " + square.calculatePerimeter());
        System.out.println("Square(5,6) S = " + square.calculateArea());

        System.out.println();

        Square square2 = new Square(2, 3);
        System.out.println("Square(2,3) P = " + square2.calculatePerimeter());
        System.out.println("Square(2,3) S = " + square2.calculateArea());

    }
}
