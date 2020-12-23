package Comparator;

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("penguin");
        animals.add("elephant");
        animals.add("horse");
        //Collections.sort(animals);
        Collections.sort(animals, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        });
        
        for(String animal:animals) {
            System.out.println(animal);
        }
        
        System.out.println("-------------------");
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(9);
        numbers.add(6);
        numbers.add(4);
        Collections.sort(numbers, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        for(Integer number:numbers){
            System.out.println(number);
        }
    }
}
