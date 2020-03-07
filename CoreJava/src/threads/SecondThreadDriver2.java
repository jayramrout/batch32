package threads;

public class SecondThreadDriver2 {
    public static void main(String[] args) {
        Printer printer = new Printer("HP");
        for(int i = 0; i < 500; i++) {
            new Thread(printer,"Peter"+i).start();
        }
    }
}
