package controlstatement;

public class ForLoopExample_BreakContinue {
    public static void main(String[] args) {
        int numbersArray[] = new int[50];
        for(int i = 0 ; i < numbersArray.length ; i++) {
            numbersArray[i] = i;
        }

//        System.out.println(numbersArray);

        //*******
        /*for(int i = 0; i < 10 ; i++) {
            if(i == 5)
                continue;
            System.out.println(i);
        }*/


        for(int i = 0; i < 10 ; i++) {
            if(i == 3)
                break;
            System.out.println(i);
        }
    }
}
