package function;

import classes_example.Baby;

public class MethodExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
//        System.out.println(calculator.PI);

//        System.out.println(Calculator.PI);

        int a = 100;
        int b = 50;
        //calc.printResult(a,b);

        int c = 200;
        int d = 60;
//        calc.printResult(c,d);


        int result = calc.add(a, b);
        System.out.println("Addition is "+ result);
        result = c - result;
        System.out.println("2nd Result "+ result);

        System.out.println(result + d); // 1
        System.out.println(calc.add(result,d)); // 2

        // d + (c-(a+b)) = result

        calc.add(a,b,c);


//        Baby baby = createBaby("Peter",2);


    }

    public Baby createBaby(String name, int age){
        return new Baby(name,age);
    }
}


// local variable , instance variable , class level variable(static variable)

