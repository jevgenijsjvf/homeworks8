package dog;

public class Square {
    private int a;
    private int b;

    public Square(int height, int width) {
        this.a = height;
        this.b = width;
    }

    public int calculatePerimeter() {
        int perimeter = 2 * (a + b);
        return perimeter;
    }

    public int calculateArea() {
        int area = a * b;
        return area;
    }
}
