package Lessons.lesson_4.home_work.task_3;

public class Hour {
    void simulateHour(){
        for (int hour = 0; hour <= 23; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                System.out.println(hour + ":" + minute);
            }

        }
    }
}
