package de.q3cm.sub.subs;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import de.q3cm.CM_main;
import de.q3cm.libs.langMan;
import de.q3cm.sub.wiz.WP_step1;
import de.q3cm.sub.wiz.WP_step2;
import de.q3cm.sub.wiz.WP_step3;
import de.q3cm.sub.wiz.WP_step4;
import de.q3cm.sub.wiz.WP_step5;

public class CM_new extends JPanel {
		
	private JPanel newButtonPanel = null;
	private JButton newAbortButton = null;
	private JButton newLastButton = null;
	private JButton newNextButton = null;
	private JPanel newWizardPanels = null;

	private WP_step1 wP_step1 = null;
	private WP_step2 wP_step2 = null;
	private WP_step3 wP_step3 = null;
	private WP_step4 wP_step4 = null;
	private WP_step5 wP_step5 = null;
	
	public int WizardStepPos = 1;
	public int WizardStepMin = 1;
	public int WizardStepMax = 5;
	
	private JPanel newInfoHeaderPanel = null;
	private JLabel newTopicLabel = null;
	private JLabel newWizardStepInfo = null;

	private JPanel showDialogContentPane = null;
	private JDialog showDialog = null;  //  @jve:decl-index=0:visual-constraint="435,16"
	
	// Default Construktor
	public CM_new() {
		super();
		initialize();
	}
	
	// Initializierungs von CM_new
	private void initialize() {
	    try {
			this.setLayout(null);
			this.setSize(400, 400);
			this.add(getNewButtonPanel(), null);
			this.add(getNewWizardPanels(), null);
			this.add(getNewInfoHeaderPanel(), null);
		} catch (java.lang.Throwable e) {
		    System.err.println("Laden des >CM_New initialize< ist fehlgeschlagen!");
		}
	}
	
	// Knöpfe (abort, last, next & finsh)
	private JPanel getNewButtonPanel() {
		if (newButtonPanel == null) {
			try {
				GridLayout gridLayout5 = new GridLayout();
				newButtonPanel = new JPanel();
				newButtonPanel.setLayout(gridLayout5);
				newButtonPanel.setBounds(5, 370, 390, 25);
				gridLayout5.setRows(1);
				gridLayout5.setColumns(3);
				newButtonPanel.add(getNewAbortButton(), null);
				newButtonPanel.add(getNewLastButton(), null);
				newButtonPanel.add(getNewNextButton(), null);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getNewButtonPanel< ist fehlgeschlagen!");
			}
		}
		return newButtonPanel;
	}
   
	// Abort Button
	private JButton getNewAbortButton() {
		if (newAbortButton == null) {
			try {
				newAbortButton = new JButton();
				newAbortButton.setText("Abort");
				newAbortButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/abort.gif")));
				newAbortButton.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NEWABORTBUTTON);
					}
				});
				newAbortButton.addActionListener(new java.awt.event.ActionListener() { 
					public void actionPerformed(java.awt.event.ActionEvent e) {    

						CM_main.getInstance().getCM_controller().getSelectPlayer().setEnabled(true);
						CM_main.getInstance().getCM_controller().getSelectMod().setEnabled(true);
						CM_main.getInstance().getCM_controller().getSelectServer().setEnabled(true);
						
						CM_main.getInstance().getCM_controller().getEditButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getRunButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getLoadButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getNewButton().setEnabled(true);

						CM_main.getInstance().getCM_controller().getConfigButton().setEnabled(true);

						CM_new.this.setVisible(false);
						CM_main.getInstance().setSize(210,433);
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getNewAbortButton< ist fehlgeschlagen!");
			}
		}
		return newAbortButton;
	}
    
	// Letzer Schritt Button
	private JButton getNewLastButton() {
		if (newLastButton == null) {
			try {
				newLastButton = new JButton();
				newLastButton.setText("Last");
				newLastButton.setEnabled(false);
				newLastButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/links.png")));
				newLastButton.addActionListener(new java.awt.event.ActionListener() { 
					public void actionPerformed(java.awt.event.ActionEvent e) {    
					    
					    WizardStepPos--;

					    if(WizardStepPos==WizardStepMin){
						    newLastButton.setEnabled(false);
						    newNextButton.setText("Next");
							newNextButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/rechts.png")));
						} else {
						    newLastButton.setEnabled(true);
						    newNextButton.setText("Next");
							newNextButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/rechts.png")));
						}
						
					    newWizardStepInfo.setText("Step " + WizardStepPos + " / " + WizardStepMax + " ");

					    wP_step1.setVisible(false);
					    wP_step2.setVisible(false);					
					    wP_step3.setVisible(false);					
					    wP_step4.setVisible(false);					
					    wP_step5.setVisible(false);
					    
					    switch (WizardStepPos) {
					     case 1: wP_step1.setVisible(true);
					     case 2: wP_step2.setVisible(true);
					     case 3: wP_step3.setVisible(true);
					     case 4: wP_step4.setVisible(true);
					     case 5: wP_step5.setVisible(true);
					    }
					}
				});
				newLastButton.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NEWLASTBUTTON);
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getNewLastButton< ist fehlgeschlagen!");
			}
		}
		return newLastButton;
	}
  
	// Nächster Schritt Button
	private JButton getNewNextButton() {
		if (newNextButton == null) {
			try {
				newNextButton = new JButton();
				newNextButton.setText("Next");
				newNextButton.setEnabled(true);
				newNextButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/rechts.png")));
				newNextButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
				newNextButton.addActionListener(new java.awt.event.ActionListener() { 
					public void actionPerformed(java.awt.event.ActionEvent e) {    
					    
						if (WizardStepPos<WizardStepMax) {
							WizardStepPos++;
						} else {
								CM_main.getInstance().getCM_controller().getSelectPlayer().setEnabled(true);
								CM_main.getInstance().getCM_controller().getSelectMod().setEnabled(true);
								CM_main.getInstance().getCM_controller().getSelectServer().setEnabled(true);
								
								CM_main.getInstance().getCM_controller().getEditButton().setEnabled(true);
								CM_main.getInstance().getCM_controller().getRunButton().setEnabled(true);
								CM_main.getInstance().getCM_controller().getLoadButton().setEnabled(true);
								CM_main.getInstance().getCM_controller().getNewButton().setEnabled(true);

								CM_main.getInstance().getCM_controller().getConfigButton().setEnabled(true);

					            JOptionPane.showMessageDialog(showDialog, "<html>The settings where sucsessfull saved.</html>", "Save settings", JOptionPane.INFORMATION_MESSAGE);

					            CM_new.this.setVisible(false);
								CM_main.getInstance().setSize(210,433);
						}

						if(WizardStepPos==WizardStepMax){
						    newLastButton.setEnabled(true);
						    newNextButton.setText("Save");
							newNextButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/save.png")));
						} else {
						    newLastButton.setEnabled(true);
						    newNextButton.setText("Next");
							newNextButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/rechts.png")));
						}

						newWizardStepInfo.setText("Step " + WizardStepPos + " / " + WizardStepMax + " ");

						wP_step1.setVisible(false);
					    wP_step2.setVisible(false);					
					    wP_step3.setVisible(false);					
					    wP_step4.setVisible(false);					
					    wP_step5.setVisible(false);
					    
					    switch (WizardStepPos) {
					     case 1: wP_step1.setVisible(true);
					     case 2: wP_step2.setVisible(true);
					     case 3: wP_step3.setVisible(true);
					     case 4: wP_step4.setVisible(true);
					     case 5: wP_step5.setVisible(true);
					    }
					}
				});
				newNextButton.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NEWNEXTBUTTON);
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getNewNextButton< ist fehlgeschlagen!");
			}
		}
		return newNextButton;
	}

	// Wizard Panels werden eingeklingt
	private JPanel getNewWizardPanels() {
		if (newWizardPanels == null) {
			try {
				newWizardPanels = new JPanel();
				newWizardPanels.setLayout(null);
				newWizardPanels.setBounds(5, 27, 390, 338);
				newWizardPanels.setPreferredSize(new java.awt.Dimension(390,338));
				
				newWizardPanels.add(getWP_step1(), null);
				newWizardPanels.add(getWP_step2(), null);
				newWizardPanels.add(getWP_step3(), null);
				newWizardPanels.add(getWP_step4(), null);
				newWizardPanels.add(getWP_step5(), null);
				
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getNewWizardPanels< ist fehlgeschlagen!");
			}
		}
		return newWizardPanels;
	}

	// Wizard Step.1 (getKlasse)
	private WP_step1 getWP_step1() {
		if (wP_step1 == null) {
			try {
				wP_step1 = new WP_step1();
				wP_step1.setName("UserClanName");
				wP_step1.setVisible(true);
				wP_step1.setLocation(0, 0);
				wP_step1.setSize(390, 338);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getWP_step1< ist fehlgeschlagen!");
			}
		}
		return wP_step1;
	}

	// Wizard Step.2 (getKlasse)
	private WP_step2 getWP_step2() {
		if (wP_step2 == null) {
			try {
				wP_step2 = new WP_step2();
				wP_step2.setName("NetSettings");
				wP_step2.setVisible(false);
				wP_step2.setLocation(0, 0);
				wP_step2.setSize(390, 338);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getWP_step2< ist fehlgeschlagen!");
			}
		}
		return wP_step2;
	}
	
	// Wizard Step.3 (getKlasse)
	private WP_step3 getWP_step3() {
		if (wP_step3 == null) {
			try {
				wP_step3 = new WP_step3();
				wP_step3.setVisible(false);
				wP_step3.setSize(390, 338);
				wP_step3.setLocation(0, 0);
				wP_step3.setName("FOVangel");
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getWP_step3< ist fehlgeschlagen!");
			}
		}
		return wP_step3;
	}

	// Wizard Step.4 (getKlasse)
	private WP_step4 getWP_step4() {
		if (wP_step4 == null) {
			try {
				wP_step4 = new WP_step4();
				wP_step4.setName("RailColor");
				wP_step4.setVisible(false);
				wP_step4.setLocation(0, 0);
				wP_step4.setSize(390, 338);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getWP_step4< ist fehlgeschlagen!");
			}
		}
		return wP_step4;
	}

	// Wizard Step.5 (getKlasse)
	private WP_step5 getWP_step5() {
		if (wP_step5 == null) {
			try {
				wP_step5 = new WP_step5();
				wP_step5.setName("ClientSettings");
				wP_step5.setVisible(false);
				wP_step5.setLocation(0, 0);
				wP_step5.setSize(390, 338);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getWP_step5< ist fehlgeschlagen!");
			}
		}
		return wP_step5;
	}

	// Textfeld oben
	private JPanel getNewInfoHeaderPanel() {
		if (newInfoHeaderPanel == null) {
			try {
				newInfoHeaderPanel = new JPanel();
				newTopicLabel = new JLabel();
				newWizardStepInfo = new JLabel();
				GridLayout gridLayout2 = new GridLayout();
				newInfoHeaderPanel.setLayout(gridLayout2);
				newInfoHeaderPanel.setBounds(5, 6, 390, 16);
				gridLayout2.setRows(1);
				gridLayout2.setColumns(2);
				newTopicLabel.setText(langMan.getTheText(langMan.NEWTOPIC));
				newTopicLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
				newTopicLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
				newWizardStepInfo.setText("Step " + WizardStepMin + " / " + WizardStepMax + " ");
				newWizardStepInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
				newWizardStepInfo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
				newInfoHeaderPanel.add(newTopicLabel, null);
				newInfoHeaderPanel.add(newWizardStepInfo, null);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getNewInfoHeaderPanel< ist fehlgeschlagen!");
			}
		}
		return newInfoHeaderPanel;
	}

	// Dialog Fenster - Inhalt
	private JPanel getShowDialogContentPane() {
		if (showDialogContentPane == null) {
			try {
				showDialogContentPane = new JPanel();
				showDialogContentPane.setLayout(new BorderLayout());
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getShowDialogContentPane< ist fehlgeschlagen!");
			}
		}
		return showDialogContentPane;
	}

	// Dialog Fenster - Fenster
	private JDialog getShowDialog() {
		if (showDialog == null) {
			try {
				showDialog = new JDialog();
				showDialog.setContentPane(getShowDialogContentPane());
				showDialog.setTitle("showDialog");
				showDialog.setSize(184, 108);
				showDialog.setName("showDialog");
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getShowDialog< ist fehlgeschlagen!");
			}
		}
		return showDialog;
	}
}