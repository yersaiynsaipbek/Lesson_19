package Lessons.lesson_9;

public class Manager extends Employee{
    private String department;


    public Manager(String name, double salary, String department){
        super(name, "Manager", (int) salary);
        this.department = department;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Отдель " + department);
    }
}
