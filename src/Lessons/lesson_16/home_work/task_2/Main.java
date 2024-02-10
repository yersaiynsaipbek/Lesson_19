package Lessons.lesson_16.home_work.task_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String months = "ЯНВАРЬ-ФЕВРАЛЬ-МАРТ-АПРЕЛЬ-МАЙ-ИЮНЬ-ИЮЛЬ-АВГУСТ-СЕНТЯБРЬ-ОКТЯБРЬ-НОЯБРЬ-ДЕКАБРЬ";

        String[] monthArray = months.split("-");

        for (int i = 0; i < monthArray.length; i++) {
            String toLower = monthArray[i].toLowerCase();
            String capitalize = toLower.substring(0,1).toUpperCase() + toLower.substring(1);

            System.out.println((i + 1) + ". " + capitalize);
        }



    }

}
