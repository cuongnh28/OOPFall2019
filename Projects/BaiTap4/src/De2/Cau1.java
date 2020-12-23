package De2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Cau1 {
    public static String ptb2(int a, int b, int c){
        int t=b*b-4*a*c;
        String s="";
        if(t<0) s+= "Phuong trinh vo nghiem\n";
        else if(t==0) {
            double x = (-b)/(2*a);
            s+="Phuong trinh co nghiem duy nhat x = "+x+"\n";
        }
        else{
            s+="Phuong trinh co hai nghiem phan biet x1 = "+(-b+Math.sqrt(t))/(2*a) +
                    "\tx2 = "+(-b-Math.sqrt(t))/(2*a);
        }
        return s;
    }
    public static void main(String[] args) {
        int num[];
        try{
            int tong=0;
            File fileIn = new File("src//De2//in.txt");
            File fileOut = new File("src//De2//out.txt");
            BufferedReader br = new BufferedReader(new FileReader(fileIn));
            PrintWriter p = new PrintWriter(fileOut);
            
            String line=br.readLine();
            String[] s = line.split("\\s");
            num = new int [s.length];
            for(int i=0;i<s.length;i++) {
                num[i]=Integer.parseInt(s[i]);
                tong+=num[i];
            }
            br.close();
            
            String str = "Tong cua 3 so la: "+tong+"\n";
            str+=ptb2(num[0],num[1],num[2]);
            p.write(str);
            p.close();   
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e ){
            System.out.println(e);
        }
    }
}
