package Static;

public class Sinhvien {
    private String name;
    private static int number=0;

    public Sinhvien(String name){
        this.name=name;
        number++;
        System.out.println("Da them sinh vien "+this.name +".");
        System.out.println("Co "+number+" doi tuong duoc tao ra.");
    }
    public static int getNum() {
        return number;
    }
}
