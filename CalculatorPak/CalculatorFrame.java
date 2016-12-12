// Ben Said   Zine El Abidine
package CalculatorPak;

/**
 *
 * @author Zinou
 */
public class CalculatorFrame extends javax.swing.JFrame {

    
    private String Operation;
    private boolean Point = true;
    private double Calcul =0;
    private boolean Number = true;
    
    public CalculatorFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jButton17 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        AffichageTextField = new javax.swing.JTextField();
        AffichageTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");
        setLocationByPlatform(true);
        setPreferredSize(new java.awt.Dimension(300, 420));
        setResizable(false);

        Panel1.setBackground(new java.awt.Color(102, 153, 255));
        Panel1.setPreferredSize(new java.awt.Dimension(300, 400));
        Panel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("8");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel1.add(jButton1);
        jButton1.setBounds(70, 150, 50, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("9");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Panel1.add(jButton2);
        jButton2.setBounds(140, 150, 50, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton3.setText("4");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Panel1.add(jButton3);
        jButton3.setBounds(10, 210, 50, 40);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("5");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Panel1.add(jButton4);
        jButton4.setBounds(70, 210, 50, 40);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("6");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        Panel1.add(jButton5);
        jButton5.setBounds(140, 210, 50, 40);

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton6.setText("1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Panel1.add(jButton6);
        jButton6.setBounds(10, 270, 50, 40);

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton7.setText("=");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Panel1.add(jButton7);
        jButton7.setBounds(204, 330, 85, 40);

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton8.setText("2");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Panel1.add(jButton8);
        jButton8.setBounds(70, 270, 50, 40);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("0");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Panel1.add(jButton9);
        jButton9.setBounds(10, 330, 100, 40);

        jButton10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton10.setText("3");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        Panel1.add(jButton10);
        jButton10.setBounds(140, 270, 50, 40);

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton11.setText(".");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        Panel1.add(jButton11);
        jButton11.setBounds(140, 330, 50, 40);

        jButton12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton12.setText("*");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        Panel1.add(jButton12);
        jButton12.setBounds(250, 210, 42, 40);

        jButton13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton13.setText("+");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        Panel1.add(jButton13);
        jButton13.setBounds(250, 270, 42, 40);

        jButton14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton14.setText("-");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        Panel1.add(jButton14);
        jButton14.setBounds(204, 270, 42, 40);

        jButton15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton15.setText("/");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        Panel1.add(jButton15);
        jButton15.setBounds(204, 210, 42, 40);

        jButton16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton16.setText("7");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        Panel1.add(jButton16);
        jButton16.setBounds(10, 150, 50, 40);
        Panel1.add(jSeparator1);
        jSeparator1.setBounds(10, 132, 280, 10);
        Panel1.add(jSeparator2);
        jSeparator2.setBounds(10, 29, 270, 10);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("=");
        Panel1.add(jLabel1);
        jLabel1.setBounds(14, 70, 20, 40);
        Panel1.add(jSeparator3);
        jSeparator3.setBounds(10, 109, 270, 10);

        jButton17.setText("C");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        Panel1.add(jButton17);
        jButton17.setBounds(204, 150, 85, 40);

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Panel1.add(jSeparator4);
        jSeparator4.setBounds(200, 140, 10, 240);

        AffichageTextField.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        AffichageTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        AffichageTextField.setEnabled(false);
        Panel1.add(AffichageTextField);
        AffichageTextField.setBounds(10, 70, 270, 40);

        AffichageTextField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        AffichageTextField2.setEnabled(false);
        Panel1.add(AffichageTextField2);
        AffichageTextField2.setBounds(10, 31, 270, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        if (Number == true){
        AffichageTextField.setText(AffichageTextField.getText() +"7");
        AffichageTextField2.setText(AffichageTextField2.getText() +"7");
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Number == true){
        AffichageTextField.setText(AffichageTextField.getText() + "8");
        AffichageTextField2.setText(AffichageTextField2.getText() + "8");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         if (Number == true){
        AffichageTextField.setText(AffichageTextField.getText() + "9");
        AffichageTextField2.setText(AffichageTextField2.getText() + "9");
    }//GEN-LAST:event_jButton2ActionPerformed
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      if (Number == true){   
        AffichageTextField.setText(AffichageTextField.getText() + "4");
        AffichageTextField2.setText(AffichageTextField2.getText() + "4");
    }//GEN-LAST:event_jButton3ActionPerformed
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      if (Number == true){  
        AffichageTextField.setText(AffichageTextField.getText() + "5");
        AffichageTextField2.setText(AffichageTextField2.getText() + "5");
    }//GEN-LAST:event_jButton4ActionPerformed
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      if (Number == true){  
        AffichageTextField.setText(AffichageTextField.getText() + "6");
        AffichageTextField2.setText(AffichageTextField2.getText() + "6");
    }//GEN-LAST:event_jButton5ActionPerformed
    }
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
      if (Number == true){   
        AffichageTextField.setText(AffichageTextField.getText() + "1");
        AffichageTextField2.setText(AffichageTextField2.getText() + "1");
    }//GEN-LAST:event_jButton6ActionPerformed
    }
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
      if (Number == true){  
        AffichageTextField.setText(AffichageTextField.getText() + "2");
        AffichageTextField2.setText(AffichageTextField2.getText() + "2");
    }//GEN-LAST:event_jButton8ActionPerformed
    }
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
      if (Number == true){  
        AffichageTextField.setText(AffichageTextField.getText() + "3");
        AffichageTextField2.setText(AffichageTextField2.getText() + "3");
    }//GEN-LAST:event_jButton10ActionPerformed
    }
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      if (Number == true){  
        AffichageTextField.setText(AffichageTextField.getText() + "0");
        AffichageTextField2.setText(AffichageTextField2.getText() + "0");
    }//GEN-LAST:event_jButton9ActionPerformed
    }
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
       if (Number == true){
        if (Point == true){
           if(AffichageTextField.getText().equals("")){
                AffichageTextField.setText("0");
                AffichageTextField2.setText("0");
           }
                AffichageTextField.setText(AffichageTextField.getText() + ".");
                AffichageTextField2.setText(AffichageTextField2.getText() + ".");
                Point = false;
    }//GEN-LAST:event_jButton11ActionPerformed
    }
    }
    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        Calcul = Double.valueOf( AffichageTextField.getText());
        Operation = "+";
        AffichageTextField2.setText(AffichageTextField2.getText() + " + ");
        AffichageTextField.setText("");
        Point = true;
        Number = true;
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
       
        Calcul = Double.valueOf(AffichageTextField.getText());
        Operation = "-";
        AffichageTextField2.setText(AffichageTextField2.getText() + " - ");
        AffichageTextField.setText("");
        Point = true;
        Number = true;
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
     
        Calcul = Double.valueOf(AffichageTextField.getText());
        Operation = "*";
        AffichageTextField2.setText(AffichageTextField2.getText() + " * ");
        AffichageTextField.setText("");
        Point = true;
        Number = true;
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        
        Calcul = Double.valueOf(AffichageTextField.getText());
        Operation = "/";
        AffichageTextField2.setText(AffichageTextField2.getText() + " / ");
        AffichageTextField.setText("");
        Point = true;
        Number = true;
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
       
       switch(Operation){
           case "*":
               Calcul = Calcul * Double.valueOf(AffichageTextField.getText());
               AffichageTextField.setText("" + Calcul);
               break;
           case "/":
               Calcul = Calcul / Double.valueOf(AffichageTextField.getText());
               AffichageTextField.setText("" + Calcul);
               break;
           case "+":
               Calcul = Calcul + Double.valueOf(AffichageTextField.getText());
               AffichageTextField.setText("" + Calcul);
               break;
           case "-":
               Calcul = Calcul - Double.valueOf(AffichageTextField.getText());
               AffichageTextField.setText("" + Calcul);
               break;
       }
       Number = false;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
       
        Operation = null;
        Calcul = 0;
        AffichageTextField.setText("");
        AffichageTextField2.setText("");
        Point = true;
        Number = true;
    }//GEN-LAST:event_jButton17ActionPerformed

     
   
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
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AffichageTextField;
    private javax.swing.JTextField AffichageTextField2;
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    // End of variables declaration//GEN-END:variables
}
