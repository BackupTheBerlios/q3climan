
package de.q3cm.sub.subs;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import de.q3cm.CM_main;
import de.q3cm.libs.langMan;

public class CM_edit extends JPanel {

	private JPanel editButtonPanel = null;
	private JButton abortButton = null;
	private JButton saveButton = null;
	private JTabbedPane editTabbedPane = null;
	private JTable Lasche1_Table = null;
	private JScrollPane Lasche1_ScrollPane = null;
	private JPanel saveDialogContentPane = null;

	private JDialog saveDialog = null;  //  @jve:decl-index=0:visual-constraint="420,10"
	
	private DefaultTableModel Lasche_1_TableModel = null;  //  @jve:decl-index=0:visual-constraint="421,82"

	public CM_edit() {
		super();
		initialize();
	}

	private void initialize() {
		try {
            this.setLayout(null);
            this.setName("mainEditPlayerPanel");
            this.setPreferredSize(new java.awt.Dimension(400,400));
            this.setSize(400, 400);
            this.add(getEditTabbedPane(), null);
            this.add(getEditButtonPanel(), null);
				
		}
		catch (java.lang.Throwable e) {
		    System.err.println("Laden des >CM_edit initialize< ist fehlgeschlagen!");
		}
	}
  
	private JPanel getEditButtonPanel() {
		if (editButtonPanel == null) {
			try {
				GridLayout gridLayout13 = new GridLayout();
				editButtonPanel = new JPanel();
				editButtonPanel.setLayout(gridLayout13);
				editButtonPanel.setBounds(5, 370, 390, 25);
				gridLayout13.setRows(1);
				gridLayout13.setColumns(2);
				editButtonPanel.add(getAbortButton(), null);
				editButtonPanel.add(getSaveButton(), null);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getEditButtonPanel< ist fehlgeschlagen!");
			}
		}
		return editButtonPanel;
	}
   
	private JButton getAbortButton() {
		if (abortButton == null) {
			try {
				abortButton = new JButton();
				abortButton.setText("Abort");
				abortButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/abort.gif")));
				abortButton.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.EDITABORTBUTTON);
					}
				});
				abortButton.addActionListener(new java.awt.event.ActionListener() { 
					public void actionPerformed(java.awt.event.ActionEvent e) {    

						CM_main.getInstance().getCM_controller().getSelectPlayer().setEnabled(true);
						CM_main.getInstance().getCM_controller().getSelectMod().setEnabled(true);
						CM_main.getInstance().getCM_controller().getSelectServer().setEnabled(true);
						
						CM_main.getInstance().getCM_controller().getEditButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getRunButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getLoadButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getNewButton().setEnabled(true);
					    
						CM_main.getInstance().getCM_controller().getConfigButton().setEnabled(true);
					    
						CM_edit.this.setVisible(false);
						CM_main.getInstance().setSize(210,433);
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getAbortButton< ist fehlgeschlagen!");
			}
		}
		return abortButton;
	}
   
	private JButton getSaveButton() {
		if (saveButton == null) {
			try {
				saveButton = new JButton();
				saveButton.setText("Save");
				saveButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/save.png")));
				saveButton.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.EDITSAVEBUTTON);
					}
				});
				saveButton.addActionListener(new java.awt.event.ActionListener() { 
					public void actionPerformed(java.awt.event.ActionEvent e) {    

						CM_main.getInstance().getCM_controller().getSelectPlayer().setEnabled(true);
						CM_main.getInstance().getCM_controller().getSelectMod().setEnabled(true);
						CM_main.getInstance().getCM_controller().getSelectServer().setEnabled(true);
						
						CM_main.getInstance().getCM_controller().getEditButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getRunButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getLoadButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getNewButton().setEnabled(true);

						CM_main.getInstance().getCM_controller().getConfigButton().setEnabled(true);

			            JOptionPane.showMessageDialog(saveDialog, "<html>The settings where sucsessfull saved.</html>", "Save settings", JOptionPane.INFORMATION_MESSAGE);
						CM_edit.this.setVisible(false);
						CM_main.getInstance().setSize(210,433);
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getSaveButton< ist fehlgeschlagen!");
			}
		}
		return saveButton;
	}
   
	private JTabbedPane getEditTabbedPane() {
		if (editTabbedPane == null) {
			try {
				editTabbedPane = new JTabbedPane();
				editTabbedPane.setBounds(5, 5, 390, 360);
				editTabbedPane.setName("editTabbedPane");
				editTabbedPane.setComponentOrientation(java.awt.ComponentOrientation.LEFT_TO_RIGHT);
				editTabbedPane.setPreferredSize(new java.awt.Dimension(390,360));
				editTabbedPane.setAutoscrolls(true);
				editTabbedPane.setMaximumSize(new java.awt.Dimension(390,360));
				editTabbedPane.addTab("Lasche 1", new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/new.png")), getLasche1_ScrollPane(), null);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getEditTabbedPane< ist fehlgeschlagen!");
			}
		}
		return editTabbedPane;
	}
  
	private JTable getLasche1_Table() {
		if (Lasche1_Table == null) {
			try {
				Lasche1_Table = new JTable();
				Lasche1_Table.setModel(getLasche_1_TableModel());
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getLasche1_Table< ist fehlgeschlagen!");
			}
		}
		return Lasche1_Table;
	}
    
	private JScrollPane getLasche1_ScrollPane() {
		if (Lasche1_ScrollPane == null) {
			try {
				Lasche1_ScrollPane = new JScrollPane();
				Lasche1_ScrollPane.setViewportView(getLasche1_Table());
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getLasche1_ScrollPane< ist fehlgeschlagen!");
			}
		}
		return Lasche1_ScrollPane;
	}
 
	private JPanel getSaveDialogContentPane() {
		if (saveDialogContentPane == null) {
			try {
				saveDialogContentPane = new JPanel();
				saveDialogContentPane.setLayout(new BorderLayout());
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getSaveDialogContentPane< ist fehlgeschlagen!");
			}
		}
		return saveDialogContentPane;
	}
  
	private JDialog getSaveDialog() {
		if (saveDialog == null) {
			try {
				saveDialog = new JDialog();
				saveDialog.setContentPane(getSaveDialogContentPane());
				saveDialog.setSize(132, 60);
				saveDialog.setName("saveDialog");
				saveDialog.setResizable(false);
				saveDialog.setTitle("Save settings");
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getSaveDialog< ist fehlgeschlagen!");
			}
		}
		return saveDialog;
	}
  
	private DefaultTableModel getLasche_1_TableModel() {
		if (Lasche_1_TableModel == null) {
			try {
				Lasche_1_TableModel = new DefaultTableModel();
				Lasche_1_TableModel.setColumnCount(4);
				Lasche_1_TableModel.setNumRows(50);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getLasche_1_TableModel< ist fehlgeschlagen!");
			}
		}
		return Lasche_1_TableModel;
	}
      }
