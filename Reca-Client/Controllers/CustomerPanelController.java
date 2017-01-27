package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JTable;
import javax.swing.SwingUtilities;

import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer;
import org.tempuri.ICustomerServiceProxy;

import Helpers.DataHelper;
import Views.CustomerDetailFrame;
import Views.CustomerPanel;
import Views.MainFrame;

public class CustomerPanelController implements ActionListener, MouseListener{
	private CustomerPanel panel;
	private DataHelper helper;
	private JTable table;
	public CustomerPanelController(CustomerPanel xy) {
		this.panel = xy;
		helper = new DataHelper();
	}
	public void addTable(JTable table){
		this.table = table;
	}
	public Customer[] loadCustomers(){
		return helper.loadCustomers();
	}
	
	private void openDetailCustomerPanel(int id){
		CustomerDetailFrame frame = new CustomerDetailFrame(id);
		frame.setVisible(true);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e){
				panel.UpdateResults();
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String action = e.getActionCommand();
		if(action.equals("New")){
			openDetailCustomerPanel(-1);
		}		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(SwingUtilities.isLeftMouseButton(e)){
			openDetailCustomerPanel(Integer.parseInt((String) table.getValueAt(table.getSelectedRow(), 0)));
		}
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
