import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.*;

import javax.swing.JOptionPane;


public class Calculator extends javax.swing.JFrame {
    int sin = 1, cos = 2, tan = 3;
    int PreviousState = 0;
    public Calculator() {
        initComponents();
        
        // prevent default exit
        this.setDefaultCloseOperation(Calculator.DO_NOTHING_ON_CLOSE);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int choice = JOptionPane.showConfirmDialog(null, "Θέλετε πραγματικά να τερματίσετε την εφαρμογή;",
                        "Έξοδος", JOptionPane.YES_NO_OPTION,
                        JOptionPane.INFORMATION_MESSAGE);
                if (choice == JOptionPane.YES_OPTION) {
                    e.getWindow().dispose();
                    System.out.println("Chose to exit");
                } else 
                    System.out.println("Chose to stay");
            }
        });
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 1), new java.awt.Dimension(40, 1), new java.awt.Dimension(40, 1));
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(40, 1), new java.awt.Dimension(40, 1), new java.awt.Dimension(40, 1));
        jPanel8 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Τριγωνομετρία");
        setMinimumSize(new java.awt.Dimension(420, 220));
        setPreferredSize(new java.awt.Dimension(450, 220));

        jPanel7.setLayout(new java.awt.BorderLayout(0, 20));

        jPanel1.setLayout(new java.awt.GridLayout(2, 0, 7, 0));

        jPanel2.setMinimumSize(new java.awt.Dimension(100, 30));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Μοίρες:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 14));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 14));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 14));
        jPanel2.add(jLabel1);

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setMinimumSize(new java.awt.Dimension(140, 25));
        jTextField1.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel2.add(jTextField1);
        jPanel2.add(filler2);

        jPanel1.add(jPanel2);

        jPanel4.setPreferredSize(new java.awt.Dimension(188, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Αποτέλεσμα:");
        jLabel2.setToolTipText("");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 14));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 14));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 14));
        jPanel4.add(jLabel2);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField2.setEnabled(false);
        jTextField2.setMinimumSize(new java.awt.Dimension(140, 25));
        jTextField2.setPreferredSize(new java.awt.Dimension(180, 25));
        jPanel4.add(jTextField2);
        jPanel4.add(filler1);

        jPanel1.add(jPanel4);

        jPanel7.add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jButton1.setText("ημ");
        jButton1.setMaximumSize(new java.awt.Dimension(55, 23));
        jButton1.setMinimumSize(new java.awt.Dimension(55, 23));
        jButton1.setPreferredSize(new java.awt.Dimension(55, 23));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton1);

        jButton2.setText("συν");
        jButton2.setMaximumSize(new java.awt.Dimension(55, 23));
        jButton2.setMinimumSize(new java.awt.Dimension(55, 23));
        jButton2.setPreferredSize(new java.awt.Dimension(55, 23));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton2);

        jButton3.setText("εφ");
        jButton3.setMaximumSize(new java.awt.Dimension(55, 23));
        jButton3.setMinimumSize(new java.awt.Dimension(55, 23));
        jButton3.setPreferredSize(new java.awt.Dimension(55, 23));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton3);

        jPanel7.add(jPanel8, java.awt.BorderLayout.SOUTH);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 9, 0));

        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Μοίρες");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton1);

        jRadioButton2.setText("Ακτίνια");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton2);

        jPanel7.add(jPanel3, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel7, java.awt.BorderLayout.PAGE_START);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        jLabel1.setText("Μοίρες:");
        jTextField2.setEnabled(false);
        
        if(jRadioButton2.isSelected()) 
        { 
            jRadioButton2.setSelected(false);
            if (PreviousState == sin) 
                jButton1ActionPerformed(evt);
            else if (PreviousState == cos) 
                jButton2ActionPerformed(evt);
            else if (PreviousState == tan) 
                jButton3ActionPerformed(evt);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        jLabel1.setText("Ακτίνια:");
        jTextField2.setEnabled(false); 
        
        if(jRadioButton1.isSelected()) 
        { 
            jRadioButton1.setSelected(false);
            if (PreviousState == sin) 
                jButton1ActionPerformed(evt);
            else if (PreviousState == cos) 
                jButton2ActionPerformed(evt);
            else if (PreviousState == tan) 
                jButton3ActionPerformed(evt);
        }

    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(IsEmpty())   Error(1);
        else if(!isNumber(jTextField1.getText()))    Error(2);
        else 
        {
            double a;
            PreviousState = sin;
            if(jLabel1.getText().equals("Ακτίνια:"))
            {              
                jLabel2.setText("Ημίτονο:");
                String text = jTextField1.getText();
                a = Double.parseDouble(text);
                a = Math.sin(a);
                //5 digit precision in order not to bother the user with unneeded info and evade the danger of overflowing
                a = Math.round(a * 100000d) / 100000d;            
                jTextField2.setText(a + "" );
            }
            else
            {
                jLabel2.setText("Ημίτονο:");
                String text = jTextField1.getText();
                a = (double)(Math.sin(Math.toRadians(Double.parseDouble(text))));
                a = Math.round(a * 100000d) / 100000d;
                jTextField2.setText(a + "" );
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(IsEmpty())   Error(1);
        else if(!isNumber(jTextField1.getText()))    Error(2);
        else 
        {
            double a;
            PreviousState = cos;
            if(jLabel1.getText().equals("Ακτίνια:"))
            {
                jLabel2.setText("Συνημίτονο:");
                String text = jTextField1.getText();
                a = Math.cos(Double.parseDouble(text));
                a = Math.round(a * 100000d) / 100000d;
                jTextField2.setText(a + "" );
            }
            else
            {
                jLabel2.setText("Συνημίτονο:");
                String text = jTextField1.getText();
                a = Math.cos(Math.toRadians(Double.parseDouble(text)));
                a = Math.round(a * 100000d) / 100000d;
                // a = Math.sqrt(1- ((Math.sin(Math.toRadians(Double.parseDouble(text))))*(Math.sin(Math.toRadians(Double.parseDouble(text))))));
                jTextField2.setText(a + "" );
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(IsEmpty())   Error(1);
        else if(!isNumber(jTextField1.getText()))    Error(2);
        else 
        {
            double a;
            PreviousState = tan;
            if (!isCorrect()) Error(3);
            else if(jLabel1.getText().equals("Ακτίνια:") && Math.cos((Double.parseDouble(jTextField1.getText()))) != 0 )
            {
                jLabel2.setText("Εφαπτομένη:");
                String text = jTextField1.getText();
                a = (double)(Math.tan(Double.parseDouble(text)));
                a = Math.round(a * 100000d) / 100000d;
                jTextField2.setText(a + "" );           
            }
            else
            {
                jLabel2.setText("Εφαπτομένη:");
                String text = jTextField1.getText();
                a = (double)(Math.tan(Math.toRadians(Double.parseDouble(text))));
                a = Math.round(a * 100000d) / 100000d;
                jTextField2.setText(a + "" );
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed
    
   private boolean isCorrect()
   {
        /* tan(x) equals sin(x)/cos(x)
        ** so cos(x) should never be zero
        ** because anything/0 can't be evaluated
        ** (without de'l hospital and complicated math at least :)
        */
        if( jLabel1.getText().equals("Ακτίνια:") && Math.round(Math.cos((Double.parseDouble(jTextField1.getText())))* 100000d) / 100000d == 0 ) 
            return false;
        else if( Math.round( Math.cos(Math.toRadians(Double.parseDouble(jTextField1.getText()))) * 100000d) / 100000d == 0 && jLabel1.getText().equals("Μοίρες:"))
            return false;
        return true;
   } 
   
   private void Error(int a)
   {
        Toolkit.getDefaultToolkit().beep(); 
        if (a == 1) 
        {
            System.out.println("Error!! Δεν δώθηκαν αριθμοί!");
            //create a message dialog with an error icon
            JOptionPane.showMessageDialog(this, "Δεν δώθηκαν αριθμοί!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (a == 2) 
        {
            System.out.println("Error!! Μη αποδεκτή είσοδος!");
            JOptionPane.showMessageDialog(this, "Μη αποδεκτή είσοδος!", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if (a == 3) 
        {
            System.out.println("Error!! Μη αποδεκτός υπολογισμός π.χ 90 μοίρες εφαπτομένη!");
            JOptionPane.showMessageDialog(this, "Μη αποδεκτός υπολογισμός π.χ 90 μοίρες εφαπτομένη!", "Error", JOptionPane.ERROR_MESSAGE);
        }
   }
        
   private boolean IsEmpty()
   {
        return (jTextField1.getText().trim()) == null;
   } 
    
   private static boolean isNumber(String str)  
   {  
        try  
        {  
            double d = Double.parseDouble(str);  
        }  
        catch(NumberFormatException nfe)  
        {  
            return false;  
        }  
        return true;  
   }
    
    public static void main(String args[]) 
    {    
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
