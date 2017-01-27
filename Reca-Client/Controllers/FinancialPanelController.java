package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JTable;
import javax.swing.SwingUtilities;

import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer;
import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Invoice;

import Helpers.DataHelper;
import Views.CustomerDetailFrame;
import Views.FinanzenPanel;
import Views.CustomerPanel;

public class FinancialPanelController implements ActionListener, MouseListener {

	private FinanzenPanel panel;
	private DataHelper helper;
	private JTable table;
	public FinancialPanelController(FinanzenPanel xy){
		this.panel = xy;
		helper = new DataHelper();
	}
	public void addTable(JTable table){
		this.table = table;
	}
	public Invoice[] loadInvoice(){
		return helper.loadInvoices();
	}
	
	private void openDetailCustomerPanel(int id){
		
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
