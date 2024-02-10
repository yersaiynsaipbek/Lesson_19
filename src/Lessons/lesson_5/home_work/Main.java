package Lessons.lesson_5.home_work;


public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.availableBook = new Book();
        library.availableBook.nameBook = "Atom Habits";

        Student student = new Student();
        Book book = new Book();

        student.name = "Yersaiyn";
        student.studentID = 1;

        book.author = "James Clear";
        book.nameBook = "Atom Habits";
        book.id = 2;

        library.lendBook(student, 6);
        library.acceptBook(student);

        student.display();
        book.display();









    }
}
