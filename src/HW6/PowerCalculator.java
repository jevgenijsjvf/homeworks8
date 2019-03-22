package HW6;

public class PowerCalculator {
    private int number;
    private int power;


    public void pow(int number, int power) {
        this.number = number;
        this.power = power;
        if (number > 0 && power > 0) {
            int base = number;
            for (int p = 1; p <= power - 1; p++) {
                number = number * base;
            }
            System.out.println(base + " in degree " + power + " equally " + number);
        } else System.out.println("The number is negative.");


    }

    public static void main(String[] args) {
        PowerCalculator casio = new PowerCalculator();
        casio.pow(2, 10);

    }


}