package HW5;

public class TVController {
   private TV tv;

    public TVController(TV tv) {
        connect(tv);
    }

    public void turnON() {
        tv.turnON();
   }

    public void turnOff() {
        tv.turnOff();
    }

    public void nextChannel() {
        tv.nextChannel();
    }

    public void previousChannel() {
        tv.previousChannel();
    }

    public void increaseVolume() {
        tv.increaseVolume();
    }

    public void decreaseVolume() {
        tv.decreaseVolume();
    }

    public void connect(TV tv) {
        this.tv = tv;
    }
}
