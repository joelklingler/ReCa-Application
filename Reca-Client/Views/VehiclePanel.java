package Views;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer;
import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle;

import Controllers.CustomerPanelController;
import Controllers.FinancialPanelController;
import Controllers.MainFrameController;
import Controllers.VehiclePanelController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class VehiclePanel extends JPanel {

	private DefaultTableModel model;
	private static final int WIDE = 130;
	private VehiclePanelController controller = new VehiclePanelController(this);
	
	public void UpdateResults() {
		Vehicle[] dataresult = controller.loadVehicles();
	    int i;
	    String year;
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
	    model.setRowCount(0);
		for (i=0;i<dataresult.length;i++){
			year = sdf.format(dataresult[i].getVehicleYear().getTime());
			String[] data = {Integer.toString(dataresult[i].getId()), 
					dataresult[i].getLicenseNumber(), 
					dataresult[i].getVehicleType(),
					year,
					Integer.toString(dataresult[i].getMaxPersonsCount()),
					dataresult[i].getVehicleBrand(),
					dataresult[i].getVehicleCost().toString(),
					dataresult[i].getVehicleInsurance(),
					dataresult[i].getVehicleColor()};
					model.addRow(data);	
		}		
	}
	
	/**
	 * Create the panel.
	 */
	public VehiclePanel(MainFrame frame) {
		
		
		
		JButton addVehicle = new JButton("New");
		addVehicle.setBounds(1125, 575, 160, 35);
		addVehicle.addActionListener(controller);
					
		JPanel n = new JPanel();
		n.setLayout(new FlowLayout(FlowLayout.LEFT));
	
		model = new DefaultTableModel();
		model.addColumn("Id");
	    model.addColumn("License Number");
	    model.addColumn("Vehicle Type");
	    model.addColumn("Vehicle Year");
	    model.addColumn("Max Persons");
	    model.addColumn("Vehicle Brand");
	    model.addColumn("Vehicle Cost");
	    model.addColumn("Vehicle Insurance");
	    model.addColumn("Vehicle Color");
		
	    // Resultate laden
	    UpdateResults();
		JTable table = new JTable(model);
		table.addMouseListener(controller);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setPreferredScrollableViewportSize(new Dimension(
		table.getColumnCount() * WIDE, table.getRowHeight() * 32));
		table.setFillsViewportHeight(true);
		TableColumn column = null;
		for (int i1 = 0; i1 < 9; i1++) {
			column = table.getColumnModel().getColumn(i1);
		    column.setPreferredWidth(WIDE);
		    column.setMaxWidth(WIDE * 7);
		}  
		n.add(new JScrollPane(table));
		n.setBounds(20, 20, 1325, 800);
		n.setVisible(true);
		
		setLayout(null);
		add(addVehicle);
		add(n);
		
		controller.addTable(table);
	}

}
