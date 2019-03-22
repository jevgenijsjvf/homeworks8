package HW5;

public class SmartPhoneTest {
    public static void main(String []args) {
        SmartPhone huaveiP10 = new SmartPhone();
        huaveiP10.setColor("Black");
        huaveiP10.setManufacturer("Huawei");
        huaveiP10.setProcessorType("Hexa-Core");
        huaveiP10.setScreenSize(6.5);
        SmartPhone samsungS9 = new SmartPhone();
        samsungS9.setColor("White");
        samsungS9.setManufacturer("Samsung");
        samsungS9.setProcessorType("Hexa-Core");
        samsungS9.setScreenSize(5.8);

        System.out.println(huaveiP10);
        System.out.println("VS");
        System.out.println(samsungS9);
        System.out.println("Equal result: " +huaveiP10.equals(samsungS9));
    }
}
