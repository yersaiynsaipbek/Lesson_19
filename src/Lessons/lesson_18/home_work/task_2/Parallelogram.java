package Lessons.lesson_18.home_work.task_2;

public abstract class Parallelogram implements Shape{
    protected double width;
    protected double height;

    public Parallelogram(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}
