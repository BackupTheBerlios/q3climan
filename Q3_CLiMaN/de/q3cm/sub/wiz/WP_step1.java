package de.q3cm.sub.wiz;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import de.q3cm.CM_main;
import de.q3cm.libs.langMan;

public class WP_step1 extends JPanel {

	private JPanel infoPanel = null;
	private JTextPane headerTextPane = null;
	private JPanel NamePanel = null;
	private JLabel iconClanName = null;
	private JLabel iconPlayerName = null;
	private JTextField ClanName = null;
	private JTextField PlayerName = null;
	private JPanel OutputPanel = null;
	private JTextPane NameOutput = null;

	public WP_step1() {
		super();
		initialize();
	}

	private void initialize() {
		try {
            this.setLayout(null);
            this.setSize(390, 338);
            this.setPreferredSize(new java.awt.Dimension(390,338));
            this.add(getInfoPanel(), null);
            this.add(getNamePanel(), null);
            this.add(getOutputPanel(), null);
				
		}
		catch (java.lang.Throwable e) {
		    System.err.println("Laden des >WP_step1 initialize< ist fehlgeschlagen!");
		}
	}
   
	private JPanel getInfoPanel() {
		if (infoPanel == null) {
			try {
				infoPanel = new JPanel();
				GridLayout gridLayout8 = new GridLayout();
				infoPanel.setLayout(gridLayout8);
				infoPanel.setBounds(5, 5, 380, 136);
				gridLayout8.setRows(1);
				infoPanel.add(getHeaderTextPane(), null);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getInfoPanel< ist fehlgeschlagen!");
			}
		}
		return infoPanel;
	}
  
	private JTextPane getHeaderTextPane() {
		if (headerTextPane == null) {
			try {
				headerTextPane = new JTextPane();
				headerTextPane.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 12));
				headerTextPane.setContentType("text/html");
				headerTextPane.setEditable(false);
				headerTextPane.setName("headerTextPane");
				headerTextPane.setBackground(new java.awt.Color(238,238,238));
				headerTextPane.setText(langMan.getTheText(langMan.HEADWIZARDINFO_01));
				headerTextPane.setOpaque(false);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getHeaderTextPane< ist fehlgeschlagen!");
			}
		}
		return headerTextPane;
	}
    
	private JPanel getNamePanel() {
		if (NamePanel == null) {
			try {
				NamePanel = new JPanel();
				iconClanName = new JLabel();
				iconPlayerName = new JLabel();
				GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
				NamePanel.setLayout(new GridBagLayout());
				NamePanel.setBounds(5, 146, 380, 45);
				gridBagConstraints9.gridx = 0;
				gridBagConstraints9.gridy = 0;
				gridBagConstraints9.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints9.fill = java.awt.GridBagConstraints.VERTICAL;
				gridBagConstraints9.insets = new java.awt.Insets(0,0,0,5);
				iconClanName.setText("Clan Name");
				iconClanName.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/speak.png")));
				gridBagConstraints10.gridx = 0;
				gridBagConstraints10.gridy = 1;
				gridBagConstraints10.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints10.fill = java.awt.GridBagConstraints.VERTICAL;
				gridBagConstraints10.insets = new java.awt.Insets(0,0,0,5);
				iconPlayerName.setText("Player Name");
				iconPlayerName.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/player.png")));
				gridBagConstraints11.gridx = 1;
				gridBagConstraints11.gridy = 0;
				gridBagConstraints11.weightx = 1.0;
				gridBagConstraints11.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints11.anchor = java.awt.GridBagConstraints.EAST;
				gridBagConstraints12.gridx = 1;
				gridBagConstraints12.gridy = 1;
				gridBagConstraints12.weightx = 1.0;
				gridBagConstraints12.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints12.anchor = java.awt.GridBagConstraints.EAST;
				NamePanel.add(iconClanName, gridBagConstraints9);
				NamePanel.add(iconPlayerName, gridBagConstraints10);
				NamePanel.add(getClanName(), gridBagConstraints11);
				NamePanel.add(getPlayerName(), gridBagConstraints12);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getNamePanel< ist fehlgeschlagen!");
			}
		}
		return NamePanel;
	}
   
	private JTextField getClanName() {
		if (ClanName == null) {
			try {
				ClanName = new JTextField();
				ClanName.addKeyListener(new java.awt.event.KeyAdapter() {   
					public void keyReleased(java.awt.event.KeyEvent e) {    
						NameOutput.setText("<html><center><font face='verdana'><font size='5'>Output:</font> <font size='4'>" + ClanName.getText() + PlayerName.getText() + "</font></font></center></html>");
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getClanName< ist fehlgeschlagen!");
			}
		}
		return ClanName;
	}
   
	private JTextField getPlayerName() {
		if (PlayerName == null) {
			try {
				PlayerName = new JTextField();
				PlayerName.addKeyListener(new java.awt.event.KeyAdapter() { 
					public void keyReleased(java.awt.event.KeyEvent e) {    
						NameOutput.setText("<html><center><font face='verdana'><font size='5'>Output:</font> <font size='4'>" + ClanName.getText() + PlayerName.getText() + "</font></font></center></html>");
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getPlayerName< ist fehlgeschlagen!");
			}
		}
		return PlayerName;
	}
  
	private JPanel getOutputPanel() {
		if (OutputPanel == null) {
			try {
				GridLayout gridLayout13 = new GridLayout();
				OutputPanel = new JPanel();
				OutputPanel.setLayout(gridLayout13);
				OutputPanel.setBounds(5, 195, 380, 138);
				gridLayout13.setRows(1);
				OutputPanel.add(getNameOutput(), null);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getOutputPanel< ist fehlgeschlagen!");
			}
		}
		return OutputPanel;
	}
   
	private JTextPane getNameOutput() {
		if (NameOutput == null) {
			try {
				NameOutput = new JTextPane();
				NameOutput.setContentType("text/html");
				NameOutput.setEditable(false);
				NameOutput.setText(langMan.getTheText(langMan.PC_OUTPUT));
				NameOutput.setBackground(new java.awt.Color(238,238,238));
				NameOutput.setOpaque(false);
				NameOutput.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.PLAYERCLANOUTPUT);
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getNameOutput< ist fehlgeschlagen!");
			}
		}
		return NameOutput;
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"