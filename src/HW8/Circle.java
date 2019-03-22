package HW8;

public class Circle extends AbstractShape {
    int radius;

    public Circle(String colorsOfShape, int radius) {
        super(colorsOfShape);
        this.radius=radius;
    }

    @Override
    public String getName() {
        String name = "Circle";
        System.out.println("Figure name = " + name);
        return name;
    }

    @Override
    public int getArea() {
        int area= (int) (3.14*( radius*radius));
        System.out.println("area = " + area);
        return area;
    }
}