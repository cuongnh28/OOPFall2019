package vidu3;

import java.util.Scanner;

public class Menu {
    
    public static void main(String[] args) {
        QLPT ql=new QLPT();
        while(true){
            System.out.println("1. Nhap vao 1 oto");
            System.out.println("2. nhap vao 1 xe may");
            System.out.println("3. Hien thi ds PTGT");
            System.out.println("4. Xoa");
            System.out.println("5. Sua");
            System.out.println("0. Exit");
            System.out.print("Moi chon: ");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:ql.nhapOto();
                       break;
                case 2:ql.nhapXemay();
                       break;
                case 3:
                       ql.hienthi();
                       break;
                case 4:ql.xoa();
                       break;
                case 5:ql.sua();
                       break;
                case 0:System.out.println("bye!!!");
                       System.exit(0);
                       break;
                default:
                    System.out.println("chi chon 0->8");
            }
        }
    }
}
