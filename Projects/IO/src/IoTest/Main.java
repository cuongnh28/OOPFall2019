package IoTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String args[]) throws FileNotFoundException, IOException {
        File filein=new File("src/IoTest/input.txt");
        File fileout=new File("src/IoTest/output.txt");
        if(!filein.exists()){
            filein.createNewFile();
        }
        if(!fileout.exists()){
            fileout.createNewFile();
        }
        FileInputStream in = new FileInputStream(filein);
        FileOutputStream out = new FileOutputStream(fileout);
        int c;
        try {
            while((c=in.read())!=-1){
                out.write(c);
            }
            in.close();
            out.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
