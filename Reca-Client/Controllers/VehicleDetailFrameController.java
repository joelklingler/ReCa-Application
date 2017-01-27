package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer;
import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle;
import org.tempuri.ICustomerServiceProxy;

import Helpers.DataHelper;
import Views.CustomerDetailFrame;
import Views.VehicleDetailFrame;

public class VehicleDetailFrameController implements ActionListener {
	private VehicleDetailFrame frame;
	private DataHelper helper = new DataHelper();
	
	public VehicleDetailFrameController(VehicleDetailFrame vehicleDetailFrame) {
		// TODO Auto-generated constructor stub
		this.frame = vehicleDetailFrame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if(action.equals("Save")){
			Vehicle newVehicle = new Vehicle();
			Calendar year = new Calendar() {
				
				@Override
				public void roll(int field, boolean up) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public int getMinimum(int field) {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public int getMaximum(int field) {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public int getLeastMaximum(int field) {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				public int getGreatestMinimum(int field) {
					// TODO Auto-generated method stub
					return 0;
				}
				
				@Override
				protected void computeTime() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				protected void computeFields() {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void add(int field, int amount) {
					// TODO Auto-generated method stub
					
				}
			};
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
			try {
				year.setTime(sdf.parse(frame.textVehicleYear.getText()));
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// Create a DecimalFormat that fits your requirements
			DecimalFormatSymbols symbols = new DecimalFormatSymbols();
			symbols.setGroupingSeparator(',');
			symbols.setDecimalSeparator('.');
			String pattern = "#,##0.0#";
			DecimalFormat decimalFormat = new DecimalFormat(pattern, symbols);
			decimalFormat.setParseBigDecimal(true);

			// parse the string
			BigDecimal bigDecimal = null;
			try {
				bigDecimal = (BigDecimal) decimalFormat.parse(frame.textVehicleCost.getText());
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			newVehicle.setId(frame.id);
			newVehicle.setLicenseNumber(frame.textLicenseNumber.getText());
			newVehicle.setMaxPersonsCount(Integer.parseInt(frame.textMaxPersons.getText()));
			newVehicle.setVehicleBrand(frame.textVehicleBrand.getText());
			newVehicle.setVehicleColor(frame.textVehicleColor.getText());
			newVehicle.setVehicleInsurance(frame.textVehicleInsurance.getText());
			newVehicle.setVehicleYear(year);
			newVehicle.setVehicleCost(bigDecimal);
			newVehicle.setVehicleType(frame.textVehicleType.getText());
			helper.saveVehicle(newVehicle);
		}
		else if(action.equals("Delete")){
			helper.deleteVehicle(frame.id);	
		}
		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	}
	
	public Vehicle loadVehicle(int id){
		DataHelper helper = new DataHelper();
		return helper.loadVehicle(id);
	}

}
