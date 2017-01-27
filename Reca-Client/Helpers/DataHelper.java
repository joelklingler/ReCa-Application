package Helpers;

import java.rmi.RemoteException;
import java.util.Calendar;

import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer;
import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Invoice;
import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Rental;
import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle;
import org.tempuri.ICustomerServiceProxy;
import org.tempuri.IFinanceServiceProxy;
import org.tempuri.IRentalServiceProxy;
import org.tempuri.IVehicleServiceProxy;
import org.tempuri.VehicleServiceLocator;

public class DataHelper {
	private ICustomerServiceProxy customerService;
	private IVehicleServiceProxy vehicleService;
	private IFinanceServiceProxy invoiceService;
	private IRentalServiceProxy rentalervice;

	public DataHelper() {
		customerService = new ICustomerServiceProxy();
		vehicleService = new IVehicleServiceProxy();
		invoiceService = new IFinanceServiceProxy();
		rentalervice = new IRentalServiceProxy();
	}
	
	public Customer[] loadCustomers(){
		try {
			return customerService.getAllCustomers();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public Customer loadCustomer(int id){
		try {
			return customerService.getCustomerById(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public void saveCustomer(Customer customer) {
		if(customer.getId()==-1){
			try {
				customerService.createCustomer(customer);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			try {
				customerService.updateCustomer(customer);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void deleteCustomer(int id){
		try {
			customerService.deleteCustomer(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Vehicle[] loadVehicles(){
		try {
			return vehicleService.getAllVehicles();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public Vehicle loadVehicle(int id){
		try {
			return vehicleService.getVehicleById(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public Vehicle[] loadVehicleByStatus(Calendar startDate, Calendar endDate){
		try {
			return vehicleService.getAvailableVehicles(startDate, endDate);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public void saveVehicle(Vehicle vehicle) {
		if(vehicle.getId() ==-1){
			try {
				vehicleService.createVehicle(vehicle);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			try {
				vehicleService.updateVehicle(vehicle);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void deleteVehicle(int id){
		try {
			vehicleService.deleteVehicle(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Invoice[] loadInvoices(){
		return null;
//		try {
//			return invoiceService.getAllInvoices();
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return null;
//		}
	}
	public Invoice loadInvoice(int id){
		return null;
//		try {
//			return invoiceService.getInvoiceById(id);
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			return null;
//		}
	}
	public void saveInvoice(Invoice inv) {
//		if(/*inv.getid ==-1*/){
//			try {
//				invoiceService.createInvoice(inv);
//			} catch (RemoteException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		else{
//			try {
//				invoiceService.updateInvoice(inv);
//			} catch (RemoteException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
	}
	public void deleteInvoice(int id){
//		try {
//			//invoiceService.deleteInvoice(id);
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	public Rental[] loadRentals(){
		try {
			return rentalervice.getAllRentals();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public Rental loadRental(int id){
		
		try {
			return rentalervice.getRentalById(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public void saveRental(Rental rent) {
		if(rent.getId() == -1){
			try {
				rentalervice.createRental(rent);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else{
			try {
				rentalervice.updateRental(rent);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void deleteRental(int id){
		try {
			rentalervice.deleteRental(id);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
