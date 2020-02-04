package operators;

public class Operators {
    public static void main(String[] args) {
        int a = 50;
        int b = 60;
        int c = 30;

        String firstName = "Tom";
        String lastName = "Hardy";
        String message = "Addition of two numbers is : ";
        System.out.println(a+b +" Testing");
        System.out.println("Addition of two numbers is : " + (a+b) ); // if you add anyone to a string, it becomes a string as well.
        System.out.println(firstName + " " + lastName);

        System.out.println(message + c+b);
    }
}
