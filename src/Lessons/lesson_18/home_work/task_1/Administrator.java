package Lessons.lesson_18.home_work.task_1;

public interface Administrator {
    void findBook(String book);
    void issueBook(String book, Reader reader);
    void overdueNotification(Reader reader);
}
