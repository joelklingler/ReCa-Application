package Views;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controllers.MainFrameController;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTabbedPane;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Create the frame.
	 */
	public MainFrame() {
		JTabbedPane tabbedPane = new JTabbedPane();
		MainFrameController controller = new MainFrameController(this, tabbedPane);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(getExtendedState()|Frame.MAXIMIZED_BOTH);
		
		
		this.pack(); // Important line!!! 
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		CustomerPanel panel1 = new CustomerPanel();
		RentalPanel panel2 = new RentalPanel(this);
		FinanzenPanel panel3 = new FinanzenPanel(this);
		VehiclePanel panel4 = new VehiclePanel(this);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 40, 21);
		contentPane.add(menuBar);
		
		JMenu mnMen = new JMenu("ReCa");
		menuBar.add(mnMen);
		JMenuItem mntmKundenstamm = new JMenuItem("Customers");
		JMenuItem mntmVermietung = new JMenuItem("Rental");
		JMenuItem mntmFinanzen = new JMenuItem("Financials & Invoices");
		JMenuItem mntmVehicels = new JMenuItem("Vehicels");
		
		mntmKundenstamm.addActionListener(controller);
		mntmVermietung.addActionListener(controller);
		mntmFinanzen.addActionListener(controller);
		mntmVehicels.addActionListener(controller);
		
		mnMen.add(mntmKundenstamm);
		mnMen.add(mntmVermietung);
		mnMen.add(mntmFinanzen);
		mnMen.add(mntmVehicels);
		
		System.out.println();
		tabbedPane.setBounds(20, 30, 1325, 660);
		contentPane.add(tabbedPane);
		
		tabbedPane.addTab("Customers", panel1);
		tabbedPane.addTab("Rental", panel2);
		tabbedPane.addTab("Financials & Invoices", panel3);
		tabbedPane.addTab("Vehicels", panel4);
	}
}
