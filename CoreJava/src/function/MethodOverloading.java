package function;

public class MethodOverloading {
    public static void main(String[] args) {
        add(2,3);
        add(3,4,5);
        add(3,4,5,3);


    }

    public static int add(int a, int b) {
        return a+b;
    }

    public static int add(int a, int b, int c) {
        return a+b+c;
    }

    public static int add(int a, int b, int c, int d) {
        return a+b+c+d;
    }

    public static int addAndSubstract(int a, int b, int c, int d, int e) {
        return a+b+c-d-e;
    }



}
