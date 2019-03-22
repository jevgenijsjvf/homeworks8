package HW8;

public class Rhomb extends AbstractShape {
    int rhombHeight;
    int rhombSides;


    public Rhomb(String colorOfShape, int rhombHeight, int rhombSides) {
        super(colorOfShape);
        this.rhombHeight=rhombHeight;
        this.rhombSides=rhombSides;
    }


    @Override
    public String getName() {
       String name = "Rhomb";
        System.out.println("Figure name = " + name);
        return  name;
    }

    @Override
    public int getArea() {
        int area= rhombHeight*rhombSides;
        System.out.println("area = " + area);
        return area;
    }
}
