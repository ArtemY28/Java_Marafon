package day4;
//import java.util.Scanner;
import  java.util.Random;
public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[100];
        int summ = 0;

        int index = 0;
        int maxSum = 0;
        for (int i = 0; i < mass.length; i++)
           mass[i] = random.nextInt(10000);

        for (int i = 0; i < mass.length-2 ; i++) {
           // int summ = 0;
            for (int j = 0; j < i + 3; j++) {
                summ += mass[j];
            }
                if (summ>maxSum) {
                    maxSum = summ;
                    index = i;
                }
            }
            System.out.println(index);


        }
    }

