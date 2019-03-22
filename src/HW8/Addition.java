package HW8;

public class Addition implements MathOperation {
    @Override
    public double execute(double firstNumber, double secondNumber) {
        double sum =firstNumber+secondNumber;
        System.out.println("sum = " + sum);
        return sum;
    }
}
