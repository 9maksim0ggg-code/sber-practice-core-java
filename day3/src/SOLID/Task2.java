//Прописаны классы но нет их реализации
//Задача сделать единый интерфейс и разбить по классам
//Если мы захотим добавить новую фигуру придется менять и сам метод ShapeArecCalculator

package SOLID;
class ShapeAreaCalculator {
    public double calculateArea(Figure figure) {
        return figure.shape();
    }
}
abstract class Figure{
    double radius;
    double width;
    double height;
    double base;
    abstract double shape();
}
interface Calculateshape{
    double shape();
}

class Circle extends Figure implements Calculateshape {
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double shape(){
        return Math.PI * radius * radius;
    }

}

class Rectangle extends Figure {
    private double width;
    private double height;
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double shape(){
        return width * height;
    }
}

class Triangle extends Figure{
    private double base;
    private double height;
    Triangle(double base,double height){
        this.base = base;
        this.height = height;
    }
    @Override
    public double shape(){
        return 0.5 * base * height;
    }


}


public class Task2 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(20,2);
        ShapeAreaCalculator calculator = new ShapeAreaCalculator();
        System.out.println(calculator.calculateArea(triangle));

        Circle circle = new Circle(24);
        System.out.println(calculator.calculateArea(circle));
    }
}
