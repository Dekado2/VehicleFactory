/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.MyPanels.show;

import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import view.UserMenu;
import view.ViewLogic;

/**
 *
 *
 */
public class ShowWorkstations extends javax.swing.JPanel {
private static ViewLogic view;
private UserMenu um;
    /**
     * Creates new form ShowWorkstations
     */
    public ShowWorkstations(UserMenu um) {
        initComponents();
        view=ViewLogic.getInstance();
        this.um=um;
        view.ShowDataWorkStations(resTable,um.getLanguageComboBox());
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the
     * Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tableLayeredPane = new javax.swing.JLayeredPane();
        resTableScrollPane = new javax.swing.JScrollPane();
        resTable = new javax.swing.JTable();
        remove = new javax.swing.JButton();
        update = new javax.swing.JButton();

        setBackground(new java.awt.Color(235, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        tableLayeredPane.setBackground(new java.awt.Color(235, 255, 255));

        resTable.setAutoCreateRowSorter(true);
        resTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Station Number", "Category"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        resTable.setSelectionBackground(new java.awt.Color(76, 188, 188));
        resTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        resTable.getTableHeader().setReorderingAllowed(false);
        resTableScrollPane.setViewportView(resTable);

        remove.setBackground(new java.awt.Color(0, 102, 102));
        remove.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        remove.setForeground(new java.awt.Color(255, 255, 255));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("view/MyPanels/show/Bundle"); // NOI18N
        remove.setText(bundle.getString("ShowWorkstations.remove.text")); // NOI18N
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(0, 102, 102));
        update.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText(bundle.getString("ShowWorkstations.update.text")); // NOI18N

        tableLayeredPane.setLayer(resTableScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        tableLayeredPane.setLayer(remove, javax.swing.JLayeredPane.DEFAULT_LAYER);
        tableLayeredPane.setLayer(update, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout tableLayeredPaneLayout = new javax.swing.GroupLayout(tableLayeredPane);
        tableLayeredPane.setLayout(tableLayeredPaneLayout);
        tableLayeredPaneLayout.setHorizontalGroup(
            tableLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayeredPaneLayout.createSequentialGroup()
                .addContainerGap(69, Short.MAX_VALUE)
                .addGroup(tableLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayeredPaneLayout.createSequentialGroup()
                        .addComponent(resTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayeredPaneLayout.createSequentialGroup()
                        .addComponent(update)
                        .addGap(161, 161, 161)
                        .addComponent(remove)
                        .addGap(252, 252, 252))))
        );
        tableLayeredPaneLayout.setVerticalGroup(
            tableLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayeredPaneLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(tableLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remove)
                    .addComponent(update))
                .addGap(18, 18, 18)
                .addComponent(resTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableLayeredPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tableLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        view.ShowDataWorkStations(resTable,um.getLanguageComboBox());
    }//GEN-LAST:event_formComponentShown

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        boolean bool=false;
        if (resTable.getSelectedRow()==-1){
             Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a workstation from the table!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "עליך לבחור תחנת עבודה מהטבלה!");
        }
        else
        {
            Object[] options = {"Yes","No"};
              Object[] hebOptions = {"כן","לא"};
            int n=0;
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Removing confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות הסרה",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
              if (n==0)
              {
            bool=view.controller.removeWorkStation((int) resTable.getValueAt(resTable.getSelectedRow(), 0));
              if (bool==true)
              {
                  Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
                  JOptionPane.showMessageDialog(null, "Workstation removed successfully!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "תחנת העבודה הוסרה בהצלחה!");
                  view.ShowDataWorkStations(resTable,um.getLanguageComboBox());
              }
              else{
                  Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
                  JOptionPane.showMessageDialog(null, "                                                    Workstation was not removed!\n Please make sure that no worker can work on it and that it isn't in any production plan types!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "תחנת העבודה לא הוסרה!                                     \n אנא ודא כי אין עובד שיכול לעבוד עליה ושאין שום סוג תכנית יצור המכיל אותה!");
              }
              }
        }
    }//GEN-LAST:event_removeActionPerformed

    public JTable getResTable() {
        return resTable;
    }

    public JButton getUpdate() {
        return update;
        
    }

    public JButton getRemove() {
        return remove;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton remove;
    private javax.swing.JTable resTable;
    private javax.swing.JScrollPane resTableScrollPane;
    private javax.swing.JLayeredPane tableLayeredPane;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}