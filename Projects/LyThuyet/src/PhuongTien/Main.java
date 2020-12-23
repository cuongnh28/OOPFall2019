
package PhuongTien;

public class Main {
    public static void main(String[] args) {
    int[] a= {1,2,6,9,3,4,5};
    for(int i=0;i<6;i++) {
        for(int j=i+1;j<7;j++) {
            if(a[i]<a[j]) {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;       
                }
            }
        }
    for(int i=0;i<7;i++)
            System.out.print(a[i] + " ");
    }
}
