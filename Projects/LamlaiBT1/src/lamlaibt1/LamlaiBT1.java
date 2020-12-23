
package lamlaibt1;
import java.util.Scanner;

public class LamlaiBT1 {
    public static void main(String[] args) {
            int chon;
            XLxau xau=new XLxau();
            while(true) {
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
            switch(chon) {
                case 1:
                case 2:
                case 3:
                case 8:
                    System.out.print("Nhap xau: ");
                    xau.nhap();
                    break;
                case 9:
                    if(xau.ktDT())
                        System.out.println("Dung!");
                    else
                        System.out.println("Sai!");
                    break;
                    case 10:
                    if(xau.ktPhieu())
                        System.out.println("Dung!");
                    else
                        System.out.println("Sai!");
                    break;
                case 0:   
                    System.out.println("BYE!!!");
                    System.exit(chon);
                    break;
                default:
                    System.out.println("Ban da chon sai, moi ban chon lai? ");
            }
        }
    }
    
}
