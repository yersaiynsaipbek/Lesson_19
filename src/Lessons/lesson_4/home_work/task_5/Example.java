package Lessons.lesson_4.home_work.task_5;

public class Example {
    double calculateOrderPrice(String dishType, int quantity){
        if (dishType.equals("Суп")){
            double total = quantity * 3000;
            return total;
        } else if (dishType == "Главное блюдо") {
            double total = quantity * 5000;
            return total;
        } else if (dishType == "Десерт") {
            double total = quantity * 2000;
            return  total;
        } else {
            return 1;
        }
    }

}
