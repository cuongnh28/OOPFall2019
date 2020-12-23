
package n11_10;

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


public class Form4 extends JFrame{
    JLabel lb;
    JSlider sl;
    public Form4(){
        setTitle("Sliding Font");
        setSize(600,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(200,150);
        setLayout(new BorderLayout());
        lb=new JLabel("Java is cool");
        lb.setForeground(Color.BLUE);
        lb.setFont(new Font("Courier new",Font.BOLD+Font.ITALIC, 28));
        lb.setPreferredSize(new Dimension(600,200));
        add(lb,BorderLayout.NORTH);
        sl=new JSlider();
        sl.setMaximum(100);
        sl.setMinimum(10);
        sl.setMajorTickSpacing(20);
        sl.setMinorTickSpacing(5);
        sl.setPaintLabels(true);
        sl.setPaintTicks(true);
        sl.setPaintTrack(true);
        add(sl,BorderLayout.SOUTH);
        
        //event
        sl.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int value=sl.getValue();
                Font f=lb.getFont();
                lb.setFont(new Font(f.getFontName(),
                        f.getStyle(), value));
            }

            @Override
            public void mousePressed(MouseEvent e) {
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        sl.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int value=sl.getValue();
                Font f=lb.getFont();
                lb.setFont(new Font(f.getFontName(),
                        f.getStyle(), value));
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                
            }
        });
    }
    public static void main(String[] args) {
        Form4 f=new Form4();
        f.setVisible(true);
    }
}
