package Lessons.lesson_4.home_work.task_2;

public class CarRentalService {
    double calculateRentalPrice(String model, int days) {
        if (model.equals("Эконом")) {
            return days * 10000;
        } else if (model.equals("Комфорт")) {
            return days * 20000;
        } else if (model.equals("Бизнес")) {
            return days * 30000;
        } else {
            return 0;
        }
    }

    double calculateDeliveryCost(String region) {
        if (region.equals("Город")) {
            return 0;
        } else if (region.equals("Ближний регион")) {
            return 5000;
        } else if (region.equals("Дальний регион")) {
            return 10000;
        } else {
            return 0;
        }
    }

    double calculateTax(String region, double price) {
        if (region.equals("Город")) {
            return price * 0.12;
        } else if (region.equals("Ближний регион")) {
            return price * 0.1;
        } else if (region.equals("Дальний регион")) {
            return price * 0.08;
        } else {
            return 0;
        }
    }

    double processRentalOrder(String model, int days, String region, double price) {
        double total = calculateRentalPrice(model, days) + calculateDeliveryCost(region) + calculateTax(region, price);

        if (days >= 7 && 14 >= days) {
            total = total * 0.95;
            return total;
        } else if (days >= 14) {
            total = total * 0.9;
            return total;
        } else {
            return total;
        }
    }
}