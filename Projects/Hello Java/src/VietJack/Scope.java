package VietJack;


public class Scope {
    static int x;
    public static void main(String[] args) {
        System.out.println(ganx());
        doSomething(x); //5510
    }
    
    public static int ganx(){
        x=5;
        return x;
    }
    
    public static void doSomething(int x){
        System.out.println(x);
        x=10;
        System.out.println(x);
    }    
}
