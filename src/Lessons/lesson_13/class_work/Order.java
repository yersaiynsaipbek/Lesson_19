package Lessons.lesson_13.class_work;

public class Order {

    private User user;
    private Product product;
    private Status status;


    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
        this.status = Status.СОЗДАН;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public String getOrderDetails() {
        return "Пользователь: " + user.getName() + ", Товар: " + product.getName() + ", Статус: " + status;
    }
}

