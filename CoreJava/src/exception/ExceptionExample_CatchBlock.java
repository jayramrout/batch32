package exception;

import java.util.Scanner;

public class ExceptionExample_CatchBlock {
    public static void main(String[] args) {

        int intValues[] = {2,3,4,5,6,7,8,9};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first value");
        int firstValue = scanner.nextInt(); // 10 , 16

        System.out.println("Enter second value");
        int secondValue = scanner.nextInt(); // 5 , 2

        int firstResult = 0;
        try {
            firstResult = computeFirstResult(firstValue, secondValue, intValues);
        } catch (NullPointerException e) {
            e.printStackTrace();
            firstResult = 15;
        }catch (ZeroArgumentException | MyIllegalArgumentException e){
            e.printStackTrace();
            firstResult = 5;
        }

        // if you have any problems in computing the firstResult, give a default value as 5 to it...

        System.out.println("Enter third value");
        int thirdValue = scanner.nextInt(); // 8
        int finalResult = thirdValue + firstResult; // 10

        System.out.println("Wow You are at the end of the formula and your result is "+ finalResult);

    }

    public static int computeFirstResult(int firstValue, int secondValue , int intValues[]) throws ZeroArgumentException , MyIllegalArgumentException {
        int firstResult;

        if(secondValue == 0) {
            throw new ZeroArgumentException("The Value "+ secondValue +" cannot be zero");
        }

        if(secondValue > 0) {
            throw new MyIllegalArgumentException("Illegal");
        }

        firstResult = firstValue / secondValue; // 2 ArithmeticException , 8
        firstResult = intValues[firstResult] ;

        return  firstResult;
    }
}
