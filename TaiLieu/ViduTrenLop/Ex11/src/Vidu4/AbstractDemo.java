package Vidu4;

public abstract class AbstractDemo {
    private String name;
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }   
    
    public abstract int getValue();
    public abstract void write(String name);
}
