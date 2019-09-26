/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.MyPanels;

import java.util.Locale;
import java.util.ResourceBundle;
import view.UserMenu;

/**
 *
 *
 */
public class About extends javax.swing.JInternalFrame {
private UserMenu um;
    /**
     * Creates new form A
     */
    public About(UserMenu um) {
        initComponents();
        this.um=um;
        languageOpening();
        um.getLanguageComboBox().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             languageActionPerformed(evt);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        closeButton = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/003-transport.png"))); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Courier New", 0, 14)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setTabSize(14);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("view/MyPanels/Bundle"); // NOI18N
        jTextArea1.setText(bundle.getString("About.jTextArea1.text")); // NOI18N
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jScrollPane1.setViewportView(jTextArea1);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText(bundle.getString("About.jLabel2.text")); // NOI18N

        closeButton.setBackground(new java.awt.Color(235, 255, 255));
        closeButton.setText(bundle.getString("About.closeButton.text")); // NOI18N
        closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(closeButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel2))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(closeButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeButtonMouseClicked
       dispose();
                
    }//GEN-LAST:event_closeButtonMouseClicked

private void languageOpening()
{
    if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              {
                  Locale l = new Locale("iw", "IL");
                  ResourceBundle r = ResourceBundle.getBundle("view.MyPanels/Bundle",l);
                  closeButton.setText(r.getString("About.closeButton.text"));
                  
              }
             else if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              {
                  Locale l = new Locale("en", "US");
                  ResourceBundle r = ResourceBundle.getBundle("view.MyPanels/Bundle",l);
                  closeButton.setText(r.getString("About.closeButton.text"));
              }
}

private void languageActionPerformed(java.awt.event.ActionEvent evt) {  
     if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              {
                  Locale l = new Locale("iw", "IL");
                  ResourceBundle r = ResourceBundle.getBundle("view.MyPanels/Bundle",l);
                  closeButton.setText(r.getString("About.closeButton.text"));
                  this.setTitle("אודות");
              }
             else if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              {
                  Locale l = new Locale("en", "US");
                  ResourceBundle r = ResourceBundle.getBundle("view.MyPanels/Bundle",l);
                  closeButton.setText(r.getString("About.closeButton.text"));
                  this.setTitle("About");
              }
}   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
