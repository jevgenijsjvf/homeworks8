package HW6;

public class NumberService {
    private int sum = 0;
    private int count = 0;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int sumInRange(int a, int b) {
        if (a > b) {
            sum=0;
            while (a >= b) {
                sum = sum + b;
                b++;
            }
            System.out.println("Amount if a>b, from b till a: " + sum);
   } else if (a < b) {
            sum=0;
            while (a <= b) {
                sum = sum + a;
                a++;
            }
            System.out.println("Amount if a<b, from a till b: " + sum);
      }return sum;
    }

    public int getEvenNumberCount(int a, int b) {

        if (a > b) {
            count=0;
            for (int i = b; i <= a; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("Count if a>b, from b till a is: " + count);
        } else if (a < b) {
            count=0;
            for (int i = a; i <= b; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
            System.out.println("Count if a<b, from a till b is: " + count);
        }return count;
    }
}
