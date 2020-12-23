
package threaddemo;


public class RunableDemo implements Runnable{
    private int index;
    @Override
    public void run() {
        System.out.println("Start Runnable");
        for (int i = 0; i < 10; i++) {
            System.out.println("inside Runnable "+(index++));
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("The end Runable");
    }
    
}
