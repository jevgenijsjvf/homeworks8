package ourLesson;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setYear(2005);
        myCar.setManufacturer("BMW");
        myCar.setColor("Black");

       System.out.println("My car is " + myCar.getYear() +" year release, this is "+myCar.getColor()+" color " +myCar.getManufacturer() );
    }
}
