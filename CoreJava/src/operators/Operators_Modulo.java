package operators;

public class Operators_Modulo {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;

        System.out.println(a % b); // you would be using this to find all the odd number from 1 to 100;

        // increment
        int age = 20;

        System.out.println(age);
        System.out.println("After ONE Year, age is");
//        age = age+1;
        age++; // post increment
        ++age; // pre increment

        System.out.println(age);


        // addition assignment
        int height = 3;
        System.out.println(" Before "+height);
        System.out.println("Height after 1 year");

        //height++;
//        height = height + 2;
        height += 2;

        System.out.println("After "+ height);
    }
}
