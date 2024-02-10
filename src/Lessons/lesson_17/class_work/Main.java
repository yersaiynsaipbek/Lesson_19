package Lessons.lesson_17.class_work;

import Lessons.lesson_13.class_work.User;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("[");

//        for (int i = 1; i < 11; i++) {
//            builder.append(i);
//            builder.append(", ");
//
//        }
//
//        builder.append("]");

        User[] users = {
                new User("Aldiar", 18),
                new User("Amina", 18),
                new User("Ali", 19)
        };

        for (int i = 0; i < users.length; i++) {
            builder.append(users[i]);
        }

        class User {
            private String name;
            private int age;

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }

            public void setName(String name) {
                this.name = name;
            }
        }


        String result = builder.toString();
        System.out.println(result);
    }
}
