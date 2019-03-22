package HW8;

public class Triangle extends AbstractShape {
    int triangeHigh;
    int triangleSide;

    public Triangle (String colorOfShape, int triangeHigh, int triangleSide) {
      super(colorOfShape);
      this.triangeHigh=triangeHigh;
      this.triangleSide=triangleSide;
    }

    @Override
    public String getName() {
        String name = "Triangle";
        System.out.println("Figure name = " + name);
        return  name;
    }

    @Override
    public int getArea() {
        int area= (int) (0.5*(triangleSide*triangeHigh));
        System.out.println("area = " + area);
        return area;
    }
}
