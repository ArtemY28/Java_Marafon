package day3;
import  java.util.Scanner;


public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =0;
        while(a<5){
            double b =in.nextDouble();
            double c = in.nextDouble();
            a++;
            if (c==0){
                System.out.println("Деление на 0");
                continue;


            }
            System.out.println(b/c);
        }
    }
}
