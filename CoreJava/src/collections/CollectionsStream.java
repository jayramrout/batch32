package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsStream {
    public static void main(String[] args) {
        List<Manager> managers = new ArrayList<>();
        managers.add(new Manager("Peter","IT Manager"));
        managers.add(new Manager("Sam","Sales Manager"));
        managers.add(new Manager("Joan","Infra Manager"));
        managers.add(new Manager("Raj","Infra Manager"));
        managers.add(new Manager("Rajan","Infra Manager"));
        managers.add(new Manager("Sean","Net Manager"));
        managers.add(new Manager("Tan","Java Manager"));
        managers.add(new Manager("Goodman","Infra Manager"));

        // find all manger who belongs to infra team and find all the manager whose name start with Raj
        for(Manager manager : managers) {
            if(manager.getDesignation().equals("Infra Manager")){
                if(manager.getName().startsWith("Raj"))
                    System.out.println(manager);
            }
        }

        List<Manager> collect = managers.stream()
                .filter(manager -> manager.getDesignation().equals("Infra Manager"))
                .filter(manager -> manager.getName().startsWith("Raj"))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
