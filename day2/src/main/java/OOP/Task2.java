package OOP;

class Circle{
    double radius;
    String color;

    double area(double r){
        double s = Math.PI * Math.pow(r,2);
        return s;
    }

    double perimeter(double r){
        double perimtr = 2* Math.PI *  r;
        return perimtr;
    }


    Circle(double r,String c){
        this.radius = r;
        this.color = c;
    }

    void to_String(){
        System.out.println("Радиус вашего круга: " + radius);
        System.out.println("Периметр вашего круга: " + perimeter(radius));
        System.out.println("Площадь вашего круга: " + area(radius));
        System.out.println("Цвет вашего круга: " + color);
    }

}



public class Task2 {
    public static void main(String[] args) {
        double radius = 10.2;
        String color = "Белый";
        Circle circle = new Circle(radius,color);
        circle.to_String();

    }
}
