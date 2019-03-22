package HW7;

public class PalindromeTest {
    public static void main(String[] args) {
        PalindromeTest testRunner = new PalindromeTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
        testRunner.test4();
        testRunner.test5();


    }

    public void test1() {
        Palindrome palin = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palin.isPalindrome("Racecar");
        if (expectedResult == actualResult) {
            System.out.println("TEST 1. Is correct. It is POLINDROME");
            System.out.println();
        } else {
            System.out.println("TEST 1. Is wrong. Your phrase or word NOT Polindrome");
            System.out.println();
        }
    }

    public void test2() {
        Palindrome palin = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palin.isPalindrome("Level");
        if (expectedResult == actualResult) {
            System.out.println("TEST 2. Is correct. It is POLINDROME");
            System.out.println();
        } else {
            System.out.println("TEST 2. Is wrong. Your phrase or word NOT Polindrome");
            System.out.println();
        }
    }

    public void test3() {
        Palindrome palin = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palin.isPalindrome("Addition summus mus");
        if (expectedResult == actualResult) {
            System.out.println("TEST 3. Is correct. It is POLINDROME");
            System.out.println();
        } else {
            System.out.println("TEST 3. Is wrong. Your phrase or word NOT Polindrome");
            System.out.println();
        }
    }

    public void test4() {
        Palindrome palin = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palin.isPalindrome("А роза упала на лапу Азора");
        if (expectedResult == actualResult) {
            System.out.println("TEST 4. Is correct. It is POLINDROME");
            System.out.println();
        } else {
            System.out.println("TEST 4. Is wrong. Your phrase or word NOT Polindrome");
            System.out.println();
        }
    }

    public void test5() {
        Palindrome palin = new Palindrome();
        boolean expectedResult = true;
        boolean actualResult = palin.isPalindrome("Аргентина манит негра");
        if (expectedResult == actualResult) {
            System.out.println("TEST 1. Is correct. It is POLINDROME");
            System.out.println();
        } else {
            System.out.println("TEST 1. Is wrong. Your phrase or word NOT Polindrome");
            System.out.println();
        }
    }
}
