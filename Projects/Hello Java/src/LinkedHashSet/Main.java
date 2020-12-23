package LinkedHashSet;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Set<Person> set = new LinkedHashSet<Person>();
        set.add(new Person(1));
        set.add(new Person(2));
        set.add(new Person(3));
        set.add(new Person(4));
        set.add(new Person(3));
        System.out.print("Truoc khi remove: ");
        for(Person p:set) {
            System.out.print(p.getId()+"  ");
        }
        
        System.out.print("\nSau khi xoa: ");
        set.remove(new Person(2));
        for(Person p:set) {
            System.out.print(p.getId()+"  ");
        }
        
        //test queue.
        
        Queue<String> que=new LinkedList<String>();
        que.add("A");
        que.add("B");
        que.add("C");
        que.add("D");
        System.out.println("---------------------");
        System.out.print("Truoc khi xoa: ");
        for(String i:que){
            System.out.print(i +" ");
        }
        que.remove();
        que.remove("D");
        System.out.println("---------------------");
        System.out.print("Sau khi xoa: ");
        for(String i:que){
            System.out.print(i +" ");
        }
    }
}
