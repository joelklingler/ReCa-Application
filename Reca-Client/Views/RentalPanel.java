package Views;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Rental;
import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle;

import Controllers.MainFrameController;
import Controllers.RentalPanelController;
import Controllers.VehiclePanelController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class RentalPanel extends JPanel {


	private DefaultTableModel model;
	private static final int WIDE = 252;
	private RentalPanelController controller = new RentalPanelController(this);
	
	public void UpdateResults() {
		Rental[] dataresult = controller.loadRenatls();
	    int i;
	    model.setRowCount(0);
	    String start;
	    String ende;
	    
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (i=0;i<dataresult.length;i++){
			start = sdf.format(dataresult[i].getStartDate().getTime());
			ende = sdf.format(dataresult[i].getEndDate().getTime());
			String[] data = {Integer.toString(dataresult[i].getId()),
					dataresult[i].getVehicle().getVehicleBrand(),
					dataresult[i].getCustomer().getFirstName() + " " + dataresult[i].getCustomer().getLastName(),
					start,
					ende};
			model.addRow(data);	
		}		
	}
	
	/**
	 * Create the panel.
	 */
	public RentalPanel(MainFrame frame) {
		JButton addRental = new JButton("New");
		addRental.setBounds(1125, 575, 160, 35);
		addRental.addActionListener(controller);
					
		JPanel n = new JPanel();
		n.setLayout(new FlowLayout(FlowLayout.LEFT));
		 
		model = new DefaultTableModel();
		model.addColumn("Id");
	    model.addColumn("Vehicle");
	    model.addColumn("Customer");
	    model.addColumn("Start Date");
	    model.addColumn("End Date");
		
	    // Resultate laden
	    UpdateResults();
		JTable table = new JTable(model);
		table.addMouseListener(controller);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setPreferredScrollableViewportSize(new Dimension(
		table.getColumnCount() * WIDE, table.getRowHeight() * 32));
		table.setFillsViewportHeight(true);
		TableColumn column = null;
		for (int i1 = 0; i1 < 5; i1++) {
			column = table.getColumnModel().getColumn(i1);
		    column.setPreferredWidth(WIDE);
		    column.setMaxWidth(WIDE * 5);
		}  
		n.add(new JScrollPane(table));
		n.setBounds(20, 20, 1325, 800);
		n.setVisible(true);
		
		setLayout(null);
		add(addRental);
		add(n);
		
		controller.addTable(table);
	}
}


