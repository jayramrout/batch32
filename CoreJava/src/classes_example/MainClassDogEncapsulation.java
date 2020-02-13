package classes_example;

public class MainClassDogEncapsulation {
    public static void main(String[] args) {
        Dog dog = new Dog(); // breed
//        dog.age = 3;
//        System.out.println(dog.age);

        dog.setBreed("Lab");
        dog.setAge(-7);

//        dog.color = "Black"; // state or instance variable
//        dog.age = -1;
//        dog.breed = "Lab";

        int dogAge = dog.getAge();

        System.out.println(dogAge);
        System.out.println(dog.getBreed());


    }
}
