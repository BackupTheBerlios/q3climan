
package de.q3cm.sub.wiz;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class WP_step5 extends JPanel {

	private JPanel wp5_Panel = null;
	private JLabel pass_Label = null;
	private JPasswordField pass_PasswordField = null;
	private JLabel cfg_Label = null;
	private JTextField cfg_TextField = null;
	private JButton cfg_Button = null;
	private JLabel mod_Label = null;
	private JComboBox mod_ComboBox = null;
	private JButton pass_Button = null;
	
	public WP_step5() {
		super();
		initialize();
	}

	private void initialize() {
		try {
            this.setLayout(null);
            this.setSize(390, 338);
            this.setPreferredSize(new java.awt.Dimension(390,338));
            this.add(getWp5_Panel(), null);
		}
		catch (java.lang.Throwable e) {
		    System.err.println("Laden des >WP_step5 initialize< ist fehlgeschlagen!");
		}
	}
   
	private JPanel getWp5_Panel() {
		if (wp5_Panel == null) {
			try {
				GridBagConstraints gridBagConstraints28 = new GridBagConstraints();
				wp5_Panel = new JPanel();
				pass_Label = new JLabel();
				cfg_Label = new JLabel();
				mod_Label = new JLabel();
				GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints22 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints23 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints24 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints25 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints26 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints27 = new GridBagConstraints();
				wp5_Panel.setLayout(new GridBagLayout());
				gridBagConstraints21.gridx = 0;
				gridBagConstraints21.gridy = 0;
				gridBagConstraints21.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints21.fill = java.awt.GridBagConstraints.VERTICAL;
				gridBagConstraints21.insets = new java.awt.Insets(0,0,0,5);
				pass_Label.setText("Client Password");
				gridBagConstraints22.gridx = 1;
				gridBagConstraints22.gridy = 0;
				gridBagConstraints22.weightx = 1.0;
				gridBagConstraints22.fill = java.awt.GridBagConstraints.BOTH;
				gridBagConstraints22.gridwidth = 1;
				gridBagConstraints22.insets = new java.awt.Insets(0,0,0,5);
				gridBagConstraints23.gridx = 0;
				gridBagConstraints23.gridy = 1;
				gridBagConstraints23.fill = java.awt.GridBagConstraints.VERTICAL;
				gridBagConstraints23.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints23.insets = new java.awt.Insets(0,0,0,5);
				cfg_Label.setText("Default CFG to exec.");
				gridBagConstraints24.gridx = 1;
				gridBagConstraints24.gridy = 1;
				gridBagConstraints24.weightx = 1.0;
				gridBagConstraints24.fill = java.awt.GridBagConstraints.BOTH;
				gridBagConstraints24.insets = new java.awt.Insets(0,0,0,5);
				gridBagConstraints25.gridx = 2;
				gridBagConstraints25.gridy = 1;
				gridBagConstraints25.anchor = java.awt.GridBagConstraints.EAST;
				gridBagConstraints25.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints26.gridx = 0;
				gridBagConstraints26.gridy = 2;
				gridBagConstraints26.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints26.fill = java.awt.GridBagConstraints.VERTICAL;
				gridBagConstraints26.insets = new java.awt.Insets(0,0,0,5);
				mod_Label.setText("Default Mod");
				mod_Label.setPreferredSize(new java.awt.Dimension(58,22));
				gridBagConstraints27.insets = new java.awt.Insets(0,0,0,0);
				cfg_Label.setPreferredSize(new java.awt.Dimension(101,22));
				pass_Label.setPreferredSize(new java.awt.Dimension(76,22));
				gridBagConstraints27.gridx = 1;
				gridBagConstraints27.gridy = 2;
				gridBagConstraints27.weightx = 1.0;
				gridBagConstraints27.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints27.gridwidth = 2;
				gridBagConstraints27.anchor = java.awt.GridBagConstraints.EAST;
				wp5_Panel.setLocation(5, 120);
				wp5_Panel.setSize(380, 85);
				wp5_Panel.setPreferredSize(new java.awt.Dimension(180,65));
				gridBagConstraints28.gridx = 2;
				gridBagConstraints28.gridy = 0;
				gridBagConstraints28.anchor = java.awt.GridBagConstraints.EAST;
				gridBagConstraints28.fill = java.awt.GridBagConstraints.HORIZONTAL;
				wp5_Panel.add(pass_Label, gridBagConstraints21);
				wp5_Panel.add(getPass_PasswordField(), gridBagConstraints22);
				wp5_Panel.add(getPass_Button(), gridBagConstraints28);
				wp5_Panel.add(cfg_Label, gridBagConstraints23);
				wp5_Panel.add(getCfg_TextField(), gridBagConstraints24);
				wp5_Panel.add(getCfg_Button(), gridBagConstraints25);
				wp5_Panel.add(mod_Label, gridBagConstraints26);
				wp5_Panel.add(getMod_ComboBox(), gridBagConstraints27);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getWp5_Panel< ist fehlgeschlagen!");
			}
		}
		return wp5_Panel;
	}
   
	private JPasswordField getPass_PasswordField() {
		if (pass_PasswordField == null) {
			try {
				pass_PasswordField = new JPasswordField();
				pass_PasswordField.setEchoChar('#');
				pass_PasswordField.setPreferredSize(new java.awt.Dimension(7,22));
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getPass_PasswordField< ist fehlgeschlagen!");
			}
		}
		return pass_PasswordField;
	}
  
	private JTextField getCfg_TextField() {
		if (cfg_TextField == null) {
			try {
				cfg_TextField = new JTextField();
				cfg_TextField.setPreferredSize(new java.awt.Dimension(7,22));
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getCfg_TextField< ist fehlgeschlagen!");
			}
		}
		return cfg_TextField;
	}
   
	private JButton getCfg_Button() {
		if (cfg_Button == null) {
			try {
				cfg_Button = new JButton();
				cfg_Button.setText("Browse");
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getCfg_Button< ist fehlgeschlagen!");
			}
		}
		return cfg_Button;
	}
  
	private JComboBox getMod_ComboBox() {
		if (mod_ComboBox == null) {
			try {
				mod_ComboBox = new JComboBox();
				mod_ComboBox.setPreferredSize(new java.awt.Dimension(125,22));
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getMod_ComboBox< ist fehlgeschlagen!");
			}
		}
		return mod_ComboBox;
	}
  
	private JButton getPass_Button() {
		if (pass_Button == null) {
			try {
				pass_Button = new JButton();
				pass_Button.setText("< View");
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getPass_Button< ist fehlgeschlagen!");
			}
		}
		return pass_Button;
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"