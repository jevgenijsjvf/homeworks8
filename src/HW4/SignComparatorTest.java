package HW4;

import java.sql.SQLOutput;

public class SignComparatorTest {
    public static void main(String[] args) {
        SignComparator compar = new SignComparator();
        SignComparatorTest comparTest = new SignComparatorTest();
        int a = 5;
        System.out.println(a + ":" + compar.compare(a));
        System.out.println();
        comparTest.test1();
        comparTest.test2();
        comparTest.test3();
    }

    public void test1(){
        String testName = "should be equal to 0, when x=0";
        SignComparator comparator = new SignComparator();
        String expectedResult = "Number is equal to zero";
        String actualResult = comparator.compare(0);
        check(actualResult,expectedResult,testName);
    }

    public void test2(){
        String testName = "Should be positive when x>0";
        SignComparator comparator = new SignComparator();
        String expectedResult = "Number is positive";
        String actualResult = comparator.compare(5);
        check(actualResult,expectedResult,testName);
    }

    public void test3(){
        String testName = "Should be negative when x<0";
        SignComparator comparator = new SignComparator();
        String expectedResult = "Number is negative";
        String actualResult = comparator.compare(-6);
        check(actualResult,expectedResult,testName);
    }

    public void check(String actualResult, String expectedResult, String testName) {
        if (actualResult==expectedResult) {
            System.out.println("Number " + testName + " it is true!");
        } else {
            System.out.println("Number " + testName + " it is false");
            System.out.println("Expected"  + expectedResult + " but should be " + actualResult);
        }
    }
}
