package ourLesson;

public class SqureCalculatorTest {
    public static void main(String[] args) {
        SquareCalculator calculator = new SquareCalculator();
        int expectedResult = 225;
        int actualResult = calculator.calculatorSquare(15);
        System.out.println("Expected result: " + expectedResult);
        System.out.println("Actual result: " + actualResult);
    }
}
