package collections;

import inheritance.AlgebraTeacher;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
//        String nam[] = new String[10];
//        nam[0] = "Peter";
//        nam[9] = "Sam";
//        nam[10] = "Something";
//        nam[4] = 7;
        //
//        System.out.println(nam[0]);
//        System.out.println(nam[1]);
//        System.out.println(nam[9]);

        List<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Ajay");
        names.add("Sam");
        names.add("Something");
//        names.add(4);
//        names.add(3);
//        names.add(new AlgebraTeacher());

        System.out.println(names);
        names.add(1,"Jagan");
        System.out.println(names);

        System.out.println(names.size());

        /*for(String name : names) {
            System.out.println(name);
        }*/

        Collections.sort(names);
        /*names.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });*/

        System.out.println(names);



    }
}
