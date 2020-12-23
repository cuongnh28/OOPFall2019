package Generic;

public class Generic2 {
    public static void main(String[] args) {
        Integer[] arrayInt={1,3,4,5,6,7};
        Character[] arrayChar={'A','B','C','D'};
        System.out.print("Mang Integer: ");
        printArray(arrayInt);
        System.out.println("");
        System.out.print("Mang Character: ");
        printArray(arrayChar);
    }
    
    public static <T> void printArray(T[] list){
//        for(int i=0;i<list.length;i++){
//            System.out.print(list[i]+"\t");
//        }
        for(T i:list) {
            System.out.print(i+"\t");
        }
    }
}
