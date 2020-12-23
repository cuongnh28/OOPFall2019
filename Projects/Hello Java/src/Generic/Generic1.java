package Generic;
import java.util.ArrayList;
public class Generic1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        doubleList(list);
    }
    public static void doubleList(ArrayList<Integer> list){
        for(int i:list)
            System.out.println(i*2);
    }
}
