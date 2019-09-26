/**
 * This class contains the database of the company
 */
package model;

import static controller.MainClass.readCSVFile;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import utils.Constants;
import utils.E_PartCategory;
import utils.E_SecretQuestion;
import utils.E_UserType;
import utils.E_VehicleType;
import java.io.Serializable;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author Java spring 2017
 *
 */
public class SysData implements Serializable{
    	private static final long serialVersionUID = 1L;
	/** SysData Singleton instance */
	private static SysData instance;
	/** Manufacturers list */
	private HashMap<String, Manufacturer> manufacturers;
	/** Orders list */
	private HashMap<Integer, Order<?,?>> orders;
	/** Part types list */
	private HashMap<Integer, PartType> parts;
	/** Production plans list */
	private HashMap<Integer, ProductionPlan> productionPlans;
	/** Production plan types list */
	private HashMap<Integer, ProductionPlanType> productionPlanTypes;
	/** Vehicle models list */
	private HashMap<String, VehicleModel> models;
	/** Vehicles list */
	private HashMap<String, Vehicle> vehicles;
	/** Warehouses list */
	private HashMap<Integer, Warehouse> warehouses;
	/** Work stations list */
	private HashMap<Integer, WorkStation> workStations;
	/** Shift list */
	private HashMap<Calendar, Shift> shifts;
	/** Employees list */
	private HashMap<String, AbstractEmployee> employees;
        /** Users list */
        private HashMap<String, User> users;
	/**
	 * SysData constructor
	 */
	private SysData() {
		manufacturers = new HashMap<String, Manufacturer>();
		orders = new HashMap<Integer, Order<?,?>>();
		parts = new HashMap<Integer, PartType>();
		productionPlans = new HashMap<Integer, ProductionPlan>();
		productionPlanTypes = new HashMap<Integer, ProductionPlanType>();
		models = new HashMap<String, VehicleModel>();
		vehicles = new HashMap<String, Vehicle>();
		warehouses = new HashMap<Integer, Warehouse>();
		workStations = new HashMap<Integer, WorkStation>();
		shifts = new HashMap<Calendar, Shift>();
		employees = new HashMap<String, AbstractEmployee>();
                users= new HashMap<String, User>();
	}
	/**
	 * Get the SysData instance
	 * @return Instance of the SysData
	 */
	protected static SysData getInstance() {
		if (instance == null)
			instance = new SysData();
		return instance;
	}
	/**
	 * @return the manufacturers
	 */
	protected Map<String, Manufacturer> getManufacturers() {
		//TODO Complete this method
		return Collections.unmodifiableMap(this.manufacturers);
	}
	/**
	 * @return the orders
	 */
	protected Map<Integer, Order<?, ?>> getOrders() {
		//TODO Complete this method
		return Collections.unmodifiableMap(this.orders);
	}
	/**
	 * @return the parts
	 */
	protected Map<Integer, PartType> getParts() {
		//TODO Complete this method
		return Collections.unmodifiableMap(this.parts);
	}
	/**
	 * @return the productionPlans
	 */
	protected Map<Integer, ProductionPlan> getProductionPlans() {
		//TODO Complete this method
		return Collections.unmodifiableMap(this.productionPlans);
	}
	/**
	 * @return the productionPlanTypes
	 */
	protected Map<Integer, ProductionPlanType> getProductionPlanTypes() {
		//TODO Complete this method
		return Collections.unmodifiableMap(this.productionPlanTypes);
	}
	/**
	 * @return the models
	 */
	protected Map<String, VehicleModel> getModels() {
		//TODO Complete this method
		return Collections.unmodifiableMap(this.models);
	}
	/**
	 * @return the vehicles
	 */
	protected Map<String, Vehicle> getVehicles() {
		//TODO Complete this method
		return Collections.unmodifiableMap(this.vehicles);
	}
	/**
	 * @return the warehouses
	 */
	protected Map<Integer, Warehouse> getWarehouses() {
		//TODO Complete this method
		return Collections.unmodifiableMap(this.warehouses);
	}
	/**
	 * @return the workStations
	 */
	protected Map<Integer, WorkStation> getWorkStations() {
		//TODO Complete this method
		return Collections.unmodifiableMap(this.workStations);
	}
	/**
	 * @return the shifts
	 */
	protected Map<Calendar, Shift> getShifts() {
		//TODO Complete this method
		return Collections.unmodifiableMap(this.shifts);
	}
	/**
	 * @return the employees
	 */
	protected Map<String, AbstractEmployee> getEmployees() {
		//TODO Complete this method
		return Collections.unmodifiableMap(this.employees);
	}
        /**
         * 
         * @return the users
         */
        protected Map<String, User> getUsers() {
		//TODO Complete this method
		return Collections.unmodifiableMap(this.users);
	}

	/**
	 * Adds manufacturer to the system only if it doesn't exist yet
	 * @param name Manufacturer name
	 * @param country Address country
	 * @param city Address city
	 * @param street Address street
	 * @param houseNumber Address house number
	 * @param zipCode Address ZIP code
	 * @param profitPercentage Manufacturer percentage of order price added as income
	 * @return True if added successfully
	 */
	protected boolean addManufacturer(String name, String country, String city, String street,
			int houseNumber, String zipCode, double profitPercentage) {
		if (manufacturers.containsKey(name)) return false;
		Address address = new Address(country, city, street, houseNumber, zipCode);
		Manufacturer manufacturer = new Manufacturer(name, address, profitPercentage);
		manufacturers.put(name, manufacturer);
		return true;
	}
	/**
	 * Adds warehouse to the system only if it doesn't exists yet
	 * @param warehouseNumber Warehouse serial number
	 * @param country Address country
	 * @param city Address city
	 * @param street Address street
	 * @param houseNumber Address house number
	 * @param zipCode Address ZIP code
	 * @param maxPartsStored Maximum number of parts stored in this warehouse
	 * @param maxVehiclesStored Maximum number of vehicles stored in this warehouse
	 * @return True if added successfully
	 */
	protected boolean addWarehouse(int warehouseNumber, String country, String city, String street,
			int houseNumber, String zipCode, int maxPartsStored, int maxVehiclesStored) {
		//TODO Complete this method
		if (warehouses.containsKey(warehouseNumber))
			return false;
		Address address = new Address(country, city, street, houseNumber, zipCode);
		Warehouse wh = new Warehouse(warehouseNumber, address, maxPartsStored, maxVehiclesStored);
		warehouses.put(warehouseNumber, wh);
		return true;
	}
	/**
	 * Adds production plan type to the system only if it doesn't exists yet
	 * @param serialNumber Production plan type serial number
	 * @param numberOfSlots Number of slots
	 * @return True if added successfully
	 */
	protected boolean addProductionPlanType(int serialNumber, int numberOfSlots) {
		//TODO Complete this method
		if (productionPlanTypes.containsKey(serialNumber))
			return false;
		ProductionPlanType ppt = new ProductionPlanType(serialNumber, numberOfSlots);
		productionPlanTypes.put(serialNumber, ppt);
		return true;
	}
	/**
	 * Adds production plan to the system only if it doesn't exists yet
	 * Don't forget to retrieve the Production plan type 
	 * @param serialNumber Production plan serial number
	 * @param typeSerialNumber Production plan type serial number, this production plan will be of this type
	 * @return True if added successfully
	 */
	protected boolean addProductionPlan(int serialNumber, int typeSerialNumber) {
		//TODO Complete this method
		if (productionPlans.containsKey(serialNumber))
			return false;
		ProductionPlanType ppt = productionPlanTypes.get(typeSerialNumber);
		if (ppt == null)
			return false;
		ProductionPlan pp = new ProductionPlan(serialNumber, ppt);
		productionPlans.put(serialNumber, pp);
		return true;
	}
	/**
	 * Adds Vehicle model to the system only if it doesn't exists yet
	 * Don't forget to retrieve the production plan type of this model
	 * @param productionPlanTypeSerial Serial number of the production plan needed to build this vehicle
	 * @param modelName Name of this model
	 * @param vehicleType Type of this model
	 * @param hp Model Horse power
	 * @param topSpeed Model top speed in KPH
	 * @param numOfSeats Number of seats in this model
	 * @param isAutomatic True if this model has an automatic gear box
	 * @param productionCost Cost of producing one vehicle
	 * @param enteredProduction When did this model entered production?
	 * @return True if added successfully
	 * @see E_VehicleType
	 */
	protected boolean addVehicleModel(int productionPlanTypeSerial, String modelName,
			E_VehicleType vehicleType, int hp, int topSpeed, int numOfSeats,
			boolean isAutomatic, double productionCost, Calendar enteredProduction) {
		//TODO Complete this method
		if (models.containsKey(modelName))
			return false;
		ProductionPlanType ppt = productionPlanTypes.get(productionPlanTypeSerial);
		if (ppt == null)
			return false;
		VehicleModel vm = new VehicleModel(ppt, modelName, vehicleType, hp, topSpeed, numOfSeats, isAutomatic, productionCost, enteredProduction);
		models.put(modelName, vm);
		return true;
	}
	/**
	 * Adds part type to the system only if it doesn't exists yet
	 * @param partNumber Part type serial number
	 * @param partName Name of the part
	 * @param category Category of the part
	 * @param productionCost Cost to produce this part
	 * @return True if added successfully
	 * @see E_PartCategory
	 */
	protected boolean addPartType(int partNumber, String partName, E_PartCategory category, double productionCost) {
		//TODO Complete this method
		if (parts.containsKey(partNumber))
			return false;
		PartType pt = new PartType(partNumber, partName, category, productionCost);
		parts.put(partNumber, pt);
		return true;
	}
	/**
	 * Adds order to the system only if it doesn't exists yet
	 * Don't forget to retrieve the manufacturer
	 * @param orderNumber Order number
	 * @param orderedFrom Ordering side
	 * @param orderedTo Receiving side
	 * @param dueDate When the order needs to be delivered
	 * @return True if added successfully
	 */
	protected boolean addOrder(int orderNumber, String orderedFrom, String orderedTo, Calendar dueDate) {
		//TODO Complete this method
		if (orders.containsKey(orderNumber))
			return false;
		if (manufacturers.containsKey(orderedFrom) && employees.containsKey(orderedTo)) {
			Manufacturer m = manufacturers.get(orderedFrom);
			AbstractEmployee ae = employees.get(orderedTo);
			Order<Manufacturer, AbstractEmployee> ord = new Order<Manufacturer, AbstractEmployee>(orderNumber, m, ae, dueDate);
			orders.put(orderNumber, ord);
			return true;
		}
		if (employees.containsKey(orderedFrom) && manufacturers.containsKey(orderedTo)) {
			AbstractEmployee ae = employees.get(orderedFrom);
			Manufacturer m = manufacturers.get(orderedTo);
			Order<AbstractEmployee, Manufacturer> ord = new Order<AbstractEmployee, Manufacturer>(orderNumber, ae, m, dueDate);
			orders.put(orderNumber, ord);
			return true;
		}
		return false;
	}
	/**
	 * Adds a vehicle to the system only if it doesn't exists yet
	 * Don't forget to retrieve the production plan
	 * This method is used for adding a new vehicle.
	 * A new vehicle can be added in 2 ways:
	 * - Producing it locally (production plan is needed, order will be -1)
	 * - Ordering it from a manufacturer (Order is needed, production plan will be -1)
	 * @param vin Vehicle identification number (Chassis number)
	 * @param modelName Name of vehicle model
	 * @param productionPlanSerial Serial number of production plan (-1 if in order)
	 * @param orderNumber Order number (-1 if in production plan)
	 * @return True if added successfully
	 */
	protected boolean addVehicle(String vin, String modelName, int productionPlanSerial, int orderNumber) {
		if (vehicles.containsKey(vin)) return false;
		VehicleModel model = models.get(modelName);
		if (model == null) return false;
		ProductionPlan pp = productionPlans.get(productionPlanSerial);
		Order<?, ?> o = orders.get(orderNumber);
		if (pp != null && o == null) {
			Vehicle v = new Vehicle(vin, model, pp);
			if (!pp.addVehicle(v)) return false;
			vehicles.put(vin, v);
			return true;
		}
		if (o != null && pp == null) {
			Vehicle v = new Vehicle(vin, model, o);
			if (!o.addVehicle(v)) return false;
			vehicles.put(vin, v);
			return true;
		}
		return false;
	}
	/**
	 * Adds a work station to the system
	 * @param stationNumber Work station number
	 * @param cat Part category of the work station
	 * @return True if added successfully
	 */
	protected boolean addWorkStation(int stationNumber, E_PartCategory cat) {
		//TODO Complete this method
		if (workStations.containsKey(stationNumber))
			return false;
		WorkStation ws = new WorkStation(stationNumber, cat);
		workStations.put(stationNumber, ws);
		return true;
	}
	/**
	 * Adds a new guard to the system
	 * @param id Guard id
	 * @param name Guard name
	 * @param country Country
	 * @param city City
	 * @param street Street name
	 * @param houseNumber House number
	 * @param zipCode Zip code
	 * @param birthday Date of birth
	 * @param employmentDate Employment date
	 * @param monthlySalary Monthly salary
	 * @param warehouseNumber Warehouse where he is working
	 * @return True if added successfully
	 */
	protected boolean addGuard(String id, String name, String country, String city, String street,
			int houseNumber, String zipCode, Calendar birthday, Calendar employmentDate,
			double monthlySalary, int warehouseNumber) {
		//TODO Complete this method
		if (employees.containsKey(id))
			return false;
		Address address = new Address(country, city, street, warehouseNumber, zipCode);
		Warehouse w = warehouses.get(warehouseNumber);
		if (w == null)
			return false;
		Guard g = new Guard(id, name, address, birthday, employmentDate, monthlySalary, w);
		employees.put(id, g);
		return true;
	}
	/**
	 * Adds a new shift manager
	 * @param id Shift manager id
	 * @param name Shift manager name
	 * @param country Country
	 * @param city City
	 * @param street Street name
	 * @param houseNumber House number
	 * @param zipCode Zip code
	 * @param birthday Date of birth
	 * @param employmentDate Employment date
	 * @param hourlyWage Wage per hour
	 * @param extraWage Extra wage added every month
	 * @return True if added successfully
	 */
	protected boolean addShiftManager(String id, String name, String country, String city, String street,
			int houseNumber, String zipCode, Calendar birthday, Calendar employmentDate,
			double hourlyWage, double extraWage) {
		if (employees.containsKey(id)) return false;
		Address address = new Address(country, city, street, houseNumber, zipCode);
		ShiftManager sm = new ShiftManager(id, name, address, birthday, employmentDate, hourlyWage, extraWage);
		employees.put(id, sm);
		return true;
	}
	/**
	 * Adds a new worker
	 * @param id Worker id
	 * @param name Worker name
	 * @param country Country
	 * @param city City
	 * @param street Street name
	 * @param houseNumber House number
	 * @param zipCode Zip code
	 * @param birthday Date of birth
	 * @param employmentDate Employment date
	 * @param hourlyWage Wage per hour
	 * @return True if added successfully
	 */
	protected boolean addWorker(String id, String name, String country, String city, String street,
			int houseNumber, String zipCode, Calendar birthday, Calendar employmentDate,
			double hourlyWage) {
		//TODO Complete this method
		if (employees.containsKey(id))
			return false;
		Address address = new Address(country, city, street, houseNumber, zipCode);
		Worker w = new Worker(id, name, address, birthday, employmentDate, hourlyWage);
		employees.put(id, w);
		return true;
	}
	/**
	 * Adds shift to the system
	 * @param startingTime Starting time
	 * @param ShiftManagerId Manager for this shift
	 * @return True if added successfully
	 */
	protected boolean addShift(Calendar startingTime, String ShiftManagerId) {
		//TODO Complete this method
		if (shifts.containsKey(startingTime))
			return false;
		AbstractEmployee sm = employees.get(ShiftManagerId);
		if (sm == null)
			return false;
		if (!(sm instanceof ShiftManager))
			return false;
		Shift s = new Shift(startingTime, (ShiftManager) sm);
		if (((ShiftManager) sm).addShift(s)) {
			shifts.put(startingTime, s);
			return true;
		}
		return false;
	}
	/**
	 * Add a slot
	 * You need to determine the shift according to the slot time
	 * @param startingTime
	 * @param productionPlanSerial
	 * @return True if added successfully
	 */
	protected boolean addSlot(Calendar startingTime, int productionPlanSerial) {
		//TODO Complete this method
		ProductionPlan pp = productionPlans.get(productionPlanSerial);
		if (pp == null)
			return false;
		if (pp.getSlots().containsKey(startingTime))
			return false;
		Shift sh = Queries.findShiftByTime(startingTime);
		if (sh == null)
			return false;
		if (sh.getSlots().containsKey(startingTime))
			return false;
		Slot sl = new Slot(startingTime, sh, pp);
		boolean flag = false;
		if (pp.addSlot(sl)) {
			flag = true;
			if (!sh.addSlot(sl)) {
				pp.removeSlot(sl);
				return false;
			}
		}
		return flag;
	}
        /**
         * Add a user
         */
        protected boolean addUser(String username,  String password, E_UserType type, E_SecretQuestion secretQuestion, String secretAnswer) {
		if (users.containsKey(username))
			return false;
		User user = new User(username, password, type, secretQuestion, secretAnswer);
		users.put(username, user);
		return true;
	}
	/**
	 * Remove a manufacturer from the system
	 * If this manufacturer has orders or there are part types that can be made by this manufacturer - don't remove it
	 * @param manufacturerName Manufacturer to remove
	 * @return True if removed successfully
	 */
	protected boolean removeManufacturer(String manufacturerName) {
		//TODO Complete this method
		Manufacturer m = manufacturers.get(manufacturerName);
		if (m == null)
			return false;
		for (Order<?, ?> ord : orders.values())
			if (ord.orderedFrom.equals(m) || ord.orderedTo.equals(m))
				return false;
		for (PartType pt : parts.values())
			if (pt.getManufacturers().contains(m))
				return false;
		manufacturers.remove(manufacturerName);
		return true;
	}
	/**
	 * Remove a warehouse from the system
	 * Only if it is empty and there are no guards
	 * @param warehouseNumber
	 * @return True if removed successfully
	 */
	protected boolean removeWarehouse(int warehouseNumber) {
		Warehouse w = warehouses.get(warehouseNumber);
		if (w == null) return false;
		for (AbstractEmployee e : employees.values())
			if (e instanceof Guard)
				if (((Guard)e).warehouse.equals(w)) return false;
		if (w.getParts().isEmpty() && w.getVehicles().isEmpty()) {
			warehouses.remove(warehouseNumber);
			return true;
		}
		return false;
	}
	/**
	 * Remove a production plan type
	 * Only if there are no Work stations, production plans and models
	 * @param serialNumber Serial number of the production plan type
	 * @return True if removed successfully
	 */
	protected boolean removeProductionPlanType(int serialNumber) {
		//TODO Complete this method
		ProductionPlanType ppt = productionPlanTypes.get(serialNumber);
		if (ppt == null)
			return false;
		if (ppt.getWorkStations().size() > 0)
			return false;
		for (ProductionPlan pp : productionPlans.values())
			if (pp.type.equals(ppt))
				return false;
		for (VehicleModel vm : models.values())
			if (vm.productionPlanType.equals(ppt))
				return false;
		productionPlanTypes.remove(serialNumber);
		return true;
	}
	/**
	 * Remove production plan
	 * Only if it has no vehicles and no slots
	 * @param serialNumber production plan serial number
	 * @return True if removed successfully
	 */
	protected boolean removeProductionPlan(int serialNumber) {
		//TODO Complete this method
		ProductionPlan pp = productionPlans.get(serialNumber);
		if (pp == null)
			return false;
		if (pp.getSlots().isEmpty() && pp.getVehicles().isEmpty()) {
			productionPlans.remove(serialNumber);
			return true;
		}
		return false;
	}
	/**
	 * Remove a model
	 * Only if there are no vehicle of this model and no manufacturer can produce it
	 * @param name Name of the model
	 * @return True if removed successfully
	 */
	protected boolean removeVehicleModel(String name) {
		//TODO Complete this method
		VehicleModel vm = models.get(name);
		if (vm == null)
			return false;
		for (Vehicle v : vehicles.values())
			if (v.model.equals(vm))
				return false;
		for (Manufacturer m : manufacturers.values())
			if (m.getProducedModels().contains(vm))
				return false;
		models.remove(name);		//XXX remove(vm) -> WRONG
		return true;
	}
	/**
	 * Remove part type
	 * Only if it is not in any model, order and warehouse
	 * @param partNumber
	 * @return True if removed successfully
	 */
	protected boolean removePartType(int partNumber) {
		//TODO Complete this method
		PartType pt = parts.get(partNumber);
		if (pt == null)
			return false;
		for (VehicleModel vm : models.values())
			if (vm.getRequiredParts().containsKey(pt))
				return false;
		for (Order<?, ?> ord : orders.values())
			if (ord.getParts().containsKey(pt))
				return false;
		for (Warehouse w : warehouses.values())
			if (w.getParts().containsKey(pt))
				return false;
		parts.remove(partNumber);
		return true;
	}
	/**
	 * REmove order
	 * Only if it has no vehicle and no parts
	 * @param orderNumber
	 * @return True if removed successfully
	 */
	protected boolean removeOrder(int orderNumber) {
		Order<? ,?> o = orders.get(orderNumber);
		if (o == null) return false;
		if (o.getVehicles().isEmpty() && o.getParts().isEmpty()) {
			orders.remove(orderNumber);
			return true;
		}
		return false;
	}
	/**
	 * Remove a vehicle
	 * Only if it is not in any warehouse;
	 * You must also remove it from it's order or production plan
         * Removes the slots that were used for this vehicle both in production plan and in relevant shifts
	 * @param vin
	 * @return True if removed successfully
	 */
	protected boolean removeVehicle(String vin) {
		//TODO Complete this method
		Vehicle v = vehicles.get(vin);
                TreeMap<Calendar,Slot> sortedSlots=new TreeMap<>();
                if (v.productionPlan!=null)
                sortedSlots.putAll(v.productionPlan.getSlots());
                Slot s=null;
		if (v == null)
			return false;
		for (Warehouse w : warehouses.values())
			if (w.getVehicles().contains(v))
				return false;
		if (v.order == null)
                {
                    ProductionPlan pp=v.productionPlan;
	            v.productionPlan.removeVehicle(v);
                    for (int i=0;i<pp.getType().getNumberOfSlots();i++)
                    {
                        s=sortedSlots.lastEntry().getValue();
                        pp.removeSlot(s);
                        Shift sh=Queries.findShiftByTime(s.startingTime);
                        sh.removeSlot(s);
                        sortedSlots.remove(s.startingTime);
                    }
                }
		if (v.productionPlan == null)
			v.order.removeVehicle(v);
		vehicles.remove(vin);
		return true;
	}
        /* v.productionPlan.removeVehicle(v);
                        for (int i=0;i<v.productionPlan.getType().getNumberOfSlots();i++){
                            c=sortedSlots.lastKey();
                            sortedSlots.remove(c);
                 }
                        for (Calendar cal: v.productionPlan.getSlots().keySet())
                            if (!sortedSlots.containsKey(cal))
                                v.productionPlan.getSlots().remove(cal);
                       */
	/**
	 * Remove work station
	 * Only if no workers can work on it and it is not in any production plan type
	 * @param stationNumber
	 * @return True if removed successfully
	 */
	protected boolean removeWorkStation(int stationNumber) {
		//TODO Complete this method
		WorkStation ws = workStations.get(stationNumber);
		if (ws == null)
			return false;
		for (AbstractEmployee ae : employees.values())
			if (ae instanceof Worker && ((Worker) ae).getWorkStations().contains(ws))
				return false;
		for (ProductionPlanType ppt : productionPlanTypes.values())
			if (ppt.getWorkStations().contains(ws))
				return false;
		workStations.remove(stationNumber);		//XXX remove(ws) -> WRONG
		return true;
	}
	/**
	 * Remove an employee
	 * Needs to work for any sub-class
	 * If he has shifts (HourlyEmployee), don't remove it
	 * @param id
	 * @return True if removed successfully
	 */
	protected boolean removeEmployee(String id) {
		AbstractEmployee emp = employees.get(id);
		if (emp == null) return false;
		if (emp instanceof HourlyEmployee)
			if (!((HourlyEmployee)emp).getShifts().isEmpty())
				return false;
		employees.remove(id);
		return true;
	}
	/**
	 * Remove shift
	 * If a worker is working in this shift, don't remove it
	 * When removing a shift, don't forget to remove it from the shift manager, and remove all slots from production plans
	 * @param startingTime
	 * @return True if removed successfully
	 */
	protected boolean removeShift(Calendar startingTime) {
		//TODO Complete this method
		Shift sh = shifts.get(startingTime);
		if (sh == null)
			return false;
		for (AbstractEmployee ae : employees.values())
			if (ae instanceof Worker && ((Worker) ae).getShifts().contains(sh))
				return false;
		sh.shiftManager.removeShift(sh);
		for (Slot sl : sh.getSlots().values())
			sl.plan.removeSlot(sl);
		shifts.remove(startingTime);
		return true;
	}
        /**
         * remove Slot
         * @param startingTime
         * @return 
         */
        protected boolean removeSlot(Calendar startingTime) {
		Shift sh = Queries.findShiftByTime(startingTime);
                if (sh==null) return false;
                Slot s = sh.getSlots().get(startingTime);
		if (s == null)
			return false;
                if (sh.removeSlot(s))
                    s.getPlan().removeSlot(s);
		return true;
	}
        /**
         * remove User
         * @param username
         * @return 
         */
         protected boolean removeUser(String username) {
		User user = users.get(username);
		if (user == null)
			return false;
		users.remove(username);
		return true;
	}
         /**
	 * Updates manufacturer in the system
	 * @param name Manufacturer name
	 * @param country Address country
	 * @param city Address city
	 * @param street Address street
	 * @param houseNumber Address house number
	 * @param zipCode Address ZIP code
	 * @param profitPercentage Manufacturer percentage of order price added as income
	 * @return True if added successfully
	 */
	protected boolean updateManufacturer(String name, String country, String city, String street,
			int houseNumber, String zipCode, double profitPercentage) {
		Address address = new Address(country, city, street, houseNumber, zipCode);
		Manufacturer manufacturer = new Manufacturer(name, address, profitPercentage);
                Set<VehicleModel> vm=manufacturers.get(name).getProducedModels();
                Set<E_PartCategory> e=manufacturers.get(name).getProducedPartTypes();
		manufacturers.put(name, manufacturer);
                for (VehicleModel v: vm)
                    manufacturer.addProducedModel(v);
                for (E_PartCategory en: e)
                    manufacturer.addProducedPartType(en);
                for (Order order: orders.values())
                {
                    if (order.getOrderedFrom() instanceof Manufacturer && order.getOrderedTo() instanceof ShiftManager)
                    {
                        if (((Manufacturer)order.getOrderedFrom()).getName().equals(name))
                            updateOrder(order.getOrderNumber(), name , ((ShiftManager)order.getOrderedTo()).getId(), order.getDueDate());
                    }
                    else if (order.getOrderedFrom() instanceof ShiftManager && order.getOrderedTo() instanceof Manufacturer)
                    {
                        if (((Manufacturer)order.getOrderedTo()).getName().equals(name))
                            updateOrder(order.getOrderNumber(),((ShiftManager)order.getOrderedFrom()).getId() , name , order.getDueDate());
                    }
                }
                boolean bool=false;
                int count=0;
                while (bool==false){
                for (PartType pt: parts.values()){
                    for (Manufacturer m: pt.getManufacturers()){
                        if (m.getName().equals(name)){
                            if (!m.equals(manufacturer))
                                 count++;
                            pt.removeManufacturer(m);
                            pt.addManufacturer(manufacturer);}}}
                if (count==0)
                    bool=true;
                  count=0;
                }
		return true;
	}
	/**
	 * updates warehouse in the system
	 * @param warehouseNumber Warehouse serial number
	 * @param country Address country
	 * @param city Address city
	 * @param street Address street
	 * @param houseNumber Address house number
	 * @param zipCode Address ZIP code
	 * @param maxPartsStored Maximum number of parts stored in this warehouse
	 * @param maxVehiclesStored Maximum number of vehicles stored in this warehouse
	 * @return True if added successfully
	 */
	protected boolean updateWarehouse(int warehouseNumber, String country, String city, String street,
			int houseNumber, String zipCode, int maxPartsStored, int maxVehiclesStored) {
		Address address = new Address(country, city, street, houseNumber, zipCode);
		Warehouse wh = new Warehouse(warehouseNumber, address, maxPartsStored, maxVehiclesStored);
                Map<PartType,Integer> pts=warehouses.get(warehouseNumber).getParts();
                Set<Vehicle> vs=warehouses.get(warehouseNumber).getVehicles();
		warehouses.put(warehouseNumber, wh);
                for (Map.Entry<PartType,Integer> p:pts.entrySet() )
                    wh.addPartType(p.getKey(),p.getValue());
                for (Vehicle v: vs)
                    wh.addVehicle(v);
                for (AbstractEmployee ae: employees.values())
                    if (ae instanceof Guard)
                        if (((Guard) ae).getWarehouse().getWarehouseNumber()==warehouseNumber)
                             updateGuard(ae.getId(), ae.getName(), ae.getAddress().getCountry(), ae.getAddress().getCity(), ae.getAddress().getStreet(),
			ae.getAddress().getHouseNumber(), ae.getAddress().getZipCode(), ae.getBirthday(), ae.getEmploymentDate(),
			((Guard) ae).getMonthlySalary(), warehouseNumber);
		return true;
	}
	/**
	 * updates production plan type in the system
	 * @param serialNumber Production plan type serial number
	 * @param numberOfSlots Number of slots
	 * @return True if added successfully
	 */
	protected boolean updateProductionPlanType(int serialNumber, int numberOfSlots) {
		ProductionPlanType ppt = new ProductionPlanType(serialNumber, numberOfSlots);
                List<WorkStation> ws=productionPlanTypes.get(serialNumber).getWorkStations();
		productionPlanTypes.put(serialNumber, ppt);
                for (WorkStation w: ws)
                    ppt.addWorkStation(w, 0);
                for (ProductionPlan pp: productionPlans.values())
                  if (pp.getType().getSerialNumber()==serialNumber)
                    updateProductionPlan(pp.getSerialNumber(), serialNumber);
                for (VehicleModel vm: models.values())
                    if (vm.getProductionPlanType().getSerialNumber()==serialNumber)
                        updateVehicleModel(serialNumber,vm.getModelName(),vm.getVehicleType(),vm.getHp(),vm.getTopSpeed(),vm.getNumOfSeats(),vm.isIsAutomatic(),vm.getProductionCost(),vm.getEnteredProduction());
		return true;
	}
	/**
	 * updates production plan in the system
	 * Don't forget to retrieve the Production plan type 
	 * @param serialNumber Production plan serial number
	 * @param typeSerialNumber Production plan type serial number, this production plan will be of this type
	 * @return True if added successfully
	 */
	protected boolean updateProductionPlan(int serialNumber, int typeSerialNumber) {
		ProductionPlanType ppt = productionPlanTypes.get(typeSerialNumber);
		if (ppt == null)
			return false;
		ProductionPlan pp = new ProductionPlan(serialNumber, ppt);
                Set<Vehicle> vhs=productionPlans.get(serialNumber).getVehicles();
                Map<Calendar,Slot> slots=productionPlans.get(serialNumber).getSlots();
                TreeMap<Calendar,Slot> sortedSlots=new TreeMap<>();
                sortedSlots.putAll(slots);
		productionPlans.put(serialNumber, pp);
                for (Vehicle v: vhs)
                    pp.addVehicle(v);
                for (Map.Entry<Calendar,Slot> sl:slots.entrySet() )
                    pp.addSlot(sl.getValue());
                for (Vehicle vs: vehicles.values())
                    if (vs.getProductionPlan()!=null && vs.getProductionPlan().getSerialNumber()==serialNumber)
                    {
                        updateVehicleModel(ppt.getSerialNumber(),vs.getModel().getModelName(),vs.getModel().getVehicleType(),vs.getModel().getHp(),vs.getModel().getTopSpeed(),vs.getModel().getNumOfSeats(),vs.getModel().isIsAutomatic(),vs.getModel().getProductionCost(),vs.getModel().getEnteredProduction());
                        updateVehicle(vs.getVin(), vs.getModel().getModelName(), serialNumber, -1);
                    }
                for (Shift sh: shifts.values())
                    for (Slot s:sh.getSlots().values())
                        if (s.getPlan().getSerialNumber()==serialNumber)
                            updateSlot(s.getStartingTime(),serialNumber);
		return true;
	}
	/**
	 * updates Vehicle model in the system
	 * Don't forget to retrieve the production plan type of this model
	 * @param productionPlanTypeSerial Serial number of the production plan needed to build this vehicle
	 * @param modelName Name of this model
	 * @param vehicleType Type of this model
	 * @param hp Model Horse power
	 * @param topSpeed Model top speed in KPH
	 * @param numOfSeats Number of seats in this model
	 * @param isAutomatic True if this model has an automatic gear box
	 * @param productionCost Cost of producing one vehicle
	 * @param enteredProduction When did this model entered production?
	 * @return True if added successfully
	 * @see E_VehicleType
	 */
	protected boolean updateVehicleModel(int productionPlanTypeSerial, String modelName,
			E_VehicleType vehicleType, int hp, int topSpeed, int numOfSeats,
			boolean isAutomatic, double productionCost, Calendar enteredProduction) {
		ProductionPlanType ppt = productionPlanTypes.get(productionPlanTypeSerial);
		if (ppt == null)
			return false;
		VehicleModel vm = new VehicleModel(ppt, modelName, vehicleType, hp, topSpeed, numOfSeats, isAutomatic, productionCost, enteredProduction);
                Map<PartType,Integer> pts=models.get(modelName).getRequiredParts();
		models.put(modelName, vm);
                 for (Map.Entry<PartType,Integer> p:pts.entrySet() )
                    vm.addPartType(p.getKey(),p.getValue());
                 for (Vehicle vehicle: vehicles.values())
                     if (vehicle.model.getModelName().equals(modelName))
                     {
                         if (vehicle.getProductionPlan()!=null && vehicle.getOrder()==null)
                            updateVehicle(vehicle.getVin(), modelName, vehicle.getProductionPlan().getSerialNumber(), -1);
                         else if (vehicle.getProductionPlan()==null && vehicle.getOrder()!=null)
                             updateVehicle(vehicle.getVin(), modelName, -1, vehicle.getOrder().getOrderNumber());
                     }
                 boolean bool=false;
                 int count=0;
                 while (bool==false){
                 for (Manufacturer m: manufacturers.values()){
                     for(VehicleModel v:m.getProducedModels()){
                         if (v.getModelName().equals(modelName)){
                             if (!v.equals(vm))
                                 count++;
                             m.removeProducedModel(v);
                             m.addProducedModel(vm);
                             break;}}}
                 if (count==0)
                    bool=true;
                  count=0;
                 }
		 return true;
	}
	/**
	 * updates part type in the system
	 * @param partNumber Part type serial number
	 * @param partName Name of the part
	 * @param category Category of the part
	 * @param productionCost Cost to produce this part
	 * @return True if added successfully
	 * @see E_PartCategory
	 */
	protected boolean updatePartType(int partNumber, String partName, E_PartCategory category, double productionCost) {
		PartType pt = new PartType(partNumber, partName, category, productionCost);
                Set<Manufacturer> manu=parts.get(partNumber).getManufacturers();
		parts.put(partNumber, pt);
                for (Manufacturer m: manu)
                    pt.addManufacturer(m);
                boolean bool=false;
                 int count=0;
                 while (bool==false){
                for (Warehouse w: warehouses.values()){
                    for (Map.Entry<PartType,Integer> part: w.getParts().entrySet()){
                        if (part.getKey().getPartNumber()==partNumber)
                        {
                            if (!part.getKey().equals(pt))
                                count++;
                            w.removePartType(part.getKey(), part.getValue());
                            w.addPartType(pt, part.getValue());
                            break;}}}
                    if (count==0)
                    bool=true;
                  count=0;
                 }
                 bool=false;
                count=0;
                while (bool==false){
                for (Order<?,?> o: orders.values()){
                    for (Map.Entry<PartType,Integer> part:o.getParts().entrySet()){
                        if (part.getKey().getPartNumber()==partNumber)
                        {
                            if (!part.getKey().equals(pt))
                                count++;
                            o.removePart(part.getKey(), part.getValue());
                            o.addPart(pt, part.getValue());
                            break;}}}
                    if (count==0)
                     bool=true;
                  count=0;
                }
                bool=false;
                count=0;
                while (bool==false){
                for (VehicleModel vm: models.values()){
                    for (Map.Entry<PartType,Integer> part: vm.getRequiredParts().entrySet()){
                        if (part.getKey().getPartNumber()==partNumber)
                        {
                            if (!part.getKey().equals(pt))
                                count++;
                            vm.removePartType(part.getKey(), part.getValue());
                            vm.addPartType(pt, part.getValue());
                            break;}}}
                if (count==0)
                    bool=true;
                  count=0;
                }
		return true;
	}
	/**
	 * updates order in the system
	 * Don't forget to retrieve the manufacturer
	 * @param orderNumber Order number
	 * @param orderedFrom Ordering side
	 * @param orderedTo Receiving side
	 * @param dueDate When the order needs to be delivered
	 * @return True if added successfully
	 */
	protected boolean updateOrder(int orderNumber, String orderedFrom, String orderedTo, Calendar dueDate) {  
		if (manufacturers.containsKey(orderedFrom) && employees.containsKey(orderedTo)) {
			Manufacturer m = manufacturers.get(orderedFrom);
			AbstractEmployee ae = employees.get(orderedTo);
			Order<Manufacturer, AbstractEmployee> ord = new Order<Manufacturer, AbstractEmployee>(orderNumber, m, ae, dueDate);
                        Map<PartType,Integer> parts=orders.get(orderNumber).getParts();
                        Set<Vehicle> vhs=orders.get(orderNumber).getVehicles();
			orders.put(orderNumber, ord);
                        for (Map.Entry<PartType,Integer> p:parts.entrySet() )
                        ord.addPart(p.getKey(),p.getValue());
                        for (Vehicle v:vhs)
                            ord.addVehicle(v);
                        for (Vehicle vs: vehicles.values())
                          if (vs.getOrder()!=null && vs.getOrder().getOrderNumber()==orderNumber)
                           updateVehicle(vs.getVin(), vs.getModel().getModelName(), -1, orderNumber);
			return true;
		}
		if (employees.containsKey(orderedFrom) && manufacturers.containsKey(orderedTo)) {
			AbstractEmployee ae = employees.get(orderedFrom);
			Manufacturer m = manufacturers.get(orderedTo);
			Order<AbstractEmployee, Manufacturer> ord = new Order<AbstractEmployee, Manufacturer>(orderNumber, ae, m, dueDate);
                         Map<PartType,Integer> parts=orders.get(orderNumber).getParts();
                         Set<Vehicle> vhs=orders.get(orderNumber).getVehicles();
			orders.put(orderNumber, ord);
                        for (Map.Entry<PartType,Integer> p:parts.entrySet() )
                        ord.addPart(p.getKey(),p.getValue());
                        for (Vehicle v:vhs)
                           ord.addVehicle(v);
                        for (Vehicle vs: vehicles.values())
                        if (vs.getOrder()!=null && vs.getOrder().getOrderNumber()==orderNumber)
                        updateVehicle(vs.getVin(), vs.getModel().getModelName(), -1, orderNumber);
			return true;
		}
		return false;
	}
	/**
	 * updates a vehicle in the system
	 * Don't forget to retrieve the production plan
	 * This method is used for adding a new vehicle.
	 * A new vehicle can be added in 2 ways:
	 * - Producing it locally (production plan is needed, order will be -1)
	 * - Ordering it from a manufacturer (Order is needed, production plan will be -1)
	 * @param vin Vehicle identification number (Chassis number)
	 * @param modelName Name of vehicle model
	 * @param productionPlanSerial Serial number of production plan (-1 if in order)
	 * @param orderNumber Order number (-1 if in production plan)
	 * @return True if added successfully
	 */
	protected boolean updateVehicle(String vin, String modelName, int productionPlanSerial, int orderNumber) {
		boolean bool=false;
                 int count=0;
                VehicleModel model = models.get(modelName);
		if (model == null) return false;
		ProductionPlan pp = productionPlans.get(productionPlanSerial);
		Order<?, ?> o = orders.get(orderNumber);
		if (pp != null && o == null) {
                        Vehicle vehicle=vehicles.get(vin);
                        pp.removeVehicle(vehicle);
			Vehicle v = new Vehicle(vin, model, pp);
			if (!pp.addVehicle(v)) return false;
			vehicles.put(vin, v);
                        while (bool==false){
                        for(Order<?,?> order: orders.values()){
                            for (Vehicle vh: order.getVehicles()){
                                if (vh.getVin().equals(vin))
                                {
                                    if (!vh.equals(v))
                                        count++;
                                    order.removeVehicle(vh);
                                    order.addVehicle(vh);
                                    break;}}}
                        if (count==0)
                           bool=true;
                          count=0;
                        }
                        bool=false;
                        count=0;
                        while (bool==false){
                        for(ProductionPlan p:productionPlans.values()){
                            for (Vehicle vh: p.getVehicles()){
                                if (vh.getVin().equals(vin))
                                {
                                    if (!vh.equals(v))
                                        count++;
                                    p.removeVehicle(vh);
                                    p.addVehicle(vh);
                                    break;}}}
                        if (count==0)
                           bool=true;
                          count=0;
                        }
                        bool=false;
                        count=0;
                        while (bool==false){
                        for(Warehouse w: warehouses.values()){
                            for (Vehicle vh: w.getVehicles()){
                                if (vh.getVin().equals(vin))
                                {
                                    if (!vh.equals(v))
                                        count++;
                                    w.removeVehicle(vh);
                                    w.addVehicle(vh);
                                    break;}}}
                        if (count==0)
                           bool=true;
                          count=0;
                        }
			return true;
		}
		if (o != null && pp == null) {
                        Vehicle vehicle=vehicles.get(vin);
                        o.removeVehicle(vehicle);
			Vehicle v = new Vehicle(vin, model, o);
			if (!o.addVehicle(v)) return false;
			vehicles.put(vin, v);
                        while (bool==false){
                        for(Order<?,?> order: orders.values()){
                            for (Vehicle vh: order.getVehicles()){
                                if (vh.getVin().equals(vin))
                                {
                                    if (!vh.equals(v))
                                        count++;
                                    order.removeVehicle(vh);
                                    order.addVehicle(vh);
                                    break;}}}
                        if (count==0)
                           bool=true;
                          count=0;
                        }
                        bool=false;
                        count=0;
                        while (bool==false){
                        for(ProductionPlan p:productionPlans.values()){
                            for (Vehicle vh: p.getVehicles()){
                                if (vh.getVin().equals(vin))
                                {
                                    if (!vh.equals(v))
                                        count++;
                                    p.removeVehicle(vh);
                                    p.addVehicle(vh);
                                    break;}}}
                        if (count==0)
                           bool=true;
                          count=0;
                        }
                        bool=false;
                        count=0;
                        while (bool==false){
                        for(Warehouse w: warehouses.values()){
                            for (Vehicle vh: w.getVehicles()){
                                if (vh.getVin().equals(vin))
                                {
                                    if (!vh.equals(v))
                                        count++;
                                    w.removeVehicle(vh);
                                    w.addVehicle(vh);
                                    break;}}}
                        if (count==0)
                           bool=true;
                          count=0;
                        }
			return true;
		}
		return false;
	}      
	/**
	 * updates a work station in the system
	 * @param stationNumber Work station number
	 * @param cat Part category of the work station
	 * @return True if added successfully
	 */
	protected boolean updateWorkStation(int stationNumber, E_PartCategory cat) {
		boolean bool=false;
                int count=0;
                WorkStation ws = new WorkStation(stationNumber, cat);
		workStations.put(stationNumber, ws);
                while (bool==false){
                for (ProductionPlanType ppt: productionPlanTypes.values()){
                    for (WorkStation w: ppt.getWorkStations()){
                        if (w.getStationNumber()==stationNumber){
                            if (!w.equals(ws))
                                 count++;
                            ppt.removeWorkStation(w);
                            ppt.addWorkStation(ws, 0);
                            break;}}}
                       
                if (count==0)
                   bool=true;
                 count=0;
                }
                bool=false;
                count=0;
                while (bool==false){
                for (AbstractEmployee ae:employees.values()){
                    if (ae instanceof Worker){
                        for (WorkStation w:((Worker)ae).getWorkStations()){
                            if (w.getStationNumber()==stationNumber)
                            {
                                if (!w.equals(ws))
                                    count++;
                                ((Worker) ae).removeWorkStation(w);
                                ((Worker) ae).addWorkStation(ws);
                                break;}}}}
                            
                if (count==0)
                   bool=true;
                 count=0;
                }
		return true;
	}
	/**
	 * updates a guard in the system
	 * @param id Guard id
	 * @param name Guard name
	 * @param country Country
	 * @param city City
	 * @param street Street name
	 * @param houseNumber House number
	 * @param zipCode Zip code
	 * @param birthday Date of birth
	 * @param employmentDate Employment date
	 * @param monthlySalary Monthly salary
	 * @param warehouseNumber Warehouse where he is working
	 * @return True if added successfully
	 */
	protected boolean updateGuard(String id, String name, String country, String city, String street,
			int houseNumber, String zipCode, Calendar birthday, Calendar employmentDate,
			double monthlySalary, int warehouseNumber) {
		Address address = new Address(country, city, street, houseNumber, zipCode);
		Warehouse w = warehouses.get(warehouseNumber);
		if (w == null)
			return false;
		Guard g = new Guard(id, name, address, birthday, employmentDate, monthlySalary, w);
		employees.put(id, g);
		return true;
	}
	/**
	 * updates a shift manager
	 * @param id Shift manager id
	 * @param name Shift manager name
	 * @param country Country
	 * @param city City
	 * @param street Street name
	 * @param houseNumber House number
	 * @param zipCode Zip code
	 * @param birthday Date of birth
	 * @param employmentDate Employment date
	 * @param hourlyWage Wage per hour
	 * @param extraWage Extra wage added every month
	 * @return True if added successfully
	 */
	protected boolean updateShiftManager(String id, String name, String country, String city, String street,
			int houseNumber, String zipCode, Calendar birthday, Calendar employmentDate,
			double hourlyWage, double extraWage) {
		Address address = new Address(country, city, street, houseNumber, zipCode);
		ShiftManager sm = new ShiftManager(id, name, address, birthday, employmentDate, hourlyWage, extraWage);
                Set<Shift> sh=((ShiftManager)employees.get(id)).getShifts();
                TreeSet<Shift> sortedShifts=new TreeSet<>();
                sortedShifts.addAll(sh);
		employees.put(id, sm);
                for (Shift s: sh){
                    sm.addShift(s);
                }
                for (Order order: orders.values())
                {
                    
                    if (order.getOrderedFrom() instanceof ShiftManager && order.getOrderedTo() instanceof Manufacturer)
                    {
                        
                        if (((ShiftManager)order.getOrderedFrom()).getId().equals(id))
                            updateOrder(order.getOrderNumber(), id , ((Manufacturer)order.getOrderedTo()).getName(), order.getDueDate());
                    }
                  else  if (order.getOrderedFrom() instanceof Manufacturer && order.getOrderedTo() instanceof ShiftManager)
                    {
                        if (((ShiftManager)order.getOrderedTo()).getId().equals(id))
                            updateOrder(order.getOrderNumber(),((Manufacturer)order.getOrderedFrom()).getName() , id , order.getDueDate());
                    }
                }
                for (Shift s: shifts.values())
                    if (s.getShiftManager().getId().equals(id)){
                        updateShift(s.getStartingTime(), id);
                    }
                 
		return true;
	}
	/**
	 * updates a worker
	 * @param id Worker id
	 * @param name Worker name
	 * @param country Country
	 * @param city City
	 * @param street Street name
	 * @param houseNumber House number
	 * @param zipCode Zip code
	 * @param birthday Date of birth
	 * @param employmentDate Employment date
	 * @param hourlyWage Wage per hour
	 * @return True if added successfully
	 */
	protected boolean updateWorker(String id, String name, String country, String city, String street,
			int houseNumber, String zipCode, Calendar birthday, Calendar employmentDate,
			double hourlyWage) {
		Address address = new Address(country, city, street, houseNumber, zipCode);
		Worker w = new Worker(id, name, address, birthday, employmentDate, hourlyWage);
                Set<WorkStation> workstations=((Worker)employees.get(id)).getWorkStations();
                Set<Shift> shifts=((Worker)employees.get(id)).getShifts();
                TreeSet<Shift> sortedShifts=new TreeSet<>();
                sortedShifts.addAll(shifts);
		employees.put(id, w);
                for (WorkStation ws: workstations)
                    w.addWorkStation(ws);
                for (Shift s: shifts){
                    w.addShift(s);
                }
		return true;
	}
	/**
	 * update shift in the system
	 * @param startingTime Starting time
	 * @param ShiftManagerId Manager for this shift
	 * @return True if added successfully
	 */
	protected boolean updateShift(Calendar startingTime, String ShiftManagerId) {
		AbstractEmployee sm = employees.get(ShiftManagerId);
		if (sm == null)
			return false;
		if (!(sm instanceof ShiftManager))
			return false;
		Shift s = new Shift(startingTime, (ShiftManager) sm);
                ((ShiftManager) sm).removeShift(s);
                Map<Calendar,Slot> slots=shifts.get(startingTime).getSlots();
                TreeMap<Calendar,Slot> sortedSlots=new TreeMap<>();
                sortedSlots.putAll(slots);
		if (((ShiftManager) sm).addShift(s)) {
			shifts.put(startingTime, s);
                for (Map.Entry<Calendar,Slot> sl:slots.entrySet() )
                    s.addSlot(sl.getValue());
                for (Shift sh: shifts.values())
                    for (Slot slot:sh.getSlots().values())
                        if (slot.getShift().getStartingTime().equals(startingTime))
                            updateSlot(startingTime,slot.getPlan().getSerialNumber());
                for (AbstractEmployee ae: employees.values())
                    if (ae instanceof ShiftManager)
                        if (((ShiftManager) ae).getShifts().contains(s) && !ae.getId().equals(ShiftManagerId))
                            ((ShiftManager) ae).removeShift(s);
                return true;
                }
		return false;
	}
	/**
	 * update a slot
	 * You need to determine the shift according to the slot time
	 * @param startingTime
	 * @param productionPlanSerial
	 * @return True if added successfully
	 */
	protected boolean updateSlot(Calendar startingTime, int productionPlanSerial) {
		ProductionPlan pp = productionPlans.get(productionPlanSerial);
		if (pp == null)
			return false;
		Shift sh = Queries.findShiftByTime(startingTime);
		if (sh == null)
			return false;
		Slot sl = new Slot(startingTime, sh, pp);
		boolean flag = false;
		if (pp.updateSlot(sl)) {
			flag = true;
			if (!sh.updateSlot(sl)) {
				pp.removeSlot(sl);
				return false;
			}
		}
		return flag;
	}
        /**
         * updates a user in the system
         * @param username
         * @param password
         * @param type
         * @param secretQuestion
         * @param secretAnswer
         * @return 
         */
         protected boolean updateUser(String username,  String password, E_UserType type, E_SecretQuestion secretQuestion, String secretAnswer) {
		User user = new User(username, password, type, secretQuestion, secretAnswer);
		users.put(username, user);
		return true;
	}
         /**
	 * This method will export the data to .ser file
	 * @param fileName, create .ser with given informative name
	 * @param instance, our database
	 */
         protected boolean serialize(String fileName) throws IOException
         {
             try
             {
                 OutputStream fileOut= new FileOutputStream(fileName);
                 ObjectOutputStream output = new ObjectOutputStream(fileOut);
                 output.writeObject(instance);
                 fileOut.close();
                 output.close();
                 System.out.println("Serialized data is saved in project's folder as data.ser");
                 return true;
             }
             catch (IOException i){
                 return false;
             }
         }
         /**
          * This method will import the data from .ser file
          * @param fileName
          * @return
          * @throws IOException 
          */
         protected boolean deserialize(String fileName) throws IOException
         {
          try
          {
              InputStream fileIn= new FileInputStream(fileName);
              ObjectInputStream in= new ObjectInputStream(fileIn);
              instance =(SysData)in.readObject();
              manufacturers = instance.manufacturers;
		orders = instance.orders;
		parts = instance.parts;
		productionPlans = instance.productionPlans;
		productionPlanTypes = instance.productionPlanTypes;
		models = instance.models;
		vehicles = instance.vehicles;
		warehouses = instance.warehouses;
		workStations = instance.workStations;
		shifts = instance.shifts;
		employees = instance.employees;
                users = instance.users;
              in.close();
              fileIn.close();
              System.out.println("Deserialized "+ fileName + " successfully");
              return true; 
          }
          catch (FileNotFoundException fnf) {
            try {
                  OutputStream fileOut = new FileOutputStream(fileName);
                  ObjectOutputStream out= new ObjectOutputStream(fileOut);
                  System.out.println("Reading CSV File");
                  readCSVFile(Constants.CSV_FileName);
                  out.writeObject(instance);
                  fileOut.close();
                  out.close();
                  System.out.println("Read CSV successfully!");
                  return false;
                }
            catch (IOException i) {
              return false;
          }
          }
          catch (ClassNotFoundException | ClassCastException c) {
              return false;
          }
         }
}
