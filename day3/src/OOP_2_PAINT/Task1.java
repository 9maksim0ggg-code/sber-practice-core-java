//1) Создать класс Point с полями x и y.
//2) Создать абстрактный класс Figure c полем Point и методами area() и perimeter().
//3) Создать классы наследники от Figure – Круг, Прямоугольник, Квадрат (частный случай прямоугольника),
//Треугольник.
//4) Создать enum Color с перечислением не менее 5 цветов.
//5) Создать интерфейс Drawable, в котором два метода draw и draw(Color color) и применить его ко всем
//фигурам.
//6) Создать класс FigureUtil. Класс должен быть с приватным конструктором и статическими методами
//• `area(Figure figure)`– считает площадь заданной фигуры
//• perimeter(Figure figure) – считает периметр заданной фигуры
//• draw(Figure figure) – Выводит на экран фигуру с черным цветом и координатами точек.
//• draw(Figure figure, Color color) - Выводит на экран фигуру с заданным цветом и координатами
//точек.
//7) Создать класс PaintExample с методом main для демонстрации работы рисования фигур.
//* Рисовать не надо, просто вывести строку на экран – Нарисована такая-то фигура с координатами такими-то

package OOP_2_PAINT;

import java.nio.channels.Pipe;

enum Color{
    RED("Красный"),
    BLUE("Синий"),
    GREEN("Зеленый"),
    YEALLOW("Желтый"),
    BLACK("Черный");

    private String color = "Черный";
    private Color(String color){
        this.color = color;
    }
    String getColor(){
        return color;
    }

    Color(){}
}

class Point{
    int x;
    int y;

    Point(){
    }
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}

interface Drawable{
    void draw();
    void draw(Color color);

}



abstract class Figure{
    protected Color color;
    protected Point[] points;


    Figure(Color color, Point[] points){
        this.color = color;
        this.points = points;

    }

    abstract double area();
    abstract double perimetr();


}

class Circle extends Figure implements Drawable {
    int radius;
    Circle(Color color, Point[] points,int radius) {
        super(color, points);
        this.radius = radius;
    }

    @Override
    double area() {
        double area = Math.PI * radius*radius;
        return area;
    }

    @Override
    double perimetr() {
        double perimetr = Math.PI * 2 * radius;
        return perimetr;
    }

    @Override
    public void draw(){
        System.out.println("Рисуем круг с координатами: " + points);
    }
    @Override
    public void draw(Color color) {
        System.out.println("Рисуем " + color.getColor()+ " круг с координатами");
    }

}

//class Square extends Figure{
//
//    Square(Color color) {
//        super(color);
//    }
//}
//
//class Priamoygolnik extends Figure{
//
//    Priamoygolnik(Color color) {
//        super(color);
//    }
//}
//
//class Triangle extends Figure{
//    Triangle(Color color) {
//        super(color);
//    }


//}


class FigureUtil{
    private FigureUtil(){
    }
    static double area(Figure figure){
        return figure.area();
    }

    static double perimetr(Figure figure){
        return figure.perimetr();
    }

    static void draw(Figure figure){

    }

    static void draw(Color color){
        System.out.println("Рисуем фигуру с цветом ");
    }

}

public class Task1 {
    public static void main(String[] args) {
        Circle circle = new Circle(Color.BLUE, new Point[]{new Point(1, 1)}, 3);
        circle.draw();
        circle.draw(Color.BLUE);

        System.out.println(FigureUtil.area(circle));
        System.out.println(FigureUtil.perimetr(circle));
    }
}
