package Lessons.lesson_16.class_work;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] names = {
                "Alex", "Drake", "Anya", "Leon", "Adam"
        };

//        for (int i = 0; i < names.length; i++ ){
//            if (names[i].startsWith("A")) {
//                System.out.println(names[i]);
//            }
//        }
//
//        for (int i = 0; i < names.length; i++ ){
//            if (names[i].charAt(0) == 'A') {
//                System.out.println(names[i]);
//            }
//        }
//
//        for (int i = 0; i < names.length; i++ ){
//            if (names[i].indexOf('A') == 0) {
//                System.out.println(names[i]);
//            }
//        }

        String text = "application hello transaction template";


        System.out.println((text.substring(0, text.indexOf(" "))) + " "+   (text.substring(text.lastIndexOf(" ") + 1)));

    }
}
