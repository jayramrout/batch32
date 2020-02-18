package function;

/*
    1 = 1
    2 = 2 x 1
    3 = 3 x 2 x 1;
    4 = 4 x 3 x 2 x 1;

 */
public class Factorial {
    public static void main(String[] args) {
        Factorial obj = new Factorial();
        System.out.println(obj.fact(3));
    }

    int fact(int n) {
        int result;
        if( n == 1)
            return 1;
        result = fact(n-1) * n;
        return result;
    }

}
