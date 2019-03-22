package HW7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CopyArray {
    private int startOfArray;
    private int endOfArray;

    public void create() {
        int[] array1 = new int[10];
        fillArrayRandomNumber(array1);
        copyArray(array1);
    }

    public void fillArrayRandomNumber (int a[]) {
        Random x=new Random();
       for (int i=0;i<=a.length-1;i++) {
            a[i]=x.nextInt(101);
        }
        System.out.println("Массив 1: "+Arrays.toString(a));
    }

    public void questions () {
        Scanner what=new Scanner(System.in);
        System.out.println("Введите начало диапазона значений массива: ");
        this.startOfArray=what.nextInt();
        System.out.println("Введите конец диапазона значений массива: ");
        this.endOfArray=what.nextInt();
        System.out.println("Вы запросили значения массива в диапазоне от "+startOfArray+ " до " +endOfArray);
    }

    public void copyArray(int a[]) {

        int newArraySize=0;
        for (int i=0; i<a.length;i++) {
            if (a[i]>=startOfArray && a[i]<=endOfArray){
                //array2[j]=a[i];
                newArraySize++;
           }
        }
        int[] array2 = new int[newArraySize];
        int j=0;
        for (int i=0; i<a.length;i++) {
            if (a[i]>=startOfArray && a[i]<=endOfArray){
                array2[j]=a[i];
                j++;
            }
        }
        System.out.println("Массив 2: "+Arrays.toString(array2));

    }

   public static void main(String[] args) {
    CopyArray testRun=new CopyArray();
    testRun.questions();
    testRun.create();
    }
}