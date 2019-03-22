package HW8;

public class Multiplication implements MathOperation {
    @Override
    public double execute(double firstNumber, double secondNumber) {
        double mul =firstNumber*secondNumber;
        System.out.println("mul = " + mul);
        return mul;
    }
}
