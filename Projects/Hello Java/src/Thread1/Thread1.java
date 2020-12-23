package Thread1;

import java.util.logging.Level;
import java.util.logging.Logger;
//cach 1 tao thread, phai ke thua Thread, maf Java khong cho phep da ke thua nen 
// thuong su dung cach 2 de su dung Thread.
class Runner extends Thread{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello world: "+i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Runner.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
public class Thread1 {
    public static void main(String[] args) {
        Runner run1 = new Runner();
        run1.start();
        Runner run2 = new Runner();
        run2.start();
    }
}
