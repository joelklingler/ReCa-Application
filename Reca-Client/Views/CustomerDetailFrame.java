package Views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer;

import Controllers.CustomerDetailFrameController;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CustomerDetailFrame extends JFrame {

	public JPanel contentPane;
	public JTextField textName;
	public JTextField textLastName;
	public JTextField textAddress;
	public JTextField textEMail;
	public JTextField textPhone;
	public JTextField textInsurance;
	public JButton btnDelete;
	public JButton btnSave;
	private CustomerDetailFrameController controller;
	private Customer customer;
	public int id;
	/**
	 * Create the frame.
	 */
	public CustomerDetailFrame() {
		controller = new CustomerDetailFrameController(this);
		setTitle("Id: ");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 325, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 14, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(10, 39, 70, 14);
		contentPane.add(lblLastName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(10, 64, 70, 14);
		contentPane.add(lblAddress);
		
		JLabel lblEmail = new JLabel("EMail");
		lblEmail.setBounds(10, 89, 46, 14);
		contentPane.add(lblEmail);
		
		JLabel lblInsurance = new JLabel("Insurance");
		lblInsurance.setBounds(10, 139, 70, 14);
		contentPane.add(lblInsurance);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setBounds(10, 114, 46, 14);
		contentPane.add(lblPhone);
		
		textName = new JTextField();
		textName.setBounds(125, 11, 177, 20);
		contentPane.add(textName);
		textName.setColumns(10);
		
		textLastName = new JTextField();
		textLastName.setColumns(10);
		textLastName.setBounds(125, 36, 177, 20);
		contentPane.add(textLastName);
		
		textAddress = new JTextField();
		textAddress.setColumns(10);
		textAddress.setBounds(125, 61, 177, 20);
		contentPane.add(textAddress);
		
		textEMail = new JTextField();
		textEMail.setColumns(10);
		textEMail.setBounds(125, 86, 177, 20);
		contentPane.add(textEMail);
		
		textPhone = new JTextField();
		textPhone.setColumns(10);
		textPhone.setBounds(125, 111, 177, 20);
		contentPane.add(textPhone);
		
		textInsurance = new JTextField();
		textInsurance.setColumns(10);
		textInsurance.setBounds(125, 136, 177, 20);
		contentPane.add(textInsurance);
		
		btnSave = new JButton("Save");
		btnSave.setBounds(125, 179, 78, 23);
		contentPane.add(btnSave);
		
		btnDelete = new JButton("Delete");
		btnDelete.setBounds(224, 179, 78, 23);
		contentPane.add(btnDelete);
	}

	public CustomerDetailFrame(int id) {
		this();
		btnSave.addActionListener(controller);
		btnDelete.addActionListener(controller);
		this.id = id;
		// Values setzen
		if(id != -1)
		{
			this.setTitle("Customer: " + id);
			customer = controller.loadCustomer(id);
			this.textName.setText(customer.getFirstName());
			this.textLastName.setText(customer.getLastName());
			this.textEMail.setText(customer.getCommunicationEmail());
			this.textAddress.setText(customer.getCommunicationAddress());
			this.textInsurance.setText(customer.getInsurance());
			this.textPhone.setText(customer.getCommunicationTelephone());
			this.btnDelete.setEnabled(true);
		}
		else {
			this.btnDelete.setEnabled(false);
			this.setTitle("Customer: NEW");
		}
	}
}
