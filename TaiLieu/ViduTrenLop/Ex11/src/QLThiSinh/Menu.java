package QLThiSinh;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {
        int chon;
        PhongThi list=new PhongThi();
        while(true){
        System.out.println("1. Them thi sinh");
        System.out.println("2. Sua thong tin thi sinh");
        System.out.println("3. Xoa thi sinh");
        System.out.println("4. Tim kiem thi sinh");
        System.out.println("5. Sap xep thi sinh");
        System.out.println("6. In danh sach");
        System.out.println("7. Nhap diem thi sinh");
        System.out.println("0. Thoat!!!");
        System.out.print("Ban chon: ");
        Scanner in=new Scanner(System.in);
        chon=Integer.parseInt(in.nextLine());
        switch(chon){
            case 1: 
                list.themTS();
                break;
            case 2:
                list.suaTS();
                break;
            case 6:
                list.xuat();
                break;
            case 0:
                System.out.println("Bye!!!");
                System.exit(chon);
            default:
                System.out.println("Moi ban chon lai.");
            }
        }    
    }
}

