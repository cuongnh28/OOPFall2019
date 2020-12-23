package Thread_TrenLop;

import java.awt.BorderLayout;

public class RunnableDemo implements Runnable{
   private int index=0;
    @Override
    public void run() {
        System.out.println("Start Runnable.");
        for (int i = 0; i < 10; i++) {
            System.out.println("Inside runnable "+index++);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("The end runnable.");
    }
    
}
