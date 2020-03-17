package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class CollectionsSetExample {
    public static void main(String[] args) {

        CollectionsSetExample collectionsSetExample = new CollectionsSetExample();
        List<String> names = collectionsSetExample.getName();
        System.out.println(names);

        HashSet<Object> setNames = new HashSet<>(names);
        System.out.println(setNames);

    }
















    public List<String> getName(){
        List<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Ajay");
        names.add("Ajay");
        names.add("Ajay");
        names.add("Ajay");
        names.add("Sam");
        names.add("Something");
        return  names;
    }
}
