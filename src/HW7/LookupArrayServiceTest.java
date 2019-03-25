package HW7;

import java.util.Arrays;

public class LookupArrayServiceTest {
    public static void main(String[] args) {
        LookupArrayServiceTest testRunner = new LookupArrayServiceTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
        testRunner.test4();
        testRunner.test5();
    }


    public void test1() {
        LookupArrayService service = new LookupArrayService();
        int[] array = {1,2,5,10,7};
        System.out.println(Arrays.toString(array));
        int expectedResult = 10;
        int actualResult = service.findMax(array);
        if (expectedResult==actualResult) {
        System.out.println("TEST1 Correct. Max number= "+ actualResult);
        }else {
            System.out.println("TEST1 Wrong. Max value is" +expectedResult+"but actual value " +actualResult);
        }
    }

    public void test2() {
        LookupArrayService service = new LookupArrayService();
        int[] array = {1,2,5,10,7};
        System.out.println(Arrays.toString(array));
        int expectedResult = 1;
        int actualResult = service.findMin(array);
        if (expectedResult == actualResult) {
            System.out.println("TEST2 Correct. Min number= " + actualResult);
        } else {
            System.out.println("TEST2 Wrong. Min value is " + expectedResult + " but actual value " + actualResult);
        }
    }

    public void test3() {
        LookupArrayService service = new LookupArrayService();
        int[] array = {7, 2, 1, 10, 9};
        System.out.println(Arrays.toString(array));
        int expectedResult = 3;
        int actualResult = service.indexOfMax(array);
        if (expectedResult == actualResult) {
            System.out.println("TEST3 Correct. Max number index = " + actualResult);
        } else {
            System.out.println("TEST3 Wrong. Max number index expected " + expectedResult + " but actual index " + actualResult);
        }
    }

    public void test4() {
        LookupArrayService service = new LookupArrayService();
        int[] array = {7, 2, 1, 10, 9};
        System.out.println(Arrays.toString(array));
        int expectedResult = 2;
        int actualResult = service.indexOf(array, 1);
        if (expectedResult == actualResult) {
            System.out.println("TEST4 Correct. Entered value index = " + actualResult);
        } else {
            System.out.println("TEST4 Wrong. Entered value index expected " + expectedResult + " but actual index " + actualResult);
        }

    }

    public void test5(){
        LookupArrayService service = new LookupArrayService();
        int[] array = {7, 2, 1, 10, 9};
        System.out.println(Arrays.toString(array));
        int expectedResult = 2;
        int actualResult = service.indexOfMin(array);
        if (expectedResult == actualResult) {
            System.out.println("TEST5 Correct. Min number index = " + actualResult);
        } else {
            System.out.println("TEST5 Wrong. Min value index expected " + expectedResult + " but actual index " + actualResult);
        }
    }
}
