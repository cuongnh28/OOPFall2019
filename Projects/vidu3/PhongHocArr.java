
package vidu3;
import java.util.Scanner;

public class PhongHocArr {
    private int n;
    private PhongHoc[] list;
    public PhongHocArr(){
        n=0;
        list=new PhongHoc[100];
    }
    public void input(){
        Scanner in=new Scanner(System.in);
        String ma;
        int socho;
        boolean dhoa;
        System.out.print("Nhap ma:");
        while(true){
            ma=in.nextLine().toUpperCase();
            String reg="^[0-9]{3}-A[1-3]{1}$";
            if(ma.matches(reg))
                break;
            System.out.print("Nhap lai ma:");
        }
        System.out.print("So cho:");
        socho=Integer.parseInt(in.nextLine());
        System.out.print("dieu hoa (true hoac false):");
        dhoa=Boolean.parseBoolean(in.nextLine());
        list[n++]=new PhongHoc(ma, socho, dhoa);
    }
    public void viet(){
        System.out.println("Ma   Toa nha  so cho Dieu hoa");
        System.out.println("=============================");
        for (int i = 0; i < n; i++) {
            System.out.println(list[i].toString());
        }
        System.out.println("=============================");
    }
    public void timTheoToa(String toa){
        System.out.println("Ma   Toa nha  so cho Dieu hoa");
        System.out.println("=============================");
        for (int i = 0; i < n; i++) {
            if(list[i].getToaNha().equalsIgnoreCase(toa))
               System.out.println(list[i].toString());
        }
        System.out.println("=============================");
    }
    public void timTheoMa(String ma){
        System.out.println("Ma   Toa nha  so cho Dieu hoa");
        System.out.println("=============================");
        for (int i = 0; i < n; i++) {
            if(list[i].getMa().indexOf(ma)>=0)
               System.out.println(list[i].toString());
        }
        System.out.println("=============================");
    }
    public void timTheoSoCho(int tu,int den){
        System.out.println("Ma   Toa nha  so cho Dieu hoa");
        System.out.println("=============================");
        for (int i = 0; i < n; i++) {
            if((list[i].getSocho()>=tu)&& (list[i].getSocho()<=den))
               System.out.println(list[i].toString());
        }
        System.out.println("=============================");
    }
    public void timTheoDHoa(boolean dhoa){
        System.out.println("Ma   Toa nha  so cho Dieu hoa");
        System.out.println("=============================");
        for (int i = 0; i < n; i++) {
            if((list[i].isDhoa()==dhoa))
               System.out.println(list[i].toString());
        }
        System.out.println("=============================");
    }
}
