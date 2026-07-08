package ru.sber.base.syntax;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число до 200:");
        int a = 35;

        String[] sotki = {"","C"};
        String[] deciatki = {"","X","XX","XXX","XXXL","L","LX","LXX","LXXX","XC"};
        String[] edinici = {"","I","II","III","IV","V","VI","VII","VIII","IX"};


        int sto = a/100;
        int deciat = (a%100)/10;
        int ed = a%10;

        String result = sotki[sto] + deciatki[deciat]+ edinici[ed];
        System.out.println(result);



    }

}

