package Lessons.lesson_3.home_work.task1;

public class Example {
     void gretting(int hour){
        if(hour>=6 && hour<12){
            System.out.println("Доброе утро");
        } else if(hour>=12 && hour<18){
            System.out.println("Добрый день");
        } else if(hour>=18 && hour<24){
            System.out.println("Добрый вечер");
        } else {
            System.out.println("Доброе ночи");
        }
    }
}
