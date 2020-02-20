package misc;

public class StringExample2 {
    public static void main(String[] args) {
        String result = "";
        for (int i = 0; i < 10; i++) {
            result = result + i;
        }
        System.out.println(result);



        StringBuffer resultBuffer = new StringBuffer(); // This approach is thread safe and little slower
        for (int i = 0; i < 10; i++) {
            resultBuffer.append(i);
        }
        System.out.println(resultBuffer);

        StringBuilder resultBuilder = new StringBuilder(); ///
        for (int i = 0; i < 10; i++) {
            resultBuilder.append(i);
        }
        System.out.println(resultBuilder);

        int count =50000;

        long startTime = System.currentTimeMillis();

        System.out.println();
        for (int i = 0; i < count; i++) {
            result += i;
        }
        long endTime = System.currentTimeMillis();

        System.out.println(" Total time for String "+(endTime-startTime));
    }
}
