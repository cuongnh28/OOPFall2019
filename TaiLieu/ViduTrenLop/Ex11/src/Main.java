import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double r,s;
        char ans;
      while(true){  
        System.out.print("enter r:");
        r=in.nextDouble();
        s=Math.PI*r*r;
        System.out.println("Area:"+s);
        System.out.print("Co alm nua khong?(C/K):");
        if((ans=in.next().trim().toUpperCase().charAt(0))=='K')
            break;
      }
//        String name;
//        System.out.print("enter name:");
//        in.nextLine();
//        name=in.nextLine();
//        System.out.println("Hello "+name+"!");
//        int[] a={6,55,-54,543};
//        System.out.println("Cach 1:");
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);
//        }
//        System.out.println("cach 2:");
//        for(int i:a){
//            System.out.println(i);
//        }
//        String[] ds={"To lan huong","Anh hong","Manh dung"};
//        for(String x:ds)
//            System.out.println(x);
    }
}
