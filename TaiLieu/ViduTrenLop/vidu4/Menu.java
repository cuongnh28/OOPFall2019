
package vidu4;


import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QLSach ql=new QLSach();
        while(true){
            System.out.println("1. Nhap 1 sach");
            System.out.println("2. hien thi ds sach");
            System.out.println("3. sua");
            System.out.println("4. xoa");
            System.out.println("5. tim kiem theo ten sach");
            System.out.println("6. thong ke theo ten tac gia");
            System.out.println("0. exit");
            System.out.print("Moi chon:");
            Scanner in=new Scanner(System.in);
            int chon;
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:ql.nhap();
                       break;
                case 2:ql.hthi();
                       break;
                case 3:ql.sua();
                       break;
                case 4:ql.xoa();
                       break;
                case 5:ql.timTheoTen();
                       break;
                case 6:ql.thongke();
                       break;
                   
                case 0:System.out.println("bye!!");
                       System.exit(0);
                       break;
                default:System.out.println("chi nhap 0=>10");       
            }
            
        }
    }
    
}
