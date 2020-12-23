package VietJack;
import VietJack.lithuyetpackage.TestPackage;


public class Package {
    public static void main(String[] args) {
        TestPackage x = new TestPackage();
        System.out.println(x.giaithua(5));
        System.out.println("10 so fibonaci dau tien");
        for(int i=1;i<11;i++) {
            System.out.print(x.fibo(i)+"\t");
        }
    }
}
