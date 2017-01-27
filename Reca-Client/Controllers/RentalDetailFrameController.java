package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import org.apache.axis.providers.java.MsgProvider;
import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer;
import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Rental;
import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle;
import org.tempuri.ICustomerService;
import org.tempuri.ICustomerServiceProxy;

import Helpers.DataHelper;
import Views.CustomerDetailFrame;
import Views.RentalDetailFrame;
import Views.RentalPanel;

public class RentalDetailFrameController implements ActionListener {
	private RentalDetailFrame frame;
	private VehiclePanelController controllerVehicle;
	private DataHelper helper = new DataHelper();
	
	public RentalDetailFrameController(RentalDetailFrame frame) {
		// TODO Auto-generated constructor stub
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		try {
			end.setTime(formatter.parse(frame.textEnde.getText()));
			start.setTime(formatter.parse(frame.textEnde.getText()));
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		if(action.equals("Load Vehicles")){
				frame.comboBoxVehicels.setModel(new DefaultComboBoxModel(frame.loadVehicleBox(start, end).toArray()));
				frame.vehicel.setVisible(true);
				frame.comboBoxVehicels.setVisible(true);
		}
		if(action.equals("Save")){
			// arrange
			int customerId;
			int vehicleId;
			
			// Customer / Vehicle herausfinden
			Object selectedCustomer  = frame.comboBoxCustomers.getItemAt(frame.comboBoxCustomers.getSelectedIndex());
			customerId = Integer.parseInt(selectedCustomer.toString().split(":")[0]);
			
			// Customer / Vehicle herausfinden
			Object selectedVehicle  = frame.comboBoxCustomers.getItemAt(frame.comboBoxVehicels.getSelectedIndex());
			vehicleId = Integer.parseInt(selectedVehicle.toString().split(":")[0]);
			
			// Customer laden
			Customer customer = helper.loadCustomer(customerId);
			
			// Auto laden
			Vehicle vehicle = helper.loadVehicle(vehicleId);
			
			// Rental erstellen
			Rental rental = new Rental();
			rental.setId(frame.id);
			rental.setCustomer(customer);
			rental.setVehicle(vehicle);
			rental.setEndDate(end);
			rental.setStartDate(start);

			helper.saveRental(rental);
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		}
		else if(action.equals("Delete")){
			helper.deleteRental(frame.id);
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		}
	}
	
	public Rental loadRental(int id){
		DataHelper helper = new DataHelper();
		return helper.loadRental(id);
	}

}
