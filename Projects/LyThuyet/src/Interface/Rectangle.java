package Interface;

public class Rectangle implements Hinh3D,Hinh2D {
    private int length,width,height;

    public Rectangle(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public int volume() {
        return length*width*height;
    }

    @Override
    public int perimeter() {
        return length+width;
    }

    @Override
    public int area() {
        return length*width;
    }
    
}
