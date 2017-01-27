package ch.Reca.project;

import java.awt.Frame;
import java.awt.Toolkit;
import java.net.URL;
import java.rmi.RemoteException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import org.datacontract.schemas._2004._07.Reca_DataTransferObjects_Basics_Objects.Customer;
import org.tempuri.ICustomerServiceProxy;

import Views.MainFrame;

public class Main {
	public static void main(String[] args) {
		MainFrame frame = new MainFrame();
		frame.setVisible(true);
	}
}