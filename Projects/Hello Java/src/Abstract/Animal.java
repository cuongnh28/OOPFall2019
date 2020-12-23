package Abstract;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    
    public abstract void eat();
    public abstract void breath();
    //abstract khong duoc co than ham.
}
