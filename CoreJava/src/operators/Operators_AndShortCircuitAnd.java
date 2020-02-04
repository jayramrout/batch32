package operators;


public class Operators_AndShortCircuitAnd {
    public static void main(String[] args) {
        int a_distance = 20;
        int b_distance = 44;
        int c_distance = 50;

        System.out.println(a_distance > b_distance  &&  c_distance++ > 20);

        System.out.println(c_distance);
    }
}
