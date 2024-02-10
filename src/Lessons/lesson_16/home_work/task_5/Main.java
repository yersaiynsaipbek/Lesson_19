package Lessons.lesson_16.home_work.task_5;

public class Main {
    public static void main(String[] args) {
       String text = "Java удивительный язык программирования";

       String[] textArray = text.split(" ");
        int max = 0;
        String word = null;

        for (int i = 0; i < textArray.length; i++) {
            if(textArray[i].length() > max){
                max = textArray[i].length();
                word = textArray[i];
            }
        }

        System.out.println("Самая длинная слова: '" + word + "', длина: " + max);

    }
}
