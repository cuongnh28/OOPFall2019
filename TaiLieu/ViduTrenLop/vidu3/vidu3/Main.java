
package vidu3;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        SimpleDateFormat f=new 
               SimpleDateFormat("dd/MM/yyyy");
        Date d=new Date();
        System.out.println(f.format(d));
    }
    
}
