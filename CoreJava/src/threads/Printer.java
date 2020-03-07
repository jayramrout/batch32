package threads;

import javax.swing.plaf.TableHeaderUI;

//public class Printer implements Runnable {
public class Printer extends Thread {
    private String name;
    public Printer(String name){
        this.name = name;
        setName(name);
    }

    @Override
    public void run(){
//        synchronized(this){
            for(int i=0; i < 5 ; i++) {
                /*try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/

                System.out.println(Thread.currentThread().getName() +" is printing page "+i);
            }
//        }

        System.out.println("");
    }
}
