/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.MyPanels;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.MyPanels.show.ShowEmployees;
import view.UserMenu;
import view.ViewLogic;

/**
 *
 *
 */
public class lockPanel extends javax.swing.JPanel {
   private static ViewLogic view;
    /**
     * Creates new form lockPanel
     */
    public lockPanel() {
        initComponents();
        view=ViewLogic.getInstance();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        updateEmployeesComboBox = new javax.swing.JComboBox<>();
        updateEmployeeLabel = new javax.swing.JLabel();
        updateOrdersLabel = new javax.swing.JLabel();
        updateOrdersComboBox = new javax.swing.JComboBox<>();
        addEmployeesLabel = new javax.swing.JLabel();
        addEmployeesComboBox = new javax.swing.JComboBox<>();
        addOrdersComboBox = new javax.swing.JComboBox<>();
        addOrdersLabel = new javax.swing.JLabel();
        addShiftsLabel = new javax.swing.JLabel();
        addShiftsComboBox = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(235, 255, 255));

        updateEmployeesComboBox.setBackground(new java.awt.Color(235, 255, 255));
        updateEmployeesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enabled", "Disabled" }));

        updateEmployeeLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("view/MyPanels/Bundle"); // NOI18N
        updateEmployeeLabel.setText(bundle.getString("lockPanel.updateEmployeeLabel.text")); // NOI18N

        updateOrdersLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateOrdersLabel.setText(bundle.getString("lockPanel.updateOrdersLabel.text")); // NOI18N

        updateOrdersComboBox.setBackground(new java.awt.Color(235, 255, 255));
        updateOrdersComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enabled", "Disabled" }));

        addEmployeesLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addEmployeesLabel.setText(bundle.getString("lockPanel.addEmployeesLabel.text")); // NOI18N

        addEmployeesComboBox.setBackground(new java.awt.Color(235, 255, 255));
        addEmployeesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enabled", "Disabled" }));

        addOrdersComboBox.setBackground(new java.awt.Color(235, 255, 255));
        addOrdersComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enabled", "Disabled" }));

        addOrdersLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addOrdersLabel.setText(bundle.getString("lockPanel.addOrdersLabel.text")); // NOI18N

        addShiftsLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addShiftsLabel.setText(bundle.getString("lockPanel.addShiftsLabel.text")); // NOI18N

        addShiftsComboBox.setBackground(new java.awt.Color(235, 255, 255));
        addShiftsComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enabled", "Disabled" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addEmployeesLabel)
                            .addComponent(addOrdersLabel)
                            .addComponent(addShiftsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(addShiftsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(addEmployeesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addOrdersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateEmployeeLabel)
                            .addComponent(updateOrdersLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateEmployeesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateOrdersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateEmployeesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateEmployeeLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateOrdersLabel)
                    .addComponent(updateOrdersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addEmployeesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addEmployeesLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addOrdersLabel)
                    .addComponent(addOrdersComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addShiftsLabel)
                    .addComponent(addShiftsComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );
    }// </editor-fold>//GEN-END:initComponents
void setColor(JButton p){
    p.setBackground(new Color(204,204,204));
}
void resetColor(JButton p){
    p.setBackground(new Color(0,102,102));
}

    public JComboBox<String> getjComboBoxAddOrders() {
        return addOrdersComboBox;
    }

    public JComboBox<String> getjComboBoxAddShifts() {
        return addShiftsComboBox;
    }

    public JComboBox<String> getjComboBoxEmployees() {
        return updateEmployeesComboBox;
    }

    public JComboBox<String> getjComboBoxOrders() {
        return updateOrdersComboBox;
    }

    public JComboBox<String> getjComboBoxaddEmployees() {
        return addEmployeesComboBox;
    }

    public JLabel getAddEmployeesLabel() {
        return addEmployeesLabel;
    }

    public JLabel getAddOrdersLabel() {
        return addOrdersLabel;
    }

    public JLabel getAddShiftsLabel() {
        return addShiftsLabel;
    }

    public JLabel getUpdateEmployeeLabel() {
        return updateEmployeeLabel;
    }

    public JLabel getUpdateOrdersLabel() {
        return updateOrdersLabel;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addEmployeesComboBox;
    private javax.swing.JLabel addEmployeesLabel;
    private javax.swing.JComboBox<String> addOrdersComboBox;
    private javax.swing.JLabel addOrdersLabel;
    private javax.swing.JComboBox<String> addShiftsComboBox;
    private javax.swing.JLabel addShiftsLabel;
    private javax.swing.JLabel updateEmployeeLabel;
    private javax.swing.JComboBox<String> updateEmployeesComboBox;
    private javax.swing.JComboBox<String> updateOrdersComboBox;
    private javax.swing.JLabel updateOrdersLabel;
    // End of variables declaration//GEN-END:variables
}