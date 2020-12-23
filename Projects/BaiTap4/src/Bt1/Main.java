package Bt1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static boolean checkNgTo(int a){
        if(a<2) return false;
        for(int i=2;i<=Math.sqrt(a);i++){
            if(a%i==0)  return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String filein = "src//Bt1//in.txt";
        String fileout = "src//Bt1//out.txt";
        int[] tong; //mang chua tong cua cac dong
        int dong,demnt; //stt cua dong, sttcua day ngto.
        String line; //day String cua tung dong.
        String[] s; //s la mang cac so tren tung dong.
        int[] nums = null;
        int[]   ngTo = null;
        try{
            BufferedReader br = new BufferedReader(new FileReader(filein));
            PrintWriter w = new PrintWriter(fileout);
            
            //xu ly bai 1, tim gia tri lon nhat cua tong cac day.
            //khai bao day tong co 100 so.
            tong = new int[100];
            dong=0;
            demnt=0;
            ngTo=new int[100];
            while((line=br.readLine())!=null){
                tong[dong]=0;
                s=line.split("\\s+");
                nums=new int[s.length];
                for(int i=0;i<s.length;i++){
                    nums[i]=Integer.parseInt(s[i]);
                    tong[dong]+=nums[i];
                    if(checkNgTo(nums[i])) {
                        ngTo[demnt]=nums[i];
                        demnt++;
                    }
                }
                dong++;
            }
            int max=tong[0];
            int t=1;
            for(int i=1;i<dong;i++){
                if(tong[i]>max){
                    max=tong[i];
                    t=i+1;
                }
            }
            w.write("Tong lon nhat la "+max+" o dong thu "+t+"\n");
            w.write("Danh sach nguyen to cua ca ma tran: ");
            for(int i=0;i<demnt;i++){
                w.write(ngTo[i]+" ");
            }
            w.write("\n");
            br.close();
            w.close();
            
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
