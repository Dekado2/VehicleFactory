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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import view.InputCheck;
import view.UserMenu;
import view.ViewLogic;


/**
 *
 *
 */
public class FindShiftByTime extends javax.swing.JInternalFrame {
 private static ViewLogic view;
 private UserMenu um;
    /**
     * Creates new form FindShiftByTime1
     */
    public FindShiftByTime() {
        initComponents();
        view=ViewLogic.getInstance();
    }
    
     public FindShiftByTime(UserMenu um) {
        initComponents();
        view=ViewLogic.getInstance();
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
        shiftDateLabel = new javax.swing.JLabel();
        shiftDateText = new javax.swing.JTextField();
        run = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        tableLayeredPane.setVisible(false);
        tableLayeredPane.setEnabled(false);

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
        export.setText(bundle.getString("FindShiftByTime.export.text")); // NOI18N
        export.setToolTipText(bundle.getString("FindShiftByTime.export.toolTipText")); // NOI18N
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
                    .addComponent(resTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1062, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tableLayeredPaneLayout.createSequentialGroup()
                        .addGap(477, 477, 477)
                        .addComponent(export)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        tableLayeredPaneLayout.setVerticalGroup(
            tableLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayeredPaneLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(resTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(export))
        );

        shiftDateLabel.setText(bundle.getString("FindShiftByTime.shiftDateLabel.text")); // NOI18N
        shiftDateLabel.setToolTipText(bundle.getString("FindShiftByTime.shiftDateLabel.toolTipText")); // NOI18N

        shiftDateText.setToolTipText(bundle.getString("FindShiftByTime.shiftDateText.toolTipText")); // NOI18N
        shiftDateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftDateTextActionPerformed(evt);
            }
        });

        run.setText(bundle.getString("FindShiftByTime.run.text")); // NOI18N
        run.setToolTipText(bundle.getString("FindShiftByTime.run.toolTipText")); // NOI18N
        run.setEnabled(false);
        run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runActionPerformed(evt);
            }
        });
        run.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                runKeyPressed(evt);
            }
        });
        DocumentListener docListener = new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                emptyFields(shiftDateText,run);
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                emptyFields(shiftDateText,run);

            }
            @Override
            public void changedUpdate(DocumentEvent e) {
                emptyFields(shiftDateText,run);
            }
        };
        shiftDateText.getDocument().addDocumentListener(docListener);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tableLayeredPane)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(shiftDateLabel)
                .addGap(83, 83, 83)
                .addComponent(shiftDateText, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(run, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shiftDateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(shiftDateText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(run))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exportKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exportKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportKeyPressed

    private void exportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportActionPerformed
        try {
            String str=shiftDateText.getText();
            str=InputCheck.IllegalFileChars(str);
            view.writeCSVfile(resTable, "FindShiftByTime", str);
            view.ExportSuccess("FindShiftByTime", str,um.getLanguageComboBox());
        } catch (IOException ex) {
            view.ExportFailed(um.getLanguageComboBox());
        } catch (ClassNotFoundException ex) {
            view.ExportFailed(um.getLanguageComboBox());
        } catch (SQLException ex) {
            view.ExportFailed(um.getLanguageComboBox());
        }
    }//GEN-LAST:event_exportActionPerformed

    private void runKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_runKeyPressed
        int key=evt.getKeyCode();
        ActionEvent ae = new ActionEvent(evt.getSource(), evt.getID(), evt.paramString());
        if(key==KeyEvent.VK_ENTER && run.isEnabled())
        runActionPerformed(ae);
        run.getInputMap().put(KeyStroke.getKeyStroke("SPACE"), "none");
    }//GEN-LAST:event_runKeyPressed

    private void runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runActionPerformed
        String d=shiftDateText.getText();
        ClearTableRows();
        view.FindShiftByTimeQueryRun(d, resTable, tableLayeredPane,um.getLanguageComboBox());
    }//GEN-LAST:event_runActionPerformed

    private void shiftDateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftDateTextActionPerformed
        if (run.isEnabled())
        runActionPerformed(evt);
    }//GEN-LAST:event_shiftDateTextActionPerformed
private void emptyFields(JTextField manufacturerText ,JButton run){
             if (manufacturerText.getText().isEmpty())
                run.setEnabled(false);
             else
                run.setEnabled(true);
    }
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
private void languageOpening()
{
    if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              {
                  Locale l = new Locale("iw", "IL");
                  ResourceBundle r = ResourceBundle.getBundle("view.Reports/Bundle",l);
                  shiftDateLabel.setText(r.getString("FindShiftByTime.shiftDateLabel.text"));
                  shiftDateLabel.setToolTipText(r.getString("FindShiftByTime.shiftDateLabel.toolTipText"));
                  shiftDateText.setToolTipText(r.getString("FindShiftByTime.shiftDateText.toolTipText"));
                  export.setText(r.getString("FindShiftByTime.export.text"));
                  export.setToolTipText(r.getString("FindShiftByTime.export.toolTipText")); 
                  run.setText(r.getString("FindShiftByTime.run.text"));
                  hebTableHeaders();
              }
             else if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              {
                  Locale l = new Locale("en", "US");
                  ResourceBundle r = ResourceBundle.getBundle("view.Reports/Bundle",l);
                  shiftDateLabel.setText(r.getString("FindShiftByTime.shiftDateLabel.text"));
                  shiftDateLabel.setToolTipText(r.getString("FindShiftByTime.shiftDateLabel.toolTipText"));
                  shiftDateText.setToolTipText(r.getString("FindShiftByTime.shiftDateText.toolTipText"));
                  export.setText(r.getString("FindShiftByTime.export.text"));
                  export.setToolTipText(r.getString("FindShiftByTime.export.toolTipText")); 
                  run.setText(r.getString("FindShiftByTime.run.text"));
                  engTableHeaders();
              }
}

private void languageActionPerformed(java.awt.event.ActionEvent evt) {  
    if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              {
                  Locale l = new Locale("iw", "IL");
                  ResourceBundle r = ResourceBundle.getBundle("view.Reports/Bundle",l);
                  shiftDateLabel.setText(r.getString("FindShiftByTime.shiftDateLabel.text"));
                  shiftDateLabel.setToolTipText(r.getString("FindShiftByTime.shiftDateLabel.toolTipText"));
                  shiftDateText.setToolTipText(r.getString("FindShiftByTime.shiftDateText.toolTipText"));
                  export.setText(r.getString("FindShiftByTime.export.text"));
                  export.setToolTipText(r.getString("FindShiftByTime.export.toolTipText")); 
                  run.setText(r.getString("FindShiftByTime.run.text"));
                  hebTableHeaders();
        this.setTitle("מצא משמרת לפי זמן");
        resTable.setAutoResizeMode(2);
        
              }
             else if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              {
                  Locale l = new Locale("en", "US");
                  ResourceBundle r = ResourceBundle.getBundle("view.Reports/Bundle",l);
                  shiftDateLabel.setText(r.getString("FindShiftByTime.shiftDateLabel.text"));
                  shiftDateLabel.setToolTipText(r.getString("FindShiftByTime.shiftDateLabel.toolTipText"));
                  shiftDateText.setToolTipText(r.getString("FindShiftByTime.shiftDateText.toolTipText"));
                  export.setText(r.getString("FindShiftByTime.export.text"));
                  export.setToolTipText(r.getString("FindShiftByTime.export.toolTipText")); 
                  run.setText(r.getString("FindShiftByTime.run.text"));
                  engTableHeaders();
        this.setTitle("Find Shift By Time");
        resTable.setAutoResizeMode(2);
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
    private javax.swing.JButton run;
    private javax.swing.JLabel shiftDateLabel;
    private javax.swing.JTextField shiftDateText;
    private javax.swing.JLayeredPane tableLayeredPane;
    // End of variables declaration//GEN-END:variables
}
