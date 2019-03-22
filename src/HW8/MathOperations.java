package HW8;

public class MathOperations {
    public static void main(String[] args) {
       MathOperations testRunner = new MathOperations();
       testRunner.executeAll();

    }

    public void executeAll() {
        MathOperation[] mathOperations = {
                new Addition(),
                new Substraction(),
                new Division(),
                new Multiplication()
        };
        for (MathOperation mathOperation:mathOperations) {
            mathOperation.execute(8.2,2.1);
        }

    }


}
