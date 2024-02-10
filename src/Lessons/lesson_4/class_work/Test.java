package Lessons.lesson_4.class_work;

import Lessons.lesson_4.class_work.Example;

public class Test {
    public static void main(String[] args) {
        Example example = new Example();



        System.out.println("Цена товара с учетом НДС: " + example.calculatePriceWithVAT(10000, 20));
        System.out.println("Сдача: " + example.calculateChange(1000, 2500));
    }
}
