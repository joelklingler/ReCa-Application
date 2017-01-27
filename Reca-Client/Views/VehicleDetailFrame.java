package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.text.SimpleDateFormat;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle;

import Controllers.VehicleDetailFrameController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class VehicleDetailFrame extends JFrame {

	public JPanel contentPane;
	public JTextField textLicenseNumber;
	public JTextField textVehicleType;
	public JTextField textVehicleYear;
	public JTextField textMaxPersons;
	public JTextField textVehicleBrand;
	public JTextField textVehicleCost;
	public JButton btnDelete;
	public JButton btnSave;
	private VehicleDetailFrameController controller;
	public int id;
	public JTextField textVehicleInsurance;
	public JTextField textVehicleStatus;
	public JTextField textVehicleColor;
	/**
	 * Create the frame.
	 */
	public VehicleDetailFrame() {
		controller = new VehicleDetailFrameController(this);
		setTitle("Id: ");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 325, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLicenseNumber = new JLabel("License Number");
		lblLicenseNumber.setBounds(10, 14, 118, 14);
		contentPane.add(lblLicenseNumber);
		
		JLabel lblLastName = new JLabel("Vehicle Type");
		lblLastName.setBounds(10, 39, 118, 14);
		contentPane.add(lblLastName);
		
		JLabel lblAddress = new JLabel("Vehicle Year");
		lblAddress.setBounds(10, 64, 118, 14);
		contentPane.add(lblAddress);
		
		JLabel lblEmail = new JLabel("Max Persons");
		lblEmail.setBounds(10, 89, 118, 14);
		contentPane.add(lblEmail);
		
		JLabel lblInsurance = new JLabel("Vehicle Cost");
		lblInsurance.setBounds(10, 139, 118, 14);
		contentPane.add(lblInsurance);
		
		JLabel lblPhone = new JLabel("Vehicle Brand");
		lblPhone.setBounds(10, 114, 118, 14);
		contentPane.add(lblPhone);
		
		textLicenseNumber = new JTextField();
		textLicenseNumber.setBounds(138, 11, 164, 20);
		contentPane.add(textLicenseNumber);
		textLicenseNumber.setColumns(10);
		
		textVehicleType = new JTextField();
		textVehicleType.setColumns(10);
		textVehicleType.setBounds(138, 36, 164, 20);
		contentPane.add(textVehicleType);
		
		textVehicleYear = new JTextField();
		textVehicleYear.setColumns(10);
		textVehicleYear.setBounds(138, 61, 164, 20);
		contentPane.add(textVehicleYear);
		
		textMaxPersons = new JTextField();
		textMaxPersons.setColumns(10);
		textMaxPersons.setBounds(138, 86, 164, 20);
		contentPane.add(textMaxPersons);
		
		textVehicleBrand = new JTextField();
		textVehicleBrand.setColumns(10);
		textVehicleBrand.setBounds(138, 111, 164, 20);
		contentPane.add(textVehicleBrand);
		
		textVehicleCost = new JTextField();
		textVehicleCost.setColumns(10);
		textVehicleCost.setBounds(138, 136, 164, 20);
		contentPane.add(textVehicleCost);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(136, 248, 78, 23);
		contentPane.add(btnSave);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(224, 248, 78, 23);
		contentPane.add(btnDelete);
		
		JLabel lblVehicleInsurance = new JLabel("Vehicle Insurance");
		lblVehicleInsurance.setBounds(10, 167, 118, 14);
		contentPane.add(lblVehicleInsurance);
		
		textVehicleInsurance = new JTextField();
		textVehicleInsurance.setColumns(10);
		textVehicleInsurance.setBounds(138, 164, 164, 20);
		contentPane.add(textVehicleInsurance);
		
		textVehicleColor = new JTextField();
		textVehicleColor.setColumns(10);
		textVehicleColor.setBounds(138, 192, 164, 20);
		contentPane.add(textVehicleColor);
		
		JLabel lblVehicleColor = new JLabel("Vehicle Color");
		lblVehicleColor.setBounds(10, 195, 118, 14);
		contentPane.add(lblVehicleColor);
	}

	public VehicleDetailFrame(int id) {
		this();
		btnSave.addActionListener(controller);
		btnDelete.addActionListener(controller);
		this.id = id;
		// Values setzen
		if(id != -1)
		{
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
			Vehicle vehicle = controller.loadVehicle(id);
			String year = sdf.format(vehicle.getVehicleYear().getTime());
			this.setTitle("Vehicle: " + id);
			vehicle = controller.loadVehicle(id);
			this.textLicenseNumber.setText(vehicle.getLicenseNumber());
			this.textVehicleType.setText(vehicle.getVehicleType());
			this.textMaxPersons.setText(Integer.toString(vehicle.getMaxPersonsCount()));
			this.textVehicleYear.setText(year);
			this.textVehicleCost.setText(vehicle.getVehicleCost().toString());
			this.textVehicleBrand.setText(vehicle.getVehicleBrand());
			this.textVehicleInsurance.setText(vehicle.getVehicleInsurance());
			this.textVehicleColor.setText(vehicle.getVehicleColor());
			this.btnDelete.setEnabled(true);
		}
		else {
			this.btnDelete.setEnabled(false);
			this.setTitle("Vehicle: NEW");
		}
	}
}
