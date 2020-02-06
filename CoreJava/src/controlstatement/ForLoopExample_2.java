package controlstatement;

public class ForLoopExample_2 {
    public static void main(String[] args) {
        int tomAge;


        int peterAge = 30;
        int samAge = 50;

//        int ages[] = new int[3];
//             ages[0] = 23;
//             ages[1] = peterAge;
//             ages[2] = samAge;

//        System.out.println(ages.length);

//
        int ages[] = {23, peterAge, samAge, 33,44,55,6,7,7,7};

//        ages[5]

        for(int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        System.out.println("%%%%%%%%%%%");

        for(int age : ages) {  // enhanced for loop..
            System.out.println(age);
        }

        float marks[] = {34.4f,322.0f};

        for(float jay : marks) {
            System.out.println(jay);
        }


        // while loop
        // do while loop...

    }
}
