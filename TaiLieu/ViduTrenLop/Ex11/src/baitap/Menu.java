package baitap;


import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        XLxau x=new XLxau();
        Matran m1=null;
        XL3so x3=new XL3so();
        Matran t=null;
        int n=0;
        while(true){
            System.out.println("1. Nhap 3 so");
            System.out.println("2. Gia PT bac 2 ");
            System.out.println("3. Ktra 3 so nguyen to");
            System.out.println("4. nhap ma tran");
            System.out.println("5. tong");
            System.out.println("6. hieu");
            System.out.println("7. tich");
            System.out.println("8. Nhap xau");
            System.out.println("9. KTRA dt");
            System.out.println("10. KT phieu");
            System.out.println("0. Exit");
            System.out.print("Moi chon:");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:x3.nhap();
                       break;
                case 2:x3.gptb2();
                       break;
                case 3:if(x3.ngtoCungNhau())
                         System.out.println("cung nhau");
                       else
                        System.out.println("khong cung nhau");
                       break;
                case 4:System.out.print("n=");
                       n=in.nextInt();
                       m1=new Matran(n);
                       m1.nhap();
                       break;       
                case 5:Matran b=new Matran(n);
                       b.nhap();
                       t=new Matran(n);
                       t.setA(m1.tong(b.getA()));
                       m1.viet();
                       b.viet();
                       t.viet();
                       break;
                case 6:Matran c=new Matran(n);
                       c.nhap();
                       t.setA(m1.hieu(c.getA()));
                       m1.viet();
                       c.viet();
                       t.viet();
                       break;
                case 7:Matran d=new Matran(n);
                       d.nhap();
                       t.setA(m1.tich(d.getA()));
                       m1.viet();
                       d.viet();
                       t.viet();
                       break;
                case 8:x.nhap();
                       break;
                case 9:if(x.ktDienThoat())
                        System.out.println("dung");
                       else
                         System.out.println("sai");
                       break;
                case 10:if(x.ktPhieu())
                        System.out.println("dung");
                       else
                         System.out.println("sai");
                       break;       
                case 0:System.out.println("bye!!!");
                       System.exit(0);
                       break;
                default:System.out.println("chi chon 0=>10");       
                       
            }
        }
    }
    
}
