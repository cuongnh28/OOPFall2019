package VietJack.lithuyetpackage;

public class TestPackage {
    public int giaithua(int n){
        if(n==0)    return 0;
        else if(n==1)   return 1;
        return n*giaithua(n-1);
    }
    public int fibo(int m){
        if(m==1) return 1;
        else if(m==2)   return 2;
        return fibo(m-2)+fibo(m-1);
    }
}
