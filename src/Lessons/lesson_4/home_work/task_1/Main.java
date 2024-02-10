package Lessons.lesson_4.home_work.task_1;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 21; i++) {
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("Hello.Runtime");
            } else if (i % 3 == 0) {
                System.out.println("Hello");
            } else if (i % 5 == 0) {
                System.out.println("Runtime");
            }else {
                System.out.println(i);
            }

        }
    }
}
