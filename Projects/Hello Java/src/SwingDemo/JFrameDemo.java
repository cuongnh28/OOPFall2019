package SwingDemo;
import javax.swing.JFrame;
public class JFrameDemo {
    public static void main(String[] args) {
        JFrame giaodien = new JFrame("Giao dien Java.");
        giaodien.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        giaodien.setVisible(true);
        giaodien.setLocation(400, 300);
        giaodien.setSize(400, 300);
    }
}
