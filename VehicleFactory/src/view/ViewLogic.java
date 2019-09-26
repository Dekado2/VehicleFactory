/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerLogic;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.*;
import java.io.Serializable;
import java.io.Writer;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import utils.Constants;
import utils.E_PartCategory;
import utils.E_UserType;
import utils.MyFileLogWriter;
import view.Reports.*;
import static view.InputCheck.*;
import view.MyPanels.About;

public class ViewLogic implements Serializable{
    private static final long serialVersionUID = 1L;
    /** Singleton instance */
    private static ViewLogic instance;
    /** ViewLogic instance */
    public ControllerLogic controller;
    public ModelLogic model;
/**
* View Logic constructor 
*/   
private ViewLogic() {
    controller = ControllerLogic.getInstance();
    model=ModelLogic.getInstance();
}
/**
* Retrieves the singleton instance of ViewLogic
* @return Singleton instance
*/
public static ViewLogic getInstance() {
   if (instance == null)
	instance = new ViewLogic();
	return instance;
     }


public void FirstLoginScreen(){
  Login log=new Login();
  log.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  log.setSize(screenSize.width,screenSize.height);
  log.pack();
  log.setVisible( true );
 }

public void LoginScreen(JComboBox language){
  Login log=new Login();
  log.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
  log.setSize(screenSize.width,screenSize.height);
  log.pack();
  log.setVisible( true );
  log.languageComboBox.setSelectedItem(language.getSelectedItem());
 }

public boolean Verification(String username, String password, Login login,JComboBox language)
{
        E_UserType utu,uta=null;
        utu=E_UserType.valueOf("User");
        uta=E_UserType.valueOf("Admin");
         User user=model.getUsers().get(username);
        if (user==null)
         {
             Toolkit.getDefaultToolkit().beep();
             if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
             JOptionPane.showMessageDialog(null, "Invalid Username/Password");
             else if (language.getSelectedItem().equals("עברית"))
             JOptionPane.showMessageDialog(null, "שם משתמש או סיסמא שגויים!");
             MyFileLogWriter.writeToLogFile("Login failed!", true);
              return false;
         }
           String pass=user.getPassword();
        if (pass.equals(password))
         {
            UserMenu um=new UserMenu();
            try{
             deSerializeAdminDesignChoicesLog(Constants.Ser_AdminDesignsFileName, um);
            }
            catch (IOException i) {
                    System.out.println("Failed deserialization of admin's design choices!");
                }
            try{
             deSerializeAdminLocksChoicesLog(Constants.Ser_AdminLocksFileName, um);
            }
            catch (IOException i) {
                    System.out.println("Failed deserialization of admin's locks choices!");
                }
            try{
             deSerializeAdminMessageChoicesLog(Constants.Ser_AdminMessageFileName, um);
            }
            catch (IOException i) {
                    System.out.println("Failed deserialization of admin's message!");
                }
            try{
             deSerializeAdminVolumeChoicesLog(Constants.Ser_AdminVolumeFileName, um);
            }
            catch (IOException i) {
                    System.out.println("Failed deserialization of admin's volume choices!");
                }
            if (um.options.getVolume().getLoginSoundComboBox().getText().equals("On"))
            {
              File music=new File("win.wav");
              try{
              Clip clip=AudioSystem.getClip();
              clip.open(AudioSystem.getAudioInputStream(music));
              clip.start();
              }
               catch(Exception e){
                  JOptionPane.showMessageDialog(null, e.getLocalizedMessage());
              }
         }
            if ((model.getUsers().get(username)).getType().equals(utu)){
            um.getBtn_admin().setVisible(false);
            um.getBtn_admin().setEnabled(false);
        }
        else if ((model.getUsers().get(username)).getType().equals(uta)){
            um.getBtn_admin().setVisible(true);
            um.getBtn_admin().setEnabled(true);
        }
            um.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            um.setSize(screenSize.width,screenSize.height);
            um.pack();
            um.setVisible( true );
            um.showUsers.setUserName(username);
            if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language")){
                Locale l = new Locale("en", "US");
                ResourceBundle r = ResourceBundle.getBundle("view/Bundle",l);
                um.getUserText().setText(r.getString("UserMenu.userText.text") + username + "!");
            }
            else if (language.getSelectedItem().equals("עברית")){
                Locale l = new Locale("iw", "IL");
                ResourceBundle r = ResourceBundle.getBundle("view/Bundle",l);
                um.getUserText().setText("!" + username + r.getString("UserMenu.userText.text") );
            }
            um.languageComboBox.setSelectedItem(language.getSelectedItem());
            
            login.dispose();
            MyFileLogWriter.writeToLogFile("Login successful!", true);
            return true;
         }
        Toolkit.getDefaultToolkit().beep();
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
        JOptionPane.showMessageDialog(null, "Invalid Username/Password");
        else if (language.getSelectedItem().equals("עברית"))
        JOptionPane.showMessageDialog(null, "שם משתמש או סיסמא שגויים!");
        MyFileLogWriter.writeToLogFile("Login failed!", true);
        return false;
}

public void ForgotPassword(Login login,JComboBox language)
 {
    ForgotPassword fp=new ForgotPassword();
    fp.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    fp.setSize(screenSize.width,screenSize.height);
    fp.pack();
    fp.setVisible( true );
    fp.languageComboBox.setSelectedItem(language.getSelectedItem());
    login.dispose();
    
 }

public void BackForgotPassword(ForgotPassword fp)
{
    fp.dispose();
}

public void PasswordResetToLoginScreen(PasswordReset pr)
{
    pr.dispose();
}
public void Quit()
{
    System.exit(0);
}

public boolean QAVerification(String username,String secretAnswer,ForgotPassword fp,JComboBox language)
{
      
        User user=model.getUsers().get(username);
        String secAns=user.getSecretAnswer();
        if (secAns.equals(secretAnswer))
             {
              PasswordReset pr=new PasswordReset();
              pr.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
              Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
              pr.setSize(screenSize.width,screenSize.height);
              pr.pack();
              pr.setVisible( true );
              pr.setUserName(username);
              pr.languageComboBox.setSelectedItem(language.getSelectedItem());
              fp.dispose();
              return true;
             }
        else
        {
            Toolkit.getDefaultToolkit().beep();
            if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
                JOptionPane.showMessageDialog(null, "Wrong answer!");
             else if (language.getSelectedItem().equals("עברית"))
               JOptionPane.showMessageDialog(null, "תשובה שגויה!");
          return false;
        }
}

public boolean IsValidUser(String username,JComboBox language)
{
         User user=model.getUsers().get(username);
          if (user==null)
          {
              Toolkit.getDefaultToolkit().beep();
             if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
              JOptionPane.showMessageDialog(null, "Invalid Username!");
             else if (language.getSelectedItem().equals("עברית"))
             JOptionPane.showMessageDialog(null, "שם משתמש שגוי!");    
            return false;
          }
           return true;
        
}

public String RetrieveSecretQuestion(String username)
{
    User user=model.getUsers().get(username);
    String sq=user.getSecretQuestion().toString();
    return sq;
}

public void PasswordsNotMatching(JComboBox language)
{
    Toolkit.getDefaultToolkit().beep();
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    JOptionPane.showMessageDialog(null, "Password doesn't match!");
    else if (language.getSelectedItem().equals("עברית"))
    JOptionPane.showMessageDialog(null, "הסיסמאות לא תואמות!");    
}

public void SaveNewPasswordMessage(JComboBox language)
{
    Toolkit.getDefaultToolkit().beep();
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    JOptionPane.showMessageDialog(null, "Password has changed successfully!");
    else if (language.getSelectedItem().equals("עברית"))
    JOptionPane.showMessageDialog(null, "הסיסמא שונתה בהצלחה!");    
}

public void SaveNewPasswordFailedMessage(JComboBox language)
{
    Toolkit.getDefaultToolkit().beep();
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    JOptionPane.showMessageDialog(null, "Password was not changed, please try again!");
    else if (language.getSelectedItem().equals("עברית"))
    JOptionPane.showMessageDialog(null, "הסיסמא לא שונתה, אנא נסה שנית!");
}

public void ExportSuccess(String reportName, String fileName,JComboBox language)
{
    Toolkit.getDefaultToolkit().beep();
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    JOptionPane.showMessageDialog(null, "Data exported successfully to " + "\""+reportName+"_"+fileName+".csv\" in your Project's folder!");
    else if (language.getSelectedItem().equals("עברית"))
    JOptionPane.showMessageDialog(null, "הנתונים יוצאו בהצלחה ל " + "\""+reportName+"_"+fileName+".csv\" בתיקית הפרוייקט!");

}

public void ExportFailed(JComboBox language)
{
    Toolkit.getDefaultToolkit().beep();
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    JOptionPane.showMessageDialog(null, "Exporting to CSV failed!");
    else if (language.getSelectedItem().equals("עברית"))
    JOptionPane.showMessageDialog(null, "היצוא נכשל!");    
}

public void SelectEmployee(JComboBox language)
{
    Toolkit.getDefaultToolkit().beep();
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    JOptionPane.showMessageDialog(null, "You must first select an employee from a table!");
    else if (language.getSelectedItem().equals("עברית"))
    JOptionPane.showMessageDialog(null, "עליך קודם לבחור עובד מאחת הטבלאות!");  
}

public void SelectShift(JComboBox language)
{
    Toolkit.getDefaultToolkit().beep();
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
        JOptionPane.showMessageDialog(null, "You must first select a shift from the table!");
         else if (language.getSelectedItem().equals("עברית"))
    JOptionPane.showMessageDialog(null, "עליך קודם לבחור משמרת!");
}

public boolean NewPassSave(String username,String password,JComboBox language)
{
    boolean bool;
    User user=model.getUsers().get(username);
    bool=controller.updateUser(user.getUsername(), password, user.getType(), user.getSecretQuestion(), user.getSecretAnswer());
    if (bool==true)
    {
        SaveNewPasswordMessage(language);
        return true;
    }
    SaveNewPasswordFailedMessage(language);
     return false;
}

public void serialization(String fileName) throws IOException
{
     controller.serialization(fileName);
}

public void OpenAbout(JDesktopPane desk,UserMenu um){
            About about= new About(um);
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
           about.setTitle("About");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
                about.setTitle("אודות");
           desk.add(about);
           about.setVisible(true);
}

public void OpenGetAllWarehousesInManufacturerCountryQuery(JDesktopPane pane,UserMenu um)
{
              GetAllWarehousesInManufacturerCountry w=new GetAllWarehousesInManufacturerCountry(um);
              if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              w.setTitle("Get All Warehouses in Manufacturer Country");
              else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              w.setTitle("השג את כל המחסנים במדינת היצרן");
              pane.add(w);
              w.show();
                 
}

public void GetAllWarehousesInManufacturerCountryQueryRun(String manufacturerName,JTable table, JLayeredPane tableLayeredPane,JComboBox language)
{
    Manufacturer manu=model.getManufacturers().get(manufacturerName);
    if (manu==null)
    {
        tableLayeredPane.setEnabled(false);
        tableLayeredPane.setVisible(false);
        Toolkit.getDefaultToolkit().beep();
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
        JOptionPane.showMessageDialog(null, "Such manufacturer does not exist!");
        else if (language.getSelectedItem().equals("עברית"))
        JOptionPane.showMessageDialog(null, "יצרן כזה לא קיים!");
    }
    else
    {
            tableLayeredPane.setEnabled(true);
            tableLayeredPane.setVisible(true);
      DefaultTableModel tm = (DefaultTableModel) table.getModel();
      List<Warehouse> result = controller.getAllWarehousesInManufacturerCountry(manufacturerName);
      Object rowData[] = new Object[9];
      for (int i=0; i < result.size(); i++)
      {
            rowData[0]=result.get(i).getWarehouseNumber();
            rowData[1]=result.get(i).getLocation().getCountry();
            rowData[2]=result.get(i).getLocation().getCity();
            rowData[3]=result.get(i).getLocation().getStreet();
            rowData[4]=result.get(i).getLocation().getHouseNumber();
            rowData[5]=result.get(i).getLocation().getZipCode();
            rowData[6]=result.get(i).getMaxPartsStored();
            rowData[7]=result.get(i).getMaxVehiclesStored();
            rowData[8]=result.get(i).getCurrentNumberOfParts();
            tm.addRow(rowData);
      }
    }
}

public void OpenFindVehicleInCityQuery(JDesktopPane pane,UserMenu um)
{
              FindVehicleInCity f=new FindVehicleInCity(um);
              if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              f.setTitle("Find Vehicle in City");
              else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              f.setTitle("מצא רכב בעיר");
              pane.add(f);	
	      f.show();
}

public void FindVehicleInCityQueryRun(String countryName,String cityName, String modelName, JTable table, JLayeredPane tableLayeredPane,JComboBox language)
{
            tableLayeredPane.setEnabled(true);
            tableLayeredPane.setVisible(true);
            DefaultTableModel tm = (DefaultTableModel) table.getModel();
            Vehicle vehicle;
            try{
            vehicle = controller.findVehicleInCity(countryName, cityName, modelName);
            Object rowData[] = new Object[12];
            rowData[0]=vehicle.getVin();
            rowData[1]=vehicle.getModel().getModelName();
            rowData[2]=vehicle.getModel().getVehicleType();
            rowData[3]=vehicle.getModel().getHp();
            rowData[4]=vehicle.getModel().getTopSpeed();
            rowData[5]=vehicle.getModel().getNumOfSeats();
            rowData[6]=vehicle.getModel().isIsAutomatic();
            rowData[7]=vehicle.getModel().getProductionCost();
            rowData[8]=vehicle.getModel().getEnteredProduction().getTime().toString();
            rowData[9]=vehicle.getProductionPlan().getSerialNumber();
            rowData[10]=vehicle.getModel().getProductionPlanType().getSerialNumber();
            rowData[11]=vehicle.getModel().getProductionPlanType().getNumberOfSlots();
            tm.addRow(rowData);
            }
            catch (NullPointerException e){
             tableLayeredPane.setEnabled(false);
             tableLayeredPane.setVisible(false);
             Toolkit.getDefaultToolkit().beep();
             if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
             JOptionPane.showMessageDialog(null, "There is no such Vehicle in " + cityName);
             else if (language.getSelectedItem().equals("עברית"))
             JOptionPane.showMessageDialog(null, "אין רכב כזה ב " + cityName);
             }
}

public void OpenGetMostProfitableManufacturerQuery(JDesktopPane pane,UserMenu um)
{
              GetMostProfitableManufacturer m=new GetMostProfitableManufacturer(um);
              if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              m.setTitle("Get Most Profitable Manufacturer");
              else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              m.setTitle("הצג את היצרן הכי רווחי");
              pane.add(m);
              m.show();
              
}

public void GetMostProfitableManufacturerQueryRun(JTable table, JLayeredPane tableLayeredPane,JComboBox language)
{
     tableLayeredPane.setEnabled(true);
     tableLayeredPane.setVisible(true);
     DefaultTableModel tm = (DefaultTableModel) table.getModel();
     Manufacturer manu;
    try{
      manu=controller.getMostProfitableManufacturer();
      Object rowData[] = new Object[7];
            rowData[0]=manu.getName();
            rowData[1]=manu.getAddress().getCountry();
            rowData[2]=manu.getAddress().getCity();
            rowData[3]=manu.getAddress().getStreet();
            rowData[4]=manu.getAddress().getHouseNumber();
            rowData[5]=manu.getAddress().getZipCode();
            rowData[6]=manu.getProfitPercentage();
            tm.addRow(rowData);
       } 
    catch (Exception e) {
        tableLayeredPane.setEnabled(false);
        tableLayeredPane.setVisible(false);
        Toolkit.getDefaultToolkit().beep();
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
        JOptionPane.showMessageDialog(null, "There are no manufacturers to display!");
        else if (language.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "אין יצרנים במערכת!");
    }
    finally
    {
        if (table.getRowCount()==0)
        {
            tableLayeredPane.setEnabled(false);
            tableLayeredPane.setVisible(false);
            Toolkit.getDefaultToolkit().beep();
            if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "There are no manufacturers to display!"); 
            else if (language.getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "אין יצרנים במערכת!"); 
        }
             
    }
}

public void OpenGetMissingPartsForProductionPlanQuery(JDesktopPane pane,UserMenu um)
{
              GetMissingPartsForProductionPlan p=new GetMissingPartsForProductionPlan(um);
              if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              p.setTitle("Get Missing Parts For Production Plan");
              else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              p.setTitle("השג חלקים חסרים לתכנית ייצור");
              pane.add(p);
              p.show();
              
}

public void GetMissingPartsForProductionPlanQueryRun(String label,String text,JTable table, JLayeredPane tableLayeredPane, JComboBox language)
{
    Integer plan=0;
    tableLayeredPane.setEnabled(true);
    tableLayeredPane.setVisible(true);
    DefaultTableModel tm = (DefaultTableModel) table.getModel();
    plan=TryConvertingStringtoInteger(text, plan);
    if (plan==null)
    {
        tableLayeredPane.setEnabled(false);
        tableLayeredPane.setVisible(false);
        Toolkit.getDefaultToolkit().beep();
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
        JOptionPane.showMessageDialog(null, label.substring(0, label.length()-1) + " input must be a number!"); 
        else if (language.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, label.substring(0, label.length()-1) + " קלט חייב להיות מספר!"); 
    }
    else if (plan!=null)
    {
    ProductionPlan pp=model.getProductionPlans().get(plan);
          if (pp==null)
          {
              tableLayeredPane.setEnabled(false);
              tableLayeredPane.setVisible(false);
              Toolkit.getDefaultToolkit().beep();
              if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
              JOptionPane.showMessageDialog(null, "Such production plan does not exist!");
              else if (language.getSelectedItem().equals("עברית"))
                  JOptionPane.showMessageDialog(null, "לא קיימת תכנית יצור כזאת!");
          }
          else {
          Map<PartType, Integer> result = controller.getMissingPartsForProductionPlan(plan);
          Object rowData[] = new Object[5];
           for (Map.Entry<PartType,Integer> res: result.entrySet())
             {
            rowData[0]=res.getKey().getPartNumber();
            rowData[1]=res.getKey().getPartName();
            rowData[2]=res.getKey().getCategory();
            rowData[3]=res.getKey().getProductionCost();
            rowData[4]=res.getValue();
            tm.addRow(rowData);
            }
         }
    }
}

public void OpenGetLastFutureProductionOfModelQuery(JDesktopPane pane,UserMenu um)
{
              GetLastFutureProductionOfModel d=new GetLastFutureProductionOfModel(um);
              if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              d.setTitle("Get Last Future Production of Model");
              else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              d.setTitle("הצג את היצור העתידי האחרון של דגם");
              pane.add(d);
              d.show();
}

public void GetLastFutureProductionOfModelQueryRun(String modelName,JTextArea ta, JLayeredPane tableLayeredPane,JComboBox language)
{
    VehicleModel vm=model.getModels().get(modelName);
    if (vm==null)
    {
        tableLayeredPane.setEnabled(false);
        tableLayeredPane.setVisible(false);
        Toolkit.getDefaultToolkit().beep();
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
        JOptionPane.showMessageDialog(null, "Such model does not exist!");  
        else if (language.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "לא קיים דגם כזה!");
    }
    else
    {
            Calendar date;
            tableLayeredPane.setEnabled(true);
            tableLayeredPane.setVisible(true);
            date=controller.getLastFutureProductionOfModel(modelName);
            ta.setText(date.getTime().toString());
    }  
}
public void OpenFindShiftByTimeQuery(JDesktopPane pane,UserMenu um)
{
              FindShiftByTime f=new FindShiftByTime(um);
              if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              f.setTitle("Find Shift By Time");
              else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              f.setTitle("מצא משמרת לפי זמן");
              pane.add(f);
              f.show();
}

public void FindShiftByTimeQueryRun(String str,JTable table, JLayeredPane tableLayeredPane,JComboBox language)
{
        
        Date date=TryConvertingStringtoDate(str);
        Calendar cal=CalendarGetTimeDate(date);
        if (date==null)
        {
          tableLayeredPane.setEnabled(false);
          tableLayeredPane.setVisible(false);
          Toolkit.getDefaultToolkit().beep();
          if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
          JOptionPane.showMessageDialog(null, "                     Invalid date!\n" + "The format must be: dd/MM/yyyy'T'HH:mm"); // space on purpose
          else if (language.getSelectedItem().equals("עברית"))
              JOptionPane.showMessageDialog(null, "תאריך שגוי!                \n" + "הפורמט הוא: dd/MM/yyyy'T'HH:mm"); // space on purpose
        }
        else if (date!=null)
    {
    Shift s = model.getShifts().get(cal);
    if (s==null)
      {
        tableLayeredPane.setEnabled(false);
        tableLayeredPane.setVisible(false);
        Toolkit.getDefaultToolkit().beep();
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
        JOptionPane.showMessageDialog(null, "A shift at this time does not exist!");
        else if (language.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "אין משמרת בשעה זו!");
      }
    else
      {
            tableLayeredPane.setEnabled(true);
            tableLayeredPane.setVisible(true);
            DefaultTableModel tm = (DefaultTableModel) table.getModel();
            s = controller.findShiftByTime(cal);
            table.getTableHeader().setFont( new Font( "Tahoma" , Font.BOLD, 10 ));
            Object rowData[] = new Object[12];
            rowData[0]=s.getStartingTime().getTime().toString();
            rowData[1]=s.getShiftManager().getId();
            rowData[2]=s.getShiftManager().getName();
            rowData[3]=s.getShiftManager().getAddress().getCountry();
            rowData[4]=s.getShiftManager().getAddress().getCity();
            rowData[5]=s.getShiftManager().getAddress().getStreet();
            rowData[6]=s.getShiftManager().getAddress().getHouseNumber();
            rowData[7]=s.getShiftManager().getAddress().getZipCode();
            rowData[8]=s.getShiftManager().getBirthday().getTime().toString();
            rowData[9]=s.getShiftManager().getEmploymentDate().getTime().toString();
            rowData[10]=s.getShiftManager().getExtraWage();
            rowData[11]=s.getShiftManager().getHourlyWage();
            tm.addRow(rowData);
      }
    }
}

public void OpenGetAllShiftsOrderedByNumberOfProductionPlanTypesQuery(JDesktopPane pane,UserMenu um)
{
              GetAllShiftsOrderedByNumberOfProductionPlanTypes s=new GetAllShiftsOrderedByNumberOfProductionPlanTypes(um);
              if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              s.setTitle("Get All Shifts Ordered By Number of Production Plan Types");
              else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              s.setTitle("השג את כל המשמרות ממויינות לפי כמות סוגי תכניות היצור");
              pane.add(s);
              s.show();
}

public void GetAllShiftsOrderedByNumberOfProductionPlanTypesQueryRun(JTable table, JLayeredPane tableLayeredPane,JComboBox language)
{
     DefaultTableModel tm = (DefaultTableModel) table.getModel();
    try{
      List<Shift> result = controller.getAllShiftsOrderedByNumberOfProductionPlanTypes();
      table.getTableHeader().setFont( new Font( "Tahoma" , Font.BOLD, 6 ));
      Object rowData[] = new Object[12];
      for (int i=0; i < result.size(); i++)
      {
            rowData[0]=result.get(i).getStartingTime().getTime().toString();
            rowData[1]=result.get(i).getShiftManager().getId();
            rowData[2]=result.get(i).getShiftManager().getName();
            rowData[3]=result.get(i).getShiftManager().getAddress().getCountry();
            rowData[4]=result.get(i).getShiftManager().getAddress().getCity();
            rowData[5]=result.get(i).getShiftManager().getAddress().getStreet();
            rowData[6]=result.get(i).getShiftManager().getAddress().getHouseNumber();
            rowData[7]=result.get(i).getShiftManager().getAddress().getZipCode();
            rowData[8]=result.get(i).getShiftManager().getBirthday().getTime().toString();
            rowData[9]=result.get(i).getShiftManager().getEmploymentDate().getTime().toString();
            rowData[10]=result.get(i).getShiftManager().getExtraWage();
            rowData[11]=result.get(i).getShiftManager().getHourlyWage();
            tm.addRow(rowData);
       } 
    }
    catch (Exception e) {
        tableLayeredPane.setEnabled(false);
        tableLayeredPane.setVisible(false);
        Toolkit.getDefaultToolkit().beep();
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
        JOptionPane.showMessageDialog(null, "There are no shifts!");    
         else if (language.getSelectedItem().equals("עברית"))
             JOptionPane.showMessageDialog(null, "לא קיימות משמרות!");
    }
    finally
    {
        if (table.getRowCount()==0)
        {
            tableLayeredPane.setEnabled(false);
            tableLayeredPane.setVisible(false);
            Toolkit.getDefaultToolkit().beep();
            if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "There are no shifts to display!"); 
            else if (language.getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "לא קיימות משמרות!");
        }
             
    }
}

public void OpenGetKModelsWithLeastVehiclesQuery(JDesktopPane pane,UserMenu um)
{
              GetKModelsWithLeastVehicles k=new GetKModelsWithLeastVehicles(um);
              if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              k.setTitle("Get K Models With Least Vehicles");
              else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              k.setTitle("השג מספר דגמי רכב עם כמות הרכבים הכי נמוכה");
              pane.add(k);
              k.show();
              
}

public void GetKModelsWithLeastVehiclesQueryRun(String label,String text,JTable table, JLayeredPane tableLayeredPane,JComboBox language)
{
    Integer num=0;
    DefaultTableModel tm = (DefaultTableModel) table.getModel();
    num=TryConvertingStringtoInteger(text, num);
    if (num==null)
    {
        tableLayeredPane.setEnabled(false);
        tableLayeredPane.setVisible(false);
        Toolkit.getDefaultToolkit().beep();
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
        JOptionPane.showMessageDialog(null, label.substring(0, label.length()-1) + " input must be a number!");
        else if (language.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, label.substring(0, label.length()-1) + " הקלט חייב להיות מספר!");
    }
   else if (num!=null && num<=0)
    {
        tableLayeredPane.setEnabled(false);
        tableLayeredPane.setVisible(false);
        Toolkit.getDefaultToolkit().beep();
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
        JOptionPane.showMessageDialog(null, "Input number must be above 0!");
        else if (language.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "המספר חייב להיות חיובי!");
    }
    else if (num!=null)
   try {
            tableLayeredPane.setEnabled(true);
            tableLayeredPane.setVisible(true);
            table.getTableHeader().setFont( new Font( "Tahoma" , Font.BOLD, 10 ));
            List<VehicleModel> result = controller.getKModelsWithLeastVehicles(num);
             for (int i=0; i < result.size(); i++)
      {
            Object rowData[] = new Object[10];
            rowData[0]=result.get(i).getModelName();
            rowData[1]=result.get(i).getVehicleType();
            rowData[2]=result.get(i).getHp();
            rowData[3]=result.get(i).getTopSpeed();
            rowData[4]=result.get(i).getNumOfSeats();
            rowData[5]=result.get(i).isIsAutomatic();
            rowData[6]=result.get(i).getProductionCost();
            rowData[7]=result.get(i).getEnteredProduction().getTime().toString();
            rowData[8]=result.get(i).getProductionPlanType().getSerialNumber();
            rowData[9]=result.get(i).getProductionPlanType().getNumberOfSlots();
            tm.addRow(rowData);
      }
    }
   catch (IndexOutOfBoundsException a)
   {
       tableLayeredPane.setEnabled(false);
       tableLayeredPane.setVisible(false);
       int n=model.getModels().size();
       Toolkit.getDefaultToolkit().beep();
       if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
       JOptionPane.showMessageDialog(null, "Current maximum number allowed is " + n);
       else if (language.getSelectedItem().equals("עברית"))
       JOptionPane.showMessageDialog(null, "המספר המקסימלי המותר כרגע הוא " + n);
   }
}

public void OpenGetNumberOfPartsForEachOrderQuery(JDesktopPane pane,UserMenu um)
{
              GetNumberOfPartsForEachOrder n=new GetNumberOfPartsForEachOrder(um);
              if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              n.setTitle("Get Number of Parts For Each Order");
              else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              n.setTitle("השג את מספר החלקים בכל הזמנה");
              pane.add(n);
              n.show();
}

public void GetNumberOfPartsForEachOrderQueryRun(JTable table,JTable tabletwo, JLayeredPane tableLayeredPane,JLayeredPane sales,JLayeredPane purchases,JComboBox language)
{
     DefaultTableModel tm = (DefaultTableModel) table.getModel();
     DefaultTableModel tmTwo = (DefaultTableModel) tabletwo.getModel();
    try{
      table.getTableHeader().setFont( new Font( "Tahoma" , Font.BOLD, 9 ));
      tabletwo.getTableHeader().setFont( new Font( "Tahoma" , Font.BOLD, 9 ));
      Object rowData[] = new Object[21];
      Map<Order<?,?>, Integer> result = controller.getNumberOfPartsForEachOrder();
      
           for (Map.Entry<Order<?,?>,Integer> res: result.entrySet())
            {
            if (res.getKey().getOrderedFrom() instanceof ShiftManager && res.getKey().getOrderedTo() instanceof Manufacturer)
              {
              rowData[0]=res.getKey().getOrderNumber();  
              rowData[1]=((ShiftManager)res.getKey().getOrderedFrom()).getId();
              rowData[2]=((ShiftManager)res.getKey().getOrderedFrom()).getName();
              rowData[3]=((ShiftManager)res.getKey().getOrderedFrom()).getAddress().getCountry();
              rowData[4]=((ShiftManager)res.getKey().getOrderedFrom()).getAddress().getCity();
              rowData[5]=((ShiftManager)res.getKey().getOrderedFrom()).getAddress().getStreet();
              rowData[6]=((ShiftManager)res.getKey().getOrderedFrom()).getAddress().getHouseNumber();
              rowData[7]=((ShiftManager)res.getKey().getOrderedFrom()).getAddress().getZipCode();
              rowData[8]=((ShiftManager)res.getKey().getOrderedFrom()).getBirthday().getTime().toString();
              rowData[9]=((ShiftManager)res.getKey().getOrderedFrom()).getEmploymentDate().getTime().toString();
              rowData[10]=((ShiftManager)res.getKey().getOrderedFrom()).getHourlyWage();
              rowData[11]=((ShiftManager)res.getKey().getOrderedFrom()).getExtraWage();
              rowData[12]=((Manufacturer)res.getKey().getOrderedTo()).getName();
              rowData[13]=((Manufacturer)res.getKey().getOrderedTo()).getAddress().getCountry();
              rowData[14]=((Manufacturer)res.getKey().getOrderedTo()).getAddress().getCity();
              rowData[15]=((Manufacturer)res.getKey().getOrderedTo()).getAddress().getStreet();
              rowData[16]=((Manufacturer)res.getKey().getOrderedTo()).getAddress().getHouseNumber();
              rowData[17]=((Manufacturer)res.getKey().getOrderedTo()).getAddress().getZipCode();
              rowData[18]=((Manufacturer)res.getKey().getOrderedTo()).getProfitPercentage();
              rowData[19]=res.getKey().getDueDate().getTime().toString();
              rowData[20]=res.getValue();
              tm.addRow(rowData);
              
              }
            else if (res.getKey().getOrderedFrom() instanceof Manufacturer && res.getKey().getOrderedTo() instanceof ShiftManager)
              {
              rowData[0]=res.getKey().getOrderNumber();
              rowData[1]=((Manufacturer)res.getKey().getOrderedFrom()).getName();
              rowData[2]=((Manufacturer)res.getKey().getOrderedFrom()).getAddress().getCountry();
              rowData[3]=((Manufacturer)res.getKey().getOrderedFrom()).getAddress().getCity();
              rowData[4]=((Manufacturer)res.getKey().getOrderedFrom()).getAddress().getStreet();
              rowData[5]=((Manufacturer)res.getKey().getOrderedFrom()).getAddress().getHouseNumber();
              rowData[6]=((Manufacturer)res.getKey().getOrderedFrom()).getAddress().getZipCode();
              rowData[7]=((Manufacturer)res.getKey().getOrderedFrom()).getProfitPercentage();
              rowData[8]=((ShiftManager)res.getKey().getOrderedTo()).getId();
              rowData[9]=((ShiftManager)res.getKey().getOrderedTo()).getName();
              rowData[10]=((ShiftManager)res.getKey().getOrderedTo()).getAddress().getCountry();
              rowData[11]=((ShiftManager)res.getKey().getOrderedTo()).getAddress().getCity();
              rowData[12]=((ShiftManager)res.getKey().getOrderedTo()).getAddress().getStreet();
              rowData[13]=((ShiftManager)res.getKey().getOrderedTo()).getAddress().getHouseNumber();
              rowData[14]=((ShiftManager)res.getKey().getOrderedTo()).getAddress().getZipCode();
              rowData[15]=((ShiftManager)res.getKey().getOrderedTo()).getBirthday().getTime().toString();
              rowData[16]=((ShiftManager)res.getKey().getOrderedTo()).getEmploymentDate().getTime().toString();
              rowData[17]=((ShiftManager)res.getKey().getOrderedTo()).getHourlyWage();
              rowData[18]=((ShiftManager)res.getKey().getOrderedTo()).getExtraWage();
              rowData[19]=res.getKey().getDueDate().getTime().toString();
              rowData[20]=res.getValue();
              tmTwo.addRow(rowData);
              }
            }
    }
    catch (Exception e) {
        tableLayeredPane.setEnabled(false);
        tableLayeredPane.setVisible(false);
        Toolkit.getDefaultToolkit().beep();
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
        JOptionPane.showMessageDialog(null, "There are no orders to display!");
        else if (language.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "לא קיימות הזמנות!");
    }
    finally {
        if (table.getRowCount()==0)
        {
            sales.setVisible(false);
            sales.setEnabled(false);
        }
        if (tabletwo.getRowCount()==0)
        {
            purchases.setVisible(false);
            purchases.setEnabled(false);
        }
        if (!sales.isVisible() && !purchases.isVisible())
        {
            Toolkit.getDefaultToolkit().beep();
            if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
         JOptionPane.showMessageDialog(null, "There are no orders to display!");
            else if (language.getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "לא קיימות הזמנות!");
        }
    }
}

public void OpenGetAllEmployeesOrderedByTypeAndByIDQuery(JDesktopPane pane,UserMenu um)
{
              GetAllEmployeesOrderedByTypeAndByID e=new GetAllEmployeesOrderedByTypeAndByID(um);
              if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              e.setTitle("Get All Employees Ordered By Type and By ID");
              else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              e.setTitle("השג את כל העובדים ממויינים לפי סוג ולפי מספר עובד");
              pane.add(e);
              e.show();
}

public void GetAllEmployeesOrderedByTypeAndByIDQueryRun(JTable table,JTable tabletwo, JTable tablethree, JLayeredPane tableLayeredPane,JLayeredPane guards,JLayeredPane shiftmanagers, JLayeredPane workers,JComboBox language)
{
    
     DefaultTableModel tm = (DefaultTableModel) table.getModel();
     DefaultTableModel tmTwo = (DefaultTableModel) tabletwo.getModel();
     DefaultTableModel tmThree = (DefaultTableModel) tablethree.getModel();
    try{
      table.getTableHeader().setFont( new Font( "Tahoma" , Font.BOLD, 11 ));
      tabletwo.getTableHeader().setFont( new Font( "Tahoma" , Font.BOLD, 11 ));
      tablethree.getTableHeader().setFont( new Font( "Tahoma" , Font.BOLD, 11 ));
      List<AbstractEmployee> result = controller.getAllEmployeesOrderedByTypeAndById();
         for (int i=0; i < result.size(); i++)
         {
            if (result.get(i) instanceof ShiftManager)
              {
              Object rowData[] = new Object[11];
              rowData[0]=result.get(i).getId();
              rowData[1]=result.get(i).getName();
              rowData[2]=result.get(i).getAddress().getCountry();
              rowData[3]=result.get(i).getAddress().getCity();
              rowData[4]=result.get(i).getAddress().getStreet();
              rowData[5]=result.get(i).getAddress().getHouseNumber();
              rowData[6]=result.get(i).getAddress().getZipCode();
              rowData[7]=result.get(i).getBirthday().getTime().toString();
              rowData[8]=result.get(i).getEmploymentDate().getTime().toString();
              rowData[9]=((ShiftManager)result.get(i)).getHourlyWage();
              rowData[10]=((ShiftManager)result.get(i)).getExtraWage();
              tmTwo.addRow(rowData);
              
              }
            else if (result.get(i) instanceof Worker)
              {
              Object rowData[] = new Object[11];
              rowData[0]=result.get(i).getId();
              rowData[1]=result.get(i).getName();
              rowData[2]=result.get(i).getAddress().getCountry();
              rowData[3]=result.get(i).getAddress().getCity();
              rowData[4]=result.get(i).getAddress().getStreet();
              rowData[5]=result.get(i).getAddress().getHouseNumber();
              rowData[6]=result.get(i).getAddress().getZipCode();
              rowData[7]=result.get(i).getBirthday().getTime().toString();
              rowData[8]=result.get(i).getEmploymentDate().getTime().toString();
              rowData[9]=((Worker)result.get(i)).getHourlyWage();
              tmThree.addRow(rowData);
              }
            else if (result.get(i) instanceof Guard)
              {
              Object rowData[] = new Object[19];
              rowData[0]=result.get(i).getId();
              rowData[1]=result.get(i).getName();
              rowData[2]=result.get(i).getAddress().getCountry();
              rowData[3]=result.get(i).getAddress().getCity();
              rowData[4]=result.get(i).getAddress().getStreet();
              rowData[5]=result.get(i).getAddress().getHouseNumber();
              rowData[6]=result.get(i).getAddress().getZipCode();
              rowData[7]=result.get(i).getBirthday().getTime().toString();
              rowData[8]=result.get(i).getEmploymentDate().getTime().toString();
              rowData[9]=((Guard)result.get(i)).getMonthlySalary();
              rowData[10]=((Guard)result.get(i)).getWarehouse().getWarehouseNumber();
              rowData[11]=((Guard)result.get(i)).getWarehouse().getLocation().getCountry();
              rowData[12]=((Guard)result.get(i)).getWarehouse().getLocation().getCity();
              rowData[13]=((Guard)result.get(i)).getWarehouse().getLocation().getStreet();
              rowData[14]=((Guard)result.get(i)).getWarehouse().getLocation().getHouseNumber();
              rowData[15]=((Guard)result.get(i)).getWarehouse().getLocation().getZipCode();
              rowData[16]=((Guard)result.get(i)).getWarehouse().getMaxPartsStored();
              rowData[17]=((Guard)result.get(i)).getWarehouse().getMaxVehiclesStored();
              rowData[18]=((Guard)result.get(i)).getWarehouse().getCurrentNumberOfParts();
              tm.addRow(rowData);
              }
          }
    }
    catch (Exception e) {
        tableLayeredPane.setEnabled(false);
        tableLayeredPane.setVisible(false);
        Toolkit.getDefaultToolkit().beep();
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
        JOptionPane.showMessageDialog(null, "There are no employees to display!");
        else if (language.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "לא קיימים עובדים!");
    }
    finally {
        if (table.getRowCount()==0)
        {
            guards.setVisible(false);
            guards.setEnabled(false);
        }
        if (tabletwo.getRowCount()==0)
        {
            shiftmanagers.setVisible(false);
            shiftmanagers.setEnabled(false);
        }
        if (tablethree.getRowCount()==0)
        {
            workers.setVisible(false);
            workers.setEnabled(false);
        }
        if (!shiftmanagers.isVisible() && !workers.isVisible() && !guards.isVisible())
        {
            Toolkit.getDefaultToolkit().beep();
            if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
         JOptionPane.showMessageDialog(null, "There are no employees to display!");
            else if (language.getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "לא קיימים עובדים!");
        }
    }
}

public void OpenGetAllEmployeesOrderedBySalaryInMonthQuery(JDesktopPane pane,UserMenu um)
{
              GetAllEmployeesOrderedBySalaryInMonth e=new GetAllEmployeesOrderedBySalaryInMonth(um);
              if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              e.setTitle("Get All Employees Ordered By Salary In Month");
              else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              e.setTitle("השג את כל העובדים ממויינים לפי שכר בחודש");
              pane.add(e);
              e.show();
}

public void GetAllEmployeesOrderedBySalaryInMonthQueryRun(String str,JRadioButton ascending, JRadioButton descending,JTable table, JLayeredPane tableLayeredPane,JComboBox language)
{
    Date date=TryConvertingStringtoDate(str);
    Calendar cal=CalendarGetTimeDate(date);
     List<AbstractEmployee> result=null;
        if (date==null) {
          tableLayeredPane.setEnabled(false);
          tableLayeredPane.setVisible(false);
          Toolkit.getDefaultToolkit().beep();
          if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
          JOptionPane.showMessageDialog(null, "                     Invalid date!\n" + "The format must be: dd/MM/yyyy'T'HH:mm"); // space on purpose 
          else if (language.getSelectedItem().equals("עברית"))
              JOptionPane.showMessageDialog(null, "תאריך שגוי!                \n" + "הפורמט הוא: dd/MM/yyyy'T'HH:mm"); // space on purpose
        }
        else if (date!=null)
    {
    try{
          tableLayeredPane.setEnabled(true);
          tableLayeredPane.setVisible(true);
        DefaultTableModel tm = (DefaultTableModel) table.getModel();
      table.getTableHeader().setFont( new Font( "Tahoma" , Font.BOLD, 9 ));
     if (ascending.isSelected())
      result = controller.getAllEmployeesOrderedBySalaryInMonth(cal, true);
     else if (descending.isSelected())
      result = controller.getAllEmployeesOrderedBySalaryInMonth(cal, false);
     Object rowData[] = new Object[21];
         for (int i=0; i < result.size(); i++)
         {
            if (result.get(i) instanceof ShiftManager)
              {
              rowData[0]=result.get(i).getId();
              rowData[1]=result.get(i).getName();
              rowData[2]=result.get(i).getAddress().getCountry();
              rowData[3]=result.get(i).getAddress().getCity();
              rowData[4]=result.get(i).getAddress().getStreet();
              rowData[5]=result.get(i).getAddress().getHouseNumber();
              rowData[6]=result.get(i).getAddress().getZipCode();
              rowData[7]=result.get(i).getBirthday().getTime().toString();
              rowData[8]=result.get(i).getEmploymentDate().getTime().toString();
              rowData[9]=((ShiftManager)result.get(i)).getHourlyWage();
              rowData[10]=((ShiftManager)result.get(i)).getExtraWage();
              rowData[11]="";
              rowData[12]="";
              rowData[13]="";
              rowData[14]="";
              rowData[15]="";
              rowData[16]="";
              rowData[17]="";
              rowData[18]="";
              rowData[19]="";
              rowData[20]="";
              }
            else if (result.get(i) instanceof Worker)
              {
              rowData[0]=result.get(i).getId();
              rowData[1]=result.get(i).getName();
              rowData[2]=result.get(i).getAddress().getCountry();
              rowData[3]=result.get(i).getAddress().getCity();
              rowData[4]=result.get(i).getAddress().getStreet();
              rowData[5]=result.get(i).getAddress().getHouseNumber();
              rowData[6]=result.get(i).getAddress().getZipCode();
              rowData[7]=result.get(i).getBirthday().getTime().toString();
              rowData[8]=result.get(i).getEmploymentDate().getTime().toString();
              rowData[9]=((Worker)result.get(i)).getHourlyWage();
              rowData[10]="";
              rowData[11]="";
              rowData[12]="";
              rowData[13]="";
              rowData[14]="";
              rowData[15]="";
              rowData[16]="";
              rowData[17]="";
              rowData[18]="";
              rowData[19]="";
              rowData[20]="";
              }
            else if (result.get(i) instanceof Guard)
              {
              rowData[0]=result.get(i).getId();
              rowData[1]=result.get(i).getName();
              rowData[2]=result.get(i).getAddress().getCountry();
              rowData[3]=result.get(i).getAddress().getCity();
              rowData[4]=result.get(i).getAddress().getStreet();
              rowData[5]=result.get(i).getAddress().getHouseNumber();
              rowData[6]=result.get(i).getAddress().getZipCode();
              rowData[7]=result.get(i).getBirthday().getTime().toString();
              rowData[8]=result.get(i).getEmploymentDate().getTime().toString();
              rowData[9]="";
              rowData[10]="";
              rowData[11]=((Guard)result.get(i)).getMonthlySalary();
              rowData[12]=((Guard)result.get(i)).getWarehouse().getWarehouseNumber();
              rowData[13]=((Guard)result.get(i)).getWarehouse().getLocation().getCountry();
              rowData[14]=((Guard)result.get(i)).getWarehouse().getLocation().getCity();
              rowData[15]=((Guard)result.get(i)).getWarehouse().getLocation().getStreet();
              rowData[16]=((Guard)result.get(i)).getWarehouse().getLocation().getHouseNumber();
              rowData[17]=((Guard)result.get(i)).getWarehouse().getLocation().getZipCode();
              rowData[18]=((Guard)result.get(i)).getWarehouse().getMaxPartsStored();
              rowData[19]=((Guard)result.get(i)).getWarehouse().getMaxVehiclesStored();
              rowData[20]=((Guard)result.get(i)).getWarehouse().getCurrentNumberOfParts();
              }
               tm.addRow(rowData);
          }
    }
    catch (Exception e) {
        tableLayeredPane.setEnabled(false);
        tableLayeredPane.setVisible(false);
        Toolkit.getDefaultToolkit().beep();
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
        JOptionPane.showMessageDialog(null, "There are no employees to display!");
        else if (language.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "לא קיימים עובדים!");
    }
    finally
    {
        if (table.getRowCount()==0)
        {
            tableLayeredPane.setEnabled(false);
            tableLayeredPane.setVisible(false);
            Toolkit.getDefaultToolkit().beep();
            if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
           JOptionPane.showMessageDialog(null, "There are no employees to display!");
            else if (language.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "לא קיימים עובדים!");
        }
    }
     }
    }

public void OpenGetProductionPlanTypesOrderedByNumberOfSlotsQuery(JDesktopPane pane,UserMenu um)
{
              GetProductionPlanTypesOrderedByNumberOfSlots p=new GetProductionPlanTypesOrderedByNumberOfSlots(um);
              if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              p.setTitle("Get Production Plan Types Ordered By Number of Slots");
              else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              p.setTitle("השג סוגי תכניות ייצור ממויינות לפי כמות הסלוטים");
              pane.add(p);
              p.show();
}

public void GetProductionPlanTypesOrderedByNumberOfSlotsQueryRun(JTable table, JLayeredPane tableLayeredPane,JComboBox language)
{
     tableLayeredPane.setEnabled(true);
     tableLayeredPane.setVisible(true);
     DefaultTableModel tm = (DefaultTableModel) table.getModel();
    try{
      List<ProductionPlanType> result = controller.getProductionPlanTypesOrderedByNumberOfSlots();
         for (int i=0; i < result.size(); i++)
         {
            Object rowData[] = new Object[2];
            rowData[0]=result.get(i).getSerialNumber();
            rowData[1]=result.get(i).getNumberOfSlots();
            tm.addRow(rowData);
         }
       } 
    catch (Exception e) {
        tableLayeredPane.setEnabled(false);
        tableLayeredPane.setVisible(false);
        Toolkit.getDefaultToolkit().beep();
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
        JOptionPane.showMessageDialog(null, "There are no production plan types to display!");
        else if (language.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "לא קיימים סוגי תכניות יצור!");
    }
    finally
    {
        if (table.getRowCount()==0)
        {
            tableLayeredPane.setEnabled(false);
            tableLayeredPane.setVisible(false);
            Toolkit.getDefaultToolkit().beep();
            if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "There are no production plan types to display!");
            else if (language.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "לא קיימים סוגי תכניות יצור!");
        }
             
    }
}

public void OpenGetAllHourlyEmployeesWithShiftsAndSlotsQuery(JDesktopPane pane,UserMenu um)
{
              GetAllHourlyEmployeesWithShiftsAndSlots e=new GetAllHourlyEmployeesWithShiftsAndSlots(um);
              if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              e.setTitle("Get All Hourly Employees With Shifts And Slots");
              else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              e.setTitle("השג את כל העובדים השעתיים עם משמרות וסלוטים");
              pane.add(e);
              e.show();
}

public void GetAllHourlyEmployeesWithShiftsAndSlotsQueryRun(JTable table,JTable tabletwo, JLayeredPane tableLayeredPane,JLayeredPane shiftmanagers, JLayeredPane workers,JLayeredPane shifts,JLayeredPane slots,JComboBox language)
{
    
    DefaultTableModel tm = (DefaultTableModel) table.getModel();
     DefaultTableModel tmTwo = (DefaultTableModel) tabletwo.getModel();
    try{
      table.getTableHeader().setFont( new Font( "Tahoma" , Font.BOLD, 11 ));
      tabletwo.getTableHeader().setFont( new Font( "Tahoma" , Font.BOLD, 11 ));
       Map<HourlyEmployee, Map<Shift, Collection<Slot>>> result = controller.getAllHourlyEmployeesWithShiftsAndSlots();
           for (Map.Entry<HourlyEmployee, Map<Shift, Collection<Slot>>> res: result.entrySet())
            {
               if (res.getKey() instanceof ShiftManager)
               {
                 Object rowData[] = new Object[11];
                 rowData[0]=res.getKey().getId();
                 rowData[1]=res.getKey().getName();
                 rowData[2]=res.getKey().getAddress().getCountry();
                 rowData[3]=res.getKey().getAddress().getCity();
                 rowData[4]=res.getKey().getAddress().getStreet();
                 rowData[5]=res.getKey().getAddress().getHouseNumber();
                 rowData[6]=res.getKey().getAddress().getZipCode();
                 rowData[7]=((ShiftManager)res.getKey()).getBirthday().getTime().toString();
                 rowData[8]=((ShiftManager)res.getKey()).getEmploymentDate().getTime().toString();
                 rowData[9]=((ShiftManager)res.getKey()).getHourlyWage();
                 rowData[10]=((ShiftManager)res.getKey()).getExtraWage();
                 tm.addRow(rowData);
               }
            else if (res.getKey() instanceof Worker)
               {
                 Object rowData[] = new Object[10];
                 rowData[0]=res.getKey().getId();
                 rowData[1]=res.getKey().getName();
                 rowData[2]=res.getKey().getAddress().getCountry();
                 rowData[3]=res.getKey().getAddress().getCity();
                 rowData[4]=res.getKey().getAddress().getStreet();
                 rowData[5]=res.getKey().getAddress().getHouseNumber();
                 rowData[6]=res.getKey().getAddress().getZipCode();
                 rowData[7]=((Worker)res.getKey()).getBirthday().getTime().toString();
                 rowData[8]=((Worker)res.getKey()).getEmploymentDate().getTime().toString();
                 rowData[9]=((Worker)res.getKey()).getHourlyWage();
                 tmTwo.addRow(rowData);
               }
              }
          }
    catch (Exception e) {
        tableLayeredPane.setEnabled(false);
        tableLayeredPane.setVisible(false);
        Toolkit.getDefaultToolkit().beep();
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
        JOptionPane.showMessageDialog(null, "There are no employees to display!");
        else if (language.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "לא קיימים עובדים!");
    }
    finally {
        if (table.getRowCount()==0)
        {
            shiftmanagers.setVisible(false);
            shiftmanagers.setEnabled(false);
        }
        if (tabletwo.getRowCount()==0)
        {
            workers.setVisible(false);
            workers.setEnabled(false);
        }
        if (!shiftmanagers.isVisible() && !workers.isVisible())
        {
            shifts.setVisible(false);
            shifts.setEnabled(false);
            slots.setVisible(false);
            slots.setEnabled(false);
            Toolkit.getDefaultToolkit().beep();
            if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
         JOptionPane.showMessageDialog(null, "There are no employees to display!");
            else if (language.getSelectedItem().equals("עברית"))
            JOptionPane.showMessageDialog(null, "לא קיימים עובדים!");
        }
    }
}

public void EmployeeSelectedFromTable(String id,JTable tablethree)
{  
     tablethree.getTableHeader().setFont( new Font( "Tahoma" , Font.BOLD, 11 ));
     DefaultTableModel tmThree = (DefaultTableModel) tablethree.getModel();
     Map<HourlyEmployee, Map<Shift, Collection<Slot>>> result = controller.getAllHourlyEmployeesWithShiftsAndSlots();
          if (model.getEmployees().get(id) instanceof HourlyEmployee)
             for (Map.Entry<Shift, Collection<Slot>> entry: result.get((HourlyEmployee)model.getEmployees().get(id)).entrySet())
              {
                 Object rowData[] = new Object[12];
                 rowData[0]=entry.getKey().getStartingTime().getTime().toString();
                 rowData[1]=entry.getKey().getShiftManager().getId();
                 rowData[2]=entry.getKey().getShiftManager().getName();
                 rowData[3]=entry.getKey().getShiftManager().getAddress().getCountry();
                 rowData[4]=entry.getKey().getShiftManager().getAddress().getCity();
                 rowData[5]=entry.getKey().getShiftManager().getAddress().getStreet();
                 rowData[6]=entry.getKey().getShiftManager().getAddress().getHouseNumber();
                 rowData[7]=entry.getKey().getShiftManager().getAddress().getZipCode();
                 rowData[8]=entry.getKey().getShiftManager().getBirthday().getTime().toString();
                 rowData[9]=entry.getKey().getShiftManager().getEmploymentDate().getTime().toString();
                 rowData[10]=entry.getKey().getShiftManager().getHourlyWage();
                 rowData[11]=entry.getKey().getShiftManager().getExtraWage();
                 tmThree.addRow(rowData);
               }  
}

public void ShiftSelectedFromTable(String id,Calendar startingTime, JTable tablefour)
{
    DefaultTableModel tmFour = (DefaultTableModel) tablefour.getModel();
    Map<HourlyEmployee, Map<Shift, Collection<Slot>>> result = controller.getAllHourlyEmployeesWithShiftsAndSlots();
    Map<Shift,Collection<Slot>> shifts=result.get((HourlyEmployee)model.getEmployees().get(id));
    Shift shi=model.getShifts().get(startingTime);
    for (Slot s: shifts.get(shi))
    {
        Object rowData[] = new Object[16];
                   rowData[0]=s.getStartingTime().getTime().toString();
                   rowData[1]=s.getShift().getStartingTime().getTime().toString();
                   rowData[2]=s.getShift().getShiftManager().getId();
                   rowData[3]=s.getShift().getShiftManager().getName();
                   rowData[4]=s.getShift().getShiftManager().getAddress().getCountry();
                   rowData[5]=s.getShift().getShiftManager().getAddress().getCity();
                   rowData[6]=s.getShift().getShiftManager().getAddress().getStreet();
                   rowData[7]=s.getShift().getShiftManager().getAddress().getHouseNumber();
                   rowData[8]=s.getShift().getShiftManager().getAddress().getZipCode();
                   rowData[9]=s.getShift().getShiftManager().getBirthday().getTime().toString();
                   rowData[10]=s.getShift().getShiftManager().getEmploymentDate().getTime().toString();
                   rowData[11]=s.getShift().getShiftManager().getHourlyWage();
                   rowData[12]=s.getShift().getShiftManager().getExtraWage();
                   rowData[13]=s.getPlan().getSerialNumber();
                   rowData[14]=s.getPlan().getType().getSerialNumber();
                   rowData[15]=s.getPlan().getType().getNumberOfSlots();
                   tmFour.addRow(rowData);   
    }
        
}

public void OpenGetPartsQuantityInAllOrdersQuery(JDesktopPane pane,UserMenu um)
{
              GetPartsQuantityInAllOrders p=new GetPartsQuantityInAllOrders(um);
              if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
              p.setTitle("Get Parts Quantity in All Orders");
              else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
              p.setTitle("השג כמות חלקים בכל ההזמנות");
              pane.add(p);
              p.show();
}

public void GetPartsQuantityInAllOrdersQueryRun(JTable table, JLayeredPane tableLayeredPane,JComboBox language)
{
    tableLayeredPane.setEnabled(true);
    tableLayeredPane.setVisible(true);
    DefaultTableModel tm = (DefaultTableModel) table.getModel();
          try {
           Map<PartType, Integer> result = controller.getPartsQuantityInAllOrders();
           Object rowData[] = new Object[5];
           for (Map.Entry<PartType,Integer> res: result.entrySet())
             {
            rowData[0]=res.getKey().getPartNumber();
            rowData[1]=res.getKey().getPartName();
            rowData[2]=res.getKey().getCategory();
            rowData[3]=res.getKey().getProductionCost();
            rowData[4]=res.getValue();
            tm.addRow(rowData);
            }
          }
         catch (Exception e) {
            tableLayeredPane.setEnabled(false);
            tableLayeredPane.setVisible(false);
            Toolkit.getDefaultToolkit().beep();
            if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "There are no parts in any order!");
            else if (language.getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "לא קיימים חלקים בשום הזמנה!");
        }
         finally
         {
           if (table.getRowCount()==0)
           {
            tableLayeredPane.setEnabled(false);
            tableLayeredPane.setVisible(false);
            Toolkit.getDefaultToolkit().beep();
            if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
            JOptionPane.showMessageDialog(null, "There are no parts in any order!");
            else if (language.getSelectedItem().equals("עברית"))
                JOptionPane.showMessageDialog(null, "לא קיימים חלקים בשום הזמנה!");
           }
             
         }
}

public void HomeWorkersTable (JTable table)
{
    DefaultTableModel tm = (DefaultTableModel) table.getModel();
    try
    {       
        for (AbstractEmployee ae: model.getEmployees().values())
        {
            if (ae instanceof Worker)
            {
                for (Shift s: (((Worker)ae).getShifts()))
                {
                    if (s.getStartingTime().compareTo(Calendar.getInstance()) <= 0 && s.endTime().compareTo(Calendar.getInstance()) > 0)
                    {
                        Object rowData[] = new Object[10];
                        rowData[0]=ae.getId();
                        rowData[1]=ae.getName();
                        rowData[2]=ae.getAddress().getCountry();
                        rowData[3]=ae.getAddress().getCity();
                        rowData[4]=ae.getAddress().getStreet();
                        rowData[5]=ae.getAddress().getHouseNumber();
                        rowData[6]=ae.getAddress().getZipCode();
                        rowData[7]=((Worker)ae).getBirthday().getTime().toString();
                        rowData[8]=((Worker)ae).getEmploymentDate().getTime().toString();
                        rowData[9]=((Worker)ae).getHourlyWage();
                        tm.addRow(rowData);
                    }
                }
            }
        }
    }
    catch (Exception e){
        
    }
}

public void HomeVehiclesTable (JTable table)
{
    int productionOfVehicle=0,pos=0,vehicleFinished=0;
    DefaultTableModel tm = (DefaultTableModel) table.getModel();
    try
    {       
        for (Shift sh: model.getShifts().values())
        {
          if (sh.getStartingTime().compareTo(Calendar.getInstance()) <= 0 && sh.endTime().compareTo(Calendar.getInstance()) > 0)
          {
             for (Slot s: sh.getSlots().values())
             {
                 Calendar[] mapKeys = new Calendar[s.getPlan().getSlots().size()];
                 for (Calendar key : s.getPlan().getSlots().keySet())
                 {
                  mapKeys[pos] = key;
                  pos++;
                 }
                   pos=0;
                   vehicleFinished=Arrays.binarySearch(mapKeys, s.getStartingTime())+1;
                   if (vehicleFinished%s.getPlan().getType().getNumberOfSlots()==0)
                   {
                       productionOfVehicle=vehicleFinished/s.getPlan().getType().getNumberOfSlots();
                       Vehicle[] setKeys = new Vehicle[s.getPlan().getVehicles().size()];
                       for (Vehicle key : s.getPlan().getVehicles())
                        {
                          setKeys[pos] = key;
                          pos++;
                        }
                      pos=0;
                      Object rowData[] = new Object[12];
                      rowData[0]=setKeys[productionOfVehicle-1].getVin();
                      rowData[1]=setKeys[productionOfVehicle-1].getModel().getModelName();
                      rowData[2]=setKeys[productionOfVehicle-1].getModel().getVehicleType();
                      rowData[3]=setKeys[productionOfVehicle-1].getModel().getHp();
                      rowData[4]=setKeys[productionOfVehicle-1].getModel().getTopSpeed();
                      rowData[5]=setKeys[productionOfVehicle-1].getModel().getNumOfSeats();
                      rowData[6]=setKeys[productionOfVehicle-1].getModel().isIsAutomatic();
                      rowData[7]=setKeys[productionOfVehicle-1].getModel().getProductionCost();
                      rowData[8]=setKeys[productionOfVehicle-1].getModel().getEnteredProduction().getTime().toString();
                      rowData[9]=setKeys[productionOfVehicle-1].getProductionPlan().getSerialNumber();
                      rowData[10]=setKeys[productionOfVehicle-1].getModel().getProductionPlanType().getSerialNumber();
                      rowData[11]=setKeys[productionOfVehicle-1].getModel().getProductionPlanType().getNumberOfSlots();
                      tm.addRow(rowData);
                   }
             }
           }
        }
    }
    catch (Exception e){
        
    }
}

public void TableSetting (JTable table,String []types,List<?> data)
{
    GenericTable<?> gt=new GenericTable(types,data);
    table.setModel(gt);
    table.getRowSorter().toggleSortOrder(0);
    JTableHeader tableHeader = table.getTableHeader();
    TableColumnModel tableCM=tableHeader.getColumnModel();
    for (int i=0;i<types.length;i++)
    {
      TableColumn tableC= tableCM.getColumn(i);
      tableC.setHeaderValue(types[i]);
    }
}

public void ShowDataParts(JTable table,JComboBox language)
{
    String[]types={"Part Type Number","Part Type Name", "Category" , "Production Cost"};
    String[]hebHeaders={"מספר סוג החלק","שם סוג החלק", "קטגוריה" , "מחיר יצור"};
    List<PartType> parts=  new ArrayList<>(model.getParts().values());
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    TableSetting(table,types,parts);
    else if (language.getSelectedItem().equals("עברית"))
        TableSetting(table,hebHeaders,parts);
    
}

public void ShowDataOrders(JTable tableSales, JTable tablePurchases,JComboBox language)
{
    String[]typesSales={"Order Number","Shift Manager ID","Shift Manager Name", "Shift Manager Country", "Shift Manager City" , "Shift Manager Street" , "Shift Manager House Number", "Shift Manager ZIP Code", "Shift Manager Birthday", "Shift Manager Employment Date", "Hourly Wage" , "Extra Wage","Manufacturer Name", "Manufacturer Country" , "Manufacturer City", "Manufacturer Street", "Manufacturer House Number", "Manufacturer ZIP Code", "Profit Percentage","Due Date"};
    String[]typesPurchases={"Order Number","Manufacturer Name", "Manufacturer Country" , "Manufacturer City", "Manufacturer Street", "Manufacturer House Number", "Manufacturer ZIP Code", "Profit Percentage","Shift Manager ID","Shift Manager Name", "Shift Manager Country", "Shift Manager City" , "Shift Manager Street" , "Shift Manager House Number", "Shift Manager ZIP Code", "Shift Manager Birthday","Shift Manager Employment Date","Hourly Wage","Extra Wage","Due Date"};
    String[]hebHeadersSales={"מספר הזמנה","מספר מנהל המשמרת","שם מנהל המשמרת", "מדינת מנהל המשמרת", "עיר מנהל המשמרת" , "רחוב מנהל המשמרת" , "מספר הבית של מנהל המשמרת", "מיקוד מנהל המשמרת", "תאריך הלידה של מנהל המשמרת", "תאריך תחילת ההעסקה של מנהל המשמרת", "שכר שעתי" , "שכר בונוס","שם היצרן", "מדינת היצרן" , "עיר היצרן", "רחוב היצרן", "מספר הבית של היצרן", "מיקוד היצרן", "אחוז הרווח","תאריך יעד"};
    String[]hebHeadersPurchases={"מספר הזמנה","שם היצרן", "מדינת היצרן" , "עיר היצרן", "רחוב היצרן", "מספר הבית של היצרן", "מיקוד היצרן", "אחוז הרווח","מספר מנהל המשמרת","שם מנהל המשמרת", "מדינת מנהל המשמרת", "עיר מנהל המשמרת" , "רחוב מנהל המשמרת" , "מספר הבית של מנהל המשמרת", "מיקוד מנהל המשמרת", "תאריך הלידה של מנהל המשמרת", "תאריך תחילת ההעסקה של מנהל המשמרת", "שכר שעתי" , "שכר בונוס","תאריך יעד"};
    List<Order> orders =  new ArrayList<>(model.getOrders().values());
    List<Order> sales= new ArrayList<>();
    List<Order> purchases= new ArrayList<>();
    for (Order o:orders)
    {
        if (o.getOrderedFrom() instanceof ShiftManager && o.getOrderedTo() instanceof Manufacturer)
            sales.add(o);
        else if (o.getOrderedFrom() instanceof Manufacturer && o.getOrderedTo() instanceof ShiftManager)
            purchases.add(o);
    }
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language")){
    TableSetting(tableSales,typesSales,sales);
    TableSetting(tablePurchases,typesPurchases,purchases);
    }
    else if (language.getSelectedItem().equals("עברית")){
        TableSetting(tableSales,hebHeadersSales,sales);
    TableSetting(tablePurchases,hebHeadersPurchases,purchases);
    }
    
}

public void ShowDataManufacturers(JTable table,JComboBox language)
{
    String[]types={"Manufacturer Name", "Country" , "City", "Street", "House Number", "ZIP Code", "Profit Percentage"};
    String[]hebHeaders={"שם היצרן", "מדינה" , "עיר", "רחוב", "מספר בית", "מיקוד", "אחוז רווח"};
    List<Manufacturer> manufacturers=  new ArrayList<>(model.getManufacturers().values());
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    TableSetting(table,types,manufacturers);
    else if (language.getSelectedItem().equals("עברית"))
    TableSetting(table,hebHeaders,manufacturers);
}

public void ShowDataProductionPlans(JTable table,JComboBox language)
{
    String[]types={"Production Plan - Serial Number","Production Plan Type - Serial Number", "Production Plan Type - Number of Slots"};
    String[]hebTypes={"תכנית יצור-מספר סידורי","סוג תכנית יצור-מספר סידורי", "סוג תכנית יצור-מספר הסלוטים"};
    List<ProductionPlan> pp=  new ArrayList<>(model.getProductionPlans().values());
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    TableSetting(table,types,pp);
    else if (language.getSelectedItem().equals("עברית"))
    TableSetting(table,hebTypes,pp);
}

public void ShowDataProductionPlanTypes(JTable table,JComboBox language)
{
    String[]types={"Serial Number","Number of Slots"};
    String[]hebTypes={"מספר סידורי","מספר הסלוטים"};
    List<ProductionPlanType> ppt=  new ArrayList<>(model.getProductionPlanTypes().values());
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    TableSetting(table,types,ppt);
    else if (language.getSelectedItem().equals("עברית"))
    TableSetting(table,hebTypes,ppt);
}

public void ShowDataModels(JTable table,JComboBox language)
{
    String[]types={"Model Name","Category", "HP" , "Top Speed", "Number of Seats", "Automatic", "Production Cost", "Entered Production", "Production Plan Type - Serial Number", "Production Plan Type - Number of Slots"};
    String[]hebHeaders={"שם הדגם","קטגוריה", "כח סוס" , "מהירות מקסימלית", "מספר מושבים", "אוטומט", "מחיר יצור", "תאריך כניסה ליצור", "סוג תכנית יצור-מספר סידורי", "סוג תכנית יצור-מספר סלוטים"};
    List<VehicleModel> models=  new ArrayList<>(model.getModels().values());
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    TableSetting(table,types,models);
    else if (language.getSelectedItem().equals("עברית"))
    TableSetting(table,hebHeaders,models);
}

public void ShowDataVehicles(JTable table,JComboBox language)
{
    String[]types={"VIN","Model Name","Category", "HP" , "Top Speed", "Number of Seats", "Automatic", "Production Cost", "Entered Production","Production Plan - Serial Number", "Production Plan Type - Serial Number", "Production Plan Type - Number of Slots" , "Order Number"};
    String[]hebHeaders={"מספר הזיהוי של הרכב","שם הדגם","קטגוריה", "כח סוס" , "מהירות מקסימלית", "מספר מושבים", "אוטומט", "מכיר יצור", "תאריך כניסה ליצור","תכנית יצור -מספר סידורי", "סוג תכנית יצור-מספר סידורי", "סוג תכנית יצור-מספר סלוטים"};
    List<Vehicle> vehicles=  new ArrayList<>(model.getVehicles().values());
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    TableSetting(table,types,vehicles);
    else if (language.getSelectedItem().equals("עברית"))
        TableSetting(table,hebHeaders,vehicles);
    
}

public void ShowDataWarehouses(JTable table,JComboBox language)
{
    String[]types={"Warehouse Number","Country", "City" , "Street" , "House Number", "ZIP Code", "Max Parts Stored", "Max Vehicles Stored", "Current Number of Parts"};
    String[]hebHeaders={"מספר מחסן","מדינה", "עיר" , "רחוב" , "מספר בית", "מיקוד", "מכסת חלקים לאחסון", "מכסת רכבים לאחסון", "כמות החלקים הנוכחית"};
    List<Warehouse> warehouses=  new ArrayList<>(model.getWarehouses().values());
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    TableSetting(table,types,warehouses);
    else if (language.getSelectedItem().equals("עברית"))
        TableSetting(table,hebHeaders,warehouses);
    
}

public void ShowDataWorkStations(JTable table,JComboBox language)
{
    String[]types={"Station Number","Category"};
    String[]hebTypes={"מספר תחנת עבודה","קטגוריה"};
    List<WorkStation> workstations=  new ArrayList<>(model.getWorkStations().values());
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    TableSetting(table,types,workstations);
    else if (language.getSelectedItem().equals("עברית"))
    TableSetting(table,hebTypes,workstations);
}

public void ShowDataShifts(JTable table,JComboBox language)
{
    String[]types={"Starting Time","Shift Manager ID","Shift Manager Name", "Shift Manager Country", "Shift Manager City" , "Shift Manager Street" , "Shift Manager House Number", "Shift Manager ZIP Code", "Shift Manager Birthday", "Shift Manager Employment Date", "Hourly Wage" , "Extra Wage"};
    String[]hebHeaders={"תחילת המשמרת","מספר מנהל המשמרת","שם מנהל המשמרת", "מדינת מנהל המשמרת", "עיר מנהל המשמרת" , "רחוב מנהל המשמרת" , "מספר בית מנהל המשמרת", "מיקוד מנהל המשמרת", "תאריך הלידה של מנהל המשמרת", "תאריך תחילת ההעסקה של מנהל המשמרת", "שכר שעתי" , "שכר בונוס"};
    List<Shift> shifts=  new ArrayList<>(model.getShifts().values());
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    TableSetting(table,types,shifts);
    else if (language.getSelectedItem().equals("עברית"))
        TableSetting(table,hebHeaders,shifts);
    
}

public void ShowDataEmployees(JTable table, JTable tableTwo, JTable tableThree,JComboBox language)
{
    String[]typesguard={"ID","Name","Country","City","Street","House Number","ZIP Code","Birthday","Employment Date","Monthly Salary","Warehouse Number","Warehouse Country","Warehouse City","Warehouse Street","Warehouse House Number","Warehouse ZIP Code","Max Parts Stored","Max Vehicles Stored","Current Number of Parts"};
    String[]typesshiftmanagers={"ID","Name","Country","City","Street","House Number","ZIP Code","Birthday","Employment Date","Hourly Wage", "Extra Wage"};
    String[]typesworkers={"ID","Name","Country","City","Street","House Number","ZIP Code","Birthday","Employment Date","Hourly Wage"};
    String[]hebHeadersWorkers={"מספר עובד","שם","מדינה","עיר","רחוב","מספר בית","מיקוד","תאריך לידה","תאריך תחילת ההעסקה","שכר שעתי"};
    String[]hebHeadersSM={"מספר עובד","שם","מדינה","עיר","רחוב","מספר בית","מיקוד","תאריך לידה","תאריך תחילת ההעסקה","שכר שעתי", "שכר בונוס"};
    String[]hebHeadersGuards={"מספר עובד","שם","מדינה","עיר","רחוב","מספר בית","מיקוד","תאריך לידה","תאריך תחילת ההעסקה","שכר חודשי","מספר מחסן","מדינה", "עיר" , "רחוב" , "מספר בית", "מיקוד", "מכסת חלקים לאחסון", "מכסת רכבים לאחסון", "כמות החלקים הנוכחית"};
    List<AbstractEmployee> ae= new ArrayList<>(model.getEmployees().values());
    List<Guard> guards=  new ArrayList<>();
    List<ShiftManager> shiftmanagers=  new ArrayList<>();
    List<Worker> workers=  new ArrayList<>();
    for (AbstractEmployee e:ae)
    {
        if (e instanceof Guard)
            guards.add((Guard) e);
        else if (e instanceof ShiftManager)
            shiftmanagers.add((ShiftManager) e);
        else if (e instanceof Worker)
            workers.add((Worker) e);
    }
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language")){
    TableSetting(table,typesguard,guards);
    TableSetting(tableTwo, typesshiftmanagers, shiftmanagers);
    TableSetting(tableThree, typesworkers, workers);
    }
    else if (language.getSelectedItem().equals("עברית")){
    TableSetting(table,hebHeadersGuards,guards);
    TableSetting(tableTwo, hebHeadersSM, shiftmanagers);
    TableSetting(tableThree, hebHeadersWorkers, workers);
    }
    
}

public void ShowDataUsers(JTable table,JComboBox language)
{
    String[]types={"Username","Password", "Type" , "Secret Question" , "Secret Answer"};
    String[]hebTypes={"שם משתמש","סיסמא", "סוג" , "שאלה סודית" , "תשובה סודית"};
    List<User> users=  new ArrayList<>(model.getUsers().values());
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    TableSetting(table,types,users);
    else if (language.getSelectedItem().equals("עברית"))
    TableSetting(table,hebTypes,users);
}

public void AddMouseEnter (JPanel addPanel)
{
    Color c=new Color(0,102,102);
        if (addPanel.getBackground().equals(c))
        {
            c=new Color(0,204,204);
            addPanel.setBackground(c);
        }
}

public void AddMouseExit (JPanel addPanel)
{
     Color c=new Color(0,204,204);
        if (addPanel.getBackground().equals(c))
        {
            c=new Color(0,102,102);
            addPanel.setBackground(c);
        }
}

public void RemoveModelsFromManufacturers(JTable table,String manu,JComboBox language)
{
    
    String[]types={"Model Name","Category", "HP" , "Top Speed", "Number of Seats", "Automatic", "Production Cost", "Entered Production", "Production Plan Type - Serial Number", "Production Plan Type - Number of Slots"};
    String[]hebHeaders={"שם הדגם","קטגוריה", "כח סוס" , "מהירות מקסימלית", "מספר מושבים", "אוטומט", "מחיר יצור", "תאריך כניסה ליצור", "סוג תכנית יצור-מספר סידורי", "סוג תכנית יצור-מספר סלוטים"};
    Manufacturer manufacturer=model.getManufacturers().get(manu);
    List<VehicleModel> models=new ArrayList<>();
    for (VehicleModel vm: manufacturer.getProducedModels())
        models.add(vm);
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    TableSetting(table,types,models);
    else if (language.getSelectedItem().equals("עברית"))
        TableSetting(table,hebHeaders,models);
}
public void RemovePartsFromManufacturers(JTable table,String manu,JComboBox language)
{
    String[]types={"Part Category"};
    String[]hebTypes={"קטגוריית החלק"};
    Manufacturer manufacturer=model.getManufacturers().get(manu);
    List<E_PartCategory> parts=new ArrayList<>();
    for (E_PartCategory p: manufacturer.getProducedPartTypes())
                 parts.add(p);
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    TableSetting(table,types,parts);
    else if (language.getSelectedItem().equals("עברית"))
        TableSetting(table,hebTypes,parts);
    
}

public void RemoveShiftsFromWorker(JTable table, String employeeId,JComboBox language)
{
    String[]types={"Starting Time","Shift Manager ID","Shift Manager Name", "Shift Manager Country", "Shift Manager City" , "Shift Manager Street" , "Shift Manager House Number", "Shift Manager ZIP Code", "Shift Manager Birthday", "Shift Manager Employment Date", "Hourly Wage" , "Extra Wage"};
    String[]hebHeaders={"תחילת המשמרת","מספר מנהל המשמרת","שם מנהל המשמרת", "מדינת מנהל המשמרת", "עיר מנהל המשמרת" , "רחוב מנהל המשמרת" , "מספר בית מנהל המשמרת", "מיקוד מנהל המשמרת", "תאריך הלידה של מנהל המשמרת", "תאריך תחילת ההעסקה של מנהל המשמרת", "שכר שעתי" , "שכר בונוס"};
    HourlyEmployee w=(HourlyEmployee)model.getEmployees().get(employeeId);
    List<Shift> shifts=  new ArrayList<>();
    for (Shift s: w.getShifts())
        shifts.add(s);
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    TableSetting(table,types,shifts);
    else if (language.getSelectedItem().equals("עברית"))
       TableSetting(table,hebHeaders,shifts); 
    
}
public void RemoveWorkstationsFromWorker(JTable table, String employeeId,JComboBox language)
{
    String[]types={"Station Number","Category"};
    String[]hebTypes={"מספר תחנת עבודה","קטגוריה"};
    Worker w=(Worker)model.getEmployees().get(employeeId);
    List<WorkStation> ws=  new ArrayList<>();
         for (WorkStation s: w.getWorkStations())
             ws.add(s);
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
    TableSetting(table,types,ws);
    else if (language.getSelectedItem().equals("עברית"))
    TableSetting(table,hebTypes,ws);
}
 public void removeVehicleFromWarehouse(JTable table, int warehouseNumber,JComboBox language) {
     String[]types={"VIN","Model Name","Category", "HP" , "Top Speed", "Number of Seats", "Automatic", "Production Cost", "Entered Production","Production Plan - Serial Number", "Production Plan Type - Serial Number", "Production Plan Type - Number of Slots" , "Order Number"};
     String[]hebHeaders={"מספר הזיהוי של הרכב","שם הדגם","קטגוריה", "כח סוס" , "מהירות מקסימלית", "מספר מושבים", "אוטומט", "מכיר יצור", "תאריך כניסה ליצור","תכנית יצור -מספר סידורי", "סוג תכנית יצור-מספר סידורי", "סוג תכנית יצור-מספר סלוטים"};
     Warehouse wh=model.getWarehouses().get(warehouseNumber);
     List<Vehicle> vehicles=new ArrayList<>();
        for (Vehicle v: wh.getVehicles())
            vehicles.add(v);
     if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
     TableSetting(table,types,vehicles);
     else if (language.getSelectedItem().equals("עברית"))
         TableSetting(table,hebHeaders,vehicles);
}
	
public void removePartTypeFromWarehouse (JTable table, int warehouseNumber,JComboBox language) {
    String[]types={"Part Type Number","Part Type Name", "Category" , "Production Cost"};
    String[]hebHeaders={"מספר סוג החלק","שם סוג החלק", "קטגוריה" , "מחיר יצור"};
    Warehouse wh=model.getWarehouses().get(warehouseNumber);
    List<PartType> parts=new ArrayList<>();
        for (PartType p: wh.getParts().keySet())
            parts.add(p);
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
            TableSetting(table,types,parts);
        else if (language.getSelectedItem().equals("עברית"))
            TableSetting(table,hebHeaders,parts);
}

public void removePartFromModel(JTable table, String modelName,JComboBox language) {
    String[]types={"Part Type Number","Part Type Name", "Category" , "Production Cost"};
    String[]hebHeaders={"מספר סוג החלק","שם סוג החלק", "קטגוריה" , "מחיר יצור"};
    VehicleModel vm= model.getModels().get(modelName);
    List<PartType> parts=new ArrayList<>();
      for (PartType p: vm.getRequiredParts().keySet())
          parts.add(p);
      if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
        TableSetting(table,types,parts);
      else if (language.getSelectedItem().equals("עברית"))
          TableSetting(table,hebHeaders,parts);
}

public void removeManufacturerFromPart(JTable table,int partNumber,JComboBox language) {
    String[]types={"Manufacturer Name", "Country" , "City", "Street", "House Number", "ZIP Code", "Profit Percentage"};
    String[]hebHeaders={"שם היצרן", "מדינה" , "עיר", "רחוב", "מספר בית", "מיקוד", "אחוז רווח"};
    PartType pt= model.getParts().get(partNumber);
    List<Manufacturer> manufacturers=new ArrayList<>();
      for (Manufacturer m: pt.getManufacturers())
          manufacturers.add(m);
      if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
         TableSetting(table,types,manufacturers);
      else if (language.getSelectedItem().equals("עברית"))
         TableSetting(table,hebHeaders,manufacturers);
}

public void removePartTypeFromOrder(JTable table,int orderNumber,JComboBox language) {
    String[]types={"Part Type Number","Part Type Name", "Category" , "Production Cost"};
    String[]hebHeaders={"מספר סוג החלק","שם סוג החלק", "קטגוריה" , "מחיר יצור"};
    Order<?,?> order= model.getOrders().get(orderNumber);
    List<PartType> parts=new ArrayList<>();
       for (PartType p: order.getParts().keySet())
          parts.add(p);
       if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))
           TableSetting(table,types,parts);
       else if (language.getSelectedItem().equals("עברית"))
           TableSetting(table,hebHeaders,parts);
}

public void removeWorkStationFromProductionPlanType(JTable table, int productionSerial,JComboBox language) {
    String[]types={"Station Number","Category"};
    String[]hebTypes={"מספר תחנת עבודה","קטגוריה"};
    ProductionPlanType ppt= model.getProductionPlanTypes().get(productionSerial);
    List<WorkStation> ws=  new ArrayList<>();
         for (WorkStation s: ppt.getWorkStations())
             ws.add(s);
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))     
        TableSetting(table,types,ws);
    else if (language.getSelectedItem().equals("עברית"))
        TableSetting(table,hebTypes,ws);
}
public void AddModelsToManufacturers(JTable table,String manu,JComboBox language)
{
    String[]types={"Model Name","Category", "HP" , "Top Speed", "Number of Seats", "Automatic", "Production Cost", "Entered Production", "Production Plan Type - Serial Number", "Production Plan Type - Number of Slots"};
    String[]hebHeaders={"שם הדגם","קטגוריה", "כח סוס" , "מהירות מקסימלית", "מספר מושבים", "אוטומט", "מחיר יצור", "תאריך כניסה ליצור", "סוג תכנית יצור-מספר סידורי", "סוג תכנית יצור-מספר סלוטים"};
    Manufacturer manufacturer=model.getManufacturers().get(manu);
    List<VehicleModel> models=new ArrayList<>();
    for (VehicleModel vehicleModel: model.getModels().values())
        if (!manufacturer.getProducedModels().contains(vehicleModel))
        models.add(vehicleModel);
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language"))     
    TableSetting(table,types,models);
    else if (language.getSelectedItem().equals("עברית"))
    TableSetting(table,hebHeaders,models);
}
public void AddPartsToManufacturers(JTable table,String manu,JComboBox language)
{
    String[]types={"Part Category"};
    String[]hebTypes={"קטגוריית החלק"};
    Manufacturer manufacturer=model.getManufacturers().get(manu);
    List<E_PartCategory> categories=new ArrayList<>();
    for (PartType p: model.getParts().values())
        if (!manufacturer.getProducedPartTypes().contains(p.getCategory()) && !categories.contains(p.getCategory()))
        categories.add(p.getCategory());
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language")) 
    TableSetting(table,types,categories);
    else if (language.getSelectedItem().equals("עברית"))
        TableSetting(table,hebTypes,categories);
    
}
public void AddWorkstationsToWorker(JTable table,String employeeId,JComboBox language)
{
    String[]types={"Station Number","Category"};
    String[]hebTypes={"מספר תחנת עבודה","קטגוריה"};
    Worker worker=(Worker)model.getEmployees().get(employeeId);
    List<WorkStation> ws=new ArrayList<>();
    for (WorkStation w: model.getWorkStations().values())
        if (!worker.getWorkStations().contains(w))
             ws.add(w);
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language")) 
    TableSetting(table,types,ws);
    else if (language.getSelectedItem().equals("עברית"))
        TableSetting(table,hebTypes,ws);
    
}
public void AddPartToModel(JTable table, String modelName,JComboBox language){
    String[]types={"Part Type Number","Part Type Name", "Category" , "Production Cost"};
    String[]hebHeaders={"מספר סוג החלק","שם סוג החלק", "קטגוריה" , "מחיר יצור"};
    VehicleModel vm=model.getModels().get(modelName);
    List<PartType> parts=new ArrayList<>();
    for (PartType p: model.getParts().values())
             parts.add(p);
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language")) 
    TableSetting(table,types,parts);
    else if (language.getSelectedItem().equals("עברית"))
        TableSetting(table,hebHeaders,parts);
}
public void AddPartToOrder(JTable table, int orderNum,JComboBox language){
    String[]types={"Part Type Number","Part Type Name", "Category" , "Production Cost"};
    String[]hebHeaders={"מספר סוג החלק","שם סוג החלק", "קטגוריה" , "מחיר יצור"};
    Order<?,?> order=model.getOrders().get(orderNum);
    List<PartType> parts=new ArrayList<>();
    for (PartType p: model.getParts().values()){
        if (order.getOrderedFrom() instanceof Manufacturer){
            if (((Manufacturer)order.getOrderedFrom()).getProducedPartTypes().contains(p.getCategory()))
                parts.add(p);
        }
        else if (order.getOrderedTo() instanceof Manufacturer){
            if (((Manufacturer)order.getOrderedTo()).getProducedPartTypes().contains(p.getCategory()))
                parts.add(p);
        }         
    }
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language")) 
    TableSetting(table,types,parts);
    else if (language.getSelectedItem().equals("עברית"))
        TableSetting(table,hebHeaders,parts);
}
public void AddWorkStationToProductionPlanType(JTable table, int productionSerial,JComboBox language) {
    String[]types={"Station Number","Category"};
    String[]hebTypes={"מספר תחנת עבודה","קטגוריה"};
    ProductionPlanType ppt= model.getProductionPlanTypes().get(productionSerial);
    List<WorkStation> ws=  new ArrayList<>();
         for (WorkStation s: model.getWorkStations().values())
             if(!ppt.getWorkStations().contains(s))
                 ws.add(s);
         if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language")) 
           TableSetting(table,types,ws);
         else if (language.getSelectedItem().equals("עברית"))
             TableSetting(table,hebTypes,ws);
}
 public void addVehicleToWarehouse(JTable table, int warehouseNumber,JComboBox language) {
     String[]types={"VIN","Model Name","Category", "HP" , "Top Speed", "Number of Seats", "Automatic", "Production Cost", "Entered Production","Production Plan - Serial Number", "Production Plan Type - Serial Number", "Production Plan Type - Number of Slots" , "Order Number"};
     String[]hebHeaders={"מספר הזיהוי של הרכב","שם הדגם","קטגוריה", "כח סוס" , "מהירות מקסימלית", "מספר מושבים", "אוטומט", "מכיר יצור", "תאריך כניסה ליצור","תכנית יצור -מספר סידורי", "סוג תכנית יצור-מספר סידורי", "סוג תכנית יצור-מספר סלוטים"};
     Warehouse wh=model.getWarehouses().get(warehouseNumber);
     List<Vehicle> vehicles=new ArrayList<>();
        for (Vehicle v: model.getVehicles().values())
            if(!wh.getVehicles().contains(v))
                 vehicles.add(v);
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language")) 
            TableSetting(table,types,vehicles);
        else if (language.getSelectedItem().equals("עברית"))
            TableSetting(table,hebHeaders,vehicles);
}
	
public void addPartTypeToWarehouse (JTable table, int warehouseNumber,JComboBox language) {
    String[]types={"Part Type Number","Part Type Name", "Category" , "Production Cost"};
    String[]hebHeaders={"מספר סוג החלק","שם סוג החלק", "קטגוריה" , "מחיר יצור"};
    Warehouse wh=model.getWarehouses().get(warehouseNumber);
    List<PartType> parts=new ArrayList<>();
        for (PartType p: model.getParts().values())
            parts.add(p);
        if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language")) 
             TableSetting(table,types,parts);
        else if (language.getSelectedItem().equals("עברית"))
            TableSetting(table,hebHeaders,parts);
}
public void addManufacturerToPart(JTable table,int partNumber,JComboBox language) {
    String[]types={"Manufacturer Name", "Country" , "City", "Street", "House Number", "ZIP Code", "Profit Percentage"};
    String[]hebHeaders={"שם היצרן", "מדינה" , "עיר", "רחוב", "מספר בית", "מיקוד", "אחוז רווח"};
    PartType pt= model.getParts().get(partNumber);
    List<Manufacturer> manufacturers=new ArrayList<>();
      for (Manufacturer m: model.getManufacturers().values()){
          if(!pt.getManufacturers().contains(m)){
              if (m.getProducedPartTypes().contains(pt.getCategory()))
                  manufacturers.add(m);
          }       
      }
      if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language")) 
          TableSetting(table,types,manufacturers);
      else if (language.getSelectedItem().equals("עברית"))
          TableSetting(table,hebHeaders,manufacturers);
}

public void AddShiftToWorker(JTable table, String employeeId,JComboBox language){
    String[]types={"Starting Time","Shift Manager ID","Shift Manager Name", "Shift Manager Country", "Shift Manager City" , "Shift Manager Street" , "Shift Manager House Number", "Shift Manager ZIP Code", "Shift Manager Birthday", "Shift Manager Employment Date", "Hourly Wage" , "Extra Wage"};
    String[]hebHeaders={"תחילת המשמרת","מספר מנהל המשמרת","שם מנהל המשמרת", "מדינת מנהל המשמרת", "עיר מנהל המשמרת" , "רחוב מנהל המשמרת" , "מספר בית מנהל המשמרת", "מיקוד מנהל המשמרת", "תאריך הלידה של מנהל המשמרת", "תאריך תחילת ההעסקה של מנהל המשמרת", "שכר שעתי" , "שכר בונוס"};
    Worker w=(Worker)model.getEmployees().get(employeeId);
    List<Shift> shifts=  new ArrayList<>();
    for (Shift s: model.getShifts().values()){
        if (!w.getShifts().contains(s)){
         for (Slot sl:s.getSlots().values()){
             for (WorkStation ws:sl.getPlan().getType().getWorkStations()){
                 if (w.getWorkStations().contains(ws)){
                     if (!shifts.contains(s))
            shifts.add(s);
                 }
             }
         }
        }
    }
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language")) 
    TableSetting(table,types,shifts);
    else if (language.getSelectedItem().equals("עברית"))
    TableSetting(table,hebHeaders,shifts);
}

public void RemoveSlot(JTable table,Calendar startingTime,JComboBox language)
{
 String[]types={"Starting Time"};
 String[]hebTypes={"תחילת הסלוט"};
 Shift sh=model.getShifts().get(startingTime);
 List<Slot> slots=new ArrayList<>();
 for (Slot s: sh.getSlots().values())
     slots.add(s);
 if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language")) 
    TableSetting(table,types,slots);
 else if (language.getSelectedItem().equals("עברית"))
     TableSetting(table,hebTypes,slots);

}

public void AddSlot(JTable slotTable,JTable productionPlanTable, Calendar startingTime,JComboBox language)
{
  String[]slotTypes={"Starting Time"};
  String[]hebSlotsTypes={"תחילת הסלוט"};
  String[]ppTypes={"Serial Number", "Type Serial Number", "Type Number of Slots"};
  String[]hebPPTypes={"תכנית יצור-מספר סידורי","סוג תכנית יצור-מספר סידורי", "סוג תכנית יצור-מספר הסלוטים"};
  Shift sh=model.getShifts().get(startingTime);
  Calendar cal=(Calendar) sh.getStartingTime().clone();
  List<Calendar> calSlots=new ArrayList<>();
  List<ProductionPlan> pps= new ArrayList<>();
  if (!sh.getSlots().keySet().contains(cal))
         calSlots.add((Calendar) cal.clone());
  for (int i=1;i<utils.Constants.SHIFT_LENGTH;i++)
  {
  int hour=cal.get(Calendar.HOUR_OF_DAY)+1;
  cal.set(cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DATE), hour, cal.get(Calendar.MINUTE));
  if (!sh.getSlots().keySet().contains(cal))
         calSlots.add((Calendar) cal.clone());
  }
  for (ProductionPlan productionPlan: model.getProductionPlans().values())
      if (!productionPlan.isGood())
          pps.add(productionPlan);
    if (language.getSelectedItem().equals("English") || language.getSelectedItem().equals("Choose a language")) {
  TableSetting(slotTable,slotTypes,calSlots);
  TableSetting(productionPlanTable,ppTypes,pps);
    }
    else if (language.getSelectedItem().equals("עברית")){
        TableSetting(slotTable,hebSlotsTypes,calSlots);
  TableSetting(productionPlanTable,hebPPTypes,pps);
    }
}

public void disabledAdd(UserMenu um)
{
    Toolkit.getDefaultToolkit().beep();
            if (um.getLanguageComboBox().getSelectedItem().equals("English") || um.getLanguageComboBox().getSelectedItem().equals("Choose a language"))
    JOptionPane.showMessageDialog(null, "This feature is currently disabled!");
            else if (um.getLanguageComboBox().getSelectedItem().equals("עברית"))
           JOptionPane.showMessageDialog(null, "אפשרות זו כרגע כבויה!");
}


public void writeCSVfile(JTable table, String reportName,String fileName) throws IOException, ClassNotFoundException, SQLException{
        Writer writer = null;
        DefaultTableModel dtm = (DefaultTableModel) table.getModel();
        int nRow = dtm.getRowCount();
        int nCol = dtm.getColumnCount();
        try {
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(reportName+"_"+fileName+".csv"), "utf-8"));

            //write the header information
            StringBuffer bufferHeader = new StringBuffer();
            for (int j = 0; j < nCol; j++) {
                bufferHeader.append(dtm.getColumnName(j));
                if (j!=nCol) bufferHeader.append(", ");
            }
            writer.write(bufferHeader.toString() + "\r\n");

           //write row information
            for (int i = 0 ; i < nRow ; i++){
                 StringBuffer buffer = new StringBuffer();
                for (int j = 0 ; j < nCol ; j++){
                    buffer.append(dtm.getValueAt(i,j));
                    if (j!=nCol) buffer.append(", ");
                }
                writer.write(buffer.toString() + "\r\n");
            }
        } finally {
              writer.close();
        }
    }

public boolean serializeAdminDesignChoices(String fileNameDesigns,ArrayList<String> designs) throws IOException
{
    try
             {
                 OutputStream fileOutDesigns= new FileOutputStream(fileNameDesigns);
                 ObjectOutputStream outputDesigns = new ObjectOutputStream(fileOutDesigns);
                 outputDesigns.writeObject(designs);
                 outputDesigns.close();
                 fileOutDesigns.close();
                 System.out.println("Admin Designs serialized data is saved in project's folder as designs.ser");
                 return true;
             }
             catch (IOException i){
                 return false;
             }
}

public boolean serializeAdminMessageChoices(String fileNameMessage,String message) throws IOException
{
    try
             {
                 OutputStream fileOutMessage= new FileOutputStream(fileNameMessage);
                 ObjectOutputStream outputMessage = new ObjectOutputStream(fileOutMessage);
                 outputMessage.writeObject(message);
                 outputMessage.close();
                 fileOutMessage.close();
                 System.out.println("Admin message serialized data is saved in project's folder as message.ser");
                 return true;
             }
             catch (IOException i){
                 return false;
             }
}

public boolean serializeAdminVolumeChoices(String fileNameVolume,String volume) throws IOException
{
    try
             {
                 OutputStream fileOutVolume= new FileOutputStream(fileNameVolume);
                 ObjectOutputStream outputVolume = new ObjectOutputStream(fileOutVolume);
                 outputVolume.writeObject(volume);
                 outputVolume.close();
                 fileOutVolume.close();
                 System.out.println("Admin volume serialized data is saved in project's folder as volume.ser");
                 return true;
             }
             catch (IOException i){
                 return false;
             }
}

public boolean serializeAdminLocksChoices(String fileNameLocks,ArrayList<String> locks) throws IOException
{
    try
             {
                 OutputStream fileOutLocks= new FileOutputStream(fileNameLocks);
                 ObjectOutputStream outputLocks = new ObjectOutputStream(fileOutLocks);
                 outputLocks.writeObject(locks);
                 outputLocks.close();
                 fileOutLocks.close();
                 System.out.println("Admin locks serialized data is saved in project's folder as locks.ser");
                 return true;
             }
             catch (IOException i){
                 return false;
             }
}

public boolean deSerializeAdminDesignChoices(String fileNameDesigns,UserMenu um) throws IOException
{
    ArrayList<String> recoveredDesigns = null;
    try
          {
              InputStream fileIn= new FileInputStream(fileNameDesigns);
              ObjectInputStream in= new ObjectInputStream(fileIn);
              recoveredDesigns =(ArrayList<String>)in.readObject();
              um.options.getDesign().getjComboBoxBackground().setSelectedItem(recoveredDesigns.get(0));
              um.options.getDesign().getjComboBoxSideBar().setSelectedItem(recoveredDesigns.get(1));
              in.close();
              fileIn.close();
              System.out.println("Deserialized "+ fileNameDesigns + " successfully");
              return true; 
          }
          catch (Exception e) {
             return false;
          }
}

public boolean deSerializeAdminMessageChoices(String fileNameMessage,UserMenu um) throws IOException
{
    String recoveredMessage = null;
    try
          {
              InputStream fileIn= new FileInputStream(fileNameMessage);
              ObjectInputStream in= new ObjectInputStream(fileIn);
              recoveredMessage =(String)in.readObject();
              um.getAdminMessageText().setText(recoveredMessage);
              um.options.getNotification().getNotificationText().setText(recoveredMessage);
              in.close();
              fileIn.close();
              System.out.println("Deserialized "+ fileNameMessage + " successfully");
              return true; 
          }
          catch (Exception e) {
             return false;
          }
}

public boolean deSerializeAdminVolumeChoices(String fileNameVolume,UserMenu um) throws IOException
{
    String recoveredVolume = null;
    try
          {
              InputStream fileIn= new FileInputStream(fileNameVolume);
              ObjectInputStream in= new ObjectInputStream(fileIn);
              recoveredVolume =(String)in.readObject();
              um.options.getVolume().getLoginSoundComboBox().setText(recoveredVolume);
              if (recoveredVolume.equals("Off"))
              um.options.getVolume().getLoginSoundComboBox().setBackground(new Color(255,51,51));
              else if (recoveredVolume.equals("On"))
              um.options.getVolume().getLoginSoundComboBox().setBackground(new Color(0,204,153));        
              in.close();
              fileIn.close();
              System.out.println("Deserialized "+ fileNameVolume + " successfully");
              return true; 
          }
          catch (Exception e) {
             return false;
          }
}

public boolean deSerializeAdminLocksChoices(String fileNameLocks,UserMenu um) throws IOException
{
    ArrayList<String> recoveredLocks = null;
    try
          {
              InputStream fileIn= new FileInputStream(fileNameLocks);
              ObjectInputStream in= new ObjectInputStream(fileIn);
              recoveredLocks =(ArrayList<String>)in.readObject();
              um.options.getLock().getjComboBoxEmployees().setSelectedItem(recoveredLocks.get(0));
              um.options.getLock().getjComboBoxOrders().setSelectedItem(recoveredLocks.get(0));
              um.options.getLock().getjComboBoxaddEmployees().setSelectedItem(recoveredLocks.get(0));
              um.options.getLock().getjComboBoxAddOrders().setSelectedItem(recoveredLocks.get(0));
              um.options.getLock().getjComboBoxAddShifts().setSelectedItem(recoveredLocks.get(0));
              in.close();
              fileIn.close();
              System.out.println("Deserialized "+ fileNameLocks + " successfully");
              return true; 
          }
          catch (Exception e) {
             return false;
          }
}

/**
     * export designs to .ser file
     * @param fileName
     * @param designs
     * @return
     * @throws IOException 
     */
    public boolean serializeAdminDesignChoicesLog (String fileName,ArrayList<String> designs) throws IOException {
		boolean flag = serializeAdminDesignChoices(fileName, designs);
		if (flag)
			MyFileLogWriter.writeToLogFile("exporting data to " + fileName + " was successful: ", true);
		else
			MyFileLogWriter.writeToLogFile("exporting data to " + fileName + " failed", true);
		return flag;
	}
    /**
     * import designs from .ser file
     * @param fileName
     * @param um
     * @return
     * @throws IOException 
     */
    public boolean deSerializeAdminDesignChoicesLog (String fileName,UserMenu um) throws IOException {
		boolean flag = deSerializeAdminDesignChoices(fileName, um);
		if (flag)
			MyFileLogWriter.writeToLogFile("importing data from " + fileName + " was successful: ", true);
		else
			MyFileLogWriter.writeToLogFile("importing data from " + fileName + " failed", true);
		return flag;
	}
    
     /**
     * export message to .ser file
     * @param fileName
     * @param message
     * @return
     * @throws IOException 
     */
    public boolean serializeAdminMessageChoicesLog (String fileName,String message) throws IOException {
		boolean flag = serializeAdminMessageChoices(fileName, message);
		if (flag)
			MyFileLogWriter.writeToLogFile("exporting data to " + fileName + " was successful: ", true);
		else
			MyFileLogWriter.writeToLogFile("exporting data to " + fileName + " failed", true);
		return flag;
	}
    /**
     * import message from .ser file
     * @param fileName
     * @param um
     * @return
     * @throws IOException 
     */
    public boolean deSerializeAdminMessageChoicesLog (String fileName,UserMenu um) throws IOException {
		boolean flag = deSerializeAdminMessageChoices(fileName, um);
		if (flag)
			MyFileLogWriter.writeToLogFile("importing data from " + fileName + " was successful: ", true);
		else
			MyFileLogWriter.writeToLogFile("importing data from " + fileName + " failed", true);
		return flag;
	}
    
    /**
     * export volume to .ser file
     * @param fileName
     * @param volume
     * @return
     * @throws IOException 
     */
    public boolean serializeAdminVolumeChoicesLog (String fileName,String volume) throws IOException {
		boolean flag = serializeAdminVolumeChoices(fileName, volume);
		if (flag)
			MyFileLogWriter.writeToLogFile("exporting data to " + fileName + " was successful: ", true);
		else
			MyFileLogWriter.writeToLogFile("exporting data to " + fileName + " failed", true);
		return flag;
	}
    /**
     * import volume from .ser file
     * @param fileName
     * @param um
     * @return
     * @throws IOException 
     */
    public boolean deSerializeAdminVolumeChoicesLog (String fileName,UserMenu um) throws IOException {
		boolean flag = deSerializeAdminVolumeChoices(fileName, um);
		if (flag)
			MyFileLogWriter.writeToLogFile("importing data from " + fileName + " was successful: ", true);
		else
			MyFileLogWriter.writeToLogFile("importing data from " + fileName + " failed", true);
		return flag;
	}
    
    /**
     * export locks to .ser file
     * @param fileName
     * @param locks
     * @return
     * @throws IOException 
     */
    public boolean serializeAdminLocksChoicesLog (String fileName,ArrayList<String> locks) throws IOException {
		boolean flag = serializeAdminLocksChoices(fileName, locks);
		if (flag)
			MyFileLogWriter.writeToLogFile("exporting data to " + fileName + " was successful: ", true);
		else
			MyFileLogWriter.writeToLogFile("exporting data to " + fileName + " failed", true);
		return flag;
	}
    /**
     * import locks from .ser file
     * @param fileName
     * @param um
     * @return
     * @throws IOException 
     */
    public boolean deSerializeAdminLocksChoicesLog (String fileName,UserMenu um) throws IOException {
		boolean flag = deSerializeAdminLocksChoices(fileName, um);
		if (flag)
			MyFileLogWriter.writeToLogFile("importing data from " + fileName + " was successful: ", true);
		else
			MyFileLogWriter.writeToLogFile("importing data from " + fileName + " failed", true);
		return flag;
	}
    


}