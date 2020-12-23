package ThaoTacFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void inMang(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
    //ham kiem tra day tang
    public static boolean tang(int[] a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1])
                return false;
        }
        return true;
    }
    //ham kiem tra day giam
    public static boolean giam(int[] a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1])
                return false;
        }
        return true;
    }
    
    //ham kiem tra tang hoac giam.
    public static boolean check(int[] a){
        if(tang(a) || giam(a))
            return true;
        return false;
    }
    
    public static int tongSoChan(int[] a){
        int tong=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0)
                tong+=a[i];
        }
        return tong;
    }
    
    public static void main(String[] args) {
        int[] a,b;
        String line;
        String filein = "src//ThaoTacFile//in.txt";
        String fileout = "src//ThaoTacFile//out.txt";
        try{
            BufferedReader br = new BufferedReader(new FileReader(filein));
            line=br.readLine();
            String[] num=line.split("\\s+");
            a = new int[num.length];
            for(int i=0;i<num.length;i++){
                a[i]=Integer.parseInt(num[i]);
            }
            
            line=br.readLine();
            num=line.split("\\s+");
            b = new int[num.length];
            for(int i=0;i<num.length;i++){
                b[i]=Integer.parseInt(num[i]);
            }
            br.close();
            
            PrintWriter w = new PrintWriter(fileout);
            if(check(a))
                w.write("Day a la day tang giam.\n");
            else
                w.write("Day a khong la day tang giam.\n");
                
            if(check(b))
                w.write("Day b la day tang giam.\n");
            else
                w.write("Day b khong la day tang giam.\n");
            //kiem tra day so nao co tong so chan lon hon.
            int tong1=(tongSoChan(a));
            int tong2=(tongSoChan(b));
            if(tong1>tong2){
                w.write("Tong so chan day a lon hon day b.\n");
            }
            else
                w.write("Tong so chan day a be hon day b.\n");
            w.write("tong1 " +tong1+" tong2 "+tong2);
            
            w.close();
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
