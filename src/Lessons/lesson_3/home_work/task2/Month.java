package Lessons.lesson_3.home_work.task2;

public class Month {

    static void chekDaysInMonth(int number){
        switch (number){
            case 1,3,5,7,8,10,12: System.out.println("В этом месяце 31 дней");
            break;
            case 2,4,6,9,11: System.out.println("В этом месяце 30 дней");
            break;
            default:
                System.out.println("Некорректный номер");
        }
    }
}
