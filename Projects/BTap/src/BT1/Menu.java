/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;
import java.util.Scanner;

/**
 *
 * @author The Godfather
 */
public class Menu {
    public static void main(String[] args) {
        xl3so h = new xl3so();
        maTran m1= null;
        maTran t=null;
        xlXau x=new xlXau();
        int n=0;
        while(true){
            int chon;
            System.out.println("1. Nhap 3 so");
            System.out.println("2. Giai PT bac 2");
            System.out.println("3. Ktra1 3 so nguyen to");
            System.out.println("4. Nhap ma tran");
            System.out.println("5. Tong ma tran");
            System.out.println("6. Hieu ma tran");
            System.out.println("7. Tich ma tran");
            System.out.println("8. Nhap xau");
            System.out.println("9. Kiem tra DT");
            System.out.println("10. Kiem tra Phieu ");
            System.out.println("0. EDIT!");
            System.out.print("Ban chon?  ");
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1: h.input();
                    break;
                case 2: h.gpt();
                    break;
                case 3: 
                    if(h.ktraNgto())
                        System.out.println("DUNG!");
                    else
                        System.out.println("SAI!");
                    break;
                case 4: 
                    System.out.print("n: ");
                    n=in.nextInt();
                    m1=new maTran(n);
                    m1.nhap();       
                    break;
                case 5:
                    maTran b=new maTran(n);
                    b.nhap();
                    t=new maTran(n);
                    t.setA(m1.tong(b.getA()));
                    //m1.viet();
                    t.viet();
                    //b.viet();
                    break;
                case 6: 
                    maTran c=new maTran(n);
                    c.nhap();
                    t.setA(m1.hieu(c.getA()));
                    t.viet();
                    break;
                case 7:maTran d=new maTran(n);
                       d.nhap();
                       t.setA(m1.tich(d.getA()));
                       t.viet();
                       break;
                case 8: 
                    x.nhap();
                    break;
                case 9:
                    if(x.ktDT())
                        System.out.println("DUNG!");
                    else 
                        System.out.println("SAI!");
                    break;
                case 10:
                    if(x.ktPhieu())
                        System.out.println("DUNG!");
                    else
                        System.out.println("SAI!");
                    break;
                case 0:
                    System.out.println("BYE!!!");
                    System.exit(chon);
                    break;
                default:
                    System.out.println("Chi duoc chon tu 1 - 3, moi ban chon lai?");
            }
        }
    }
    
}
