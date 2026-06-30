package ru.sber.base.syntax;

public class Task4 {
    public static void main(String[] args) {
        int n = 123;
        int first = n/100;
        int second = (n/10)%10;
        int third = n%10;
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        n = first+second+third;
        System.out.println("Итоговая сумма из цифр = " + n);


    }
}
