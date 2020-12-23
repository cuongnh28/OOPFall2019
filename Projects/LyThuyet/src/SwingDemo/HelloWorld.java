package SwingDemo;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {

    public static void main(String[] args) {
        JFrame win = new JFrame("Demo");
        win.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        win.setSize(300, 200);
        win.setLocationRelativeTo(null);
        win.setResizable(false);
        win.add(new JLabel("Hello world!"));
        win.setVisible(true);
    }
}
class DemoJFrame extends JFrame {

    public DemoJFrame() {
        setTitle("Demo JFrame");
        setSize(300, 200);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new DemoJFrame().setVisible(true);
    }
}
