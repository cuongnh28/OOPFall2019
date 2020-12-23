
package n16_11;

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


public class Q1 extends JFrame{
    private JLabel lb;
    private JSlider sl;
    
    public Q1(){
        setTitle("Demo for code");
        setSize(400,300);
        setLocation(150,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        lb=new JLabel("Java is cool");
        lb.setForeground(Color.BLUE);
        lb.setFont(new Font("Courier New",Font.BOLD+Font.ITALIC, 
                30));
        lb.setPreferredSize(new Dimension(400,200));
        add(lb,BorderLayout.NORTH);
        sl=new JSlider();
        sl.setMinimum(10);
        sl.setMaximum(70);
        sl.setMinorTickSpacing(5);
        sl.setMajorTickSpacing(20);
        sl.setPaintLabels(true);
        sl.setPaintTicks(true);
        sl.setPaintTrack(true);
        sl.setPreferredSize(new Dimension(300,80));
        add(sl,BorderLayout.SOUTH);
        
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
        Q1 m=new Q1();
        m.setVisible(true);
    }
}
