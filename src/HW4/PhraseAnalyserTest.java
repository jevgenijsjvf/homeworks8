package HW4;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class PhraseAnalyserTest {

    public static void main(String[] args) {
        PhraseAnalyserTest testRunner = new PhraseAnalyserTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
    }

    public void checkText(String expectedResult, String actualResul, String testName) {
        if (expectedResult.equals(actualResul)) {
            System.out.println(testName+". Correct!");
            System.out.println();
        } else {
            System.out.println(testName+". Wrong!");
            System.out.println("Expected "+expectedResult+" but was "+ actualResul);
            System.out.println();
        }
    }

    public void test1() {
        PhraseAnalyser victim = new PhraseAnalyser();
        String testDescription = "Should be \'It stands no chance..\' when analysed \'Make education great again\'";
        String expectedResult = "It stands no chance..";
        String actualResult = victim.analyser("Make education great again");

        checkText(expectedResult,actualResult,testDescription);
    }

    public void test2() {
        PhraseAnalyser victim = new PhraseAnalyser();
        String testDescription = "Should be \'It could be worse\' when analysed \'Make education great fun\'";
        String expectedResult = "It could be worse";
        String actualResult = victim.analyser("Make education great fun");
        checkText(expectedResult,actualResult,testDescription);
    }

    public void test3() {
        PhraseAnalyser victim = new PhraseAnalyser();
        String testDescription = "Should be \'It is fine, really\' when analysed \'I make education great fun\'";
        String expectedResult = "It is fine, really";
        String actualResult = victim.analyser("I make education great fun");
        checkText(expectedResult,actualResult,testDescription);
    }
}
