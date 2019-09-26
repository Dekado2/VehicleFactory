/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.MyPanels.show;

import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import view.InputCheck;
import view.UserMenu;
import view.ViewLogic;

/**
 *
 *
 */
public class ShowShifts extends javax.swing.JPanel {
private static ViewLogic view;
private UserMenu um;
    /**
     * Creates new form ShowShifts
     */
    public ShowShifts(UserMenu um) {
        initComponents();
        view=ViewLogic.getInstance();
        this.um=um;
        view.ShowDataShifts(resTable,um.getLanguageComboBox());
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
        manageSlots = new javax.swing.JButton();

        setBackground(new java.awt.Color(235, 255, 255));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        resTable.setAutoCreateRowSorter(true);
        resTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Starting Time", "Shift Manager ID", "Shift Manager Name", "Shift Manager Country", "Shift Manager City", "Shift Manager Street", "Shift Manager House Number", "Shift Manager ZIP Code", "Shift Manager Birthday", "Shift Manager Employment Date", "Hourly Wage", "Extra Wage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
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

        tableLayeredPane.setLayer(resTableScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout tableLayeredPaneLayout = new javax.swing.GroupLayout(tableLayeredPane);
        tableLayeredPane.setLayout(tableLayeredPaneLayout);
        tableLayeredPaneLayout.setHorizontalGroup(
            tableLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayeredPaneLayout.createSequentialGroup()
                .addComponent(resTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        tableLayeredPaneLayout.setVerticalGroup(
            tableLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resTableScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
        );

        remove.setBackground(new java.awt.Color(0, 102, 102));
        remove.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        remove.setForeground(new java.awt.Color(255, 255, 255));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("view/MyPanels/show/Bundle"); // NOI18N
        remove.setText(bundle.getString("ShowShifts.remove.text")); // NOI18N
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });

        update.setBackground(new java.awt.Color(0, 102, 102));
        update.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText(bundle.getString("ShowShifts.update.text")); // NOI18N

        manageSlots.setBackground(new java.awt.Color(0, 102, 102));
        manageSlots.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        manageSlots.setForeground(new java.awt.Color(255, 255, 255));
        manageSlots.setText(bundle.getString("ShowShifts.manageSlots.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tableLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(remove)
                .addGap(117, 117, 117)
                .addComponent(manageSlots)
                .addGap(113, 113, 113))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remove)
                    .addComponent(update)
                    .addComponent(manageSlots))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        view.ShowDataShifts(resTable,um.getLanguageComboBox());
    }//GEN-LAST:event_formComponentShown

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        boolean bool=false;
        if (resTable.getSelectedRow()==-1){
            Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a shift from the table!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "עליך לבחור משמרת מהרשימה!");
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
            String str=resTable.getValueAt(resTable.getSelectedRow(), 0).toString();
            Date d=InputCheck.TryConvertingStringtoDateTwo(str);
            Calendar cal=InputCheck.CalendarGetTimeDate(d);
            if (d==null || cal==null){
                Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
                JOptionPane.showMessageDialog(null, "Invalid Date!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "תאריך שגוי!");
            }
            else
            {
              bool=view.controller.removeShift(cal);
              if (bool==true)
              {
                  Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
                  JOptionPane.showMessageDialog(null, "Shift removed successfully!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "המשמרת הוסרה בהצלחה!");
                  view.ShowDataShifts(resTable,um.getLanguageComboBox());
              }
              else{
                  Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
                  JOptionPane.showMessageDialog(null, "                            Shift was not removed!\n Please make sure that no workers are working in this shift!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "המשמרת לא הוסרה!              \n אנא ודא כי אין עובדים העובדים במשמרת זו!");
              }
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

    public JButton getManageSlots() {
        return manageSlots;
    }

    public JButton getRemove() {
        return remove;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton manageSlots;
    private javax.swing.JButton remove;
    private javax.swing.JTable resTable;
    private javax.swing.JScrollPane resTableScrollPane;
    private javax.swing.JLayeredPane tableLayeredPane;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}