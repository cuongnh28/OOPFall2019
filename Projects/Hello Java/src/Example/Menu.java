/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Example;
import java.util.Scanner;


/**
 *
 * @author The Godfather
 */
public class Menu {
    public static void main(String[] args) {
        Haiso h = new Haiso();
        while(true){
            System.out.println("1. Nhap 2 so");
            System.out.println("2. Day so nguyen to");
            System.out.println("3. BCNN");
            System.out.println("4. Nguyen to cung nhau");
            System.out.println("0. Exit");
            System.out.print("Moi chon?  ");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1: h.input();
                    break;
                case 2 :h.dsNgTo();
                    break;
                case 3: h.bcnn();
                    break;
                case 4: if(h.ntcn())
                        System.out.print("Dung!");
                    else 
                        System.out.println("Sai!");
                    break;
                case 0: System.out.println("Bye!!!");
                        System.exit(0);
                    break;
                default:
                    System.out.println("Chon sai, moi ban chon lai:");
            }
        }
        
    }
    
}
