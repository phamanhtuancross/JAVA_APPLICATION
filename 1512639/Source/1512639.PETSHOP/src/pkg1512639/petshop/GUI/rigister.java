/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639.petshop.GUI;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import pkg1512639.petshop.AccountManager;
import pkg1512639.petshop.Driver;
import pkg1512639.petshop.NotificationManager;
/**
 *
 * @author phamanhtuan
 */
public class rigister extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public rigister() {
        initComponents();
        setLocationRelativeTo(null);

        backgroundLeftPanel.setBackground(new Color(0,0,0,0));
        backgroundLabel.setBackground(new Color(0,0,0,0));
        
        userEmailTextfiled.setBackground(new Color(250,250,250,50));
        usernameTextfiled.setBackground(new Color(250,250,250,50));
        passwordTextfiled.setBackground(new Color(250,250,250,50));
        configPasswordTextfiled.setBackground(new Color(250,250,250,50));
        
        ButtonRigister.setBackground(new Color(237,37,100,10));
        SetAnimationForButton(ButtonRigister,new Color(237,37,100,10));
        
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
        userEmailTextfiled = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        configPasswordTextfiled = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        usernameTextfiled = new javax.swing.JTextField();
        passwordTextfiled = new javax.swing.JPasswordField();
        ButtonExit = new javax.swing.JButton();
        ButtonRigister = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        backgroundLabel = new javax.swing.JLabel();
        usernameTextfiled1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backgroundLeftPanel.setBackground(new java.awt.Color(51, 51, 51));
        backgroundLeftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userEmailTextfiled.setBackground(new java.awt.Color(255, 255, 255));
        userEmailTextfiled.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        userEmailTextfiled.setForeground(new java.awt.Color(255, 255, 255));
        userEmailTextfiled.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        userEmailTextfiled.setCaretColor(new java.awt.Color(255, 255, 255));
        backgroundLeftPanel.add(userEmailTextfiled, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 290, 30));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USER EMAIL");
        backgroundLeftPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 100, 30));

        configPasswordTextfiled.setBackground(new java.awt.Color(255, 255, 255));
        configPasswordTextfiled.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        configPasswordTextfiled.setForeground(new java.awt.Color(255, 255, 255));
        configPasswordTextfiled.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        configPasswordTextfiled.setEchoChar('*');
        configPasswordTextfiled.setFocusCycleRoot(true);
        backgroundLeftPanel.add(configPasswordTextfiled, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 290, 30));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CONFIG PASSWORD");
        backgroundLeftPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 160, 30));

        usernameTextfiled.setBackground(new java.awt.Color(255, 255, 255));
        usernameTextfiled.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        usernameTextfiled.setForeground(new java.awt.Color(255, 255, 255));
        usernameTextfiled.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        usernameTextfiled.setCaretColor(new java.awt.Color(255, 255, 255));
        backgroundLeftPanel.add(usernameTextfiled, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 290, 30));

        passwordTextfiled.setBackground(new java.awt.Color(255, 255, 255));
        passwordTextfiled.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        passwordTextfiled.setForeground(new java.awt.Color(255, 255, 255));
        passwordTextfiled.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        passwordTextfiled.setEchoChar('*');
        passwordTextfiled.setFocusCycleRoot(true);
        backgroundLeftPanel.add(passwordTextfiled, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 290, 30));

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

        ButtonRigister.setBackground(new java.awt.Color(255, 255, 255));
        ButtonRigister.setForeground(new java.awt.Color(255, 255, 255));
        ButtonRigister.setText("RIGISTER");
        ButtonRigister.setBorder(null);
        ButtonRigister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRigisterActionPerformed(evt);
            }
        });
        backgroundLeftPanel.add(ButtonRigister, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, 140, 30));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USERNAME");
        backgroundLeftPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 110, 30));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");
        backgroundLeftPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 110, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1512639/petshop/petlogo.png"))); // NOI18N
        backgroundLeftPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, -1, -1));

        backgroundLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1512639/petshop/backgroundfinal.png"))); // NOI18N
        backgroundLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backgroundLeftPanel.add(backgroundLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, -1));

        usernameTextfiled1.setBackground(new java.awt.Color(255, 255, 255));
        usernameTextfiled1.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        usernameTextfiled1.setForeground(new java.awt.Color(255, 255, 255));
        usernameTextfiled1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        usernameTextfiled1.setCaretColor(new java.awt.Color(255, 255, 255));
        backgroundLeftPanel.add(usernameTextfiled1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 290, 30));

        getContentPane().add(backgroundLeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRigisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRigisterActionPerformed
        // TODO add your handling code here:
        String notificationText = "";
        
        String userEmail = userEmailTextfiled.getText();
        String username = usernameTextfiled.getText();
        String password =  passwordTextfiled.getText();
        String configPassword = configPasswordTextfiled.getText();
         
        
        //user data input solve
        if(!AccountManager.getInstance().IsValidEmailAccount(userEmail)){
            notificationText = "YOU'R EMAIL IS INVALID";
            NotificationManager.Show(notificationText);
            return;
        }
        
        if(!AccountManager.getInstance().IsValidUsernameAccount(username)){
            notificationText = "YOU'R USER NAME IS INVALID";
            NotificationManager.Show(notificationText);
            return;
        }
        
        if(!AccountManager.getInstance().IsValidPasswordAccount(password)){
            notificationText  = "YOU'R PASSWORD IS INVALID";
            NotificationManager.Show(notificationText);
            return;
        }
        
        System.out.println("configpass :" + configPassword + "pass :" + password);
        if(!password.equals(configPassword)){
            notificationText = "CONFIG PASSWORD IS NOT SAME PASSWORD";
            NotificationManager.Show(notificationText);
            return;
        }
        
        //slq data input solve
        boolean isExistedEmail  =  Driver.getInstance().CheckIsValidEmail(userEmail);
        if(isExistedEmail){
         
            notificationText = "YOU'R EMAIL ALREADY EXISTED";
            NotificationManager.Show(notificationText);
            return;
        }
        
        boolean isExistUsername = Driver.getInstance().CheckIsValidUserName(username);
        if(isExistUsername){
            notificationText = "YOU'R USERNAME ALREADY EXISTED";
            NotificationManager.Show(notificationText);
            return;
        }
        
        boolean isCreateAccountSuccessfull =  Driver.getInstance().CreateAccount(userEmail,username,password);
        if(isCreateAccountSuccessfull){
            notificationText = "CREATED ACCCOUNT SUCCESSFULL";
            NotificationManager.Show(notificationText);
            this.dispose();
        }
        
    }//GEN-LAST:event_ButtonRigisterActionPerformed

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
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
            java.util.logging.Logger.getLogger(rigister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rigister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rigister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rigister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rigister().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonRigister;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JPanel backgroundLeftPanel;
    private javax.swing.JPasswordField configPasswordTextfiled;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField passwordTextfiled;
    private javax.swing.JTextField userEmailTextfiled;
    private javax.swing.JTextField usernameTextfiled;
    private javax.swing.JTextField usernameTextfiled1;
    // End of variables declaration//GEN-END:variables
}
