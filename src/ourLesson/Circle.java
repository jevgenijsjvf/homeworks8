package ourLesson;

public class Circle {
    double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadious(double radius) {
        this.radius = radius;
    }

    double calculatorArea (){
      return 3.14 * radius * radius;
    }
}
