package HW5;

public class Switcher {
    private LightBulb lightBulb;

    public Switcher(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
    }

    public void turnON() {
        System.out.print("Turn on: ");
        lightBulb.turnOn();
    }

    public void turnOff() {
        System.out.println("Lightbulb is turned Off!");
        lightBulb.turnOff();
    }

    public void switchOnOff(boolean turnedOn) {
        LightBulb yey = new LightBulb(false, true);
        if (yey.isConnect()) {
            if (turnedOn) {
                turnON();
            } else {
                turnOff();
            }
        }
    }

    public static void main(String[] args) {
        LightBulb yey = new LightBulb(false, false);
        Switcher switc = new Switcher(yey);
        //yey.setConnect(true);
        switc.switchOnOff(true);
        switc.switchOnOff(false);
        switc.switchOnOff(true);
        switc.switchOnOff(true);
        switc.switchOnOff(true);
        switc.switchOnOff(true);
        switc.switchOnOff(true);


    }
}
