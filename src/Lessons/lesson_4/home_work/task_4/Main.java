package Lessons.lesson_4.home_work.task_4;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Example example = new Example();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размеры шахматной доски (например, 8): ");
        int number = scanner.nextInt();

        example.matrix(number);
    }
}