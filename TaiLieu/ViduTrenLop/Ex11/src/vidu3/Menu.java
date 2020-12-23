
package vidu3;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        PhongHocArr list=new PhongHocArr();
        while(true){
            System.out.println("1. Nhap 1 phong hoc");
            System.out.println("2. hien thi ds phong");
            System.out.println("3. Tim phong hoc theo toa");
            System.out.println("4. Dua ds so cho tu...den..");
            System.out.println("5. Dus ds co dieu hoa");
            System.out.println("6. Tim phong theo ma");
            System.out.println("0. exit");
            System.out.print("Moi chon:");
            Scanner in=new Scanner(System.in);
            int chon;
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:list.input();
                       break;
                case 2:list.viet();
                       break;
                case 3:System.out.print("Nhap toa nha:");
                      String toa=in.nextLine();
                      list.timTheoToa(toa);
                       break;
                case 4:System.out.print("Nhap so cho tu:");
                      int tu=Integer.parseInt(in.nextLine());
                      System.out.print("Nhap so cho den:");
                      int den=Integer.parseInt(in.nextLine());
                      list.timTheoSoCho(tu, den);
                       break;
                case 5:list.timTheoDHoa(true);
                       break;
                case 6:System.out.print("Nhap ma:");
                      String ma=in.nextLine();
                      list.timTheoMa(ma);
                       break;
                   
                case 0:System.out.println("bye!!");
                       System.exit(0);
                       break;
                default:System.out.println("chi nhap 0=>10");       
            }
            
        }
    }
    
}
