package ThaoTacFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class IOFile {
    //ham viet vao file.
    public static void writeFile(List ob, String file){
        try{
        ObjectOutputStream w = new ObjectOutputStream(new FileOutputStream(file));
        for(Object o:ob){
            w.writeObject(o);
        }
        w.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
    //ham doc tu file
    public static void readFile(List ob, String file){
        ob.clear();
        try{
            ObjectInputStream r = new ObjectInputStream(new FileInputStream(file));
            Object o=null;
            while((o=r.readObject())!=null){
                Object o1=(Object)o;
                ob.add(o1);
            }
            r.close();
        }catch(IOException e){
            System.out.println(e);
        }catch(ClassNotFoundException e){
            System.out.println(e);
        }
    }
}
