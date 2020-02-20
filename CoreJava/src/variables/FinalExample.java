package variables;

import org.w3c.dom.ls.LSOutput;

public class FinalExample {
    static int cost;
    static final int finalPrice = 80;

    public static void main(String[] args) {
        final int height = 5;
        cost = 5;
        System.out.println(FinalExample.finalPrice);;

    }

    /*public void callMe(){
        System.out.println(finalPrice);
        finalPrice = 78;
    }*/
}
