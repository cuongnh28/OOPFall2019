
package QLTV;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QLTV ql=new QLTV();
        Scanner in=new Scanner(System.in);
        int chon;
        while(true){
            System.out.println("1. Nhap 1 sach");
            System.out.println("2. Nhap 1 tap chi");
            System.out.println("3. Hien thi");
            System.out.println("4. Thong ke theo NXB");
            System.out.println("5. Sap xep theo ten nha xuat ban.");
            System.out.println("6. Sap xep theo ten so ban phat hanh.");
            System.out.println("0. Exit!!!");
            System.out.print("Moi chon: ");
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:
                    ql.nhapSach();
                    break;
                case 2:
                    ql.nhapTapChi();
                    break;
                case 3:
                    ql.hthi();
                    break;
                case 4:
                    ql.thongke();
                    break;
                case 5:
                    ql.sortByTenNXB();
                    //sapxepgiamdan
                    break;
                case 6:
                    ql.sortBySoBanPH();
                    break;
                case 0:
                    System.out.println("EXIT!!!");
                    System.exit(chon);
                default:
                    System.out.println("Chon sai, moi ban chon lai.");
            }
        }
    }
}
