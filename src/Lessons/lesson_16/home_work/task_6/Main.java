package Lessons.lesson_16.home_work.task_6;

public class Main {
    public static void main(String[] args) {
        String phrase = "Пример строки для конвертации";
        String[] praseArray = phrase.split(" ");

        for (int i = 0; i < praseArray.length; i++) {
            String word = praseArray[i];
            String firstLetter = word.substring(0,1).toLowerCase();
            String remainingLetters = word.substring(1).toUpperCase();
            praseArray[i] = firstLetter + remainingLetters;
        }

        String result = String.join("_", praseArray);
        System.out.println(result);

    }
}
