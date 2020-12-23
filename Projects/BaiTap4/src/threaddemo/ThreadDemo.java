
package threaddemo;


public class ThreadDemo extends Thread{
    private int index;
    public ThreadDemo(String name){
        super(name);
    }
    public void run(){
        System.out.println("starting "+getName());
        for (int i = 0; i < 10; i++) {
            
        
 
            System.out.println(getName()+": "+index++);
            try{
                sleep(1000);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("The end "+getName());
    }
}
