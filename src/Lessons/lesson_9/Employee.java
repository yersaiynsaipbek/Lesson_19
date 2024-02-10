package Lessons.lesson_9;

public class Employee {
   private String name;
   private String position;
   private int salary;

    public Employee(String name, String position, int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

     void displayInfo(){
         System.out.println("Имя: " + name + ", Должность: " + position + ", Зарплата: " + salary);
     }
}
