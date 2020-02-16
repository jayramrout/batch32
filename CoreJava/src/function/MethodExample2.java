package function;

import classes_example.Baby;

public class MethodExample2 {

    public static void main(String[] args) {
        MethodExample2 example2 = new MethodExample2();
        Baby baby = example2.createBaby("Peter",3);

        callMe2();
    }

    public Baby createBaby(String name, int age){
        return new Baby(name,age);
    }

    public void callMe(){
        createBaby("Peter",3);
//        callMe2();
    }
    public static void callMe2(){

    }


}
