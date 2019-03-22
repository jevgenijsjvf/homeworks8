package HW4;

public class LightColorDetectorTest {
    public static void main(String[] args){
        LightColorDetectorTest testRunner = new LightColorDetectorTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
        testRunner.test4();
        testRunner.test5();
        testRunner.test6();
        testRunner.test7();

    }

    public void test1() {
        LightColorDetector color = new LightColorDetector();
        String expectedResult = "Violet";
        String actualResult = color.detect(385);
          if (expectedResult == actualResult) {
            System.out.println("TEST1 Passed: Wave color is: " + actualResult);
        } else {
            System.out.println("TEST1 Failed: Wave color is: " + actualResult+ ", but expected " +expectedResult);
        }
    }

        public void test2(){
            LightColorDetector color = new LightColorDetector();
            String expectedResult = "Blue";
            String actualResult = color.detect(455);
            if (expectedResult == actualResult) {
                System.out.println("TEST1 Passed: Wave color is: " + actualResult);
            } else {
                System.out.println("TEST1 Failed: Wave color is: " + actualResult+ ", but expected " +expectedResult);
            }
    }
    public void test3(){
        LightColorDetector color = new LightColorDetector();
        String expectedResult = "Green";
        String actualResult = color.detect(500);
        if (expectedResult == actualResult) {
            System.out.println("TEST1 Passed: Wave color is: " + actualResult);
        } else {
            System.out.println("TEST1 Failed: Wave color is: " + actualResult+ ", but expected " +expectedResult);
        }
    }
    public void test4(){
        LightColorDetector color = new LightColorDetector();
        String expectedResult = "Yellow";
        String actualResult = color.detect(575);
        if (expectedResult == actualResult) {
            System.out.println("TEST1 Passed: Wave color is: " + actualResult);
        } else {
            System.out.println("TEST1 Failed: Wave color is: " + actualResult+ ", but expected " +expectedResult);
        }
    }
    public void test5(){
        LightColorDetector color = new LightColorDetector();
        String expectedResult = "Orange";
        String actualResult = color.detect(595);
        if (expectedResult == actualResult) {
            System.out.println("TEST1 Passed: Wave color is: " + actualResult);
        } else {
            System.out.println("TEST1 Failed: Wave color is: " + actualResult+ ", but expected " +expectedResult);
        }
    }
    public void test6(){
        LightColorDetector color = new LightColorDetector();
        String expectedResult = "Red";
        String actualResult = color.detect(625);
        if (expectedResult == actualResult) {
            System.out.println("TEST1 Passed: Wave color is: " + actualResult);
        } else {
            System.out.println("TEST1 Failed: Wave color is: " + actualResult+ ", but expected " +expectedResult);
        }
    }
    public void test7(){
        LightColorDetector color = new LightColorDetector();
        String expectedResult = "Light is not visible";
        String actualResult = color.detect(800);
        if (expectedResult == actualResult) {
            System.out.println("TEST1 Passed: Wave color is: " + actualResult);
        } else {
            System.out.println("TEST1 Failed: Wave color is: " + actualResult+ ", but expected " +expectedResult);
        }
    }
}
