
package de.q3cm.sub.wiz;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class WP_step2 extends JPanel {

	private JPanel conn_type_Panel = null;
	private JPanel conn_sets_Panel = null;
	private JLabel nudgs_Label = null;
	private JSlider nudgs_Slider = null;
	private JLabel FPS_Label = null;
	private JSlider FPS_Slider = null;
	private JLabel packest_Label = null;
	private JSlider packest_Slider = null;
	private JLabel drops_Label = null;
	private JSlider drops_Slider = null;
	private JLabel sraps_Label = null;
	private JSlider sraps_Slider = null;
	private JLabel conn_type_Label = null;
	private JComboBox conn_type_ComboBox = null;
	
	public WP_step2() {
		super();
		initialize();
	}

	private void initialize() {
		try {
            this.setLayout(null);
            this.setSize(390, 338);
            this.setPreferredSize(new java.awt.Dimension(390,338));
            this.add(getConn_type_Panel(), null);
            this.add(getConn_sets_Panel(), null);
		} catch (java.lang.Throwable e) {
		    System.err.println("Laden des >WP_step2 initialize< ist fehlgeschlagen!");
		}
	}
   
	private JPanel getConn_type_Panel() {
		if (conn_type_Panel == null) {
			try {
				conn_type_Panel = new JPanel();
				conn_type_Label = new JLabel();
				GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
				conn_type_Panel.setLayout(new GridBagLayout());
				conn_type_Panel.setPreferredSize(new java.awt.Dimension(60,25));
				conn_type_Panel.setLocation(5, 5);
				conn_type_Panel.setSize(380, 25);
				gridBagConstraints12.gridx = 0;
				gridBagConstraints12.gridy = 0;
				gridBagConstraints12.fill = java.awt.GridBagConstraints.BOTH;
				gridBagConstraints12.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints12.insets = new java.awt.Insets(0,10,0,5);
				conn_type_Label.setText("Set connection type");
				gridBagConstraints13.insets = new java.awt.Insets(0,0,0,10);
				conn_type_Panel.add(conn_type_Label, gridBagConstraints12);
				conn_type_Panel.add(getConn_type_ComboBox(), gridBagConstraints13);
				gridBagConstraints13.gridx = 1;
				gridBagConstraints13.gridy = 0;
				gridBagConstraints13.weightx = 1.0;
				gridBagConstraints13.fill = java.awt.GridBagConstraints.BOTH;
				gridBagConstraints13.anchor = java.awt.GridBagConstraints.EAST;
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConn_type_Panel< ist fehlgeschlagen!");
			}
		}
		return conn_type_Panel;
	}
  
	private JPanel getConn_sets_Panel() {
		if (conn_sets_Panel == null) {
			try {
				conn_sets_Panel = new JPanel();
				nudgs_Label = new JLabel();
				FPS_Label = new JLabel();
				packest_Label = new JLabel();
				drops_Label = new JLabel();
				sraps_Label = new JLabel();
				GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
				conn_sets_Panel.setLayout(new GridBagLayout());
				conn_sets_Panel.setBounds(5, 38, 380, 295);
				gridBagConstraints2.gridx = 0;
				gridBagConstraints2.gridy = 0;
				gridBagConstraints2.anchor = java.awt.GridBagConstraints.CENTER;
				gridBagConstraints2.fill = java.awt.GridBagConstraints.HORIZONTAL;
				nudgs_Label.setText("Time Nudgs");
				nudgs_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
				gridBagConstraints3.gridx = 0;
				gridBagConstraints3.gridy = 1;
				gridBagConstraints3.weightx = 1.0;
				gridBagConstraints3.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints4.gridx = 0;
				gridBagConstraints4.gridy = 2;
				gridBagConstraints4.fill = java.awt.GridBagConstraints.HORIZONTAL;
				FPS_Label.setText("Maximum Frames Per Second (FPS)");
				FPS_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
				gridBagConstraints5.gridx = 0;
				gridBagConstraints5.gridy = 3;
				gridBagConstraints5.weightx = 1.0;
				gridBagConstraints5.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints6.gridx = 0;
				gridBagConstraints6.gridy = 4;
				gridBagConstraints6.fill = java.awt.GridBagConstraints.HORIZONTAL;
				packest_Label.setText("Maximum Packest");
				packest_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
				gridBagConstraints7.gridx = 0;
				gridBagConstraints7.gridy = 5;
				gridBagConstraints7.weightx = 1.0;
				gridBagConstraints7.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints8.gridx = 0;
				gridBagConstraints8.gridy = 6;
				gridBagConstraints8.fill = java.awt.GridBagConstraints.HORIZONTAL;
				drops_Label.setText("Minimum Packet drops");
				drops_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
				gridBagConstraints9.gridx = 0;
				gridBagConstraints9.gridy = 7;
				gridBagConstraints9.weightx = 1.0;
				gridBagConstraints9.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints10.gridx = 0;
				gridBagConstraints10.gridy = 8;
				gridBagConstraints10.fill = java.awt.GridBagConstraints.HORIZONTAL;
				sraps_Label.setText("Maximum Sraps");
				sraps_Label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
				gridBagConstraints11.gridx = 0;
				gridBagConstraints11.gridy = 9;
				gridBagConstraints11.weightx = 1.0;
				gridBagConstraints11.fill = java.awt.GridBagConstraints.HORIZONTAL;
				conn_sets_Panel.add(nudgs_Label, gridBagConstraints2);
				conn_sets_Panel.add(getNudgs_Slider(), gridBagConstraints3);
				conn_sets_Panel.add(FPS_Label, gridBagConstraints4);
				conn_sets_Panel.add(getFPS_Slider(), gridBagConstraints5);
				conn_sets_Panel.add(packest_Label, gridBagConstraints6);
				conn_sets_Panel.add(getPackest_Slider(), gridBagConstraints7);
				conn_sets_Panel.add(drops_Label, gridBagConstraints8);
				conn_sets_Panel.add(getDrops_Slider(), gridBagConstraints9);
				conn_sets_Panel.add(sraps_Label, gridBagConstraints10);
				conn_sets_Panel.add(getSraps_Slider(), gridBagConstraints11);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConn_sets_Panel< ist fehlgeschlagen!");
			}
		}
		return conn_sets_Panel;
	}
   
	private JSlider getNudgs_Slider() {
		if (nudgs_Slider == null) {
			try {
				nudgs_Slider = new JSlider();
				nudgs_Slider.setPaintLabels(true);
				nudgs_Slider.setPaintTicks(true);
				nudgs_Slider.setMajorTickSpacing(25);
				nudgs_Slider.setMinorTickSpacing(5);
				nudgs_Slider.setPreferredSize(new java.awt.Dimension(200,40));
				nudgs_Slider.setPaintTrack(true);
				nudgs_Slider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getNudgs_Slider< ist fehlgeschlagen!");
			}
		}
		return nudgs_Slider;
	}
  
	private JSlider getFPS_Slider() {
		if (FPS_Slider == null) {
			try {
				FPS_Slider = new JSlider();
				FPS_Slider.setPaintTicks(true);
				FPS_Slider.setPaintLabels(true);
				FPS_Slider.setMajorTickSpacing(50);
				FPS_Slider.setMinorTickSpacing(10);
				FPS_Slider.setPreferredSize(new java.awt.Dimension(200,40));
				FPS_Slider.setName("");
				FPS_Slider.setComponentOrientation(java.awt.ComponentOrientation.UNKNOWN);
				FPS_Slider.setMaximum(300);
				FPS_Slider.setMinimum(50);
				FPS_Slider.setValue(125);
				FPS_Slider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getFPS_Slider< ist fehlgeschlagen!");
			}
		}
		return FPS_Slider;
	}

	private JSlider getPackest_Slider() {
		if (packest_Slider == null) {
			try {
				packest_Slider = new JSlider();
				packest_Slider.setMajorTickSpacing(25);
				packest_Slider.setMinorTickSpacing(5);
				packest_Slider.setPaintLabels(true);
				packest_Slider.setPaintTicks(true);
				packest_Slider.setPreferredSize(new java.awt.Dimension(200,40));
				packest_Slider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getPackest_Slider< ist fehlgeschlagen!");
			}
		}
		return packest_Slider;
	}

	private JSlider getDrops_Slider() {
		if (drops_Slider == null) {
			try {
				drops_Slider = new JSlider();
				drops_Slider.setMajorTickSpacing(25);
				drops_Slider.setMinorTickSpacing(5);
				drops_Slider.setPaintLabels(true);
				drops_Slider.setPaintTicks(true);
				drops_Slider.setPreferredSize(new java.awt.Dimension(200,40));
				drops_Slider.setValue(0);
				drops_Slider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getDrops_Slider< ist fehlgeschlagen!");
			}
		}
		return drops_Slider;
	}

	private JSlider getSraps_Slider() {
		if (sraps_Slider == null) {
			try {
				sraps_Slider = new JSlider();
				sraps_Slider.setPaintLabels(true);
				sraps_Slider.setPaintTicks(true);
				sraps_Slider.setMajorTickSpacing(25);
				sraps_Slider.setMinorTickSpacing(5);
				sraps_Slider.setPreferredSize(new java.awt.Dimension(200,40));
				sraps_Slider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getSraps_Slider< ist fehlgeschlagen!");
			}
		}
		return sraps_Slider;
	}
 
	private JComboBox getConn_type_ComboBox() {
		if (conn_type_ComboBox == null) {
			try {
				conn_type_ComboBox = new JComboBox();
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConn_type_ComboBox< ist fehlgeschlagen!");
			}
		}
		return conn_type_ComboBox;
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"