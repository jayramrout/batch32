package exception;

public class MathUtil {
    public static int computeFirstResult(int firstValue, int secondValue , int intValues[]) throws ArrayIndexOutOfBoundsException , ArithmeticException {
//    public static int computeFirstResult(int firstValue, int secondValue , int intValues[]) throws Exception {
        int firstResult;
        firstResult = firstValue / secondValue; // 2 ArithmeticException , 8
        firstResult = intValues[firstResult] ; // ArrayIndexOutOfBoundException
        return firstResult;
    }

    public static int computeFirstResult2(int firstValue, int secondValue , int intValues[]) throws Exception {
        int firstResult;
        firstResult = firstValue / secondValue; // 2 ArithmeticException , 8
        firstResult = intValues[firstResult] ; // ArrayIndexOutOfBoundException
        return firstResult;
    }
}
