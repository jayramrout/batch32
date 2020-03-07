package threads;

public class Horse extends Thread {
    private String owner;
    public Horse(String owner){
//        super(owner);
        this.owner = owner;
        setName(owner);
    }

    @Override
    public void run(){
        System.out.println(owner +" is running under Thread "+ Thread.currentThread().getName());
        for(int i=0; i < 5 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(owner +" Is Riding the hourse for "+i +" miles");
        }
        System.out.println("");
    }
}
