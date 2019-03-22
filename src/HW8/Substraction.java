package HW8;

public class Substraction implements  MathOperation {
    @Override
    public double execute(double firstNumber, double secondNumber) {
        double sub =firstNumber-secondNumber;
        System.out.println("sub = " + sub);
        return sub;
    }
}
