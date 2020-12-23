package Vidu4;

public class Main {
    public static void main(String[] args) {
        //AbstractDemo a = new AbstractDemo(); -> the nay la loi do k duoc tao lop abstract
        AbstractDemo a=new Demo1(54);
        a.setName("Cuong");
        System.out.println(a.getName());
        System.out.println(a.getValue());
        DinhGia d=new DinhGia() {

            @Override
            public void doTinCay() {
                System.out.println("Rat cao.");
            }

            @Override
            public double getGiaTri() {
                return 500000;
            }
        };
        //Anonymous class.
        d.doTinCay();
        d.getGiaTri();
    }
}
