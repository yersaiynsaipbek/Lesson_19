package Lessons.lesson_4.home_work.task_2;

public class Main {
    public static void main(String[] args) {
        CarRentalService carService = new CarRentalService();
        String model = "Эконом";
        int days = 5;
        String region = "Город";

        double price = carService.calculateRentalPrice(model, days);
        double total = carService.processRentalOrder(model, days, region, price);

        System.out.println(total);
    }
}