package Interface;

public class Machine implements Info,Study {
    private int id;
    
    public void call(){
        System.out.println("Machine is calling.");
    }
            
    public void showInfo() {
        System.out.println("Machine is starting to work."); 
    }

    public void study() {
        System.out.println(University);
    }
    
}
