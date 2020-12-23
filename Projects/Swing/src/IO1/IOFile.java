
package IO1;

import java.util.List;
//write
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
//read
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.IOException;


public class IOFile {
    public static void writeFile(List ob,String s){
        try{
           ObjectOutputStream w=new 
              ObjectOutputStream(new FileOutputStream(s));
           for(Object o:ob){
              w.writeObject(o);
           }
           w.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
    public static void readFile(List ob,String s){
        ob.clear();
        try{
           ObjectInputStream r=new 
             ObjectInputStream(new FileInputStream(s));
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
