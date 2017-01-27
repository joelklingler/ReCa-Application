package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;

import javax.swing.JTable;
import javax.swing.SwingUtilities;

import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Vehicle;

import Helpers.DataHelper;
import Views.CustomerDetailFrame;
import Views.FinanzenPanel;
import Views.VehicleDetailFrame;
import Views.VehiclePanel;

public class VehiclePanelController implements ActionListener, MouseListener  {
	private VehiclePanel panel;
	private DataHelper helper;
	private JTable table;
	public VehiclePanelController(VehiclePanel xy){
		this.panel = xy;
		helper = new DataHelper();
	}
	public void addTable(JTable table){
		this.table = table;
	}
	public Vehicle[] loadVehicles(){
		return helper.loadVehicles();
	}
	public Vehicle[] loadVehiclesByStatus(Calendar startDate, Calendar endDate){
		return helper.loadVehicleByStatus(startDate, endDate);
	}
	private void openDetailVehiclePanel(int id){
		VehicleDetailFrame frame = new VehicleDetailFrame(id);
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
			openDetailVehiclePanel(-1);
		}		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(SwingUtilities.isLeftMouseButton(e)){
			openDetailVehiclePanel(Integer.parseInt((String) table.getValueAt(table.getSelectedRow(), 0)));
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
