package IO_TrenLop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IOFile {
    public static void writeFile(List ob, String file){
        ObjectOutputStream w;
        try {
            w = new ObjectOutputStream(new FileOutputStream(file));
        for(Object o:ob){
            w.writeObject(o);
            }
            w.close();
        }catch (IOException ex) {
            System.out.println(ex);
        }
    }
    public static void readFile(List ob, String file){
        ob.clear();
        try {
            ObjectInputStream r = new ObjectInputStream(new FileInputStream(file));
            Object o = null;
            while((o=r.readObject())!=null){
                Object o1=(Object)o;
                    ob.add(o1);
            }
            r.close();
        } catch (IOException ex) {
            Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
                Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
