
package de.q3cm.sub.wiz;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextPane;

import de.q3cm.CM_main;
import de.q3cm.libs.langMan;

public class WP_step3 extends JPanel {

	private JPanel infoPanel = null;
	private JPanel FOVPanel = null;
	private JSlider fovSlider = null;
	private JLabel fovLabelOutput = null;
	private JTextPane headerTextPane = null;
	public int fovAngel = 100;
	private JPanel FOVPaneloutput = null;
	private JLabel test = null;
	private JPanel FOVpicPanel = null;
	private JLabel FOVpic = null;
	
	public WP_step3() {
		super();
		initialize();
	}

	private void initialize() {
		try {
            this.setLayout(null);
            this.setSize(390, 338);
            this.setPreferredSize(new java.awt.Dimension(390,338));
            this.add(getInfoPanel(), null);
            this.add(getFOVPanel(), null);
            this.add(getFOVPaneloutput(), null);
            this.add(getFOVpicPanel(), null);
		}
		catch (java.lang.Throwable e) {
		    System.err.println("Laden des >WP_step3 initialize< ist fehlgeschlagen!");
		}
	}
  
	private JPanel getInfoPanel() {
		if (infoPanel == null) {
			try {
				infoPanel = new JPanel();
				GridLayout gridLayout3 = new GridLayout();
				infoPanel.setLayout(gridLayout3);
				infoPanel.setBounds(5, 5, 380, 63);
				gridLayout3.setRows(1);
				infoPanel.add(getHeaderTextPane(), null);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getInfoPanel< ist fehlgeschlagen!");
			}
		}
		return infoPanel;
	}
   
	private JPanel getFOVPanel() {
		if (FOVPanel == null) {
			try {
				GridLayout gridLayout5 = new GridLayout();
				FOVPanel = new JPanel();
				fovLabelOutput = new JLabel();
				FOVPanel.setLayout(gridLayout5);
				FOVPanel.setBounds(5, 70, 380, 46);
				fovLabelOutput.setText(langMan.getTheText(langMan.FOVOUTPUT) + "90°  /  ( Pic: 90° )");
				fovLabelOutput.setFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12));
				fovLabelOutput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
				fovLabelOutput.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
				gridLayout5.setRows(1);
				FOVPanel.add(getFovSlider(), null);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getFOVPanel< ist fehlgeschlagen!");
			}
		}
		return FOVPanel;
	}
  
	private JSlider getFovSlider() {
		if (fovSlider == null) {
			try {
				fovSlider = new JSlider();
				fovSlider.setMaximum(300);
				fovSlider.setMinimum(60);
				fovSlider.setMajorTickSpacing(30);
				fovSlider.setMinorTickSpacing(5);
				fovSlider.setName("fovSlider");
				fovSlider.setPaintLabels(true);
				fovSlider.setPaintTicks(true);
				fovSlider.setPaintTrack(true);
				fovSlider.setValue(90);
				fovSlider.setSnapToTicks(false);
				fovSlider.setExtent(0);
				fovSlider.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
				fovSlider.setPreferredSize(new java.awt.Dimension(200,40));
				fovSlider.setFont(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 10));
				fovSlider.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.FOVSCROLLER);
					}
				});
				fovSlider.addChangeListener(new javax.swing.event.ChangeListener() { 
					public void stateChanged(javax.swing.event.ChangeEvent e) {    
						int FOVrounded = Math.round(fovSlider.getValue() / 5)*5;
						fovLabelOutput.setText(langMan.getTheText(langMan.FOVOUTPUT) + fovSlider.getValue() + "°  /   ( Pic: "+FOVrounded+"° )");
						FOVpic.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/fov/FOVpic_" + FOVrounded + ".jpg")));

						/*try {
							RandomAccessFile FOVpicture = new RandomAccessFile( "/gfx/FOV/FOV_" + FOVrounded + ".jpg", "r" );
				        } catch ( FileNotFoundException ex ) {
				            System.err.println( "FOV Picture (" + FOVpicture + ") was not found!" );
				        } catch ( IOException ex ) {
				            System.err.println( "FOV Picture (" + FOVpicture + ") could not be read!" );
				        }*/
				        
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getFovSlider< ist fehlgeschlagen!");
			}
		}
		return fovSlider;
	}
   
	private JTextPane getHeaderTextPane() {
		if (headerTextPane == null) {
			try {
				headerTextPane = new JTextPane();
				headerTextPane.setContentType("text/html");
				headerTextPane.setEditable(false);
				headerTextPane.setName("headerTextPane");
				headerTextPane.setBackground(new java.awt.Color(238,238,238));
				headerTextPane.setText(langMan.getTheText(langMan.HEADWIZARDINFO_02));
				headerTextPane.setOpaque(false);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getHeaderTextPane< ist fehlgeschlagen!");
			}
		}
		return headerTextPane;
	}
   
	private JPanel getFOVPaneloutput() {
		if (FOVPaneloutput == null) {
			try {
				FOVPaneloutput = new JPanel();
				fovLabelOutput = new JLabel();
				GridLayout gridLayout4 = new GridLayout();
				FOVPaneloutput.setLayout(gridLayout4);
				FOVPaneloutput.setBounds(5, 305, 380, 19);
				gridLayout4.setRows(1);
				fovLabelOutput.setText(langMan.getTheText(langMan.FOVOUTPUT) + "90°  /  ( Pic: 90° )");
				fovLabelOutput.setFont(new java.awt.Font("Dialog", java.awt.Font.BOLD, 12));
				fovLabelOutput.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
				fovLabelOutput.setVerticalAlignment(javax.swing.SwingConstants.TOP);
				FOVPaneloutput.add(fovLabelOutput, null);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getFOVPaneloutput< ist fehlgeschlagen!");
			}
		}
		return FOVPaneloutput;
	}
   
	private JPanel getFOVpicPanel() {
		if (FOVpicPanel == null) {
			try {
				FOVpicPanel = new JPanel();
				FOVpic = new JLabel();
				GridLayout gridLayout6 = new GridLayout();
				FOVpicPanel.setLayout(gridLayout6);
				FOVpicPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
				FOVpicPanel.setLocation(90, 135);
				FOVpicPanel.setSize(204, 154);
				FOVpicPanel.setBackground(new java.awt.Color(79,87,74));
				FOVpicPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
				gridLayout6.setRows(1);
				FOVpic.setText("");
				FOVpic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
				FOVpic.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
				FOVpic.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/fov/FOVpic_90.jpg")));
				FOVpic.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
				FOVpicPanel.add(FOVpic, null);
				FOVpic.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.FOVPIC);
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getFOVpicPanel< ist fehlgeschlagen!");
			}
		}
		return FOVpicPanel;
	}
}  //  @jve:decl-index=0:visual-constraint="10,10"