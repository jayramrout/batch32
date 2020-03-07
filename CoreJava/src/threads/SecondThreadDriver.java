package threads;

public class SecondThreadDriver {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        Printer printer = new Printer("HP");

        Thread peter = new Thread(printer,"Peter");

        Thread john = new Thread(printer,"John");
        Thread ram = new Thread(printer,"Ram");
        ram.setPriority(Thread.MAX_PRIORITY);

        peter.start();
        john.start();
        ram.start();

    }
}
