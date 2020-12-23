package n08_11;
//viet vao
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
//doc ra
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
//chu y list nay.
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class IOFile {
    public static void vietFile(List ob,String s) {
        try {
            ObjectOutputStream w=new ObjectOutputStream(new FileOutputStream(s));
            for (Object o:ob) {
                w.writeObject(o);
            }
            w.close();
        } catch (IOException e) {
            System.out.println(e);
        } 
    }
    public static void docFile(List ob, String s) throws IOException{
        //xoa het.
        ob.clear();
        try {
            ObjectInputStream r=new ObjectInputStream(new FileInputStream(s));
            Object o;
            try {
                while((o=r.readObject())!=null) {
                    Object o1=(Object)o;
                }
            } catch (ClassNotFoundException ex) {
                System.out.println(ex);
            }
        } catch (FileNotFoundException ex) {
            System.out.println(ex);
        }
    }
}
