package threads;

public class FirstThreadDriver {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        long startTime = System.currentTimeMillis();

        Horse horse = new Horse("Peter");
        horse.start();

        Horse horse2 = new Horse("Ram");
        horse2.start();

        Horse horse3 = new Horse("John");
        horse3.start();

        long endTime = System.currentTimeMillis();

        System.out.println("Total Time "+ (endTime-startTime)/1000);

        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(" Main Thread woke up..");
        horse.start(); // IllegalThreadStateException
    }
}
