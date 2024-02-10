package Lessons.lesson_5.class_work.example_1;

public class Main {
    public static void main(String[] args) {
        Account account_1 = new Account();
        Account account = new Account();
        Product product = new Product();
        account.owner = "Yersaiyn";
        product.name = "Fusetea";
        product.price = 50;
        account.add(10000);
        account.pay(product, "USD");
        account.transfer(account_1, 5000);

        System.out.println(account.balance);
        System.out.println(account_1.balance);


        account.display();
    }
}
