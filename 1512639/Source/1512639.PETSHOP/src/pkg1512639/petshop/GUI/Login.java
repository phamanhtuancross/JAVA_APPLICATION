/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639.petshop.GUI;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JButton;
import pkg1512639.petshop.AccountManager;
import pkg1512639.petshop.Driver;
import pkg1512639.petshop.FileIO;

/**
 *
 * @author phamanhtuan
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        setLocationRelativeTo(null);
        backgroundLeftPanel.setBackground(new Color(0,0,0,0));
        backgroundLabel.setBackground(new Color(0,0,0,0));
        
        usernameTextfiled.setBackground(new Color(250,250,250,50));
        passwordTextfiled.setBackground(new Color(250,250,250,50));
        
        ButtonLogin.setBackground(new Color(237,37,100,10));
        ButtonRigister.setBackground(new Color(12,104,92,10));
        
        SetAnimationForButton(ButtonLogin,new Color(237,37,100,10));
        SetAnimationForButton(ButtonRigister,new Color(12,104,92,10));

    }

    private void SetAnimationForButton(JButton button,Color sourceColor)
    {
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(e.getButton() == MouseEvent.BUTTON1){
                    button.setBackground(new Color(253,192,47,100));
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if(e.getButton() == MouseEvent.BUTTON1){
                    button.setBackground(new Color(253,192,47,100));
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(new Color(137, 255, 254,10));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                button.setBackground(sourceColor);
            }
        });
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgroundLeftPanel = new javax.swing.JPanel();
        usernameTextfiled = new javax.swing.JTextField();
        passwordTextfiled = new javax.swing.JPasswordField();
        ButtonLogin = new javax.swing.JButton();
        ButtonRigister = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        labelForgotPassword = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        ButtonExit = new javax.swing.JButton();
        backgroundLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundLeftPanel.setBackground(new java.awt.Color(51, 51, 51));
        backgroundLeftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usernameTextfiled.setBackground(new java.awt.Color(255, 255, 255));
        usernameTextfiled.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        usernameTextfiled.setForeground(new java.awt.Color(255, 255, 255));
        usernameTextfiled.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        usernameTextfiled.setCaretColor(new java.awt.Color(255, 255, 255));
        backgroundLeftPanel.add(usernameTextfiled, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 290, 30));

        passwordTextfiled.setBackground(new java.awt.Color(255, 255, 255));
        passwordTextfiled.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        passwordTextfiled.setForeground(new java.awt.Color(255, 255, 255));
        passwordTextfiled.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        passwordTextfiled.setEchoChar('*');
        passwordTextfiled.setFocusCycleRoot(true);
        backgroundLeftPanel.add(passwordTextfiled, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 290, 30));

        ButtonLogin.setBackground(new java.awt.Color(255, 255, 255));
        ButtonLogin.setForeground(new java.awt.Color(255, 255, 255));
        ButtonLogin.setText("LOGIN");
        ButtonLogin.setBorder(null);
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });
        backgroundLeftPanel.add(ButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 130, 30));

        ButtonRigister.setBackground(new java.awt.Color(255, 255, 255));
        ButtonRigister.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRigister.setText("RIGISTER");
        ButtonRigister.setBorder(null);
        ButtonRigister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRigisterActionPerformed(evt);
            }
        });
        backgroundLeftPanel.add(ButtonRigister, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 140, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME");
        backgroundLeftPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 110, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");
        backgroundLeftPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 110, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1512639/petshop/petlogo.png"))); // NOI18N
        backgroundLeftPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        labelForgotPassword.setBackground(new java.awt.Color(255, 255, 255));
        labelForgotPassword.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        labelForgotPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelForgotPassword.setText("forgot your password");
        labelForgotPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labelForgotPasswordMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labelForgotPasswordMouseEntered(evt);
            }
        });
        backgroundLeftPanel.add(labelForgotPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        backgroundLeftPanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, 120, -1));

        ButtonExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1512639/petshop/logout.png"))); // NOI18N
        ButtonExit.setBorder(null);
        ButtonExit.setBorderPainted(false);
        ButtonExit.setContentAreaFilled(false);
        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });
        backgroundLeftPanel.add(ButtonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 30, 30));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1512639/petshop/backgroundfinal.png"))); // NOI18N
        backgroundLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        backgroundLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backgroundLeftPanel.add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 490));

        getContentPane().add(backgroundLeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
        String usernameAccount = usernameTextfiled.getText();
        String passwordAccount = passwordTextfiled.getText();
       
        String notificationText = "";
           
        //JOptionPane.showMessageDialog(null,passwordAccount);
        boolean isValidAccount = AccountManager.getInstance().IsValidAcount(usernameAccount, passwordAccount);
        if(!isValidAccount){
            notificationText = "TEN TAI KHOAN HOAC MAT KHAU KHONG HOP LE";
        }
        else{
            if(!Driver.getInstance().CheckAcount(usernameAccount, passwordAccount)){
                notificationText = "TEN TAI KHOAN HOAC MAT KHUA KHONG DUNG";
 
            }
            else{
                notificationText = "DANG NHAP THANH CONG";
            }
        }
        
        NotifiacationPanel notifiacationPanel = new NotifiacationPanel();
        notifiacationPanel.SetNotificationText(notificationText);
        notifiacationPanel.setVisible(true);
        
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void labelForgotPasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelForgotPasswordMouseEntered
        // TODO add your handling code here:
        labelForgotPassword.setForeground(new Color(53,183,243));
    }//GEN-LAST:event_labelForgotPasswordMouseEntered

    private void labelForgotPasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelForgotPasswordMouseExited
        // TODO add your handling code here:
        labelForgotPassword.setForeground(Color.WHITE);
    }//GEN-LAST:event_labelForgotPasswordMouseExited

    private void ButtonRigisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRigisterActionPerformed
        // TODO add your handling code here:
        rigister re = new rigister();
        re.setVisible(true);
    }//GEN-LAST:event_ButtonRigisterActionPerformed

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        // TODO add your handling code here:
       // this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_ButtonExitActionPerformed

    
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JButton ButtonRigister;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JPanel backgroundLeftPanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelForgotPassword;
    private javax.swing.JPasswordField passwordTextfiled;
    private javax.swing.JTextField usernameTextfiled;
    // End of variables declaration//GEN-END:variables
}
