package threads;

import javax.swing.plaf.TableHeaderUI;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();


        Reader reader1 = new Reader(calculator);
        Reader reader2 = new Reader(calculator);
        Reader reader3 = new Reader(calculator);

        reader1.start();
        reader2.start();
        reader3.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        calculator.start();


    }


}
class Reader extends Thread {
    private Calculator calculator;
    public Reader(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void run() {

        synchronized (calculator){
            System.out.println("Waiting for the calculator to complete...");
            try {
                calculator.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "  >> "+calculator.getTotal());
        }
    }
}

class Calculator extends Thread {
    private int total;
    public void run(){
        synchronized (this){
            for(int i = 0 ; i < 10 ; i++) {
                total += i;
            }
            notifyAll();
        }


    }

    public int getTotal(){
        return total;
    }

}
