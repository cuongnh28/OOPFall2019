package Interface;

public class Triangle implements Hinh3D,Hinh2D {
    
    private int a,b;

    public Triangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int volume() {
        return 0;
    }

    @Override
    public int perimeter() {
        return a+b;
    }

    @Override
    public int area() {
        return a*b;
    }
    
}
