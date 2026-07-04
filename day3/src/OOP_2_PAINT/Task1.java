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
    int x = -1;
    int y = -1;
    int x2 = -1;
    int y2 = -1;
    int x3 = -1;
    int y3 = -1;
    boolean circle_Check = false;
    boolean priamoygol_Check = false;

    Point(){
    }
    Point(int x,int y){
        this.x = x;
        this.y = y;
        circle_Check = true;
    }
    Point(int x,int y,int x2,int y2){
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
        priamoygol_Check = true;
    }
    Point(int x,int y,int x2,int y2,int x3,int y3){
        this.x = x;
        this.y = y;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;

    }
    String getPoint(){
        if(circle_Check == true){
            return "{" + x +","+ y+ "}";
        }
        if (priamoygol_Check == true ){
            return "{" + x +","+ y+ "}" + "{" + x2 +","+ y2+ "}";
        }
        return "{" + x +","+ y+ "}" + "{" + x2 +","+ y2+ "}" + "{" + x3 +","+ y3+ "}";

    }
}

interface Drawable{
    void draw();
    void draw(Color color);

}



abstract class Figure{
    protected Color color;
    protected Point[] points;
    protected String name;


    Figure(Point[] points){
        this.points = points;
    }
    String getName(){
        return name;
    }
    abstract double area();
    abstract double perimetr();


}

class Circle extends Figure implements Drawable {
    int radius;
    String name = "Круг";
    Circle(Point[] points,int radius) {
        super(points);
        this.radius = radius;
    }

    @Override
    String getName(){
        return name;
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
        System.out.print("Рисуем круг с координатами: " );
        for (Point p: points){
            System.out.println(p.getPoint());
        }
    }
    @Override
    public void draw(Color color) {
        System.out.print("Рисуем " + color.getColor()+ " круг с координатами ");

        for (Point p: points){
            System.out.println(p.getPoint());
        }
    }

}

class Priamoygolnik extends Figure implements Drawable{
    double a;
    double b;
    String name = "Прямоугольник";
    Priamoygolnik(Point[] points) {
        super(points);
        for (Point p: points){
            a = Math.abs(p.x2 - p.x);
            b = Math.abs(p.y2 - p.y);
            if(a==b){
                name = "Квадрат";
            }
        }
    }

    @Override
    String getName(){
        return name;
    }

    @Override
    double area() {
        double area = a*b ;
        return area;
    }

    @Override
    double perimetr() {
        double perimetr = a + a + b + b;
        return perimetr;
    }

    @Override
    public void draw(){
        System.out.print("Рисуем "+ getName() +" с координатами: " );
        for (Point p: points){
            System.out.println(p.getPoint());
        }
    }
    @Override
    public void draw(Color color) {
        System.out.print("Рисуем " + color.getColor()+ " круг с координатами ");

        for (Point p: points){
            System.out.println(p.getPoint());
        }
    }

}



class Triangle extends Figure implements Drawable{
    double a;
    double b;
    double c;
    String name = "Треугольник";
    Triangle(Point[] points) {
        super(points);
        for (Point p: points){
            a = Math.sqrt(Math.pow(Math.abs(p.x2 - p.x),2) + Math.pow(Math.abs(p.y2 - p.y),2));
            b = Math.sqrt(Math.pow(Math.abs(p.x2 - p.x3),2) + Math.pow(Math.abs(p.y2 - p.y3),2));
            c = Math.sqrt(Math.pow(Math.abs(p.x - p.x3),2) + Math.pow(Math.abs(p.y - p.y3),2));

        }
    }



    @Override
    String getName(){
        return name;
    }

    @Override
    double area() {
        double area = Math.sqrt(perimetr()*(perimetr()-a)*(perimetr()-b)*(perimetr()-c)) ;
        return area;
    }

    @Override
    double perimetr() {
        double perimetr = a + b + c;
        return perimetr;
    }

    @Override
    public void draw(){
        System.out.print("Рисуем "+ getName() +" с координатами: " );
        for (Point p: points){
            System.out.println(p.getPoint());
        }
    }
    @Override
    public void draw(Color color) {
        System.out.print("Рисуем " + color.getColor()+ " круг с координатами ");

        for (Point p: points){
            System.out.println(p.getPoint());
        }
    }

}


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
        System.out.print("Рисуем ваш - " + figure.getName() + " с координатами" + " ");
        for (Point p: figure.points){
            System.out.println(p.getPoint());
        }
    }

    static void draw(Figure figure,Color color){

        System.out.print("Рисуем ваш - " + figure.getName() + " с цветом " + color.getColor() + " и координатами:");
        for (Point p: figure.points){
            System.out.println(p.getPoint());
        }
    }

}

public class Task1 {
    public static void main(String[] args) {
        Circle circle = new Circle(new Point[]{new Point(1, 1)}, 3);
        circle.draw();
        circle.draw(Color.BLUE);

        //Проверка FigureUtil
        System.out.println("Площадь вашего круга: "+FigureUtil.area(circle));
        System.out.println("Периметр вашего круга: "+FigureUtil.perimetr(circle));
        FigureUtil.draw(circle);
        FigureUtil.draw(circle,Color.BLACK);


        Priamoygolnik priamoygolnik = new Priamoygolnik(new Point[]{new Point(1,1,1,2)});
        priamoygolnik.draw();
        FigureUtil.draw(priamoygolnik,Color.YEALLOW);

        Triangle triangle = new Triangle(new Point[]{new Point(1,1,2,3,4,6)});
        FigureUtil.draw(triangle,Color.RED);
        System.out.println("Площадь треугольника: " + triangle.area());
        System.out.println("Периметр треугольника: " +FigureUtil.perimetr(triangle));


    }
}
