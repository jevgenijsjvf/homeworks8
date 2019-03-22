package HW8;

public class Square extends AbstractShape {

    int squareSide;

    public Square (String colorOfShape, int squareSide) {
        super(colorOfShape);
        this.squareSide=squareSide;

    }
    @Override
    public String getName() {
        String name = "Square";
        System.out.println("Figure name = " + name);
        return  name;
    }

    @Override
    public int getArea() {
        int area= squareSide*squareSide;
        System.out.println("area = " + area);
        return area;
    }
}
