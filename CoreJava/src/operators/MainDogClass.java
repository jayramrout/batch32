package operators;

import classes_example.Dog;

import java.util.Scanner;

public class MainDogClass {
    public static void main(String[] args) {
        Dog labDog = new Dog();
        labDog.setBreed("Lab");
        System.out.println(labDog.getBreed());
        labDog.runningSpeed();
        labDog.swimming();


        Dog pomoDog = new Dog();
        pomoDog.setBreed("Pomo");
        System.out.println(pomoDog.getBreed());
        pomoDog.runningSpeed();
    }
}
