package Abstract;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("I'm eating rice.");
    }

    @Override
    public void breath() {
        System.out.println("I'm pushing my hand in the air");
    }
    
    public void out(){
        System.out.println("Goi thanh cong.");
    }
}
