package HW8;

public class Rectangle extends AbstractShape {
    int rectangleWidth;
    int rectangeLenght;

    public Rectangle (String colorOfShape, int rectangeLenght, int rectangleWidth) {
        super(colorOfShape);
        this.rectangeLenght=rectangeLenght;
        this.rectangleWidth=rectangleWidth;
    }
    @Override
    public String getName() {
        String name = "Rectangle";
        System.out.println("Figure name = " + name);
        return  name;
    }

    @Override
    public int getArea() {
        int area= rectangeLenght*rectangleWidth;
        System.out.println("area = " + area);
        return area;
    }
}
