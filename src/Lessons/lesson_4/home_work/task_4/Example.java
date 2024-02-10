package Lessons.lesson_4.home_work.task_4;

public class Example {

    void matrix(int number) {
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(" X ");
                } else {
                    System.out.print(" O ");
                }
            }
            System.out.println();
        }
    }
}
