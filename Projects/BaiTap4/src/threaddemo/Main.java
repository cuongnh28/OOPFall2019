
package threaddemo;


public class Main {
    public static void main(String[] args) {
        System.out.println("Start Main");
        for (int i = 0; i < 3; i++) {
            System.out.println("indise Main");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        //run = Thread
        ThreadDemo t=new ThreadDemo("Manh");
        //t.setDaemon(true);
        
        //run = Runable
        RunableDemo r=new RunableDemo();
        Thread t1=new Thread(r);
        t1.start();
        try{
           t1.join();
        }catch(InterruptedException e){
            System.out.println(e);
        }
        t.start();
        System.out.println("Stop Main");
    }
    
}
