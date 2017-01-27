package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer;
import org.tempuri.ICustomerServiceProxy;

import Helpers.DataHelper;
import Views.CustomerDetailFrame;

public class CustomerDetailFrameController implements ActionListener {
	private CustomerDetailFrame frame;
	private DataHelper helper = new DataHelper();
	
	public CustomerDetailFrameController(CustomerDetailFrame frame) {
		// TODO Auto-generated constructor stub
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if(action.equals("Save")){
			Customer newCustomer = new Customer();
			newCustomer.setId(frame.id);
			newCustomer.setFirstName(frame.textName.getText());
			newCustomer.setLastName(frame.textLastName.getText());
			newCustomer.setCommunicationAddress(frame.textAddress.getText());
			newCustomer.setCommunicationEmail(frame.textEMail.getText());
			newCustomer.setCommunicationTelephone(frame.textPhone.getText());
			newCustomer.setInsurance(frame.textInsurance.getText());
			
			helper.saveCustomer(newCustomer);
		}
		if(action.equals("Delete")){
			helper.deleteCustomer(frame.id);	
		}
		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	}
	
	public Customer loadCustomer(int id){
		DataHelper helper = new DataHelper();
		return helper.loadCustomer(id);
	}

}
