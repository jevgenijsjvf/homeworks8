package HW6;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    private int number;
    private int start;
    private int end;

    public static void main(String[] args) {
        GuessingGame run=new GuessingGame();
        Scanner scan=new Scanner(System.in);
        System.out.println("Make a number from 0 to 100 and remember it.");
        run.start=0;
        run.end=101;
        run.randomNum();
        System.out.println(run.number+" it is your number?");
        System.out.println("If your number is less enter 1, if your number is greater enter 2, if your number equal enter 3: ");
        int answer=0;
        while (answer!=3) {
            answer = scan.nextInt();

            if (answer==3) {
                System.out.println("Your number is: " + run.number);
            }
            else if (answer == 2) {
                run.start=run.number;
                run.randomNum();
                //System.out.println("Start: "+run.start+" end: " +run.end + " number: "+run.number);
                System.out.println(run.number +" it is your number?");
                System.out.println("If your number is less enter 1, if your number is greater enter 2, if your number equal enter 3: ");
            }
            else if (answer == 1) {
                run.end=run.number;
                run.randomNum();
                System.out.println(run.number +" it is your number?");
                System.out.println("If your number is less enter 1, if your number is greater enter 2, if your number equal enter 3: ");
            }
            else if (1 < answer || answer < 4) {
                System.out.println("Please reenter, your answer must be 1 or 2 or 3: ");
            }

        }
    }
    public int randomNum(){
        Random x = new Random();
        number = x.nextInt(end-start)+start;
        //System.out.println("Random, Start: "+start+" end: " +end +" number: "+number);
        return number;
    }
}
