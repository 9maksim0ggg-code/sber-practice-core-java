package ru.sber.base.syntax;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int a = in.nextInt();
    int a_reverse = 0;
    int clone = a;
    for(int i = 1;i<= a;i = i*10){
        System.out.println(i);
        
        a_reverse = a_reverse*10 + clone%10;
        clone = clone/10;
    }
    
    System.out.println(a_reverse);


    if (a == a_reverse){
        System.out.println("Вы ввели паллиндромное число");
    }
    else{
        System.out.println("Ваше число не паллиндром");
    }


    }
}
