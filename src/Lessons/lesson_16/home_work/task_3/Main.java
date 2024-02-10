package Lessons.lesson_16.home_work.task_3;

public class Main {
    public static void main(String[] args) {
       String days = "Понедельник,Вторник,Среда,Четверг,Пятница,Суббота,Воскресенье";
       String consonants = "бвгджзйклмнпрстфхцчшщ";

       String[] daysArray = days.split(",");

       for(String day : daysArray){
           int consonantsCount = 0;
           for (int i = 0; i < day.length(); i++) {
               char ch = day.toLowerCase().charAt(i);
               if(consonants.indexOf(ch) != -1){
                   consonantsCount += 1;
               }
           }
           System.out.println(day + " : " + consonantsCount + " согласных букв");
       }
    }
}
