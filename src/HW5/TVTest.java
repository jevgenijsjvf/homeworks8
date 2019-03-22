package HW5;

public class TVTest {
    public static void main(String[] args) {
        TV sony = new TV(0, 0, "jvc", false);
        TVTest testRunner = new TVTest();
        TV jvc = new TV(0, 0, "jvc", false);
        if (jvc == sony) {
            System.out.println("jvc == sony");
        } else {
            System.out.println("jvc != sony");
        }
     if (jvc.equals(sony)) {
            System.out.println("jvc is equals to sony");
        } else {
            System.out.println("jvc is not equals to sony");
        }
        // testRunner.test1();

        testRunner.test2();
    }


    public void test1() {
        TV sony = new TV(0, 0, "Sony", false);
        sony.turnON();
        sony.nextChannel();
        System.out.println(sony);
        sony.nextChannel();
        sony.increaseVolume();
        System.out.println(sony);
        sony.nextChannel();
        sony.decreaseVolume();
        System.out.println(sony);
        sony.turnOff();
        sony.previousChannel();
        sony.decreaseVolume();
        System.out.println(sony);
    }

    public void test2() {
        TV tv = new TV(0, 0, "ZomboBox", false);

        TVController pult = new TVController(tv);
        System.out.println("TEST2");
        System.out.println(tv);
        pult.turnOff();
        pult.turnOff();
        pult.nextChannel();
        pult.increaseVolume();
        pult.turnON();
        pult.nextChannel();
        pult.increaseVolume();


    }


}
