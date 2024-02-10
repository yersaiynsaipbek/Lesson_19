package Lessons.lesson_18.home_work.task_1;

public class Person implements Reader, Librarian, Supplier, Administrator {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void takeBook(String book) {
        System.out.println(name + " взял книгу: " + book);
    }

    @Override
    public void returnBook(String book) {
        System.out.println(name + " вернул книгу: " + book);
    }

    @Override
    public void orderBook(String book) {
        System.out.println(name + " заказал книгу: " + book);
    }

    @Override
    public void supplyBook(String book) {
        System.out.println(name + " поставил книгу: " + book);
    }

    @Override
    public void findBook(String book) {
        System.out.println(name + " нашел книгу: " + book);
    }

    @Override
    public void issueBook(String book, Reader reader) {
        System.out.println(name + " выдал книгу: " + book + " читателю " + ((Person)reader).name);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Уведомление о просрочке для " + ((Person)reader).name);
    }
}
