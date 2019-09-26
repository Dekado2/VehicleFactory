/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.MyPanels;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import model.ProductionPlan;
import model.ProductionPlanType;
import view.InputCheck;
import view.UserMenu;
import view.ViewLogic;

/**
 *
 *
 */
public class AddPP extends javax.swing.JPanel {
private static ViewLogic view;
private UserMenu um;
    /**
     * Creates new form AddPP
     */
    public AddPP(UserMenu um) {
        initComponents();
        view=ViewLogic.getInstance();
        this.um=um;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        serialNumberLabel = new javax.swing.JLabel();
        typeSerialNumberLabel = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        serialNumberText = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        typeSerialNumberText = new javax.swing.JTextField();
        addPanel = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(235, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        serialNumberLabel.setFont(new java.awt.Font("Aharoni", 0, 16)); // NOI18N
        serialNumberLabel.setForeground(new java.awt.Color(102, 102, 102));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("view/MyPanels/Bundle"); // NOI18N
        serialNumberLabel.setText(bundle.getString("AddPP.serialNumberLabel.text")); // NOI18N

        typeSerialNumberLabel.setFont(new java.awt.Font("Aharoni", 0, 16)); // NOI18N
        typeSerialNumberLabel.setForeground(new java.awt.Color(102, 102, 102));
        typeSerialNumberLabel.setText(bundle.getString("AddPP.typeSerialNumberLabel.text")); // NOI18N

        jSeparator4.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator4.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N

        serialNumberText.setBackground(new java.awt.Color(235, 255, 255));
        serialNumberText.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        serialNumberText.setBorder(null);
        serialNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serialNumberTextActionPerformed(evt);
            }
        });

        jSeparator5.setForeground(new java.awt.Color(102, 102, 102));
        jSeparator5.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N

        typeSerialNumberText.setBackground(new java.awt.Color(235, 255, 255));
        typeSerialNumberText.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        typeSerialNumberText.setBorder(null);
        typeSerialNumberText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeSerialNumberTextActionPerformed(evt);
            }
        });

        addPanel.setBackground(new java.awt.Color(204, 204, 204));
        addPanel.setForeground(new java.awt.Color(255, 255, 255));
        DocumentListener docListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                emptyFields(serialNumberText, typeSerialNumberText, addPanel);
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                emptyFields(serialNumberText, typeSerialNumberText, addPanel);
            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                emptyFields(serialNumberText, typeSerialNumberText, addPanel);
            }
        };
        serialNumberText.getDocument().addDocumentListener(docListener);
        typeSerialNumberText.getDocument().addDocumentListener(docListener);
        addPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addPanelMouseExited(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText(bundle.getString("AddPP.jLabel25.text")); // NOI18N

        javax.swing.GroupLayout addPanelLayout = new javax.swing.GroupLayout(addPanel);
        addPanel.setLayout(addPanelLayout);
        addPanelLayout.setHorizontalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(76, 76, 76))
        );
        addPanelLayout.setVerticalGroup(
            addPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addGap(11, 11, 11))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeSerialNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(serialNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serialNumberText)
                    .addComponent(typeSerialNumberText)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(serialNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(serialNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeSerialNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(typeSerialNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addComponent(addPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(213, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void serialNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serialNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serialNumberTextActionPerformed

    private void typeSerialNumberTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeSerialNumberTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeSerialNumberTextActionPerformed

    private void addPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseEntered
        view.AddMouseEnter(addPanel);
    }//GEN-LAST:event_addPanelMouseEntered

    private void addPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseExited
       view.AddMouseExit(addPanel);
    }//GEN-LAST:event_addPanelMouseExited

    private void addPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addPanelMouseClicked
     Integer serialnum=0,typeserialnum=0;
     boolean bool;
     Color c=new Color(204,204,204);
     if (!addPanel.getBackground().equals(c))
     {
        serialnum=InputCheck.TryConvertingStringtoInteger(serialNumberText.getText(), serialnum);
        if (serialnum==null)
        {
            Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, serialNumberLabel.getText().substring(0, serialNumberLabel.getText().length()-1) + "input must be a number!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, serialNumberLabel.getText().substring(0, serialNumberLabel.getText().length()) + " חייב להיות מספר!");
            serialNumberText.grabFocus();
        }
        else if (serialnum!=null && serialnum<=0)
        {
            Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, serialNumberLabel.getText().substring(0, serialNumberLabel.getText().length()-1) + "input must be a positive number!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
             JOptionPane.showMessageDialog(null, serialNumberLabel.getText().substring(0, serialNumberLabel.getText().length()) + " חייב להיות מספר חיובי!");   
            serialNumberText.grabFocus();
        }
        else if (serialnum!=null && serialnum>0)
        {
            typeserialnum=InputCheck.TryConvertingStringtoInteger(typeSerialNumberText.getText(), typeserialnum);
        if (typeserialnum==null)
        {
            Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, typeSerialNumberLabel.getText().substring(0, typeSerialNumberLabel.getText().length()-1) + "input must be a number!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, typeSerialNumberLabel.getText().substring(0, typeSerialNumberLabel.getText().length()) + " חייב להיות מספר!");    
            typeSerialNumberText.grabFocus();
        }
        else if (typeserialnum!=null && typeserialnum<=0)
        {
            Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, typeSerialNumberLabel.getText().substring(0, typeSerialNumberLabel.getText().length()-1) + "input must be a positive number!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, typeSerialNumberLabel.getText().substring(0, typeSerialNumberLabel.getText().length()) + " חייב להיות מספר חיובי!");  
            typeSerialNumberText.grabFocus();
        }
        else if (typeserialnum!=null && typeserialnum>0)
          {
              Object[] options = {"Yes","No"};
              Object[] hebOptions = {"כן","לא"};
            int n=0;
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Adding confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות הוספה",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);    
              if (n==0)
              {
            bool=view.controller.addProductionPlan(serialnum, typeserialnum);
            if (bool==true)
            {
                Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "Production Plan added successfully!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "תכנית היצור הוספה בהצלחה!");
            serialNumberText.setText("");
            typeSerialNumberText.setText("");
            }
            else
            {
                ProductionPlan pp=view.model.getProductionPlans().get(serialnum);
                ProductionPlanType ppt=view.model.getProductionPlanTypes().get(typeserialnum);
                if (pp!=null)
                {
                    Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
             JOptionPane.showMessageDialog(null, "Production Plan " + serialnum + " already exists!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "תכנית יצור " + serialnum + " כבר קיימת!");
                 serialNumberText.grabFocus();
                }
                else if (pp==null && ppt==null)
                {
                    Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
             JOptionPane.showMessageDialog(null, "Production Plan Type " + typeserialnum + " does not exist!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "סוג תכנית היצור " + typeserialnum + " אינו קיים!");
                 typeSerialNumberText.grabFocus();
                }   
            }
           }
          }
        }
     } 
            
    }//GEN-LAST:event_addPanelMouseClicked

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        serialNumberText.setText("");
        typeSerialNumberText.setText("");
    }//GEN-LAST:event_formComponentHidden
private void emptyFields(JTextField field, JTextField  fieldtwo, JPanel add){
             Color c=null;
             if (field.getText().isEmpty() || fieldtwo.getText().isEmpty())
             {
                 c=new Color(204,204,204);
                add.setBackground(c);
             }
                else
             {
                 c=new Color(0,102,102);
                add.setBackground(c);
             }
    }

    public JLabel getjLabel25() {
        return jLabel25;
    }

    public JLabel getSerialNumberLabel() {
        return serialNumberLabel;
    }

    public JLabel getTypeSerialNumberLabel() {
        return typeSerialNumberLabel;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addPanel;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel serialNumberLabel;
    private javax.swing.JTextField serialNumberText;
    private javax.swing.JLabel typeSerialNumberLabel;
    private javax.swing.JTextField typeSerialNumberText;
    // End of variables declaration//GEN-END:variables
}