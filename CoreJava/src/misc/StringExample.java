package misc;

import classes_example.Baby;

public class StringExample {
    public static void main(String[] args) {
        String name = "Peter";
        String name2 = "Peter";
        String name3 = new String("Peter");

//        System.out.println(name.equals(name2));
//        System.out.println(name.equals(name3));
        System.out.println("name == name2  "+  (name == name2)  );
        System.out.println("name == name3  "+(name == name3));

//        String name2 = new String("Peter");

    }
}
