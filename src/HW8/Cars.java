package HW8;

import java.util.Objects;

public class Cars {
    protected String model;
    protected String marka;
    protected int yearsOfIssue;

    public Cars(String model, String marka, int yearsOfIssue) {
        this.marka=marka;
        this.model=model;
        this.yearsOfIssue=yearsOfIssue;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", yearsOfIssue=" + yearsOfIssue +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return yearsOfIssue == cars.yearsOfIssue &&
                Objects.equals(model, cars.model) &&
                Objects.equals(marka, cars.marka);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, marka, yearsOfIssue);
    }
}
