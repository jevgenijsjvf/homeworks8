package HW4;

public class StockTest {
    public static void main(String[] args){
        StockTest testRunner = new StockTest();
        Stock ibm = new Stock("IBM", 150);
        System.out.println("Данные на начало дня:");
        ibm.printInformation();

        System.out.println("Данные после роста цены:");
        ibm.updatePrice(150.37);
        testRunner.test1();
        ibm.printInformation();

        System.out.println("Данные после падения цен:");
        ibm.updatePrice(149.82);
        testRunner.test2();
        ibm.printInformation();


        System.out.println("Текущие данные цен:");
        ibm.updatePrice(150.12);
        testRunner.test3();
        ibm.printInformation();
    }

    public void test1() {
        Stock ibm = new Stock("IBM", 150);
        ibm.updatePrice(150.37);
        double expectedResultMin = 150.0;
        double expectedResultMax = 150.37;
        double expectedResultCurrent = 150.37;
        double actualResultMin = ibm.getMin();
        double actualResultMax = ibm.max;
        double actualResultCurrent = ibm.getCurrentValue();
        if (expectedResultCurrent==actualResultCurrent){
            System.out.println();
            System.out.println("TEST1. Correct! Expected current price = actual current price it is: " + actualResultCurrent + "$");
        }    else {
            System.out.println();
            System.out.println("TEST1. Wrong! Expected current price: "+expectedResultCurrent+" not equal actual current price: " + actualResultCurrent);
        }
        if (expectedResultMin==actualResultMin){
            System.out.println("TEST1. Correct! Expected min price = actual min price it is: " + actualResultMin + "$");
        }    else {
            System.out.println("TEST1. Wrong! Expected min price: "+expectedResultMin+" not equal actual min price: " + actualResultMin);
        }
        if (expectedResultMax==actualResultMax){
            System.out.println("TEST1. Correct! Expected max price = actual max price it is: " + actualResultMax + "$");
        }    else {
            System.out.println("TEST1. Wrong! Expected max price: "+expectedResultMax+" not equal actual max price: " + actualResultMax);
        }
    }

    public void test2() {
        Stock ibm = new Stock("IBM", 150);
        ibm.updatePrice(150.37);
        ibm.updatePrice(149.82);
        double expectedResultMin = 149.82;
        double expectedResultMax = 150.37;
        double expectedResultCurrent = 149.82;
        double actualResultMin = ibm.getMin();
        double actualResultMax = ibm.max;
        double actualResultCurrent = ibm.getCurrentValue();
        if (expectedResultCurrent==actualResultCurrent){
            System.out.println();
            System.out.println("TEST2. Correct! Expected current price = actual current price it is: " + actualResultCurrent + "$");
        }    else {
            System.out.println();
            System.out.println("TEST2. Wrong! Expected current price: "+expectedResultCurrent+" not equal actual current price: " + actualResultCurrent);
        }
        if (expectedResultMin==actualResultMin){
            System.out.println("TEST2. Correct! Expected min price = actual min price it is: " + actualResultMin + "$");
        }    else {
            System.out.println("TEST2. Wrong! Expected min price: "+expectedResultMin+" not equal actual min price: " + actualResultMin);
        }
        if (expectedResultMax==actualResultMax){
            System.out.println("TEST2. Correct! Expected max price = actual max price it is: " + actualResultMax + "$");
        }    else {
            System.out.println("TEST2. Wrong! Expected max price: "+expectedResultMax+" not equal actual max price: " + actualResultMax);
        }
    }

    public void test3() {
        Stock ibm = new Stock("IBM", 150);
        ibm.updatePrice(150.37);
        ibm.updatePrice(149.82);
        ibm.updatePrice(150.12);
        double expectedResultMin = 149.82;
        double expectedResultMax = 150.37;
        double expectedResultCurrent = 150.12;
        double actualResultMin = ibm.getMin();

        double actualResultMax = ibm.max;
        double actualResultCurrent = ibm.getCurrentValue();
        if (expectedResultCurrent==actualResultCurrent){
            System.out.println();
            System.out.println("TEST3. Correct! Expected current price = actual current price it is: " + actualResultCurrent + "$");
        }    else {
            System.out.println();
            System.out.println("TEST3. Wrong! Expected current price: "+expectedResultCurrent+" not equal actual current price: " + actualResultCurrent);
        }
        if (expectedResultMin==actualResultMin){
            System.out.println("TEST3. Correct! Expected min price = actual min price it is: " + actualResultMin + "$");
        }    else {
            System.out.println("TEST3. Wrong! Expected min price: "+expectedResultMin+" not equal actual min price: " + actualResultMin);
        }
        if (expectedResultMax==actualResultMax){
            System.out.println("TEST3. Correct! Expected max price = actual max price it is: " + actualResultMax + "$");
        }    else {
            System.out.println("TEST3. Wrong! Expected max price: "+expectedResultMax+" not equal actual max price: " + actualResultMax);
        }
    }
    }


