package HW4;

public class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest testRunner = new CreditCardTest();
//        testRunner.test1();
//        testRunner.test2();
//        testRunner.test3();
        CreditCard card = new CreditCard("1234","0",0,200,0);
        card.printInfo();
        card.topup(100,"0"); //100,200,0
        card.printInfo();
        card.topup(100, "0"); //200,200,0
        card.printInfo();
        card.withdraw(150, "0"); //50,200,0
        card.printInfo();
        card.withdraw(150, "0"); //0,200,100
        card.printInfo();
        card.withdraw(99, "0"); //0,200,199
        card.printInfo();
        card.topup(150, "0"); //0,200,49
        card.printInfo();
        card.topup(150, "0"); //101,200,0
        card.printInfo();
       card.topup(150, "0"); //251,200,0
        card.printInfo();


    }

    public void test1() {
        CreditCard card = new CreditCard("4785232554789632", "1251", 100, 200, 0);
        System.out.println("TEST1._________");
        card.printInfo();
        boolean expectedResult = true;
        boolean actualResult = card.withdraw(150, "1251");
        if (expectedResult == actualResult) {
            System.out.println("TEST1 correct. Money issued.");
            card.printInfo();
        } else {
            System.out.println("Your Pin Code is wrong!");
            System.out.println();
        }
    }

    public void test2() {
        CreditCard card = new CreditCard("4785232554789632", "1251", 100, 200, 180);
        System.out.println("TEST2._________");
        card.printInfo();
        boolean expectedResult = false;
        boolean actualResult = card.withdraw(150, "1251");
        if (expectedResult == actualResult) {
            System.out.println("TEST2 correct. Money issued.");
            card.printInfo();
        } else {
            System.out.println("TEST2 Wrong!");
            System.out.println();
        }
    }

    public void test3() {
        CreditCard card = new CreditCard("4785232554789632", "1251", 100, 200, 180);
        System.out.println("TEST3._________");
        card.printInfo();
        boolean expectedResult = true;
        boolean actualResult = card.topup(300, "1251");
        if (expectedResult == actualResult) {
            System.out.println("TEST3 correct. Money topup.");
            card.printInfo();
        } else {
            System.out.println("TEST3 wrong!");
            System.out.println();
        }
    }

}
