package De3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;

public class Bai1 {
    public static boolean dayTang(int[] a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1])
                return false;
        }
        return true;
    }
    
    
    public static boolean dayGiam(int[] a){
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1])
                return false;
        }
        return true;
    }
    
    public static boolean sapXep(int[] a){
        if(dayGiam(a) || dayTang(a))
            return true;
        else return false;
    }
    
    public static void sxepTang(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    int x=a[i];
                    a[i]=a[j];
                    a[j]=x;
                }
            }
        }
    }
    public static void main(String[] args) {
        String fileIn="src//De3//in.txt";
        String fileOut="src//De3//out.txt";
        int a[];
        String str = "";
        int dem=1;
        try{
            BufferedReader br = new BufferedReader(new FileReader(fileIn));
            PrintWriter w = new PrintWriter(fileOut);
            String line;
            while((line=br.readLine())!=null){
                String s[] = line.split("\\s+");
                a = new int[s.length];
                for(int i = 0;i<s.length;i++){
                    a[i]=Integer.parseInt(s[i]);
                }
                if(sapXep(a)){
                    //da sap xem
                    str+="Day "+dem+" la day sap xep.\n";
                    dem++;
                }
                else{ //chua sap xep
                    str+="Day "+dem+" la day chua sap xep.\n";
                    sxepTang(a);
                    str+="Day a sau khi sap xep: ";
                    for(int i=0;i<a.length;i++){
                        str+=a[i]+" ";
                    }
                    str+="\n";
                    dem++;
                }
            }
            br.close();
            w.write(str);
            w.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
