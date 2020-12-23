package KiemTra;
import java.util.Scanner;

public class Menu { 
    public static void main(String[] args) {
        QLPT list = new QLPT();
        Scanner in=new Scanner(System.in);
        int chon;
        while(true){
            System.out.println("1. Nhap vao 1 oto");
            System.out.println("2. Nhap vao 1 xe may");
            System.out.println("3. Tong tien.");
            System.out.println("4. Tim Oto theo so cho.");
            System.out.println("5. Thong ke theo nam san xuat");
            System.out.println("0. Exit");
            System.out.print("Moi chon: ");
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:
                    list.nhapOto();
                    break;
                case 2: 
                    list.nhapXeMay();
                    break;
                case 3:
                    list.tongTien();
                    break;
                case 4:
                    list.timKiemOto();
                    break;
                case 5:
                    list.thongKe();
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
