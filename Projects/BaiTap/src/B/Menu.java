/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package B;
import java.util.Scanner;

/**
 *
 * @author The Godfather
 */
public class Menu {
    public static void main(String[] args) {
        XL2so x=new XL2so();
        int chon;
        while(true){
            System.out.println("1. Nhap m,n");
            System.out.println("2. UCLN, BCNN");
            System.out.println("3. So ngto tu m->n");
            System.out.println("4. So thuan ngich m->n");
            System.out.println("0. EDIT!");
            System.out.print("Ban chon? ");
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:
                    x.nhap();
                    break;
                case 2:
                    x.ub();
                    break;
                case 3:
                    x.dsngTo();
                    break;
                case 4:
                    x.dstn();
                    break;
                case 0:
                    System.out.println("BYE!!!");
                    System.exit(chon);
                    break;
                default:
                    System.out.println("Chi chon tu 0 - 4");
            }
        }
    }
}
