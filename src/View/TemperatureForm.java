/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Process.*;
import javax.swing.JButton;

/**
 *
 * @author KHK
 */
public class TemperatureForm extends javax.swing.JFrame{
    private ProcessBase TP = new TemperatureProcess();
    private NumberPad NP = new SecondNumberPad();
    /**
     * Creates new form TemperatureForm
     */
    public TemperatureForm() {
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TemperatureParentPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SecondInputPanel = new javax.swing.JPanel();
        SecondValue = new javax.swing.JLabel();
        SecondCombo = new javax.swing.JComboBox<>();
        FirstInputPanel = new javax.swing.JPanel();
        FirstValue = new javax.swing.JLabel();
        FirstCombo = new javax.swing.JComboBox<>();
        btn0 = new javax.swing.JButton();
        Dot = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ActionPress(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("To");

        SecondInputPanel.setFocusCycleRoot(true);
        SecondInputPanel.setFocusTraversalPolicyProvider(true);
        SecondInputPanel.setNextFocusableComponent(SecondValue);

        SecondValue.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SecondValue.setText("0");
        SecondValue.setFocusCycleRoot(true);
        SecondValue.setFocusTraversalPolicyProvider(true);

        SecondCombo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        SecondCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahrenheit", "Celsius", "Kelvin" }));
        SecondCombo.setFocusable(false);
        SecondCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SecondComboItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout SecondInputPanelLayout = new javax.swing.GroupLayout(SecondInputPanel);
        SecondInputPanel.setLayout(SecondInputPanelLayout);
        SecondInputPanelLayout.setHorizontalGroup(
            SecondInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondInputPanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(SecondValue, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SecondCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        SecondInputPanelLayout.setVerticalGroup(
            SecondInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SecondInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SecondCombo)
                    .addComponent(SecondValue, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addContainerGap())
        );

        FirstInputPanel.setFocusCycleRoot(true);
        FirstInputPanel.setFocusTraversalPolicyProvider(true);
        FirstInputPanel.setNextFocusableComponent(FirstValue);

        FirstValue.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        FirstValue.setText("0");
        FirstValue.setFocusCycleRoot(true);
        FirstValue.setFocusTraversalPolicyProvider(true);

        FirstCombo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        FirstCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahrenheit", "Celsius", "Kelvin" }));
        FirstCombo.setFocusable(false);
        FirstCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FirstComboItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout FirstInputPanelLayout = new javax.swing.GroupLayout(FirstInputPanel);
        FirstInputPanel.setLayout(FirstInputPanelLayout);
        FirstInputPanelLayout.setHorizontalGroup(
            FirstInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(FirstValue, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FirstCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FirstInputPanelLayout.setVerticalGroup(
            FirstInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FirstInputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FirstInputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstValue, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(FirstCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btn0.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn0.setText("0");
        btn0.setToolTipText("0");
        btn0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn0.setFocusable(false);
        btn0.setMinimumSize(new java.awt.Dimension(72, 33));
        btn0.setPreferredSize(new java.awt.Dimension(100, 33));
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionNumber(evt);
            }
        });

        Dot.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        Dot.setText(".");
        Dot.setToolTipText("Dot");
        Dot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Dot.setFocusable(false);
        Dot.setMinimumSize(new java.awt.Dimension(72, 33));
        Dot.setPreferredSize(new java.awt.Dimension(100, 33));
        Dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionNumber(evt);
            }
        });

        btn3.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn3.setText("3");
        btn3.setToolTipText("3");
        btn3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn3.setFocusable(false);
        btn3.setMinimumSize(new java.awt.Dimension(72, 33));
        btn3.setPreferredSize(new java.awt.Dimension(100, 33));
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionNumber(evt);
            }
        });

        btn2.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn2.setText("2");
        btn2.setToolTipText("2");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn2.setFocusable(false);
        btn2.setMinimumSize(new java.awt.Dimension(72, 33));
        btn2.setPreferredSize(new java.awt.Dimension(100, 33));
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionNumber(evt);
            }
        });

        btn1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn1.setText("1");
        btn1.setToolTipText("1");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn1.setFocusable(false);
        btn1.setMinimumSize(new java.awt.Dimension(72, 33));
        btn1.setPreferredSize(new java.awt.Dimension(100, 33));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionNumber(evt);
            }
        });

        btn4.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn4.setText("4");
        btn4.setToolTipText("4");
        btn4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn4.setFocusable(false);
        btn4.setMinimumSize(new java.awt.Dimension(72, 33));
        btn4.setPreferredSize(new java.awt.Dimension(100, 33));
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionNumber(evt);
            }
        });

        btn6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn6.setText("6");
        btn6.setToolTipText("6");
        btn6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn6.setFocusable(false);
        btn6.setMinimumSize(new java.awt.Dimension(72, 33));
        btn6.setPreferredSize(new java.awt.Dimension(100, 33));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionNumber(evt);
            }
        });

        btn5.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn5.setText("5");
        btn5.setToolTipText("5");
        btn5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn5.setFocusable(false);
        btn5.setMinimumSize(new java.awt.Dimension(72, 33));
        btn5.setPreferredSize(new java.awt.Dimension(100, 33));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionNumber(evt);
            }
        });

        btn9.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn9.setText("9");
        btn9.setToolTipText("9");
        btn9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn9.setFocusable(false);
        btn9.setMinimumSize(new java.awt.Dimension(72, 33));
        btn9.setPreferredSize(new java.awt.Dimension(100, 33));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionNumber(evt);
            }
        });

        btn8.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn8.setText("8");
        btn8.setToolTipText("8");
        btn8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8.setFocusable(false);
        btn8.setMinimumSize(new java.awt.Dimension(72, 33));
        btn8.setPreferredSize(new java.awt.Dimension(100, 33));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionNumber(evt);
            }
        });

        btn7.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btn7.setText("7");
        btn7.setToolTipText("7");
        btn7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn7.setFocusable(false);
        btn7.setMinimumSize(new java.awt.Dimension(72, 33));
        btn7.setPreferredSize(new java.awt.Dimension(100, 33));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActionNumber(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnBack.setText("Back");
        btnBack.setToolTipText("Del");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBack.setFocusable(false);
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackAction(evt);
            }
        });

        btnAC.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        btnAC.setText("AC");
        btnAC.setToolTipText("AC");
        btnAC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAC.setFocusable(false);
        btnAC.setMaximumSize(new java.awt.Dimension(33, 33));
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACACAction(evt);
            }
        });

        javax.swing.GroupLayout TemperatureParentPaneLayout = new javax.swing.GroupLayout(TemperatureParentPane);
        TemperatureParentPane.setLayout(TemperatureParentPaneLayout);
        TemperatureParentPaneLayout.setHorizontalGroup(
            TemperatureParentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SecondInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TemperatureParentPaneLayout.createSequentialGroup()
                .addGroup(TemperatureParentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TemperatureParentPaneLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TemperatureParentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TemperatureParentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TemperatureParentPaneLayout.createSequentialGroup()
                                .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(TemperatureParentPaneLayout.createSequentialGroup()
                                .addGroup(TemperatureParentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TemperatureParentPaneLayout.createSequentialGroup()
                                        .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(TemperatureParentPaneLayout.createSequentialGroup()
                                        .addGroup(TemperatureParentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(TemperatureParentPaneLayout.createSequentialGroup()
                                                .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btn0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(TemperatureParentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Dot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TemperatureParentPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TemperatureParentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(FirstInputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(TemperatureParentPaneLayout.createSequentialGroup()
                                .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        TemperatureParentPaneLayout.setVerticalGroup(
            TemperatureParentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TemperatureParentPaneLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(FirstInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SecondInputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(TemperatureParentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TemperatureParentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TemperatureParentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TemperatureParentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TemperatureParentPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn0, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dot, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TemperatureParentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TemperatureParentPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        getAccessibleContext().setAccessibleParent(this);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActionNumber(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActionNumber
        this.FirstValue.setText(this.NP.NumberInput(((JButton)evt.getSource()).getText(),this.FirstValue.getText()));
        this.TP.setValue(this.FirstValue.getText());
        this.SecondValue.setText(this.TP.Calculate());
    }//GEN-LAST:event_ActionNumber

    private void btnACACAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnACACAction
        reStart();
    }//GEN-LAST:event_btnACACAction

    private void BackAction(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackAction
        this.FirstValue.setText(this.NP.backspace(this.FirstValue.getText()));
        this.TP.setValue(this.FirstValue.getText());
        this.SecondValue.setText(this.TP.Calculate());
    }//GEN-LAST:event_BackAction

    private void FirstComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FirstComboItemStateChanged
        this.TP.setFIndex(this.FirstCombo.getSelectedIndex());
        this.SecondValue.setText(this.TP.Calculate());
    }//GEN-LAST:event_FirstComboItemStateChanged

    private void SecondComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SecondComboItemStateChanged
        this.TP.setSIndex(this.SecondCombo.getSelectedIndex());
        this.SecondValue.setText(this.TP.Calculate());
    }//GEN-LAST:event_SecondComboItemStateChanged

    private void ActionPress(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ActionPress
        this.FirstValue.setText(this.NP.PressKey(evt, this.FirstValue.getText()));
        this.TP.setValue(this.FirstValue.getText());
        this.SecondValue.setText(this.TP.Calculate());
    }//GEN-LAST:event_ActionPress
    
    public void reStart(){
        this.TP.reStart();
        this.NP.reStart();
        this.SecondValue.setText("0");
        this.FirstValue.setText("0");
        this.FirstCombo.setSelectedIndex(0);
        this.SecondCombo.setSelectedIndex(0);
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
            java.util.logging.Logger.getLogger(TemperatureForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TemperatureForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TemperatureForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TemperatureForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TemperatureForm().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dot;
    private javax.swing.JComboBox<String> FirstCombo;
    private javax.swing.JPanel FirstInputPanel;
    private javax.swing.JLabel FirstValue;
    private javax.swing.JComboBox<String> SecondCombo;
    private javax.swing.JPanel SecondInputPanel;
    private javax.swing.JLabel SecondValue;
    private javax.swing.JPanel TemperatureParentPane;
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

}
