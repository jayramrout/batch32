package function;

public class Calculator {
    static float PI = 3.141f;

    public int add(int a , int b) {
        int result = a + b;
        return result;
    }
    // Method Overloading
    public int add(int a, int b, int c) {
        int result = a + b + c;
        return result;
    }

    public void printResult(int a , int b) {
        int result = a + b;
        System.out.println("Addition is "+ result);
        int subResult = a - b;
        System.out.println("Subtractions is "+ subResult);
    }
}
