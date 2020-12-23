package Thread_TrenLop;
public class ThreadDemo extends Thread{
    private int index = 0;

    public ThreadDemo(String name) {
        super(name);
    }
    public void run(){
        System.out.println("Start "+getName());
        for (int i = 0; i < 10; i++) {
            //while(true){
            System.out.println("inside "+getName()+": "+(index++));
            try{
            sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        System.out.println("The end cooking.\n");
    }
}
