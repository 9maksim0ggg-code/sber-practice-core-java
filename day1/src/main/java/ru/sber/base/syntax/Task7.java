package ru.sber.base.syntax;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 2;
        int reserve = 0;
        int one = 1;
        int two = 1;
        System.out.println("1");
        System.out.println("1");
        while (k<n ){
            reserve = two;
            two = one;
            one = two + reserve;
            System.out.println(one);
            k = k+1;
        }


    }
}
