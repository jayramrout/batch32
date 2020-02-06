package controlstatement;

public class IfElseStatement {
    public static void main(String[] args) {
        int height = 6;

        if(height > 5) {
            System.out.println("He can get into my team...");
            if(height >= 7) {
                System.out.println("He can be in my pro team..");
            }else {
                System.out.println("Something...");
            }
        }else {
            System.out.println("Go to junior team...");
        }


        System.out.println("****************");
        int monthNumber = 2;

        if(monthNumber == 1) {
            System.out.println("Jan");
        }else if(monthNumber == 2) {
            System.out.println("Feb");
        }else if(monthNumber == 3) {
            System.out.println("March");
        }else if(monthNumber == 4) {
            System.out.println("April");
        }else if(monthNumber == 5) {
            System.out.println("May");
        }else {
            System.out.println("Wrong month...");
        }
    }
}
