package Test;

import javax.swing.JDialog;

public class Dialog extends JDialog {

    public Dialog() {
        setTitle("Demo JDialog");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 200);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Dialog().setVisible(true);
    }
}
