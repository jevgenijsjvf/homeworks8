package ourLesson;

public class CalculatorTest {
        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            int sumResult = calculator.sum(10,15);
            int subtractionResult = calculator.subtract(3,10);
            int multiplicationResult = calculator.multiply(20,20);
            double divisionResult = calculator.divide(5,2);
            System.out.println("Addition result: " + sumResult);
            System.out.println("Subtract result: " + subtractionResult);
            System.out.println("Multiply result: " + multiplicationResult);
            System.out.println("Divide result: " + divisionResult);
        }
}
