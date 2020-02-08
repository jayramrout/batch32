import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        String fname = args[0];
        String lname = args[1];
        int age = Integer.parseInt(args[2]);
        float v = Float.parseFloat("30.3");

        String str1 = String.valueOf(30.3);
        System.out.println(str1);

        System.out.println("Hello " + fname +" " + lname + " "+ age);
        System.out.println("Time is "+ new Date());
        System.out.println(System.currentTimeMillis());

    }
}
