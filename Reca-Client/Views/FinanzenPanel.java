package Views;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer;
import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Invoice;

import Controllers.CustomerPanelController;
import Controllers.FinancialPanelController;
import Controllers.MainFrameController;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class FinanzenPanel extends JPanel {

	private DefaultTableModel model;
	private static final int WIDE = 158;
	private FinancialPanelController controller = new FinancialPanelController(this);
	
	public void UpdateResults() {
		
	    int i;
	    model.setRowCount(0);
		for (i=0;i<1;i++){
			
			String[] data = {"1", "2016-05-04", "2016-06-30", "250", "22", "Offen", "-", "1" };
			model.addRow(data);	
		}		
	}
	
	/**
	 * Create the panel.
	 */
	public FinanzenPanel(MainFrame frame) {	
		JButton addInvoke = new JButton("New");
		addInvoke.setBounds(1125, 575, 160, 35);
		addInvoke.addActionListener(controller);
		addInvoke.setEnabled(false);
					
		JPanel n = new JPanel();
		n.setLayout(new FlowLayout(FlowLayout.LEFT));
		 
		model = new DefaultTableModel();
		model.addColumn("Id");
	    model.addColumn("Invoice Date");
	    model.addColumn("Max Pay Date");
	    model.addColumn("Amount");
	    model.addColumn("Customer Id");
	    model.addColumn("Invoice State");
	    model.addColumn("Additional Information");
	    model.addColumn("Renatl Id");
		
	    // Resultate laden
	    UpdateResults();
		JTable table = new JTable(model);
		table.addMouseListener(controller);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table.setPreferredScrollableViewportSize(new Dimension(
		table.getColumnCount() * WIDE, table.getRowHeight() * 32));
		table.setFillsViewportHeight(true);
		TableColumn column = null;
		for (int i1 = 0; i1 < 8; i1++) {
			column = table.getColumnModel().getColumn(i1);
		    column.setPreferredWidth(WIDE);
		    column.setMaxWidth(WIDE * 8);
		}  
		n.add(new JScrollPane(table));
		n.setBounds(20, 20, 1325, 800);
		n.setVisible(true);
		
		setLayout(null);
		add(addInvoke);
		add(n);
		
		controller.addTable(table);
	}

}
