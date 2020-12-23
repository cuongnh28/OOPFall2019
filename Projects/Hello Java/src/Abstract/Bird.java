package Abstract;

public abstract class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("I'm eating rice.");
    }

    public void breath() {
        System.out.println("I'm pushing my hand in the air");
    }
    
    
    public abstract void fly();
    
}
