package Lessons.lesson_9;

public class Developer extends Employee{
    String mainProgrammingLanguage;



    public Developer(String name, String mainProgrammingLanguage, int salary) {
        super(name, "Разработчик", salary);
        this.mainProgrammingLanguage = mainProgrammingLanguage;

    }

    void displayInfo(){
        super.displayInfo();
        System.out.println("основной языке программирования" + mainProgrammingLanguage);
    }
}

