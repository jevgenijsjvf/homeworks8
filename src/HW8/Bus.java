package HW8;

import java.util.Objects;

public class Bus extends Cars{
    protected int numberOfSeats;

    public Bus (String model, String marka, int yearsOfIssue, int numberOfSeats) {
        super(model, marka, yearsOfIssue);
        this.numberOfSeats=numberOfSeats;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "numberOfSeats=" + numberOfSeats +
                ", model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", yearsOfIssue=" + yearsOfIssue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        if (!super.equals(o)) return false;
        Bus bus = (Bus) o;
        return numberOfSeats == bus.numberOfSeats;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfSeats);
    }
}
