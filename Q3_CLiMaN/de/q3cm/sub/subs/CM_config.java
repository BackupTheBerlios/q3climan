
package de.q3cm.sub.subs;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import de.q3cm.CM_main;
import de.q3cm.libs.langMan;

public class CM_config extends JPanel {

	static JFileChooser DateiAuswahl = new JFileChooser(); // @jve:decl-index=0:visual-constraint="414,82"
	private JDialog showDialog = null; // @jve:decl-index=0:visual-constraint="415,10"

	private JPanel ConfigTopicPanel = null;
	private JPanel ConfigSystem = null;
	private JPanel ConfigButtonPanel = null;
	private JButton ConfigAbortButton = null;
	private JButton ConfogSaveButton = null;
	private JPanel showDialogContentPane = null;
	private JTextField q3_path_TextField = null;
	private JButton q3_path_Button = null;
	private JLabel q3_path_Label = null;
	private JTextField config_path_TextField = null;
	private JButton config_path_Button = null;
	private JLabel config_path_Label = null;
	private JCheckBox last_user_CheckBox = null;
	private JCheckBox run_as_default_CheckBox = null;
	private JCheckBox allways_view_credits_CheckBox = null;
	private JCheckBox hot_help_CheckBox = null;
	private JComboBox theme_Select = null;
	private JComboBox colorSet_Select = null;
	private JLabel cfg_TopicLabel = null;
	private JTabbedPane ConfigMainTabbedPane = null;
	private JPanel ConfigVisuals = null;
	private JLabel last_user_Label = null;
	private JLabel run_as_default_Label = null;
	private JLabel allways_view_credits_Label = null;
	private JLabel hot_help_Label = null;
	private JPanel ConfigTheme = null;
	private JLabel colorSet_Label = null;
	private JLabel theme_Label = null;
	private JPanel ConfigMods = null;
	private JPanel ConfigServer = null;
	private JScrollPane server_ScrollPane = null;
	private JTextArea server_TextArea = null;
	private JTextArea serverInfo_TextArea = null;
	private JTextArea modInfo_TextArea = null;
	private JScrollPane mod_ScrollPane = null;
	private JTextArea mod_TextArea = null;
	private JLabel lastPos_Label = null;
	private JCheckBox lastPos_CheckBox = null;
	
	private JPanel ConfigRaw = null;
	private JTextArea rawInfo_TextArea = null;
	private JScrollPane raw_ScrollPane = null;
	private JTextArea raw_TextArea = null;
	
	public CM_config() {
		super();
		initialize();
	}

	private void initialize() {
		try {
            this.setLayout(null);
            this.setSize(400, 400);
            this.add(getConfigTopicPanel(), null);
            this.add(getConfigButtonPanel(), null);
            DateiAuswahl.setDialogTitle("Load");
            DateiAuswahl.setApproveButtonText("Ok");
            DateiAuswahl.setSize(500, 328);
            DateiAuswahl.setName("DateiAuswahl");
            DateiAuswahl.setControlButtonsAreShown(true);
            this.add(getConfigMainTabbedPane(), null);
		} catch (java.lang.Throwable e) {
		    System.err.println("Laden des >CM_config initialize< ist fehlgeschlagen!");
		}
	}
	
	private JPanel getConfigTopicPanel() {
		if (ConfigTopicPanel == null) {
			try {
				cfg_TopicLabel = new JLabel();
				GridLayout gridLayout9 = new GridLayout();
				ConfigTopicPanel = new JPanel();
				ConfigTopicPanel.setLayout(gridLayout9);
				ConfigTopicPanel.setBounds(5, 5, 390, 28);
				gridLayout9.setRows(1);
				cfg_TopicLabel.setText("Quake 3 :: Client Manager 2oo5 :: Config");
				cfg_TopicLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
				ConfigTopicPanel.add(cfg_TopicLabel, null);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConfigTopicPanel< ist fehlgeschlagen!");
			}
		}
		return ConfigTopicPanel;
	}
	
	private JPanel getConfigSystem() {
		if (ConfigSystem == null) {
			try {
				GridBagConstraints gridBagConstraints42 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints32 = new GridBagConstraints();
				config_path_Label = new JLabel();
				q3_path_Label = new JLabel();
				GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
				ConfigSystem = new JPanel();
				ConfigSystem.setLayout(new GridBagLayout());
				gridBagConstraints1.gridx = 1;
				gridBagConstraints1.gridy = 0;
				gridBagConstraints1.weightx = 1.0;
				gridBagConstraints1.fill = java.awt.GridBagConstraints.BOTH;
				gridBagConstraints1.anchor = java.awt.GridBagConstraints.CENTER;
				gridBagConstraints1.insets = new java.awt.Insets(0,0,0,5);
				gridBagConstraints2.gridx = 2;
				gridBagConstraints2.gridy = 0;
				gridBagConstraints2.anchor = java.awt.GridBagConstraints.EAST;
				gridBagConstraints2.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints2.insets = new java.awt.Insets(0,0,0,5);
				gridBagConstraints3.gridx = 0;
				gridBagConstraints3.gridy = 0;
				gridBagConstraints3.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints3.fill = java.awt.GridBagConstraints.VERTICAL;
				gridBagConstraints3.insets = new java.awt.Insets(0,5,0,5);
				q3_path_Label.setText("Quake3.exe Path");
				q3_path_Label.setPreferredSize(new java.awt.Dimension(84,25));
				ConfigSystem.setPreferredSize(new java.awt.Dimension(380,310));
				gridBagConstraints4.gridx = 1;
				gridBagConstraints4.gridy = 1;
				gridBagConstraints4.weightx = 1.0;
				gridBagConstraints4.fill = java.awt.GridBagConstraints.BOTH;
				gridBagConstraints4.insets = new java.awt.Insets(0,0,0,5);
				gridBagConstraints5.gridx = 2;
				gridBagConstraints5.gridy = 1;
				gridBagConstraints5.anchor = java.awt.GridBagConstraints.EAST;
				gridBagConstraints5.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints5.insets = new java.awt.Insets(0,0,0,5);
				gridBagConstraints7.gridx = 0;
				gridBagConstraints7.gridy = 1;
				gridBagConstraints7.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints7.fill = java.awt.GridBagConstraints.BOTH;
				gridBagConstraints7.insets = new java.awt.Insets(0,5,0,5);
				config_path_Label.setText("Config Path");
				config_path_Label.setPreferredSize(new java.awt.Dimension(56,25));
				gridBagConstraints32.gridx = -1;
				gridBagConstraints32.gridy = -1;
				gridBagConstraints32.weightx = 1.0;
				gridBagConstraints32.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints32.insets = new java.awt.Insets(5,160,270,2);
				gridBagConstraints42.gridx = 1;
				gridBagConstraints42.gridy = 0;
				gridBagConstraints42.weightx = 1.0;
				gridBagConstraints42.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints42.insets = new java.awt.Insets(5,3,270,160);
				ConfigSystem.add(q3_path_Label, gridBagConstraints3);
				ConfigSystem.add(config_path_Label, gridBagConstraints7);
				ConfigSystem.add(getQ3_path_TextField(), gridBagConstraints1);
				ConfigSystem.add(getQ3_path_Button(), gridBagConstraints2);
				ConfigSystem.add(getConfig_path_TextField(), gridBagConstraints4);
				ConfigSystem.add(getConfig_path_Button(), gridBagConstraints5);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConfigSystem< ist fehlgeschlagen!");
			}
		}
		return ConfigSystem;
	}

	private JPanel getConfigButtonPanel() {
		if (ConfigButtonPanel == null) {
			try {
				ConfigButtonPanel = new JPanel();
				GridLayout gridLayout7 = new GridLayout();
				ConfigButtonPanel.setLayout(gridLayout7);
				ConfigButtonPanel.setLocation(5, 370);
				ConfigButtonPanel.setSize(390, 25);
				gridLayout7.setRows(1);
				gridLayout7.setColumns(2);
				ConfigButtonPanel.add(getConfigAbortButton(), null);
				ConfigButtonPanel.add(getConfogSaveButton(), null);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConfigButtonPanel< ist fehlgeschlagen!");
			}
		}
		return ConfigButtonPanel;
	}
 
	private JButton getConfigAbortButton() {
		if (ConfigAbortButton == null) {
			try {
				ConfigAbortButton = new JButton();
				ConfigAbortButton.setText("Abort");
				ConfigAbortButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/abort.gif")));
				ConfigAbortButton.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
					    String ReturnedHelpText = langMan.getTheText(langMan.NIX);
					    CM_main.getInstance().getCM_controller().getInfoTextPane().setText(ReturnedHelpText);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
					    String ReturnedHelpText = langMan.getTheText(langMan.CONFIGABORTBUTTON);
					    CM_main.getInstance().getCM_controller().getInfoTextPane().setText(ReturnedHelpText);
					}
				});
				ConfigAbortButton.addActionListener(new java.awt.event.ActionListener() { 
					public void actionPerformed(java.awt.event.ActionEvent e) {    

					    CM_main.getInstance().getCM_controller().getSelectPlayer().setEnabled(true);
						CM_main.getInstance().getCM_controller().getSelectMod().setEnabled(true);
						CM_main.getInstance().getCM_controller().getSelectServer().setEnabled(true);
						
						CM_main.getInstance().getCM_controller().getEditButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getRunButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getLoadButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getNewButton().setEnabled(true);

						CM_main.getInstance().getCM_controller().getConfigButton().setEnabled(true);

						CM_config.this.setVisible(false);
						CM_main.getInstance().setSize(210,433);
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConfigAbortButton< ist fehlgeschlagen!");
			}
		}
		return ConfigAbortButton;
	}

	private JButton getConfogSaveButton() {
		if (ConfogSaveButton == null) {
			try {
				ConfogSaveButton = new JButton();
				ConfogSaveButton.setText("Save");
				ConfogSaveButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/save.png")));
				ConfogSaveButton.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
					    String ReturnedHelpText = langMan.getTheText(langMan.NIX);
					    CM_main.getInstance().getCM_controller().getInfoTextPane().setText(ReturnedHelpText);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
					    String ReturnedHelpText = langMan.getTheText(langMan.CONFIGSAVEBUTTON);
					    CM_main.getInstance().getCM_controller().getInfoTextPane().setText(ReturnedHelpText);
					}
				});
				ConfogSaveButton.addActionListener(new java.awt.event.ActionListener() { 
					public void actionPerformed(java.awt.event.ActionEvent e) {    

						CM_main.getInstance().getCM_controller().getSelectPlayer().setEnabled(true);
						CM_main.getInstance().getCM_controller().getSelectMod().setEnabled(true);
						CM_main.getInstance().getCM_controller().getSelectServer().setEnabled(true);
						
						CM_main.getInstance().getCM_controller().getEditButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getRunButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getLoadButton().setEnabled(true);
						CM_main.getInstance().getCM_controller().getNewButton().setEnabled(true);

						CM_main.getInstance().getCM_controller().getConfigButton().setEnabled(true);

			            JOptionPane.showMessageDialog(showDialog, "<html>The settings where sucsessfull saved.</html>", "Save settings", JOptionPane.INFORMATION_MESSAGE);
						CM_config.this.setVisible(false);
						CM_main.getInstance().setSize(210,433);
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConfogSaveButton< ist fehlgeschlagen!");
			}
		}
		return ConfogSaveButton;
	}
  
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
   
	private JDialog getShowDialog() {
		if (showDialog == null) {
			try {
				showDialog = new JDialog();
				showDialog.setContentPane(getShowDialogContentPane());
				showDialog.setSize(498, 66);
				showDialog.setTitle("showDialog");
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getShowDialog< ist fehlgeschlagen!");
			}
		}
		return showDialog;
	}
   
	private JTextField getQ3_path_TextField() {
		if (q3_path_TextField == null) {
			try {
				q3_path_TextField = new JTextField();
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getQ3_path_TextField< ist fehlgeschlagen!");
			}
		}
		return q3_path_TextField;
	}
   
	private JButton getQ3_path_Button() {
		if (q3_path_Button == null) {
			try {
				q3_path_Button = new JButton();
				q3_path_Button.setText("Browse");
				q3_path_Button.setPreferredSize(new java.awt.Dimension(78,25));
				q3_path_Button.addActionListener(new java.awt.event.ActionListener() { 
					public void actionPerformed(java.awt.event.ActionEvent e) {    
			            int Rueckgabewert = DateiAuswahl.showOpenDialog(showDialog);

			            if (Rueckgabewert == JFileChooser.APPROVE_OPTION) {
			                File DateiName = DateiAuswahl.getSelectedFile();
			                JOptionPane.showMessageDialog(showDialog, "<html>Importing the setings of the file:<br>"+ DateiName +"</html>", "Info", JOptionPane.INFORMATION_MESSAGE);
			            } else {
			                JOptionPane.showMessageDialog(showDialog, "<html>You didn't selected a file!<br>No information will be strorred!</html>", "Error", JOptionPane.WARNING_MESSAGE);
			            }
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getQ3_path_Button< ist fehlgeschlagen!");
			}
		}
		return q3_path_Button;
	}
   
	private JTextField getConfig_path_TextField() {
		if (config_path_TextField == null) {
			try {
				config_path_TextField = new JTextField();
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConfig_path_TextField< ist fehlgeschlagen!");
			}
		}
		return config_path_TextField;
	}
   
	private JButton getConfig_path_Button() {
		if (config_path_Button == null) {
			try {
				config_path_Button = new JButton();
				config_path_Button.setText("Browse");
				config_path_Button.setPreferredSize(new java.awt.Dimension(78,25));
				config_path_Button.addActionListener(new java.awt.event.ActionListener() { 
					public void actionPerformed(java.awt.event.ActionEvent e) {    
			            int Rueckgabewert = DateiAuswahl.showOpenDialog(showDialog);

			            if (Rueckgabewert == JFileChooser.APPROVE_OPTION) {
			                File DateiName = DateiAuswahl.getSelectedFile();
			                JOptionPane.showMessageDialog(showDialog, "<html>Importing the setings of the file:<br>"+ DateiName +"</html>", "Info", JOptionPane.INFORMATION_MESSAGE);
			            } else {
			                JOptionPane.showMessageDialog(showDialog, "<html>You didn't selected a file!<br>No information will be strorred!</html>", "Error", JOptionPane.WARNING_MESSAGE);
			            }
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConfig_path_Button< ist fehlgeschlagen!");
			}
		}
		return config_path_Button;
	}
   
	private JCheckBox getLast_user_CheckBox() {
		if (last_user_CheckBox == null) {
			try {
				last_user_CheckBox = new JCheckBox();
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getLast_user_CheckBox< ist fehlgeschlagen!");
			}
		}
		return last_user_CheckBox;
	}
    
	private JCheckBox getRun_as_default_CheckBox() {
		if (run_as_default_CheckBox == null) {
			try {
				run_as_default_CheckBox = new JCheckBox();
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getRun_as_default_CheckBox< ist fehlgeschlagen!");
			}
		}
		return run_as_default_CheckBox;
	}
  
	private JCheckBox getAllways_view_credits_CheckBox() {
		if (allways_view_credits_CheckBox == null) {
			try {
				allways_view_credits_CheckBox = new JCheckBox();
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getAllways_view_credits_CheckBox< ist fehlgeschlagen!");
			}
		}
		return allways_view_credits_CheckBox;
	}
   
	private JCheckBox getHot_help_CheckBox() {
		if (hot_help_CheckBox == null) {
			try {
				hot_help_CheckBox = new JCheckBox();
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getHot_help_CheckBox< ist fehlgeschlagen!");
			}
		}
		return hot_help_CheckBox;
	}
  
	private JComboBox getTheme_Select() {
		if (theme_Select == null) {
			try {
				theme_Select = new JComboBox();
				theme_Select.setPreferredSize(new java.awt.Dimension(25,25));
				theme_Select.setSelectedIndex(-1);
				theme_Select.addItem("Metal");
				theme_Select.addItem("System");
				theme_Select.addItem("Motif");
				theme_Select.addItem("GTK+");
				theme_Select.addItem("WindowsLookAndFeel");
				theme_Select.addItem("PlasticLookAndFeel");
				theme_Select.addItem("Plastic3DLookAndFeel");
				theme_Select.addItem("PlasticXPLookAndFeel");
				theme_Select.setSelectedItem(CM_main.LooKAnDFeeL);
				theme_Select.addItemListener(new java.awt.event.ItemListener() { 
					public void itemStateChanged(java.awt.event.ItemEvent e) {    
						    if (theme_Select.getSelectedItem() == "Metal") {
						 		colorSet_Select.setSelectedItem("[ System Default ]");
						        getColorSet_Select().setEnabled(false);
						    } else if (theme_Select.getSelectedItem() == "Metal") {
						 		colorSet_Select.setSelectedItem("[ System Default ]");
						        getColorSet_Select().setEnabled(false);
						    } else if (theme_Select.getSelectedItem() == "System") {
						 		colorSet_Select.setSelectedItem("[ System Default ]");
						        getColorSet_Select().setEnabled(false);
						    } else if (theme_Select.getSelectedItem() == "Motif") {
						 		colorSet_Select.setSelectedItem("[ System Default ]");
						        getColorSet_Select().setEnabled(false);
						    } else if (theme_Select.getSelectedItem() == "GTK+") {
						 		colorSet_Select.setSelectedItem("[ System Default ]");
						        getColorSet_Select().setEnabled(false);
						    } else if (theme_Select.getSelectedItem() == "WindowsLookAndFeel") {
						 		colorSet_Select.setSelectedItem("[ System Default ]");
						        getColorSet_Select().setEnabled(false);
						    } else if (theme_Select.getSelectedItem() == "PlasticLookAndFeel") {
						        getColorSet_Select().setEnabled(true);
						    } else if (theme_Select.getSelectedItem() == "Plastic3DLookAndFeel") {
						        getColorSet_Select().setEnabled(true);
						    } else if (theme_Select.getSelectedItem() == "PlasticXPLookAndFeel") {
						        getColorSet_Select().setEnabled(true);
						    }
					    CM_main.LooKAnDFeeL = (String) theme_Select.getSelectedItem();
					    CM_main.initLookAndFeel();
						SwingUtilities.updateComponentTreeUI(CM_main.getInstance());
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getTheme_Select< ist fehlgeschlagen!");
			}
		}
		return theme_Select;
	}
   
	private JComboBox getColorSet_Select() {
		if (colorSet_Select == null) {
			try {
				colorSet_Select = new JComboBox();
				colorSet_Select.setPreferredSize(new java.awt.Dimension(35,25));
		 		colorSet_Select.setMaximumRowCount(6);
		 		colorSet_Select.addItem("[ System Default ]");
		 		colorSet_Select.addItem("BrownSugar");
		 		colorSet_Select.addItem("DarkStar");
		 		colorSet_Select.addItem("DesertBlue");
		 		colorSet_Select.addItem("DesertBluer");
		 		colorSet_Select.addItem("DesertGreen");
		 		colorSet_Select.addItem("DesertRed");
		 		colorSet_Select.addItem("DesertYellow");
		 		colorSet_Select.addItem("ExperienceBlue");
		 		colorSet_Select.addItem("ExperienceGreen");
		 		colorSet_Select.addItem("Silver");
		 		colorSet_Select.addItem("SkyBlue");
		 		colorSet_Select.addItem("SkyBluer");
		 		colorSet_Select.addItem("SkyBluerTahoma");
		 		colorSet_Select.addItem("SkyGreen");
		 		colorSet_Select.addItem("SkyKrupp");
		 		colorSet_Select.addItem("SkyPink");
		 		colorSet_Select.addItem("SkyRed");
		 		colorSet_Select.addItem("SkyYellow");
		 		
		 		// Wenn keine ColorSet vom Theme unterstützt wird, wird das ColorSet deaktiviert
		 		if (CM_main.LooKAnDFeeL != "PlasticLookAndFeel" & CM_main.LooKAnDFeeL != "Plastic3DLookAndFeel" & CM_main.LooKAnDFeeL != "PlasticXPLookAndFeel") {
		 		    colorSet_Select.setEnabled(false);
			 		colorSet_Select.setSelectedItem("[ System Default ]");
		 		    CM_main.LAF_ColorTheme = "";
			 	}
		 		
		 		colorSet_Select.setSelectedItem(CM_main.LAF_ColorTheme);
				
				colorSet_Select.addItemListener(new java.awt.event.ItemListener() { 
					public void itemStateChanged(java.awt.event.ItemEvent e) {    
					    if (colorSet_Select.getSelectedItem() == "[ System Default ]") {
					        CM_main.LAF_ColorTheme = "";
					    } else {
					        CM_main.LAF_ColorTheme = (String) colorSet_Select.getSelectedItem();
					    }
					    CM_main.initLookAndFeel();
						SwingUtilities.updateComponentTreeUI(CM_main.getInstance());
					}
				});
			} catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getSelect_ColorSet< ist fehlgeschlagen!");
			}
		}
		return colorSet_Select;
	}

	private JTabbedPane getConfigMainTabbedPane() {
		if (ConfigMainTabbedPane == null) {
			try {
				ConfigMainTabbedPane = new JTabbedPane();
				String string16 = "System";  //  @jve:decl-index=0:
				String string15 = "Visuals";  //  @jve:decl-index=0:
				ConfigMainTabbedPane.setPreferredSize(new java.awt.Dimension(390,329));
				ConfigMainTabbedPane.setLocation(5, 37);
				ConfigMainTabbedPane.setSize(390, 329);
				ConfigMainTabbedPane.addTab("System", null, getConfigSystem(), "");
				ConfigMainTabbedPane.addTab("Mods", null, getConfigMods(), null);
				ConfigMainTabbedPane.addTab("Server", null, getConfigServer(), null);
				ConfigMainTabbedPane.addTab("Visuals", null, getConfigVisuals(), null);
				ConfigMainTabbedPane.addTab("Theme", null, getConfigTheme(), null);
				ConfigMainTabbedPane.addTab("Raw Config File", null, getConfigRaw(), null);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConfigMainTabbedPane< ist fehlgeschlagen!");
			}
		}
		return ConfigMainTabbedPane;
	}
   
	private JPanel getConfigVisuals() {
		if (ConfigVisuals == null) {
			try {
				lastPos_Label = new JLabel();
				GridBagConstraints gridBagConstraints131 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints141 = new GridBagConstraints();
				hot_help_Label = new JLabel();
				allways_view_credits_Label = new JLabel();
				run_as_default_Label = new JLabel();
				last_user_Label = new JLabel();
				GridBagConstraints gridBagConstraints41 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints52 = new GridBagConstraints();
				ConfigVisuals = new JPanel();
				ConfigVisuals.setLayout(new GridBagLayout());
				gridBagConstraints11.gridx = 1;
				gridBagConstraints11.gridy = 0;
				gridBagConstraints21.gridx = 1;
				gridBagConstraints21.gridy = 1;
				gridBagConstraints31.gridx = 1;
				gridBagConstraints31.gridy = 3;
				gridBagConstraints41.gridx = 1;
				gridBagConstraints41.gridy = 2;
				gridBagConstraints52.gridx = 0;
				gridBagConstraints52.gridy = 0;
				gridBagConstraints52.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints52.fill = java.awt.GridBagConstraints.BOTH;
				gridBagConstraints52.insets = new java.awt.Insets(0,5,0,5);
				gridBagConstraints52.weightx = 1.0D;
				ConfigVisuals.setPreferredSize(new java.awt.Dimension(380,310));
				gridBagConstraints11.anchor = java.awt.GridBagConstraints.EAST;
				gridBagConstraints11.insets = new java.awt.Insets(0,0,0,5);
				gridBagConstraints21.anchor = java.awt.GridBagConstraints.EAST;
				gridBagConstraints21.insets = new java.awt.Insets(0,0,0,5);
				gridBagConstraints41.anchor = java.awt.GridBagConstraints.EAST;
				gridBagConstraints41.insets = new java.awt.Insets(0,0,0,5);
				gridBagConstraints31.anchor = java.awt.GridBagConstraints.EAST;
				gridBagConstraints31.insets = new java.awt.Insets(0,0,0,5);
				gridBagConstraints12.gridx = 0;
				gridBagConstraints12.gridy = 1;
				gridBagConstraints12.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints12.fill = java.awt.GridBagConstraints.BOTH;
				gridBagConstraints12.insets = new java.awt.Insets(0,5,0,5);
				run_as_default_Label.setText("Run is the default selected Button");
				gridBagConstraints13.gridx = 0;
				gridBagConstraints13.gridy = 2;
				gridBagConstraints13.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints13.fill = java.awt.GridBagConstraints.BOTH;
				gridBagConstraints13.insets = new java.awt.Insets(0,5,0,5);
				allways_view_credits_Label.setText("View credits in the HelpBox");
				gridBagConstraints14.gridx = 0;
				gridBagConstraints14.gridy = 3;
				gridBagConstraints14.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints14.fill = java.awt.GridBagConstraints.BOTH;
				gridBagConstraints14.insets = new java.awt.Insets(0,5,0,5);
				gridBagConstraints131.gridx = 0;
				gridBagConstraints131.gridy = 4;
				gridBagConstraints131.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints131.fill = java.awt.GridBagConstraints.BOTH;
				gridBagConstraints131.insets = new java.awt.Insets(0,5,0,5);
				lastPos_Label.setText("Remember last Window Position of \"Q3CLiMaN\"");
				gridBagConstraints141.gridx = 1;
				gridBagConstraints141.gridy = 4;
				gridBagConstraints141.anchor = java.awt.GridBagConstraints.EAST;
				gridBagConstraints141.insets = new java.awt.Insets(0,0,0,5);
				ConfigVisuals.add(last_user_Label, gridBagConstraints52);
				ConfigVisuals.add(getLast_user_CheckBox(), gridBagConstraints11);
				ConfigVisuals.add(run_as_default_Label, gridBagConstraints12);
				ConfigVisuals.add(getRun_as_default_CheckBox(), gridBagConstraints21);
				ConfigVisuals.add(hot_help_Label, gridBagConstraints14);
				ConfigVisuals.add(getHot_help_CheckBox(), gridBagConstraints41);
				hot_help_Label.setText("View MouseOver text in the HelpBox");
				ConfigVisuals.add(allways_view_credits_Label, gridBagConstraints13);
				ConfigVisuals.add(getAllways_view_credits_CheckBox(), gridBagConstraints31);
				ConfigVisuals.add(lastPos_Label, gridBagConstraints131);
				ConfigVisuals.add(getLastPos_CheckBox(), gridBagConstraints141);
				last_user_Label.setText("Remember last used User");
				last_user_Label.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
				last_user_Label.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConfigVisuals< ist fehlgeschlagen!");
			}
		}
		return ConfigVisuals;
	}
   
	private JPanel getConfigTheme() {
		if (ConfigTheme == null) {
			try {
				theme_Label = new JLabel();
				colorSet_Label = new JLabel();
				GridBagConstraints gridBagConstraints111 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
				ConfigTheme = new JPanel();
				ConfigTheme.setLayout(new GridBagLayout());
				ConfigTheme.setPreferredSize(new java.awt.Dimension(380,310));
				colorSet_Label.setText("Color Set");
				gridBagConstraints8.gridx = 0;
				gridBagConstraints8.gridy = 0;
				gridBagConstraints8.insets = new java.awt.Insets(0,5,0,5);
				gridBagConstraints8.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints8.fill = java.awt.GridBagConstraints.BOTH;
				gridBagConstraints9.gridx = 1;
				gridBagConstraints9.gridy = 0;
				gridBagConstraints9.fill = java.awt.GridBagConstraints.BOTH;
				gridBagConstraints9.insets = new java.awt.Insets(0,0,0,5);
				gridBagConstraints9.anchor = java.awt.GridBagConstraints.EAST;
				gridBagConstraints9.weightx = 1.0;
				gridBagConstraints9.ipadx = 1;
				gridBagConstraints10.gridx = 0;
				gridBagConstraints10.gridy = 1;
				gridBagConstraints10.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints10.insets = new java.awt.Insets(0,5,0,5);
				gridBagConstraints10.fill = java.awt.GridBagConstraints.BOTH;
				gridBagConstraints111.gridx = 1;
				gridBagConstraints111.gridy = 1;
				gridBagConstraints111.fill = java.awt.GridBagConstraints.BOTH;
				gridBagConstraints111.insets = new java.awt.Insets(0,0,0,5);
				gridBagConstraints111.anchor = java.awt.GridBagConstraints.EAST;
				ConfigTheme.add(theme_Label, gridBagConstraints8);
				ConfigTheme.add(getTheme_Select(), gridBagConstraints9);
				ConfigTheme.add(colorSet_Label, gridBagConstraints10);
				ConfigTheme.add(getColorSet_Select(), gridBagConstraints111);
				theme_Label.setText("Theme");
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConfigTheme< ist fehlgeschlagen!");
			}
		}
		return ConfigTheme;
	}
   
	private JPanel getConfigMods() {
		if (ConfigMods == null) {
			try {
				ConfigMods = new JPanel();
				ConfigMods.setLayout(new BorderLayout());
				ConfigMods.setPreferredSize(new java.awt.Dimension(380,310));
				ConfigMods.add(getModInfo_TextArea(), java.awt.BorderLayout.NORTH);
				ConfigMods.add(getMod_ScrollPane(), java.awt.BorderLayout.CENTER);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConfigMods< ist fehlgeschlagen!");
			}
		}
		return ConfigMods;
	}

	private JPanel getConfigServer() {
		if (ConfigServer == null) {
			try {
				ConfigServer = new JPanel();
				ConfigServer.setLayout(new BorderLayout());
				ConfigServer.setPreferredSize(new java.awt.Dimension(380,310));
				ConfigServer.add(getServerInfo_TextArea(), java.awt.BorderLayout.NORTH);
				ConfigServer.add(getServer_ScrollPane(), java.awt.BorderLayout.CENTER);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConfigServer< ist fehlgeschlagen!");
			}
		}
		return ConfigServer;
	}

	private JScrollPane getServer_ScrollPane() {
		if (server_ScrollPane == null) {
			try {
				server_ScrollPane = new JScrollPane();
				server_ScrollPane.setViewportView(getServer_TextArea());
				server_ScrollPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getServer_ScrollPane< ist fehlgeschlagen!");
			}
		}
		return server_ScrollPane;
	}

	private JTextArea getServer_TextArea() {
		if (server_TextArea == null) {
			try {
				server_TextArea = new JTextArea();
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getServer_TextArea< ist fehlgeschlagen!");
			}
		}
		return server_TextArea;
	}

	private JTextArea getServerInfo_TextArea() {
		if (serverInfo_TextArea == null) {
			try {
				serverInfo_TextArea = new JTextArea();
				serverInfo_TextArea.setLineWrap(true);
				serverInfo_TextArea.setText("Enter the Server you like to get viewed in the SelectBox at the Left Startmenu. You can use Hostnames or IPs for this List! Only one Server per Line!");
				serverInfo_TextArea.setWrapStyleWord(true);
				serverInfo_TextArea.setRows(3);
				serverInfo_TextArea.setEditable(false);
				serverInfo_TextArea.setOpaque(false);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getServerInfo_TextArea< ist fehlgeschlagen!");
			}
		}
		return serverInfo_TextArea;
	}

	private JTextArea getModInfo_TextArea() {
		if (modInfo_TextArea == null) {
			try {
				modInfo_TextArea = new JTextArea();
				modInfo_TextArea.setRows(3);
				modInfo_TextArea.setOpaque(false);
				modInfo_TextArea.setText("Enter the Mod's you like to get viewed in the SelectBox at the Left Startmenu. Only one Mod per Line!");
				modInfo_TextArea.setLineWrap(true);
				modInfo_TextArea.setWrapStyleWord(true);
				modInfo_TextArea.setEditable(false);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getModInfo_TextArea< ist fehlgeschlagen!");
			}
		}
		return modInfo_TextArea;
	}

	private JScrollPane getMod_ScrollPane() {
		if (mod_ScrollPane == null) {
			try {
				mod_ScrollPane = new JScrollPane();
				mod_ScrollPane.setViewportView(getMod_TextArea());
				mod_ScrollPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getMod_ScrollPane< ist fehlgeschlagen!");
			}
		}
		return mod_ScrollPane;
	}

	private JTextArea getMod_TextArea() {
		if (mod_TextArea == null) {
			try {
				mod_TextArea = new JTextArea();
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getMod_TextArea< ist fehlgeschlagen!");
			}
		}
		return mod_TextArea;
	}

	private JCheckBox getLastPos_CheckBox() {
		if (lastPos_CheckBox == null) {
			try {
				lastPos_CheckBox = new JCheckBox();
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getLastPos_CheckBox< ist fehlgeschlagen!");
			}
		}
		return lastPos_CheckBox;
	}
  
	private JPanel getConfigRaw() {
		if (ConfigRaw == null) {
			try {
				ConfigRaw = new JPanel();
				ConfigRaw.setLayout(new BorderLayout());
				ConfigRaw.add(getRawInfo_TextArea(), java.awt.BorderLayout.NORTH);
				ConfigRaw.add(getRaw_ScrollPane(), java.awt.BorderLayout.CENTER);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConfigRaw< ist fehlgeschlagen!");
			}
		}
		return ConfigRaw;
	}
   
	private JTextArea getRawInfo_TextArea() {
		if (rawInfo_TextArea == null) {
			try {
				rawInfo_TextArea = new JTextArea();
				rawInfo_TextArea.setEditable(false);
				rawInfo_TextArea.setOpaque(false);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getRawInfo_TextArea< ist fehlgeschlagen!");
			}
		}
		return rawInfo_TextArea;
	}
 
	private JScrollPane getRaw_ScrollPane() {
		if (raw_ScrollPane == null) {
			try {
				raw_ScrollPane = new JScrollPane();
				raw_ScrollPane.setViewportView(getRaw_TextArea());
				raw_ScrollPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getRaw_ScrollPane< ist fehlgeschlagen!");
			}
		}
		return raw_ScrollPane;
	}
  
	private JTextArea getRaw_TextArea() {
		if (raw_TextArea == null) {
			try {
				raw_TextArea = new JTextArea();
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getRaw_TextArea< ist fehlgeschlagen!");
			}
		}
		return raw_TextArea;
	}
} // @jve:decl-index=0:visual-constraint="10,10"