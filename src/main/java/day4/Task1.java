package day4;
import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] mass = new int[n];

        for (int i = 0; i < mass.length; i++) {
            mass[i] =(int)(Math.random()*(10-1))+1;
        }

        int eight = 0;
        int one = 0;
        int chet = 0;
        int nechet = 0;
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > 8) {
                eight ++;
            }
            if (mass[i] == 1) {
                one += 1;
            }
            if (mass[i] % 2 == 0) {
                chet += 1;}
                if (mass[i] % 2 != 0) {
                    nechet += 1;
                }
                sum +=mass[i];

        }

                for (int N : mass) {
                    System.out.println(N);}
                    System.out.println("Длина массива" +  mass.length);
                    System.out.println("Количество чисел больше 8:" + eight);
                    System.out.println("Количество чисел равных 1:" + one);
                    System.out.println("Количество четных чисел:" + chet);
                    System.out.println("Количество нечетных чисел:" + nechet);
                    System.out.println("Сумма всех элементов массива:" + sum);

                }

            }




