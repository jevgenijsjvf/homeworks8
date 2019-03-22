package HW8;

public class Division implements  MathOperation {
    @Override
    public double execute(double firstNumber, double secondNumber) {
        double div =firstNumber/secondNumber;
        System.out.println("div = " + div);
        return div;
    }
}
