package Lessons.lesson_16.home_work.task_4;

public class Main {
    public static void main(String[] args) {
        String sentence = "Сегодня отличный день для программирования";

        String[] sentenceArray = sentence.split(" ");

        for (int i = 0; i < sentenceArray.length; i++) {
            System.out.println((i+1) +". " + sentenceArray[i]);
        }

        System.out.println("В предложение: '" + sentence + "' есть " + sentenceArray.length + " слов");
    }
}
