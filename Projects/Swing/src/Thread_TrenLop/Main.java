package Thread_TrenLop;
public class Main {
    public static void main(String[] args) {
        System.out.println("Begin "+Thread.currentThread().getName());
        for (int i = 0; i < 4; i++) {
                System.out.println("Inside main 0"+(i+1));
                try{
                    Thread.sleep(400);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        ThreadDemo t = new ThreadDemo("Cooking");
        //t.setDaemon(true); // dung khi cac luong khac dung.
        t.start();
        try{
            t.join();  //join la uu tien no truoc, chay xong no thi cac thread khac moi duoc chay.
        }catch(InterruptedException e){
            System.out.println(e);
        }
        
        // run runnable.
        RunnableDemo r = new RunnableDemo();
        Thread t1 = new Thread(r);
        t1.start();
        System.out.println("Stop Main!");
    }
}
