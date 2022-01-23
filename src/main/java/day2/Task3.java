package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if(a<b){
        while (a+1<b){
            if (a % 5 == 0 && a % 10 != 0) {
                    System.out.println(a);
                }
                a++;
            }

        }
        else {
            System.out.println(" Некорректный ввод");
        }

        }
    }


