package HW8;

import java.util.Objects;

public class PassengerCar extends Cars {
    protected double engineCapacity;

    public PassengerCar (String model, String marka, int yearsOfIssue, double engineCapacity) {
        super(model, marka, yearsOfIssue);
        this.engineCapacity=engineCapacity;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "engineCapacity=" + engineCapacity +
                ", model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", yearsOfIssue=" + yearsOfIssue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerCar)) return false;
        if (!super.equals(o)) return false;
        PassengerCar that = (PassengerCar) o;
        return Double.compare(that.engineCapacity, engineCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineCapacity);
    }
}
