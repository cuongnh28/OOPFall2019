
package Phone;
import java.util.Scanner;

//endwith cau cuoi.

public class Menu {
    public static void main(String[] args) {
        PhoneBook phone=new PhoneBook();
        Scanner in=new Scanner(System.in);
        int chon;
        while(true){
            System.out.println("1. Nhap 1 SDT trong nuoc.");
            System.out.println("2. Nhap 1 SDT quoc te.");
            System.out.println("3. Hien thi.");
            System.out.println("4. Tim SDT theo ma vung.");
            System.out.println("5. Thong ke theo ma vung.");
            System.out.println("6. Sap xep theo ma vung.");
            System.out.println("7. Tim kiem theo duoi.");
            System.out.println("0. Exit!!!");
            System.out.print("Moi chon: ");
            chon=Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:
                    phone.themSdtTrongNuoc();
                    break;
                case 2:
                    phone.themSdtQt();
                    break;
                case 3:
                    phone.hthi();
                    break;
                case 4:
                    phone.timSdtTheoMaVung();
                    break;
                case 5:
                    phone.thongketheomavung();
                    break;
                case 7:
                    phone.timKiemTheoDuoi();
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
