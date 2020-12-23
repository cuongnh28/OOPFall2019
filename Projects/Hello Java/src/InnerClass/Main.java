package InnerClass;

//import InnerClass.Robbot.Brain;

//import InnerClass.Robbot.Battery;


public class Main {
    public static void main(String[] args) {
        Robbot robbot=new Robbot(20);
        //Brain br=robbot.new Brain();
        Robbot.Brain br=robbot.new Brain();
        br.thinking();
        System.out.println("-------");
        robbot.start();
        System.out.println("--------");
        //Robbot.Battery bat=new Battery();
        Robbot.Battery bat=new Robbot.Battery();
        bat.charging();
        
        // co the su dung quan he HAS-A de thay the inner class,
    }
            
}
