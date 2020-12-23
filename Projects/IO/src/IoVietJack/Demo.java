package IoVietJack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo {
    public static void main(String[] args) {
        String filename="C:\\Users\\The Godfather\\Desktop\\test.txt";
        File file = new File(filename);
        try {
            Scanner in = new Scanner(file);
            try{
            int num=in.nextInt();
            System.out.println(num);
            }catch(Exception e){
                System.out.println("Ky tu dau tien khong phai so.");
            }
            in.nextLine();
            while(in.hasNextLine()){
                String line=in.nextLine();
                System.out.println(line);
            }
            in.close();
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
