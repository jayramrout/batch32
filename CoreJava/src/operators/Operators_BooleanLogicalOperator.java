package operators;

public class Operators_BooleanLogicalOperator {
    public static void main(String[] args) {
        int a_distance = 89;
        int b_distance = 44;
        int c_distance = 50;

        // if a_d > b_d and c_d > 20 . Then my condition is satisfying...

        System.out.println(a_distance > b_distance);
        System.out.println(c_distance > 20);

        System.out.println(a_distance > b_distance && c_distance > 20); // AND
        System.out.println(a_distance > b_distance || c_distance > 100); // OR , true
        System.out.println(  !(a_distance > b_distance || c_distance > 100)  ); // OR ,
        System.out.println(  a_distance != c_distance); // true










    }
}
