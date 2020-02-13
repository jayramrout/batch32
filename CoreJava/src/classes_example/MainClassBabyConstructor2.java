package classes_example;

/**
 * Compile time polymorphism..
 */
public class MainClassBabyConstructor2 {
    public static void main(String[] args) {
        Baby tony = new Baby("Tony",1);
        tony.printDetails();

        Baby peter = new Baby("Peter",2);
        peter.setCitizenship("USA");
        peter.printDetails();
        Baby raj = new Baby("Raj", 1, "Srilanka");
        raj.printDetails();

    }

}
