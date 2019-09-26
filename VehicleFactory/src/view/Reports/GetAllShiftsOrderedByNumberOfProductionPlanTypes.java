/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Reports;

import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import view.UserMenu;
import view.ViewLogic;

/**
 *
 *
 */
public class GetAllShiftsOrderedByNumberOfProductionPlanTypes extends javax.swing.JInternalFrame {
    private static ViewLogic view;
    private UserMenu um;
    /**
     * Creates new form GetAllWarehousesInManufacturerCountry
     */
    public GetAllShiftsOrderedByNumberOfProductionPlanTypes() {
        initComponents();
        view=ViewLogic.getInstance();
        ClearTableRows();
        view.GetAllShiftsOrderedByNumberOfProductionPlanTypesQueryRun(resTable,tableLayeredPane,um.getLanguageComboBox());
    }

     public GetAllShiftsOrderedByNumberOfProductionPlanTypes(UserMenu um) {
        initComponents();
        view=ViewLogic.getInstance();
        ClearTableRows();
        view.GetAllShiftsOrderedByNumberOfProductionPlanTypesQueryRun(resTable,tableLayeredPane,um.getLanguageComboBox());
        this.um=um;
        languageOpening();
         um.getLanguageComboBox().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             languageActionPerformed(evt);
         }
  });
          
    }
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the
     * Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tableLayeredPane = new javax.swing.JLayeredPane();
        resTableScrollPane = new javax.swing.JScrollPane();
        resTable = new javax.swing.JTable();
        export = new javax.swing.JButton();

        setBackground(new java.awt.Color(235, 255, 255));
        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

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
        resTable.getTableHeader().setReorderingAllowed(false);
        resTableScrollPane.setViewportView(resTable);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("view/Reports/Bundle"); // NOI18N
        if (resTable.getColumnModel().getColumnCount() > 0) {
            resTable.getColumnModel().getColumn(0).setPreferredWidth(40);
            resTable.getColumnModel().getColumn(0).setHeaderValue(bundle.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.resTable.columnModel.title0")); // NOI18N
            resTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            resTable.getColumnModel().getColumn(1).setHeaderValue(bundle.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.resTable.columnModel.title1")); // NOI18N
            resTable.getColumnModel().getColumn(2).setPreferredWidth(60);
            resTable.getColumnModel().getColumn(2).setHeaderValue(bundle.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.resTable.columnModel.title2")); // NOI18N
            resTable.getColumnModel().getColumn(3).setPreferredWidth(70);
            resTable.getColumnModel().getColumn(3).setHeaderValue(bundle.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.resTable.columnModel.title3")); // NOI18N
            resTable.getColumnModel().getColumn(4).setPreferredWidth(50);
            resTable.getColumnModel().getColumn(4).setHeaderValue(bundle.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.resTable.columnModel.title4")); // NOI18N
            resTable.getColumnModel().getColumn(5).setPreferredWidth(55);
            resTable.getColumnModel().getColumn(5).setHeaderValue(bundle.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.resTable.columnModel.title5")); // NOI18N
            resTable.getColumnModel().getColumn(6).setHeaderValue(bundle.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.resTable.columnModel.title6")); // NOI18N
            resTable.getColumnModel().getColumn(7).setPreferredWidth(75);
            resTable.getColumnModel().getColumn(7).setHeaderValue(bundle.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.resTable.columnModel.title7")); // NOI18N
            resTable.getColumnModel().getColumn(8).setPreferredWidth(75);
            resTable.getColumnModel().getColumn(8).setHeaderValue(bundle.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.resTable.columnModel.title8")); // NOI18N
            resTable.getColumnModel().getColumn(9).setHeaderValue(bundle.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.resTable.columnModel.title9")); // NOI18N
            resTable.getColumnModel().getColumn(10).setPreferredWidth(15);
            resTable.getColumnModel().getColumn(10).setHeaderValue(bundle.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.resTable.columnModel.title10")); // NOI18N
            resTable.getColumnModel().getColumn(11).setPreferredWidth(15);
            resTable.getColumnModel().getColumn(11).setHeaderValue(bundle.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.resTable.columnModel.title11")); // NOI18N
        }

        export.setText(bundle.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.export.text")); // NOI18N
        export.setToolTipText(bundle.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.export.toolTipText")); // NOI18N
        export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportActionPerformed(evt);
            }
        });
        export.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exportKeyPressed(evt);
            }
        });

        tableLayeredPane.setLayer(resTableScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        tableLayeredPane.setLayer(export, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout tableLayeredPaneLayout = new javax.swing.GroupLayout(tableLayeredPane);
        tableLayeredPane.setLayout(tableLayeredPaneLayout);
        tableLayeredPaneLayout.setHorizontalGroup(
            tableLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(resTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
            .addGroup(tableLayeredPaneLayout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addComponent(export)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tableLayeredPaneLayout.setVerticalGroup(
            tableLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(export)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resTableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableLayeredPane)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(tableLayeredPane)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        try {
            view.writeCSVfile(resTable, "GetAllShiftsOrderedByNumberOfProductionPlanTypes", "");
            view.ExportSuccess("GetAllShiftsOrderedByNumberOfProductionPlanTypes", "",um.getLanguageComboBox());
        } catch (IOException ex) {
            view.ExportFailed(um.getLanguageComboBox());
        } catch (ClassNotFoundException ex) {
            view.ExportFailed(um.getLanguageComboBox());
        } catch (SQLException ex) {
            view.ExportFailed(um.getLanguageComboBox());
        }
    }//GEN-LAST:event_exportActionPerformed

    private void exportKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exportKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportKeyPressed

    /**
     * @param args the command line arguments
     */
private void ClearTableRows()
{
    DefaultTableModel dm = (DefaultTableModel) resTable.getModel();
        int rowCount = dm.getRowCount();
        for (int i=rowCount-1; i>=0 ; i--)
            dm.removeRow(i);
}
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
            java.util.logging.Logger.getLogger(GetAllShiftsOrderedByNumberOfProductionPlanTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetAllShiftsOrderedByNumberOfProductionPlanTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetAllShiftsOrderedByNumberOfProductionPlanTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetAllShiftsOrderedByNumberOfProductionPlanTypes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetAllShiftsOrderedByNumberOfProductionPlanTypes().setVisible(true);
            }
        });
    }

    private void languageOpening()
{
    if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              {
                  Locale l = new Locale("iw", "IL");
                  ResourceBundle r = ResourceBundle.getBundle("view.Reports/Bundle",l);
                  export.setText(r.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.export.text"));
                  export.setToolTipText(r.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.export.toolTipText")); 
                  hebTableHeaders();
              }
             else if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              {
                  Locale l = new Locale("en", "US");
                  ResourceBundle r = ResourceBundle.getBundle("view.Reports/Bundle",l);
                  export.setText(r.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.export.text"));
                  export.setToolTipText(r.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.export.toolTipText")); 
                  engTableHeaders();
              }
}

    private void languageActionPerformed(java.awt.event.ActionEvent evt) {  
    if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              {
                  Locale l = new Locale("iw", "IL");
                  ResourceBundle r = ResourceBundle.getBundle("view.Reports/Bundle",l);
                  export.setText(r.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.export.text"));
                  export.setToolTipText(r.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.export.toolTipText")); 
                  hebTableHeaders();
                  ClearTableRows();
        view.GetAllShiftsOrderedByNumberOfProductionPlanTypesQueryRun(resTable,tableLayeredPane,um.getLanguageComboBox());
        this.setTitle("השג את כל המשמרות ממויינות לפי כמות סוגי תכניות היצור");
              }
             else if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              {
                  Locale l = new Locale("en", "US");
                  ResourceBundle r = ResourceBundle.getBundle("view.Reports/Bundle",l);
                  export.setText(r.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.export.text"));
                  export.setToolTipText(r.getString("GetAllShiftsOrderedByNumberOfProductionPlanTypes.export.toolTipText")); 
                  engTableHeaders();
                  ClearTableRows();
        view.GetAllShiftsOrderedByNumberOfProductionPlanTypesQueryRun(resTable,tableLayeredPane,um.getLanguageComboBox());
        this.setTitle("Get All Shifts Ordered By Number of Production Plan Types");
              }
}
 
 private void engTableHeaders()
{
    String[]engHeaders={"Starting Time","Shift Manager ID","Shift Manager Name", "Shift Manager Country", "Shift Manager City" , "Shift Manager Street" , "Shift Manager House Number", "Shift Manager ZIP Code", "Shift Manager Birthday", "Shift Manager Employment Date", "Hourly Wage" , "Extra Wage"};
    for (int i=0;i<engHeaders.length;i++)
    resTable.getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeaders[i]);
}

private void hebTableHeaders()
{
    String[]hebHeaders={"תחילת המשמרת","מספר מנהל המשמרת","שם מנהל המשמרת", "מדינת מנהל המשמרת", "עיר מנהל המשמרת" , "רחוב מנהל המשמרת" , "מספר בית מנהל המשמרת", "מיקוד מנהל המשמרת", "תאריך הלידה של מנהל המשמרת", "תאריך תחילת ההעסקה של מנהל המשמרת", "שכר שעתי" , "שכר בונוס"};
    for (int i=0;i<hebHeaders.length;i++)
    resTable.getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeaders[i]);
}   
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton export;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable resTable;
    private javax.swing.JScrollPane resTableScrollPane;
    private javax.swing.JLayeredPane tableLayeredPane;
    // End of variables declaration//GEN-END:variables
}