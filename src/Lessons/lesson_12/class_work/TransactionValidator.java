package Lessons.lesson_12.class_work;
public class TransactionValidator {
    static final int MIN_AMOUNT = 100;
    static final int MAX_AMOUNT = 100_000;




    static boolean isValidAmount(double amount){
        if (amount > MAX_AMOUNT) {
            System.out.print("Максимальная сумма перевода:" + MAX_AMOUNT + "тг. Попробуйте ещё раз!");
            return false;
        }
        if (amount < MIN_AMOUNT ){
            System.out.print("Минимальная сумма перевода:" + MIN_AMOUNT + "тг. Попробуйте ещё раз!");
            return false;
        }


        return true;
    }



}
