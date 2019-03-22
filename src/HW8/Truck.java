package HW8;

import java.util.Objects;

public class Truck extends Cars {
    protected int loadCapacity;

    public Truck (String model, String marka, int yearsOfIssue, int loadCapacity) {
        super(model, marka, yearsOfIssue);
        this.loadCapacity=loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "loadCapacity=" + loadCapacity +
                ", model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", yearsOfIssue=" + yearsOfIssue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return loadCapacity == truck.loadCapacity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), loadCapacity);
    }
}
