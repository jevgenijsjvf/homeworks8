package HW6;

public class Car {
    private String model;
    private String color;
    private int maxSpeed;
    private int currentSpeed;

    public Car(String model, String color, int maxSpeed, int currentSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = currentSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public void accelerate () {
        if (currentSpeed<maxSpeed){
        currentSpeed++;
        System.out.println(currentSpeed);
        } else System.out.println("Reached maximum speed: " + currentSpeed + " km/h can't accelerate");
    }

    public void slowDown () {

        if (currentSpeed>=0){
            currentSpeed--;
            System.out.println(currentSpeed);
        } else System.out.println("Reached minimum speed: " + currentSpeed );
    }


    public boolean isDriving () {
        if (currentSpeed>0) {
            return true;
        }return false;
    }

    public boolean canAccelerate () {
        if (currentSpeed<maxSpeed) {
            return true;
        }return false;
    }

    public void speedUp () {
        while (currentSpeed<maxSpeed) {
            accelerate();}
    }
}
