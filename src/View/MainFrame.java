/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.ArrayList;
import javax.swing.JFrame;

/**
 *
 * @author KHK
 */
public class MainFrame extends javax.swing.JFrame {
    private int index,active; 
    private ArrayList<JFrame> JR;
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        Load();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pane = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        SimpleC = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        TemperatureC = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);

        javax.swing.GroupLayout PaneLayout = new javax.swing.GroupLayout(Pane);
        Pane.setLayout(PaneLayout);
        PaneLayout.setHorizontalGroup(
            PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );
        PaneLayout.setVerticalGroup(
            PaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 247, Short.MAX_VALUE)
        );

        getContentPane().add(Pane, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Type");

        SimpleC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        SimpleC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Calculator.png"))); // NOI18N
        SimpleC.setActionCommand("0");
        SimpleC.setFocusable(true);
        SimpleC.setLabel("SimpleCalculator");
        SimpleC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Changes(evt);
            }
        });
        jMenu1.add(SimpleC);
        jMenu1.add(jSeparator1);

        TemperatureC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        TemperatureC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Temperature.png"))); // NOI18N
        TemperatureC.setText("Temperature");
        TemperatureC.setActionCommand("1");
        TemperatureC.setFocusable(true);
        TemperatureC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Changes(evt);
            }
        });
        jMenu1.add(TemperatureC);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Changes(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Changes
        index = Integer.valueOf(evt.getActionCommand());
        if(index == 0 && index != active){
            active = 0;
            removekeylistener();
            FormChange();
        }else if(index > 0 && index <= 1  && index != active){
            active = 1;
            removekeylistener();
            FormChange();
        }
    }//GEN-LAST:event_Changes

    private void FormChange(){
            JR.get(active).setJMenuBar(this.getJMenuBar());
            this.setRootPane(JR.get(active).getRootPane());
            this.setSize(JR.get(active).getSize().width,JR.get(active).getSize().height+20);
            this.addKeyListener(JR.get(active).getKeyListeners()[0]);
            this.doLayout();
    }
    
    public void removekeylistener(){
        this.removeKeyListener(this.getKeyListeners()[0]);
    }
    
    private void Load(){
       this.JR = new ArrayList();
       JR.add(new SimpleCalculator());
       JR.add(new TemperatureForm());
       this.active = 0;
       FormChange();
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Pane;
    private javax.swing.JMenuItem SimpleC;
    private javax.swing.JMenuItem TemperatureC;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
