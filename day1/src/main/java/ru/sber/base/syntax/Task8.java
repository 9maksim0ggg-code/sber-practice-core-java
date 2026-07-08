package ru.sber.base.syntax;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Угадайте какая буква загадана из этого алфавита: A B C D E F G H I J K L M N O P Q R S T U V W X Y Z");
        String symbol = in.next();
        System.out.println(symbol);
        String bykva = "B";
        boolean check = false;
        while (check == false) {
            if (symbol.compareTo(bykva) > 0) {
                System.out.println("You’re too high");
                symbol = in.next();
            }
            else if(symbol.compareTo(bykva) < 0) {
                System.out.println("You’re too low");
                symbol = in.next();
            }
            else{
                check = true;
                System.out.println("Вы угадали!");
            }
        }


    }
}
