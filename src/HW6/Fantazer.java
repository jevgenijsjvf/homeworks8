package HW6;

import java.util.Random;
import java.util.Scanner;


public class Fantazer {
    private int n;
    private int c;

    public void userEnteredNumber (int n){
        this.n=n;
        System.out.println("Введеное число: " + n);
    }

    public void pcEnteredNumber () {
        this.c=c;
        Random random = new Random();
        c = random.nextInt(101);
        System.out.println("Загаданое число: " + c);
    }

    public void compare() {

        while (n==c){
            continue;

        } System.out.println("Введено число равно загаданому."+ n +"="+c);
   }


}
