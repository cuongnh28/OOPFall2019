package Interface;

public class Square implements Hinh3D,Hinh2D {
    private int canh;

    public Square(int canh) {
        this.canh = canh;
    }
    
    @Override
    public int volume() {
        return canh*canh*canh;
    }

    @Override
    public int perimeter() {
        return 4*canh;
    }

    @Override
    public int area() {
        return canh*canh;
    }
    
}
