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
public class GetMostProfitableManufacturer extends javax.swing.JInternalFrame {
    private static ViewLogic view;
    private UserMenu um;
    /**
     * Creates new form GetAllWarehousesInManufacturerCountry
     */
    public GetMostProfitableManufacturer() {
        initComponents();
        view=ViewLogic.getInstance();
        ClearTableRows();
        view.GetMostProfitableManufacturerQueryRun(resTable,tableLayeredPane,um.getLanguageComboBox());
    }

    public GetMostProfitableManufacturer(UserMenu um) {
        initComponents();
        view=ViewLogic.getInstance();
        ClearTableRows();
        view.GetMostProfitableManufacturerQueryRun(resTable,tableLayeredPane,um.getLanguageComboBox());
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

        resTable.setAutoCreateRowSorter(true);
        resTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Manufacturer Name", "Country", "City", "Street", "House Number", "ZIP Code", "Profit Percentage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
        export.setText(bundle.getString("GetMostProfitableManufacturer.export.text")); // NOI18N
        export.setToolTipText(bundle.getString("GetMostProfitableManufacturer.export.toolTipText")); // NOI18N
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
            .addGroup(tableLayeredPaneLayout.createSequentialGroup()
                .addGroup(tableLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tableLayeredPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(resTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1014, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tableLayeredPaneLayout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(export)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tableLayeredPaneLayout.setVerticalGroup(
            tableLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayeredPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(resTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(export)
                .addGap(28, 28, 28))
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
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(tableLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        try {
            view.writeCSVfile(resTable, "GetMostProfitableManufacturer", "");
            view.ExportSuccess("GetMostProfitableManufacturer", "",um.getLanguageComboBox());
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
            java.util.logging.Logger.getLogger(GetMostProfitableManufacturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetMostProfitableManufacturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetMostProfitableManufacturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetMostProfitableManufacturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetMostProfitableManufacturer().setVisible(true);
            }
        });
    }

    private void languageOpening()
{
    if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              {
                  Locale l = new Locale("iw", "IL");
                  ResourceBundle r = ResourceBundle.getBundle("view.Reports/Bundle",l);
                  export.setText(r.getString("GetMostProfitableManufacturer.export.text"));
                  export.setToolTipText(r.getString("GetMostProfitableManufacturer.export.toolTipText")); 
                  hebTableHeaders();
              }
             else if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              {
                  Locale l = new Locale("en", "US");
                  ResourceBundle r = ResourceBundle.getBundle("view.Reports/Bundle",l);
                  export.setText(r.getString("GetMostProfitableManufacturer.export.text"));
                  export.setToolTipText(r.getString("GetMostProfitableManufacturer.export.toolTipText")); 
                  engTableHeaders();
              }
}
    
    private void languageActionPerformed(java.awt.event.ActionEvent evt) {  
     if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              {
                  Locale l = new Locale("iw", "IL");
                  ResourceBundle r = ResourceBundle.getBundle("view.Reports/Bundle",l);
                  export.setText(r.getString("GetMostProfitableManufacturer.export.text"));
                  export.setToolTipText(r.getString("GetMostProfitableManufacturer.export.toolTipText")); 
                  hebTableHeaders();
                  ClearTableRows();
        view.GetMostProfitableManufacturerQueryRun(resTable,tableLayeredPane,um.getLanguageComboBox());
        this.setTitle("הצג את היצרן הכי רווחי");
              }
             else if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              {
                  Locale l = new Locale("en", "US");
                  ResourceBundle r = ResourceBundle.getBundle("view.Reports/Bundle",l);
                  export.setText(r.getString("GetMostProfitableManufacturer.export.text"));
                  export.setToolTipText(r.getString("GetMostProfitableManufacturer.export.toolTipText")); 
                  engTableHeaders();
                  ClearTableRows();
        view.GetMostProfitableManufacturerQueryRun(resTable,tableLayeredPane,um.getLanguageComboBox());
        this.setTitle("Get Most Profitable Manufacturer");
              }
}
    
    private void engTableHeaders()
{
    String[]engHeaders={"Manufacturer Name", "Country" , "City", "Street", "House Number", "ZIP Code", "Profit Percentage"};
    for (int i=0;i<engHeaders.length;i++)
    resTable.getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeaders[i]);
}

private void hebTableHeaders()
{
    String[]hebHeaders={"שם היצרן", "מדינה" , "עיר", "רחוב", "מספר בית", "מיקוד", "אחוז רווח"};
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
