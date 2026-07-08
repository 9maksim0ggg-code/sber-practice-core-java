package ru.sber.base.syntax;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите натуральное число:");
        int n = in.nextInt();
        for(int i = 2;i<n;i++){
            //Проверка на каком делителе программа прекращает идти по for
            System.out.println(i);
            if ( (n%i) == 0 ) {
                System.out.println("Ваше число не является простым");
                break;
            }
            if(i==n-1){
                System.out.println("Ваше число является простым");
            }
        }



    }
}
