
package de.q3cm.sub.subs;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import de.q3cm.CM_main;

public class CM_load extends JPanel {

	private JPanel Load_Info_Panel = null;
	private JPanel Load_Button_Panel = null;
	private JButton Load_OK_Button = null;
	private JTabbedPane Load_Main_TabbedPane = null;
	private JPanel Load_Import = null;
	private JPanel Load_Replace = null;

	public CM_load() {
		super();
		initialize();
	}

	private void initialize() {
		try {
            this.setLayout(null);
            this.setSize(400, 400);
            this.add(getLoad_Info_Panel(), null);
            this.add(getLoad_Button_Panel(), null);
            this.add(getLoad_Main_TabbedPane(), null);
		} catch (java.lang.Throwable e) {
		    System.err.println("Laden des >CM_load initialize< ist fehlgeschlagen!");
		}
	}
   
	private JPanel getLoad_Info_Panel() {
		if (Load_Info_Panel == null) {
			try {
				Load_Info_Panel = new JPanel();
				Load_Info_Panel.setBounds(5, 5, 390, 24);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getLoad_Info_Panel< ist fehlgeschlagen!");
			}
		}
		return Load_Info_Panel;
	}
 
	private JPanel getLoad_Button_Panel() {
		if (Load_Button_Panel == null) {
			try {
				Load_Button_Panel = new JPanel();
				GridLayout gridLayout1 = new GridLayout();
				Load_Button_Panel.setLayout(gridLayout1);
				Load_Button_Panel.setLocation(5, 359);
				Load_Button_Panel.setSize(390, 25);
				gridLayout1.setRows(1);
				gridLayout1.setColumns(2);
				Load_Button_Panel.add(getLoad_OK_Button(), null);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getLoad_Button_Panel< ist fehlgeschlagen!");
			}
		}
		return Load_Button_Panel;
	}
  
	private JButton getLoad_OK_Button() {
		if (Load_OK_Button == null) {
			try {
				Load_OK_Button = new JButton();
				Load_OK_Button.setText("OK");
				Load_OK_Button.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/save.png")));
				Load_OK_Button.addActionListener(new java.awt.event.ActionListener() { 
					public void actionPerformed(java.awt.event.ActionEvent e) {    
						CM_main.getInstance().getCM_controller().getSelectPlayer().setEnabled(true);
						CM_main.getInstance().getCM_controller().getSelectMod().setEnabled(true);
						CM_main.getInstance().getCM_controller().getSelectServer().setEnabled(true);
						
						CM_main.getInstance().getCM_controller().getEditButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getRunButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getLoadButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getNewButton().setEnabled(true);
					    
						CM_main.getInstance().getCM_controller().getConfigButton().setEnabled(true);
					    
						CM_load.this.setVisible(false);
						CM_main.getInstance().setSize(210,433);
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getLoad_OK_Button< ist fehlgeschlagen!");
			}
		}
		return Load_OK_Button;
	}
  
	private JTabbedPane getLoad_Main_TabbedPane() {
		if (Load_Main_TabbedPane == null) {
			try {
				Load_Main_TabbedPane = new JTabbedPane();
				Load_Main_TabbedPane.setBounds(5, 34, 390, 318);
				Load_Main_TabbedPane.addTab("Import Player Settings", null, getLoad_Import(), null);
				Load_Main_TabbedPane.addTab("Replace Player Settings", null, getLoad_Replace(), null);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getLoad_Main_TabbedPane< ist fehlgeschlagen!");
			}
		}
		return Load_Main_TabbedPane;
	}
  
	private JPanel getLoad_Import() {
		if (Load_Import == null) {
			try {
				Load_Import = new JPanel();
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getLoad_Import< ist fehlgeschlagen!");
			}
		}
		return Load_Import;
	}
  
	private JPanel getLoad_Replace() {
		if (Load_Replace == null) {
			try {
				Load_Replace = new JPanel();
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getLoad_Replace< ist fehlgeschlagen!");
			}
		}
		return Load_Replace;
	}
}
