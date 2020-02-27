package exception;

import java.util.Scanner;

public class ExceptionExample4 {
    public static void main(String[] args) {

        int intValues[] = {2,3,4,5,6,7,8,9};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first value");
        int firstValue = scanner.nextInt(); // 10 , 16

        System.out.println("Enter second value");
        int secondValue = scanner.nextInt(); // 5 , 2

        int firstResult;
        firstResult = MathUtil.computeFirstResult(firstValue, secondValue, intValues);

       try{
            firstResult = MathUtil.computeFirstResult(firstValue, secondValue, intValues);
        }catch (ArithmeticException exp) {
            exp.printStackTrace();
            firstResult = 5;
        }catch (ArrayIndexOutOfBoundsException exp) {
            exp.printStackTrace();
            firstResult = 20;
        }catch (Exception exp){
            exp.printStackTrace();
            firstResult = 10;
        }
        System.out.println("Enter third value");
        int thirdValue = scanner.nextInt();
        int finalResult = thirdValue + firstResult; // 10

        System.out.println("Wow You are at the end of the formula and your result is "+ finalResult);
    }


}
