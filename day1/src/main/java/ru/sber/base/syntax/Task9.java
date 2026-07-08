package ru.sber.base.syntax;

public class Task9 {
    public static void main(String[] args) {
        double a = 2.5;
        double b = 3.5;
        double c = 1;
        if(a == 0 && b==0 && c==0){
            System.out.println("Корней бесконечно много");
        }
        else {
            double discriminant = b * b - 4 * a * c;
            if (discriminant > 0) {
                double x1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
                double x2 = ((-b - Math.sqrt(discriminant)) / (2 * a));
                System.out.println(x1);
                System.out.println(x2);
            } else if (discriminant == 0) {
                double x = -b / (2 * a);
                System.out.println(x);
            } else {
                System.out.println("Корней нет");
            }
        }


    }
}
