package HW5;

import java.util.Objects;

public class TV {
    private int currentChannel;
    private int currentVolumeLevel;
    private String manufacturer;
    private boolean turnedOn;
    private boolean connect;


    public TV(int currentChannel, int currentVolumeLevel, String manufacturer, boolean turnedOn) {
        this.currentChannel = currentChannel;
        this.currentVolumeLevel = currentVolumeLevel;
        this.manufacturer = manufacturer;
        this.turnedOn = turnedOn;
        //this.connect = connect;

    }

    public boolean isConnect() {
        return connect;
    }

    public void setConnect(boolean connect) {
        this.connect = connect;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolumeLevel() {
        return currentVolumeLevel;
    }

    public void setCurrentVolumeLevel(int currentVolumeLevel) {
        this.currentVolumeLevel = currentVolumeLevel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean getTurnedOn() {
        return turnedOn;
    }

    public void setTurnedOn(boolean turnedOn) {
        this.turnedOn = turnedOn;
    }

    public void turnON () {
        System.out.println("TV is turned on. ");
        setTurnedOn(true);
    }
    public void turnOff () {
        System.out.println("TV is turned off");
        setTurnedOn(false);
    }

    @Override
    public String toString() {
        return "TV{" +
                "currentChannel=" + currentChannel +
                ", currentVolumeLevel=" + currentVolumeLevel +
                ", manufacturer='" + manufacturer + '\'' +
                ", turnedOn=" + turnedOn +

                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return currentChannel == tv.currentChannel &&
                currentVolumeLevel == tv.currentVolumeLevel &&
                turnedOn == tv.turnedOn &&

                Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolumeLevel, manufacturer, turnedOn, connect);
    }

    public int nextChannel(){
        if (turnedOn){
            System.out.println("Channel turned to next chanel");
         return currentChannel++;
        }
        else {
            System.out.println("Channel not turned because TV is OFF");
            return currentChannel=0;}
    }

    public int previousChannel(){
        if (turnedOn){
            System.out.println("Channel turned to next chanel");
            return currentChannel--;
        }
        else {
            System.out.println("Channel not turned because TV is OFF");
            return currentChannel=0;}
    }
    public int increaseVolume(){
        if (turnedOn){
            System.out.println("Volume turned louder");
            return currentVolumeLevel++;
        }
        else {
            System.out.println("Volume not turned because TV is OFF");
            return currentVolumeLevel=0;}
    }
    public int decreaseVolume(){
        if (turnedOn){
            System.out.println("Volume turned quieter");
            return currentVolumeLevel--;
        }
        else {
            System.out.println("Volume not turned because TV is OFF");
            return currentVolumeLevel=0;}
    }
}
