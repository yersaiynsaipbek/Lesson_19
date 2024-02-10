package Lessons.lesson_4.home_work.task_6;

public class Example {
    void printPrimeNumbers(int limit) {
        for (int i = 2; i <= limit; i++) {
            if (Math.sqrt(i) != Math.ceil(Math.sqrt(i))) {
                if ((i == 2) || (i == 3) || (i == 5) || (i ==7)) {
                    System.out.println(i);
                }
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 !=0) {
                    System.out.println(i);
                }
            }


        }
    }
}
