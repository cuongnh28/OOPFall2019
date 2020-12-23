package IoTTJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DocGhiFile {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        
        //doc file
        FileInputStream fileInputStream = new FileInputStream(file);
        int c = fileInputStream.read();
        while(c!=-1){
            System.out.print((char)c);
            c=fileInputStream.read();
        }
        fileInputStream.close();
        
        //ghi file
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        String s = "anh yeu em.";
        fileOutputStream.write(s.getBytes());
        fileOutputStream.close();
    }
}
