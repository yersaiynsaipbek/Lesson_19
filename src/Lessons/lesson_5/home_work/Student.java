package Lessons.lesson_5.home_work;

public class Student {
    public Book borrowedBook;
    String name;
    int studentID;
    String history = "";
    int penalty;
    int rentalDays;


    void display(){
        System.out.println("Имя: " + name);
        System.out.println("Студенческий ID: " + studentID);

        String a = borrowedBook != null ? borrowedBook.nameBook : null;
        System.out.println("Текущая книга: " + a);
        System.out.println("История прочитанных книг: " + history );
        if (penalty > 0){
            System.out.println("Штраф за опаздания: " + penalty);
        }
        System.out.println();
    }



}


