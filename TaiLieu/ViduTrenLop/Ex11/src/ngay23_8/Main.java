
package ngay23_8;
import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
//        Random r=new Random();
//        System.out.println((r.nextInt(7)+1));
//        System.out.println(Math.ceil(9.1));
//        System.out.println(Math.floor(8.9));
//        System.out.println(Math.round(2.5));
//        System.out.println("sin 30:"+Math.PI/6);
//        int o1;
//        Integer o2=new Integer("432");
//        Integer b=89;
//        b++;
        String ma;
//        int tuoi;
//        boolean ut;
//        double diem;
        Scanner in=new Scanner(System.in);
        String reg="^B\\d{2}[DCANMRKT]{4}\\d{3}$";
        
        while(true){
          System.out.print("ma:");
          ma=in.nextLine();
          if(ma.matches(reg))
              break;
        }
        System.out.println("Ma:"+ma);
//        System.out.print("tuoi:");
//        tuoi=Integer.parseInt(in.nextLine());
//        System.out.print("ten:");
//        ten=in.nextLine();
//        System.out.print("uu tien:");
//        ut=Boolean.parseBoolean(in.nextLine());
//        System.out.print("diem:");
//        diem=Double.parseDouble(in.nextLine());
//        System.out.println("Ten:"+ten+"UU tien:"+ut+"diem:"+diem);

        
    }
}
