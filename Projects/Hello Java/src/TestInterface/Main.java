package TestInterface;

public class Main {
    static class Toan implements Sach{
        public void hoc() {
            System.out.println("Toan oke.");        }
    }
    static class Ly implements Sach {
        public void hoc() {
            System.out.println("Ly oke.");        }
    }
    static class Sinh implements Sach {
        public void hoc() {
            System.out.println("Sinh oke.");        }
    }
    static class Hoa implements Sach {

        @Override
        public void hoc() {
            System.out.println("Hoa oke.");
        }
    }
    public static void main(String[] args) {
        Sach[] sach = {new Toan(), new Ly(), new Sinh(), new Hoa()};
        for(Sach s:sach) {
           s.hoc();
        }
    }
}
