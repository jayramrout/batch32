package function;

import classes_example.Baby;
import classes_example.Box;

public class PassingObjectReference {
    public static void main(String[] args) {
        Baby ron = new Baby("Ron",1);
        printDetails(ron);
        changeName(ron);
        printDetails(ron);

        Baby peter = new Baby("Peter",2);
        printDetails(peter);
        changeName(peter);
        printDetails(peter);

//       printDetails(new Baby("Raj",3));

    }
    // this function is expecting a reference of type baby...
    public static void printDetails(Baby baby) {
        System.out.println(baby.getName());
        System.out.println(baby.getAge());
    }

    public static void changeName(Baby baby){
        baby.setName("Something");
    }

    public static void changeAge(Baby baby) {
        baby.setAge( baby.getAge() + 1);
    }


}
