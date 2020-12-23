package exception;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
//        int x,y,z;
//        x=10;
//        y=0;
//        try{
//            z=x/y;
//            System.out.println("z = "+z);
//        }
//        catch(ArithmeticException e) {
//            System.out.println(e);
//        }
//        System.out.println("Viec 2");
//        System.out.println("Viec 3");
        
        //unchecked
        try{
        String num="abvb";
        int n =Integer.parseInt(num);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        
        //checked
        //dong duoi thi luon co mot check mac dinh.
        String date="09/10/2019";
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date d=f.parse(date);
            System.out.println(d);
        }
        catch(ParseException c) {
            System.out.println(c);
        }
    }
}

//Chu y: 
//+, 1 try co the co nhieu catch.
//+, 1 try co the co ca catch va finally, thi chi co 1 catch chay va luon luon chay finally
//+, Catch truoc luon phai be hon Catch sau. VD: NumberFormatException < Exection 
//+, ve throw va throws(uy nhiem)
//+, 
