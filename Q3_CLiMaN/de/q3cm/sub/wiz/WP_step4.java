
package de.q3cm.sub.wiz;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class WP_step4 extends JPanel {

	private JPanel RailSelectColor_Panel = null;
	private JLabel cR_Label = null;
	private JComboBox cR_ComboBox = null;
	private JComboBox c1_ComboBox = null;
	private JComboBox c2_ComboBox = null;
	private JLabel c1_Label = null;
	private JLabel c2_Label = null;
	private JPanel RailPicColor_Panel = null;
	private JPanel RailInfo_Panel = null;
	private JTextArea RailInfo_TextArea = null;
	
	public WP_step4() {
		super();
		initialize();
	}

	private void initialize() {
		try {
            this.setLayout(null);
            this.setSize(390, 338);
            this.setPreferredSize(new java.awt.Dimension(390,338));
            this.add(getRailSelectColor_Panel(), null);
            this.add(getRailPicColor_Panel(), null);
            this.add(getRailInfo_Panel(), null);
		}
		catch (java.lang.Throwable e) {
		    System.err.println("Laden des >WP_step4 initialize< ist fehlgeschlagen!");
		}
	}
   
	private JPanel getRailSelectColor_Panel() {
		if (RailSelectColor_Panel == null) {
			try {
				RailSelectColor_Panel = new JPanel();
				cR_Label = new JLabel();
				c1_Label = new JLabel();
				c2_Label = new JLabel();
				GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints18 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
				RailSelectColor_Panel.setLayout(new GridBagLayout());
				RailSelectColor_Panel.setLocation(144, 130);
				RailSelectColor_Panel.setSize(240, 60);
				gridBagConstraints15.gridx = 1;
				gridBagConstraints15.gridy = 0;
				gridBagConstraints15.fill = java.awt.GridBagConstraints.VERTICAL;
				gridBagConstraints15.insets = new java.awt.Insets(0,0,0,5);
				cR_Label.setText("cR");
				gridBagConstraints16.gridx = 2;
				gridBagConstraints16.gridy = 0;
				gridBagConstraints16.weightx = 1.0;
				gridBagConstraints16.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints16.anchor = java.awt.GridBagConstraints.CENTER;
				gridBagConstraints17.gridx = 2;
				gridBagConstraints17.gridy = 1;
				gridBagConstraints17.weightx = 1.0;
				gridBagConstraints17.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints17.anchor = java.awt.GridBagConstraints.CENTER;
				gridBagConstraints18.gridx = 2;
				gridBagConstraints18.gridy = 2;
				gridBagConstraints18.weightx = 1.0;
				gridBagConstraints18.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints18.anchor = java.awt.GridBagConstraints.CENTER;
				gridBagConstraints19.gridx = 1;
				gridBagConstraints19.gridy = 1;
				gridBagConstraints19.fill = java.awt.GridBagConstraints.VERTICAL;
				gridBagConstraints19.insets = new java.awt.Insets(0,0,0,5);
				c1_Label.setText("C1");
				gridBagConstraints20.gridx = 1;
				gridBagConstraints20.gridy = 2;
				gridBagConstraints20.fill = java.awt.GridBagConstraints.VERTICAL;
				gridBagConstraints20.insets = new java.awt.Insets(0,0,0,5);
				c2_Label.setText("C2");
				RailSelectColor_Panel.add(cR_Label, gridBagConstraints15);
				RailSelectColor_Panel.add(getCR_ComboBox(), gridBagConstraints16);
				RailSelectColor_Panel.add(getC1_ComboBox(), gridBagConstraints17);
				RailSelectColor_Panel.add(getC2_ComboBox(), gridBagConstraints18);
				RailSelectColor_Panel.add(c1_Label, gridBagConstraints19);
				RailSelectColor_Panel.add(c2_Label, gridBagConstraints20);
			} catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getRailSelectColor_Panel< ist fehlgeschlagen!");
			}
		}
		return RailSelectColor_Panel;
	}
   
	private JComboBox getCR_ComboBox() {
		if (cR_ComboBox == null) {
			try {
				cR_ComboBox = new JComboBox();
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getCR_ComboBox< ist fehlgeschlagen!");
			}
		}
		return cR_ComboBox;
	}
   
	private JComboBox getC1_ComboBox() {
		if (c1_ComboBox == null) {
			try {
				c1_ComboBox = new JComboBox();
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getC1_ComboBox< ist fehlgeschlagen!");
			}
		}
		return c1_ComboBox;
	}
   
	private JComboBox getC2_ComboBox() {
		if (c2_ComboBox == null) {
			try {
				c2_ComboBox = new JComboBox();
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getC2_ComboBox< ist fehlgeschlagen!");
			}
		}
		return c2_ComboBox;
	}
   
	private JPanel getRailPicColor_Panel() {
		if (RailPicColor_Panel == null) {
			try {
				RailPicColor_Panel = new JPanel();
				RailPicColor_Panel.setLocation(5, 96);
				RailPicColor_Panel.setSize(128, 128);
				RailPicColor_Panel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getRailPicColor_Panel< ist fehlgeschlagen!");
			}
		}
		return RailPicColor_Panel;
	}
 
	private JPanel getRailInfo_Panel() {
		if (RailInfo_Panel == null) {
			try {
				GridLayout gridLayout1 = new GridLayout();
				RailInfo_Panel = new JPanel();
				RailInfo_Panel.setLayout(gridLayout1);
				RailInfo_Panel.setBounds(5, 5, 380, 65);
				gridLayout1.setRows(1);
				RailInfo_Panel.add(getRailInfo_TextArea(), null);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getRailInfo_Panel< ist fehlgeschlagen!");
			}
		}
		return RailInfo_Panel;
	}
    
	private JTextArea getRailInfo_TextArea() {
		if (RailInfo_TextArea == null) {
			try {
				RailInfo_TextArea = new JTextArea();
				RailInfo_TextArea.setOpaque(false);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getRailInfo_TextArea< ist fehlgeschlagen!");
			}
		}
		return RailInfo_TextArea;
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"