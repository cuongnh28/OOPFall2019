package Form2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Form extends JFrame {
    JLabel lb = new JLabel("Java is coll");
    JSlider sl = new JSlider();

    public Form() {
        setTitle("Border Layout");
        setLocation(200,150);
        setSize(600, 400);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        lb.setForeground(Color.blue);
        lb.setFont(new Font("Times New Noman",Font.BOLD, 18));
        lb.setPreferredSize(new Dimension(600, 200));
        sl.setMinimum(10);
        sl.setMaximum(100);
        sl.setMinorTickSpacing(5);
        sl.setMajorTickSpacing(20);
        sl.setPaintLabels(true);
        sl.setPaintTicks(true);
        sl.setPaintTrack(true);
        add(BorderLayout.NORTH,lb);
        add(BorderLayout.SOUTH,sl);     
        sl.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int value = sl.getValue();
                Font f=lb.getFont();
                lb.setFont(new Font(f.getName(), f.getStyle(), value));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        sl.addMouseMotionListener(new MouseMotionListener() {

            @Override
            public void mouseDragged(MouseEvent e) {
                int value = sl.getValue();
                Font f=lb.getFont();
                lb.setFont(new Font(f.getName(), f.getStyle(), value)); 
            }

            @Override
            public void mouseMoved(MouseEvent e) {
            }
        });
    }
    public static void main(String[] args) {
        Form form = new Form();
        form.setVisible(true);
    }
}
