package threaddemo;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FormThread4 extends javax.swing.JFrame {
    ArrayList<Color> t;
    Thread u;
    boolean isBlink;
    
    public FormThread4() {
        initComponents();
        t = new ArrayList<Color>();
        isBlink = false;
        initThread();
        u.start();
    }
    
    void updateColors() {
      t.clear();
      if(chkRed.isSelected()) t.add(Color.red);
      if(chkBlue.isSelected()) t.add(Color.blue);
      if(chkYellow.isSelected()) t.add(Color.yellow);
      if(chkMagenta.isSelected()) t.add(Color.magenta);
      if(chkCyan.isSelected()) t.add(Color.cyan);
      if(chkPink.isSelected()) t.add(Color.pink);
    }
    void initThread() {
      u = new Thread() {
        public void run() {
          while(true) {
            if(!isBlink || t.isEmpty()) {
              try { sleep(500); } catch(InterruptedException e) {}
            }
            else {
              changeColor();  
              try { sleep(100); } catch(InterruptedException e) {}
            }
          }       
       }  
          
      };  
    }
    int searchColor(Color x) {
      int n,i; n = t.size();
      for(i=0;i<n;i++) {
        Color y = (Color) t.get(i);   
        if(x == y ) return(i);  
      }
      return(-1);
    }
    void changeColor() {
      if(t.isEmpty()) return;  
      int i, k, n;
      n = t.size();
      Color x, y;
      
      if(radForeground.isSelected()) {
        x = txtA1.getForeground();
        i = searchColor(x);
        if(i==-1) {
          y = (Color) t.get(0);
          txtA1.setForeground(y);
         }
        else {
          k = (i+1)%n;
          y = (Color) t.get(k);
          txtA1.setForeground(y);
        }
      }

      if(radBackground.isSelected()) {
        x = txtA1.getBackground();
        i = searchColor(x);
        if(i==-1) {
          y = (Color) t.get(0);
          txtA1.setBackground(y);
         }
        else {
          k = (i+1)%n;
          y = (Color) t.get(k);
          txtA1.setBackground(y);
        }
      }
      
    } 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        chkRed = new javax.swing.JCheckBox();
        chkBlue = new javax.swing.JCheckBox();
        chkMagenta = new javax.swing.JCheckBox();
        chkYellow = new javax.swing.JCheckBox();
        chkCyan = new javax.swing.JCheckBox();
        chkPink = new javax.swing.JCheckBox();
        btnStart = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA1 = new javax.swing.JTextArea();
        radForeground = new javax.swing.JRadioButton();
        radBackground = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(102, 0, 102));
        lblTitle.setText("Text or background blinking between selected colors");

        chkRed.setText("Red");

        chkBlue.setText("Blue");

        chkMagenta.setText("Magenta");

        chkYellow.setText("Yellow");

        chkCyan.setText("Cyan");

        chkPink.setText("Pink");

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnStop.setText("Stop");
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        txtA1.setColumns(20);
        txtA1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        txtA1.setRows(5);
        txtA1.setText("Hello World");
        jScrollPane1.setViewportView(txtA1);

        buttonGroup1.add(radForeground);
        radForeground.setText("Text");

        buttonGroup1.add(radBackground);
        radBackground.setText("Background");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkRed)
                            .addComponent(chkBlue)
                            .addComponent(chkCyan)
                            .addComponent(chkMagenta)
                            .addComponent(chkYellow)
                            .addComponent(chkPink))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnStop)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnStart, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radForeground)
                            .addComponent(radBackground))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(chkRed))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnStart))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radForeground)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btnStop))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radBackground)
                            .addComponent(chkBlue))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(chkYellow)
                        .addGap(15, 15, 15)
                        .addComponent(chkMagenta)
                        .addGap(18, 18, 18)
                        .addComponent(chkCyan)
                        .addGap(18, 18, 18)
                        .addComponent(chkPink))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
       updateColors();
       if(t.isEmpty()) {
         JOptionPane.showMessageDialog(null, "No color selected!");
         return;
       }
       if(!(radForeground.isSelected() || radBackground.isSelected())) {
         JOptionPane.showMessageDialog(null, "No radio button  selected!");
         return;
       }
       isBlink = true;
       
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
       isBlink = false;
    }//GEN-LAST:event_btnStopActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormThread4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormThread4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormThread4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormThread4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormThread4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStart;
    private javax.swing.JButton btnStop;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chkBlue;
    private javax.swing.JCheckBox chkCyan;
    private javax.swing.JCheckBox chkMagenta;
    private javax.swing.JCheckBox chkPink;
    private javax.swing.JCheckBox chkRed;
    private javax.swing.JCheckBox chkYellow;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton radBackground;
    private javax.swing.JRadioButton radForeground;
    private javax.swing.JTextArea txtA1;
    // End of variables declaration//GEN-END:variables
}
