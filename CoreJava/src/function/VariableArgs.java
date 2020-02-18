package function;

import classes_example.Baby;

public class VariableArgs {
    public static void main(String ...args) {
//    public static void main(String ...args) {
        VariableArgs obj = new VariableArgs();
        System.out.println(obj.add(2,3));
        System.out.println(obj.add(2,3,4));
        System.out.println(obj.add(2,3,4,3,4,5,56,6,7,8,9,0,0));
        System.out.println(obj.add(2,3,"5","7","9"));
    }

    public int add(int a , int b) {
        int result = a + b;
        return result;
    }

    public int add(int a , int b, int c) {
        int result = a + b + c;
        return result;
    }

    public int add(float a , int b, int ...args) {
        //int result = a + b;
        return 0;
    }

    public int add(float a , int b, String ...args) {
        //int result = a + b;
        return 0;
    }

    /*public int add(int a , int b , int ... varg ) {
        int result = 0;
        if(varg.length == 0)
            return 0;

        for(int val : varg) {
            result += val;
        }

        return result;
    }*/
}