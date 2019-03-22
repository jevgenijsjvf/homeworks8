package HW6;

public class NumberServiceTest {
    public static void main(String[] args) {
        NumberService ns = new NumberService();
        NumberServiceTest testRunner = new NumberServiceTest();
        testRunner.test1();
        testRunner.test2();
        System.out.println();

        ns.sumInRange(1,5);
        ns.sumInRange(5,1);
        ns.sumInRange(1,5);
        ns.getEvenNumberCount(1,10);
        ns.getEvenNumberCount(1,10);
        ns.getEvenNumberCount(1,10);
   }

    public void test1() {
        NumberService ns = new NumberService();
        ns.sumInRange(1, 10);
        int expectedResult = 45;
        int actualResult = ns.getSum();
        if (expectedResult == actualResult) {
            System.out.println("TEST1 correct! Expected result is equal Actual result, Addition is: " + actualResult);
        } else
            System.out.println("TEST1 wrong! Expected result " + expectedResult + " not equal Actual result: " + actualResult);
    }

    public void test2() {
        NumberService ns = new NumberService();
        ns.getEvenNumberCount(1, 10);
        int expectedResult = 5;
        int actualResult = ns.getCount();
        if (expectedResult == actualResult) {
            System.out.println("TEST1 correct! Expected result is equal Actual result, count is: " + actualResult);
        } else
            System.out.println("TEST1 wrong! Expected result " + expectedResult + " not equal Actual result: " + actualResult);
    }


}

