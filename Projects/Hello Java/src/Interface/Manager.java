package Interface;

public class Manager implements Info {
    private String name;

    public Manager(String name) {
        this.name = name;
    }
    
    
    public void showInfo() {
        System.out.println("Manager "+name+ " is starting to work.");
    }
    
}
