package Form2;
//import java.awt.BorderLayout;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Form1 extends JFrame {
    private JButton
            bn = new JButton("North"),
            bs = new JButton("Sorth"),
            bc = new JButton("Center"),
            bw = new JButton("West"),
            be = new JButton("Earth");
    public Form1() {
        setTitle("Border Layout");
        setSize(600, 400);
        //setLocation(200, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(BorderLayout.NORTH,bn);
        add(BorderLayout.SOUTH,bs);
        add(BorderLayout.CENTER,bc);
        add(BorderLayout.WEST,bw);
        add(BorderLayout.EAST,be);
        bn.setBackground(Color.red);
        bs.setBackground(Color.red);
        bc.setBackground(Color.green);
        bw.setBackground(Color.orange);
        be.setBackground(Color.orange);
        bn.setForeground(Color.black);
        bs.setForeground(Color.black);
        bc.setForeground(Color.blue);
        be.setForeground(Color.black);
        bw.setForeground(Color.black);
    }
    public static void main(String[] args) {
       Form1 form = new Form1();
       form.setVisible(true);
    }   
}
