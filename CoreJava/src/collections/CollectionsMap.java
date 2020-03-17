package collections;

import java.util.*;

public class CollectionsMap {
    public static void main(String[] args) {

        List<String> teachers = new ArrayList<>();
        teachers.add("Peter");
        teachers.add("Ajay");
        teachers.add("Sam");

        List<String> students = new ArrayList<>();
        students.add("Sonu");
        students.add("Raja");
        students.add("Shyam");

        Map<String,List<String>> schoolMap = new HashMap<>();
        schoolMap.put("teacher", teachers);
        schoolMap.put("student",students);




        System.out.println(schoolMap);

        System.out.println(schoolMap.get("teacher"));

        System.out.println(schoolMap.get("student"));

        Map schools = new HashMap();
        schools.put("StJoeSchoo", schoolMap);

        // Loop this map , and then loop all the list inside the map as well...

        // teacher peter
        // teacher ajay
        // teacher sam
        // student Sonu.
        //...

        System.out.println(System.lineSeparator());
        Map map = new HashMap();
        map.put(null,null);
        System.out.println(map);

        Map ht = new Hashtable();
        ht.put(null,null);
    }
}
