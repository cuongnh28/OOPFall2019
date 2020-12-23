// multiple of a given number  
// made of digits 0 and 9 only 
import java.util.*; 
  
class XL  
{ 
  
    // Maximum number of  
    // numbers made of 0 and 9 
    static int MAX_COUNT = 10000; 
  
    // vector to store all numbers  
    // that can be formed using  
    // digits 0 and 9 and are  
    // less than 10^5 
    static List<String> vec = new LinkedList<String>(); 
  
    /* Preprocessing function  
    to generate all possible  
    numbers formed by 0 and 9 */
    static void generateNumbersUtil()  
    { 
        // Create an empty 
        // queue of Strings 
        Queue<String> q = new LinkedList<String>(); 
  
        // enque the  
        // first number 
        q.add("9"); 
  
        // This loops is like BFS of 
        // a tree with 9 as root 
        // 0 as left child and 9 as  
        // right child and so on 
        for (int count = MAX_COUNT; 
                count > 0; count--) 
        { 
            String s1 = q.peek(); 
            q.remove(); 
  
            // storing the Peek of 
            // queue in the vector 
            vec.add(s1); 
  
            String s2 = s1; 
  
            // Append "0" to s1 
            // and enqueue it 
            q.add(s1 + "0"); 
  
            // Append "9" to s2 and  
            // enqueue it. Note that 
            // s2 contains the previous Peek 
            q.add(s2 + "9"); 
        } 
    } 
  
    // function to find smallest  
    // number made up of only  
    // digits 9's and 0's, which  
    // is a multiple of n. 
    static String findSmallestMultiple(int n)  
    { 
        // traverse the vector  
        // to find the smallest  
        // multiple of n 
        for (int i = 0; i < vec.size(); i++) // stoi() is used for  
        // String to int conversion 
        { 
            if (Integer.parseInt(vec.get(i)) % n == 0)  
            { 
                return vec.get(i); 
            } 
        } 
        return ""; 
    } 
  
    // Driver Code 
    public static void main(String[] args)  
    { 
        int t;
        generateNumbersUtil(); 
        int n = 199; 
        System.out.println(findSmallestMultiple(n)); 
    } 
} 