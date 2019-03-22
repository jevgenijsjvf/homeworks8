package HW4;

public class UserLoginServiceTest {
    public static void main(String[] args) {
        User user = new User("ivan", "tralala");
        UserLoginService log = new UserLoginService();
        UserLoginServiceTest testRunner = new UserLoginServiceTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
        testRunner.test4();
        testRunner.test5();
        testRunner.test6();
    }

    public void test1() {
        User user = new User("ivan", "tralala");
        UserLoginService log = new UserLoginService();
        boolean expectedResult = true;
        boolean actualResult = log.login("tralala", user);
        if (expectedResult == actualResult) {
            System.out.println("TEST CORRECT. Password correct. ");
            System.out.println();
        } else {
            System.out.println("TEST WRONG");
        }
    }

    public void test2() {
        User user = new User("ivan", "tralala");
        UserLoginService log = new UserLoginService();
        boolean expectedResult = false;
        boolean actualResult = log.login("tra", user);
        if (expectedResult == actualResult) {
            System.out.println("TEST CORRECT. Password incorrect. ");
            System.out.println();
        } else {
            System.out.println("TEST WRONG");
        }
    }

    public void test3() {
        User user = new User("ivan", "tralala");
        UserLoginService log = new UserLoginService();
        log.login("tra", user);
        log.login("tra", user);
        int expectedResult = 1;
        int actualResult = user.getLoginAttemtsLeft();
        if (expectedResult == actualResult) {
            System.out.println("TEST CORRECT. Attempts counter work. Expected result: " +expectedResult+" and actual result: "+ actualResult);
            System.out.println();
        } else {
            System.out.println("TEST WRONG. Attempts counter doesn't work. Expected result: " +expectedResult+" but actual result: "+ actualResult);
        }
    }

    public void test4() {
        User user = new User("ivan", "tralala");
        UserLoginService log = new UserLoginService();
        int expectedResult = 3;
        log.login("tra", user);
        log.login("tra", user);
        log.login("tralala", user);
        int actualResult = user.getLoginAttemtsLeft();
        if (expectedResult == actualResult) {
            System.out.println("TEST CORRECT. Attempts counter restored. It is: " + actualResult);
            System.out.println();
        } else {
            System.out.println("TEST WRONG. Attempts counter not restored. ");
        }
    }

    public void test5() {
        User user = new User("ivan", "tralala");
        UserLoginService log = new UserLoginService();
        log.login("tra", user);
        log.login("tra", user);
        log.login("tra", user);
        log.login("tra", user);
        boolean expectedResult = true;
        boolean actualResult = user.isBlocked();
        //log.login("tra",user);
        if (expectedResult == actualResult) {
            System.out.println("TEST CORRECT. Login is blocked. Blocked status: " + user.isBlocked());
            System.out.println();
        } else {
            System.out.println("TEST WRONG " + user.isBlocked() + "but expected" + expectedResult);
        }
    }

    public void test6() {
        User user = new User("ivan", "tralala");
        UserLoginService log = new UserLoginService();
        log.login("tra", user);
        log.login("tra", user);
        log.login("tra", user);
        log.login("tra", user);
        log.login("tra", user);
        boolean expectedResult = true;
        boolean actualResult = user.isBlocked();
       if (expectedResult == actualResult) {
            System.out.println("TEST CORRECT. After Login blocking. User can't enter password. Because login is blocked. Blocked status: " + user.isBlocked());
            System.out.println();
        } else {
            System.out.println("TEST WRONG. Blocked is " + user.isBlocked() + "but expected" + expectedResult);
        }
    }
}



