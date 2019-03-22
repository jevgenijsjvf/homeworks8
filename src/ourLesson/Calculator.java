package ourLesson;

public class Calculator {
    int sum(int firstNumber, int secondNumber) {
        int result = firstNumber+secondNumber;
        return result;
    }

    int subtract(int firstNumber, int secondNumber) {
        int result = firstNumber-secondNumber;
        return result;
    }

    int multiply(int firstNumber, int secondNumber) {
        int result = firstNumber*secondNumber;
        return result;
    }

    double divide(int firstNumber, int secondNumber) {
        double result = firstNumber/ (double)secondNumber;
        return result;
    }
}
