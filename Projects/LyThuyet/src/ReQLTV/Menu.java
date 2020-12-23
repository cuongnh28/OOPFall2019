package ReQLTV;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int chon;
        QLTV tv=new QLTV();
        while(true) {
            System.out.println("1. Nhap 1 dau sach.");
            System.out.println("2. Nhap 1 dau tap chi.");
            System.out.println("3. Hien thi tat ca.");
            System.out.println("4. Tim theo ma.");
            System.out.println("5. Xoa theo ma.");
            System.out.println("6. Sua theo ma.");
            System.out.println("7. Sap xep theo so ban phat hanh.");
            System.out.println("8. Sap xep theo ten NXB.");
            System.out.println("9. Thong ke theo NXB.");
            System.out.println("0. Thoat!!!.");
            System.out.print("Moi chon: ");
            chon=Integer.parseInt(in.nextLine());
            switch(chon) {
                case 1: 
                    tv.nhapSach();
                    break;
                 case 2: 
                    tv.nhapTapChi();
                    break;
                case 3: 
                    tv.hthi();
                    break;
                case 4: 
                    tv.searchByMa();
                    break;
                case 5: 
                    tv.xoaByMa();
                    break;
                case 6: 
                    tv.suaByMa();
                    break;
                case 7: 
                    tv.sortBySoBanPh();
                    break;
                case 8: 
                    tv.sortByName();
                    break;
                case 9: 
                    tv.thongKeTheoNXB();
                    break;  
                case 0:
                    System.exit(chon);
                default:
                    System.out.println("Ban chon sai, chon lai.");
            }
        }
    } 
}
