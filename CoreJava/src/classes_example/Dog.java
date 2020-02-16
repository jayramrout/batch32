package classes_example;

public class Dog {
    /**
     * Private variable can only be accessed inside the class itself
     */
    private String breed; // null
    private String color;
    private int age; // zero
//    String name; // this can be accessed within the package
    private String name; // this can be accessed within the package

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }

    public void setAge(int age){ // function/method
        if(age < 0){
            this.age = 1;
        }else {
            this.age = age;
        }
    }

    public int getAge(){
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age = 7;
    }

    public void runningSpeed(){
        if(breed != null && breed.equals("Lab")) {
            System.out.println("Running speed is pretty good");
        }else {
            System.out.println("Running speed is OK");
        }
    }

    public void swimming() {
        if(breed != null && breed.equals("Lab")) {
            System.out.println("It know how to swim");
        }else {
            System.out.println("No Swimming...");
        }
    }
}
