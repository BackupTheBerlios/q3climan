
// Ordnerpath
package de.q3cm;

// Nutzt folgende Java Klassen
import java.awt.Toolkit;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import de.q3cm.libs.langMan;
import de.q3cm.sub.ctr.CM_controller;
import de.q3cm.sub.subs.CM_config;
import de.q3cm.sub.subs.CM_edit;
import de.q3cm.sub.subs.CM_load;
import de.q3cm.sub.subs.CM_new;

// Hauptklasse
public class CM_main extends JFrame {

    // ----------------------------------------------------------- Variabeln

    // Objekt definitionen (Rechte)
    private JPanel mainContentPane = null;
	private CM_controller cM_controller = null;
	private CM_edit cM_edit = null;
	private CM_new cM_new = null;
	private CM_load cM_load = null;
	private CM_config cM_config = null;
	static CM_main mainInstance = null;  //  @jve:decl-index=0:visual-constraint="270,7"
	
    // Variabeln für Look&Feel Grundeinstellungen (TODO: Durch "config Import" Austauschen!)
	public static String LooKAnDFeeL = "PlasticXPLookAndFeel"; // Nur wenn "System" default ist, wird in allen Themes eine Windows Fenster Leiste oben erstellt !!!
    public static String LAF_ColorTheme = "DarkStar";
	
 	// ----------------------------------------------------------- Klassen
    
    // Projekt Haupt Klasse (Ab hier geht alles los!)
    public static void main(String[] args) {
        if (args.length != 0) {
            System.out.println("Anzahl der Systemargumente   : " + args.length);
            System.out.println("--------------------------------------------");
            for(int i = 0; i < args.length; i++) {
	            System.out.println("Übergebenes Systemargument " + i + " : " + args[i]);
			}
        }
        JFrame.setDefaultLookAndFeelDecorated(true);
        JDialog.setDefaultLookAndFeelDecorated(true);
        initLookAndFeel();
        new CM_main();
    }
	
    // Main Klasse (Starter Klasse)
    public CM_main() {
		super();
		initialize();
		mainInstance = this;
	} 	
	
    // Main getKlasse (Main Instance Objekt)
	public static CM_main getInstance() {
	    return mainInstance;
	}
	
	// Fesnter initializierung der Main Klasse
    public void initialize() {
        try {
            this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/de/q3cm/gfx/pics/Q3.png")));
            this.setContentPane(getMainContentPane());
            this.setName("mainFrame");
            this.setSize(210, 433);
            this.setMaximumSize(new java.awt.Dimension(614,433));
            this.setMinimumSize(new java.awt.Dimension(210,433));
            this.setPreferredSize(new java.awt.Dimension(210,433));
            this.setResizable(false);
            this.setTitle("Q3 :: CLiMaN 2oo5");
            this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            this.addMouseListener(new java.awt.event.MouseAdapter() {   
             
            	public void mouseEntered(java.awt.event.MouseEvent e) {    
					CM_main.getInstance().getCM_controller().setInfoText(langMan.MAIN);
            	}
            });
		} catch (java.lang.Throwable e) {
		    System.err.println("Laden des >CM_main Initalizierung< ist fehlgeschlagen!");
		}
	}

    // Initialisierung des Java Look&Feel - Theme Klasse
    public static void initLookAndFeel() {
		String useLAF = null;

	 	//Colorset laden wenn ein Plastic Theme vorher angegeben wurde
		if (LooKAnDFeeL.equals("PlasticXPLookAndFeel") || LooKAnDFeeL.equals("Plastic3DLookAndFeel") || LooKAnDFeeL.equals("PlasticLookAndFeel")) {
	 		if (LAF_ColorTheme.equals("BrownSugar")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.BrownSugar());
	 		} else if (LAF_ColorTheme.equals("DarkStar")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.DarkStar());
	 		} else if (LAF_ColorTheme.equals("DesertBlue")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.DesertBlue());
	 		} else if (LAF_ColorTheme.equals("DesertBluer")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.DesertBluer());
	 		} else if (LAF_ColorTheme.equals("DesertGreen")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.DesertGreen());
	 		} else if (LAF_ColorTheme.equals("DesertRed")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.DesertRed());
	 		} else if (LAF_ColorTheme.equals("DesertYellow")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.DesertYellow());
	 		} else if (LAF_ColorTheme.equals("ExperienceBlue")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.ExperienceBlue());
	 		} else if (LAF_ColorTheme.equals("ExperienceGreen")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.ExperienceGreen());
	 		} else if (LAF_ColorTheme.equals("Silver")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.Silver());
	 		} else if (LAF_ColorTheme.equals("SkyBlue")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.SkyBlue());
	 		} else if (LAF_ColorTheme.equals("SkyBluer")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.SkyBluer());
	 		} else if (LAF_ColorTheme.equals("SkyBluerTahoma")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.SkyBluerTahoma());
	 		} else if (LAF_ColorTheme.equals("SkyGreen")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.SkyGreen());
	 		} else if (LAF_ColorTheme.equals("SkyKrupp")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.SkyKrupp());
	 		} else if (LAF_ColorTheme.equals("SkyPink")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.SkyPink());
	 		} else if (LAF_ColorTheme.equals("SkyRed")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.SkyRed());
	 		} else if (LAF_ColorTheme.equals("SkyYellow")) {
				com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setMyCurrentTheme(new com.jgoodies.looks.plastic.theme.SkyYellow());
	 		}
	 	}
	 	
	 	//Theme laden
		if (LooKAnDFeeL != null) {
			if (LooKAnDFeeL.equals("Metal")) {
			    useLAF = UIManager.getCrossPlatformLookAndFeelClassName();
			} else if (LooKAnDFeeL.equals("System")) {
			    useLAF = UIManager.getSystemLookAndFeelClassName();
			} else if (LooKAnDFeeL.equals("Motif")) {
			    useLAF = "com.sun.java.swing.plaf.motif.MotifLookAndFeel";
			} else if (LooKAnDFeeL.equals("GTK+")) { 
			    useLAF = "com.sun.java.swing.plaf.gtk.GTKLookAndFeel";
			} else if (LooKAnDFeeL.equals("PlasticXPLookAndFeel")) { 
			    com.jgoodies.looks.plastic.PlasticXPLookAndFeel.setHighContrastFocusColorsEnabled(true);
			    useLAF = "com.jgoodies.looks.plastic.PlasticXPLookAndFeel";
			} else if (LooKAnDFeeL.equals("Plastic3DLookAndFeel")) { 
			    com.jgoodies.looks.plastic.Plastic3DLookAndFeel.setHighContrastFocusColorsEnabled(true);
			    useLAF = "com.jgoodies.looks.plastic.Plastic3DLookAndFeel";
			} else if (LooKAnDFeeL.equals("PlasticLookAndFeel")) { 
			    com.jgoodies.looks.plastic.PlasticLookAndFeel.setHighContrastFocusColorsEnabled(true);
			    useLAF = "com.jgoodies.looks.plastic.PlasticLookAndFeel";
			} else if (LooKAnDFeeL.equals("WindowsLookAndFeel")) { 
			    useLAF = "com.jgoodies.looks.windows.WindowsLookAndFeel";
			} else {
				System.err.println("Unexpected value of LOOKANDFEEL specified: " + LooKAnDFeeL);
				useLAF = UIManager.getCrossPlatformLookAndFeelClassName();
			}

			//SwingUI Fehler abfangen!
			try {
				UIManager.setLookAndFeel(useLAF);
			} catch (ClassNotFoundException e) {
				System.err.println("Couldn't find class for specified look and feel:\r\n" + useLAF);
				System.err.println("Did you include the L&F library in the class path?");
				System.err.println("System using now the default look and feel.");
			} catch (UnsupportedLookAndFeelException e) {
				System.err.println("Can't use the specified look and feel (" + useLAF + ") on this platform.");
				System.err.println("Using the default look and feel.");
			} catch (Exception e) {
				System.err.println("Couldn't get specified look and feel (" + useLAF + "), for some reason.");
				System.err.println("Using the default look and feel.");
				e.printStackTrace();
			}
		}
	}
	
    // MainPane: Hier werden alle HauptPanel eingehängt
    public JPanel getMainContentPane() {
		if (mainContentPane == null) {
			try {
				mainContentPane = new JPanel();
				mainContentPane.setLayout(null);
				mainContentPane.add(getCM_controller(), null);
				mainContentPane.add(getCM_new(), null);
				mainContentPane.add(getCM_edit(), null);
				mainContentPane.add(getCM_config(), null);
				mainContentPane.add(getCM_load(), null);
			} catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getMainContentPane< ist fehlgeschlagen!");
			}
		}
		return mainContentPane;
	}

    // ----------------------------------------------------------- Getter der HauptPanels
    
	// Steuerung auf der Linken Seite mit den Buttons zu den SubPanels
    public CM_controller getCM_controller() {
		if (cM_controller == null) {
			try {
				cM_controller = new CM_controller();
				cM_controller.setSize(200, 408);
				cM_controller.setLocation(0, 0);
			} catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getCM_controller< ist fehlgeschlagen!");
			}
		}
		return cM_controller;
	}
	
    // Import Panel: Öffnet sich über den Load-Button (Player Importieren)
	public CM_load getCM_load() {
		if (cM_load == null) {
			try {
			    cM_load = new CM_load();
			    cM_load.setVisible(false);
			    cM_load.setSize(400, 400);
			    cM_load.setLocation(204, 0);
			    cM_load.setName("mainLoadPanel");
			    cM_load.setPreferredSize(new java.awt.Dimension(400,400));
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getCM_load< ist fehlgeschlagen!");
			}
		}
		return cM_load;
	}
	
    // Edit Panel: Öffnet sich über den Edit-Button (Player Editieren)
	public CM_edit getCM_edit() {
		if (cM_edit == null) {
			try {
				cM_edit = new CM_edit();
				cM_edit.setVisible(false);
				cM_edit.setSize(400, 400);
				cM_edit.setLocation(204, 0);
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getCM_edit< ist fehlgeschlagen!");
			}
		}
		return cM_edit;
	}

	// Config Panel: Öffnet sich über den Config-Button (Q3CM Konfigurieren)
	public CM_config getCM_config() {
		if (cM_config == null) {
			try {
				cM_config = new CM_config();
				cM_config.setVisible(false);
				cM_config.setSize(400, 400);
				cM_config.setLocation(204, 0);
				cM_config.setPreferredSize(new java.awt.Dimension(400,400));
				cM_config.setName("mainConfigPanel");
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getCM_config< ist fehlgeschlagen!");
			}
		}
		return cM_config;
	}

    // New Panel: Öffnet sich über den New-Button (Neuen Player erstellen)
	public CM_new getCM_new() {
		if (cM_new == null) {
			try {
				cM_new = new CM_new();
				cM_new.setVisible(false);
				cM_new.setSize(400, 400);
				cM_new.setLocation(204, 0);
				cM_new.setPreferredSize(new java.awt.Dimension(400,400));
				cM_new.setName("mainNewPlayerPanel");
			}
			catch (java.lang.Throwable e) {
			    System.err.println("Laden des >getCM_new< ist fehlgeschlagen!");
			}
		}
		return cM_new;
	}

}  //  @jve:decl-index=0:visual-constraint="10,10"