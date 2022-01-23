package day4;

import java.util.Scanner;
import java.util.Random;
public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[][] mass = new int[12][8];
        int sum = 0;
        int maxsum= 0;
        int schet = 0;

         for (int i = 0; i < mass.length; i++) {
          for (int j = 0; j < mass[i].length; j++) {
            mass[i][j] =random.nextInt(50);
         }
          }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                sum += mass[i][j];

            }

            if (sum >= maxsum) {
                maxsum = sum;
                 schet =i;

            }
        }


        System.out.println(schet);
    }
}

