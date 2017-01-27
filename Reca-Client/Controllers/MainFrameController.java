package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTabbedPane;

import org.apache.axis.providers.java.MsgProvider;

import Views.CustomerPanel;
import Views.MainFrame;

public class MainFrameController implements ActionListener {

	private MainFrame frame;
	private JTabbedPane pane;

	public MainFrameController(MainFrame xy, JTabbedPane tabbedPane) {
		this.frame = xy;
		this.pane = tabbedPane;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if(action.equals("load costumer")){
			
		}
		else if(action.equals("load invoice")){
			
		}
		else if(action.equals("load rentals")){
			
		}
		else if(action.equals("Customers")){
			pane.setSelectedIndex(0);
		}
		else if(action.equals("Rental")){
			pane.setSelectedIndex(1);
		}
		else if(action.equals("Financials & Invoices")){
			pane.setSelectedIndex(2);
		}
		else if(action.equals("Vehicels")){
			pane.setSelectedIndex(3);
		}
}

}
