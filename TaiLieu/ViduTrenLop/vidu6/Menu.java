package vidu6;


import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QLDT ql=new QLDT();
        while(true){
            System.out.println("1. Nhap so noi hat");
            System.out.println("2. Nhap so QT");
            System.out.println("3. Hien thi ds");
            System.out.println("4. Tim theo ma vung");
            System.out.println("5. Tim co duoi");
            System.out.println("6. Tinh tong cho tung vung");
            System.out.println("0. Thoat");
            System.out.print("Moi chon: ");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=in.nextInt();
            switch(chon){
                case 1:ql.nhapNoiHat();
                      break;
                case 2:ql.nhapQuocTe();
                      break;
                case 3:ql.hthi();
                      break;
                case 4:ql.timkiemTheoMaVung();
                      break;
                case 5:ql.timkiemTheoDuoi();
                    break;
//                case 6:ql.timTheoGia();
//                    break;    
                case 0:System.out.println("bye!!!!");
                       System.exit(0);
                      break;
                default: System.out.println("chi nhap 0->4");      
            }
        }
    }
    
}
