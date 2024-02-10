package Lessons.lesson_4.class_work;

public class Example {

    double calculatePriceWithVAT(double price, double vatRate){
        double total =  price + price * (vatRate/100);

        return total;

    }

    double calculateChange(double itemPrice, double moneyGiven){
        if (moneyGiven>=itemPrice) {
            double total = moneyGiven - itemPrice;
            return total;
        } else {
            return 0;
        }


    }
}
