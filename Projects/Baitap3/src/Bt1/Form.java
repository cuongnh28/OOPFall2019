package Bt1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Form extends JFrame{
    public Form() {
        JLabel lb;
        JSlider sl;
        setTitle("Font sliding");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200,150);
        setSize(600, 400);
        setLayout(new BorderLayout());
        lb = new JLabel("Java is cool.");
        lb.setFont(new Font("Times new noman", Font.BOLD+Font.ITALIC, 28));
        lb.setForeground(Color.blue);
        lb.setPreferredSize(new Dimension(200, 150));
        add(lb, BorderLayout.NORTH);
        sl = new JSlider();
        sl.setMaximum(100);
        sl.setMinimum(10);
        sl.setMajorTickSpacing(20);
        sl.setMinorTickSpacing(5);
        sl.setPaintLabels(true);
        sl.setPaintTicks(true);
        sl.setPaintTrack(true);
        sl.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                int value = sl.getValue();
                Font f = lb.getFont();
                lb.setFont(new Font(f.getFontName(), f.getStyle(), value));
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
                Font f = lb.getFont();
                lb.setFont(new Font(f.getFontName(),f.getStyle(),value));
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
//        sl.addMouseWheelListener(new MouseWheelListener() {
//
//            @Override
//            public void mouseWheelMoved(MouseWheelEvent e) {
//                int value = sl.getValue();
//                Font f = lb.getFont();
//                lb.setFont(new Font(f.getFontName(),f.getStyle(),value));
//            }
//        });
        add(sl, BorderLayout.SOUTH);
    }
    public static void main(String[] args) {
        Form f=new Form();
        f.setVisible(true);
    }
}
