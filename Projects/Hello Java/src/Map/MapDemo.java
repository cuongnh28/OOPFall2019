package Map;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> student=new HashMap<Integer,String>();
        student.put(1, "Dao");
        student.put(2, "Man");
        student.put(3, "Hong");
        student.put(3, "Cam");
        student.put(5, "Quat");
        Set<Integer> key=student.keySet();
        System.out.println("Truoc khi xoa.");
        for(Integer i:key){
            System.out.println(i+ " - "+student.get(i));
        }
        student.remove(3);
        System.out.println("----------------");
        System.out.println("Sau khi xoa.");
        for (Integer i : key) {
            System.out.println(i + " - " + student.get(i));
        }
        
        // cach in thu 2. 
//        for(Entry<Integer,String> s : student.entrySet()) {
//           s.getKey();
//           s.getValue();
//         }
        
        Map<String,Person> map=new HashMap<String,Person>();
        map.put("A", new Person(1));
        map.put("B", new Person(2));
        map.put("C", new Person(3));
        System.out.println("In class person theo key.");
        for(Entry<String,Person> p:map.entrySet()) {
            System.out.println(p.getKey()+" - "+ p.getValue().getId());
        }
    }
}
