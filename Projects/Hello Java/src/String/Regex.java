package String;
import java.util.Scanner;
public class Regex {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        String reg="^[bB]{1}\\d{2}[A-Za-z]{4}\\d{3}";
        String reg="^\\d{3}[A-Za-z]{4}$";
        String a;
        a=in.nextLine();
        while(!a.matches(reg)){
            System.out.print("Nhap lai: ");
            a=in.nextLine();
        }
        System.out.println("Thanh cong!");
    }
}
