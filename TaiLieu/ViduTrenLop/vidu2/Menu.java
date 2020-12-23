package vidu2;



import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        DSSach list=new DSSach();
        while(true){
            System.out.println("1. Nhap 1 dau sach");
            System.out.println("2. Viet ra ds sach ");
            System.out.println("3. Xoa");
            System.out.println("4. Sua");
//            System.out.println("5. tong");
//            System.out.println("6. hieu");
//            System.out.println("7. tich");
//            System.out.println("8. Nhap xau");
//            System.out.println("9. KTRA dt");
//            System.out.println("10. KT phieu");
//            System.out.println("0. Exit");
            System.out.print("Moi chon:");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:list.input();
                       break;
                case 2:list.hthi();
                       break;
                case 3:System.out.print("nhap ma can xoa:");
                       String ma=in.nextLine();
                       if(list.xoa(ma)==null)
                           System.out.println("Sach nay khong ton tai");
                       else
                           System.out.println("Xoa thanh cong");
                       break;
                case 4:System.out.print("nhap ma can sua:");
                       ma=in.nextLine();
                       if(list.sua(ma)==false)
                           System.out.println("Sach nay khong ton tai");
                       else
                           System.out.println("sua thanh cong");
                       break;       
//                case 5:Matran b=new Matran(n);
//                       b.nhap();
//                       t=new Matran(n);
//                       t.setA(m1.tong(b.getA()));
//                       m1.viet();
//                       b.viet();
//                       t.viet();
//                       break;
//                case 6:Matran c=new Matran(n);
//                       c.nhap();
//                       t.setA(m1.hieu(c.getA()));
//                       m1.viet();
//                       c.viet();
//                       t.viet();
//                       break;
//                case 7:Matran d=new Matran(n);
//                       d.nhap();
//                       t.setA(m1.tich(d.getA()));
//                       m1.viet();
//                       d.viet();
//                       t.viet();
//                       break;
//                case 8:x.nhap();
//                       break;
//                case 9:if(x.ktDienThoat())
//                        System.out.println("dung");
//                       else
//                         System.out.println("sai");
//                       break;
//                case 10:if(x.ktPhieu())
//                        System.out.println("dung");
//                       else
//                         System.out.println("sai");
//                       break;       
                case 0:System.out.println("bye!!!");
                       System.exit(0);
                       break;
                default:System.out.println("chi chon 0=>10");       
                       
            }
        }
    }
    
}
