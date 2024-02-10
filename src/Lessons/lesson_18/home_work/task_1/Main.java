package Lessons.lesson_18.home_work.task_1;

public class Main {
    public static void main(String[] args) {
        Person librarian = new Person("Айгуль апай");
        Person reader = new Person("Ерсайын");
        Person supplier = new Person("Нуртай");
        Person administrator = new Person("Али");

        librarian.orderBook("Атомные привычки");
        supplier.supplyBook("Атомные привычки");
        administrator.issueBook("Атомные привычки", reader);
        reader.takeBook("Атомные привычки");
        administrator.overdueNotification(reader);
        reader.returnBook("Атомные привычки");
    }
}
