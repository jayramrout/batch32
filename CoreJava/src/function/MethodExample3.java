package function;

import classes_example.Baby;

public class MethodExample3 {

    public static void main(String[] args){
        MethodExample2 example2 = new MethodExample2();
        Baby baby = example2.createBaby("Peter",3);

        MethodExample2.callMe2();

        System.out.println(Math.PI);


    }

}
