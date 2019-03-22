package HW4;

public class NumberComparisonService {
    public boolean isEqual(int firstNumber, int secondNumber) {
        return firstNumber==secondNumber;
    }

    public boolean isGreater (int firstNumber, int secondNumber) {
        return firstNumber>secondNumber;
    }

    public boolean isLess (int firstNumber, int secondNumber) {
        return firstNumber<secondNumber;
    }

    public boolean isGreaterOrEqual (int firstNumber, int secondNumber) {
        return firstNumber>=secondNumber;
    }

    public boolean isLessOrEqual (int firstNumber, int secondNumber) {
        return firstNumber<=secondNumber;
    }

    public boolean isNotEqual (int firstNumber, int secondNumber) {
        return firstNumber!=secondNumber;
    }
}
