package Lessons.lesson_18.home_work.task_2;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Square square = new Square(4.0);
        Rhombus rhombus = new Rhombus(4.0, 3.0);
        Circle circle = new Circle(2.5);


        System.out.println("Площадь прямоугольника: " + rectangle.getArea());
        System.out.println("Площадь квадрата: " + square.getArea());
        System.out.println("Площадь ромба: " + rhombus.getArea());
        System.out.println("Площадь круга: " + circle.getArea());



    }
}
