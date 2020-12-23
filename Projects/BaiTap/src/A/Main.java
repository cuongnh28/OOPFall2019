/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A;
import java.util.Scanner;

/**
 *
 * @author The Godfather
 */
public class Main {
    public static void main(String[] args) {
        XLso x=new XLso();
        int chon;
        while(true){
            System.out.println("1. Nhap n ");
            System.out.println("2. Tong 1+2+...+n ");
            System.out.println("3. Tich 1*2*....*n ");
            System.out.println("5. Tong 2+4+...+n ");
            System.out.println("4. Tong 1+3+...+n ");
            System.out.println("6. Cac so nguyen to < n ");
            System.out.println("7. Cac so Fibonaci < n ");
            System.out.println("8. Tong cac chu so cua n ");
            System.out.println("9. Cac uoc cua n ");
            System.out.println("0. EDIT!");
            System.out.print("Ban chon: ");
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:
                    x.nhap();
                    break;
                case 2:
                    System.out.println("Tong 1+2+...+n: "+ x.tong1());
                    break;
                case 3:
                    System.out.println("Tich 1*2*...*n: "+ x.tich1());
                    break;   
                case 4:
                    System.out.println("Tong 1+3+...+n: "+ x.tong2());
                    break;
                case 5:
                    System.out.println("Tong 2+4+...+n: "+ x.tong3());
                    break;
                case 6:
                    System.out.println("Danh sach ngto <n: ");
                    x.dsngTo();
                    break;
                case 7:
                    System.out.println("DS fibo <n: ");
                    x.fibo();
                    break;
                case 8:
                    System.out.println("Tong cac chu so cua n: "+x.tongCS());
                    break;
                case 9:
                    System.out.print("Cac uoc cua n: ");
                    x.uoc();
                    break;
                case 0:
                    System.out.println("BYE!!!");
                    System.exit(chon);
                    break;
                default:
                    System.out.println("Chi chon tu 0->9 ");                   
            }           
        }
    }
    
}
