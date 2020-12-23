
package ngay23_8;


public class Main1 {
    public static void main(String[] args) {
        Oto o=new Oto("Mec","cat chay", 3.5, 7, 20000);
        System.out.println(o.toString());
        System.out.println("gia:"+o.getGia());
        System.out.println("Gia ban:"+o.giaBan());
    }
    
}
