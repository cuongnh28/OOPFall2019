package Static;

public class Main {
    private static int x=3;
    public static void getX() {
        x=10;
    }
    public static void main(String[] args) {
        Sinhvien sv1=new Sinhvien("Nam");
        Sinhvien sv2=new Sinhvien("Cuong");
        Sinhvien sv3=new Sinhvien("Tai");
        Sinhvien sv4=new Sinhvien("Dai");
        System.out.println(Sinhvien.getNum());
        
        System.out.println("X truoc khi goi ham: "+x);
        getX();
        System.out.println("X sau khi goi ham: "+x);
        Animal.Dog.in();
    }
}
