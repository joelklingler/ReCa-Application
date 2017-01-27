package Views;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.rmi.RemoteException;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer;
import org.tempuri.ICustomerServiceProxy;

import Controllers.CustomerPanelController;
import Controllers.MainFrameController;


public class CustomerPanel extends JPanel {
	private DefaultTableModel model;
	private static final int WIDE = 180;
	private CustomerPanelController controller = new CustomerPanelController(this);
	
	public void UpdateResults() {
		Customer[] dataresult = controller.loadCustomers();
	    int i;
	    model.setRowCount(0);
		for (i=0;i<dataresult.length;i++){
			
			String[] data = {Integer.toString(dataresult[i].getId()), dataresult[i].getFirstName(), dataresult[i].getLastName(),
					dataresult[i].getCommunicationAddress(), dataresult[i].getCommunicationEmail(),
					dataresult[i].getCommunicationTelephone(), dataresult[i].getInsurance()};
			model.addRow(data);	
		}		
	}
	
	/**
	 * Create the panel.
	 */
	public CustomerPanel() {
		JButton addCostumer = new JButton("New");
		addCostumer.setBounds(1125, 575, 160, 35);
		addCostumer.addActionListener(controller);
					
		JPanel n = new JPanel();
		n.setLayout(new FlowLayout(FlowLayout.LEFT));
		 
		model = new DefaultTableModel();
		model.addColumn("Id");
	    model.addColumn("First Name");
	    model.addColumn("Last Name");
	    model.addColumn("Address");
	    model.addColumn("EMail");
	    model.addColumn("Telephone");
	    model.addColumn("Insurance");
		
	    // Resultate laden
	    UpdateResults();
		JTable table = new JTable(model);
		table.addMouseListener(controller);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setPreferredScrollableViewportSize(new Dimension(
		table.getColumnCount() * WIDE, table.getRowHeight() * 32));
		table.setFillsViewportHeight(true);
		TableColumn column = null;
		for (int i1 = 0; i1 < 7; i1++) {
			column = table.getColumnModel().getColumn(i1);
		    column.setPreferredWidth(WIDE);
		    column.setMaxWidth(WIDE * 7);
		}  
		n.add(new JScrollPane(table));
		n.setBounds(20, 20, 1325, 800);
		n.setVisible(true);
		
		setLayout(null);
		add(addCostumer);
		add(n);
		
		controller.addTable(table);
	}
}
