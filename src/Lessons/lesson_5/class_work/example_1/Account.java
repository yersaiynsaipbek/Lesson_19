package Lessons.lesson_5.class_work.example_1;

public class Account {
    String owner;
    double balance;
    String history;
    double spend_money;
    double rateUSD = 457.14;
    double rateEUR = 503.51;
    double rateRUB = 4.95;
    private String currency;

    void pay(Product product, String currency) {
        if (currency.equals("USD")) {
            if (balance >= (product.price / rateUSD)) {
                balance = (balance / rateUSD) - (product.price / rateUSD);
                history = history + product.name;
                spend_money = spend_money + (product.price / rateUSD);


            } else {
                System.out.println("Недостаточно средств");
            }
        } else if (currency.equals("EUR")) {
            if (balance >= (product.price / rateEUR)) {
                balance = (balance / rateRUB) - (product.price / rateEUR);
                history = history + product.name;
                spend_money = spend_money + (product.price / rateEUR);


            } else {
                System.out.println("Недостаточно средств");
            }
        } else if (currency.equals("RUB")) {
            if (balance >= (product.price / rateRUB)) {
                balance = balance - (product.price / rateRUB);
                history = history + product.name;
                spend_money += (product.price * rateRUB);


            } else {
                System.out.println("Недостаточно средств");
            }
        }
    }



    void add(double money) {
        balance = balance + money;

    }

    void transfer(Account owner, double money) {
        if (currency.equals("USD")){
            if (balance >= money / rateUSD) {
                balance = balance - money;
                owner.balance = owner.balance + money;
            } else {
                System.out.println("Недостаточно средств");
            }
        }

    }

    void display() {
        System.out.println("У аккаунта " + owner + " снимаем ");
        System.out.println("У аккаунта " + balance + " тг ");
        System.out.println("История покупок: " + history);
        System.out.println("Потрачено: " + spend_money);
    }


}
