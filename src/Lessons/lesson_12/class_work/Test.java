package Lessons.lesson_12.class_work;

public class Test {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        System.out.println(findMax(a, b));
    }

    private static byte findMax(byte firstNumber, byte secondNumber) {
        return (byte) Integer.max(firstNumber,  secondNumber);
    }
}
