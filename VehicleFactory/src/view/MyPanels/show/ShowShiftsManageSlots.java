/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.MyPanels.show;

import java.awt.Toolkit;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import view.InputCheck;
import view.UserMenu;
import view.ViewLogic;

/**
 *
 *
 */
public class ShowShiftsManageSlots extends javax.swing.JPanel {
private static ViewLogic view1;
private Calendar startingTime;
private UserMenu um;

    /**
     * Creates new form ShowEmployeesMore
     */
    public ShowShiftsManageSlots(UserMenu um) {
        initComponents();
        view1=ViewLogic.getInstance();
        this.um=um;
        tableLayered_ProductionPlan.setVisible(false);
        icon_plus.setVisible(false);
        icon_remove.setVisible(false);
        tableLayered_Slot.setVisible(false);
        Add_btn1.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        choiceComboBox = new javax.swing.JComboBox<>();
        tableLayered_ProductionPlan = new javax.swing.JLayeredPane();
        resTableScrollPane = new javax.swing.JScrollPane();
        productionPlanTable = new javax.swing.JTable();
        tableLayered_Slot = new javax.swing.JLayeredPane();
        resTableScrollPane1 = new javax.swing.JScrollPane();
        slotTable = new javax.swing.JTable();
        Add_btn1 = new javax.swing.JPanel();
        btn_name = new javax.swing.JLabel();
        icon_plus = new javax.swing.JLabel();
        icon_remove = new javax.swing.JLabel();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                formComponentHidden(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(235, 255, 255));

        choiceComboBox.setBackground(new java.awt.Color(0, 102, 102));
        choiceComboBox.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        choiceComboBox.setForeground(new java.awt.Color(255, 255, 255));
        choiceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose one option", "Add Slot", "Remove Slot" }));
        choiceComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choiceComboBoxItemStateChanged(evt);
            }
        });
        choiceComboBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                choiceComboBoxMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                choiceComboBoxMouseReleased(evt);
            }
        });
        choiceComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choiceComboBoxActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(choiceComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(choiceComboBox, 0, 272, Short.MAX_VALUE)
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(choiceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );

        productionPlanTable.setAutoCreateRowSorter(true);
        productionPlanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Production Plan - Serial Number", "Production Plan Type - Serial Number", "Production Plan Types - Number of Slots"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productionPlanTable.setSelectionBackground(new java.awt.Color(76, 188, 188));
        productionPlanTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        productionPlanTable.getTableHeader().setReorderingAllowed(false);
        resTableScrollPane.setViewportView(productionPlanTable);

        tableLayered_ProductionPlan.setLayer(resTableScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout tableLayered_ProductionPlanLayout = new javax.swing.GroupLayout(tableLayered_ProductionPlan);
        tableLayered_ProductionPlan.setLayout(tableLayered_ProductionPlanLayout);
        tableLayered_ProductionPlanLayout.setHorizontalGroup(
            tableLayered_ProductionPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayered_ProductionPlanLayout.createSequentialGroup()
                .addComponent(resTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        tableLayered_ProductionPlanLayout.setVerticalGroup(
            tableLayered_ProductionPlanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tableLayered_ProductionPlanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resTableScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        slotTable.setAutoCreateRowSorter(true);
        slotTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Slot - Starting Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        slotTable.setSelectionBackground(new java.awt.Color(76, 188, 188));
        slotTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        slotTable.getTableHeader().setReorderingAllowed(false);
        resTableScrollPane1.setViewportView(slotTable);

        tableLayered_Slot.setLayer(resTableScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout tableLayered_SlotLayout = new javax.swing.GroupLayout(tableLayered_Slot);
        tableLayered_Slot.setLayout(tableLayered_SlotLayout);
        tableLayered_SlotLayout.setHorizontalGroup(
            tableLayered_SlotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayered_SlotLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(resTableScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );
        tableLayered_SlotLayout.setVerticalGroup(
            tableLayered_SlotLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tableLayered_SlotLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resTableScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        Add_btn1.setBackground(new java.awt.Color(0, 102, 102));
        Add_btn1.setForeground(new java.awt.Color(255, 255, 255));
        Add_btn1.setPreferredSize(new java.awt.Dimension(202, 50));
        Add_btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Add_btn1MouseClicked(evt);
            }
        });

        btn_name.setFont(new java.awt.Font("Aharoni", 0, 24)); // NOI18N
        btn_name.setForeground(new java.awt.Color(255, 255, 255));
        btn_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        icon_plus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/001-signs.png"))); // NOI18N
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("view/MyPanels/show/Bundle"); // NOI18N
        icon_plus.setText(bundle.getString("ShowShiftsManageSlots.icon_plus.text")); // NOI18N

        icon_remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/003-interface.png"))); // NOI18N
        icon_remove.setText(bundle.getString("ShowShiftsManageSlots.icon_remove.text")); // NOI18N

        javax.swing.GroupLayout Add_btn1Layout = new javax.swing.GroupLayout(Add_btn1);
        Add_btn1.setLayout(Add_btn1Layout);
        Add_btn1Layout.setHorizontalGroup(
            Add_btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_btn1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(icon_remove)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_name, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(icon_plus)
                .addContainerGap())
        );
        Add_btn1Layout.setVerticalGroup(
            Add_btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Add_btn1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Add_btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Add_btn1Layout.createSequentialGroup()
                        .addComponent(btn_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(Add_btn1Layout.createSequentialGroup()
                        .addComponent(icon_plus, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addGap(15, 15, 15))
                    .addGroup(Add_btn1Layout.createSequentialGroup()
                        .addComponent(icon_remove, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tableLayered_ProductionPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(tableLayered_Slot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 164, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Add_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(246, 246, 246))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tableLayered_ProductionPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tableLayered_Slot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Add_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void choiceComboBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choiceComboBoxMousePressed
   

    }//GEN-LAST:event_choiceComboBoxMousePressed

    private void choiceComboBoxMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choiceComboBoxMouseReleased

    }//GEN-LAST:event_choiceComboBoxMouseReleased

    private void choiceComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choiceComboBoxItemStateChanged
           
    }//GEN-LAST:event_choiceComboBoxItemStateChanged

    private void formComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentHidden
        choiceComboBox.setSelectedIndex(0);
        slotTable.clearSelection();
        productionPlanTable.clearSelection();
    }//GEN-LAST:event_formComponentHidden

    private void Add_btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Add_btn1MouseClicked
        Calendar c;Date date;
        if((btn_name.getText().equals("Remove") && choiceComboBox.getSelectedItem().equals("Remove Slot")) || (btn_name.getText().equals("הסר") && choiceComboBox.getSelectedItem().equals("הסר סלוט"))){
            boolean bool=false;
            
            if (slotTable.getSelectedRow()==-1 ){
                Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a slot from the table!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "עליך לבחור סלוט מהטבלה!");
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
                    String str=slotTable.getValueAt(slotTable.getSelectedRow(), 0).toString();
                    date=InputCheck.TryConvertingStringtoDateTwo(str);
                    c=InputCheck.CalendarGetTimeDate(date);
                    bool=view1.controller.removeSlot(c);
                    if (bool==true)
                    {
                        Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
                        JOptionPane.showMessageDialog(null, "Slot removed successfully!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "הסלוט הוסר בהצלחה!");
                        view1.RemoveSlot(slotTable, startingTime,um.getLanguageComboBox());

                    }
                    else{
                        Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
                    JOptionPane.showMessageDialog(null, "Slot was not removed!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "הסלוט לא הוסר!");
                    }
                }
            }
        }
        else if((btn_name.getText().equals("Add") && choiceComboBox.getSelectedItem().equals("Add Slot")) || (btn_name.getText().equals("הוסף") && choiceComboBox.getSelectedItem().equals("הוסף סלוט"))){
            boolean bool=false;
            if (slotTable.getSelectedRow()==-1 && productionPlanTable.getSelectedRow()!=-1){
                Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
               JOptionPane.showMessageDialog(null, "You must select a slot from the slots table!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "עליך לבחור סלוט מטבלת הסלוטים!");
            }
            else if (slotTable.getSelectedRow()!=-1 && productionPlanTable.getSelectedRow()==-1){
                Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
               JOptionPane.showMessageDialog(null, "You must select a production plan from the production plans table!");  
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "עליך לבחור תכנית יצור מטבלת תוכניות היצור!"); 
            }
            else if (slotTable.getSelectedRow()==-1 && productionPlanTable.getSelectedRow()==-1){
                Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
               JOptionPane.showMessageDialog(null, "You must select a slot and a production plan!");  
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "עליך לבחור סלוט ותכנית יצור!"); 
            }
            else if (slotTable.getSelectedRow()!=-1 && productionPlanTable.getSelectedRow()!=-1)
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
                    String str=slotTable.getValueAt(slotTable.getSelectedRow(), 0).toString();
                    date=InputCheck.TryConvertingStringtoDateTwo(str);
                    c=InputCheck.CalendarGetTimeDate(date);
                    bool=view1.controller.addSlot(c,(Integer) productionPlanTable.getValueAt(productionPlanTable.getSelectedRow(), 0));
                    if (bool==true)
                    {
                        Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
                        JOptionPane.showMessageDialog(null, "Slot added successfully!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "הסלוט הוסף בהצלחה!");
                        view1.AddSlot(slotTable, productionPlanTable,startingTime,um.getLanguageComboBox());
                    }
                    else{
                        Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
                    JOptionPane.showMessageDialog(null, "Slot was not added!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "הסלוט לא הוסף!");
                    }
                }
            }
        }
    }//GEN-LAST:event_Add_btn1MouseClicked

    private void choiceComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choiceComboBoxActionPerformed
        String txt= (String)choiceComboBox.getSelectedItem();
        if(txt.equals("Add Slot") || txt.equals("הוסף סלוט")){
           view1.AddSlot(slotTable, productionPlanTable,startingTime,um.getLanguageComboBox());
            if (productionPlanTable.getRowCount()==0){
              tableLayered_Slot.setVisible(false);
              tableLayered_ProductionPlan.setVisible(false);
              Add_btn1.setVisible(false);
              Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              JOptionPane.showMessageDialog(null, "There are no production plans that are lacking slots for production!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "אין תכניות יצור שחסרים להן סלוטים!");
            }
            else if (slotTable.getRowCount()==0){
              tableLayered_Slot.setVisible(false);
              tableLayered_ProductionPlan.setVisible(false);
              Add_btn1.setVisible(false);
              Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              JOptionPane.showMessageDialog(null, "This shift is full!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "משמרת זו מלאה!");
            }
            else{
            view1.AddSlot(slotTable, productionPlanTable,startingTime,um.getLanguageComboBox());
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
            btn_name.setText("Add");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                btn_name.setText("הוסף");
             icon_plus.setVisible(true);
             icon_remove.setVisible(false);
             tableLayered_Slot.setVisible(true);
             tableLayered_ProductionPlan.setVisible(true);
             Add_btn1.setVisible(true);
             view1.AddSlot(slotTable, productionPlanTable,startingTime,um.getLanguageComboBox());
            }
        }
         else  if(txt.equals("Remove Slot") || txt.equals("הסר סלוט")){
            view1.RemoveSlot(slotTable, startingTime,um.getLanguageComboBox());
            if (slotTable.getRowCount()==0){
              tableLayered_Slot.setVisible(false);
              tableLayered_ProductionPlan.setVisible(false);
              Add_btn1.setVisible(false);
              Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              JOptionPane.showMessageDialog(null, "This shift is empty!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "משמרת זו ריקה!");
            }
            else{
            icon_plus.setVisible(false);
            icon_remove.setVisible(true);
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
            btn_name.setText("Remove");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                btn_name.setText("הסר");
            tableLayered_Slot.setVisible(true);
            tableLayered_ProductionPlan.setVisible(false);
            Add_btn1.setVisible(true);
            view1.RemoveSlot(slotTable, startingTime,um.getLanguageComboBox());
         }
        }
      else   if (txt.equals("Choose one option") || txt.equals("בחר אפשרות אחת")){
            Add_btn1.setVisible(false);
            tableLayered_ProductionPlan.setVisible(false);
            tableLayered_Slot.setVisible(false);
        } 
    }//GEN-LAST:event_choiceComboBoxActionPerformed
    public JTable getPPTable() {
        return productionPlanTable;
    }

    public JTable getSlotTable() {
        return slotTable;
    }

    public void setStartingTime(Calendar startingTime) {
        this.startingTime = startingTime;
    }

    public JLabel getBtn_name() {
        return btn_name;
    }

    public JComboBox<String> getChoiceComboBox() {
        return choiceComboBox;
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Add_btn1;
    private javax.swing.JLabel btn_name;
    private javax.swing.JComboBox<String> choiceComboBox;
    private javax.swing.JLabel icon_plus;
    private javax.swing.JLabel icon_remove;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTable productionPlanTable;
    private javax.swing.JScrollPane resTableScrollPane;
    private javax.swing.JScrollPane resTableScrollPane1;
    private javax.swing.JTable slotTable;
    private javax.swing.JLayeredPane tableLayered_ProductionPlan;
    private javax.swing.JLayeredPane tableLayered_Slot;
    // End of variables declaration//GEN-END:variables
}