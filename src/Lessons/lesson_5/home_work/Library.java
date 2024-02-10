package Lessons.lesson_5.home_work;

public class Library {
    Book availableBook;

    int maxRentalDays = 5;
    int penaltyPerDays = 1000;

    void lendBook(Student student, int days) {
        if (availableBook != null && student.borrowedBook == null) {
            student.borrowedBook = availableBook;
            availableBook = null;
            student.rentalDays = days;
        } else {
            System.out.println("Unsupported..");
        }
    }

    void acceptBook(Student student) {
        if (availableBook == null && student.borrowedBook != null) {
            availableBook = student.borrowedBook;
            student.history = student.history + student.borrowedBook;
            if(maxRentalDays < student.rentalDays){
                student.penalty = (student.rentalDays - maxRentalDays) * penaltyPerDays;
            }else{
                student.penalty = 0;
            }
            student.borrowedBook = null;
        } else {
            System.out.println("Unsupported..");
        }
    }
}