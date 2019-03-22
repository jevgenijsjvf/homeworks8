package HW5;

public class LightBulb {
    private boolean turnedOn;
    private int currentTurnOnCount;
    private int MAX_TURN_ON_COUNT = 5;
    private boolean connect;

    public LightBulb(boolean turnedOn, boolean connect) {
        this.turnedOn = turnedOn;
        this.connect = connect;
    }

    public boolean isConnect() {
        return connect;
    }

    public void setConnect(boolean connect) {
        this.connect = connect;
    }

    public boolean isTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public int getCurrentTurnOnCount() {
        return currentTurnOnCount;
    }

    public void setCurrentTurnOnCount(int currentTurnOnCount) {
        this.currentTurnOnCount = currentTurnOnCount;
    }

    public int getMAX_TURN_ON_COUNT() {
        return MAX_TURN_ON_COUNT;
    }

    public void turnOn() {
        currentTurnOnCount++;
        if (currentTurnOnCount <= getMAX_TURN_ON_COUNT()) {
            System.out.println(currentTurnOnCount);
            setTurnedOn(true);
        } else {
            System.out.println("Lightbulb is die!");
        }
    }

    public void turnOff() {
        setTurnedOn(false);
    }


}

