package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsSortObject {
    public static void main(String[] args) {
        List<Manager> managers = new ArrayList<>();
        managers.add(new Manager("Peter","IT Manager"));
        managers.add(new Manager("Sam","Sales Manager"));
        managers.add(new Manager("Joan","Infra Manager"));

        for(Manager manager : managers) {
            System.out.println(manager);
        }

        System.out.println(managers);
//        Collections.sort(managers, new SortManagerByDesignation());

        /*Collections.sort(managers, new Comparator<Manager>() {
            @Override
            public int compare(Manager o1, Manager o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });*/

//        Collections.sort(managers, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        Collections.sort(managers, Comparator.comparing(Manager::getName));
        System.out.println(managers);

        /*managers.forEach(manager -> {
            System.out.println(manager);
        });*/

//        managers.forEach(manager -> System.out.println(manager));
        System.out.println(System.lineSeparator());
        managers.forEach(System.out::println);
    }

    static class SortManagerByDesignation implements Comparator<Manager> {
        @Override
        public int compare(Manager o1, Manager o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }
}

class Manager{
    public Manager(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    private String name;
    private String designation;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                '}';
    }
}