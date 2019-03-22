package HW6;

public class Tesssst {
    private int n;
    private int divider;
    private int sum=0;
    private int count=0;

    public static void main(String[] args) {
        Tesssst test = new Tesssst();

        for (int i = 1; i < 500; i++) {
             if (test.simpleNumber()) {
                 System.out.println();
             }
        }

    }

    public boolean simpleNumber() {
        divider = 0;
     for (int i = 1; i <= n; i++) {
            if (n==17||n==71) {
                n++;
                continue;}

            else if (n % i == 0)
                divider++;
            }
             if (divider <= 2)
            count++;
            System.out.println(n);
            return true;
    }
}

