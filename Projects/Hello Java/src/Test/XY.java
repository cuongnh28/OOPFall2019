package Test;
import java.util.*;
public class XY {
    static Integer x[] = {1,2,3,4,5,4,5,7};
    static Integer y[]={3,3,4,5,7,8,9,12,5,7};
    public static List<Integer> add() {
           Set<Integer> h = new HashSet<Integer>();
           for(int i=0;i<x.length;i++) {
               h.add(x[i]);
           }
           return new ArrayList(h);
    }
    public static void thongKe() {
        List<Integer> h = add();
        for(int i=0;i<h.size();i++) {
            System.out.println(h.get(i));
        }
    }
    public static void main(String[] args) {
        thongKe();
    }
}
