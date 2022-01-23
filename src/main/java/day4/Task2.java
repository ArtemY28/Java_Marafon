package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[] mass = new int[100];

        for (int i = 0; i < mass.length; i++) {
            mass[i] =random.nextInt(10000);
        }

        int max = 0;
        int min = 1000;
        int nol = 0;
        int sumNol = 0;

        for (int maxx: mass) {
            if (maxx > max) {
                max = maxx;
            }
        }
            for (int minn: mass) {
                if (  minn<min){
                    min = minn;
                }
            }
            for (int noll: mass) {
                if(noll%10==0){
                    nol=noll;
                    sumNol+=noll;
                }
            }



        //for (int N : mass)
            System.out.println(Arrays.toString(mass));
        System.out.println("наибольший элемент массива " +  max);
        System.out.println("наименьший элемент массива " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0" +" "+nol);
        System.out.println("сумму элементов массива, оканчивающихся на 0" +" "+ sumNol);


    }

}