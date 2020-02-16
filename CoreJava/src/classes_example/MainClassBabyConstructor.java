package classes_example;

/**
 * Compile time polymorphism..
 */
public class MainClassBabyConstructor {
    public static void main(String[] args) {
        Baby tony = new Baby("Tony",1);
        tony.setColor(4);
        //...
        System.out.println(tony.getAge());
        System.out.println(tony.getName());
        System.out.println(tony.getCitizenship());

        System.out.println(System.lineSeparator());

        Baby peter = new Baby("Peter",2);
        peter.setCitizenship("USA");

        System.out.println(peter.getAge());
        System.out.println(peter.getName());
        System.out.println(peter.getCitizenship());

        System.out.println(System.lineSeparator());
        Baby raj = new Baby("Raj", 1, "Srilanka");
        System.out.println(raj.getAge());
        System.out.println(raj.getName());
        System.out.println(raj.getCitizenship());

    }
}
