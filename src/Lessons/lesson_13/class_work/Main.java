package Lessons.lesson_13.class_work;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static User[] users = {
            new User("John", 18),
            new User("Will", 18),
            new User("Dylan", 18),
            new User("Matt", 18),
    };
    private static Product[] products = {
            new Product("Marshall IV Major"),
            new Product("Iphone XR"),
            new Product("MacBook Pro"),
            new Product("Nike Air Mag"),
    };
    private static Order[] orders = new Order[10];
    private static int orderCount = 0;

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Совершить заказ");
            System.out.println("2. Просмотреть заказы");
            System.out.println("3. Изменить статус заказа");
            System.out.println("0. Завершить");
            System.out.println("Выберите команду: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createOrder();
                    break;
                case 2:
                    showOrders();
                    break;
                case 3:
                    changeOrderStatus();
                    break;
                case 0:
                    System.out.println("Программа завершена.");
                    return;
                default:
                    System.out.println("Неверная команда. Пожалуйста, попробуйте снова.");
            }
        }
    }

    private static void createOrder() {
        for (int i = 0; i < users.length; i++) {
            System.out.println((i + 1) + ". " + users[i].getName());
        }
        System.out.println("Выберите номер пользователя:");
        int userChoice = scanner.nextInt();

        for (int i = 0; i < products.length; i++) {
            System.out.println((i + 1) + ". " + products[i].getName());
        }
        System.out.println("Выберите номер товара:");
        int productChoice = scanner.nextInt();


        Order newOrder = new Order(users[userChoice - 1], products[productChoice - 1]);
        orders[orderCount++] = newOrder;
        System.out.println("Заказ принят");
    }

    private static void showOrders() {
        if (orderCount == 0) {
            System.out.println("Нет активных заказов.");
            return;
        }

        System.out.println("Заказы:");
        for (int i = 0; i < orderCount; i++) {
            System.out.println(((i + 1) + ". " + orders[i].getOrderDetails()));
        }
    }

    private static void changeOrderStatus() {
        if (orderCount == 0) {
            System.out.println("Нет активных заказов для изменения статуса.");
            return;
        }

        for (int i = 0; i < orderCount; i++) {
            System.out.println((i + 1) + ". " + orders[i].getOrderDetails());
        }
        System.out.println("Введите номер заказа: ");
        int orderChoice = scanner.nextInt();

//        System.out.println("1. СОЗДАН");
//        System.out.println("2. В_ОБРАБОТКЕ");
//        System.out.println("3. НА_ДОСТАВКЕ");
//        System.out.println("4. ДОСТАВЛЕН");

        Status[] statuses = Status.values();
        for (int i = 0; i < statuses.length; i++) {
            System.out.println((i+1) + ". " + statuses[i]);
        }
        System.out.println("Выберите новый статус заказа: ");
        int statusChoice = scanner.nextInt();

       Status newStatus = statuses[statusChoice - 1];
       Order order = orders[orderChoice - 1];

       order.setStatus(newStatus);


        System.out.println("Статус заказа был изменен.");
        System.out.println();
    }
}
