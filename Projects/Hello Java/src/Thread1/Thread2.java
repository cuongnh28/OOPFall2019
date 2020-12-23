package Thread1;

import java.util.logging.Level;
import java.util.logging.Logger;
//Cach 2 tao Thread
class Runner2 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello world: "+i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
public class Thread2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runner2());
        Thread t2 = new Thread(new Runner2());
        t1.start();
        t2.start();
    }
}
