package Abstract;

public class Main {
    public static void main(String[] args) {
        Dog d=new Dog("Mun");
        Parrot b=new Parrot("Vet");
        b.breath();
        b.eat();      
        d.out();
    }
}
