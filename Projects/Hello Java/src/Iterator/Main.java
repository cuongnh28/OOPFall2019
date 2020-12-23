package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list=new ArrayList();
        list.add("A");
        list.add("C");
        list.add("B");
        list.add("D");
        list.add("E");
//        for(int i=0;i<list.size();i++){
//            if(list.get(i).equals("A")) {
//                list.remove(i);
//            }
//        }
            
        Iterator<String> itr=list.iterator();
        while(itr.hasNext()) {
            String s=itr.next();
            if(s.equals("A")) {
                itr.remove();
            }
        }
         for(String i:list){
            System.out.println(i);
        }
    }
}
