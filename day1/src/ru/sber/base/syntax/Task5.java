package ru.sber.base.syntax;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваш вес:");
        float age = in.nextFloat();
        String result = String.format("%.2f", age * 0.17);
        System.out.println("На луне вы бы весили вот столько кг:" + result);
    }
}
