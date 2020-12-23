package PhuongTien;
import java.util.Scanner;

public class Menu { 
    public static void main(String[] args) {
        QLPT list = new QLPT();
        Scanner in=new Scanner(System.in);
        int chon;
        while(true){
            System.out.println("1. Nhap vao 1 oto");
            System.out.println("2. Nhap vao 1 xe may");
            System.out.println("3. Nhap vao 1 xe tai");
            System.out.println("4. In danh sach PTGT");
            System.out.println("5. Xoa PTGT");
            System.out.println("6. Sua PTGT");
            System.out.println("7. Sap xep theo nam san xuat");
            System.out.println("8. Thong ke theo hang");
            System.out.println("0. Exit");
            System.out.print("Moi chon: ");
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:
                    list.nhapOto();
                    break;
                case 2: 
                    list.nhapXemay();
                    break;
                case 3:
                    list.nhapXeTai();
                    break;
                case 4:
                    list.hthi();
                    break;
                case 5:
                    list.xoa();
                    break;
                case 6:
                    list.sua();
                    break;
                case 7:
                    list.sortByNamBan();
                    break;
                case 8:
                    list.thongKeHang();
                    break;
                case 0:
                    System.out.println("BYE!!!");
                    System.exit(chon);
                default:
                    System.out.println("Ban da nhap sai, moi chon lai.");
            }
        }
    }
    
    
}
