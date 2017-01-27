package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer;
import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Rental;
import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle;

import Controllers.CustomerDetailFrameController;
import Controllers.CustomerPanelController;
import Controllers.RentalDetailFrameController;
import Controllers.VehiclePanelController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class RentalDetailFrame extends JFrame {

	public JPanel contentPane;
	public JTextField textStart;
	public JTextField textEnde;
	public JButton btnSave;
	public JButton btnLoadVehicles;
	private RentalDetailFrameController controller;
	private Rental customer;
	private Rental rental;
	public int id;
	private CustomerPanel panelCustomer;
	private CustomerPanelController customerController = new CustomerPanelController(panelCustomer);
	private VehiclePanel panelVehicle;
	private VehiclePanelController vehicleController = new VehiclePanelController(panelVehicle);
	public JComboBox comboBoxCustomers;
	public JComboBox comboBoxVehicels;
	public JLabel vehicel;
	public Calendar start;
	public Calendar end;
	private JButton btnDelete;
	/**
	 * Create the frame.
	 */
	public ArrayList<String> loadCustomerBox(){
		Customer[] dataresult = customerController.loadCustomers();
		int i;
		ArrayList<String> data = new ArrayList<>();
		for (i=0;i<dataresult.length;i++){
			data.add(Integer.toString(dataresult[i].getId()) + ": " 
			+ dataresult[i].getFirstName() + " " 
			+ dataresult[i].getLastName());
		}
		return data;
	}
	public ArrayList<String> loadVehicleBox(Calendar startDate, Calendar endDate){
		Vehicle[] dataresult = vehicleController.loadVehiclesByStatus(startDate, endDate);
		int i;
		ArrayList<String> data = new ArrayList<>();
		for (i=0;i<dataresult.length;i++){
			data.add(Integer.toString(dataresult[i].getId()) + ": " 
			+ dataresult[i].getVehicleBrand());
		}
		return data;
	}
	public RentalDetailFrame() {
		controller = new RentalDetailFrameController(this);
		setTitle("Id: ");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 325, 251);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Customer");
		lblName.setBounds(10, 52, 70, 14);
		contentPane.add(lblName);
		
		vehicel = new JLabel("Vehicel");
		vehicel.setBounds(10, 136, 70, 14);
		vehicel.setVisible(false);
		contentPane.add(vehicel);
		
		JLabel lblAddress = new JLabel("Start");
		lblAddress.setBounds(10, 80, 46, 14);
		contentPane.add(lblAddress);
		
		JLabel lblEmail = new JLabel("End");
		lblEmail.setBounds(10, 108, 46, 14);
		contentPane.add(lblEmail);
		
		textStart = new JTextField();
		textStart.setColumns(10);
		textStart.setBounds(98, 77, 204, 20);
		textStart.setText(null);
		contentPane.add(textStart);
		
		textEnde = new JTextField();
		textEnde.setColumns(10);
		textEnde.setBounds(98, 105, 204, 20);
		textEnde.setText(null);
		contentPane.add(textEnde);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(222, 165, 78, 23);
		btnSave.setEnabled(false);
		contentPane.add(btnSave);
		
		comboBoxCustomers = new JComboBox<String>();
		comboBoxCustomers.setBounds(98, 49, 204, 20);
		comboBoxCustomers.setModel(new DefaultComboBoxModel(loadCustomerBox().toArray()));
		contentPane.add(comboBoxCustomers);
		
		comboBoxVehicels = new JComboBox<String>();
		comboBoxVehicels.setBounds(98, 133, 204, 20);
		comboBoxVehicels.setVisible(false);
		contentPane.add(comboBoxVehicels);
		
		JLabel lblNewRental = new JLabel("New Rental:");
		lblNewRental.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewRental.setBounds(10, 11, 126, 23);
		contentPane.add(lblNewRental);
		
		btnLoadVehicles = new JButton("Load Vehicles");
		btnLoadVehicles.setBounds(98, 165, 115, 23);
		contentPane.add(btnLoadVehicles);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(222, 193, 78, 23);
		contentPane.add(btnDelete);
	}

	public RentalDetailFrame(int id) {
		this();
		btnSave.addActionListener(controller);
		btnLoadVehicles.addActionListener(controller);
		btnDelete.addActionListener(controller);
		
		this.id = id;
		// Values setzen
		if(id != -1)
		{

		}
		else {
			this.setTitle("Rental: NEW");
			this.btnDelete.setEnabled(false);
			
		
		}
	}
}
