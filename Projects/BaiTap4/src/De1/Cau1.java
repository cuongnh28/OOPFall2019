package De1;

import com.sun.javafx.print.PrintHelper;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Cau1 {
//    public static int tong3so(int a, int b, int c){
//        return a+b+c;
//    }
    public static void main(String[] args) {
        int tong[],num[];
        int dem=0;
        try{
            tong = new int[100];
            num = new int [100];
            BufferedReader br = new BufferedReader(new FileReader("src//De1//in.txt"));
            PrintWriter w = new PrintWriter("src//De1//out.txt");
            
            String line;
            while((line=br.readLine())!=null){
                String nums[] = line.split("\\s+");
                for(int i=0;i<nums.length;i++){
                    tong[dem]+=Integer.parseInt(nums[i]);
                }
                dem++;
            }
            br.close();
            
            for(int i=0;i<dem;i++){
                w.write("Tong dong "+(i+1)+": "+tong[i]+"\n");
            }
            w.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
