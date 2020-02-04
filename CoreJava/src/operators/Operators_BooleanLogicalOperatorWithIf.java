package operators;


public class Operators_BooleanLogicalOperatorWithIf {
    public static void main(String[] args) {
        int a_distance = 20;
        int b_distance = 44;
        int c_distance = 50;

        // if a_d > b_d and c_d > 20 . Then my condition is satisfying...
        boolean isLongDistance = (a_distance > b_distance);

        System.out.println(isLongDistance ? "It's a long distance" : "Its a short distance...");


        if(isLongDistance) {
            System.out.println("THis is a long distance call");
            System.out.println("Do not talk for a long time...i do not have much money to spend...");
        }else{
            System.out.println("Its a short distance..");
        }

        System.out.println(true ? ( true ? "It's a long distance": "Failed...") : "Its a short distance...");
    }
}
