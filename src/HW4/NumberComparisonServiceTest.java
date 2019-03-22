package HW4;

public class NumberComparisonServiceTest {
public void test1() {
    NumberComparisonService victim = new NumberComparisonService();
    boolean expectedResult = true;
    boolean actualResult = victim.isEqual(10,10);
    if (expectedResult==actualResult) {
        System.out.println("Test 1 has passed");
    }else {
        System.out.println("Test 1 has failed");
        System.out.println("Expected result: " + expectedResult + " but was: " + actualResult);
    }
}

    public void test2() {
        NumberComparisonService victim = new NumberComparisonService();
        boolean expectedResult = true;
        boolean actualResult = victim.isGreater(10,9);
        if (expectedResult==actualResult) {
            System.out.println("Test 1 has passed");
        }else {
            System.out.println("Test 1 has failed");
            System.out.println("Expected result: " + expectedResult + " but was: " + actualResult);
        }
    }

    public void test3() {
        NumberComparisonService victim = new NumberComparisonService();
        boolean expectedResult = true;
        boolean actualResult = victim.isLess(9,10);
        if (expectedResult==actualResult) {
            System.out.println("Test 1 has passed");
        }else {
            System.out.println("Test 1 has failed");
            System.out.println("Expected result: " + expectedResult + " but was: " + actualResult);
        }
    }

    public void test4() {
        NumberComparisonService victim = new NumberComparisonService();
        boolean expectedResult = true;
        boolean actualResult = victim.isGreaterOrEqual(11,10);
        if (expectedResult==actualResult) {
            System.out.println("Test 1 has passed");
        }else {
            System.out.println("Test 1 has failed");
            System.out.println("Expected result: " + expectedResult + " but was: " + actualResult);
        }
    }

    public void test5() {
        NumberComparisonService victim = new NumberComparisonService();
        boolean expectedResult = true;
        boolean actualResult = victim.isLessOrEqual(9,10);
        if (expectedResult==actualResult) {
            System.out.println("Test 1 has passed");
        }else {
            System.out.println("Test 1 has failed");
            System.out.println("Expected result: " + expectedResult + " but was: " + actualResult);
        }
    }


    public void test6() {
        NumberComparisonService victim = new NumberComparisonService();
        boolean expectedResult = true;
        boolean actualResult = victim.isNotEqual(9,10);
        if (expectedResult==actualResult) {
            System.out.println("Test 1 has passed");
        }else {

        }
    }

public static void main(String[] args){
    NumberComparisonServiceTest testRunner = new NumberComparisonServiceTest();
    testRunner.test1();
    testRunner.test2();
    testRunner.test3();
    testRunner.test4();
    testRunner.test5();
    testRunner.test6();
}
}
