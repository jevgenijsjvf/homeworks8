package HW8;

public class CarTest {
    public static void main(String[] args) {
        Cars cars=new Cars("Audi","A3",2001);
        PassengerCar passengerCar=new PassengerCar("BMW","320", 2005, 2.0);
        Truck truck=new Truck("Volvo","FH480",2008,20);
        Bus bus=new Bus("Ikarus", "220", 1998, 58);
        System.out.println(cars);
        System.out.println(passengerCar);
        System.out.println(truck);
        System.out.println(bus);
    }
}
