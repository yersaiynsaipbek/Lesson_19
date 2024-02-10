package Lessons.lesson_3.home_work.task3;

public class Prime {

    static void isPrime(int number) {
        if (number == 1) {
            System.out.println(number + " - не составное число и не простое число ");
        } else if (((number % 2) != 0) && ((number % 3) != 0) && ((number % 5) != 0)) {
            if (Math.sqrt(number) == Math.ceil(Math.sqrt(number))) {
                System.out.println(number + " - составное число");
            } else {
                System.out.println(number + " - простое число");
            }
        } else if ((number != 2) && (number != 3) && (number != 5)) {
            System.out.println(number + " - составное число");
        } else {
            System.out.println(number + " - простое число");
        }

    }
}
