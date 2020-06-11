package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

import Account.AccountInput;
import manager.AccountManager;

public class AccountViewer extends JPanel {
	
	WindowFrame frame;

	AccountManager accountManager;
	
	public AccountViewer(WindowFrame frame, AccountManager accountManager) {
		this.frame = frame;
		this.accountManager = accountManager;
		
		System.out.println("***" + accountManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Website Name");
		model.addColumn("Id");
		model.addColumn("Password");
		model.addColumn("Email");
		
		for (int i=0; i< accountManager.size(); i++) {
			Vector row = new Vector();
			AccountInput ai = accountManager.get(i);
			row.add(ai.getName());
			row.add(ai.getId());
			row.add(ai.getPassword());
			row.add(ai.getEmail());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
	}

}