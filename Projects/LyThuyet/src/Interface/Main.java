package Interface;


public class Main {
    public static void main(String[] args) {
        Triangle hinh = new Triangle(5,4);
        Hinh3D hinh1 = new Square(3);
        Hinh2D hinh2 = new Rectangle(2,3,4);
        System.out.println(hinh.area());
        System.out.println(hinh1.volume());
    }
}
