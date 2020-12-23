package Re_Sach;
import Sach.*;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        SachArr list=new SachArr();
        int chon;
        while(true){
            System.out.println("1. Them sach");
            System.out.println("2. In DS sach");
            System.out.println("3. Xoa sach");
            System.out.println("4. Sua sach");
            System.out.println("5. Tim kiem theo ma");
            System.out.println("6. Tim kiem theo ten");
            System.out.println("0. EXIT!!!");
            System.out.println("Ban chon: ");
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:
                    list.nhap();
                    break;
                case 2:
                    list.xuat();
                    break;
                case 3:
                    list.xoa();
                    break;
                case 4:
                    list.sua();
                    break;
                case 5: System.out.print("Ma can tim: ");
                    String m=in.nextLine();
                    list.timMa(m);
                    break;
                case 6: System.out.print("Ten can tim: ");
                    String t=in.nextLine();
                    list.timTen(t);
                    break;
                case 0:
                    System.out.println("BYE!!!");
                    System.exit(chon);
                default:
                    System.out.println("Ban nhap sai!");
            }
        }
    }
}
