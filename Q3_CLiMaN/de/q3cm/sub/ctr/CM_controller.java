package de.q3cm.sub.ctr;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

import de.q3cm.CM_main;
import de.q3cm.libs.langMan;

public class CM_controller extends JPanel {

	private JPanel PlayerIconPanel = null;
	private JPanel PlayerNamePanel = null;
	private JPanel buttonPanel = null;
	private JLabel playerIcon = null;
	private JButton loadButton = null;
	private JButton editButton = null;
	private JButton newButton = null;
	private JButton runButton = null;
	private JPanel selectPanel = null;
	private JLabel iconPlayer = null;
	private JComboBox selectPlayer = null;
	private JLabel iconMod = null;
	private JComboBox selectMod = null;
	private JLabel iconServer = null;
	private JComboBox selectServer = null;
	private JPanel showDialogContentPane = null;
	private JScrollPane infoScrollPane = null;
	private JTextPane infoTextPane = null;
	private JDialog showDialog = null;  //  @jve:decl-index=0:visual-constraint="214,9"
	private JPanel systemPanel = null;
	private JButton configButton = null;
	private JButton wwwButton = null;
    private JTextPane playerNameTextPane = null;
	
	private String[] playerArray = { "basicX", "EvilWolf", "TaFKaM", "WrYBiT" }; // TODO: Player aus Verzeichniss Auslesen
    private String[] modArray = { "Battel.X", "OSP", "Rocked Arena", "Team Arena" }; // TODO: Mods aus Config Laden
    private String[] serverArray = { "127.0.0.1", "localhost", "192.168.0.1", "Server", "217.80.14.5", "baiz.org" }; // TODO: Server aus Config Laden
	
	public CM_controller() {
		super();
		initialize();
	    getPlayerNameTextPane().setText("<html><body><font size='2' color='#ffffff' face='verdana'>1. "+selectPlayer.getSelectedItem()+"<br>2. "+selectMod.getSelectedItem()+"<br>3. "+selectServer.getSelectedItem()+"</font></body></html>"); 
	}

	private void initialize() {
		try {
            this.setLayout(null);
            this.setName("mainControllerPanel");
            this.setPreferredSize(new java.awt.Dimension(200,400));
            this.setSize(200, 400);
            this.add(getPlayerNamePanel(), null);
            this.add(getPlayerIconPanel(), null);
            this.add(getSelectPanel(), null);
            this.add(getButtonPanel(), null);
            this.add(getInfoScrollPane(), null);
            this.add(getSystemPanel(), null);
		} catch (java.lang.Throwable e) {
		    System.err.println("CM_controller Inizialisierung fehlgeschlagen!");
		}
	}

	private JPanel getPlayerIconPanel() {
		if (PlayerIconPanel == null) {
			try {
				playerIcon = new JLabel();
				GridLayout gridLayout1 = new GridLayout();
				PlayerIconPanel = new JPanel();
				PlayerIconPanel.setLayout(gridLayout1);
				PlayerIconPanel.setBounds(131, 5, 64, 64);
				PlayerIconPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
				PlayerIconPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
				PlayerIconPanel.setAlignmentX(0.5F);
				PlayerIconPanel.setAlignmentY(0.5F);
				PlayerIconPanel.setPreferredSize(new java.awt.Dimension(64,64));
				playerIcon.setText("");
				playerIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
				playerIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
				playerIcon.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/pics/palyer.png")));
				playerIcon.setToolTipText("");
				playerIcon.setAlignmentX(0.0F);
				gridLayout1.setRows(1);
				PlayerIconPanel.add(playerIcon, null);
				playerIcon.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.PLAYERICON);
					}
				});
			} catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getPlayerIconPanel< ist fehlgeschlagen!");
			}
		}
		return PlayerIconPanel;
	}
 
	private JPanel getPlayerNamePanel() {
		if (PlayerNamePanel == null) {
			try {
				GridLayout gridLayout3 = new GridLayout();
				PlayerNamePanel = new JPanel();
				PlayerNamePanel.setLayout(gridLayout3);
				PlayerNamePanel.setBounds(5, 13, 122, 50);
				PlayerNamePanel.setComponentOrientation(java.awt.ComponentOrientation.LEFT_TO_RIGHT);
				gridLayout3.setRows(1);
				gridLayout3.setColumns(1);
				PlayerNamePanel.add(getPlayerNameTextPane(), null);
			} catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getPlayerNamePanel< ist fehlgeschlagen!");
			}
		}
		return PlayerNamePanel;
	}
   
	private JPanel getButtonPanel() {
		if (buttonPanel == null) {
			try {
				GridLayout gridLayout4 = new GridLayout();
				buttonPanel = new JPanel();
				buttonPanel.setLayout(gridLayout4);
				gridLayout4.setRows(2);
				gridLayout4.setColumns(2);
				buttonPanel.setBounds(5, 152, 190, 50);
				buttonPanel.add(getEditButton(), null);
				buttonPanel.add(getRunButton(), null);
				buttonPanel.add(getLoadButton(), null);
				buttonPanel.add(getNewButton(), null);
			} catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getButtonPanel< ist fehlgeschlagen!");
			}
		}
		return buttonPanel;
	}
   
	public JButton getLoadButton() {
		if (loadButton == null) {
			try {
				loadButton = new JButton();
				loadButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/import.png")));
				loadButton.setText("Load");
				loadButton.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.LOADBUTTON);
					}
				});
				loadButton.addActionListener(new java.awt.event.ActionListener() { 

					public void actionPerformed(java.awt.event.ActionEvent e) {    
						selectPlayer.setEnabled(false);
						selectMod.setEnabled(false);
						selectServer.setEnabled(false);
						editButton.setEnabled(false);
					    runButton.setEnabled(false);
					    loadButton.setEnabled(false);
					    newButton.setEnabled(false);
					    configButton.setEnabled(false);
					    
					    CM_main.getInstance().getCM_load().setVisible(true);
					    CM_main.getInstance().setSize(614,433);
					}
				});
			} catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getLoadButton< ist fehlgeschlagen!");
			}
		}
		return loadButton;
	}
  
	public JButton getEditButton() {
		if (editButton == null) {
			try {
				editButton = new JButton();
				editButton.setText("Edit");
				editButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/edit.png")));
				editButton.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.EDITBUTTON);
					}
				});
				editButton.addActionListener(new java.awt.event.ActionListener() { 
					public void actionPerformed(java.awt.event.ActionEvent e) {    
						selectPlayer.setEnabled(false);
						selectMod.setEnabled(false);
						selectServer.setEnabled(false);
						editButton.setEnabled(false);
					    runButton.setEnabled(false);
					    loadButton.setEnabled(false);
					    newButton.setEnabled(false);
					    configButton.setEnabled(false);
					    
					    CM_main.getInstance().getCM_edit().setVisible(true);
					    CM_main.getInstance().setSize(614,433);
					}
				});
			} catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getEditButton< ist fehlgeschlagen!");
			}
		}
		return editButton;
	}
  
	public JButton getNewButton() {
		if (newButton == null) {
			try {
				newButton = new JButton();
				newButton.setText("New");
				newButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/player.png")));
				newButton.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NEWBUTTON);
					}
				});
				newButton.addActionListener(new java.awt.event.ActionListener() { 
					public void actionPerformed(java.awt.event.ActionEvent e) {    
						selectPlayer.setEnabled(false);
						selectMod.setEnabled(false);
						selectServer.setEnabled(false);
						editButton.setEnabled(false);
					    runButton.setEnabled(false);
					    loadButton.setEnabled(false);
					    newButton.setEnabled(false);
					    configButton.setEnabled(false);

					    CM_main.getInstance().getCM_new().setVisible(true);
					    CM_main.getInstance().setSize(614,433);
					}
				});
			} catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getNewButton< ist fehlgeschlagen!");
			}
		}
		return newButton;
	}
   
	public JButton getRunButton() {
		if (runButton == null) {
			try {
				runButton = new JButton();
				runButton.setText("Run");
				runButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/run.png")));
				runButton.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.RUNBUTTON);
					}
				});
				runButton.addActionListener(new java.awt.event.ActionListener() { 
					public void actionPerformed(java.awt.event.ActionEvent e) {    
				        try {
				            Runtime.getRuntime().exec("q3.exe");
				        } catch(Exception Ausnahme) {
			                Toolkit.getDefaultToolkit().beep(); //Systemsound 
				            JOptionPane.showMessageDialog(showDialog, "Can't find Quake3.exe", "eRRoR", JOptionPane.ERROR_MESSAGE);
						}  
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getRunButton< ist fehlgeschlagen!");
			}
		}
		return runButton;
	}
   
	public JPanel getSelectPanel() {
		if (selectPanel == null) {
			try {
				selectPanel = new JPanel();
				
				iconPlayer = new JLabel();
				iconMod = new JLabel();
				iconServer = new JLabel();
				
				GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
				GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
				
				selectPanel.setLayout(new GridBagLayout());
				gridBagConstraints5.gridx = 0;
				gridBagConstraints5.gridy = 0;
				gridBagConstraints5.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints5.fill = java.awt.GridBagConstraints.VERTICAL;
				gridBagConstraints5.insets = new java.awt.Insets(0,0,0,5);
				iconPlayer.setText("");
				iconPlayer.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/player.png")));
				gridBagConstraints7.gridx = 1;
				gridBagConstraints7.gridy = 0;
				gridBagConstraints7.weightx = 1.0;
				gridBagConstraints7.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints7.anchor = java.awt.GridBagConstraints.EAST;
				gridBagConstraints8.gridx = 0;
				gridBagConstraints8.gridy = 1;
				gridBagConstraints8.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints8.fill = java.awt.GridBagConstraints.VERTICAL;
				gridBagConstraints8.insets = new java.awt.Insets(0,0,0,5);
				iconMod.setText("");
				iconMod.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/q3_icon.gif")));
				gridBagConstraints9.gridx = 1;
				gridBagConstraints9.gridy = 1;
				gridBagConstraints9.weightx = 1.0;
				gridBagConstraints9.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints9.anchor = java.awt.GridBagConstraints.EAST;
				gridBagConstraints10.gridx = 0;
				gridBagConstraints10.gridy = 2;
				gridBagConstraints10.anchor = java.awt.GridBagConstraints.WEST;
				gridBagConstraints10.fill = java.awt.GridBagConstraints.VERTICAL;
				gridBagConstraints10.insets = new java.awt.Insets(0,0,0,5);
				iconServer.setText("");
				iconServer.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/server.png")));
				gridBagConstraints11.gridx = 1;
				gridBagConstraints11.gridy = 2;
				gridBagConstraints11.weightx = 1.0;
				gridBagConstraints11.fill = java.awt.GridBagConstraints.HORIZONTAL;
				gridBagConstraints11.anchor = java.awt.GridBagConstraints.EAST;
				selectPanel.setLocation(5, 73);
				selectPanel.setSize(190, 75);
				selectPanel.add(iconPlayer, gridBagConstraints5);
				selectPanel.add(getSelectPlayer(), gridBagConstraints7);
				selectPanel.add(iconMod, gridBagConstraints8);
				selectPanel.add(getSelectMod(), gridBagConstraints9);
				selectPanel.add(iconServer, gridBagConstraints10);
				selectPanel.add(getSelectServer(), gridBagConstraints11);
				iconServer.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.SELECTSERVER);
					}
				});
				iconMod.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.SELECTMOD);
					}
				});
				iconPlayer.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.SELECTPLAYER);
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getSelectPanel< ist fehlgeschlagen!");
			}
		}
		return selectPanel;
	}
   
	public JComboBox getSelectPlayer() {
	    if (selectPlayer == null) {
			try {
				selectPlayer = new JComboBox();
				selectPlayer.setName("selectPlayer");
					for(int i = 0; i < playerArray.length; i++) {
					    selectPlayer.addItem(playerArray[i]);
					}
				selectPlayer.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.SELECTPLAYER);
					}
				});
				selectPlayer.addItemListener(new java.awt.event.ItemListener() { 
					public void itemStateChanged(java.awt.event.ItemEvent e) {    
					    getPlayerNameTextPane().setText("<html><body><font size='2' color='#ffffff' face='verdana'>1. "+selectPlayer.getSelectedItem()+"<br>2. "+selectMod.getSelectedItem()+"<br>3. "+selectServer.getSelectedItem()+"</font></body></html>"); 
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getSelectPlayer< ist fehlgeschlagen!");
			}
		}
		return selectPlayer;
	}
    
	public JComboBox getSelectMod() {
		if (selectMod == null) {
			try {
				selectMod = new JComboBox();
					for(int i = 0; i < modArray.length; i++) {
					    selectMod.addItem(modArray[i]);
					}
				selectMod.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.SELECTMOD);
					}
				});
				selectMod.addItemListener(new java.awt.event.ItemListener() { 
					public void itemStateChanged(java.awt.event.ItemEvent e) {    
					    getPlayerNameTextPane().setText("<html><body><font size='2' color='#ffffff' face='verdana'>1. "+selectPlayer.getSelectedItem()+"<br>2. "+selectMod.getSelectedItem()+"<br>3. "+selectServer.getSelectedItem()+"</font></body></html>"); 
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getSelectMod< ist fehlgeschlagen!");
			}
		}
		return selectMod;
	}
   
	public JComboBox getSelectServer() {
		if (selectServer == null) {
			try {
				selectServer = new JComboBox();
				selectServer.setEditable(true);
					for(int i = 0; i < serverArray.length; i++) {
					    selectServer.addItem(serverArray[i]);
					}
				selectServer.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.SELECTSERVER);
					}
				});
				selectServer.addItemListener(new java.awt.event.ItemListener() { 
					public void itemStateChanged(java.awt.event.ItemEvent e) {    
					    getPlayerNameTextPane().setText("<html><body><font size='2' color='#ffffff' face='verdana'>1. "+selectPlayer.getSelectedItem()+"<br>2. "+selectMod.getSelectedItem()+"<br>3. "+selectServer.getSelectedItem()+"</font></body></html>"); 
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getSelectServer< ist fehlgeschlagen!");
			}
		}
		return selectServer;
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
				showDialog.setSize(499, 67);
				showDialog.setName("showDialog");
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getShowDialog< ist fehlgeschlagen!");
			}
		}
		return showDialog;
	}
   
	private JScrollPane getInfoScrollPane() {
		if (infoScrollPane == null) {
			try {
				infoScrollPane = new JScrollPane();
				infoScrollPane.setBounds(5, 206, 190, 159);
				infoScrollPane.setViewportView(getInfoTextPane());
				infoScrollPane.setHorizontalScrollBarPolicy(javax.swing.JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
				infoScrollPane.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
				infoScrollPane.setBackground(new java.awt.Color(233,236,185));
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getInfoScrollPane< ist fehlgeschlagen!");
			}
		}
		return infoScrollPane;
	}
   
	public JTextPane getInfoTextPane() {
		if (infoTextPane == null) {
			try {
				infoTextPane = new JTextPane();
				infoTextPane.setContentType("text/html");
				infoTextPane.setEditable(false);
				infoTextPane.setBackground(new java.awt.Color(233,236,185));
				infoTextPane.setForeground(java.awt.SystemColor.infoText);
				infoTextPane.setName("infoTextPane");
				setInfoText(langMan.MAIN);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getInfoTextPane< ist fehlgeschlagen!");
			}
		}
		return infoTextPane;
	}
	
	public void setInfoText(int index){
	    String ReturnedHelpText = langMan.getTheText(index);
	    getInfoTextPane().setText(ReturnedHelpText);
	}
   
	private JPanel getSystemPanel() {
		if (systemPanel == null) {
			try {
				systemPanel = new JPanel();
				GridLayout gridLayout11 = new GridLayout();
				systemPanel.setLayout(gridLayout11);
				gridLayout11.setRows(1);
				systemPanel.setLocation(5, 370);
				systemPanel.setSize(190, 25);
				systemPanel.add(getWwwButton(), null);
				systemPanel.add(getConfigButton(), null);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getSystemPanel< ist fehlgeschlagen!");
			}
		}
		return systemPanel;
	}
   
	public JButton getConfigButton() {
		if (configButton == null) {
			try {
				configButton = new JButton();
				configButton.setText("Config");
				configButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/save.png")));
				configButton.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.CONFIGBUTTON);
					}
				});
				configButton.addActionListener(new java.awt.event.ActionListener() { 
					public void actionPerformed(java.awt.event.ActionEvent e) {    
						selectPlayer.setEnabled(false);
						selectMod.setEnabled(false);
						selectServer.setEnabled(false);
						editButton.setEnabled(false);
					    runButton.setEnabled(false);
					    loadButton.setEnabled(false);
					    newButton.setEnabled(false);
					    configButton.setEnabled(false);

					    CM_main.getInstance().getCM_config().setVisible(true);
					    CM_main.getInstance().setSize(614,433);
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getConfigButton< ist fehlgeschlagen!");
			}
		}
		return configButton;
	}
 
	public JButton getWwwButton() {
		if (wwwButton == null) {
			try {
				wwwButton = new JButton();
				wwwButton.setText("wWw");
				wwwButton.setIcon(new ImageIcon(getClass().getResource("/de/q3cm/gfx/icons/server.png")));
				wwwButton.addActionListener(new java.awt.event.ActionListener() { 
					public void actionPerformed(java.awt.event.ActionEvent e) {    
				        try {
				            Runtime.getRuntime().exec("D:/Programme/Internet Explorer/IEXPLORE.EXE http://www.helix.baiz.org");
				        } catch(Exception Ausnahme) {
			                Toolkit.getDefaultToolkit().beep(); //Systemsound 
				            JOptionPane.showMessageDialog(showDialog, "Can't find WebBrowser!\nPlease check the settings in the configurations.", "eRRoR", JOptionPane.ERROR_MESSAGE);
						}
				    }
				});
				wwwButton.addMouseListener(new java.awt.event.MouseAdapter() {   
					public void mouseExited(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.NIX);
					} 
					public void mouseEntered(java.awt.event.MouseEvent e) {    
						CM_main.getInstance().getCM_controller().setInfoText(langMan.WWWBUTTON);
					}
				});
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getWwwButton< ist fehlgeschlagen!");
			}
		}
		return wwwButton;
	}
   
	private JTextPane getPlayerNameTextPane() {
		if (playerNameTextPane == null) {
			try {
			    playerNameTextPane = new JTextPane();
			    playerNameTextPane.setContentType("text/html");
			    playerNameTextPane.setOpaque(false);
			    playerNameTextPane.setEditable(false);
			    playerNameTextPane.setName("playerNameTextPane");
			    playerNameTextPane.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getPlayerNameTextPane< ist fehlgeschlagen!");
			}
		}
		return playerNameTextPane;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"