/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import utils.Constants;
import utils.MyFileLogWriter;

/**
 *
 * @author Bozo
 */
public class PasswordReset extends javax.swing.JFrame {
private static ViewLogic view;
private String userName;
    /**
     * Creates new form PasswordReset
     */
    public PasswordReset() {
        initComponents();
        view=ViewLogic.getInstance();
        newPassword.grabFocus();
    }
    
    protected void setUserName(String userName) {
        this.userName = userName;
    }

    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the
     * Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        newPasswordLabel = new javax.swing.JLabel();
        verifyNewPasswordLabel = new javax.swing.JLabel();
        newPassword = new javax.swing.JPasswordField();
        verifyNewPassword = new javax.swing.JPasswordField();
        submit = new javax.swing.JButton();
        back = new javax.swing.JButton();
        showPassword = new javax.swing.JCheckBox();
        languageComboBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jDesktopPane1.setBackground(new java.awt.Color(2, 35, 66));
        jDesktopPane1.setForeground(new java.awt.Color(102, 153, 255));
        jDesktopPane1.setMaximumSize(new java.awt.Dimension(430, 355));
        jDesktopPane1.setMinimumSize(new java.awt.Dimension(430, 355));

        newPasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        newPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("view/Bundle"); // NOI18N
        newPasswordLabel.setText(bundle.getString("PasswordReset.newPasswordLabel.text")); // NOI18N

        verifyNewPasswordLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        verifyNewPasswordLabel.setForeground(new java.awt.Color(255, 255, 255));
        verifyNewPasswordLabel.setText(bundle.getString("PasswordReset.verifyNewPasswordLabel.text")); // NOI18N

        newPassword.setBackground(new java.awt.Color(2, 35, 66));
        newPassword.setForeground(new java.awt.Color(255, 255, 255));
        newPassword.setToolTipText(bundle.getString("PasswordReset.newPassword.toolTipText")); // NOI18N
        newPassword.setBorder(null);
        newPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        UIManager.put("ToolTip.background", Color.WHITE);
        newPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newPasswordActionPerformed(evt);
            }
        });

        verifyNewPassword.setBackground(new java.awt.Color(2, 35, 66));
        verifyNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        verifyNewPassword.setToolTipText(bundle.getString("PasswordReset.verifyNewPassword.toolTipText")); // NOI18N
        verifyNewPassword.setBorder(null);
        verifyNewPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        verifyNewPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifyNewPasswordActionPerformed(evt);
            }
        });

        submit.setBackground(new java.awt.Color(2, 51, 99));
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setText(bundle.getString("PasswordReset.submit.text")); // NOI18N
        submit.setEnabled(false);
        DocumentListener docListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                emptyFields(newPassword,verifyNewPassword,submit);
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                emptyFields(newPassword,verifyNewPassword,submit);
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                emptyFields(newPassword,verifyNewPassword,submit);
            }
        };
        newPassword.getDocument().addDocumentListener(docListener);
        verifyNewPassword.getDocument().addDocumentListener(docListener);
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        submit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                submitKeyPressed(evt);
            }
        });

        back.setBackground(new java.awt.Color(76, 188, 188));
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText(bundle.getString("PasswordReset.back.text")); // NOI18N
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        back.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backKeyPressed(evt);
            }
        });

        showPassword.setBackground(new java.awt.Color(2, 35, 66));
        showPassword.setForeground(new java.awt.Color(255, 255, 255));
        showPassword.setText(bundle.getString("PasswordReset.showPassword.text")); // NOI18N
        showPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordActionPerformed(evt);
            }
        });

        languageComboBox.setBackground(new java.awt.Color(2, 35, 66));
        languageComboBox.setForeground(new java.awt.Color(255, 255, 255));
        languageComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose a language", "English", "עברית" }));
        languageComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageComboBoxActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(newPasswordLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(verifyNewPasswordLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(newPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(verifyNewPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(submit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(back, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(showPassword, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(languageComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(languageComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(back)
                        .addGap(42, 42, 42)
                        .addComponent(submit)))
                .addGap(152, 152, 152))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(showPassword)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(newPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(verifyNewPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1)
                    .addComponent(newPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                    .addComponent(verifyNewPassword)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
                .addGap(39, 39, 39))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newPasswordLabel))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(verifyNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verifyNewPasswordLabel))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(showPassword)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(submit, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10)
                .addComponent(languageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
         view.LoginScreen(languageComboBox);
         view.PasswordResetToLoginScreen(this);
    }//GEN-LAST:event_backActionPerformed

    private void backKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backKeyPressed
         int key=evt.getKeyCode();
          ActionEvent ae = new ActionEvent(evt.getSource(), evt.getID(), evt.paramString());
          if(key==KeyEvent.VK_ENTER)        
          backActionPerformed(ae);
        back.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "none");
    }//GEN-LAST:event_backKeyPressed

    private void showPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showPasswordActionPerformed
        Font font= new Font("Tahoma", Font.PLAIN, 13);
         newPassword.setFont(font);
         verifyNewPassword.setFont(font);
        if (showPassword.isSelected())
        {
            newPassword.setEchoChar('\u0000');
            verifyNewPassword.setEchoChar('\u0000');
        }
        else
        {
            
            newPassword.setEchoChar('\u25cf');
            verifyNewPassword.setEchoChar('\u25cf');

        }
    }//GEN-LAST:event_showPasswordActionPerformed

    private void submitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_submitKeyPressed
        int key=evt.getKeyCode();
          ActionEvent ae = new ActionEvent(evt.getSource(), evt.getID(), evt.paramString());
          if(key==KeyEvent.VK_ENTER)        
          submitActionPerformed(ae);
        submit.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "none");
    }//GEN-LAST:event_submitKeyPressed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
        boolean bool;
        if (!newPassword.getText().equals(verifyNewPassword.getText()))
           view.PasswordsNotMatching(languageComboBox);
       else
       {
         bool=view.NewPassSave(userName,newPassword.getText(),languageComboBox);
         if (bool==true)
          {
           view.LoginScreen(languageComboBox);
           view.PasswordResetToLoginScreen(this);
          }
       }
       
       
    }//GEN-LAST:event_submitActionPerformed

    private void newPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newPasswordActionPerformed
        if (submit.isEnabled())
        submitActionPerformed(evt);
    }//GEN-LAST:event_newPasswordActionPerformed

    private void verifyNewPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifyNewPasswordActionPerformed
       if (submit.isEnabled())
        submitActionPerformed(evt);
    }//GEN-LAST:event_verifyNewPasswordActionPerformed

    private void languageComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageComboBoxActionPerformed

        if (languageComboBox.getSelectedItem().equals("עברית"))
        {
            Locale l = new Locale("iw", "IL");
            ResourceBundle r = ResourceBundle.getBundle("view/Bundle",l);
            newPasswordLabel.setText(r.getString("PasswordReset.newPasswordLabel.text"));
            verifyNewPasswordLabel.setText(r.getString("PasswordReset.verifyNewPasswordLabel.text"));
            submit.setText(r.getString("PasswordReset.submit.text"));
            back.setText(r.getString("PasswordReset.back.text"));
            showPassword.setText(r.getString("PasswordReset.showPassword.text"));
            newPassword.setToolTipText(r.getString("PasswordReset.newPassword.toolTipText"));
            verifyNewPassword.setToolTipText(r.getString("PasswordReset.verifyNewPassword.toolTipText"));
        }
        else if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
        {
            Locale l = new Locale("en", "US");
            ResourceBundle r = ResourceBundle.getBundle("view/Bundle",l);
            newPasswordLabel.setText(r.getString("PasswordReset.newPasswordLabel.text"));
            verifyNewPasswordLabel.setText(r.getString("PasswordReset.verifyNewPasswordLabel.text"));
            submit.setText(r.getString("PasswordReset.submit.text"));
            back.setText(r.getString("PasswordReset.back.text"));
            showPassword.setText(r.getString("PasswordReset.showPassword.text"));
            newPassword.setToolTipText(r.getString("PasswordReset.newPassword.toolTipText"));
            verifyNewPassword.setToolTipText(r.getString("PasswordReset.verifyNewPassword.toolTipText"));
        }

    }//GEN-LAST:event_languageComboBoxActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            view.serialization(Constants.Ser_FileName);
        } catch (IOException ex) {
        }
        MyFileLogWriter.saveLogFile();
    }//GEN-LAST:event_formWindowClosing

    private void emptyFields(JTextField newPassword, JPasswordField verifyNewPassword, JButton submit){
             if (newPassword.getText().length()<4  || verifyNewPassword.getPassword().length<4 ){
                submit.setEnabled(false);
                 submit.setBackground(new Color(2,51,99));
             }
                 else{
                submit.setEnabled(true);
                submit.setBackground(new Color(76,188,188));
                 }
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
            java.util.logging.Logger.getLogger(PasswordReset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordReset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordReset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordReset.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordReset().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    protected javax.swing.JComboBox<String> languageComboBox;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JLabel newPasswordLabel;
    private javax.swing.JCheckBox showPassword;
    private javax.swing.JButton submit;
    private javax.swing.JPasswordField verifyNewPassword;
    private javax.swing.JLabel verifyNewPasswordLabel;
    // End of variables declaration//GEN-END:variables
}