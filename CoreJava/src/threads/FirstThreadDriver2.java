package threads;

public class FirstThreadDriver2 {
    public static void main(String[] args) {

        for(int i = 0 ; i < 600; i++) {
            new Horse("Peter"+i).start();
        }

    }
}
