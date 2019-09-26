/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Toolkit;
import java.io.IOException;
import javax.swing.JPanel;
import utils.Constants;
import utils.MyFileLogWriter;
import view.MyPanels.*;
import view.MyPanels.show.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import utils.E_UserType;
import view.MyPanels.update.*;



/**
 *
 *
 */
public class UserMenu extends javax.swing.JFrame implements Serializable{
	 private static final long serialVersionUID = 1L;
	 private static ViewLogic view;
         
GridBagLayout layout= new GridBagLayout();
        AddEmployee e;
        AddGuard g;
        AddManuf m;
        AddWh wh;
        AddOrder o;
        AddPP pp;
        AddPPT ppt;
        AddPartType partType;
        AddShift shift;
        AddShiftM sm;
        AddVehicle v;
        AddVehicleM vm;
        AddWs ws;
        AddWorker worker;
        AddUser user;
        ShowParts showParts;
        ShowEmployees showEmployees;
        ShowManufacturers showManufacturers;
        ShowOrders showOrders;
        ShowProductionPlans showProductionPlans;
        ShowProductionPlanTypes showProductionPlanTypes;
        ShowShifts showShifts;
        ShowVehicles showVehicles;
        ShowWarehouses showWarehouses;
        ShowWorkstations showWorkstations;
        ShowModels showModels;
        ShowUsers showUsers;
        UpdateManuf updateManu;
        UpdateGuard updateGuard;
        UpdateOrder updateOrder;
        UpdatePP updatePP;
        UpdatePPT updatePPT;
        UpdatePartType updatePart;
        UpdateShift updateShift;
        UpdateVehicle updateVehicle;
        UpdateVehicleM updateVehicleModel;
        UpdateWh updateWarehouse;
        UpdateWorker updateWorker;
        UpdateWs updateWorkstation;
        UpdateShiftM updateShiftManager;
        UpdateUser updateUser;
        Home home;
        Options options;
        ShowManufacturersMoreDetails showManufMoreDetails;
        ShowEmployeesMore showEmployeesMore;
        ShowWarehouseMore showWhMore;
        ShowModelMore showModelMore;
        ShowPartMore showPartMore;
        ShowOrderMore showOrderMore;
        ShowPPTMore showPPTMore;
        ShowShiftsManageSlots showShiftsMore;
        
        
        
    /**
     * Creates new form UserMenu
     */
    public UserMenu() {
        initComponents();
        view=ViewLogic.getInstance();
         e=new AddEmployee(this);
         m=new AddManuf(this);
         wh=new AddWh(this);
         o=new AddOrder(this);
         pp= new AddPP(this);
         ppt= new AddPPT(this);
         partType= new AddPartType(this);
         shift =new AddShift(this);
         v= new AddVehicle(this) ;
         vm= new AddVehicleM(this) ;
         ws= new AddWs(this);
         user= new AddUser(this);
        showParts = new ShowParts(this);
        showEmployees = new ShowEmployees(this);
        showManufacturers = new ShowManufacturers(this);
        showOrders = new ShowOrders(this);
        showProductionPlans= new ShowProductionPlans(this) ;
        showProductionPlanTypes = new ShowProductionPlanTypes(this) ;
        showShifts = new ShowShifts(this) ;
        showVehicles = new ShowVehicles(this) ;
        showWarehouses = new ShowWarehouses(this) ;
        showWorkstations = new ShowWorkstations(this) ;
        showModels = new ShowModels(this) ;
        showUsers = new ShowUsers(this);
        updateManu = new UpdateManuf(this) ;
        updateGuard= new UpdateGuard(this) ;
        updateOrder = new UpdateOrder(this);
        updatePP = new UpdatePP(this);
        updatePPT = new UpdatePPT(this);
        updatePart = new UpdatePartType(this);
        updateShift = new UpdateShift(this);
        updateVehicle = new UpdateVehicle(this);
        updateVehicleModel = new UpdateVehicleM(this);
        updateWarehouse = new UpdateWh(this);
        updateWorker = new UpdateWorker(this);
        updateWorkstation = new UpdateWs(this);
        updateShiftManager = new UpdateShiftM(this);
        updateUser = new UpdateUser(this);
        home=new Home();
        options= new Options(this) ;
        showManufMoreDetails= new ShowManufacturersMoreDetails(this);
        showEmployeesMore= new ShowEmployeesMore(this) ;
        showWhMore= new ShowWarehouseMore(this) ;
        showModelMore= new ShowModelMore(this);
        showPartMore= new ShowPartMore(this) ;
        showOrderMore= new ShowOrderMore(this) ;
        showPPTMore= new ShowPPTMore(this) ;
        showShiftsMore = new ShowShiftsManageSlots(this);
        
         DynamicPanel.setLayout(layout);
         GridBagConstraints c= new GridBagConstraints();
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(m,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(user,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(wh,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(e,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(o,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(pp,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(ppt,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(partType,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(shift,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(v,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(vm,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(ws,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(home,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showParts,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showEmployees,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showOrders,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showVehicles,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showShifts,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showModels,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showProductionPlans,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showProductionPlanTypes,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showWarehouses,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showManufacturers,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showWorkstations,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showUsers,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(updateManu,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(updateGuard,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(updateOrder,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(updateShift,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(updateShiftManager,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(updateWarehouse,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(updateWorker,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(updateVehicle,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(updateVehicleModel,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(updatePPT,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(updatePP,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(updatePart,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(updateWorkstation,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(updateUser,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showManufMoreDetails,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showEmployeesMore,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showModelMore,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showOrderMore,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showPPTMore,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showPartMore,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showWhMore,c);
         c.gridx=0;
         c.gridy=0;
         DynamicPanel.add(showShiftsMore,c);
         c.gridx=0;
	 c.gridy=0;
	 DynamicPanel.add(options,c);
         
         
         m.setVisible(false);
         wh.setVisible(false);
         o.setVisible(false);
         pp.setVisible(false);
         ppt.setVisible(false);
         partType.setVisible(false);
         shift.setVisible(false);
         e.setVisible(false);
         v.setVisible(false);
         vm.setVisible(false);
         ws.setVisible(false);
        showParts.setVisible(false);
        showEmployees.setVisible(false);
        showVehicles.setVisible(false);
        showModels.setVisible(false);
        showOrders.setVisible(false);
        showShifts.setVisible(false);
        showWorkstations.setVisible(false);
        showWarehouses.setVisible(false);
        showManufacturers.setVisible(false);
        showProductionPlans.setVisible(false);
        showProductionPlanTypes.setVisible(false);
        updateManu.setVisible(false);
        updateGuard.setVisible(false);
        updateOrder.setVisible(false);
        updateShift.setVisible(false);
        updateShiftManager.setVisible(false);
        updateWorker.setVisible(false);
        updateVehicle.setVisible(false);
        updateVehicleModel.setVisible(false);
        updateWarehouse.setVisible(false);
        updateWorkstation.setVisible(false);
        updatePPT.setVisible(false);
        updatePP.setVisible(false);
        updatePart.setVisible(false);
        updateUser.setVisible(false);
        home.setVisible(false);
        options.setVisible(false);
        showManufMoreDetails.setVisible(false);
        showEmployeesMore.setVisible(false);
        showWhMore.setVisible(false);
        showModelMore.setVisible(false);
        showPartMore.setVisible(false);
        showOrderMore.setVisible(false);
        showPPTMore.setVisible(false);
        showUsers.setVisible(false);
        user.setVisible(false);
        showShiftsMore.setVisible(false);
        FirstScreen();
        
        showManufacturers.getUpdate().addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        updateManufacturerActionPerformed(evt);
    }
});
        showWarehouses.getUpdate().addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        updateWarehouseActionPerformed(evt);
    }
});
        showShifts.getUpdate().addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        updateShiftActionPerformed(evt);
    }
});
        showProductionPlans.getUpdate().addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        updateProductionPlanActionPerformed(evt);
    }
});
        showProductionPlanTypes.getUpdate().addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        updateProductionPlanTypeActionPerformed(evt);
    }
});
        showEmployees.getUpdate().addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        updateEmployeeActionPerformed(evt);
    }
});
        showOrders.getUpdate().addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        updateOrderActionPerformed(evt);
    }
});
        showWorkstations.getUpdate().addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        updateWorkstationActionPerformed(evt);
    }
});
        showParts.getUpdate().addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        updatePartTypeActionPerformed(evt);
    }
});
        showVehicles.getUpdate().addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        updateVehicleActionPerformed(evt);
    }
});
        showModels.getUpdate().addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        updateVehicleModelActionPerformed(evt);
    }
});
        showUsers.getUpdate().addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        updateUserActionPerformed(evt);
    }
});
        showManufacturers.getMore().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             moreManufMouseClickPerformed(evt);
         }
});
             showEmployees.getMore().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             moreEmployeesMouseClickPerformed(evt);
         }
});
             showModels.getMore().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             moreModelMouseClickPerformed(evt);
         }
  });
             showOrders.getMore().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             moreOrderMouseClickPerformed(evt);
         }
  });
             showProductionPlanTypes.getMore().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             morePPTMouseClickPerformed(evt);
         }
  });
             showParts.getMore().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             morePartMouseClickPerformed(evt);
         }
  });
            showWarehouses.getMore().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             moreWarehouseMouseClickPerformed(evt);
         }
  });
            showShifts.getManageSlots().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             moreShiftsMouseClickPerformed(evt);
         }
  });
       options.getLock().getjComboBoxEmployees().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             DisableUpdateEmployees(evt);
         }
  });
                  options.getLock().getjComboBoxOrders().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             DisableUpdateOrders(evt);
         }
  });
                   options.getLock().getjComboBoxaddEmployees().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             DisableAddEmployees(evt);
         }
  });
                 options.getLock().getjComboBoxAddOrders().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             DisableAddOrders(evt);
         }
  });
                 options.getLock().getjComboBoxAddShifts().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             DisableAddShifts(evt);
         }
  });
                 options.getDesign().getjComboBoxSideBar().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             ChangeSideBarColor(evt);
         }
  });
                 options.getDesign().getjComboBoxBackground().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             ChangeBackgroundColor(evt);
         }
  });
                 options.getVolume().getLoginSoundComboBox().addActionListener(new java.awt.event.ActionListener(){
         public void actionPerformed(java.awt.event.ActionEvent evt) {
             volumeControl(evt);
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

        jLayeredPane2 = new javax.swing.JLayeredPane();
        desktopPane = new javax.swing.JDesktopPane();
        side = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        btn_home = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_addData = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        layer_ShowList = new javax.swing.JLayeredPane();
        add_ScrollPane1 = new javax.swing.JScrollPane();
        showDataList = new javax.swing.JList<>();
        layer_AddList = new javax.swing.JLayeredPane();
        add_ScrollPane = new javax.swing.JScrollPane();
        addDataList = new javax.swing.JList<>();
        btn_admin = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_showData = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        layer_AdminList = new javax.swing.JLayeredPane();
        admin_ScrollPane = new javax.swing.JScrollPane();
        adminDataList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        userText = new javax.swing.JTextField();
        background = new javax.swing.JPanel();
        title_Panel = new javax.swing.JPanel();
        label_title = new javax.swing.JLabel();
        DynamicPanel = new javax.swing.JPanel();
        languageComboBox = new javax.swing.JComboBox<>();
        adminMessageText = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        save = new javax.swing.JMenuItem();
        logOff = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        Reports = new javax.swing.JMenu();
        getAllWarehousesInManufacturerCountry = new javax.swing.JMenuItem();
        findVehicleInCity = new javax.swing.JMenuItem();
        getMostProfitableManufacturer = new javax.swing.JMenuItem();
        getMissingPartsForProductionPlan = new javax.swing.JMenuItem();
        getLastFutureProductionOfModel = new javax.swing.JMenuItem();
        findShiftByTime = new javax.swing.JMenuItem();
        getAllShiftsOrderedByNumberOfProductionPlanTypes = new javax.swing.JMenuItem();
        getKModelsWithLeastVehicles = new javax.swing.JMenuItem();
        getNumberOfPartsForEachOrder = new javax.swing.JMenuItem();
        getAllEmployeesOrderedByTypeAndById = new javax.swing.JMenuItem();
        getAllEmployeesOrderedBySalaryInMonth = new javax.swing.JMenuItem();
        getProductionPlanTypesOrderedByNumberOfSlots = new javax.swing.JMenuItem();
        getAllHourlyEmployeesWithShiftsAndSlots = new javax.swing.JMenuItem();
        getPartsQuantityInAllOrders = new javax.swing.JMenuItem();
        Help = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();

        jLayeredPane2.setVisible(true);
        jLayeredPane2.setEnabled(true);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1484, Short.MAX_VALUE)
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        side.setBackground(new java.awt.Color(0, 153, 153));
        side.setInheritsPopupMenu(true);
        side.setPreferredSize(new java.awt.Dimension(400, 720));
        side.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("view/Bundle"); // NOI18N
        jLabel11.setText(bundle.getString("UserMenu.jLabel11.text")); // NOI18N
        jLabel11.setToolTipText(bundle.getString("UserMenu.jLabel11.toolTipText")); // NOI18N
        side.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));
        side.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 200, 10));

        btn_home.setBackground(new java.awt.Color(76, 188, 188));
        btn_home.setPreferredSize(new java.awt.Dimension(260, 54));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
        });

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/004-internet.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(bundle.getString("UserMenu.jLabel6.text")); // NOI18N

        javax.swing.GroupLayout btn_homeLayout = new javax.swing.GroupLayout(btn_home);
        btn_home.setLayout(btn_homeLayout);
        btn_homeLayout.setHorizontalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_homeLayout.setVerticalGroup(
            btn_homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_homeLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_homeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_addData.setBackground(new java.awt.Color(76, 188, 188));
        btn_addData.setPreferredSize(new java.awt.Dimension(260, 54));
        btn_addData.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn_addDataMouseDragged(evt);
            }
        });
        btn_addData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addDataMouseClicked(evt);
            }
        });
        btn_addData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/001-signs.png"))); // NOI18N
        btn_addData.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 9, 35, 45));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(bundle.getString("UserMenu.jLabel4.text")); // NOI18N
        btn_addData.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 20, 180, 23));

        layer_ShowList.setVisible(false);
        layer_ShowList.setEnabled(false);

        add_ScrollPane1.setBorder(null);

        showDataList.setBackground(new java.awt.Color(0, 153, 153));
        showDataList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showDataList.setForeground(new java.awt.Color(255, 255, 255));
        showDataList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Show Manufacturers", "Show Warehouses", "Show Employees", "Show Production Plan Types", "Show Production Plans", "Show Vehicle Models", "Show Vehicles", "Show PartTypes", "Show Orders", "Show Workstations", "Show Shifts" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        showDataList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        showDataList.setSelectionBackground(new java.awt.Color(76, 188, 188));
        showDataList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                showDataListMouseClicked(evt);
            }
        });
        showDataList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                showDataListValueChanged(evt);
            }
        });
        add_ScrollPane1.setViewportView(showDataList);

        layer_ShowList.setLayer(add_ScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layer_ShowListLayout = new javax.swing.GroupLayout(layer_ShowList);
        layer_ShowList.setLayout(layer_ShowListLayout);
        layer_ShowListLayout.setHorizontalGroup(
            layer_ShowListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add_ScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );
        layer_ShowListLayout.setVerticalGroup(
            layer_ShowListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layer_ShowListLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(add_ScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        layer_AddList.setVisible(false);
        layer_AddList.setEnabled(false);

        add_ScrollPane.setBorder(null);

        addDataList.setBackground(new java.awt.Color(0, 153, 153));
        addDataList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addDataList.setForeground(new java.awt.Color(255, 255, 255));
        addDataList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Add Manufacturer", "Add Warehouse", "Add Employee", "Add Production Plan Type", "Add Production Plan", "Add Vehicle Model", "Add Vehicle", "Add PartType", "Add Order", "Add Workstation", "Add Shift" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        addDataList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        addDataList.setSelectionBackground(new java.awt.Color(76, 188, 188));
        addDataList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDataListMouseClicked(evt);
            }
        });
        addDataList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                addDataListValueChanged(evt);
            }
        });
        add_ScrollPane.setViewportView(addDataList);

        layer_AddList.setLayer(add_ScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layer_AddListLayout = new javax.swing.GroupLayout(layer_AddList);
        layer_AddList.setLayout(layer_AddListLayout);
        layer_AddListLayout.setHorizontalGroup(
            layer_AddListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(add_ScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );
        layer_AddListLayout.setVerticalGroup(
            layer_AddListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layer_AddListLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(add_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6))
        );

        btn_admin.setBackground(new java.awt.Color(76, 188, 188));
        btn_admin.setPreferredSize(new java.awt.Dimension(260, 54));
        btn_admin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_adminMouseClicked(evt);
            }
        });

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/005-profile.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText(bundle.getString("UserMenu.jLabel8.text")); // NOI18N

        javax.swing.GroupLayout btn_adminLayout = new javax.swing.GroupLayout(btn_admin);
        btn_admin.setLayout(btn_adminLayout);
        btn_adminLayout.setHorizontalGroup(
            btn_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_adminLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btn_adminLayout.setVerticalGroup(
            btn_adminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_adminLayout.createSequentialGroup()
                .addGap(0, 9, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btn_adminLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_showData.setBackground(new java.awt.Color(76, 188, 188));
        btn_showData.setToolTipText(bundle.getString("UserMenu.btn_showData.toolTipText")); // NOI18N
        btn_showData.setPreferredSize(new java.awt.Dimension(260, 54));
        btn_showData.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                btn_showDataMouseDragged(evt);
            }
        });
        btn_showData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_showDataMouseClicked(evt);
            }
        });
        btn_showData.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/001-view-list-button.png"))); // NOI18N
        btn_showData.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 9, 35, 45));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText(bundle.getString("UserMenu.jLabel10.text")); // NOI18N
        btn_showData.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(71, 20, 130, 23));

        layer_AdminList.setVisible(false);
        layer_AdminList.setEnabled(false);

        admin_ScrollPane.setBorder(null);

        adminDataList.setBackground(new java.awt.Color(0, 153, 153));
        adminDataList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        adminDataList.setForeground(new java.awt.Color(255, 255, 255));
        adminDataList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Show Users", "Add User", "Options" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        adminDataList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        adminDataList.setSelectionBackground(new java.awt.Color(76, 188, 188));
        adminDataList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                adminDataListMouseClicked(evt);
            }
        });
        adminDataList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                adminDataListValueChanged(evt);
            }
        });
        admin_ScrollPane.setViewportView(adminDataList);

        layer_AdminList.setLayer(admin_ScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layer_AdminListLayout = new javax.swing.GroupLayout(layer_AdminList);
        layer_AdminList.setLayout(layer_AdminListLayout);
        layer_AdminListLayout.setHorizontalGroup(
            layer_AdminListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layer_AdminListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(admin_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layer_AdminListLayout.setVerticalGroup(
            layer_AdminListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(admin_ScrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
        );

        jLayeredPane1.setLayer(btn_home, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btn_addData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(layer_ShowList, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(layer_AddList, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btn_admin, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btn_showData, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(layer_AdminList, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_home, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(btn_addData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(layer_AddList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(layer_ShowList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23))
                    .addComponent(btn_admin, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                    .addComponent(btn_showData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(layer_AdminList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addComponent(btn_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_showData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(layer_ShowList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btn_addData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(layer_AddList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(layer_AdminList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        side.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 290, 760));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons/002-user-silhouette.png"))); // NOI18N
        jLabel1.setText(bundle.getString("UserMenu.jLabel1.text")); // NOI18N
        side.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 70, 70));

        userText.setBackground(new java.awt.Color(0, 153, 153));
        userText.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        userText.setForeground(new java.awt.Color(255, 255, 255));
        userText.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        userText.setBorder(null);
        userText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        userText.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        userText.setEnabled(false);
        side.add(userText, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 210, 20));

        background.setBackground(new java.awt.Color(235, 255, 255));
        background.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                backgroundMouseDragged(evt);
            }
        });

        title_Panel.setBackground(new java.awt.Color(210, 255, 255));
        title_Panel.setForeground(new java.awt.Color(102, 102, 102));
        title_Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_title.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        label_title.setForeground(new java.awt.Color(102, 102, 102));
        title_Panel.add(label_title, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 730, 48));

        DynamicPanel.setBackground(new java.awt.Color(235, 255, 255));

        javax.swing.GroupLayout DynamicPanelLayout = new javax.swing.GroupLayout(DynamicPanel);
        DynamicPanel.setLayout(DynamicPanelLayout);
        DynamicPanelLayout.setHorizontalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 830, Short.MAX_VALUE)
        );
        DynamicPanelLayout.setVerticalGroup(
            DynamicPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 723, Short.MAX_VALUE)
        );

        languageComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "עברית" }));
        languageComboBox.setToolTipText(bundle.getString("UserMenu.languageComboBox.toolTipText")); // NOI18N
        languageComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                languageComboBoxActionPerformed(evt);
            }
        });

        adminMessageText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminMessageText.setText(bundle.getString("UserMenu.adminMessageText.text")); // NOI18N

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DynamicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminMessageText, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(languageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(languageComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminMessageText, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(title_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DynamicPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        desktopPane.setLayer(side, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(background, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addComponent(side, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        file.setText(bundle.getString("UserMenu.file.text")); // NOI18N
        file.setToolTipText(bundle.getString("UserMenu.file.toolTipText")); // NOI18N

        save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        save.setText(bundle.getString("UserMenu.save.text")); // NOI18N
        save.setToolTipText(bundle.getString("UserMenu.save.toolTipText")); // NOI18N
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        file.add(save);

        logOff.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        logOff.setText(bundle.getString("UserMenu.logOff.text")); // NOI18N
        logOff.setToolTipText(bundle.getString("UserMenu.logOff.toolTipText")); // NOI18N
        logOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOffActionPerformed(evt);
            }
        });
        file.add(logOff);
        logOff.getAccessibleContext().setAccessibleName(bundle.getString("UserMenu.logOff.AccessibleContext.accessibleName")); // NOI18N

        exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        exit.setText(bundle.getString("UserMenu.exit.text")); // NOI18N
        exit.setToolTipText(bundle.getString("UserMenu.exit.toolTipText")); // NOI18N
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        file.add(exit);

        jMenuBar1.add(file);

        Reports.setText(bundle.getString("UserMenu.Reports.text")); // NOI18N
        Reports.setToolTipText(bundle.getString("UserMenu.Reports.toolTipText")); // NOI18N

        getAllWarehousesInManufacturerCountry.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        getAllWarehousesInManufacturerCountry.setText(bundle.getString("UserMenu.getAllWarehousesInManufacturerCountry.text")); // NOI18N
        getAllWarehousesInManufacturerCountry.setToolTipText(bundle.getString("UserMenu.getAllWarehousesInManufacturerCountry.toolTipText")); // NOI18N
        getAllWarehousesInManufacturerCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAllWarehousesInManufacturerCountryActionPerformed(evt);
            }
        });
        Reports.add(getAllWarehousesInManufacturerCountry);

        findVehicleInCity.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        findVehicleInCity.setText(bundle.getString("UserMenu.findVehicleInCity.text")); // NOI18N
        findVehicleInCity.setToolTipText(bundle.getString("UserMenu.findVehicleInCity.toolTipText")); // NOI18N
        findVehicleInCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findVehicleInCityActionPerformed(evt);
            }
        });
        Reports.add(findVehicleInCity);

        getMostProfitableManufacturer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_MASK));
        getMostProfitableManufacturer.setText(bundle.getString("UserMenu.getMostProfitableManufacturer.text")); // NOI18N
        getMostProfitableManufacturer.setToolTipText(bundle.getString("UserMenu.getMostProfitableManufacturer.toolTipText")); // NOI18N
        getMostProfitableManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getMostProfitableManufacturerActionPerformed(evt);
            }
        });
        Reports.add(getMostProfitableManufacturer);

        getMissingPartsForProductionPlan.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_MASK));
        getMissingPartsForProductionPlan.setText(bundle.getString("UserMenu.getMissingPartsForProductionPlan.text")); // NOI18N
        getMissingPartsForProductionPlan.setToolTipText(bundle.getString("UserMenu.getMissingPartsForProductionPlan.toolTipText")); // NOI18N
        getMissingPartsForProductionPlan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getMissingPartsForProductionPlanActionPerformed(evt);
            }
        });
        Reports.add(getMissingPartsForProductionPlan);

        getLastFutureProductionOfModel.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_MASK));
        getLastFutureProductionOfModel.setText(bundle.getString("UserMenu.getLastFutureProductionOfModel.text")); // NOI18N
        getLastFutureProductionOfModel.setToolTipText(bundle.getString("UserMenu.getLastFutureProductionOfModel.toolTipText")); // NOI18N
        getLastFutureProductionOfModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getLastFutureProductionOfModelActionPerformed(evt);
            }
        });
        Reports.add(getLastFutureProductionOfModel);

        findShiftByTime.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.CTRL_MASK));
        findShiftByTime.setText(bundle.getString("UserMenu.findShiftByTime.text")); // NOI18N
        findShiftByTime.setToolTipText(bundle.getString("UserMenu.findShiftByTime.toolTipText")); // NOI18N
        findShiftByTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findShiftByTimeActionPerformed(evt);
            }
        });
        Reports.add(findShiftByTime);

        getAllShiftsOrderedByNumberOfProductionPlanTypes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_7, java.awt.event.InputEvent.CTRL_MASK));
        getAllShiftsOrderedByNumberOfProductionPlanTypes.setText(bundle.getString("UserMenu.getAllShiftsOrderedByNumberOfProductionPlanTypes.text")); // NOI18N
        getAllShiftsOrderedByNumberOfProductionPlanTypes.setToolTipText(bundle.getString("UserMenu.getAllShiftsOrderedByNumberOfProductionPlanTypes.toolTipText")); // NOI18N
        getAllShiftsOrderedByNumberOfProductionPlanTypes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAllShiftsOrderedByNumberOfProductionPlanTypesActionPerformed(evt);
            }
        });
        Reports.add(getAllShiftsOrderedByNumberOfProductionPlanTypes);

        getKModelsWithLeastVehicles.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_8, java.awt.event.InputEvent.CTRL_MASK));
        getKModelsWithLeastVehicles.setText(bundle.getString("UserMenu.getKModelsWithLeastVehicles.text")); // NOI18N
        getKModelsWithLeastVehicles.setToolTipText(bundle.getString("UserMenu.getKModelsWithLeastVehicles.toolTipText")); // NOI18N
        getKModelsWithLeastVehicles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getKModelsWithLeastVehiclesActionPerformed(evt);
            }
        });
        Reports.add(getKModelsWithLeastVehicles);

        getNumberOfPartsForEachOrder.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_9, java.awt.event.InputEvent.CTRL_MASK));
        getNumberOfPartsForEachOrder.setText(bundle.getString("UserMenu.getNumberOfPartsForEachOrder.text")); // NOI18N
        getNumberOfPartsForEachOrder.setToolTipText(bundle.getString("UserMenu.getNumberOfPartsForEachOrder.toolTipText")); // NOI18N
        getNumberOfPartsForEachOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getNumberOfPartsForEachOrderActionPerformed(evt);
            }
        });
        Reports.add(getNumberOfPartsForEachOrder);

        getAllEmployeesOrderedByTypeAndById.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        getAllEmployeesOrderedByTypeAndById.setText(bundle.getString("UserMenu.getAllEmployeesOrderedByTypeAndById.text")); // NOI18N
        getAllEmployeesOrderedByTypeAndById.setToolTipText(bundle.getString("UserMenu.getAllEmployeesOrderedByTypeAndById.toolTipText")); // NOI18N
        getAllEmployeesOrderedByTypeAndById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAllEmployeesOrderedByTypeAndByIdActionPerformed(evt);
            }
        });
        Reports.add(getAllEmployeesOrderedByTypeAndById);

        getAllEmployeesOrderedBySalaryInMonth.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        getAllEmployeesOrderedBySalaryInMonth.setText(bundle.getString("UserMenu.getAllEmployeesOrderedBySalaryInMonth.text")); // NOI18N
        getAllEmployeesOrderedBySalaryInMonth.setToolTipText(bundle.getString("UserMenu.getAllEmployeesOrderedBySalaryInMonth.toolTipText")); // NOI18N
        getAllEmployeesOrderedBySalaryInMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAllEmployeesOrderedBySalaryInMonthActionPerformed(evt);
            }
        });
        Reports.add(getAllEmployeesOrderedBySalaryInMonth);

        getProductionPlanTypesOrderedByNumberOfSlots.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        getProductionPlanTypesOrderedByNumberOfSlots.setText(bundle.getString("UserMenu.getProductionPlanTypesOrderedByNumberOfSlots.text")); // NOI18N
        getProductionPlanTypesOrderedByNumberOfSlots.setToolTipText(bundle.getString("UserMenu.getProductionPlanTypesOrderedByNumberOfSlots.toolTipText")); // NOI18N
        getProductionPlanTypesOrderedByNumberOfSlots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getProductionPlanTypesOrderedByNumberOfSlotsActionPerformed(evt);
            }
        });
        Reports.add(getProductionPlanTypesOrderedByNumberOfSlots);

        getAllHourlyEmployeesWithShiftsAndSlots.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        getAllHourlyEmployeesWithShiftsAndSlots.setText(bundle.getString("UserMenu.getAllHourlyEmployeesWithShiftsAndSlots.text")); // NOI18N
        getAllHourlyEmployeesWithShiftsAndSlots.setToolTipText(bundle.getString("UserMenu.getAllHourlyEmployeesWithShiftsAndSlots.toolTipText")); // NOI18N
        getAllHourlyEmployeesWithShiftsAndSlots.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAllHourlyEmployeesWithShiftsAndSlotsActionPerformed(evt);
            }
        });
        Reports.add(getAllHourlyEmployeesWithShiftsAndSlots);

        getPartsQuantityInAllOrders.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        getPartsQuantityInAllOrders.setText(bundle.getString("UserMenu.getPartsQuantityInAllOrders.text")); // NOI18N
        getPartsQuantityInAllOrders.setToolTipText(bundle.getString("UserMenu.getPartsQuantityInAllOrders.toolTipText")); // NOI18N
        getPartsQuantityInAllOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPartsQuantityInAllOrdersActionPerformed(evt);
            }
        });
        Reports.add(getPartsQuantityInAllOrders);

        jMenuBar1.add(Reports);

        Help.setText(bundle.getString("UserMenu.Help.text")); // NOI18N
        Help.setToolTipText(bundle.getString("UserMenu.Help.toolTipText")); // NOI18N

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setText(bundle.getString("UserMenu.jMenuItem5.text")); // NOI18N
        jMenuItem5.setToolTipText(bundle.getString("UserMenu.jMenuItem5.toolTipText")); // NOI18N
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        Help.add(jMenuItem5);

        jMenuBar1.add(Help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
    	ArrayList<String> designs=new ArrayList<>();
        ArrayList<String> locks=new ArrayList<>();
        String volume=null;
        String message=null;
        designs.add((String) options.getDesign().getjComboBoxBackground().getSelectedItem());
        designs.add((String) options.getDesign().getjComboBoxSideBar().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxEmployees().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxOrders().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxaddEmployees().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxAddOrders().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxAddShifts().getSelectedItem());
        volume=options.getVolume().getLoginSoundComboBox().getText();
        message=options.getNotification().getNotificationText().getText(); 
        try {
            view.serialization(Constants.Ser_FileName);
            view.serializeAdminDesignChoicesLog(Constants.Ser_AdminDesignsFileName, designs);
            view.serializeAdminLocksChoicesLog(Constants.Ser_AdminLocksFileName, locks);
            view.serializeAdminMessageChoicesLog(Constants.Ser_AdminMessageFileName, message);
            view.serializeAdminVolumeChoicesLog(Constants.Ser_AdminVolumeFileName, volume);
        } catch (IOException ex) {
        }
    	MyFileLogWriter.saveLogFile();
        view.Quit();
    }//GEN-LAST:event_exitActionPerformed

    private void getAllWarehousesInManufacturerCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllWarehousesInManufacturerCountryActionPerformed
        view.OpenGetAllWarehousesInManufacturerCountryQuery(desktopPane,this);
    }//GEN-LAST:event_getAllWarehousesInManufacturerCountryActionPerformed

    private void findVehicleInCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findVehicleInCityActionPerformed
        view.OpenFindVehicleInCityQuery(desktopPane,this);
    }//GEN-LAST:event_findVehicleInCityActionPerformed

    private void getMostProfitableManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getMostProfitableManufacturerActionPerformed
        view.OpenGetMostProfitableManufacturerQuery(desktopPane,this);
    }//GEN-LAST:event_getMostProfitableManufacturerActionPerformed

    private void getMissingPartsForProductionPlanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getMissingPartsForProductionPlanActionPerformed
        view.OpenGetMissingPartsForProductionPlanQuery(desktopPane,this);
    }//GEN-LAST:event_getMissingPartsForProductionPlanActionPerformed

    private void getLastFutureProductionOfModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getLastFutureProductionOfModelActionPerformed
        view.OpenGetLastFutureProductionOfModelQuery(desktopPane,this);
    }//GEN-LAST:event_getLastFutureProductionOfModelActionPerformed

    private void findShiftByTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findShiftByTimeActionPerformed
        view.OpenFindShiftByTimeQuery(desktopPane,this);
    }//GEN-LAST:event_findShiftByTimeActionPerformed

    private void getAllShiftsOrderedByNumberOfProductionPlanTypesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllShiftsOrderedByNumberOfProductionPlanTypesActionPerformed
        view.OpenGetAllShiftsOrderedByNumberOfProductionPlanTypesQuery(desktopPane,this);
    }//GEN-LAST:event_getAllShiftsOrderedByNumberOfProductionPlanTypesActionPerformed

    private void getKModelsWithLeastVehiclesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getKModelsWithLeastVehiclesActionPerformed
        view.OpenGetKModelsWithLeastVehiclesQuery(desktopPane,this);
    }//GEN-LAST:event_getKModelsWithLeastVehiclesActionPerformed

    private void getNumberOfPartsForEachOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getNumberOfPartsForEachOrderActionPerformed
        view.OpenGetNumberOfPartsForEachOrderQuery(desktopPane,this);
    }//GEN-LAST:event_getNumberOfPartsForEachOrderActionPerformed

    private void getAllEmployeesOrderedByTypeAndByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllEmployeesOrderedByTypeAndByIdActionPerformed
        view.OpenGetAllEmployeesOrderedByTypeAndByIDQuery(desktopPane,this);
    }//GEN-LAST:event_getAllEmployeesOrderedByTypeAndByIdActionPerformed

    private void getAllEmployeesOrderedBySalaryInMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllEmployeesOrderedBySalaryInMonthActionPerformed
        view.OpenGetAllEmployeesOrderedBySalaryInMonthQuery(desktopPane,this);
    }//GEN-LAST:event_getAllEmployeesOrderedBySalaryInMonthActionPerformed

    private void getProductionPlanTypesOrderedByNumberOfSlotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getProductionPlanTypesOrderedByNumberOfSlotsActionPerformed
        view.OpenGetProductionPlanTypesOrderedByNumberOfSlotsQuery(desktopPane,this);
    }//GEN-LAST:event_getProductionPlanTypesOrderedByNumberOfSlotsActionPerformed

    private void getAllHourlyEmployeesWithShiftsAndSlotsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAllHourlyEmployeesWithShiftsAndSlotsActionPerformed
        view.OpenGetAllHourlyEmployeesWithShiftsAndSlotsQuery(desktopPane,this);
    }//GEN-LAST:event_getAllHourlyEmployeesWithShiftsAndSlotsActionPerformed

    private void getPartsQuantityInAllOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getPartsQuantityInAllOrdersActionPerformed
        view.OpenGetPartsQuantityInAllOrdersQuery(desktopPane,this);
    }//GEN-LAST:event_getPartsQuantityInAllOrdersActionPerformed

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        if(btn_home.getBackground().getRed()==76 &&btn_home.getBackground().getGreen()==188 && btn_home.getBackground().getBlue()==188){
        setColor(btn_home);
        resetColor(btn_addData);
        resetColor(btn_admin);
        resetColor(btn_showData);
    }
        showDataList.clearSelection();
        addDataList.clearSelection();
        adminDataList.clearSelection();
        e.setVisible(false);
        m.setVisible(false);
        wh.setVisible(false);
        o.setVisible(false);
        pp.setVisible(false);
        ppt.setVisible(false);
        partType.setVisible(false);
        shift.setVisible(false);
        v.setVisible(false);
        vm.setVisible(false);
        ws.setVisible(false);
        showParts.setVisible(false);
        showEmployees.setVisible(false);
        showVehicles.setVisible(false);
        showModels.setVisible(false);
        showOrders.setVisible(false);
        showShifts.setVisible(false);
        showWorkstations.setVisible(false);
        showWarehouses.setVisible(false);
        showManufacturers.setVisible(false);
        showProductionPlans.setVisible(false);
        showProductionPlanTypes.setVisible(false);
        updateManu.setVisible(false);
        updateGuard.setVisible(false);
        updateOrder.setVisible(false);
        updateShift.setVisible(false);
        updateShiftManager.setVisible(false);
        updateWorker.setVisible(false);
        updateVehicle.setVisible(false);
        updateVehicleModel.setVisible(false);
        updateWarehouse.setVisible(false);
        updateWorkstation.setVisible(false);
        updatePPT.setVisible(false);
        updatePP.setVisible(false);
        updatePart.setVisible(false);
        showManufMoreDetails.setVisible(false);
        showEmployeesMore.setVisible(false);
        showWhMore.setVisible(false);
        showModelMore.setVisible(false);
        showPartMore.setVisible(false);
        showOrderMore.setVisible(false);
        showPPTMore.setVisible(false);
        showUsers.setVisible(false);
        user.setVisible(false);
        updateUser.setVisible(false);
        showShiftsMore.setVisible(false);
        options.setVisible(false);
        home.setVisible(true);
        if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language")){
        label_title.setText("Home");
        label_title.setHorizontalAlignment(SwingConstants.LEFT);
        }
        else if (languageComboBox.getSelectedItem().equals("עברית")){
            label_title.setText("ראשי");
            label_title.setHorizontalAlignment(SwingConstants.RIGHT);
        }

    }//GEN-LAST:event_btn_homeMouseClicked
private void FirstScreen()
{
    if(btn_home.getBackground().equals(new Color(76,188,188))){
        setColor(btn_home);
        resetColor(btn_addData);
        resetColor(btn_admin);
        resetColor(btn_showData);
    }
        showDataList.clearSelection();
        addDataList.clearSelection();
        adminDataList.clearSelection();
        e.setVisible(false);
        m.setVisible(false);
        wh.setVisible(false);
        o.setVisible(false);
        pp.setVisible(false);
        ppt.setVisible(false);
        partType.setVisible(false);
        shift.setVisible(false);
        v.setVisible(false);
        vm.setVisible(false);
        ws.setVisible(false);
        showParts.setVisible(false);
        showEmployees.setVisible(false);
        showVehicles.setVisible(false);
        showModels.setVisible(false);
        showOrders.setVisible(false);
        showShifts.setVisible(false);
        showWorkstations.setVisible(false);
        showWarehouses.setVisible(false);
        showManufacturers.setVisible(false);
        showProductionPlans.setVisible(false);
        showProductionPlanTypes.setVisible(false);
        updateManu.setVisible(false);
        updateGuard.setVisible(false);
        updateOrder.setVisible(false);
        updateShift.setVisible(false);
        updateShiftManager.setVisible(false);
        updateWorker.setVisible(false);
        updateVehicle.setVisible(false);
        updateVehicleModel.setVisible(false);
        updateWarehouse.setVisible(false);
        updateWorkstation.setVisible(false);
        updatePPT.setVisible(false);
        updatePP.setVisible(false);
        updatePart.setVisible(false);
        showManufMoreDetails.setVisible(false);
        showEmployeesMore.setVisible(false);
        showWhMore.setVisible(false);
        showModelMore.setVisible(false);
        showPartMore.setVisible(false);
        showOrderMore.setVisible(false);
        showPPTMore.setVisible(false);
        showUsers.setVisible(false);
        user.setVisible(false);
        updateUser.setVisible(false);
        showShiftsMore.setVisible(false);
        options.setVisible(false);
        home.setVisible(true);
        if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language")){
        label_title.setText("Home");
        label_title.setHorizontalAlignment(SwingConstants.LEFT);
        }
        else if (languageComboBox.getSelectedItem().equals("עברית")){
            label_title.setText("ראשי");
            label_title.setHorizontalAlignment(SwingConstants.RIGHT);
        }

}
    private void btn_addDataMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addDataMouseDragged

    }//GEN-LAST:event_btn_addDataMouseDragged

    private void btn_addDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addDataMouseClicked

        if(btn_addData.getBackground().getRed()==76 &&btn_addData.getBackground().getGreen()==188 && btn_addData.getBackground().getBlue()==188){
        resetColor(btn_home);
        setColor(btn_addData);
        resetColor(btn_admin);
        resetColor(btn_showData);
    }
        if (layer_AddList.isVisible())
        {
            layer_AddList.setVisible(false);
            layer_AddList.setEnabled(false);
            addDataList.clearSelection();
        }
        else
        {
            layer_AddList.setVisible(true);
            layer_AddList.setEnabled(true);
            addDataList.clearSelection();
        }
    }//GEN-LAST:event_btn_addDataMouseClicked

    private void showDataListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showDataListMouseClicked
        String txt= showDataList.getSelectedValue();
        if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language")){
        label_title.setText("All" + txt.substring(4, txt.length()));
        label_title.setHorizontalAlignment(SwingConstants.LEFT);
        }
        else if (languageComboBox.getSelectedItem().equals("עברית")){
        label_title.setText("כל ה" + txt.substring(4, txt.length()));
        label_title.setHorizontalAlignment(SwingConstants.RIGHT);
        }
        if(txt.equals("Show Manufacturers") || txt.equals("הצג יצרנים")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(true);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            options.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
        }
        if(txt.equals("Show Warehouses") || txt.equals("הצג מחסנים")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(true);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            options.setVisible(false);
            showShiftsMore.setVisible(false);
        }
        if(txt.equals("Show Employees") || txt.equals("הצג עובדים")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(true);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            options.setVisible(false);
            showShiftsMore.setVisible(false);
        }
        if(txt.equals("Show Orders") || txt.equals("הצג הזמנות")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            options.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(true);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
        }
        if(txt.equals("Show Production Plans") || txt.equals("הצג תכניות יצור")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            options.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(true);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
        }
        if(txt.equals("Show Production Plan Types") || txt.equals("הצג סוגי תכניות יצור")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(true);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            options.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
        }
        if(txt.equals("Show PartTypes") || txt.equals("הצג סוגי חלקים")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(true);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            options.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
        }
        if(txt.equals("Show Shifts") || txt.equals("הצג משמרות")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(true);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            options.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
        }
        if(txt.equals("Show Vehicles") || txt.equals("הצג רכבים")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            options.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(true);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
        }
        if(txt.equals("Show Vehicle Models") || txt.equals("הצג דגמי רכבים")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(true);
            showOrders.setVisible(false);
            options.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
        }

        if(txt.equals("Show Workstations") || txt.equals("הצג תחנות עבודה")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            options.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(true);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);

        }
    }//GEN-LAST:event_showDataListMouseClicked

    private void addDataListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDataListMouseClicked
        // ctrl click to remove choice makes nullpointerexception
        String txt= addDataList.getSelectedValue();
        label_title.setText(txt);
        if(txt.equals("Add Manufacturer") || txt.equals("הוסף יצרן")){
            e.setVisible(false);
            m.setVisible(true);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            options.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);

        }
        if(txt.equals("Add Warehouse") || txt.equals("הוסף מחסן")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(true);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            options.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
        }
        if(txt.equals("Add Employee") || txt.equals("הוסף עובד")){
            e.setVisible(true);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            options.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
            if (options.getLock().getjComboBoxaddEmployees().getSelectedItem().equals("Disabled"))
                view.disabledAdd(this);
        }
        if(txt.equals("Add Order") || txt.equals("הוסף הזמנה")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            options.setVisible(false);
            o.setVisible(true);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
            if (options.getLock().getjComboBoxAddOrders().getSelectedItem().equals("Disabled"))
                view.disabledAdd(this);
        }
        if(txt.equals("Add Production Plan") || txt.equals("הוסף תכנית יצור")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(true);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            options.setVisible(false);
            showShiftsMore.setVisible(false);
        }
        if(txt.equals("Add Production Plan Type") || txt.equals("הוסף סוג תכנית יצור")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(true);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            options.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
        }
        if(txt.equals("Add PartType") || txt.equals("הוסף סוג חלק")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(true);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            options.setVisible(false);
            showShiftsMore.setVisible(false);
        }
        if(txt.equals("Add Shift") || txt.equals("הוסף משמרת")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(true);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            options.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
            if (options.getLock().getjComboBoxAddShifts().getSelectedItem().equals("Disabled"))
                view.disabledAdd(this);
        }
        
        if(txt.equals("Add Vehicle") || txt.equals("הוסף רכב")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(true);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            options.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
        }
        if(txt.equals("Add Vehicle Model") || txt.equals("הוסף דגם רכב")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(true);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            options.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
        }

        if(txt.equals("Add Workstation") || txt.equals("הוסף תחנת עבודה")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(true);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            options.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);

        }

    }//GEN-LAST:event_addDataListMouseClicked

    private void btn_adminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_adminMouseClicked
        if(btn_admin.getBackground().getRed()==76 &&btn_admin.getBackground().getGreen()==188 && btn_admin.getBackground().getBlue()==188){
        resetColor(btn_home);
        resetColor(btn_addData);
        setColor(btn_admin);
        resetColor(btn_showData);
    }
        if (layer_AdminList.isVisible())
        {
            layer_AdminList.setVisible(false);
            layer_AdminList.setEnabled(false);
            showDataList.clearSelection();
            addDataList.clearSelection();
            adminDataList.clearSelection();
        }
        else
        {
            layer_AdminList.setVisible(true);
            layer_AdminList.setEnabled(true);
            showDataList.clearSelection();
            addDataList.clearSelection();
            adminDataList.clearSelection();
        }
    }//GEN-LAST:event_btn_adminMouseClicked

    private void btn_showDataMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_showDataMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_showDataMouseDragged

    private void btn_showDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_showDataMouseClicked
        if(btn_showData.getBackground().getRed()==76 &&btn_showData.getBackground().getGreen()==188 && btn_showData.getBackground().getBlue()==188){
        setColor(btn_showData);
        resetColor(btn_home);
        resetColor(btn_addData);
        resetColor(btn_admin);
        
    }
        if (layer_ShowList.isVisible())
        {
            layer_ShowList.setVisible(false);
            layer_ShowList.setEnabled(false);
            showDataList.clearSelection();
            addDataList.clearSelection();
            adminDataList.clearSelection();

        }
        else
        {
            layer_ShowList.setVisible(true);
            layer_ShowList.setEnabled(true);
            showDataList.clearSelection();
            addDataList.clearSelection();
            adminDataList.clearSelection();

        }
    }//GEN-LAST:event_btn_showDataMouseClicked

    private void backgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseDragged

    }//GEN-LAST:event_backgroundMouseDragged

    private void adminDataListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_adminDataListMouseClicked
        String txt= adminDataList.getSelectedValue();
    
        if(txt.equals("Show Users") || txt.equals("הצג משתמשים")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            options.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(true);
            user.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language")){
        label_title.setText("All" + txt.substring(4, txt.length()));
        label_title.setHorizontalAlignment(SwingConstants.LEFT);
        }
        else if (languageComboBox.getSelectedItem().equals("עברית")){
        label_title.setText("כל ה" + txt.substring(4, txt.length()));
        label_title.setHorizontalAlignment(SwingConstants.RIGHT);
        }
        }
        if(txt.equals("Add User")|| txt.equals("הוסף משתמש")){
            e.setVisible(false);
            options.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(true);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language")){
        label_title.setText("Add User");
        label_title.setHorizontalAlignment(SwingConstants.LEFT);
        }
        else if (languageComboBox.getSelectedItem().equals("עברית")){
        label_title.setText("הוסף משתמש");
        label_title.setHorizontalAlignment(SwingConstants.RIGHT);
        }
        }
        if(txt.equals("Options") || txt.equals("אפשרויות")){
            e.setVisible(false);
            m.setVisible(false);
            wh.setVisible(false);
            o.setVisible(false);
            pp.setVisible(false);
            ppt.setVisible(false);
            partType.setVisible(false);
            shift.setVisible(false);
            v.setVisible(false);
            vm.setVisible(false);
            ws.setVisible(false);
            showParts.setVisible(false);
            showEmployees.setVisible(false);
            showVehicles.setVisible(false);
            showModels.setVisible(false);
            showOrders.setVisible(false);
            showShifts.setVisible(false);
            showWorkstations.setVisible(false);
            showWarehouses.setVisible(false);
            showManufacturers.setVisible(false);
            showProductionPlans.setVisible(false);
            showProductionPlanTypes.setVisible(false);
            updateManu.setVisible(false);
            updateGuard.setVisible(false);
            updateOrder.setVisible(false);
            updateShift.setVisible(false);
            updateShiftManager.setVisible(false);
            updateWorker.setVisible(false);
            updateVehicle.setVisible(false);
            updateVehicleModel.setVisible(false);
            updateWarehouse.setVisible(false);
            updateWorkstation.setVisible(false);
            updatePPT.setVisible(false);
            updatePP.setVisible(false);
            updatePart.setVisible(false);
            home.setVisible(false);
            showManufMoreDetails.setVisible(false);
            showEmployeesMore.setVisible(false);
            showWhMore.setVisible(false);
            showModelMore.setVisible(false);
            showPartMore.setVisible(false);
            showOrderMore.setVisible(false);
            showPPTMore.setVisible(false);
            showUsers.setVisible(false);
            user.setVisible(false);
            updateUser.setVisible(false);
            showShiftsMore.setVisible(false);
            options.setVisible(true);
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language")){
        label_title.setText("Options");
        label_title.setHorizontalAlignment(SwingConstants.LEFT);
        }
        else if (languageComboBox.getSelectedItem().equals("עברית")){
        label_title.setText("אפשרויות");
        label_title.setHorizontalAlignment(SwingConstants.RIGHT);
        }
        }
    }//GEN-LAST:event_adminDataListMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        ArrayList<String> designs=new ArrayList<>();
        ArrayList<String> locks=new ArrayList<>();
        String volume=null;
        String message=null;
        designs.add((String) options.getDesign().getjComboBoxBackground().getSelectedItem());
        designs.add((String) options.getDesign().getjComboBoxSideBar().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxEmployees().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxOrders().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxaddEmployees().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxAddOrders().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxAddShifts().getSelectedItem());
        volume=options.getVolume().getLoginSoundComboBox().getText();
        message=options.getNotification().getNotificationText().getText(); 
        try {
            view.serialization(Constants.Ser_FileName);
            view.serializeAdminDesignChoicesLog(Constants.Ser_AdminDesignsFileName, designs);
            view.serializeAdminLocksChoicesLog(Constants.Ser_AdminLocksFileName, locks);
            view.serializeAdminMessageChoicesLog(Constants.Ser_AdminMessageFileName, message);
            view.serializeAdminVolumeChoicesLog(Constants.Ser_AdminVolumeFileName, volume);
        } catch (IOException ex) {
        }
    	MyFileLogWriter.saveLogFile();
        view.Quit();
    }//GEN-LAST:event_formWindowClosing

    private void showDataListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_showDataListValueChanged
        if (!showDataList.isSelectionEmpty())
        {
            addDataList.clearSelection();
            adminDataList.clearSelection();
            if(btn_showData.getBackground().getRed()==76 &&btn_showData.getBackground().getGreen()==188 && btn_showData.getBackground().getBlue()==188){
        resetColor(btn_home);
        resetColor(btn_addData);
        resetColor(btn_admin);
        setColor(btn_showData);
    }
        }
    }//GEN-LAST:event_showDataListValueChanged

    private void addDataListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_addDataListValueChanged
         if (!addDataList.isSelectionEmpty())
        {
            showDataList.clearSelection();
            adminDataList.clearSelection();
            if(btn_addData.getBackground().getRed()==76 &&btn_addData.getBackground().getGreen()==188 && btn_addData.getBackground().getBlue()==188){
        resetColor(btn_home);
        setColor(btn_addData);
        resetColor(btn_admin);
        resetColor(btn_showData);
    }
        }
    }//GEN-LAST:event_addDataListValueChanged

    private void adminDataListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_adminDataListValueChanged
         if (!adminDataList.isSelectionEmpty())
        {
            showDataList.clearSelection();
            addDataList.clearSelection();
            if(btn_admin.getBackground().getRed()==76 &&btn_admin.getBackground().getGreen()==188 && btn_admin.getBackground().getBlue()==188){
        resetColor(btn_home);
        resetColor(btn_addData);
        setColor(btn_admin);
        resetColor(btn_showData);
    }
        }
    }//GEN-LAST:event_adminDataListValueChanged

    private void languageComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_languageComboBoxActionPerformed
        int show=showDataList.getSelectedIndex();
        int add=addDataList.getSelectedIndex();
        int admin=adminDataList.getSelectedIndex();
        int emplist=showEmployeesMore.getChoiceComboBox().getSelectedIndex();
        int manulist=showManufMoreDetails.getjComboBox1().getSelectedIndex();
        int shiftlist=showShiftsMore.getChoiceComboBox().getSelectedIndex();
        int pptlist=showPPTMore.getjComboBox1().getSelectedIndex();
        int warehouselist=showWhMore.getChoiceComboBox().getSelectedIndex();
        int partlist=showPartMore.getjComboBox1().getSelectedIndex();
        int modellist=showModelMore.getjComboBox1().getSelectedIndex();
        int orderlist=showOrderMore.getjComboBox1().getSelectedIndex();
        if (languageComboBox.getSelectedItem().equals("עברית"))
        {
            Locale l = new Locale("iw", "IL");
            ResourceBundle r = ResourceBundle.getBundle("view/Bundle",l);
            ResourceBundle a = ResourceBundle.getBundle("view.MyPanels/Bundle",l);
            ResourceBundle u = ResourceBundle.getBundle("view.MyPanels.update/Bundle",l);
            ResourceBundle s = ResourceBundle.getBundle("view.MyPanels.show/Bundle",l);
            String title=label_title.getText();
            languageComboBox.setToolTipText(r.getString("UserMenu.languageComboBox.toolTipText"));
            jLabel4.setText(r.getString("UserMenu.jLabel4.text"));
            jLabel6.setText(r.getString("UserMenu.jLabel6.text"));
            jLabel10.setText(r.getString("UserMenu.jLabel10.text"));
            jLabel8.setText(r.getString("UserMenu.jLabel8.text"));
            file.setText(r.getString("UserMenu.file.text"));
            Reports.setText(r.getString("UserMenu.Reports.text"));
            Help.setText(r.getString("UserMenu.Help.text"));
            jLabel11.setText(r.getString("UserMenu.jLabel11.text"));
            logOff.setText(r.getString("UserMenu.logOff.text"));
            userText.setText("!" + showUsers.getUserName() + r.getString("UserMenu.userText.text") );
            jMenuItem5.setText(r.getString("UserMenu.jMenuItem5.text"));
            save.setText(r.getString("UserMenu.save.text"));
            exit.setText(r.getString("UserMenu.exit.text"));
            getPartsQuantityInAllOrders.setText(r.getString("UserMenu.getPartsQuantityInAllOrders.text"));
            getAllEmployeesOrderedBySalaryInMonth.setText(r.getString("UserMenu.getAllEmployeesOrderedBySalaryInMonth.text"));
            getAllEmployeesOrderedByTypeAndById.setText(r.getString("UserMenu.getAllEmployeesOrderedByTypeAndById.text"));
            getAllHourlyEmployeesWithShiftsAndSlots.setText(r.getString("UserMenu.getAllHourlyEmployeesWithShiftsAndSlots.text"));
            getAllShiftsOrderedByNumberOfProductionPlanTypes.setText(r.getString("UserMenu.getAllShiftsOrderedByNumberOfProductionPlanTypes.text"));
            getAllWarehousesInManufacturerCountry.setText(r.getString("UserMenu.getAllWarehousesInManufacturerCountry.text"));
            getKModelsWithLeastVehicles.setText(r.getString("UserMenu.getKModelsWithLeastVehicles.text"));
            getLastFutureProductionOfModel.setText(r.getString("UserMenu.getLastFutureProductionOfModel.text"));
            getMissingPartsForProductionPlan.setText(r.getString("UserMenu.getMissingPartsForProductionPlan.text"));
            getMostProfitableManufacturer.setText(r.getString("UserMenu.getMostProfitableManufacturer.text"));
            getNumberOfPartsForEachOrder.setText(r.getString("UserMenu.getNumberOfPartsForEachOrder.text"));
            getProductionPlanTypesOrderedByNumberOfSlots.setText(r.getString("UserMenu.getProductionPlanTypesOrderedByNumberOfSlots.text"));
            findShiftByTime.setText(r.getString("UserMenu.findShiftByTime.text"));
            findVehicleInCity.setText(r.getString("UserMenu.findVehicleInCity.text"));
            getPartsQuantityInAllOrders.setToolTipText(r.getString("UserMenu.getPartsQuantityInAllOrders.toolTipText"));
            getAllEmployeesOrderedBySalaryInMonth.setToolTipText(r.getString("UserMenu.getAllEmployeesOrderedBySalaryInMonth.toolTipText"));
            getAllEmployeesOrderedByTypeAndById.setToolTipText(r.getString("UserMenu.getAllEmployeesOrderedByTypeAndById.toolTipText"));
            getAllHourlyEmployeesWithShiftsAndSlots.setToolTipText(r.getString("UserMenu.getAllHourlyEmployeesWithShiftsAndSlots.toolTipText"));
            getAllShiftsOrderedByNumberOfProductionPlanTypes.setToolTipText(r.getString("UserMenu.getAllShiftsOrderedByNumberOfProductionPlanTypes.toolTipText"));
            getAllWarehousesInManufacturerCountry.setToolTipText(r.getString("UserMenu.getAllWarehousesInManufacturerCountry.toolTipText"));
            getKModelsWithLeastVehicles.setToolTipText(r.getString("UserMenu.getKModelsWithLeastVehicles.toolTipText"));
            getLastFutureProductionOfModel.setToolTipText(r.getString("UserMenu.getLastFutureProductionOfModel.toolTipText"));
            getMissingPartsForProductionPlan.setToolTipText(r.getString("UserMenu.getMissingPartsForProductionPlan.toolTipText"));
            getMostProfitableManufacturer.setToolTipText(r.getString("UserMenu.getMostProfitableManufacturer.toolTipText"));
            getNumberOfPartsForEachOrder.setToolTipText(r.getString("UserMenu.getNumberOfPartsForEachOrder.toolTipText"));
            getProductionPlanTypesOrderedByNumberOfSlots.setToolTipText(r.getString("UserMenu.getProductionPlanTypesOrderedByNumberOfSlots.toolTipText"));
            findShiftByTime.setToolTipText(r.getString("UserMenu.findShiftByTime.toolTipText"));
            findVehicleInCity.setToolTipText(r.getString("UserMenu.findVehicleInCity.toolTipText"));
            jMenuItem5.setToolTipText(r.getString("UserMenu.jMenuItem5.toolTipText"));
            logOff.setToolTipText(r.getString("UserMenu.logOff.toolTipText"));
            save.setToolTipText(r.getString("UserMenu.save.toolTipText"));
            exit.setToolTipText(r.getString("UserMenu.exit.toolTipText"));
            file.setToolTipText(r.getString("UserMenu.file.toolTipText"));
            Reports.setToolTipText(r.getString("UserMenu.Reports.toolTipText"));
            Help.setToolTipText(r.getString("UserMenu.Help.toolTipText"));
            DefaultListModel<String> adminModel= new DefaultListModel<>();
            adminModel.addElement(r.getString("UserMenu.adminDataList.modelShowUsers"));
            adminModel.addElement(r.getString("UserMenu.adminDataList.modelAddUser"));
            adminModel.addElement(r.getString("UserMenu.adminDataList.modelOptions"));
            adminDataList.setModel(adminModel);
            DefaultListModel<String> showModel= new DefaultListModel<>();
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowManufacturers"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowWarehouses"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowEmployees"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowProductionPlanTypes"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowProductionPlans"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowVehicleModels"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowVehicles"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowPartTypes"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowOrders"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowWorkstations"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowShifts"));
            showDataList.setModel(showModel);
            DefaultListModel<String> addModel= new DefaultListModel<>();
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddManufacturer"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddWarehouse"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddEmployee"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddProductionPlanType"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddProductionPlan"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddVehicleModel"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddVehicle"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddPartType"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddOrder"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddWorkstation"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddShift"));
            addDataList.setModel(addModel);
            if (show!=-1)
                showDataList.setSelectedIndex(show);
            else if (add!=-1)
                addDataList.setSelectedIndex(add);
            else if (admin!=-1)
                adminDataList.setSelectedIndex(admin);
            DefaultComboBoxModel<String> employeesMore=new DefaultComboBoxModel<>();
            employeesMore.addElement("בחר אפשרות אחת");
            employeesMore.addElement("הוסף תחנת עבודה");
            employeesMore.addElement("הוסף משמרת");
            employeesMore.addElement("הסר תחנת עבודה");
            employeesMore.addElement("הסר משמרת");
            showEmployeesMore.getChoiceComboBox().setModel(employeesMore);
            DefaultComboBoxModel<String> manuMore=new DefaultComboBoxModel<>();
            manuMore.addElement("בחר אפשרות אחת");
            manuMore.addElement("הוסף דגם");
            manuMore.addElement("הוסף קטגוריית חלק");
            manuMore.addElement("הסר דגם");
            manuMore.addElement("הסר קטגוריית חלק");
            showManufMoreDetails.getjComboBox1().setModel(manuMore);
            DefaultComboBoxModel<String> modelMore=new DefaultComboBoxModel<>();
            modelMore.addElement("בחר אפשרות אחת");
            modelMore.addElement("הוסף חלק");
            modelMore.addElement("הסר חלק");
            showModelMore.getjComboBox1().setModel(modelMore);
            DefaultComboBoxModel<String> orderMore=new DefaultComboBoxModel<>();
            orderMore.addElement("בחר אפשרות אחת");
            orderMore.addElement("הוסף חלק");
            orderMore.addElement("הסר חלק");
            showOrderMore.getjComboBox1().setModel(orderMore);
            DefaultComboBoxModel<String> partsMore=new DefaultComboBoxModel<>();
            partsMore.addElement("בחר אפשרות אחת");
            partsMore.addElement("הוסף יצרן");
            partsMore.addElement("הסר יצרן");
            showPartMore.getjComboBox1().setModel(partsMore);
            DefaultComboBoxModel<String> shiftsMore=new DefaultComboBoxModel<>();
            shiftsMore.addElement("בחר אפשרות אחת");
            shiftsMore.addElement("הוסף סלוט");
            shiftsMore.addElement("הסר סלוט");
            showShiftsMore.getChoiceComboBox().setModel(shiftsMore);
            DefaultComboBoxModel<String> warehouseMore=new DefaultComboBoxModel<>();
            warehouseMore.addElement("בחר אפשרות אחת");
            warehouseMore.addElement("הוסף רכב");
            warehouseMore.addElement("הוסף חלק");
            warehouseMore.addElement("הסר רכב");
            warehouseMore.addElement("הסר חלק");
            showWhMore.getChoiceComboBox().setModel(warehouseMore);
            DefaultComboBoxModel<String> pptMore=new DefaultComboBoxModel<>();
            pptMore.addElement("בחר אפשרות אחת");
            pptMore.addElement("הוסף תחנת עבודה");
            pptMore.addElement("הסר תחנת עבודה");
            showPPTMore.getjComboBox1().setModel(pptMore);
            if (emplist!=-1)
                showEmployeesMore.getChoiceComboBox().setSelectedIndex(emplist);
            if (manulist!=-1)
                showManufMoreDetails.getjComboBox1().setSelectedIndex(manulist);
            if (shiftlist!=-1)
                showShiftsMore.getChoiceComboBox().setSelectedIndex(shiftlist);
            if (pptlist!=-1)
                showPPTMore.getjComboBox1().setSelectedIndex(pptlist);
            if (warehouselist!=-1)
                showWhMore.getChoiceComboBox().setSelectedIndex(warehouselist);
            if (partlist!=-1)
                showPartMore.getjComboBox1().setSelectedIndex(partlist);
            if (modellist!=-1)
                showModelMore.getjComboBox1().setSelectedIndex(modellist);
            if (orderlist!=-1)
                showOrderMore.getjComboBox1().setSelectedIndex(orderlist);
            showWhMore.getAmountLabel().setText(s.getString("ShowWarehouseMore.amountLabel.text"));
            showModelMore.getAmountLabel().setText(s.getString("ShowModelMore.amountLabel.text"));
            showOrderMore.getAmountLabel().setText(s.getString("ShowOrderMore.amountLabel.text"));
            showPPTMore.getAmountLabel().setText(s.getString("ShowPPTMore.amountLabel.text"));
            m.getCountryLabel().setText(a.getString("AddManuf.countryLabel.text"));
            m.getCityLabel().setText(a.getString("AddManuf.cityLabel.text"));
            m.getStreetLabel().setText(a.getString("AddManuf.streetLabel.text"));
            m.getHnLabel().setText(a.getString("AddManuf.hnLabel.text"));
            m.getZipLabel().setText(a.getString("AddManuf.zipLabel.text"));
            m.getProfitPercentageLabel().setText(a.getString("AddManuf.profitPercentageLabel.text"));
            m.getNameLabel().setText(a.getString("AddManuf.nameLabel.text"));
            m.getjLabel25().setText(a.getString("AddManuf.jLabel25.text"));
            e.getSm_btn().setText(a.getString("AddEmployee.sm_btn.text"));
            e.getW_btn().setText(a.getString("AddEmployee.w_btn.text"));
            e.getG_btn().setText(a.getString("AddEmployee.g_btn.text"));
            e.getG().getCountryLabel().setText(a.getString("AddGuard.countryLabel.text"));
            e.getG().getCityLabel().setText(a.getString("AddGuard.cityLabel.text"));
            e.getG().getStreetLabel().setText(a.getString("AddGuard.streetLabel.text"));
            e.getG().getHnLabel().setText(a.getString("AddGuard.hnLabel.text"));
            e.getG().getZipLabel().setText(a.getString("AddGuard.zipLabel.text"));
            e.getG().getEdayLabel().setText(a.getString("AddGuard.edayLabel.text"));
            e.getG().getBdayLabel().setText(a.getString("AddGuard.bdayLabel.text"));
            e.getG().getjLabel25().setText(a.getString("AddGuard.jLabel25.text"));
            e.getG().getjLabel30().setText(a.getString("AddGuard.jLabel30.text"));
            e.getG().getjLabel31().setText(a.getString("AddGuard.jLabel31.text"));
            e.getG().getjLabel32().setText(a.getString("AddGuard.jLabel32.text"));
            e.getG().getjLabel33().setText(a.getString("AddGuard.jLabel33.text"));
            e.getG().getjLabel34().setText(a.getString("AddGuard.jLabel34.text"));
            e.getG().getjLabel35().setText(a.getString("AddGuard.jLabel35.text"));
            e.getG().getWnumberLabel().setText(a.getString("AddGuard.wnumberLabel.text"));
            e.getG().getNameLabel().setText(a.getString("AddGuard.nameLabel.text"));
            e.getG().getIdLabel().setText(a.getString("AddGuard.idLabel.text"));
            e.getG().getMsLabel().setText(a.getString("AddGuard.msLabel.text"));
            e.getSm().getCountryLabel().setText(a.getString("AddShiftM.countryLabel.text"));
            e.getSm().getCityLabel().setText(a.getString("AddShiftM.cityLabel.text"));
            e.getSm().getStreetLabel().setText(a.getString("AddShiftM.streetLabel.text"));
            e.getSm().getHnLabel().setText(a.getString("AddShiftM.hnLabel.text"));
            e.getSm().getZipLabel().setText(a.getString("AddShiftM.zipLabel.text"));
            e.getSm().getEmploymentDateLabel().setText(a.getString("AddShiftM.employmentDateLabel.text"));
            e.getSm().getBdayLabel().setText(a.getString("AddShiftM.bdayLabel.text"));
            e.getSm().getjLabel25().setText(a.getString("AddShiftM.jLabel25.text"));
            e.getSm().getjLabel30().setText(a.getString("AddShiftM.jLabel30.text"));
            e.getSm().getjLabel31().setText(a.getString("AddShiftM.jLabel31.text"));
            e.getSm().getjLabel32().setText(a.getString("AddShiftM.jLabel32.text"));
            e.getSm().getjLabel33().setText(a.getString("AddShiftM.jLabel33.text"));
            e.getSm().getjLabel34().setText(a.getString("AddShiftM.jLabel34.text"));
            e.getSm().getjLabel35().setText(a.getString("AddShiftM.jLabel35.text"));
            e.getSm().getNameLabel().setText(a.getString("AddShiftM.nameLabel.text"));
            e.getSm().getIdLabel().setText(a.getString("AddShiftM.idLabel.text"));
            e.getSm().getHourlyWageLabel().setText(a.getString("AddShiftM.hourlyWageLabel.text"));
            e.getSm().getExtraWageLabel().setText(a.getString("AddShiftM.extraWageLabel.text"));
            e.getWorker().getCountryLabel().setText(a.getString("AddWorker.countryLabel.text"));
            e.getWorker().getCityLabel().setText(a.getString("AddWorker.cityLabel.text"));
            e.getWorker().getStreetLabel().setText(a.getString("AddWorker.streetLabel.text"));
            e.getWorker().getHnLabel().setText(a.getString("AddWorker.hnLabel.text"));
            e.getWorker().getZipLabel().setText(a.getString("AddWorker.zipLabel.text"));
            e.getWorker().getEmploymentDateLabel().setText(a.getString("AddWorker.employmentDateLabel.text"));
            e.getWorker().getBirthDateLabel().setText(a.getString("AddWorker.birthDateLabel.text"));
            e.getWorker().getjLabel25().setText(a.getString("AddWorker.jLabel25.text"));
            e.getWorker().getjLabel30().setText(a.getString("AddWorker.jLabel30.text"));
            e.getWorker().getjLabel31().setText(a.getString("AddWorker.jLabel31.text"));
            e.getWorker().getjLabel32().setText(a.getString("AddWorker.jLabel32.text"));
            e.getWorker().getjLabel33().setText(a.getString("AddWorker.jLabel33.text"));
            e.getWorker().getjLabel34().setText(a.getString("AddWorker.jLabel34.text"));
            e.getWorker().getjLabel35().setText(a.getString("AddWorker.jLabel35.text"));
            e.getWorker().getNameLabel().setText(a.getString("AddWorker.nameLabel.text"));
            e.getWorker().getIdLabel().setText(a.getString("AddWorker.idLabel.text"));
            e.getWorker().getHourlyWageLabel().setText(a.getString("AddWorker.hourlyWageLabel.text"));
            o.getM_btn().setText(a.getString("AddOrder.m_btn.text"));
            o.getOrderNumberLabel().setText(a.getString("AddOrder.orderNumberLabel.text"));
            o.getOrderedFromLabel().setText(a.getString("AddOrder.orderedFromLabel.text"));
            o.getDueDateLabel().setText(a.getString("AddOrder.dueDateLabel.text"));
            o.getjLabel32().setText(a.getString("AddOrder.jLabel32.text"));
            o.getjLabel31().setText(a.getString("AddOrder.jLabel31.text"));
            o.getjLabel30().setText(a.getString("AddOrder.jLabel30.text"));
            o.getjLabel25().setText(a.getString("AddOrder.jLabel25.text"));
            o.getOrderedToNameLabel().setText(a.getString("AddOrder.orderedToNameLabel.text"));
            o.getOrderedFromNameLabel().setText(a.getString("AddOrder.orderedFromNameLabel.text"));
            o.getOrderedToLabel().setText(a.getString("AddOrder.orderedToLabel.text"));
            o.getSm_btn().setText(a.getString("AddOrder.sm_btn.text"));
            o.getM_btn2().setText(a.getString("AddOrder.m_btn2.text"));
            o.getSm_btn2().setText(a.getString("AddOrder.sm_btn2.text"));
            pp.getSerialNumberLabel().setText(a.getString("AddPP.serialNumberLabel.text"));
            pp.getjLabel25().setText(a.getString("AddPP.jLabel25.text"));
            pp.getTypeSerialNumberLabel().setText(a.getString("AddPP.typeSerialNumberLabel.text"));
            ppt.getSerialNumberLabel().setText(a.getString("AddPPT.serialNumberLabel.text"));
            ppt.getjLabel25().setText(a.getString("AddPPT.jLabel25.text"));
            ppt.getNumberOfSlotsLabel().setText(a.getString("AddPPT.numberOfSlotsLabel.text"));
            partType.getProductionCostLabel().setText(a.getString("AddPartType.productionCostLabel.text"));
            partType.getCategoryLabel().setText(a.getString("AddPartType.categoryLabel.text"));
            partType.getPartNameLabel().setText(a.getString("AddPartType.partNameLabel.text"));
            partType.getjLabel25().setText(a.getString("AddPartType.jLabel25.text"));
            partType.getPartNumberLabel().setText(a.getString("AddPartType.partNumberLabel.text"));
            shift.getStartingTimeLabel().setText(a.getString("AddShift.startingTimeLabel.text"));
            shift.getTimeLabel().setText(a.getString("AddShift.timeLabel.text"));
            shift.getjLabel25().setText(a.getString("AddShift.jLabel25.text"));
            shift.getSmLabel().setText(a.getString("AddShift.smLabel.text"));
            shift.getjLabel32().setText(a.getString("AddShift.jLabel32.text"));
            shift.getjLabel30().setText(a.getString("AddShift.jLabel30.text"));
            shift.getjLabel31().setText(a.getString("AddShift.jLabel31.text"));
            user.getSecretQuestionLabel().setText(a.getString("AddUser.secretQuestionLabel.text"));
            user.getSecretAnswerLabel().setText(a.getString("AddUser.secretAnswerLabel.text"));
            user.getTypeLabel().setText(a.getString("AddUser.typeLabel.text"));
            user.getPasswordLabel().setText(a.getString("AddUser.passwordLabel.text"));
            user.getjLabel25().setText(a.getString("AddUser.jLabel25.text"));
            user.getUsernameLabel().setText(a.getString("AddUser.usernameLabel.text"));
            v.getModelLabel1().setText(a.getString("AddVehicle.modelLabel1.text"));
            v.getVinLabel().setText(a.getString("AddVehicle.vinLabel.text"));
            v.getOrderLabel().setText(a.getString("AddVehicle.orderLabel.text"));
            v.getPpLabel().setText(a.getString("AddVehicle.ppLabel.text"));
            v.getOrderRadioButton().setText(a.getString("AddVehicle.orderRadioButton.text"));
            v.getModelLabel().setText(a.getString("AddVehicle.modelLabel.text"));
            v.getProductionRadioButton().setText(a.getString("AddVehicle.productionRadioButton.text"));
            v.getjLabel25().setText(a.getString("AddVehicle.jLabel25.text"));
            vm.getSerialLabel().setText(a.getString("AddVehicleM.serialLabel.text"));
            vm.getAutomaticLabel().setText(a.getString("AddVehicleM.automaticLabel.text"));
            vm.getTypeLabel().setText(a.getString("AddVehicleM.typeLabel.text"));
            vm.getSeatsLabel().setText(a.getString("AddVehicleM.seatsLabel.text"));
            vm.getjLabel40().setText(a.getString("AddVehicleM.jLabel40.text"));
            vm.getSpeedLabel().setText(a.getString("AddVehicleM.speedLabel.text"));
            vm.getjLabel39().setText(a.getString("AddVehicleM.jLabel39.text"));
            vm.getNameLabel().setText(a.getString("AddVehicleM.nameLabel.text"));
            vm.getjLabel38().setText(a.getString("AddVehicleM.jLabel38.text"));
            vm.getEnteredProductionLabel().setText(a.getString("AddVehicleM.enteredProductionLabel.text"));
            vm.getjLabel25().setText(a.getString("AddVehicleM.jLabel25.text"));
            vm.getHpLabel().setText(a.getString("AddVehicleM.hpLabel.text"));
            vm.getProductionCostLabel().setText(a.getString("AddVehicleM.productionCostLabel.text"));
            wh.getMaxvehiclesLabel().setText(a.getString("AddWh.maxvehiclesLabel.text"));
            wh.getMaxpartsLabel().setText(a.getString("AddWh.maxpartsLabel.text"));
            wh.getZipLabel().setText(a.getString("AddWh.zipLabel.text"));
            wh.getCountryLabel().setText(a.getString("AddWh.countryLabel.text"));
            wh.getjLabel25().setText(a.getString("AddWh.jLabel25.text"));
            wh.getCityLabel().setText(a.getString("AddWh.cityLabel.text"));
            wh.getStreetLabel().setText(a.getString("AddWh.streetLabel.text"));
            wh.getHnLabel().setText(a.getString("AddWh.hnLabel.text"));
            wh.getNumberLabel().setText(a.getString("AddWh.numberLabel.text"));
            ws.getjLabel25().setText(a.getString("AddWs.jLabel25.text"));
            ws.getStationLabel().setText(a.getString("AddWs.stationLabel.text"));
            ws.getCategoryLabel().setText(a.getString("AddWs.categoryLabel.text"));
            updateManu.getCountryLabel().setText(u.getString("UpdateManuf.countryLabel.text"));
            updateManu.getCityLabel().setText(u.getString("UpdateManuf.cityLabel.text"));
            updateManu.getStreetLabel().setText(u.getString("UpdateManuf.streetLabel.text"));
            updateManu.getHnLabel().setText(u.getString("UpdateManuf.hnLabel.text"));
            updateManu.getZipLabel().setText(u.getString("UpdateManuf.zipLabel.text"));
            updateManu.getProfitPercentageLabel().setText(u.getString("UpdateManuf.profitPercentageLabel.text"));
            updateManu.getNameLabel().setText(u.getString("UpdateManuf.nameLabel.text"));
            updateManu.getjLabel25().setText(u.getString("UpdateManuf.jLabel25.text"));
            updateGuard.getCountryLabel().setText(u.getString("UpdateGuard.countryLabel.text"));
            updateGuard.getCityLabel().setText(u.getString("UpdateGuard.cityLabel.text"));
            updateGuard.getStreetLabel().setText(u.getString("UpdateGuard.streetLabel.text"));
            updateGuard.getHnLabel().setText(u.getString("UpdateGuard.hnLabel.text"));
            updateGuard.getZipLabel().setText(u.getString("UpdateGuard.zipLabel.text"));
            updateGuard.getEdayLabel().setText(u.getString("UpdateGuard.edayLabel.text"));
            updateGuard.getBdayLabel().setText(u.getString("UpdateGuard.bdayLabel.text"));
            updateGuard.getjLabel25().setText(u.getString("UpdateGuard.jLabel25.text"));
            updateGuard.getjLabel30().setText(u.getString("UpdateGuard.jLabel30.text"));
            updateGuard.getjLabel31().setText(u.getString("UpdateGuard.jLabel31.text"));
            updateGuard.getjLabel32().setText(u.getString("UpdateGuard.jLabel32.text"));
            updateGuard.getjLabel33().setText(u.getString("UpdateGuard.jLabel33.text"));
            updateGuard.getjLabel34().setText(u.getString("UpdateGuard.jLabel34.text"));
            updateGuard.getjLabel35().setText(u.getString("UpdateGuard.jLabel35.text"));
            updateGuard.getWnumberLabel().setText(u.getString("UpdateGuard.wnumberLabel.text"));
            updateGuard.getNameLabel().setText(u.getString("UpdateGuard.nameLabel.text"));
            updateGuard.getIdLabel().setText(u.getString("UpdateGuard.idLabel.text"));
            updateGuard.getMsLabel().setText(u.getString("UpdateGuard.msLabel.text"));
            updateShiftManager.getCountryLabel().setText(u.getString("UpdateShiftM.countryLabel.text"));
            updateShiftManager.getCityLabel().setText(u.getString("UpdateShiftM.cityLabel.text"));
            updateShiftManager.getStreetLabel().setText(u.getString("UpdateShiftM.streetLabel.text"));
            updateShiftManager.getHnLabel().setText(u.getString("UpdateShiftM.hnLabel.text"));
            updateShiftManager.getZipLabel().setText(u.getString("UpdateShiftM.zipLabel.text"));
            updateShiftManager.getEmploymentDateLabel().setText(u.getString("UpdateShiftM.employmentDateLabel.text"));
            updateShiftManager.getBdayLabel().setText(u.getString("UpdateShiftM.bdayLabel.text"));
            updateShiftManager.getjLabel25().setText(u.getString("UpdateShiftM.jLabel25.text"));
            updateShiftManager.getjLabel30().setText(u.getString("UpdateShiftM.jLabel30.text"));
            updateShiftManager.getjLabel31().setText(u.getString("UpdateShiftM.jLabel31.text"));
            updateShiftManager.getjLabel32().setText(u.getString("UpdateShiftM.jLabel32.text"));
            updateShiftManager.getjLabel33().setText(u.getString("UpdateShiftM.jLabel33.text"));
            updateShiftManager.getjLabel34().setText(u.getString("UpdateShiftM.jLabel34.text"));
            updateShiftManager.getjLabel35().setText(u.getString("UpdateShiftM.jLabel35.text"));
            updateShiftManager.getNameLabel().setText(u.getString("UpdateShiftM.nameLabel.text"));
            updateShiftManager.getIdLabel().setText(u.getString("UpdateShiftM.idLabel.text"));
            updateShiftManager.getHourlyWageLabel().setText(u.getString("UpdateShiftM.hourlyWageLabel.text"));
            updateShiftManager.getExtraWageLabel().setText(u.getString("UpdateShiftM.extraWageLabel.text"));
            updateWorker.getCountryLabel().setText(u.getString("UpdateWorker.countryLabel.text"));
            updateWorker.getCityLabel().setText(u.getString("UpdateWorker.cityLabel.text"));
            updateWorker.getStreetLabel().setText(u.getString("UpdateWorker.streetLabel.text"));
            updateWorker.getHnLabel().setText(u.getString("UpdateWorker.hnLabel.text"));
            updateWorker.getZipLabel().setText(u.getString("UpdateWorker.zipLabel.text"));
            updateWorker.getEmploymentDateLabel().setText(u.getString("UpdateWorker.employmentDateLabel.text"));
            updateWorker.getBirthDateLabel().setText(u.getString("UpdateWorker.birthDateLabel.text"));
            updateWorker.getjLabel25().setText(u.getString("UpdateWorker.jLabel25.text"));
            updateWorker.getjLabel30().setText(u.getString("UpdateWorker.jLabel30.text"));
            updateWorker.getjLabel31().setText(u.getString("UpdateWorker.jLabel31.text"));
            updateWorker.getjLabel32().setText(u.getString("UpdateWorker.jLabel32.text"));
            updateWorker.getjLabel33().setText(u.getString("UpdateWorker.jLabel33.text"));
            updateWorker.getjLabel34().setText(u.getString("UpdateWorker.jLabel34.text"));
            updateWorker.getjLabel35().setText(u.getString("UpdateWorker.jLabel35.text"));
            updateWorker.getNameLabel().setText(u.getString("UpdateWorker.nameLabel.text"));
            updateWorker.getIdLabel().setText(u.getString("UpdateWorker.idLabel.text"));
            updateWorker.getHourlyWageLabel().setText(u.getString("UpdateWorker.hourlyWageLabel.text"));
            updateOrder.getM_btn().setText(u.getString("UpdateOrder.m_btn.text"));
            updateOrder.getOrderNumberLabel().setText(u.getString("UpdateOrder.orderNumberLabel.text"));
            updateOrder.getOrderedFromLabel().setText(u.getString("UpdateOrder.orderedFromLabel.text"));
            updateOrder.getDueDateLabel().setText(u.getString("UpdateOrder.dueDateLabel.text"));
            updateOrder.getjLabel32().setText(u.getString("UpdateOrder.jLabel32.text"));
            updateOrder.getjLabel31().setText(u.getString("UpdateOrder.jLabel31.text"));
            updateOrder.getjLabel30().setText(u.getString("UpdateOrder.jLabel30.text"));
            updateOrder.getjLabel25().setText(u.getString("UpdateOrder.jLabel25.text"));
            updateOrder.getOrderedToNameLabel().setText(u.getString("UpdateOrder.orderedToNameLabel.text"));
            updateOrder.getOrderedFromNameLabel().setText(u.getString("UpdateOrder.orderedFromNameLabel.text"));
            updateOrder.getOrderedToLabel().setText(u.getString("UpdateOrder.orderedToLabel.text"));
            updateOrder.getSm_btn().setText(u.getString("UpdateOrder.sm_btn.text"));
            updateOrder.getM_btn2().setText(u.getString("UpdateOrder.m_btn2.text"));
            updateOrder.getSm_btn2().setText(u.getString("UpdateOrder.sm_btn2.text"));
            updatePP.getSerialNumberLabel().setText(u.getString("UpdatePP.serialNumberLabel.text"));
            updatePP.getjLabel25().setText(u.getString("UpdatePP.jLabel25.text"));
            updatePP.getTypeSerialNumberLabel().setText(u.getString("UpdatePP.typeSerialNumberLabel.text"));
            updatePPT.getSerialNumberLabel().setText(u.getString("UpdatePPT.serialNumberLabel.text"));
            updatePPT.getjLabel25().setText(u.getString("UpdatePPT.jLabel25.text"));
            updatePPT.getNumberOfSlotsLabel().setText(u.getString("UpdatePPT.numberOfSlotsLabel.text"));
            updatePart.getProductionCostLabel().setText(u.getString("UpdatePartType.productionCostLabel.text"));
            updatePart.getCategoryLabel().setText(u.getString("UpdatePartType.categoryLabel.text"));
            updatePart.getPartNameLabel().setText(u.getString("UpdatePartType.partNameLabel.text"));
            updatePart.getjLabel25().setText(u.getString("UpdatePartType.jLabel25.text"));
            updatePart.getPartNumberLabel().setText(u.getString("UpdatePartType.partNumberLabel.text"));
            updateShift.getStartingTimeLabel().setText(u.getString("UpdateShift.startingTimeLabel.text"));
            updateShift.getTimeLabel().setText(u.getString("UpdateShift.timeLabel.text"));
            updateShift.getjLabel25().setText(u.getString("UpdateShift.jLabel25.text"));
            updateShift.getSmLabel().setText(u.getString("UpdateShift.smLabel.text"));
            updateShift.getjLabel32().setText(u.getString("UpdateShift.jLabel32.text"));
            updateShift.getjLabel30().setText(u.getString("UpdateShift.jLabel30.text"));
            updateShift.getjLabel31().setText(u.getString("UpdateShift.jLabel31.text"));
            updateUser.getSecretQuestionLabel().setText(u.getString("UpdateUser.secretQuestionLabel.text"));
            updateUser.getSecretAnswerLabel().setText(u.getString("UpdateUser.secretAnswerLabel.text"));
            updateUser.getTypeLabel().setText(u.getString("UpdateUser.typeLabel.text"));
            updateUser.getPasswordLabel().setText(u.getString("UpdateUser.passwordLabel.text"));
            updateUser.getjLabel25().setText(u.getString("UpdateUser.jLabel25.text"));
            updateUser.getUsernameLabel().setText(u.getString("UpdateUser.usernameLabel.text"));
            updateVehicle.getModelLabel1().setText(u.getString("UpdateVehicle.modelLabel1.text"));
            updateVehicle.getVinLabel().setText(u.getString("UpdateVehicle.vinLabel.text"));
            updateVehicle.getOrderLabel().setText(u.getString("UpdateVehicle.orderLabel.text"));
            updateVehicle.getPpLabel().setText(u.getString("UpdateVehicle.ppLabel.text"));
            updateVehicle.getOrderRadioButton().setText(u.getString("UpdateVehicle.orderRadioButton.text"));
            updateVehicle.getModelLabel().setText(u.getString("UpdateVehicle.modelLabel.text"));
            updateVehicle.getProductionRadioButton().setText(u.getString("UpdateVehicle.productionRadioButton.text"));
            updateVehicle.getjLabel25().setText(u.getString("UpdateVehicle.jLabel25.text"));
            updateVehicleModel.getSerialLabel().setText(u.getString("UpdateVehicleM.serialLabel.text"));
            updateVehicleModel.getAutomaticLabel().setText(u.getString("UpdateVehicleM.automaticLabel.text"));
            updateVehicleModel.getTypeLabel().setText(u.getString("UpdateVehicleM.typeLabel.text"));
            updateVehicleModel.getSeatsLabel().setText(u.getString("UpdateVehicleM.seatsLabel.text"));
            updateVehicleModel.getjLabel40().setText(u.getString("UpdateVehicleM.jLabel40.text"));
            updateVehicleModel.getSpeedLabel().setText(u.getString("UpdateVehicleM.speedLabel.text"));
            updateVehicleModel.getjLabel39().setText(u.getString("UpdateVehicleM.jLabel39.text"));
            updateVehicleModel.getNameLabel().setText(u.getString("UpdateVehicleM.nameLabel.text"));
            updateVehicleModel.getjLabel38().setText(u.getString("UpdateVehicleM.jLabel38.text"));
            updateVehicleModel.getEnteredProductionLabel().setText(u.getString("UpdateVehicleM.enteredProductionLabel.text"));
            updateVehicleModel.getjLabel25().setText(u.getString("UpdateVehicleM.jLabel25.text"));
            updateVehicleModel.getHpLabel().setText(u.getString("UpdateVehicleM.hpLabel.text"));
            updateVehicleModel.getProductionCostLabel().setText(u.getString("UpdateVehicleM.productionCostLabel.text"));
            updateWarehouse.getMaxvehiclesLabel().setText(u.getString("UpdateWh.maxvehiclesLabel.text"));
            updateWarehouse.getMaxpartsLabel().setText(u.getString("UpdateWh.maxpartsLabel.text"));
            updateWarehouse.getZipLabel().setText(u.getString("UpdateWh.zipLabel.text"));
            updateWarehouse.getCountryLabel().setText(u.getString("UpdateWh.countryLabel.text"));
            updateWarehouse.getjLabel25().setText(u.getString("UpdateWh.jLabel25.text"));
            updateWarehouse.getCityLabel().setText(u.getString("UpdateWh.cityLabel.text"));
            updateWarehouse.getStreetLabel().setText(u.getString("UpdateWh.streetLabel.text"));
            updateWarehouse.getHnLabel().setText(u.getString("UpdateWh.hnLabel.text"));
            updateWarehouse.getNumberLabel().setText(u.getString("UpdateWh.numberLabel.text"));
            updateWorkstation.getjLabel25().setText(u.getString("UpdateWs.jLabel25.text"));
            updateWorkstation.getStationLabel().setText(u.getString("UpdateWs.stationLabel.text"));
            updateWorkstation.getCategoryLabel().setText(u.getString("UpdateWs.categoryLabel.text"));
            home.getVehiclesText().setText(a.getString("Home.vehiclesText.text"));
            home.getWorkersLabel().setText(a.getString("Home.workersLabel.text"));
            options.getNotification().messageTextLimit();
            String[]hebHeadersWorkers={"מספר עובד","שם","מדינה","עיר","רחוב","מספר בית","מיקוד","תאריך לידה","תאריך תחילת ההעסקה","שכר שעתי"};
           for (int i=0;i<hebHeadersWorkers.length;i++){
           home.getWorkersTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersWorkers[i]);
           showEmployees.getWorkersTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersWorkers[i]);
           }
           String[]hebHeadersVehicles={"מספר הזיהוי של הרכב","שם הדגם","קטגוריה", "כח סוס" , "מהירות מקסימלית", "מספר מושבים", "אוטומט", "מכיר יצור", "תאריך כניסה ליצור","תכנית יצור -מספר סידורי", "סוג תכנית יצור-מספר סידורי", "סוג תכנית יצור-מספר סלוטים"};
           for (int i=0;i<hebHeadersVehicles.length;i++){
           home.getVehiclesTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersVehicles[i]);
           showVehicles.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersVehicles[i]);
           showWhMore.getVehiclesTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersVehicles[i]);
           }
           String[]hebHeadersGuards={"מספר עובד","שם","מדינה","עיר","רחוב","מספר בית","מיקוד","תאריך לידה","תאריך תחילת ההעסקה","שכר חודשי","מספר מחסן","מדינה", "עיר" , "רחוב" , "מספר בית", "מיקוד", "מכסת חלקים לאחסון", "מכסת רכבים לאחסון", "כמות החלקים הנוכחית"};
           for (int i=0;i<hebHeadersGuards.length;i++)
           showEmployees.getGuardTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersGuards[i]);
           String[]hebHeadersSM={"מספר עובד","שם","מדינה","עיר","רחוב","מספר בית","מיקוד","תאריך לידה","תאריך תחילת ההעסקה","שכר שעתי", "שכר בונוס"};
           for (int i=0;i<hebHeadersSM.length;i++)
           showEmployees.getSmTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersSM[i]);
           String[]hebHeadersManu={"שם היצרן", "מדינה" , "עיר", "רחוב", "מספר בית", "מיקוד", "אחוז רווח"};
           for (int i=0;i<hebHeadersManu.length;i++){
           showManufacturers.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersManu[i]);
           showPartMore.getManufacturerTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersManu[i]);
           }
           String[]hebHeadersModels={"שם הדגם","קטגוריה", "כח סוס" , "מהירות מקסימלית", "מספר מושבים", "אוטומט", "מחיר יצור", "תאריך כניסה ליצור", "סוג תכנית יצור-מספר סידורי", "סוג תכנית יצור-מספר סלוטים"};
           for (int i=0;i<hebHeadersModels.length;i++){
           showModels.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersModels[i]);
           showManufMoreDetails.getModelsTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersModels[i]);
           }
           String[]hebHeadersSales={"מספר הזמנה","מספר מנהל המשמרת","שם מנהל המשמרת", "מדינת מנהל המשמרת", "עיר מנהל המשמרת" , "רחוב מנהל המשמרת" , "מספר הבית של מנהל המשמרת", "מיקוד מנהל המשמרת", "תאריך הלידה של מנהל המשמרת", "תאריך תחילת ההעסקה של מנהל המשמרת", "שכר שעתי" , "שכר בונוס","שם היצרן", "מדינת היצרן" , "עיר היצרן", "רחוב היצרן", "מספר הבית של היצרן", "מיקוד היצרן", "אחוז הרווח","תאריך יעד"};
           for (int i=0;i<hebHeadersSales.length;i++)
           showOrders.getResTableSales().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersSales[i]);
           String[]hebHeadersPurchases={"מספר הזמנה","שם היצרן", "מדינת היצרן" , "עיר היצרן", "רחוב היצרן", "מספר הבית של היצרן", "מיקוד היצרן", "אחוז הרווח","מספר מנהל המשמרת","שם מנהל המשמרת", "מדינת מנהל המשמרת", "עיר מנהל המשמרת" , "רחוב מנהל המשמרת" , "מספר הבית של מנהל המשמרת", "מיקוד מנהל המשמרת", "תאריך הלידה של מנהל המשמרת", "תאריך תחילת ההעסקה של מנהל המשמרת", "שכר שעתי" , "שכר בונוס","תאריך יעד"};
           for (int i=0;i<hebHeadersPurchases.length;i++)
           showOrders.getResTablePurchases().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersPurchases[i]);
           String[]hebHeadersParts={"מספר סוג החלק","שם סוג החלק", "קטגוריה" , "מחיר יצור"};
           for (int i=0;i<hebHeadersParts.length;i++){
           showParts.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersParts[i]);
           showModelMore.getPartsTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersParts[i]);
           showOrderMore.getPartsTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersParts[i]);
           showWhMore.getPartsTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersParts[i]);
           }
           String hebHeadersPartCat="קטגוריית החלק";
           showManufMoreDetails.getPartsTable().getTableHeader().getColumnModel().getColumn(0).setHeaderValue(hebHeadersPartCat);
           String[]hebHeadersPPT={"מספר סידורי","מספר הסלוטים"};
           for (int i=0;i<hebHeadersPPT.length;i++)
           showProductionPlanTypes.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersPPT[i]);
           String[]hebHeadersPP={"תכנית יצור-מספר סידורי","סוג תכנית יצור-מספר סידורי", "סוג תכנית יצור-מספר הסלוטים"};
           for (int i=0;i<hebHeadersPP.length;i++){
           showProductionPlans.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersPP[i]);
           showShiftsMore.getPPTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersPP[i]);
           }
           String[]hebHeadersShifts={"תחילת המשמרת","מספר מנהל המשמרת","שם מנהל המשמרת", "מדינת מנהל המשמרת", "עיר מנהל המשמרת" , "רחוב מנהל המשמרת" , "מספר בית מנהל המשמרת", "מיקוד מנהל המשמרת", "תאריך הלידה של מנהל המשמרת", "תאריך תחילת ההעסקה של מנהל המשמרת", "שכר שעתי" , "שכר בונוס"};
           for (int i=0;i<hebHeadersShifts.length;i++){
           showShifts.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersShifts[i]);
           showEmployeesMore.getShiftTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersShifts[i]);
           }
           String[]hebHeadersUsers={"שם משתמש","סיסמא", "סוג" , "שאלה סודית" , "תשובה סודית"};
           for (int i=0;i<hebHeadersUsers.length;i++)
           showUsers.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersUsers[i]);
           String[]hebHeadersWarehouses={"מספר מחסן","מדינה", "עיר" , "רחוב" , "מספר בית", "מיקוד", "מכסת חלקים לאחסון", "מכסת רכבים לאחסון", "כמות החלקים הנוכחית"};
           for (int i=0;i<hebHeadersWarehouses.length;i++)
           showWarehouses.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersWarehouses[i]);
           String[]hebHeadersWorkstations={"מספר תחנת עבודה","קטגוריה"};
           for (int i=0;i<hebHeadersWorkstations.length;i++){
           showWorkstations.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersWorkstations[i]);
           showEmployeesMore.getWsTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersWorkstations[i]);
           showPPTMore.getWorkstationTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(hebHeadersWorkstations[i]);
           }
           String hebHeaderSlots="תחילת הסלוט";
           showShiftsMore.getSlotTable().getTableHeader().getColumnModel().getColumn(0).setHeaderValue(hebHeaderSlots);
           home.getWorkersTable().setAutoResizeMode(2);
           home.getVehiclesTable().setAutoResizeMode(2);
            showEmployees.getGuardTable().setAutoResizeMode(2);
            showEmployees.getSmTable().setAutoResizeMode(2);
            showEmployees.getWorkersTable().setAutoResizeMode(2);
            showManufacturers.getResTable().setAutoResizeMode(2);
            showModels.getResTable().setAutoResizeMode(2);
            showOrders.getResTableSales().setAutoResizeMode(2);
            showOrders.getResTablePurchases().setAutoResizeMode(2);
            showParts.getResTable().setAutoResizeMode(2);
            showProductionPlans.getResTable().setAutoResizeMode(2);
            showProductionPlanTypes.getResTable().setAutoResizeMode(2);
            showShifts.getResTable().setAutoResizeMode(2);
            showUsers.getResTable().setAutoResizeMode(2);
            showVehicles.getResTable().setAutoResizeMode(2);
            showWarehouses.getResTable().setAutoResizeMode(2);
            showWorkstations.getResTable().setAutoResizeMode(2);
            showEmployeesMore.getWsTable().setAutoResizeMode(2);
            showEmployeesMore.getShiftTable().setAutoResizeMode(2);
            showManufMoreDetails.getPartsTable().setAutoResizeMode(2);
            showManufMoreDetails.getModelsTable().setAutoResizeMode(2);
            showModelMore.getPartsTable().setAutoResizeMode(2);
            showOrderMore.getPartsTable().setAutoResizeMode(2);
            showPPTMore.getWorkstationTable().setAutoResizeMode(2);
            showPartMore.getManufacturerTable().setAutoResizeMode(2);
            showShiftsMore.getSlotTable().setAutoResizeMode(2);
            showShiftsMore.getPPTable().setAutoResizeMode(2);
            showWhMore.getPartsTable().setAutoResizeMode(2);
            showWhMore.getVehiclesTable().setAutoResizeMode(2);
           showEmployees.getRemove().setText(s.getString("ShowEmployees.remove.text"));
           showEmployees.getUpdate().setText(s.getString("ShowEmployees.update.text"));
           showEmployees.getMore().setText(s.getString("ShowEmployees.more.text"));
           showEmployees.getSmLabel().setText(s.getString("ShowEmployees.smLabel.text"));
           showEmployees.getWorkersLabel().setText(s.getString("ShowEmployees.workersLabel.text"));
           showEmployees.getGuardLabel().setText(s.getString("ShowEmployees.guardLabel.text"));
           showManufacturers.getRemove().setText(s.getString("ShowManufacturers.remove.text"));
           showManufacturers.getUpdate().setText(s.getString("ShowManufacturers.update.text"));
           showManufacturers.getMore().setText(s.getString("ShowManufacturers.more.text"));
           showModels.getRemove().setText(s.getString("ShowModels.remove.text"));
           showModels.getUpdate().setText(s.getString("ShowModels.update.text"));
           showModels.getMore().setText(s.getString("ShowModels.more.text"));
           showOrders.getRemove().setText(s.getString("ShowOrders.remove.text"));
           showOrders.getUpdate().setText(s.getString("ShowOrders.update.text"));
           showOrders.getMore().setText(s.getString("ShowOrders.more.text"));
           showOrders.getjLabel1().setText(s.getString("ShowOrders.jLabel1.text"));
           showOrders.getjLabel2().setText(s.getString("ShowOrders.jLabel2.text"));
           showParts.getRemove().setText(s.getString("ShowParts.remove.text"));
           showParts.getUpdate().setText(s.getString("ShowParts.update.text"));
           showParts.getMore().setText(s.getString("ShowParts.more.text"));
           showProductionPlans.getRemove().setText(s.getString("ShowProductionPlans.remove.text"));
           showProductionPlans.getUpdate().setText(s.getString("ShowProductionPlans.update.text"));
           showProductionPlanTypes.getRemove1().setText(s.getString("ShowProductionPlanTypes.remove1.text"));
           showProductionPlanTypes.getUpdate().setText(s.getString("ShowProductionPlanTypes.update.text"));
           showProductionPlanTypes.getMore().setText(s.getString("ShowProductionPlanTypes.more.text"));
           showShifts.getRemove().setText(s.getString("ShowShifts.remove.text"));
           showShifts.getUpdate().setText(s.getString("ShowShifts.update.text"));
           showShifts.getManageSlots().setText(s.getString("ShowShifts.manageSlots.text"));
           showUsers.getRemove().setText(s.getString("ShowUsers.remove.text"));
           showUsers.getUpdate().setText(s.getString("ShowUsers.update.text"));
           showVehicles.getRemove().setText(s.getString("ShowVehicles.remove.text"));
           showVehicles.getUpdate().setText(s.getString("ShowVehicles.update.text"));
           showWarehouses.getRemove().setText(s.getString("ShowWarehouses.remove.text"));
           showWarehouses.getUpdate().setText(s.getString("ShowWarehouses.update.text"));
           showWarehouses.getMore().setText(s.getString("ShowWarehouses.more.text"));
           showWorkstations.getRemove().setText(s.getString("ShowWorkstations.remove.text"));
           showWorkstations.getUpdate().setText(s.getString("ShowWorkstations.update.text"));
           options.getNotification().getSaveButton().setText(a.getString("Notification.saveButton.text"));
           if (showManufMoreDetails.getBtn_name().getText().equals("Add"))
           showManufMoreDetails.getBtn_name().setText(("הוסף"));
           else if (showManufMoreDetails.getBtn_name().getText().equals("Remove"))
               showManufMoreDetails.getBtn_name().setText(("הסר"));
           if (showEmployeesMore.getBtn_name().getText().equals("Add"))
           showEmployeesMore.getBtn_name().setText(("הוסף"));
           else if (showEmployeesMore.getBtn_name().getText().equals("Remove"))
               showEmployeesMore.getBtn_name().setText(("הסר"));
           if (showModelMore.getBtn_name().getText().equals("Add"))
           showModelMore.getBtn_name().setText(("הוסף"));
           else if (showModelMore.getBtn_name().getText().equals("Remove"))
               showModelMore.getBtn_name().setText(("הסר"));
           if (showOrderMore.getBtn_name().getText().equals("Add"))
           showOrderMore.getBtn_name().setText(("הוסף"));
           else if (showOrderMore.getBtn_name().getText().equals("Remove"))
               showOrderMore.getBtn_name().setText(("הסר"));
           if (showPPTMore.getBtn_name().getText().equals("Add"))
           showPPTMore.getBtn_name().setText(("הוסף"));
           else if (showPPTMore.getBtn_name().getText().equals("Remove"))
               showPPTMore.getBtn_name().setText(("הסר"));
           if (showPartMore.getBtn_name().getText().equals("Add"))
           showPartMore.getBtn_name().setText(("הוסף"));
           else if (showPartMore.getBtn_name().getText().equals("Remove"))
               showPartMore.getBtn_name().setText(("הסר"));
           if (showShiftsMore.getBtn_name().getText().equals("Add"))
           showShiftsMore.getBtn_name().setText(("הוסף"));
           else if (showShiftsMore.getBtn_name().getText().equals("Remove"))
               showShiftsMore.getBtn_name().setText(("הסר"));
           if (showWhMore.getBtn_name().getText().equals("Add"))
           showWhMore.getBtn_name().setText(("הוסף"));
           else if (showWhMore.getBtn_name().getText().equals("Remove"))
               showWhMore.getBtn_name().setText(("הסר"));
           label_title.setHorizontalAlignment(SwingConstants.RIGHT);
           if (title.equals("All Users"))
               label_title.setText("כל המשתמשים");
           else if (title.equals("All Manufacturers"))
               label_title.setText("כל היצרנים");
           else if (title.equals("All Warehouses"))
               label_title.setText("כל המחסנים");
           else if (title.equals("All Employees"))
               label_title.setText("כל העובדים");
           else if (title.equals("All Production Plan Types"))
               label_title.setText("כל סוגי תכניות היצור");
           else if (title.equals("All Production Plans"))
               label_title.setText("כל תכניות היצור");
           else if (title.equals("All Vehicle Models"))
               label_title.setText("כל דגמי הרכב");
           else if (title.equals("All Vehicles"))
               label_title.setText("כל הרכבים");
           else if (title.equals("All PartTypes"))
               label_title.setText("כל סוגי החלקים");
           else if (title.equals("All Orders"))
               label_title.setText("כל ההזמנות");
           else if (title.equals("All Workstations"))
               label_title.setText("כל תחנות העבודה");
           else if (title.equals("All Shifts"))
               label_title.setText("כל המשמרות");
           else if (title.equals("Add User"))
               label_title.setText("הוסף משתמש");
           else if (title.equals("Add Manufacturer"))
               label_title.setText("הוסף יצרן");
           else if (title.equals("Add Warehouse"))
               label_title.setText("הוסף מחסן");
           else if (title.equals("Add Production Plan Type"))
               label_title.setText("הוסף סוג תכנית יצור");
           else if (title.equals("Add Production Plan"))
               label_title.setText("הוסף תכנית יצור");
           else if (title.equals("Add Vehicle Model"))
               label_title.setText("הוסף דגם רכב");
           else if (title.equals("Add Vehicle"))
               label_title.setText("הוסף רכב");
           else if (title.equals("Add PartType"))
               label_title.setText("הוסף סוג חלק");
           else if (title.equals("Add Order"))
               label_title.setText("הוסף הזמנה");
           else if (title.equals("Add Workstation"))
               label_title.setText("הוסף תחנת עבודה");
           else if (title.equals("Add Shift"))
               label_title.setText("הוסף משמרת");
           else if (title.equals("Add Employee"))
               label_title.setText("הוסף עובד");
           else if (title.equals("Add Worker"))
               label_title.setText("הוסף פועל");
           else if (title.equals("Add Shift Manager"))
               label_title.setText("הוסף מנהל משמרת");
           else if (title.equals("Add Guard"))
               label_title.setText("הוסף שומר");
           else if (title.equals("Options"))
               label_title.setText("אפשרויות");
           else if (title.equals("Update User"))
               label_title.setText("עדכן משתמש");
           else if (title.equals("Update Manufacturer"))
               label_title.setText("עדכן יצרן");
           else if (title.equals("Update Warehouse"))
               label_title.setText("עדכן מחסן");
           else if (title.equals("Update Production Plan Type"))
               label_title.setText("עדכן סוג תכנית יצור");
           else if (title.equals("Update Production Plan"))
               label_title.setText("עדכן תכנית יצור");
           else if (title.equals("Update Vehicle Model"))
               label_title.setText("עדכן דגם רכב");
           else if (title.equals("Update Vehicle"))
               label_title.setText("עדכן רכב");
           else if (title.equals("Update Part Type"))
               label_title.setText("עדכן סוג חלק");
           else if (title.equals("Update Order"))
               label_title.setText("עדכן הזמנה");
           else if (title.equals("Update Workstation"))
               label_title.setText("עדכן תחנת עבודה");
           else if (title.equals("Update Shift"))
               label_title.setText("עדכן משמרת");
           else if (title.equals("Update Employee"))
               label_title.setText("עדכן עובד");
           else if (title.equals("Update Worker"))
               label_title.setText("עדכן פועל");
           else if (title.equals("Update Shift Manager"))
               label_title.setText("עדכן מנהל משמרת");
           else if (title.equals("Update Guard"))
               label_title.setText("עדכן שומר");
           else if (title.equals("Home"))
               label_title.setText("ראשי");
           else if (title.equals("All Manufacturers - More"))
               label_title.setText("כל היצרנים - אפשרויות נוספות");
           else if (title.equals("All Warehouses - More"))
               label_title.setText("כל המחסנים - אפשרויות נוספות");
           else if (title.equals("All Employees - More"))
               label_title.setText("כל העובדים - אפשרויות נוספות");
           else if (title.equals("All Production Plan Types - More"))
               label_title.setText("כל סוגי תכניות היצור - אפשרויות נוספות");
           else if (title.equals("All Shifts - More"))
               label_title.setText("כל המשמרות - אפשרויות נוספות");
           else if (title.equals("All Vehicle Models - More"))
               label_title.setText("כל דגמי הרכב - אפשרויות נוספות");
           else if (title.equals("All PartTypes - More"))
               label_title.setText("כל סוגי החלקים - אפשרויות נוספות");
           else if (title.equals("All Orders - More"))
               label_title.setText("כל ההזמנות - אפשרויות נוספות");
           options.getVolume().getLoginVolumeLabel().setText(a.getString("VolumePanel.loginVolumeLabel.text"));
           options.getLock().getAddEmployeesLabel().setText(a.getString("lockPanel.addEmployeesLabel.text"));
           options.getLock().getAddOrdersLabel().setText(a.getString("lockPanel.addOrdersLabel.text"));
           options.getLock().getAddShiftsLabel().setText(a.getString("lockPanel.addShiftsLabel.text"));
           options.getLock().getUpdateEmployeeLabel().setText(a.getString("lockPanel.updateEmployeeLabel.text"));
           options.getLock().getUpdateOrdersLabel().setText(a.getString("lockPanel.updateOrdersLabel.text"));
           options.getNotification().getMessageLabel().setText(a.getString("Notification.messageLabel.text"));
           options.getDesign().getBackgroundColorLabel().setText(a.getString("DesignPanel.backgroundColorLabel.text"));
           options.getDesign().getSidebarLabel().setText(a.getString("DesignPanel.sidebarLabel.text"));
           options.getNotification().getMessageLabel().setHorizontalAlignment(SwingConstants.RIGHT);
           if (options.getLock().getjComboBoxOrders().getSelectedItem().equals("Disabled"))
           showOrders.getUpdate().setToolTipText("האפשרות לעדכן כרגע סגורה!");
           else if (options.getLock().getjComboBoxOrders().getSelectedItem().equals("Enabled"))
           showOrders.getUpdate().setToolTipText("");
           if (options.getLock().getjComboBoxEmployees().getSelectedItem().equals("Disabled"))
           showEmployees.getUpdate().setToolTipText("האפשרות לעדכן כרגע סגורה!");
           else if (options.getLock().getjComboBoxEmployees().getSelectedItem().equals("Enabled"))
           showEmployees.getUpdate().setToolTipText("");
        }
        else if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
        {
            Locale l = new Locale("en", "US");
            ResourceBundle r = ResourceBundle.getBundle("view/Bundle",l);
            ResourceBundle a = ResourceBundle.getBundle("view.MyPanels/Bundle",l);
            ResourceBundle u = ResourceBundle.getBundle("view.MyPanels.update/Bundle",l);
            ResourceBundle s = ResourceBundle.getBundle("view.MyPanels.show/Bundle",l);
            String title=label_title.getText();
            languageComboBox.setToolTipText(r.getString("UserMenu.languageComboBox.toolTipText"));
            jLabel4.setText(r.getString("UserMenu.jLabel4.text"));
            jLabel6.setText(r.getString("UserMenu.jLabel6.text"));
            jLabel10.setText(r.getString("UserMenu.jLabel10.text"));
            jLabel8.setText(r.getString("UserMenu.jLabel8.text"));
            file.setText(r.getString("UserMenu.file.text"));
            Reports.setText(r.getString("UserMenu.Reports.text"));
            Help.setText(r.getString("UserMenu.Help.text"));
            jLabel11.setText(r.getString("UserMenu.jLabel11.text"));
            userText.setText(r.getString("UserMenu.userText.text") + showUsers.getUserName() + "!");
            jMenuItem5.setText(r.getString("UserMenu.jMenuItem5.text"));
            logOff.setText(r.getString("UserMenu.logOff.text"));
            save.setText(r.getString("UserMenu.save.text"));
            exit.setText(r.getString("UserMenu.exit.text"));
            getPartsQuantityInAllOrders.setText(r.getString("UserMenu.getPartsQuantityInAllOrders.text"));
            getAllEmployeesOrderedBySalaryInMonth.setText(r.getString("UserMenu.getAllEmployeesOrderedBySalaryInMonth.text"));
            getAllEmployeesOrderedByTypeAndById.setText(r.getString("UserMenu.getAllEmployeesOrderedByTypeAndById.text"));
            getAllHourlyEmployeesWithShiftsAndSlots.setText(r.getString("UserMenu.getAllHourlyEmployeesWithShiftsAndSlots.text"));
            getAllShiftsOrderedByNumberOfProductionPlanTypes.setText(r.getString("UserMenu.getAllShiftsOrderedByNumberOfProductionPlanTypes.text"));
            getAllWarehousesInManufacturerCountry.setText(r.getString("UserMenu.getAllWarehousesInManufacturerCountry.text"));
            getKModelsWithLeastVehicles.setText(r.getString("UserMenu.getKModelsWithLeastVehicles.text"));
            getLastFutureProductionOfModel.setText(r.getString("UserMenu.getLastFutureProductionOfModel.text"));
            getMissingPartsForProductionPlan.setText(r.getString("UserMenu.getMissingPartsForProductionPlan.text"));
            getMostProfitableManufacturer.setText(r.getString("UserMenu.getMostProfitableManufacturer.text"));
            getNumberOfPartsForEachOrder.setText(r.getString("UserMenu.getNumberOfPartsForEachOrder.text"));
            getProductionPlanTypesOrderedByNumberOfSlots.setText(r.getString("UserMenu.getProductionPlanTypesOrderedByNumberOfSlots.text"));
            findShiftByTime.setText(r.getString("UserMenu.findShiftByTime.text"));
            findVehicleInCity.setText(r.getString("UserMenu.findVehicleInCity.text"));
            getPartsQuantityInAllOrders.setToolTipText(r.getString("UserMenu.getPartsQuantityInAllOrders.toolTipText"));
            getAllEmployeesOrderedBySalaryInMonth.setToolTipText(r.getString("UserMenu.getAllEmployeesOrderedBySalaryInMonth.toolTipText"));
            getAllEmployeesOrderedByTypeAndById.setToolTipText(r.getString("UserMenu.getAllEmployeesOrderedByTypeAndById.toolTipText"));
            getAllHourlyEmployeesWithShiftsAndSlots.setToolTipText(r.getString("UserMenu.getAllHourlyEmployeesWithShiftsAndSlots.toolTipText"));
            getAllShiftsOrderedByNumberOfProductionPlanTypes.setToolTipText(r.getString("UserMenu.getAllShiftsOrderedByNumberOfProductionPlanTypes.toolTipText"));
            getAllWarehousesInManufacturerCountry.setToolTipText(r.getString("UserMenu.getAllWarehousesInManufacturerCountry.toolTipText"));
            getKModelsWithLeastVehicles.setToolTipText(r.getString("UserMenu.getKModelsWithLeastVehicles.toolTipText"));
            getLastFutureProductionOfModel.setToolTipText(r.getString("UserMenu.getLastFutureProductionOfModel.toolTipText"));
            getMissingPartsForProductionPlan.setToolTipText(r.getString("UserMenu.getMissingPartsForProductionPlan.toolTipText"));
            getMostProfitableManufacturer.setToolTipText(r.getString("UserMenu.getMostProfitableManufacturer.toolTipText"));
            getNumberOfPartsForEachOrder.setToolTipText(r.getString("UserMenu.getNumberOfPartsForEachOrder.toolTipText"));
            getProductionPlanTypesOrderedByNumberOfSlots.setToolTipText(r.getString("UserMenu.getProductionPlanTypesOrderedByNumberOfSlots.toolTipText"));
            findShiftByTime.setToolTipText(r.getString("UserMenu.findShiftByTime.toolTipText"));
            findVehicleInCity.setToolTipText(r.getString("UserMenu.findVehicleInCity.toolTipText"));
            jMenuItem5.setToolTipText(r.getString("UserMenu.jMenuItem5.toolTipText"));
            logOff.setToolTipText(r.getString("UserMenu.logOff.toolTipText"));
            save.setToolTipText(r.getString("UserMenu.save.toolTipText"));
            exit.setToolTipText(r.getString("UserMenu.exit.toolTipText"));
            file.setToolTipText(r.getString("UserMenu.file.toolTipText"));
            Reports.setToolTipText(r.getString("UserMenu.Reports.toolTipText"));
            Help.setToolTipText(r.getString("UserMenu.Help.toolTipText"));
            DefaultListModel<String> adminModel= new DefaultListModel<>();
            adminModel.addElement(r.getString("UserMenu.adminDataList.modelShowUsers"));
            adminModel.addElement(r.getString("UserMenu.adminDataList.modelAddUser"));
            adminModel.addElement(r.getString("UserMenu.adminDataList.modelOptions"));
            adminDataList.setModel(adminModel);
            DefaultListModel<String> showModel= new DefaultListModel<>();
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowManufacturers"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowWarehouses"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowEmployees"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowProductionPlanTypes"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowProductionPlans"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowVehicleModels"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowVehicles"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowPartTypes"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowOrders"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowWorkstations"));
            showModel.addElement(r.getString("UserMenu.showDataList.modelShowShifts"));
            showDataList.setModel(showModel);
            DefaultListModel<String> addModel= new DefaultListModel<>();
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddManufacturer"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddWarehouse"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddEmployee"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddProductionPlanType"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddProductionPlan"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddVehicleModel"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddVehicle"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddPartType"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddOrder"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddWorkstation"));
            addModel.addElement(r.getString("UserMenu.showDataList.modelAddShift"));
            addDataList.setModel(addModel);
            if (show!=-1)
                showDataList.setSelectedIndex(show);
            else if (add!=-1)
                addDataList.setSelectedIndex(add);
            else if (admin!=-1)
                adminDataList.setSelectedIndex(admin);
            DefaultComboBoxModel<String> employeesMore=new DefaultComboBoxModel<>();
            employeesMore.addElement("Choose one option");
            employeesMore.addElement("Add Workstation");
            employeesMore.addElement("Add Shift");
            employeesMore.addElement("Remove Workstation");
            employeesMore.addElement("Remove Shift");
            showEmployeesMore.getChoiceComboBox().setModel(employeesMore);
            DefaultComboBoxModel<String> manuMore=new DefaultComboBoxModel<>();
            manuMore.addElement("Choose one option");
            manuMore.addElement("Add Model");
            manuMore.addElement("Add Part Category");
            manuMore.addElement("Remove Model");
            manuMore.addElement("Remove Part Category");
            showManufMoreDetails.getjComboBox1().setModel(manuMore);
            DefaultComboBoxModel<String> modelMore=new DefaultComboBoxModel<>();
            modelMore.addElement("Choose one option");
            modelMore.addElement("Add Part");
            modelMore.addElement("Remove Part");
            showModelMore.getjComboBox1().setModel(modelMore);
            DefaultComboBoxModel<String> orderMore=new DefaultComboBoxModel<>();
            orderMore.addElement("Choose one option");
            orderMore.addElement("Add Part");
            orderMore.addElement("Remove Part");
            showOrderMore.getjComboBox1().setModel(orderMore);
            DefaultComboBoxModel<String> partsMore=new DefaultComboBoxModel<>();
            partsMore.addElement("Choose one option");
            partsMore.addElement("Add Manufacturer");
            partsMore.addElement("Remove Manufacturer");
            showPartMore.getjComboBox1().setModel(partsMore);
            DefaultComboBoxModel<String> shiftsMore=new DefaultComboBoxModel<>();
            shiftsMore.addElement("Choose one option");
            shiftsMore.addElement("Add Slot");
            shiftsMore.addElement("Remove Slot");
            showShiftsMore.getChoiceComboBox().setModel(shiftsMore);
            DefaultComboBoxModel<String> warehouseMore=new DefaultComboBoxModel<>();
            warehouseMore.addElement("Choose one option");
            warehouseMore.addElement("Add Vehicle");
            warehouseMore.addElement("Add Part");
            warehouseMore.addElement("Remove Vehicle");
            warehouseMore.addElement("Remove Part");
            showWhMore.getChoiceComboBox().setModel(warehouseMore);
            DefaultComboBoxModel<String> pptMore=new DefaultComboBoxModel<>();
            pptMore.addElement("Choose one option");
            pptMore.addElement("Add Workstation");
            pptMore.addElement("Remove Workstation");
            showPPTMore.getjComboBox1().setModel(pptMore);
            if (emplist!=-1)
                showEmployeesMore.getChoiceComboBox().setSelectedIndex(emplist);
            if (manulist!=-1)
                showManufMoreDetails.getjComboBox1().setSelectedIndex(manulist);
            if (shiftlist!=-1)
                showShiftsMore.getChoiceComboBox().setSelectedIndex(shiftlist);
            if (pptlist!=-1)
                showPPTMore.getjComboBox1().setSelectedIndex(pptlist);
            if (warehouselist!=-1)
                showWhMore.getChoiceComboBox().setSelectedIndex(warehouselist);
            if (partlist!=-1)
                showPartMore.getjComboBox1().setSelectedIndex(partlist);
            if (modellist!=-1)
                showModelMore.getjComboBox1().setSelectedIndex(modellist);
            if (orderlist!=-1)
                showOrderMore.getjComboBox1().setSelectedIndex(orderlist);
            showWhMore.getAmountLabel().setText(s.getString("ShowWarehouseMore.amountLabel.text"));
            showModelMore.getAmountLabel().setText(s.getString("ShowModelMore.amountLabel.text"));
            showOrderMore.getAmountLabel().setText(s.getString("ShowOrderMore.amountLabel.text"));
            showPPTMore.getAmountLabel().setText(s.getString("ShowPPTMore.amountLabel.text"));
            m.getCountryLabel().setText(a.getString("AddManuf.countryLabel.text"));
            m.getCityLabel().setText(a.getString("AddManuf.cityLabel.text"));
            m.getStreetLabel().setText(a.getString("AddManuf.streetLabel.text"));
            m.getHnLabel().setText(a.getString("AddManuf.hnLabel.text"));
            m.getZipLabel().setText(a.getString("AddManuf.zipLabel.text"));
            m.getProfitPercentageLabel().setText(a.getString("AddManuf.profitPercentageLabel.text"));
            m.getNameLabel().setText(a.getString("AddManuf.nameLabel.text"));
            m.getjLabel25().setText(a.getString("AddManuf.jLabel25.text"));
            e.getSm_btn().setText(a.getString("AddEmployee.sm_btn.text"));
            e.getW_btn().setText(a.getString("AddEmployee.w_btn.text"));
            e.getG_btn().setText(a.getString("AddEmployee.g_btn.text"));
            e.getG().getCountryLabel().setText(a.getString("AddGuard.countryLabel.text"));
            e.getG().getCityLabel().setText(a.getString("AddGuard.cityLabel.text"));
            e.getG().getStreetLabel().setText(a.getString("AddGuard.streetLabel.text"));
            e.getG().getHnLabel().setText(a.getString("AddGuard.hnLabel.text"));
            e.getG().getZipLabel().setText(a.getString("AddGuard.zipLabel.text"));
            e.getG().getEdayLabel().setText(a.getString("AddGuard.edayLabel.text"));
            e.getG().getBdayLabel().setText(a.getString("AddGuard.bdayLabel.text"));
            e.getG().getjLabel25().setText(a.getString("AddGuard.jLabel25.text"));
            e.getG().getjLabel30().setText(a.getString("AddGuard.jLabel30.text"));
            e.getG().getjLabel31().setText(a.getString("AddGuard.jLabel31.text"));
            e.getG().getjLabel32().setText(a.getString("AddGuard.jLabel32.text"));
            e.getG().getjLabel33().setText(a.getString("AddGuard.jLabel33.text"));
            e.getG().getjLabel34().setText(a.getString("AddGuard.jLabel34.text"));
            e.getG().getjLabel35().setText(a.getString("AddGuard.jLabel35.text"));
            e.getG().getWnumberLabel().setText(a.getString("AddGuard.wnumberLabel.text"));
            e.getG().getNameLabel().setText(a.getString("AddGuard.nameLabel.text"));
            e.getG().getIdLabel().setText(a.getString("AddGuard.idLabel.text"));
            e.getG().getMsLabel().setText(a.getString("AddGuard.msLabel.text"));
            e.getSm().getCountryLabel().setText(a.getString("AddShiftM.countryLabel.text"));
            e.getSm().getCityLabel().setText(a.getString("AddShiftM.cityLabel.text"));
            e.getSm().getStreetLabel().setText(a.getString("AddShiftM.streetLabel.text"));
            e.getSm().getHnLabel().setText(a.getString("AddShiftM.hnLabel.text"));
            e.getSm().getZipLabel().setText(a.getString("AddShiftM.zipLabel.text"));
            e.getSm().getEmploymentDateLabel().setText(a.getString("AddShiftM.employmentDateLabel.text"));
            e.getSm().getBdayLabel().setText(a.getString("AddShiftM.bdayLabel.text"));
            e.getSm().getjLabel25().setText(a.getString("AddShiftM.jLabel25.text"));
            e.getSm().getjLabel30().setText(a.getString("AddShiftM.jLabel30.text"));
            e.getSm().getjLabel31().setText(a.getString("AddShiftM.jLabel31.text"));
            e.getSm().getjLabel32().setText(a.getString("AddShiftM.jLabel32.text"));
            e.getSm().getjLabel33().setText(a.getString("AddShiftM.jLabel33.text"));
            e.getSm().getjLabel34().setText(a.getString("AddShiftM.jLabel34.text"));
            e.getSm().getjLabel35().setText(a.getString("AddShiftM.jLabel35.text"));
            e.getSm().getNameLabel().setText(a.getString("AddShiftM.nameLabel.text"));
            e.getSm().getIdLabel().setText(a.getString("AddShiftM.idLabel.text"));
            e.getSm().getHourlyWageLabel().setText(a.getString("AddShiftM.hourlyWageLabel.text"));
            e.getSm().getExtraWageLabel().setText(a.getString("AddShiftM.extraWageLabel.text"));
            e.getWorker().getCountryLabel().setText(a.getString("AddWorker.countryLabel.text"));
            e.getWorker().getCityLabel().setText(a.getString("AddWorker.cityLabel.text"));
            e.getWorker().getStreetLabel().setText(a.getString("AddWorker.streetLabel.text"));
            e.getWorker().getHnLabel().setText(a.getString("AddWorker.hnLabel.text"));
            e.getWorker().getZipLabel().setText(a.getString("AddWorker.zipLabel.text"));
            e.getWorker().getEmploymentDateLabel().setText(a.getString("AddWorker.employmentDateLabel.text"));
            e.getWorker().getBirthDateLabel().setText(a.getString("AddWorker.birthDateLabel.text"));
            e.getWorker().getjLabel25().setText(a.getString("AddWorker.jLabel25.text"));
            e.getWorker().getjLabel30().setText(a.getString("AddWorker.jLabel30.text"));
            e.getWorker().getjLabel31().setText(a.getString("AddWorker.jLabel31.text"));
            e.getWorker().getjLabel32().setText(a.getString("AddWorker.jLabel32.text"));
            e.getWorker().getjLabel33().setText(a.getString("AddWorker.jLabel33.text"));
            e.getWorker().getjLabel34().setText(a.getString("AddWorker.jLabel34.text"));
            e.getWorker().getjLabel35().setText(a.getString("AddWorker.jLabel35.text"));
            e.getWorker().getNameLabel().setText(a.getString("AddWorker.nameLabel.text"));
            e.getWorker().getIdLabel().setText(a.getString("AddWorker.idLabel.text"));
            e.getWorker().getHourlyWageLabel().setText(a.getString("AddWorker.hourlyWageLabel.text"));
            o.getM_btn().setText(a.getString("AddOrder.m_btn.text"));
            o.getOrderNumberLabel().setText(a.getString("AddOrder.orderNumberLabel.text"));
            o.getOrderedFromLabel().setText(a.getString("AddOrder.orderedFromLabel.text"));
            o.getDueDateLabel().setText(a.getString("AddOrder.dueDateLabel.text"));
            o.getjLabel32().setText(a.getString("AddOrder.jLabel32.text"));
            o.getjLabel31().setText(a.getString("AddOrder.jLabel31.text"));
            o.getjLabel30().setText(a.getString("AddOrder.jLabel30.text"));
            o.getjLabel25().setText(a.getString("AddOrder.jLabel25.text"));
            o.getOrderedToNameLabel().setText(a.getString("AddOrder.orderedToNameLabel.text"));
            o.getOrderedFromNameLabel().setText(a.getString("AddOrder.orderedFromNameLabel.text"));
            o.getOrderedToLabel().setText(a.getString("AddOrder.orderedToLabel.text"));
            o.getSm_btn().setText(a.getString("AddOrder.sm_btn.text"));
            o.getM_btn2().setText(a.getString("AddOrder.m_btn2.text"));
            o.getSm_btn2().setText(a.getString("AddOrder.sm_btn2.text"));
            pp.getSerialNumberLabel().setText(a.getString("AddPP.serialNumberLabel.text"));
            pp.getjLabel25().setText(a.getString("AddPP.jLabel25.text"));
            pp.getTypeSerialNumberLabel().setText(a.getString("AddPP.typeSerialNumberLabel.text"));
            ppt.getSerialNumberLabel().setText(a.getString("AddPPT.serialNumberLabel.text"));
            ppt.getjLabel25().setText(a.getString("AddPPT.jLabel25.text"));
            ppt.getNumberOfSlotsLabel().setText(a.getString("AddPPT.numberOfSlotsLabel.text"));
            partType.getProductionCostLabel().setText(a.getString("AddPartType.productionCostLabel.text"));
            partType.getCategoryLabel().setText(a.getString("AddPartType.categoryLabel.text"));
            partType.getPartNameLabel().setText(a.getString("AddPartType.partNameLabel.text"));
            partType.getjLabel25().setText(a.getString("AddPartType.jLabel25.text"));
            partType.getPartNumberLabel().setText(a.getString("AddPartType.partNumberLabel.text"));
            shift.getStartingTimeLabel().setText(a.getString("AddShift.startingTimeLabel.text"));
            shift.getTimeLabel().setText(a.getString("AddShift.timeLabel.text"));
            shift.getjLabel25().setText(a.getString("AddShift.jLabel25.text"));
            shift.getSmLabel().setText(a.getString("AddShift.smLabel.text"));
            shift.getjLabel32().setText(a.getString("AddShift.jLabel32.text"));
            shift.getjLabel30().setText(a.getString("AddShift.jLabel30.text"));
            shift.getjLabel31().setText(a.getString("AddShift.jLabel31.text"));
            user.getSecretQuestionLabel().setText(a.getString("AddUser.secretQuestionLabel.text"));
            user.getSecretAnswerLabel().setText(a.getString("AddUser.secretAnswerLabel.text"));
            user.getTypeLabel().setText(a.getString("AddUser.typeLabel.text"));
            user.getPasswordLabel().setText(a.getString("AddUser.passwordLabel.text"));
            user.getjLabel25().setText(a.getString("AddUser.jLabel25.text"));
            user.getUsernameLabel().setText(a.getString("AddUser.usernameLabel.text"));
            v.getModelLabel1().setText(a.getString("AddVehicle.modelLabel1.text"));
            v.getVinLabel().setText(a.getString("AddVehicle.vinLabel.text"));
            v.getOrderLabel().setText(a.getString("AddVehicle.orderLabel.text"));
            v.getPpLabel().setText(a.getString("AddVehicle.ppLabel.text"));
            v.getOrderRadioButton().setText(a.getString("AddVehicle.orderRadioButton.text"));
            v.getModelLabel().setText(a.getString("AddVehicle.modelLabel.text"));
            v.getProductionRadioButton().setText(a.getString("AddVehicle.productionRadioButton.text"));
            v.getjLabel25().setText(a.getString("AddVehicle.jLabel25.text"));
            vm.getSerialLabel().setText(a.getString("AddVehicleM.serialLabel.text"));
            vm.getAutomaticLabel().setText(a.getString("AddVehicleM.automaticLabel.text"));
            vm.getTypeLabel().setText(a.getString("AddVehicleM.typeLabel.text"));
            vm.getSeatsLabel().setText(a.getString("AddVehicleM.seatsLabel.text"));
            vm.getjLabel40().setText(a.getString("AddVehicleM.jLabel40.text"));
            vm.getSpeedLabel().setText(a.getString("AddVehicleM.speedLabel.text"));
            vm.getjLabel39().setText(a.getString("AddVehicleM.jLabel39.text"));
            vm.getNameLabel().setText(a.getString("AddVehicleM.nameLabel.text"));
            vm.getjLabel38().setText(a.getString("AddVehicleM.jLabel38.text"));
            vm.getEnteredProductionLabel().setText(a.getString("AddVehicleM.enteredProductionLabel.text"));
            vm.getjLabel25().setText(a.getString("AddVehicleM.jLabel25.text"));
            vm.getHpLabel().setText(a.getString("AddVehicleM.hpLabel.text"));
            vm.getProductionCostLabel().setText(a.getString("AddVehicleM.productionCostLabel.text"));
            wh.getMaxvehiclesLabel().setText(a.getString("AddWh.maxvehiclesLabel.text"));
            wh.getMaxpartsLabel().setText(a.getString("AddWh.maxpartsLabel.text"));
            wh.getZipLabel().setText(a.getString("AddWh.zipLabel.text"));
            wh.getCountryLabel().setText(a.getString("AddWh.countryLabel.text"));
            wh.getjLabel25().setText(a.getString("AddWh.jLabel25.text"));
            wh.getCityLabel().setText(a.getString("AddWh.cityLabel.text"));
            wh.getStreetLabel().setText(a.getString("AddWh.streetLabel.text"));
            wh.getHnLabel().setText(a.getString("AddWh.hnLabel.text"));
            wh.getNumberLabel().setText(a.getString("AddWh.numberLabel.text"));
            ws.getjLabel25().setText(a.getString("AddWs.jLabel25.text"));
            ws.getStationLabel().setText(a.getString("AddWs.stationLabel.text"));
            ws.getCategoryLabel().setText(a.getString("AddWs.categoryLabel.text"));
            updateManu.getCountryLabel().setText(u.getString("UpdateManuf.countryLabel.text"));
            updateManu.getCityLabel().setText(u.getString("UpdateManuf.cityLabel.text"));
            updateManu.getStreetLabel().setText(u.getString("UpdateManuf.streetLabel.text"));
            updateManu.getHnLabel().setText(u.getString("UpdateManuf.hnLabel.text"));
            updateManu.getZipLabel().setText(u.getString("UpdateManuf.zipLabel.text"));
            updateManu.getProfitPercentageLabel().setText(u.getString("UpdateManuf.profitPercentageLabel.text"));
            updateManu.getNameLabel().setText(u.getString("UpdateManuf.nameLabel.text"));
            updateManu.getjLabel25().setText(u.getString("UpdateManuf.jLabel25.text"));
            updateGuard.getCountryLabel().setText(u.getString("UpdateGuard.countryLabel.text"));
            updateGuard.getCityLabel().setText(u.getString("UpdateGuard.cityLabel.text"));
            updateGuard.getStreetLabel().setText(u.getString("UpdateGuard.streetLabel.text"));
            updateGuard.getHnLabel().setText(u.getString("UpdateGuard.hnLabel.text"));
            updateGuard.getZipLabel().setText(u.getString("UpdateGuard.zipLabel.text"));
            updateGuard.getEdayLabel().setText(u.getString("UpdateGuard.edayLabel.text"));
            updateGuard.getBdayLabel().setText(u.getString("UpdateGuard.bdayLabel.text"));
            updateGuard.getjLabel25().setText(u.getString("UpdateGuard.jLabel25.text"));
            updateGuard.getjLabel30().setText(u.getString("UpdateGuard.jLabel30.text"));
            updateGuard.getjLabel31().setText(u.getString("UpdateGuard.jLabel31.text"));
            updateGuard.getjLabel32().setText(u.getString("UpdateGuard.jLabel32.text"));
            updateGuard.getjLabel33().setText(u.getString("UpdateGuard.jLabel33.text"));
            updateGuard.getjLabel34().setText(u.getString("UpdateGuard.jLabel34.text"));
            updateGuard.getjLabel35().setText(u.getString("UpdateGuard.jLabel35.text"));
            updateGuard.getWnumberLabel().setText(u.getString("UpdateGuard.wnumberLabel.text"));
            updateGuard.getNameLabel().setText(u.getString("UpdateGuard.nameLabel.text"));
            updateGuard.getIdLabel().setText(u.getString("UpdateGuard.idLabel.text"));
            updateGuard.getMsLabel().setText(u.getString("UpdateGuard.msLabel.text"));
            updateShiftManager.getCountryLabel().setText(u.getString("UpdateShiftM.countryLabel.text"));
            updateShiftManager.getCityLabel().setText(u.getString("UpdateShiftM.cityLabel.text"));
            updateShiftManager.getStreetLabel().setText(u.getString("UpdateShiftM.streetLabel.text"));
            updateShiftManager.getHnLabel().setText(u.getString("UpdateShiftM.hnLabel.text"));
            updateShiftManager.getZipLabel().setText(u.getString("UpdateShiftM.zipLabel.text"));
            updateShiftManager.getEmploymentDateLabel().setText(u.getString("UpdateShiftM.employmentDateLabel.text"));
            updateShiftManager.getBdayLabel().setText(u.getString("UpdateShiftM.bdayLabel.text"));
            updateShiftManager.getjLabel25().setText(u.getString("UpdateShiftM.jLabel25.text"));
            updateShiftManager.getjLabel30().setText(u.getString("UpdateShiftM.jLabel30.text"));
            updateShiftManager.getjLabel31().setText(u.getString("UpdateShiftM.jLabel31.text"));
            updateShiftManager.getjLabel32().setText(u.getString("UpdateShiftM.jLabel32.text"));
            updateShiftManager.getjLabel33().setText(u.getString("UpdateShiftM.jLabel33.text"));
            updateShiftManager.getjLabel34().setText(u.getString("UpdateShiftM.jLabel34.text"));
            updateShiftManager.getjLabel35().setText(u.getString("UpdateShiftM.jLabel35.text"));
            updateShiftManager.getNameLabel().setText(u.getString("UpdateShiftM.nameLabel.text"));
            updateShiftManager.getIdLabel().setText(u.getString("UpdateShiftM.idLabel.text"));
            updateShiftManager.getHourlyWageLabel().setText(u.getString("UpdateShiftM.hourlyWageLabel.text"));
            updateShiftManager.getExtraWageLabel().setText(u.getString("UpdateShiftM.extraWageLabel.text"));
            updateWorker.getCountryLabel().setText(u.getString("UpdateWorker.countryLabel.text"));
            updateWorker.getCityLabel().setText(u.getString("UpdateWorker.cityLabel.text"));
            updateWorker.getStreetLabel().setText(u.getString("UpdateWorker.streetLabel.text"));
            updateWorker.getHnLabel().setText(u.getString("UpdateWorker.hnLabel.text"));
            updateWorker.getZipLabel().setText(u.getString("UpdateWorker.zipLabel.text"));
            updateWorker.getEmploymentDateLabel().setText(u.getString("UpdateWorker.employmentDateLabel.text"));
            updateWorker.getBirthDateLabel().setText(u.getString("UpdateWorker.birthDateLabel.text"));
            updateWorker.getjLabel25().setText(u.getString("UpdateWorker.jLabel25.text"));
            updateWorker.getjLabel30().setText(u.getString("UpdateWorker.jLabel30.text"));
            updateWorker.getjLabel31().setText(u.getString("UpdateWorker.jLabel31.text"));
            updateWorker.getjLabel32().setText(u.getString("UpdateWorker.jLabel32.text"));
            updateWorker.getjLabel33().setText(u.getString("UpdateWorker.jLabel33.text"));
            updateWorker.getjLabel34().setText(u.getString("UpdateWorker.jLabel34.text"));
            updateWorker.getjLabel35().setText(u.getString("UpdateWorker.jLabel35.text"));
            updateWorker.getNameLabel().setText(u.getString("UpdateWorker.nameLabel.text"));
            updateWorker.getIdLabel().setText(u.getString("UpdateWorker.idLabel.text"));
            updateWorker.getHourlyWageLabel().setText(u.getString("UpdateWorker.hourlyWageLabel.text"));
            updateOrder.getM_btn().setText(u.getString("UpdateOrder.m_btn.text"));
            updateOrder.getOrderNumberLabel().setText(u.getString("UpdateOrder.orderNumberLabel.text"));
            updateOrder.getOrderedFromLabel().setText(u.getString("UpdateOrder.orderedFromLabel.text"));
            updateOrder.getDueDateLabel().setText(u.getString("UpdateOrder.dueDateLabel.text"));
            updateOrder.getjLabel32().setText(u.getString("UpdateOrder.jLabel32.text"));
            updateOrder.getjLabel31().setText(u.getString("UpdateOrder.jLabel31.text"));
            updateOrder.getjLabel30().setText(u.getString("UpdateOrder.jLabel30.text"));
            updateOrder.getjLabel25().setText(u.getString("UpdateOrder.jLabel25.text"));
            updateOrder.getOrderedToNameLabel().setText(u.getString("UpdateOrder.orderedToNameLabel.text"));
            updateOrder.getOrderedFromNameLabel().setText(u.getString("UpdateOrder.orderedFromNameLabel.text"));
            updateOrder.getOrderedToLabel().setText(u.getString("UpdateOrder.orderedToLabel.text"));
            updateOrder.getSm_btn().setText(u.getString("UpdateOrder.sm_btn.text"));
            updateOrder.getM_btn2().setText(u.getString("UpdateOrder.m_btn2.text"));
            updateOrder.getSm_btn2().setText(u.getString("UpdateOrder.sm_btn2.text"));
            updatePP.getSerialNumberLabel().setText(u.getString("UpdatePP.serialNumberLabel.text"));
            updatePP.getjLabel25().setText(u.getString("UpdatePP.jLabel25.text"));
            updatePP.getTypeSerialNumberLabel().setText(u.getString("UpdatePP.typeSerialNumberLabel.text"));
            updatePPT.getSerialNumberLabel().setText(u.getString("UpdatePPT.serialNumberLabel.text"));
            updatePPT.getjLabel25().setText(u.getString("UpdatePPT.jLabel25.text"));
            updatePPT.getNumberOfSlotsLabel().setText(u.getString("UpdatePPT.numberOfSlotsLabel.text"));
            updatePart.getProductionCostLabel().setText(u.getString("UpdatePartType.productionCostLabel.text"));
            updatePart.getCategoryLabel().setText(u.getString("UpdatePartType.categoryLabel.text"));
            updatePart.getPartNameLabel().setText(u.getString("UpdatePartType.partNameLabel.text"));
            updatePart.getjLabel25().setText(u.getString("UpdatePartType.jLabel25.text"));
            updatePart.getPartNumberLabel().setText(u.getString("UpdatePartType.partNumberLabel.text"));
            updateShift.getStartingTimeLabel().setText(u.getString("UpdateShift.startingTimeLabel.text"));
            updateShift.getTimeLabel().setText(u.getString("UpdateShift.timeLabel.text"));
            updateShift.getjLabel25().setText(u.getString("UpdateShift.jLabel25.text"));
            updateShift.getSmLabel().setText(u.getString("UpdateShift.smLabel.text"));
            updateShift.getjLabel32().setText(u.getString("UpdateShift.jLabel32.text"));
            updateShift.getjLabel30().setText(u.getString("UpdateShift.jLabel30.text"));
            updateShift.getjLabel31().setText(u.getString("UpdateShift.jLabel31.text"));
            updateUser.getSecretQuestionLabel().setText(u.getString("UpdateUser.secretQuestionLabel.text"));
            updateUser.getSecretAnswerLabel().setText(u.getString("UpdateUser.secretAnswerLabel.text"));
            updateUser.getTypeLabel().setText(u.getString("UpdateUser.typeLabel.text"));
            updateUser.getPasswordLabel().setText(u.getString("UpdateUser.passwordLabel.text"));
            updateUser.getjLabel25().setText(u.getString("UpdateUser.jLabel25.text"));
            updateUser.getUsernameLabel().setText(u.getString("UpdateUser.usernameLabel.text"));
            updateVehicle.getModelLabel1().setText(u.getString("UpdateVehicle.modelLabel1.text"));
            updateVehicle.getVinLabel().setText(u.getString("UpdateVehicle.vinLabel.text"));
            updateVehicle.getOrderLabel().setText(u.getString("UpdateVehicle.orderLabel.text"));
            updateVehicle.getPpLabel().setText(u.getString("UpdateVehicle.ppLabel.text"));
            updateVehicle.getOrderRadioButton().setText(u.getString("UpdateVehicle.orderRadioButton.text"));
            updateVehicle.getModelLabel().setText(u.getString("UpdateVehicle.modelLabel.text"));
            updateVehicle.getProductionRadioButton().setText(u.getString("UpdateVehicle.productionRadioButton.text"));
            updateVehicle.getjLabel25().setText(u.getString("UpdateVehicle.jLabel25.text"));
            updateVehicleModel.getSerialLabel().setText(u.getString("UpdateVehicleM.serialLabel.text"));
            updateVehicleModel.getAutomaticLabel().setText(u.getString("UpdateVehicleM.automaticLabel.text"));
            updateVehicleModel.getTypeLabel().setText(u.getString("UpdateVehicleM.typeLabel.text"));
            updateVehicleModel.getSeatsLabel().setText(u.getString("UpdateVehicleM.seatsLabel.text"));
            updateVehicleModel.getjLabel40().setText(u.getString("UpdateVehicleM.jLabel40.text"));
            updateVehicleModel.getSpeedLabel().setText(u.getString("UpdateVehicleM.speedLabel.text"));
            updateVehicleModel.getjLabel39().setText(u.getString("UpdateVehicleM.jLabel39.text"));
            updateVehicleModel.getNameLabel().setText(u.getString("UpdateVehicleM.nameLabel.text"));
            updateVehicleModel.getjLabel38().setText(u.getString("UpdateVehicleM.jLabel38.text"));
            updateVehicleModel.getEnteredProductionLabel().setText(u.getString("UpdateVehicleM.enteredProductionLabel.text"));
            updateVehicleModel.getjLabel25().setText(u.getString("UpdateVehicleM.jLabel25.text"));
            updateVehicleModel.getHpLabel().setText(u.getString("UpdateVehicleM.hpLabel.text"));
            updateVehicleModel.getProductionCostLabel().setText(u.getString("UpdateVehicleM.productionCostLabel.text"));
            updateWarehouse.getMaxvehiclesLabel().setText(u.getString("UpdateWh.maxvehiclesLabel.text"));
            updateWarehouse.getMaxpartsLabel().setText(u.getString("UpdateWh.maxpartsLabel.text"));
            updateWarehouse.getZipLabel().setText(u.getString("UpdateWh.zipLabel.text"));
            updateWarehouse.getCountryLabel().setText(u.getString("UpdateWh.countryLabel.text"));
            updateWarehouse.getjLabel25().setText(u.getString("UpdateWh.jLabel25.text"));
            updateWarehouse.getCityLabel().setText(u.getString("UpdateWh.cityLabel.text"));
            updateWarehouse.getStreetLabel().setText(u.getString("UpdateWh.streetLabel.text"));
            updateWarehouse.getHnLabel().setText(u.getString("UpdateWh.hnLabel.text"));
            updateWarehouse.getNumberLabel().setText(u.getString("UpdateWh.numberLabel.text"));
            updateWorkstation.getjLabel25().setText(u.getString("UpdateWs.jLabel25.text"));
            updateWorkstation.getStationLabel().setText(u.getString("UpdateWs.stationLabel.text"));
            updateWorkstation.getCategoryLabel().setText(u.getString("UpdateWs.categoryLabel.text"));
            options.getNotification().messageTextLimit();
            home.getVehiclesText().setText(a.getString("Home.vehiclesText.text"));
            home.getWorkersLabel().setText(a.getString("Home.workersLabel.text"));
            options.getNotification().getSaveButton().setText(a.getString("Notification.saveButton.text"));
            String[]engHeadersWorkers={"ID","Name","Country","City","Street","House Number","ZIP Code","Birthday","Employment Date","Hourly Wage"};
            for (int i=0;i<engHeadersWorkers.length;i++){
            home.getWorkersTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersWorkers[i]);
            showEmployees.getWorkersTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersWorkers[i]);
            }
            String[]engHeadersVehicles={"VIN","Model Name","Category", "HP" , "Top Speed", "Number of Seats", "Automatic", "Production Cost", "Entered Production","Production Plan - Serial Number", "Production Plan Type - Serial Number", "Production Plan Type - Number of Slots"};
            for (int i=0;i<engHeadersVehicles.length;i++){
            home.getVehiclesTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersVehicles[i]);
            showVehicles.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersVehicles[i]);
            showWhMore.getVehiclesTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersVehicles[i]);
            }
            String[]engHeadersGuards={"ID","Name","Country","City","Street","House Number","ZIP Code","Birthday","Employment Date","Monthly Salary","Warehouse Number","Warehouse Country","Warehouse City","Warehouse Street","Warehouse House Number","Warehouse ZIP Code","Max Parts Stored","Max Vehicles Stored","Current Number of Parts"};
            for (int i=0;i<engHeadersGuards.length;i++)
            showEmployees.getGuardTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersGuards[i]);
            String[]engHeadersSM={"ID","Name","Country","City","Street","House Number","ZIP Code","Birthday","Employment Date","Hourly Wage", "Extra Wage"};
            for (int i=0;i<engHeadersSM.length;i++)
            showEmployees.getSmTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersSM[i]);
            String[]engHeadersManu={"Manufacturer Name", "Country" , "City", "Street", "House Number", "ZIP Code", "Profit Percentage"};
            for (int i=0;i<engHeadersManu.length;i++){
            showManufacturers.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersManu[i]);
            showPartMore.getManufacturerTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersManu[i]);
            }
            String[]engHeadersModels={"Model Name","Category", "HP" , "Top Speed", "Number of Seats", "Automatic", "Production Cost", "Entered Production", "Production Plan Type - Serial Number", "Production Plan Type - Number of Slots"};
            for (int i=0;i<engHeadersModels.length;i++){
            showModels.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersModels[i]);
            showManufMoreDetails.getModelsTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersModels[i]);
            }
            String[]engHeadersSales={"Order Number","Shift Manager ID","Shift Manager Name", "Shift Manager Country", "Shift Manager City" , "Shift Manager Street" , "Shift Manager House Number", "Shift Manager ZIP Code", "Shift Manager Birthday", "Shift Manager Employment Date", "Hourly Wage" , "Extra Wage","Manufacturer Name", "Manufacturer Country" , "Manufacturer City", "Manufacturer Street", "Manufacturer House Number", "Manufacturer ZIP Code", "Profit Percentage","Due Date"};
            for (int i=0;i<engHeadersSales.length;i++)
            showOrders.getResTableSales().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersSales[i]);
            String[]engHeadersPurchases={"Order Number","Manufacturer Name", "Manufacturer Country" , "Manufacturer City", "Manufacturer Street", "Manufacturer House Number", "Manufacturer ZIP Code", "Profit Percentage","Shift Manager ID","Shift Manager Name", "Shift Manager Country", "Shift Manager City" , "Shift Manager Street" , "Shift Manager House Number", "Shift Manager ZIP Code", "Shift Manager Birthday","Shift Manager Employment Date","Hourly Wage","Extra Wage","Due Date"};
            for (int i=0;i<engHeadersPurchases.length;i++)
            showOrders.getResTablePurchases().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersPurchases[i]);
            String[]engHeadersParts={"Part Type Number","Part Type Name", "Category" , "Production Cost"};
            for (int i=0;i<engHeadersParts.length;i++){
            showParts.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersParts[i]);
            showModelMore.getPartsTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersParts[i]);
            showOrderMore.getPartsTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersParts[i]);
            showWhMore.getPartsTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersParts[i]);
            }
            String engHeadersPartCat="Part Category";
            showManufMoreDetails.getPartsTable().getTableHeader().getColumnModel().getColumn(0).setHeaderValue(engHeadersPartCat);
            String[]engHeadersPPT={"Serial Number","Number of Slots"};
            for (int i=0;i<engHeadersPPT.length;i++)
            showProductionPlanTypes.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersPPT[i]);
            String[]engHeadersPP={"Production Plan - Serial Number","Production Plan Type - Serial Number", "Production Plan Type - Number of Slots"};
            for (int i=0;i<engHeadersPP.length;i++){
            showProductionPlans.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersPP[i]);
            showShiftsMore.getPPTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersPP[i]);
            }
            String[]engHeadersShifts={"Starting Time","Shift Manager ID","Shift Manager Name", "Shift Manager Country", "Shift Manager City" , "Shift Manager Street" , "Shift Manager House Number", "Shift Manager ZIP Code", "Shift Manager Birthday", "Shift Manager Employment Date", "Hourly Wage" , "Extra Wage"};
            for (int i=0;i<engHeadersShifts.length;i++){
            showShifts.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersShifts[i]);
            showEmployeesMore.getShiftTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersShifts[i]);
            }
            String[]engHeadersUsers={"Username","Password", "Type" , "Secret Question" , "Secret Answer"};
            for (int i=0;i<engHeadersUsers.length;i++)
            showUsers.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersUsers[i]);
            String[]engHeadersWarehouses={"Warehouse Number","Country", "City" , "Street" , "House Number", "ZIP Code", "Max Parts Stored", "Max Vehicles Stored", "Current Number of Parts"};
            for (int i=0;i<engHeadersWarehouses.length;i++)
            showWarehouses.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersWarehouses[i]);
            String[]engHeadersWorkstations={"Station Number","Category"};
            for (int i=0;i<engHeadersWorkstations.length;i++){
            showWorkstations.getResTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersWorkstations[i]);
            showEmployeesMore.getWsTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersWorkstations[i]);
            showPPTMore.getWorkstationTable().getTableHeader().getColumnModel().getColumn(i).setHeaderValue(engHeadersWorkstations[i]);
            }
            String hebHeaderSlots="Slot - Starting Time";
            showShiftsMore.getSlotTable().getTableHeader().getColumnModel().getColumn(0).setHeaderValue(hebHeaderSlots);
            home.getWorkersTable().setAutoResizeMode(2);
            home.getVehiclesTable().setAutoResizeMode(2);
            showEmployees.getGuardTable().setAutoResizeMode(2);
            showEmployees.getSmTable().setAutoResizeMode(2);
            showEmployees.getWorkersTable().setAutoResizeMode(2);
            showManufacturers.getResTable().setAutoResizeMode(2);
            showModels.getResTable().setAutoResizeMode(2);
            showOrders.getResTableSales().setAutoResizeMode(2);
            showOrders.getResTablePurchases().setAutoResizeMode(2);
            showParts.getResTable().setAutoResizeMode(2);
            showProductionPlans.getResTable().setAutoResizeMode(2);
            showProductionPlanTypes.getResTable().setAutoResizeMode(2);
            showShifts.getResTable().setAutoResizeMode(2);
            showUsers.getResTable().setAutoResizeMode(2);
            showVehicles.getResTable().setAutoResizeMode(2);
            showWarehouses.getResTable().setAutoResizeMode(2);
            showWorkstations.getResTable().setAutoResizeMode(2);
            showEmployeesMore.getWsTable().setAutoResizeMode(2);
            showEmployeesMore.getShiftTable().setAutoResizeMode(2);
            showManufMoreDetails.getPartsTable().setAutoResizeMode(2);
            showManufMoreDetails.getModelsTable().setAutoResizeMode(2);
            showModelMore.getPartsTable().setAutoResizeMode(2);
            showOrderMore.getPartsTable().setAutoResizeMode(2);
            showPPTMore.getWorkstationTable().setAutoResizeMode(2);
            showPartMore.getManufacturerTable().setAutoResizeMode(2);
            showShiftsMore.getSlotTable().setAutoResizeMode(2);
            showShiftsMore.getPPTable().setAutoResizeMode(2);
            showWhMore.getPartsTable().setAutoResizeMode(2);
            showWhMore.getVehiclesTable().setAutoResizeMode(2);
            showEmployees.getRemove().setText(s.getString("ShowEmployees.remove.text"));
           showEmployees.getUpdate().setText(s.getString("ShowEmployees.update.text"));
           showEmployees.getMore().setText(s.getString("ShowEmployees.more.text"));
           showEmployees.getSmLabel().setText(s.getString("ShowEmployees.smLabel.text"));
           showEmployees.getWorkersLabel().setText(s.getString("ShowEmployees.workersLabel.text"));
           showEmployees.getGuardLabel().setText(s.getString("ShowEmployees.guardLabel.text"));
           showManufacturers.getRemove().setText(s.getString("ShowManufacturers.remove.text"));
           showManufacturers.getUpdate().setText(s.getString("ShowManufacturers.update.text"));
           showManufacturers.getMore().setText(s.getString("ShowManufacturers.more.text"));
           showModels.getRemove().setText(s.getString("ShowModels.remove.text"));
           showModels.getUpdate().setText(s.getString("ShowModels.update.text"));
           showModels.getMore().setText(s.getString("ShowModels.more.text"));
           showOrders.getRemove().setText(s.getString("ShowOrders.remove.text"));
           showOrders.getUpdate().setText(s.getString("ShowOrders.update.text"));
           showOrders.getMore().setText(s.getString("ShowOrders.more.text"));
           showOrders.getjLabel1().setText(s.getString("ShowOrders.jLabel1.text"));
           showOrders.getjLabel2().setText(s.getString("ShowOrders.jLabel2.text"));
           showParts.getRemove().setText(s.getString("ShowParts.remove.text"));
           showParts.getUpdate().setText(s.getString("ShowParts.update.text"));
           showParts.getMore().setText(s.getString("ShowParts.more.text"));
           showProductionPlans.getRemove().setText(s.getString("ShowProductionPlans.remove.text"));
           showProductionPlans.getUpdate().setText(s.getString("ShowProductionPlans.update.text"));
           showProductionPlanTypes.getRemove1().setText(s.getString("ShowProductionPlanTypes.remove1.text"));
           showProductionPlanTypes.getUpdate().setText(s.getString("ShowProductionPlanTypes.update.text"));
           showProductionPlanTypes.getMore().setText(s.getString("ShowProductionPlanTypes.more.text"));
           showShifts.getRemove().setText(s.getString("ShowShifts.remove.text"));
           showShifts.getUpdate().setText(s.getString("ShowShifts.update.text"));
           showShifts.getManageSlots().setText(s.getString("ShowShifts.manageSlots.text"));
           showUsers.getRemove().setText(s.getString("ShowUsers.remove.text"));
           showUsers.getUpdate().setText(s.getString("ShowUsers.update.text"));
           showVehicles.getRemove().setText(s.getString("ShowVehicles.remove.text"));
           showVehicles.getUpdate().setText(s.getString("ShowVehicles.update.text"));
           showWarehouses.getRemove().setText(s.getString("ShowWarehouses.remove.text"));
           showWarehouses.getUpdate().setText(s.getString("ShowWarehouses.update.text"));
           showWarehouses.getMore().setText(s.getString("ShowWarehouses.more.text"));
           showWorkstations.getRemove().setText(s.getString("ShowWorkstations.remove.text"));
           showWorkstations.getUpdate().setText(s.getString("ShowWorkstations.update.text"));
           if (showManufMoreDetails.getBtn_name().getText().equals("הוסף"))
           showManufMoreDetails.getBtn_name().setText(("Add"));
           else if (showManufMoreDetails.getBtn_name().getText().equals("הסר"))
               showManufMoreDetails.getBtn_name().setText(("Remove"));
           if (showEmployeesMore.getBtn_name().getText().equals("הוסף"))
           showEmployeesMore.getBtn_name().setText(("Add"));
           else if (showEmployeesMore.getBtn_name().getText().equals("הסר"))
               showEmployeesMore.getBtn_name().setText(("Remove"));
           if (showModelMore.getBtn_name().getText().equals("הוסף"))
           showModelMore.getBtn_name().setText(("Add"));
           else if (showModelMore.getBtn_name().getText().equals("הסר"))
               showModelMore.getBtn_name().setText(("Remove"));
           if (showOrderMore.getBtn_name().getText().equals("הוסף"))
           showOrderMore.getBtn_name().setText(("Add"));
           else if (showOrderMore.getBtn_name().getText().equals("הסר"))
               showOrderMore.getBtn_name().setText(("Remove"));
           if (showPPTMore.getBtn_name().getText().equals("הוסף"))
           showPPTMore.getBtn_name().setText(("Add"));
           else if (showPPTMore.getBtn_name().getText().equals("הסר"))
               showPPTMore.getBtn_name().setText(("Remove"));
           if (showPartMore.getBtn_name().getText().equals("הוסף"))
           showPartMore.getBtn_name().setText(("Add"));
           else if (showPartMore.getBtn_name().getText().equals("הסר"))
               showPartMore.getBtn_name().setText(("Remove"));
           if (showShiftsMore.getBtn_name().getText().equals("הוסף"))
           showShiftsMore.getBtn_name().setText(("Add"));
           else if (showShiftsMore.getBtn_name().getText().equals("הסר"))
               showShiftsMore.getBtn_name().setText(("Remove"));
           if (showWhMore.getBtn_name().getText().equals("הוסף"))
           showWhMore.getBtn_name().setText(("Add"));
           else if (showWhMore.getBtn_name().getText().equals("הסר"))
               showWhMore.getBtn_name().setText(("Remove"));
           label_title.setHorizontalAlignment(SwingConstants.LEFT);
           if (title.equals("כל המשתמשים"))
               label_title.setText("All Users");
           else if (title.equals("כל היצרנים"))
               label_title.setText("All Manufacturers");
           else if (title.equals("כל המחסנים"))
               label_title.setText("All Warehouses");
           else if (title.equals("כל העובדים"))
               label_title.setText("All Employees");
           else if (title.equals("כל סוגי תכניות היצור"))
               label_title.setText("All Production Plan Types");
           else if (title.equals("כל תכניות היצור"))
               label_title.setText("All Production Plans");
           else if (title.equals("כל דגמי הרכב"))
               label_title.setText("All Vehicle Models");
           else if (title.equals("כל הרכבים"))
               label_title.setText("All Vehicles");
           else if (title.equals("כל סוגי החלקים"))
               label_title.setText("All PartTypes");
           else if (title.equals("כל ההזמנות"))
               label_title.setText("All Orders");
           else if (title.equals("כל תחנות העבודה"))
               label_title.setText("All Workstations");
           else if (title.equals("כל המשמרות"))
               label_title.setText("All Shifts");
           else if (title.equals("הוסף משתמש"))
               label_title.setText("Add User");
           else if (title.equals("הוסף יצרן"))
               label_title.setText("Add Manufacturer");
           else if (title.equals("הוסף מחסן"))
               label_title.setText("Add Warehouse");
           else if (title.equals("הוסף סוג תכנית יצור"))
               label_title.setText("Add Production Plan Type");
           else if (title.equals("הוסף תכנית יצור"))
               label_title.setText("Add Production Plan");
           else if (title.equals("הוסף דגם רכב"))
               label_title.setText("Add Vehicle Model");
           else if (title.equals("הוסף רכב"))
               label_title.setText("Add Vehicle");
           else if (title.equals("הוסף סוג חלק"))
               label_title.setText("Add PartType");
           else if (title.equals("הוסף הזמנה"))
               label_title.setText("Add Order");
           else if (title.equals("הוסף תחנת עבודה"))
               label_title.setText("Add Workstation");
           else if (title.equals("הוסף משמרת"))
               label_title.setText("Add Shift");
           else if (title.equals("הוסף עובד"))
               label_title.setText("Add Employee");
           else if (title.equals("הוסף פועל"))
               label_title.setText("Add Worker");
           else if (title.equals("הוסף מנהל משמרת"))
               label_title.setText("Add Shift Manager");
           else if (title.equals("הוסף שומר"))
               label_title.setText("Add Guard");
           else if (title.equals("אפשרויות"))
               label_title.setText("Options");
           else if (title.equals("עדכן משתמש"))
               label_title.setText("Update User");
           else if (title.equals("עדכן יצרן"))
               label_title.setText("Update Manufacturer");
           else if (title.equals("עדכן מחסן"))
               label_title.setText("Update Warehouse");
           else if (title.equals("עדכן סוג תכנית יצור"))
               label_title.setText("Update Production Plan Type");
           else if (title.equals("עדכן תכנית יצור"))
               label_title.setText("Update Production Plan");
           else if (title.equals("עדכן דגם רכב"))
               label_title.setText("Update Vehicle Model");
           else if (title.equals("עדכן רכב"))
               label_title.setText("Update Vehicle");
           else if (title.equals("עדכן סוג חלק"))
               label_title.setText("Update Part Type");
           else if (title.equals("עדכן הזמנה"))
               label_title.setText("Update Order");
           else if (title.equals("עדכן תחנת עבודה"))
               label_title.setText("Update Workstation");
           else if (title.equals("עדכן משמרת"))
               label_title.setText("Update Shift");
           else if (title.equals("עדכן עובד"))
               label_title.setText("Update Employee");
           else if (title.equals("עדכן פועל"))
               label_title.setText("Update Worker");
           else if (title.equals("עדכן מנהל משמרת"))
               label_title.setText("Update Shift Manager");
           else if (title.equals("עדכן שומר"))
               label_title.setText("Update Guard");
           else if (title.equals("ראשי"))
               label_title.setText("Home");
           else if (title.equals("כל היצרנים - אפשרויות נוספות"))
               label_title.setText("All Manufacturers - More");
           else if (title.equals("כל המחסנים - אפשרויות נוספות"))
               label_title.setText("All Warehouses - More");
           else if (title.equals("כל העובדים - אפשרויות נוספות"))
               label_title.setText("All Employees - More");
           else if (title.equals("כל סוגי תכניות היצור - אפשרויות נוספות"))
               label_title.setText("All Production Plan Types - More");
           else if (title.equals("כל דגמי הרכב - אפשרויות נוספות"))
               label_title.setText("All Vehicle Models - More");
           else if (title.equals("כל סוגי החלקים - אפשרויות נוספות"))
               label_title.setText("All PartTypes - More");
           else if (title.equals("כל ההזמנות - אפשרויות נוספות"))
               label_title.setText("All Orders - More");
           else if (title.equals("כל המשמרות - אפשרויות נוספות"))
               label_title.setText("All Shifts - More");
           options.getVolume().getLoginVolumeLabel().setText(a.getString("VolumePanel.loginVolumeLabel.text"));
           options.getLock().getAddEmployeesLabel().setText(a.getString("lockPanel.addEmployeesLabel.text"));
           options.getLock().getAddOrdersLabel().setText(a.getString("lockPanel.addOrdersLabel.text"));
           options.getLock().getAddShiftsLabel().setText(a.getString("lockPanel.addShiftsLabel.text"));
           options.getLock().getUpdateEmployeeLabel().setText(a.getString("lockPanel.updateEmployeeLabel.text"));
           options.getLock().getUpdateOrdersLabel().setText(a.getString("lockPanel.updateOrdersLabel.text"));
           options.getNotification().getMessageLabel().setText(a.getString("Notification.messageLabel.text"));
           options.getDesign().getBackgroundColorLabel().setText(a.getString("DesignPanel.backgroundColorLabel.text"));
           options.getDesign().getSidebarLabel().setText(a.getString("DesignPanel.sidebarLabel.text"));
           options.getNotification().getMessageLabel().setHorizontalAlignment(SwingConstants.LEFT);
           if (options.getLock().getjComboBoxOrders().getSelectedItem().equals("Disabled"))
           showOrders.getUpdate().setToolTipText("This feature is currently disabled!");
           else if (options.getLock().getjComboBoxOrders().getSelectedItem().equals("Enabled"))
           showOrders.getUpdate().setToolTipText("");
           if (options.getLock().getjComboBoxEmployees().getSelectedItem().equals("Disabled"))
           showEmployees.getUpdate().setToolTipText("This feature is currently disabled!");
           else if (options.getLock().getjComboBoxEmployees().getSelectedItem().equals("Enabled"))
           showEmployees.getUpdate().setToolTipText("");
        }
    }//GEN-LAST:event_languageComboBoxActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
                     
    
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        view.OpenAbout(desktopPane,this);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        E_UserType utu,uta=null;
        utu=E_UserType.valueOf("User");
        uta=E_UserType.valueOf("Admin");
        ArrayList<String> designs=new ArrayList<>();
        ArrayList<String> locks=new ArrayList<>();
        String volume=null;
        String message=null;
        designs.add((String) options.getDesign().getjComboBoxBackground().getSelectedItem());
        designs.add((String) options.getDesign().getjComboBoxSideBar().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxEmployees().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxOrders().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxaddEmployees().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxAddOrders().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxAddShifts().getSelectedItem());
        volume=options.getVolume().getLoginSoundComboBox().getText();
        message=options.getNotification().getNotificationText().getText(); 
        try {
            view.serialization(Constants.Ser_FileName);
        }
        catch (IOException ex) {
          }
        if ((view.model.getUsers().get(showUsers.getUserName())).getType().equals(uta)){
        try {
            view.serializeAdminDesignChoicesLog(Constants.Ser_AdminDesignsFileName, designs);
            view.serializeAdminLocksChoicesLog(Constants.Ser_AdminLocksFileName, locks);
            view.serializeAdminMessageChoicesLog(Constants.Ser_AdminMessageFileName, message);
            view.serializeAdminVolumeChoicesLog(Constants.Ser_AdminVolumeFileName, volume);
            }
         catch (IOException ex) {
          }
        }
    }//GEN-LAST:event_saveActionPerformed

    private void logOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOffActionPerformed
        E_UserType utu,uta=null;
        utu=E_UserType.valueOf("User");
        uta=E_UserType.valueOf("Admin");
        ArrayList<String> designs=new ArrayList<>();
        ArrayList<String> locks=new ArrayList<>();
        String volume=null;
        String message=null;
        designs.add((String) options.getDesign().getjComboBoxBackground().getSelectedItem());
        designs.add((String) options.getDesign().getjComboBoxSideBar().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxEmployees().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxOrders().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxaddEmployees().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxAddOrders().getSelectedItem());
        locks.add((String) options.getLock().getjComboBoxAddShifts().getSelectedItem());
        volume=options.getVolume().getLoginSoundComboBox().getText();
        message=options.getNotification().getNotificationText().getText(); 
        try {
            view.serialization(Constants.Ser_FileName);
        }
        catch (IOException ex) {
          }
        if ((view.model.getUsers().get(showUsers.getUserName())).getType().equals(uta)){
        try {
            view.serializeAdminDesignChoicesLog(Constants.Ser_AdminDesignsFileName, designs);
            view.serializeAdminLocksChoicesLog(Constants.Ser_AdminLocksFileName, locks);
            view.serializeAdminMessageChoicesLog(Constants.Ser_AdminMessageFileName, message);
            view.serializeAdminVolumeChoicesLog(Constants.Ser_AdminVolumeFileName, volume);
            }
         catch (IOException ex) {
          }
        }
        view.LoginScreen(languageComboBox);
        this.dispose();
    }//GEN-LAST:event_logOffActionPerformed

    public static JLabel getLabel_Add() {
        return label_title;
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
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserMenu().setVisible(true);
            }
        });
    }
    
private void updateManufacturerActionPerformed(java.awt.event.ActionEvent evt) {  
        if (showManufacturers.getResTable().getSelectedRow()==-1){
            Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a manufacturer from the table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור יצרן מהטבלה!");
        }
        else
        {
            Object[] options = {"Yes","No"};
            Object[] hebOptions = {"כן","לא"};
            int n=0;
           if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Updating confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
           n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות עדכון",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
           if (n==0)
           {
              showManufacturers.setVisible(false);
              updateManu.setVisible(true);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              label_title.setText("Update Manufacturer");
              else if (languageComboBox.getSelectedItem().equals("עברית"))
                  label_title.setText("עדכן יצרן");
              updateManu.getNameText().setText(showManufacturers.getResTable().getValueAt(showManufacturers.getResTable().getSelectedRow(), 0).toString());
              updateManu.getNameText().setEnabled(false);
              updateManu.getCountryText().setText(showManufacturers.getResTable().getValueAt(showManufacturers.getResTable().getSelectedRow(), 1).toString());
              updateManu.getCityText().setText(showManufacturers.getResTable().getValueAt(showManufacturers.getResTable().getSelectedRow(), 2).toString());
              updateManu.getStreetText().setText(showManufacturers.getResTable().getValueAt(showManufacturers.getResTable().getSelectedRow(), 3).toString());
              updateManu.getHnText().setText(showManufacturers.getResTable().getValueAt(showManufacturers.getResTable().getSelectedRow(), 4).toString());
              updateManu.getZipText().setText(showManufacturers.getResTable().getValueAt(showManufacturers.getResTable().getSelectedRow(), 5).toString());
              updateManu.getProfitPercentageText().setText(showManufacturers.getResTable().getValueAt(showManufacturers.getResTable().getSelectedRow(), 6).toString());
           }
        } 
    }

private void updateWarehouseActionPerformed(java.awt.event.ActionEvent evt) {  
        if (showWarehouses.getResTable().getSelectedRow()==-1){
            Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a warehouse from the table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור מחסן מהטבלה!");
        }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
           int n=0;
           if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Updating confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
           n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות עדכון",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
           if (n==0)
           {
              showWarehouses.setVisible(false);
              updateWarehouse.setVisible(true);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              label_title.setText("Update Warehouse");
              else if (languageComboBox.getSelectedItem().equals("עברית"))
              label_title.setText("עדכן מחסן");
              updateWarehouse.getNumberText().setText(showWarehouses.getResTable().getValueAt(showWarehouses.getResTable().getSelectedRow(), 0).toString());
              updateWarehouse.getNumberText().setEnabled(false);
              updateWarehouse.getCountryText().setText(showWarehouses.getResTable().getValueAt(showWarehouses.getResTable().getSelectedRow(), 1).toString());
              updateWarehouse.getCityText().setText(showWarehouses.getResTable().getValueAt(showWarehouses.getResTable().getSelectedRow(), 2).toString());
              updateWarehouse.getStreetText().setText(showWarehouses.getResTable().getValueAt(showWarehouses.getResTable().getSelectedRow(), 3).toString());
              updateWarehouse.getHnText().setText(showWarehouses.getResTable().getValueAt(showWarehouses.getResTable().getSelectedRow(), 4).toString());
              updateWarehouse.getZipText().setText(showWarehouses.getResTable().getValueAt(showWarehouses.getResTable().getSelectedRow(), 5).toString());
              updateWarehouse.getMaxpartsText().setText(showWarehouses.getResTable().getValueAt(showWarehouses.getResTable().getSelectedRow(), 6).toString());
              updateWarehouse.getMaxvehiclesText().setText(showWarehouses.getResTable().getValueAt(showWarehouses.getResTable().getSelectedRow(), 7).toString());
           }
        } 
    }


private void updatePartTypeActionPerformed(java.awt.event.ActionEvent evt) {  
        if (showParts.getResTable().getSelectedRow()==-1){
            Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a part type from the table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור סוג חלק מהטבלה!");
        }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
           int n=0;
           if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Updating confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
           n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות עדכון",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
           if (n==0)
           {
              showParts.setVisible(false);
              updatePart.setVisible(true);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              label_title.setText("Update Part Type");
              else if (languageComboBox.getSelectedItem().equals("עברית"))
              label_title.setText("עדכן סוג חלק");
              updatePart.getPartNumberText().setText(showParts.getResTable().getValueAt(showParts.getResTable().getSelectedRow(), 0).toString());
              updatePart.getPartNumberText().setEnabled(false);
              updatePart.getPartNameText().setText(showParts.getResTable().getValueAt(showParts.getResTable().getSelectedRow(), 1).toString());
              updatePart.getCategoryComboBox().setSelectedItem(showParts.getResTable().getValueAt(showParts.getResTable().getSelectedRow(), 2).toString().toUpperCase());
              updatePart.getProductionCostText().setText(showParts.getResTable().getValueAt(showParts.getResTable().getSelectedRow(), 3).toString());
           }
        } 
    }

private void updateProductionPlanActionPerformed(java.awt.event.ActionEvent evt) {  
        if (showProductionPlans.getResTable().getSelectedRow()==-1){
             Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a production plan from the table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור תכנית יצור מהטבלה!");
        }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
           int n=0;
           if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Updating confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
           n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות עדכון",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
           if (n==0)
           {
              showProductionPlans.setVisible(false);
              updatePP.setVisible(true);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              label_title.setText("Update Production Plan");
              else if (languageComboBox.getSelectedItem().equals("עברית"))
              label_title.setText("עדכן תכנית יצור");   
              updatePP.getSerialNumberText().setText(showProductionPlans.getResTable().getValueAt(showProductionPlans.getResTable().getSelectedRow(), 0).toString());
              updatePP.getSerialNumberText().setEnabled(false);
              updatePP.getTypeSerialNumberText().setText(showProductionPlans.getResTable().getValueAt(showProductionPlans.getResTable().getSelectedRow(), 1).toString());
           }
        } 
    }

private void updateProductionPlanTypeActionPerformed(java.awt.event.ActionEvent evt) {  
        if (showProductionPlanTypes.getResTable().getSelectedRow()==-1){
            Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a production plan type from the table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור סוג תכנית יצור מהטבלה!");
        }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
           int n=0;
           if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Updating confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
           n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות עדכון",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
           if (n==0)
           {
              showProductionPlanTypes.setVisible(false);
              updatePPT.setVisible(true);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              label_title.setText("Update Production Plan Type");
              else if (languageComboBox.getSelectedItem().equals("עברית"))
                  label_title.setText("עדכן סוג תכנית יצור");
              updatePPT.getSerialNumberText().setText(showProductionPlanTypes.getResTable().getValueAt(showProductionPlanTypes.getResTable().getSelectedRow(), 0).toString());
              updatePPT.getSerialNumberText().setEnabled(false);
              updatePPT.getNumberOfSlotsText().setText(showProductionPlanTypes.getResTable().getValueAt(showProductionPlanTypes.getResTable().getSelectedRow(), 1).toString());
           }
        } 
    }

private void updateShiftActionPerformed(java.awt.event.ActionEvent evt) {  
        if (showShifts.getResTable().getSelectedRow()==-1){
            Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a shift from the table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור משמרת מהרשימה!");
        }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
           int n=0;
           if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Updating confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
           n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות עדכון",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
           if (n==0)
           {
              showShifts.setVisible(false);
              updateShift.setVisible(true);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              label_title.setText("Update Shift");
              else if (languageComboBox.getSelectedItem().equals("עברית"))
              label_title.setText("עדכן משמרת");    
               updateShift.getSmText().setText(showShifts.getResTable().getValueAt(showShifts.getResTable().getSelectedRow(), 1).toString());
               updateShift.getDayComboBox().setEnabled(false);
               updateShift.getMonthComboBox().setEnabled(false);
               updateShift.getYearComboBox().setEnabled(false);
               updateShift.getTimeComboBox().setEnabled(false);
               String time,str=(showShifts.getResTable().getValueAt(showShifts.getResTable().getSelectedRow(), 0).toString());
               Date d=InputCheck.TryConvertingStringtoDateTwo(str);
               Calendar cal=InputCheck.CalendarGetTimeDate(d);
               Integer month=cal.get(Calendar.MONTH)+1;
               if ((Integer)cal.get(Calendar.HOUR_OF_DAY)<10)
                 time="0" +((Integer)cal.get(Calendar.HOUR_OF_DAY)).toString() + ":00";
               else
                 time=((Integer)cal.get(Calendar.HOUR_OF_DAY)).toString() + ":00";
               updateShift.getDayComboBox().setSelectedItem(((Integer)cal.get(Calendar.DAY_OF_MONTH)).toString());
               updateShift.getMonthComboBox().setSelectedItem(month.toString());
               updateShift.getYearComboBox().setSelectedItem(((Integer)cal.get(Calendar.YEAR)).toString());
               updateShift.getTimeComboBox().setSelectedItem(time);

               
               
             
           }
        } 
    }

private void updateVehicleActionPerformed(java.awt.event.ActionEvent evt) {  
        if (showVehicles.getResTable().getSelectedRow()==-1){
            Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a vehicle from the table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "עליך לבחור רכב מהטבלה!");
        }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
           int n=0;
           if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Updating confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
           n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות עדכון",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
           if (n==0)
           {
              showVehicles.setVisible(false);
              updateVehicle.setVisible(true);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              label_title.setText("Update Vehicle");
              else if (languageComboBox.getSelectedItem().equals("עברית"))
              label_title.setText("עדכן רכב");   
              updateVehicle.getVinText().setText(showVehicles.getResTable().getValueAt(showVehicles.getResTable().getSelectedRow(), 0).toString());
              updateVehicle.getVinText().setEnabled(false);
              updateVehicle.getModelText().setText(showVehicles.getResTable().getValueAt(showVehicles.getResTable().getSelectedRow(), 1).toString());
              Integer pp =(Integer) (showVehicles.getResTable().getValueAt(showVehicles.getResTable().getSelectedRow(), 9));
              Integer order =(Integer) (showVehicles.getResTable().getValueAt(showVehicles.getResTable().getSelectedRow(), 12));
              updateVehicle.getProductionRadioButton().setEnabled(false);
              updateVehicle.getOrderRadioButton().setEnabled(false);
              if (order==null && pp!=-1){
              updateVehicle.getPpText().setText(pp.toString());
              updateVehicle.getOrderText().setText("-1");
              updateVehicle.getProductionRadioButton().setSelected(true);
              updateVehicle.getOrderRadioButton().setSelected(false);
              }
              else if (pp==null && order!=-1){
              updateVehicle.getOrderText().setText(order.toString());
              updateVehicle.getPpText().setText("-1");
              updateVehicle.getProductionRadioButton().setSelected(false);
              updateVehicle.getOrderRadioButton().setSelected(true);
              updateVehicle.getPpText().setEnabled(false);
              updateVehicle.getOrderText().setEnabled(true);
              }
           }
        } 
    }

private void updateVehicleModelActionPerformed(java.awt.event.ActionEvent evt) {  
        if (showModels.getResTable().getSelectedRow()==-1){
            Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a vehicle model from the table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור דגם רכב מהרשימה!");
        }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
           int n=0;
           if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Updating confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
           n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות עדכון",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
           if (n==0)
           {
              showModels.setVisible(false);
              updateVehicleModel.setVisible(true);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              label_title.setText("Update Vehicle Model");
              else if (languageComboBox.getSelectedItem().equals("עברית"))
              label_title.setText("עדכן דגם רכב");
              updateVehicleModel.getSerialText().setText(showModels.getResTable().getValueAt(showModels.getResTable().getSelectedRow(), 8).toString());
              updateVehicleModel.getSerialText().setEnabled(false);	
              updateVehicleModel.getNameText().setText(showModels.getResTable().getValueAt(showModels.getResTable().getSelectedRow(), 0).toString());
              updateVehicleModel.getNameText().setEnabled(false);
              String type=showModels.getResTable().getValueAt(showModels.getResTable().getSelectedRow(), 1).toString();
              type=type.replaceAll(" .*", "");
              type=type.replaceAll("-.*", "");
              if (type.equals("Sports"))
                  type="Sport";
              else if (type.equals("Luxury"))
                  type="Lux";
              updateVehicleModel.getTypeComboBox().setSelectedItem(type.toUpperCase());
              updateVehicleModel.getHpText().setText(showModels.getResTable().getValueAt(showModels.getResTable().getSelectedRow(), 2).toString());
              updateVehicleModel.getSpeedText().setText(showModels.getResTable().getValueAt(showModels.getResTable().getSelectedRow(), 3).toString());
              updateVehicleModel.getSeatsText().setText(showModels.getResTable().getValueAt(showModels.getResTable().getSelectedRow(), 4).toString());
              updateVehicleModel.getAutomaticCheckBox().setSelected((boolean) showModels.getResTable().getValueAt(showModels.getResTable().getSelectedRow(), 5));
              updateVehicleModel.getProductionCostText().setText(showModels.getResTable().getValueAt(showModels.getResTable().getSelectedRow(), 6).toString());
               String str=(showModels.getResTable().getValueAt(showModels.getResTable().getSelectedRow(), 7).toString());
               Date d=InputCheck.TryConvertingStringtoDateTwo(str);
               Calendar cal=InputCheck.CalendarGetTimeDate(d);
               Integer month=cal.get(Calendar.MONTH)+1;
               if ((Integer)cal.get(Calendar.DAY_OF_MONTH)<10)
               updateVehicleModel.getDayComboBox().setSelectedItem("0"+((Integer)cal.get(Calendar.DAY_OF_MONTH)).toString());
               else
               updateVehicleModel.getDayComboBox().setSelectedItem(((Integer)cal.get(Calendar.DAY_OF_MONTH)).toString());
               if (month<10)
               updateVehicleModel.getMonthComboBox().setSelectedItem("0"+month.toString());
                else   
               updateVehicleModel.getMonthComboBox().setSelectedItem(month.toString());
               updateVehicleModel.getYearComboBox().setSelectedItem(((Integer)cal.get(Calendar.YEAR)).toString());
              
           }
        } 
    }

private void updateWorkstationActionPerformed(java.awt.event.ActionEvent evt) {  
        if (showWorkstations.getResTable().getSelectedRow()==-1){
            Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a Workstation from the table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור תחנת עבודה מהטבלה!");
        }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
           int n=0;
           if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Updating confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
           n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות עדכון",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
           if (n==0)
           {
              showWorkstations.setVisible(false);
              updateWorkstation.setVisible(true);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              label_title.setText("Update Workstation");
              else if (languageComboBox.getSelectedItem().equals("עברית"))
                  label_title.setText("עדכן תחנת עבודה");
              updateWorkstation.getStationText().setText(showWorkstations.getResTable().getValueAt(showWorkstations.getResTable().getSelectedRow(), 0).toString());
              updateWorkstation.getStationText().setEnabled(false);
              updateWorkstation.getCategoryComboBox().setSelectedItem(showWorkstations.getResTable().getValueAt(showWorkstations.getResTable().getSelectedRow(), 1).toString().toUpperCase());
           }
        } 
    }

private void updateOrderActionPerformed(java.awt.event.ActionEvent evt) {  
         if (showOrders.getResTableSales().getSelectedRow()==-1 && showOrders.getResTablePurchases().getSelectedRow()==-1){
            Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select an order from a table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור הזמנה מאחת הטבלאות!");    
         }
        else if (showOrders.getResTableSales().getSelectedRow()!=-1 && showOrders.getResTablePurchases().getSelectedRow()==-1)
        {
            Object[] options = {"Yes","No"};
            Object[] hebOptions = {"כן","לא"};
            int n=0;
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Updating confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
              else if (languageComboBox.getSelectedItem().equals("עברית"))
              n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות עדכון",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
              if (n==0)
              {
              showOrders.setVisible(false);
              updateOrder.setVisible(true);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              label_title.setText("Update Order");
              else if (languageComboBox.getSelectedItem().equals("עברית"))
              label_title.setText("עדכן הזמנה");
              updateOrder.getSm_btn().setSelected(true);
              updateOrder.getM_btn2().setSelected(true);
              updateOrder.getSm_btn().setEnabled(false);
              updateOrder.getM_btn2().setEnabled(false);
              updateOrder.getSm_btn2().setEnabled(false);
              updateOrder.getM_btn().setEnabled(false);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language")){
              updateOrder.getOrderedFromNameLabel().setText("Shift Manager ID");	
	      updateOrder.getOrderedToNameLabel().setText("Manufacturer Name");
              }
              else if (languageComboBox.getSelectedItem().equals("עברית")){
              updateOrder.getOrderedFromNameLabel().setText("מספר מנהל משמרת");	
	      updateOrder.getOrderedToNameLabel().setText("שם היצרן");    
              }
              updateOrder.getOrderNumberText().setText(showOrders.getResTableSales().getValueAt(showOrders.getResTableSales().getSelectedRow(), 0).toString());
              updateOrder.getOrderNumberText().setEnabled(false);
              updateOrder.getOrderedFromNameText().setText(showOrders.getResTableSales().getValueAt(showOrders.getResTableSales().getSelectedRow(), 1).toString());
              updateOrder.getOrderedToNameText().setText(showOrders.getResTableSales().getValueAt(showOrders.getResTableSales().getSelectedRow(), 12).toString());
               String str=(showOrders.getResTableSales().getValueAt(showOrders.getResTableSales().getSelectedRow(), 19).toString());
               Date d=InputCheck.TryConvertingStringtoDateTwo(str);
               Calendar cal=InputCheck.CalendarGetTimeDate(d);
               Integer month=cal.get(Calendar.MONTH)+1;
               updateOrder.getDayComboBox().setSelectedItem(((Integer)cal.get(Calendar.DAY_OF_MONTH)).toString());
               updateOrder.getMonthComboBox().setSelectedItem(month.toString());
               updateOrder.getYearComboBox().setSelectedItem(((Integer)cal.get(Calendar.YEAR)).toString());
              }
        }
        else if (showOrders.getResTableSales().getSelectedRow()==-1 && showOrders.getResTablePurchases().getSelectedRow()!=-1)
            {
            Object[] options = {"Yes","No"};
            Object[] hebOptions = {"כן","לא"};
            int n=0;
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Updating confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
              else if (languageComboBox.getSelectedItem().equals("עברית"))
              n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות עדכון",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
            if (n==0)
              {
              showOrders.setVisible(false);
              updateOrder.setVisible(true);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              label_title.setText("Update Order");
              else if (languageComboBox.getSelectedItem().equals("עברית"))
              label_title.setText("עדכן הזמנה");
              updateOrder.getM_btn().setSelected(true);
              updateOrder.getSm_btn2().setSelected(true);
              updateOrder.getM_btn().setEnabled(false);
              updateOrder.getSm_btn2().setEnabled(false);
              updateOrder.getM_btn2().setEnabled(false);
              updateOrder.getSm_btn().setEnabled(false);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language")){
              updateOrder.getOrderedFromNameLabel().setText("Manufacturer Name");	
	      updateOrder.getOrderedToNameLabel().setText("Shift Manager ID");
              }
              else if (languageComboBox.getSelectedItem().equals("עברית")){
              updateOrder.getOrderedFromNameLabel().setText("שם היצרן");	
	      updateOrder.getOrderedToNameLabel().setText("מספר מנהל המשמרת");    
              }
              updateOrder.getOrderNumberText().setText(showOrders.getResTablePurchases().getValueAt(showOrders.getResTablePurchases().getSelectedRow(), 0).toString());
              updateOrder.getOrderNumberText().setEnabled(false);
              updateOrder.getOrderedFromNameText().setText(showOrders.getResTablePurchases().getValueAt(showOrders.getResTablePurchases().getSelectedRow(), 1).toString());
              updateOrder.getOrderedToNameText().setText(showOrders.getResTablePurchases().getValueAt(showOrders.getResTablePurchases().getSelectedRow(), 8).toString());
              String str=(showOrders.getResTablePurchases().getValueAt(showOrders.getResTablePurchases().getSelectedRow(), 19).toString());
               Date d=InputCheck.TryConvertingStringtoDateTwo(str);
               Calendar cal=InputCheck.CalendarGetTimeDate(d);
               Integer month=cal.get(Calendar.MONTH)+1;
               updateOrder.getDayComboBox().setSelectedItem(((Integer)cal.get(Calendar.DAY_OF_MONTH)).toString());
               updateOrder.getMonthComboBox().setSelectedItem(month.toString());
               updateOrder.getYearComboBox().setSelectedItem(((Integer)cal.get(Calendar.YEAR)).toString());
              }
        }
        else if (showOrders.getResTableSales().getSelectedRow()!=-1 && showOrders.getResTablePurchases().getSelectedRow()!=-1){
            Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You may only select one order at a time!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור רק הזמנה אחת!");
        }
              
        
    }

private void updateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {  
        if (showEmployees.getGuardTable().getSelectedRow()==-1 && showEmployees.getSmTable().getSelectedRow()==-1 && showEmployees.getWorkersTable().getSelectedRow()==-1){
            Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select an employee from a table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור עובד מאחת הטבלאות!");
        }
        else if (showEmployees.getGuardTable().getSelectedRow()!=-1 && showEmployees.getSmTable().getSelectedRow()==-1 && showEmployees.getWorkersTable().getSelectedRow()==-1)
        {
            Object[] options = {"Yes","No"};
            Object[] hebOptions = {"כן","לא"};
            int n=0;
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Updating confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
            else if (languageComboBox.getSelectedItem().equals("עברית"))
              n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות עדכון",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);  
            if (n==0)
              {
              showEmployees.setVisible(false);
              updateGuard.setVisible(true);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              label_title.setText("Update Guard");
              else if (languageComboBox.getSelectedItem().equals("עברית"))
              label_title.setText("עדכן שומר");
              updateGuard.getIdText().setText(showEmployees.getGuardTable().getValueAt(showEmployees.getGuardTable().getSelectedRow(), 0).toString());
              updateGuard.getIdText().setEnabled(false);
              updateGuard.getNameText().setText(showEmployees.getGuardTable().getValueAt(showEmployees.getGuardTable().getSelectedRow(), 1).toString());
              updateGuard.getCountryText().setText(showEmployees.getGuardTable().getValueAt(showEmployees.getGuardTable().getSelectedRow(), 2).toString());
              updateGuard.getCityText().setText(showEmployees.getGuardTable().getValueAt(showEmployees.getGuardTable().getSelectedRow(), 3).toString());
              updateGuard.getStreetText().setText(showEmployees.getGuardTable().getValueAt(showEmployees.getGuardTable().getSelectedRow(), 4).toString());
              updateGuard.getHnText().setText(showEmployees.getGuardTable().getValueAt(showEmployees.getGuardTable().getSelectedRow(), 5).toString());
              updateGuard.getZipText().setText(showEmployees.getGuardTable().getValueAt(showEmployees.getGuardTable().getSelectedRow(), 6).toString());
              updateGuard.getMsText().setText(showEmployees.getGuardTable().getValueAt(showEmployees.getGuardTable().getSelectedRow(), 9).toString());
              updateGuard.getWnumberText().setText(showEmployees.getGuardTable().getValueAt(showEmployees.getGuardTable().getSelectedRow(), 10).toString());
              String str=(showEmployees.getGuardTable().getValueAt(showEmployees.getGuardTable().getSelectedRow(), 7).toString());
               Date d=InputCheck.TryConvertingStringtoDateTwo(str);
               Calendar cal=InputCheck.CalendarGetTimeDate(d);
               Integer month=cal.get(Calendar.MONTH)+1;
               updateGuard.getBdayComboBox().setSelectedItem(((Integer)cal.get(Calendar.DAY_OF_MONTH)).toString());
               updateGuard.getBmonthComboBox().setSelectedItem(month.toString());
               updateGuard.getByearComboBox().setSelectedItem(((Integer)cal.get(Calendar.YEAR)).toString());
               String string=(showEmployees.getGuardTable().getValueAt(showEmployees.getGuardTable().getSelectedRow(), 8).toString());
               Date date=InputCheck.TryConvertingStringtoDateTwo(string);
               Calendar calendar=InputCheck.CalendarGetTimeDate(date);
               Integer m=calendar.get(Calendar.MONTH)+1;
               updateGuard.getEdayComboBox().setSelectedItem(((Integer)calendar.get(Calendar.DAY_OF_MONTH)).toString());
               updateGuard.getEmonthComboBox().setSelectedItem(m.toString());
               updateGuard.getEyearComboBox().setSelectedItem(((Integer)calendar.get(Calendar.YEAR)).toString());
              }
        }
        else if (showEmployees.getGuardTable().getSelectedRow()==-1 && showEmployees.getSmTable().getSelectedRow()!=-1 && showEmployees.getWorkersTable().getSelectedRow()==-1)
        {
            Object[] options = {"Yes","No"};
            Object[] hebOptions = {"כן","לא"};
            int n=0;
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Updating confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
             else if (languageComboBox.getSelectedItem().equals("עברית"))
              n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות עדכון",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]); 
            if (n==0)
              {
                showEmployees.setVisible(false);
              updateShiftManager.setVisible(true);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              label_title.setText("Update Shift Manager");
              else if (languageComboBox.getSelectedItem().equals("עברית"))
              label_title.setText("עדכן מנהל משמרת");
              updateShiftManager.getIdText().setText(showEmployees.getSmTable().getValueAt(showEmployees.getSmTable().getSelectedRow(), 0).toString());
              updateShiftManager.getIdText().setEnabled(false);
              updateShiftManager.getNameText().setText(showEmployees.getSmTable().getValueAt(showEmployees.getSmTable().getSelectedRow(), 1).toString());
              updateShiftManager.getCountryText().setText(showEmployees.getSmTable().getValueAt(showEmployees.getSmTable().getSelectedRow(), 2).toString());
              updateShiftManager.getCityText().setText(showEmployees.getSmTable().getValueAt(showEmployees.getSmTable().getSelectedRow(), 3).toString());
              updateShiftManager.getStreetText().setText(showEmployees.getSmTable().getValueAt(showEmployees.getSmTable().getSelectedRow(), 4).toString());
              updateShiftManager.getHnText().setText(showEmployees.getSmTable().getValueAt(showEmployees.getSmTable().getSelectedRow(), 5).toString());
              updateShiftManager.getZipText().setText(showEmployees.getSmTable().getValueAt(showEmployees.getSmTable().getSelectedRow(), 6).toString());
              updateShiftManager.getHourlyWageText().setText(showEmployees.getSmTable().getValueAt(showEmployees.getSmTable().getSelectedRow(), 9).toString());
              updateShiftManager.getExtraWageText().setText(showEmployees.getSmTable().getValueAt(showEmployees.getSmTable().getSelectedRow(), 10).toString());
              String str=(showEmployees.getSmTable().getValueAt(showEmployees.getSmTable().getSelectedRow(), 7).toString());
               Date d=InputCheck.TryConvertingStringtoDateTwo(str);
               Calendar cal=InputCheck.CalendarGetTimeDate(d);
               Integer month=cal.get(Calendar.MONTH)+1;
               updateShiftManager.getBdayComboBox().setSelectedItem(((Integer)cal.get(Calendar.DAY_OF_MONTH)).toString());
               updateShiftManager.getBmonthComboBox().setSelectedItem(month.toString());
               updateShiftManager.getByearComboBox().setSelectedItem(((Integer)cal.get(Calendar.YEAR)).toString());
               String string=(showEmployees.getSmTable().getValueAt(showEmployees.getSmTable().getSelectedRow(), 8).toString());
               Date date=InputCheck.TryConvertingStringtoDateTwo(string);
               Calendar calendar=InputCheck.CalendarGetTimeDate(date);
               Integer m=calendar.get(Calendar.MONTH)+1;
               updateShiftManager.getEdayComboBox().setSelectedItem(((Integer)calendar.get(Calendar.DAY_OF_MONTH)).toString());
               updateShiftManager.getEmonthComboBox().setSelectedItem(m.toString());
               updateShiftManager.getEyearComboBox().setSelectedItem(((Integer)calendar.get(Calendar.YEAR)).toString());
              }
        }
        else if (showEmployees.getGuardTable().getSelectedRow()==-1 && showEmployees.getSmTable().getSelectedRow()==-1 && showEmployees.getWorkersTable().getSelectedRow()!=-1)
        {
            Object[] options = {"Yes","No"};
            Object[] hebOptions = {"כן","לא"};
            int n=0;
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Updating confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
            else if (languageComboBox.getSelectedItem().equals("עברית"))
              n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות עדכון",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);   
            if (n==0)
              {
              showEmployees.setVisible(false);
              updateWorker.setVisible(true);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              label_title.setText("Update Worker");
              else if (languageComboBox.getSelectedItem().equals("עברית"))
              label_title.setText("עדכן פועל");    
              updateWorker.getIdText().setText(showEmployees.getWorkersTable().getValueAt(showEmployees.getWorkersTable().getSelectedRow(), 0).toString());
              updateWorker.getIdText().setEnabled(false);
              updateWorker.getNameText().setText(showEmployees.getWorkersTable().getValueAt(showEmployees.getWorkersTable().getSelectedRow(), 1).toString());
              updateWorker.getCountryText().setText(showEmployees.getWorkersTable().getValueAt(showEmployees.getWorkersTable().getSelectedRow(), 2).toString());
              updateWorker.getCityText().setText(showEmployees.getWorkersTable().getValueAt(showEmployees.getWorkersTable().getSelectedRow(), 3).toString());
              updateWorker.getStreetText().setText(showEmployees.getWorkersTable().getValueAt(showEmployees.getWorkersTable().getSelectedRow(), 4).toString());
              updateWorker.getHnText().setText(showEmployees.getWorkersTable().getValueAt(showEmployees.getWorkersTable().getSelectedRow(), 5).toString());
              updateWorker.getZipText().setText(showEmployees.getWorkersTable().getValueAt(showEmployees.getWorkersTable().getSelectedRow(), 6).toString());
              updateWorker.getHourlyWageText().setText(showEmployees.getWorkersTable().getValueAt(showEmployees.getWorkersTable().getSelectedRow(), 9).toString());
              String str=(showEmployees.getWorkersTable().getValueAt(showEmployees.getWorkersTable().getSelectedRow(), 7).toString());
               Date d=InputCheck.TryConvertingStringtoDateTwo(str);
               Calendar cal=InputCheck.CalendarGetTimeDate(d);
               Integer month=cal.get(Calendar.MONTH)+1;
               updateWorker.getBdayComboBox().setSelectedItem(((Integer)cal.get(Calendar.DAY_OF_MONTH)).toString());
               updateWorker.getBmonthComboBox().setSelectedItem(month.toString());
               updateWorker.getByearComboBox().setSelectedItem(((Integer)cal.get(Calendar.YEAR)).toString());
               String string=(showEmployees.getWorkersTable().getValueAt(showEmployees.getWorkersTable().getSelectedRow(), 8).toString());
               Date date=InputCheck.TryConvertingStringtoDateTwo(string);
               Calendar calendar=InputCheck.CalendarGetTimeDate(date);
               Integer m=calendar.get(Calendar.MONTH)+1;
               updateWorker.getEdayComboBox().setSelectedItem(((Integer)calendar.get(Calendar.DAY_OF_MONTH)).toString());
               updateWorker.getEmonthComboBox().setSelectedItem(m.toString());
               updateWorker.getEyearComboBox().setSelectedItem(((Integer)calendar.get(Calendar.YEAR)).toString());
              }
        }
        else if ((showEmployees.getGuardTable().getSelectedRow()!=-1 && showEmployees.getSmTable().getSelectedRow()!=-1 && showEmployees.getWorkersTable().getSelectedRow()!=-1) || (showEmployees.getGuardTable().getSelectedRow()==-1 && showEmployees.getSmTable().getSelectedRow()!=-1 && showEmployees.getWorkersTable().getSelectedRow()!=-1) || (showEmployees.getGuardTable().getSelectedRow()!=-1 && showEmployees.getSmTable().getSelectedRow()==-1 && showEmployees.getWorkersTable().getSelectedRow()!=-1) || (showEmployees.getGuardTable().getSelectedRow()!=-1 && showEmployees.getSmTable().getSelectedRow()!=-1 && showEmployees.getWorkersTable().getSelectedRow()==-1)){
            Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You may only select one employee at a time!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור רק עובד אחד!");    
        }
    }

private void updateUserActionPerformed(java.awt.event.ActionEvent evt) {  
        if (showUsers.getResTable().getSelectedRow()==-1){
            Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a user from the table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור משתמש מהטבלה!");
        }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
            int n=0;
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","Updating confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
              n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות עדכון",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
            if (n==0)
           {
              if (showUsers.getResTable().getValueAt(showUsers.getResTable().getSelectedRow(), 0).toString().equals("admin")){
              showUsers.setVisible(false);
              updateUser.setVisible(true);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              label_title.setText("Update User");
              else if (languageComboBox.getSelectedItem().equals("עברית"))
              label_title.setText("עדכן משתמש");    
              updateUser.getUsernameText().setText(showUsers.getResTable().getValueAt(showUsers.getResTable().getSelectedRow(), 0).toString());
              updateUser.getUsernameText().setEnabled(false);
              updateUser.getPasswordText().setText(showUsers.getResTable().getValueAt(showUsers.getResTable().getSelectedRow(), 1).toString());
              updateUser.getTypeComboBox().setSelectedItem(showUsers.getResTable().getValueAt(showUsers.getResTable().getSelectedRow(), 2).toString());
              updateUser.getTypeComboBox().setEnabled(false);
              updateUser.getSqComboBox().setSelectedItem(showUsers.getResTable().getValueAt(showUsers.getResTable().getSelectedRow(), 3).toString());
              updateUser.getSecretAnswerText().setText(showUsers.getResTable().getValueAt(showUsers.getResTable().getSelectedRow(), 4).toString());
              }
              else
              {
              showUsers.setVisible(false);
              updateUser.setVisible(true);
              if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
              label_title.setText("Update User");
              else if (languageComboBox.getSelectedItem().equals("עברית"))
              label_title.setText("עדכן משתמש");
              updateUser.getUsernameText().setText(showUsers.getResTable().getValueAt(showUsers.getResTable().getSelectedRow(), 0).toString());
              updateUser.getUsernameText().setEnabled(false);
              updateUser.getPasswordText().setText(showUsers.getResTable().getValueAt(showUsers.getResTable().getSelectedRow(), 1).toString());
              updateUser.getTypeComboBox().setSelectedItem(showUsers.getResTable().getValueAt(showUsers.getResTable().getSelectedRow(), 2).toString());
              updateUser.getTypeComboBox().setEnabled(true);
              updateUser.getSqComboBox().setSelectedItem(showUsers.getResTable().getValueAt(showUsers.getResTable().getSelectedRow(), 3).toString());
              updateUser.getSecretAnswerText().setText(showUsers.getResTable().getValueAt(showUsers.getResTable().getSelectedRow(), 4).toString());
              }
           }
        } 
    }

private void moreManufMouseClickPerformed(java.awt.event.ActionEvent evt){
      if (showManufacturers.getResTable().getSelectedRow()==-1){
          Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a manufacturer from the table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור יצרן מהטבלה!");    
      }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
            int n=0;
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","More options confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
              n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות אפשרויות נוספות",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
            if (n==0)
           {
              showManufacturers.setVisible(false);
              showManufMoreDetails.setVisible(true);
             showManufMoreDetails.setManuName((String)showManufacturers.getResTable().getValueAt(showManufacturers.getResTable().getSelectedRow(), 0));
             label_title.setText("All Manufacturers - More");
           }
        }   
}
private void moreEmployeesMouseClickPerformed(java.awt.event.ActionEvent evt){
      if (showEmployees.getWorkersTable().getSelectedRow()==-1){
          Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a worker from the workers table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור פועל מטבלת הפועלים!");    
      }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
            int n=0;
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","More options confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
              n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות אפשרויות נוספות",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
            if (n==0)
           {
              showEmployees.setVisible(false);
              showEmployeesMore.setVisible(true);
              showEmployeesMore.setEmployeeId((String) showEmployees.getWorkersTable().getValueAt(showEmployees.getWorkersTable().getSelectedRow(), 0));
            label_title.setText("All Employees - More");
           }
        }   
}
private void moreModelMouseClickPerformed(java.awt.event.ActionEvent evt){
      if (showModels.getResTable().getSelectedRow()==-1){
          Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a vehicle Model from the table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור דגם רכב מהטבלה!");    
      }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
            int n=0;
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","More options confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
              n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות אפשרויות נוספות",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
            if (n==0)
           {
              showModels.setVisible(false);
              showModelMore.setVisible(true);
              showModelMore.setModelName((String)showModels.getResTable().getValueAt(showModels.getResTable().getSelectedRow(), 0));
              label_title.setText("All Vehicle Models - More");
           }
        }   
}
private void moreOrderMouseClickPerformed(java.awt.event.ActionEvent evt){
      if (showOrders.getResTableSales().getSelectedRow()==-1 && showOrders.getResTablePurchases().getSelectedRow()==-1){
           Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select an Order from a table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור הזמנה מאחת הטבלאות!");
      }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
            int n=0;
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","More options confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
              n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות אפשרויות נוספות",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
            if (n==0)
           {
              showOrders.setVisible(false);
              showOrderMore.setVisible(true);
              if(showOrders.getResTableSales().getSelectedRow()!=-1)
                 showOrderMore.setOrderNumber((Integer)showOrders.getResTableSales().getValueAt(showOrders.getResTableSales().getSelectedRow(), 0));
              if(showOrders.getResTablePurchases().getSelectedRow()!=-1)
               showOrderMore.setOrderNumber((Integer)showOrders.getResTablePurchases().getValueAt(showOrders.getResTablePurchases().getSelectedRow(), 0));
              label_title.setText("All Orders - More");
           }
        }   
}
private void morePPTMouseClickPerformed(java.awt.event.ActionEvent evt){
      if (showProductionPlanTypes.getResTable().getSelectedRow()==-1){
          Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a production plan type from the table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "עליך לבחור סוג תכנית יצור מהטבלה!");
      }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
            int n=0;
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","More options confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
              n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות אפשרויות נוספות",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
            if (n==0)
           {
              showProductionPlanTypes.setVisible(false);
              showPPTMore.setVisible(true);
              showPPTMore.SetProductionSerial((Integer) showProductionPlanTypes.getResTable().getValueAt(showProductionPlanTypes.getResTable().getSelectedRow(), 0));
              label_title.setText("All Production Plan Types - More");
           }
        }   
}
private void morePartMouseClickPerformed(java.awt.event.ActionEvent evt){
      if (showParts.getResTable().getSelectedRow()==-1){
           Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a part from the table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור חלק מהטבלה!");    
      }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
            int n=0;
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","More options confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
              n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות אפשרויות נוספות",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
            if (n==0)
           {
              showParts.setVisible(false);
              showPartMore.setVisible(true);
              showPartMore.setPartNum((Integer) showParts.getResTable().getValueAt(showParts.getResTable().getSelectedRow(), 0));
              label_title.setText("All PartTypes - More");
           }
        }   
}
private void moreWarehouseMouseClickPerformed(java.awt.event.ActionEvent evt){
      if (showWarehouses.getResTable().getSelectedRow()==-1){
          Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a Warehouse from the table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור מחסן מהטבלה!");
      }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
            int n=0;
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","More options confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
              n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות אפשרויות נוספות",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
            if (n==0)
           {
              showWarehouses.setVisible(false);
              showWhMore.setVisible(true);
             showWhMore.setWarehouseNum((Integer) showWarehouses.getResTable().getValueAt(showWarehouses.getResTable().getSelectedRow(), 0));
             label_title.setText("All Warehouses - More");
           }
        }   
}

private void moreShiftsMouseClickPerformed(java.awt.event.ActionEvent evt){
      if (showShifts.getResTable().getSelectedRow()==-1){
            Toolkit.getDefaultToolkit().beep();
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "You must select a shift from the table!");
            else if (languageComboBox.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "עליך לבחור משמרת מהטבלה!");    
      }
        else
        {
           Object[] options = {"Yes","No"};
           Object[] hebOptions = {"כן","לא"};
            int n=0;
            if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
           n = JOptionPane.showOptionDialog(null, "Are you sure you want to proceed?","More options confirmation",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,options,options[1]);
           else if (languageComboBox.getSelectedItem().equals("עברית"))
              n = JOptionPane.showOptionDialog(null, "האם אתה בטוח שברצונך להמשיך?","אימות אפשרויות נוספות",JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE,null,hebOptions,hebOptions[1]);
            if (n==0)
           {
              showShifts.setVisible(false);
              showShiftsMore.setVisible(true);
              String str=showShifts.getResTable().getValueAt(showShifts.getResTable().getSelectedRow(), 0).toString();
                   Date date=InputCheck.TryConvertingStringtoDateTwo(str);
                   Calendar c=InputCheck.CalendarGetTimeDate(date);
             showShiftsMore.setStartingTime(c);
             label_title.setText("All Shifts - More");
           }
        }   
}

void setColor(JPanel p){
    p.setBackground(new Color(118,219,219));
}
void resetColor(JPanel p){
    p.setBackground(new Color(76,188,188));
}

    public JTextField getUserText() {
        return userText;
    }

    public JComboBox<String> getLanguageComboBox() {
        return languageComboBox;
    }

    public JPanel getBtn_admin() {
        return btn_admin;
    }
public void DisableUpdateEmployees(java.awt.event.ActionEvent evt){
    if (options.getLock().getjComboBoxEmployees().getSelectedItem().equals("Disabled")){
     showEmployees.getUpdate().setEnabled(false);
    showEmployees.getUpdate().setBackground(new Color(204,204,204));
    if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
    showEmployees.getUpdate().setToolTipText("This feature is currently disabled!");
    else if (languageComboBox.getSelectedItem().equals("עברית"))
    showEmployees.getUpdate().setToolTipText("האפשרות לעדכן כרגע סגורה!");
    }
    else{
         showEmployees.getUpdate().setEnabled(true);
         showEmployees.getUpdate().setBackground(new Color(0,102,102));
         showEmployees.getUpdate().setToolTipText("");
            }
}
public void DisableUpdateOrders(java.awt.event.ActionEvent evt){
    if (options.getLock().getjComboBoxOrders().getSelectedItem().equals("Disabled")){
     showOrders.getUpdate().setEnabled(false);
    showOrders.getUpdate().setBackground(new Color(204,204,204));
    if (languageComboBox.getSelectedItem().equals("English") || languageComboBox.getSelectedItem().equals("Choose a language"))
    showOrders.getUpdate().setToolTipText("This feature is currently disabled!");
    else if (languageComboBox.getSelectedItem().equals("עברית"))
    showOrders.getUpdate().setToolTipText("האפשרות לעדכן כרגע סגורה!");
    }
    else{
         showOrders.getUpdate().setEnabled(true);
         showOrders.getUpdate().setBackground(new Color(0,102,102));
         showOrders.getUpdate().setToolTipText("");
   }
}
 public void DisableAddEmployees(java.awt.event.ActionEvent evt){
     if (options.getLock().getjComboBoxaddEmployees().getSelectedItem().equals("Disabled")){
        if(e.getG_btn().isVisible()||e.getW_btn().isVisible() || e.getSm_btn().isVisible()){
             e.getG_btn().setVisible(false);
             e.getW_btn().setVisible(false);
             e.getSm_btn().setVisible(false);
        }
    }
    else{
             e.getG_btn().setVisible(true);
             e.getW_btn().setVisible(true);
             e.getSm_btn().setVisible(true);
   }
}
public void DisableAddOrders(java.awt.event.ActionEvent evt){
    if (options.getLock().getjComboBoxAddOrders().getSelectedItem().equals("Disabled")){
        if(o.getPanel_AddOrder().isVisible()){
             o.getPanel_AddOrder().setVisible(false);   
        }
    }
    else{
         o.getPanel_AddOrder().setVisible(true);
   }
}
public void DisableAddShifts(java.awt.event.ActionEvent evt){
    if (options.getLock().getjComboBoxAddShifts().getSelectedItem().equals("Disabled")){
        if(shift.getPanel_AddShift().isVisible()){
             shift.getPanel_AddShift().setVisible(false);
        }
    }
    else{
         shift.getPanel_AddShift().setVisible(true);
   }
}
    public void setColorSideBar(JPanel p, int m, int n, int r){
         p.setBackground(new Color(m,n,r));
    }
    public void setColorSideBarButtons(JLayeredPane p, int m, int n, int r){
         p.setBackground(new Color(m,n,r));
    }
        public void setColorSideBarDatList(JList p, int m, int n, int r){
         p.setBackground(new Color(m,n,r));
         if(m==76&& n== 188&& r== 188){
             p.setSelectionBackground(new Color(118,219,219));
         }
    }

    public void ChangeSideBarColor(java.awt.event.ActionEvent evt){
        if(options.getDesign().getjComboBoxSideBar().getSelectedItem().equals("Blue")){
            setColorSideBar(side,5,31,108);
            setColorSideBarButtons(layer_AddList,5,31,108);
            setColorSideBarButtons(layer_AdminList,5,31,108);
            setColorSideBarButtons(layer_ShowList,5,31,108);
            setColorSideBar(btn_home,6,78,172);
            setColorSideBar(btn_addData, 6,78,172);
            setColorSideBar(btn_admin, 6,78,172);
            setColorSideBar(btn_showData, 6,78,172);
            setColorSideBarDatList(addDataList,  5,31,108);
            setColorSideBarDatList(showDataList,  5,31,108);
            setColorSideBarDatList(adminDataList,  5,31,108);
            userText.setBackground(new Color(5,31,108));
        }
        else if(options.getDesign().getjComboBoxSideBar().getSelectedItem().equals("Green")){
            setColorSideBar(side,0,153,153);
            setColorSideBarButtons(layer_AddList,0,153,153);
            setColorSideBarButtons(layer_AdminList,0,153,153);
            setColorSideBarButtons(layer_ShowList,0,153,153);
            setColorSideBar(btn_home,76,188,188);
            setColorSideBar(btn_addData,76,188,188);
            setColorSideBar(btn_admin, 76,188,188);
            setColorSideBar(btn_showData, 76,188,188);
            setColorSideBarDatList(addDataList,  0,153,153);
            setColorSideBarDatList(showDataList,  0,153,153);
            setColorSideBarDatList(adminDataList,  0,153,153);
            userText.setBackground(new Color(0,153,153));
        }
        else if(options.getDesign().getjComboBoxSideBar().getSelectedItem().equals("Red")){
            setColorSideBar(side,140,2,2);
            setColorSideBarButtons(layer_AddList,140,2,2);
            setColorSideBarButtons(layer_AdminList,140,2,2);
            setColorSideBarButtons(layer_ShowList,140,2,2);
            setColorSideBar(btn_home,198,61,61);
            setColorSideBar(btn_addData,198,61,61);
            setColorSideBar(btn_admin, 198,61,61);
            setColorSideBar(btn_showData,198,61,61);
            setColorSideBarDatList(addDataList,140,2,2);
            setColorSideBarDatList(showDataList,140,2,2);
            setColorSideBarDatList(adminDataList,140,2,2);
            userText.setBackground(new Color(140,2,2));
        }
        else if(options.getDesign().getjComboBoxSideBar().getSelectedItem().equals("Black")){
            setColorSideBar(side,0,0,0);
            setColorSideBarButtons(layer_AddList,0,0,0);
            setColorSideBarButtons(layer_AdminList,0,0,0);
            setColorSideBarButtons(layer_ShowList,0,0,0);
            setColorSideBar(btn_home,69,65,65);
            setColorSideBar(btn_addData,69,65,65);
            setColorSideBar(btn_admin,69,65,65);
            setColorSideBar(btn_showData,69,65,65);
            setColorSideBarDatList(addDataList,0,0,0);
            setColorSideBarDatList(showDataList,0,0,0);
            setColorSideBarDatList(adminDataList,0,0,0);
            userText.setBackground(new Color(0,0,0));
        }
        else if(options.getDesign().getjComboBoxSideBar().getSelectedItem().equals("Yellow")){
            setColorSideBar(side,206,170,24);
            setColorSideBarButtons(layer_AddList,206,170,24);
            setColorSideBarButtons(layer_AdminList,206,170,24);
            setColorSideBarButtons(layer_ShowList,206,170,24);
            setColorSideBar(btn_home,240,204,58);
            setColorSideBar(btn_addData,240,204,58);
            setColorSideBar(btn_admin,240,204,58);
            setColorSideBar(btn_showData,240,204,58);
            setColorSideBarDatList(addDataList,206,170,24);
            setColorSideBarDatList(showDataList,206,170,24);
            setColorSideBarDatList(adminDataList,206,170,24);
            userText.setBackground(new Color(206,170,24));
        }
        else if(options.getDesign().getjComboBoxSideBar().getSelectedItem().equals("Pink")){
            setColorSideBar(side,207,19,113);
            setColorSideBarButtons(layer_AddList,207,19,113);
            setColorSideBarButtons(layer_AdminList,207,19,113);
            setColorSideBarButtons(layer_ShowList,207,19,113);
            setColorSideBar(btn_home,239,56,148);
            setColorSideBar(btn_addData,239,56,148);
            setColorSideBar(btn_admin,239,56,148);
            setColorSideBar(btn_showData,239,56,148);
            setColorSideBarDatList(addDataList,207,19,113);
            setColorSideBarDatList(showDataList,207,19,113);
            setColorSideBarDatList(adminDataList,207,19,113);
            userText.setBackground(new Color(207,19,113));
        }
    }
  public void ChangeBackgroundColor(java.awt.event.ActionEvent evt){
        if(options.getDesign().getjComboBoxBackground().getSelectedItem().equals("Blue")){
            setColorSideBar(title_Panel,49,76,156);
            label_title.setForeground(new Color(255,255,255));  
        }
        else if(options.getDesign().getjComboBoxBackground().getSelectedItem().equals("Green")){
          setColorSideBar(title_Panel,210,255,255); 
          label_title.setForeground(new Color(102,102,102));
        }
        else if(options.getDesign().getjComboBoxBackground().getSelectedItem().equals("Red")){
          setColorSideBar(title_Panel,210,105,105);
          label_title.setForeground(new Color(255,255,255));
            
        }
        else if(options.getDesign().getjComboBoxBackground().getSelectedItem().equals("Black")){
           setColorSideBar(title_Panel,109,109,109);
          label_title.setForeground(new Color(255,255,255));
            
        }
        else if(options.getDesign().getjComboBoxBackground().getSelectedItem().equals("Yellow")){
              setColorSideBar(title_Panel,248,232,169);   
              label_title.setForeground(new Color(102,102,102));
        }
        else if(options.getDesign().getjComboBoxBackground().getSelectedItem().equals("Pink")){
            setColorSideBar(title_Panel,248,174,211);
            label_title.setForeground(new Color(255,255,255));
        }
    }

    public void volumeControl(java.awt.event.ActionEvent evt){
      if(options.getVolume().getLoginSoundComboBox().isSelected()){  
          options.getVolume().getLoginSoundComboBox().setContentAreaFilled(false);
          options.getVolume().getLoginSoundComboBox().setBackground(new Color(0,204,153));
          options.getVolume().getLoginSoundComboBox().setOpaque(true);
          options.getVolume().getLoginSoundComboBox().setText("On");
          
          
      }
      else{
         options.getVolume().getLoginSoundComboBox().setContentAreaFilled(false);
        options.getVolume().getLoginSoundComboBox().setBackground(new Color(255,51,51));
        options.getVolume().getLoginSoundComboBox().setText("Off");
        options.getVolume().getLoginSoundComboBox().setOpaque(true);
        
        
      }
    }

    public JLabel getAdminMessageText() {
        return adminMessageText;
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DynamicPanel;
    private javax.swing.JMenu Help;
    private javax.swing.JMenu Reports;
    private javax.swing.JList<String> addDataList;
    private javax.swing.JScrollPane add_ScrollPane;
    private javax.swing.JScrollPane add_ScrollPane1;
    private javax.swing.JList<String> adminDataList;
    private javax.swing.JLabel adminMessageText;
    private javax.swing.JScrollPane admin_ScrollPane;
    private javax.swing.JPanel background;
    private javax.swing.JPanel btn_addData;
    private javax.swing.JPanel btn_admin;
    private javax.swing.JPanel btn_home;
    private javax.swing.JPanel btn_showData;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu file;
    private javax.swing.JMenuItem findShiftByTime;
    private javax.swing.JMenuItem findVehicleInCity;
    private javax.swing.JMenuItem getAllEmployeesOrderedBySalaryInMonth;
    private javax.swing.JMenuItem getAllEmployeesOrderedByTypeAndById;
    private javax.swing.JMenuItem getAllHourlyEmployeesWithShiftsAndSlots;
    private javax.swing.JMenuItem getAllShiftsOrderedByNumberOfProductionPlanTypes;
    private javax.swing.JMenuItem getAllWarehousesInManufacturerCountry;
    private javax.swing.JMenuItem getKModelsWithLeastVehicles;
    private javax.swing.JMenuItem getLastFutureProductionOfModel;
    private javax.swing.JMenuItem getMissingPartsForProductionPlan;
    private javax.swing.JMenuItem getMostProfitableManufacturer;
    private javax.swing.JMenuItem getNumberOfPartsForEachOrder;
    private javax.swing.JMenuItem getPartsQuantityInAllOrders;
    private javax.swing.JMenuItem getProductionPlanTypesOrderedByNumberOfSlots;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JSeparator jSeparator1;
    private static javax.swing.JLabel label_title;
    protected javax.swing.JComboBox<String> languageComboBox;
    private javax.swing.JLayeredPane layer_AddList;
    private javax.swing.JLayeredPane layer_AdminList;
    private javax.swing.JLayeredPane layer_ShowList;
    private javax.swing.JMenuItem logOff;
    private javax.swing.JMenuItem save;
    private javax.swing.JList<String> showDataList;
    private javax.swing.JPanel side;
    private javax.swing.JPanel title_Panel;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
