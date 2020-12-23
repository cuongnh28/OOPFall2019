package GiangVien;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QLGV gv=new QLGV();
        Scanner in=new Scanner(System.in);
        int chon;
        while(true){
            System.out.println("1. Nhap 1 giang vien co huu.");
            System.out.println("2. Nhap 1 giang vien thinh giang.");
            System.out.println("3. Hien thi.");
            System.out.println("4. Xoa 1 giang vien.");
            System.out.println("5. Sua 1 giang vien.");
            System.out.println("6. Tim kiem giang vien theo ten.");
            System.out.println("7. Sap xep giang vien theo he so luong.");
            System.out.println("8. Thong ke giang vien theo hoc ham.");
            System.out.println("0. Exit!!!");
            System.out.print("Moi chon: ");
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:
                    gv.nhapgvcohuu();
                    break;
                case 2:
                    gv.nhapgvthinhgiang();
                    break;
                case 3:
                    gv.hthi();
                    break;
                case 4:
                    gv.xoagv();
                    break;
                case 5:
                    gv.suagv();
                    break;
                case 6:
                    gv.timKiemTheoTen();
                    break;
                case 7:
                    gv.sxTheohsLuong();
                    break;
                case 8:
                    gv.tkTheoHocHam();
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
