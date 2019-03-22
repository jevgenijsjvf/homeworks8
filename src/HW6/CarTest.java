package HW6;

public class CarTest {
    public static void main(String[] args) {
        Car volvo = new Car("VOLVO", "Black", 200, 0);
        volvo.accelerate();
        System.out.println("Current speed: " + volvo.getCurrentSpeed());
        System.out.println("Does volvo is driving: "+volvo.isDriving());
        System.out.println("Does volvo can Accelerate more = " + volvo.canAccelerate());
        volvo.setCurrentSpeed(200);
        System.out.println("Set speed: "+ volvo.getCurrentSpeed());
        volvo.accelerate();
        volvo.slowDown();
        System.out.println("Does volvo is driving: "+volvo.isDriving());
        System.out.println("Does volvo can Accelerate more: " + volvo.canAccelerate());
        volvo.setCurrentSpeed(100);
        System.out.println("Set speed: "+ volvo.getCurrentSpeed());
        volvo.speedUp();
    }
}