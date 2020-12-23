package TachNT;

public class TachNT {
    public boolean ngTo(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(i); i++) {
            if(n%i==0)  return false;
        }
        return true;
    }
    public void tachNT(int n){
        int m=n;
        int[] a;
        a= new int[100];
        int d=0;
        for(int i=2;i<=n;i++){
            while(ngTo(i) && n%i==0){
                    a[d++]=i;
                    n/=i;
                }
            }
        System.out.print(m+" = ");
        for(int i=0;i<d;i++)
            System.out.print(a[i]+" * ");
        }
}
