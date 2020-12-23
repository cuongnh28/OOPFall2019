package IoVietJack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.tools.FileObject;

public class FileInOutPutStream {
    public static void main(String[] args) {
        String fileName="src//IoVietJack//out.txt";
        FileOutputStream fileOs;
        try {
            fileOs = new FileOutputStream(fileName);
            ObjectOutputStream os = new ObjectOutputStream(fileOs);
            os.writeInt(24);
            os.writeDouble(2.443);
            os.close();
            } catch (FileNotFoundException ex) {
                System.out.println(ex);
            } catch (IOException ex) {
                System.out.println(ex);  
            }
        System.out.println("Ghi du lieu thanh cong.");
         FileInputStream fileIs;
        try {
            fileIs = new FileInputStream(fileName);
            ObjectInputStream is = new ObjectInputStream(fileIs);
            int x=is.readInt();
            double y=is.readDouble();
            is.close();
            System.out.println("x="+x);
            System.out.println("y="+y);
            } catch (IOException ex) {
                Logger.getLogger(FileInOutPutStream.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
}
