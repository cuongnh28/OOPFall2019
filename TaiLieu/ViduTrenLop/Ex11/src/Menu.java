import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        XuLySo xls=null;
        while(true){
            System.out.println("1. input");
            System.out.println("2. out ");
            System.out.println("3. Tong");
            System.out.println("4. TB");
            System.out.println("5. Day ngto");
            System.out.println("0. Exit");
            System.out.print("Moi chon:");
            int chon;
            Scanner in=new Scanner(System.in);
            chon=in.nextInt();
            switch(chon){
                case 1:int n;
                    System.out.print("n=");
                    n=in.nextInt();
                    xls=new XuLySo(n);
                    xls.input();
                       break;
                case 2:xls.out();
                       break;
                case 3:System.out.println("Tong:"+xls.tong());
                       break;
                case 4:System.out.println("Tong:"+xls.TB());
                       break;       
                case 5:xls.vietNgto();
                       break;
                case 0:System.out.println("bye!!!");
                       System.exit(0);
                       break;
                default:System.out.println("chi chon 0=>3");       
                       
            }
        }
    }
    
}
