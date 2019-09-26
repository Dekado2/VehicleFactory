/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.swing.table.AbstractTableModel;
import model.*;
import utils.E_PartCategory;
/**
 *
 */
public class GenericTable<O> extends AbstractTableModel{  

private Object [] types;
private List<O> data;

protected GenericTable(Object[] types, List<O> data)
{
    this.types=types;
    this.data=data;
}
   
    @Override
    public int getRowCount() {
        if (data==null)
           return 0;
        return data.size();
        
    }

    @Override
    public int getColumnCount() {
        if (types==null)
            return 0;
        return types.length;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
         if(columnIndex > getColumnCount() || rowIndex > getRowCount())
            return null;
          O row=null;
         try {
               row = data.get(rowIndex);
         }
         catch (Exception e){
             return null;
         }
         try{
        switch(columnIndex)
        {
            case 0:
            {
                if (row instanceof Manufacturer)
                    return ((Manufacturer)row).getName();
                else if (row instanceof Order<?,?>)
                    return ((Order<?,?>)row).getOrderNumber();
                else if (row instanceof PartType)
                    return ((PartType)row).getPartNumber();
                else if (row instanceof ProductionPlan)
                    return ((ProductionPlan)row).getSerialNumber();
                else if (row instanceof ProductionPlanType)
                    return ((ProductionPlanType)row).getSerialNumber();
                else if (row instanceof VehicleModel)
                    return ((VehicleModel)row).getModelName();
                else if (row instanceof Vehicle)
                    return ((Vehicle)row).getVin();
                else if (row instanceof Warehouse)
                    return ((Warehouse)row).getWarehouseNumber();
                else if (row instanceof WorkStation)
                       return ((WorkStation) row).getStationNumber();
                else if (row instanceof Shift)
                    return ((Shift)row).getStartingTime().getTime().toString();
                else if (row instanceof Slot)
                    return ((Slot)row).getStartingTime().getTime().toString();
                else if (row instanceof AbstractEmployee)
                    return ((AbstractEmployee)row).getId();
                else if (row instanceof User)
                    return ((User)row).getUsername();
                else if (row instanceof E_PartCategory)
                    return ((E_PartCategory)row).name();
                else if (row instanceof Calendar)
                    return ((Calendar)row).getTime().toString();
            }
            case 1:
                if (row instanceof Manufacturer)
                    return ((Manufacturer)row).getAddress().getCountry();
                else if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedFrom()).getId();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((Manufacturer)((Order<?,?>)row).getOrderedFrom()).getName();
                }
                else if (row instanceof PartType)
                    return ((PartType)row).getPartName();
                else if (row instanceof ProductionPlan)
                    return ((ProductionPlan)row).getType().getSerialNumber();
                else if (row instanceof ProductionPlanType)
                    return ((ProductionPlanType)row).getNumberOfSlots();
                else if (row instanceof VehicleModel)
                    return ((VehicleModel)row).getVehicleType();
                else if (row instanceof Vehicle)
                    return ((Vehicle)row).getModel().getModelName();
                else if (row instanceof Warehouse)
                    return ((Warehouse)row).getLocation().getCountry();
                else if (row instanceof WorkStation)
                       return ((WorkStation) row).getCategory();
                else if (row instanceof Shift)
                    return ((Shift)row).getShiftManager().getId();
                else if (row instanceof Slot)
                    return ((Slot)row).getShift().getStartingTime().getTime().toString();
                else if (row instanceof AbstractEmployee)
                    return ((AbstractEmployee)row).getName();
                else if (row instanceof User)
                    return ((User)row).getPassword();
            case 2:
                 if (row instanceof Manufacturer)
                    return ((Manufacturer)row).getAddress().getCity();
                else if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedFrom()).getName();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((Manufacturer)((Order<?,?>)row).getOrderedFrom()).getAddress().getCountry();
                }
                else if (row instanceof PartType)
                    return ((PartType)row).getCategory();
                else if (row instanceof ProductionPlan)
                    return ((ProductionPlan)row).getType().getNumberOfSlots();
                else if (row instanceof VehicleModel)
                    return ((VehicleModel)row).getHp();
                else if (row instanceof Vehicle)
                    return ((Vehicle)row).getModel().getVehicleType();
                else if (row instanceof Warehouse)
                    return ((Warehouse)row).getLocation().getCity();
                else if (row instanceof Shift)
                    return ((Shift)row).getShiftManager().getName();
                else if (row instanceof Slot)
                    return ((Slot)row).getShift().getShiftManager().getId();
                else if (row instanceof AbstractEmployee)
                    return ((AbstractEmployee)row).getAddress().getCountry();
                else if (row instanceof User)
                    return ((User)row).getType();     
            case 3:
                 if (row instanceof Manufacturer)
                    return ((Manufacturer)row).getAddress().getStreet();
                else if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedFrom()).getAddress().getCountry();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((Manufacturer)((Order<?,?>)row).getOrderedFrom()).getAddress().getCity();
                }
                else if (row instanceof PartType)
                    return ((PartType)row).getProductionCost();
                else if (row instanceof VehicleModel)
                    return ((VehicleModel)row).getTopSpeed();
                else if (row instanceof Vehicle)
                    return ((Vehicle)row).getModel().getHp();
                else if (row instanceof Warehouse)
                    return ((Warehouse)row).getLocation().getStreet();
                else if (row instanceof Shift)
                    return ((Shift)row).getShiftManager().getAddress().getCountry();
                else if (row instanceof Slot)
                    return ((Slot)row).getShift().getShiftManager().getName();
                else if (row instanceof AbstractEmployee)
                    return ((AbstractEmployee)row).getAddress().getCity();
                else if (row instanceof User)
                    return ((User)row).getSecretQuestion();
            case 4:
                 if (row instanceof Manufacturer)
                    return ((Manufacturer)row).getAddress().getHouseNumber();
                else if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedFrom()).getAddress().getCity();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((Manufacturer)((Order<?,?>)row).getOrderedFrom()).getAddress().getStreet();
                }
                else if (row instanceof VehicleModel)
                    return ((VehicleModel)row).getNumOfSeats();
                else if (row instanceof Vehicle)
                    return ((Vehicle)row).getModel().getTopSpeed();
                else if (row instanceof Warehouse)
                    return ((Warehouse)row).getLocation().getHouseNumber();
                else if (row instanceof Shift)
                    return ((Shift)row).getShiftManager().getAddress().getCity();
                else if (row instanceof Slot)
                    return ((Slot)row).getShift().getShiftManager().getAddress().getCountry();
                else if (row instanceof AbstractEmployee)
                    return ((AbstractEmployee)row).getAddress().getStreet();
                else if (row instanceof User)
                    return ((User)row).getSecretAnswer();   
            case 5:
                 if (row instanceof Manufacturer)
                    return ((Manufacturer)row).getAddress().getZipCode();
                else if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedFrom()).getAddress().getStreet();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((Manufacturer)((Order<?,?>)row).getOrderedFrom()).getAddress().getHouseNumber();
                }
                else if (row instanceof VehicleModel)
                    return ((VehicleModel)row).isIsAutomatic();
                else if (row instanceof Vehicle)
                    return ((Vehicle)row).getModel().getNumOfSeats();
                else if (row instanceof Warehouse)
                    return ((Warehouse)row).getLocation().getZipCode();
                else if (row instanceof Shift)
                    return ((Shift)row).getShiftManager().getAddress().getStreet();
                else if (row instanceof Slot)
                    return ((Slot)row).getShift().getShiftManager().getAddress().getCity();
                else if (row instanceof AbstractEmployee)
                    return ((AbstractEmployee)row).getAddress().getHouseNumber();
            case 6:
                 if (row instanceof Manufacturer)
                    return ((Manufacturer)row).getProfitPercentage();
                else if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedFrom()).getAddress().getHouseNumber();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((Manufacturer)((Order<?,?>)row).getOrderedFrom()).getAddress().getZipCode();
                }
                else if (row instanceof VehicleModel)
                    return ((VehicleModel)row).getProductionCost();
                else if (row instanceof Vehicle)
                    return ((Vehicle)row).getModel().isIsAutomatic();
                else if (row instanceof Warehouse)
                    return ((Warehouse)row).getMaxPartsStored();
                else if (row instanceof Shift)
                    return ((Shift)row).getShiftManager().getAddress().getHouseNumber();
                else if (row instanceof Slot)
                    return ((Slot)row).getShift().getShiftManager().getAddress().getStreet();
                else if (row instanceof AbstractEmployee)
                    return ((AbstractEmployee)row).getAddress().getZipCode(); 
            case 7:
                if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedFrom()).getAddress().getZipCode();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((Manufacturer)((Order<?,?>)row).getOrderedFrom()).getProfitPercentage();
                }
                else if (row instanceof VehicleModel)
                    return ((VehicleModel)row).getEnteredProduction().getTime().toString();
                else if (row instanceof Vehicle)
                    return ((Vehicle)row).getModel().getProductionCost();
                else if (row instanceof Warehouse)
                    return ((Warehouse)row).getMaxVehiclesStored();
                else if (row instanceof Shift)
                    return ((Shift)row).getShiftManager().getAddress().getZipCode();
                else if (row instanceof Slot)
                    return ((Slot)row).getShift().getShiftManager().getAddress().getHouseNumber();
                else if (row instanceof AbstractEmployee)
                    return ((AbstractEmployee)row).getBirthday().getTime().toString(); 
            case 8:
                if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedFrom()).getBirthday().getTime().toString();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedTo()).getId();
                }
                else if (row instanceof VehicleModel)
                    return ((VehicleModel)row).getProductionPlanType().getSerialNumber();
                else if (row instanceof Vehicle)
                    return ((Vehicle)row).getModel().getEnteredProduction().getTime().toString();
                else if (row instanceof Warehouse)
                    return ((Warehouse)row).getCurrentNumberOfParts();
                else if (row instanceof Shift)
                    return ((Shift)row).getShiftManager().getBirthday().getTime().toString();
                else if (row instanceof Slot)
                    return ((Slot)row).getShift().getShiftManager().getAddress().getZipCode();
                else if (row instanceof AbstractEmployee)
                    return ((AbstractEmployee)row).getEmploymentDate().getTime().toString(); 
            case 9:
                if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedFrom()).getEmploymentDate().getTime().toString();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedTo()).getName();
                }
                else if (row instanceof VehicleModel)
                    return ((VehicleModel)row).getProductionPlanType().getNumberOfSlots();
                else if (row instanceof Vehicle)
                    return ((Vehicle)row).getProductionPlan().getSerialNumber();
                else if (row instanceof Shift)
                    return ((Shift)row).getShiftManager().getEmploymentDate().getTime().toString();
                else if (row instanceof Slot)
                    return ((Slot)row).getShift().getShiftManager().getBirthday().getTime().toString();
                else if (row instanceof Guard)
                    return ((Guard)row).getMonthlySalary();
                else if (row instanceof HourlyEmployee)
                    return ((HourlyEmployee)row).getHourlyWage();
            case 10:
                if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedFrom()).getHourlyWage();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedTo()).getAddress().getCountry();
                }
                else if (row instanceof Vehicle)
                    return ((Vehicle)row).getProductionPlan().getType().getSerialNumber();
                else if (row instanceof Shift)
                    return ((Shift)row).getShiftManager().getHourlyWage();
                else if (row instanceof Slot)
                    return ((Slot)row).getShift().getShiftManager().getEmploymentDate().getTime().toString();
                else if (row instanceof Guard)
                    return ((Guard)row).getWarehouse().getWarehouseNumber();
                else if (row instanceof ShiftManager)
                    return ((ShiftManager)row).getExtraWage();
            case 11:
                if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedFrom()).getExtraWage();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedTo()).getAddress().getCity();
                }
                else if (row instanceof Vehicle)
                    return ((Vehicle)row).getProductionPlan().getType().getNumberOfSlots();
                else if (row instanceof Shift)
                    return ((Shift)row).getShiftManager().getExtraWage();
                else if (row instanceof Slot)
                    return ((Slot)row).getShift().getShiftManager().getHourlyWage();
                else if (row instanceof Guard)
                    return ((Guard)row).getWarehouse().getLocation().getCountry();  
            case 12:
                if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((Manufacturer)((Order<?,?>)row).getOrderedTo()).getName();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedTo()).getAddress().getStreet();
                }
                else if (row instanceof Vehicle)
                    return ((Vehicle)row).getOrder().getOrderNumber();
                else if (row instanceof Slot)
                    return ((Slot)row).getShift().getShiftManager().getExtraWage();
                else if (row instanceof Guard)
                    return ((Guard)row).getWarehouse().getLocation().getCity();  
            case 13:
                if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((Manufacturer)((Order<?,?>)row).getOrderedTo()).getAddress().getCountry();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedTo()).getAddress().getHouseNumber();
                }
                else if (row instanceof Slot)
                    return ((Slot)row).getPlan().getSerialNumber();
                else if (row instanceof Guard)
                    return ((Guard)row).getWarehouse().getLocation().getStreet();  
            case 14:
                if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((Manufacturer)((Order<?,?>)row).getOrderedTo()).getAddress().getCity();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedTo()).getAddress().getZipCode();
                }
                else if (row instanceof Slot)
                    return ((Slot)row).getPlan().getType().getSerialNumber();
                else if (row instanceof Guard)
                    return ((Guard)row).getWarehouse().getLocation().getHouseNumber();  
            case 15:
                if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((Manufacturer)((Order<?,?>)row).getOrderedTo()).getAddress().getStreet();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedTo()).getBirthday().getTime().toString();
                }
                else if (row instanceof Slot)
                    return ((Slot)row).getPlan().getType().getNumberOfSlots();
                else if (row instanceof Guard)
                    return ((Guard)row).getWarehouse().getLocation().getZipCode();  
            case 16:
                if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((Manufacturer)((Order<?,?>)row).getOrderedTo()).getAddress().getHouseNumber();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedTo()).getEmploymentDate().getTime().toString();
                }
                else if (row instanceof Guard)
                    return ((Guard)row).getWarehouse().getMaxPartsStored();  
            case 17:
                if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((Manufacturer)((Order<?,?>)row).getOrderedTo()).getAddress().getZipCode();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedTo()).getHourlyWage();
                }
               else if (row instanceof Guard)
                    return ((Guard)row).getWarehouse().getMaxVehiclesStored();  
            case 18:
                if (row instanceof Order<?,?>)
                {
                    if (((Order<?,?>)row).getOrderedFrom() instanceof ShiftManager && ((Order<?,?>)row).getOrderedTo() instanceof Manufacturer)
                       return ((Manufacturer)((Order<?,?>)row).getOrderedTo()).getProfitPercentage();
                    else if (((Order<?,?>)row).getOrderedFrom() instanceof Manufacturer && ((Order<?,?>)row).getOrderedTo() instanceof ShiftManager)
                       return ((ShiftManager)((Order<?,?>)row).getOrderedTo()).getExtraWage();
                }
               else if (row instanceof Guard)
                    return ((Guard)row).getWarehouse().getCurrentNumberOfParts();
            case 19:
                if (row instanceof Order<?,?>)
                    return ((Order<?,?>)row).getDueDate().getTime().toString();
        }
        return null;
      }
         catch (Exception e){
             return null;
         }
    }

    public void removeRow(int i) {
        data.remove(i);
        fireTableRowsDeleted(i, i);
    }
}
