package Bt5;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Date1 {
    public String getDate(){
        Date d = new Date();
    SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
    String year=f.format(d);
    return year;
    }   
}
