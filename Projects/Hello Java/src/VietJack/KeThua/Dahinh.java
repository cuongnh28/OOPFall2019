package VietJack.KeThua;

class Bank{
    String name;

    public Bank(String name) {
        this.name = name;
    }
    
    protected int lai(){
        return 0;
    }
}

class ACB extends Bank{
    public ACB(String name) {
        super(name);
    }
    public int lai(){
        return 6;
    }
}

class VIB extends Bank{
    public VIB(String name) {
        super(name);
    }
    public int lai(){
        return 8;
    }
}

class Viettin extends Bank{
    public Viettin(String name) {
        super(name);
    }
    public int lai(){
        return 12;
    }
}

public class Dahinh {
    public static void main(String[] args) {
        for(int i=0;i<6;i++) {
            System.out.println("Ngan hang "+ getBank().name + ", lai "+getBank().lai() + "% tren nam.");
        }
    }
    public static Bank getBank(){
        int in=(int) (Math.random() * 3) +1;
        switch(in){
            case 1:
                return new ACB("ACB");
            case 2:
                return new VIB("VIB");
            case 3:
                return new Viettin("Viettin");    
        }
        return null;
    }
}
