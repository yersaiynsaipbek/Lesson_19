package Lessons.lesson_16.home_work.task_1;

public class Main {
    public static void main(String[] args) {
        String password = "Yersaiyn2005";
        String email = "yersaiyn@icloud.com";

        if (validatePassword(password)){
            System.out.println("Пароль валиден");
        }
        else {
            System.out.println("Пароль не валиден");
        }

        if (validateEmail(email)){
            System.out.println("Почта валиден");
        } else {
            System.out.println("Почта не валиден");
        }


    }

    public static boolean validatePassword(String password){
        if (password.length() < 8){
            return false;
        }

        boolean upperCase = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)){
                upperCase = true;
                break;
            }
        }

        if (!upperCase){
            return false;
        }

        boolean isDigit = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(Character.isDigit(ch)){
                isDigit = true;
                break;
            }
        }

        if (!isDigit){
            return false;
        }

        return true;
    }

    public static boolean validateEmail(String email){
        if(email.indexOf('@') == -1){
            return false;
        }

        if (email.contains(" ")){
            return false;
        }

        return true;
    }


}
