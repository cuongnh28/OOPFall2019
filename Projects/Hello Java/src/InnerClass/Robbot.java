package InnerClass;

public class Robbot {
    private int id;

    public Robbot(int id) {
        this.id = id;
    }
    
    public void start() {
        System.out.println("Robbot is starting to work.");
        Brain b=new Brain();
        b.thinking();
    }
    
    static class Battery{
        public void charging(){
            System.out.println("I'm charging.");
        }
    }
    
    class Brain{
        public void thinking() {
            System.out.println("Robbot "+id+"is thinking.");
        }       
  
    }
}
