
package de.q3cm.libs;

public class langMan {

	//---------------------------------------------------------------------------- Switch Nummern anlegen
	//CM_main
		public static final int NIX               = 0;
		public static final int MAIN		      = 1;

	//CM_controller
		public static final int PLAYERICON        = 100;
	    public static final int SELECTPLAYER      = 101;
	    public static final int SELECTMOD         = 102;
	    public static final int SELECTSERVER      = 103;
	    public static final int EDITBUTTON        = 104;
	    public static final int RUNBUTTON         = 105;
	    public static final int LOADBUTTON        = 106;
	    public static final int NEWBUTTON         = 107;
	    public static final int WWWBUTTON         = 108;
	    public static final int CONFIGBUTTON      = 109;

    //CM_editPlayer
	    public static final int EDITABORTBUTTON   = 200;
	    public static final int EDITSAVEBUTTON    = 201;
    
    //CM_newPlayer
	    public static final int NEWABORTBUTTON    = 300;
	    public static final int NEWNEXTBUTTON     = 301;
	    public static final int NEWLASTBUTTON     = 302;
	    public static final int NEWTOPIC          = 303;

	    	//Wizard Page.1
	    public static final int HEADWIZARDINFO_01 = 310;
	    public static final int CLANNAME          = 311;
	    public static final int PLAYERNAME        = 312;
	    public static final int PC_OUTPUT         = 313;
	    public static final int COLORSELECTOR     = 314;
	    public static final int PLAYERCLANOUTPUT  = 315;
	    	//Wizard Page.2
	    public static final int HEADWIZARDINFO_02 = 320;
	    public static final int FOVSCROLLER       = 321;
	    public static final int FOVOUTPUT         = 322;
	    public static final int FOVPIC            = 323;

    //CM_newPlayer
	    public static final int CONFIGABORTBUTTON = 400;
	    public static final int CONFIGSAVEBUTTON  = 401;
	
	public static String getTheText(int index) {

	    // TODO: Anstatt Switch-Liste Sprach-Datei import
	    switch(index) {
	        
	    //CM_main
			case NIX:               return new String(AddHtml(""));
			case MAIN:              return new String(AddHtml("<b>Coded by:</b><ul><li>basic.X <i> - Q3.code</i></li><li>EvilWolf <i> - HARD.code</i></li><li>WrYBiT <i> - GFX.code</i></li></ul><i>Copyright 2oo5</i><br><br>Version: <b>o.o2</b><br>Releasedate: <b>26.o1.2oo5</b>"));

		//CM_controller
	        case PLAYERICON:        return new String(AddHtml("Here you could see the PlayerIcon, of the Quake Model, of the selected Player."));
		    case SELECTPLAYER:      return new String(AddHtml("Here you need to select your player. If your Player-Nicname is <b>not</b> in this list, click on the <b>New</b> Button an create your own, new Player."));
		    case SELECTMOD:         return new String(AddHtml("Here you have to select the <u>allready</u> installed Quake 3 Mod, you like to play."));
		    case SELECTSERVER:      return new String(AddHtml("Here you can select a Server via <i>Hostname</i> or <i>IP</i>. If your wished Server is <b>not</b> in the List, you could add him very simpel to the List. Just write the <i>Hostname</i> or <i>IP</i> into the ComboBox. The new Server will be storred in the list, if you hit the run Button."));
		    case EDITBUTTON:        return new String(AddHtml("Click here to <b>edit</b> the selected Player."));
		    case RUNBUTTON:         return new String(AddHtml("Click here to <b>run</b> Quake with your settings."));
		    case LOADBUTTON:        return new String(AddHtml("Click here to <b>load</b> / <b>import</b> a new Player with his settings."));
		    case NEWBUTTON:         return new String(AddHtml("Click here to create a <b>new</b> Player with a easy step by step wizzard."));
		    case WWWBUTTON:         return new String(AddHtml("Click here to visite the configed Website.<br><i>(The default Q3climan support webside: <b>www.helix.baiz.org</b>)</i>"));
		    case CONFIGBUTTON:      return new String(AddHtml("Click here to <b>configurate</b> the Quake 3 Client Mangager"));

	    //CM_editPlayer
		    case EDITABORTBUTTON:   return new String(AddHtml("Click here to <b>abort</b> the \"edit selected player\" mode."));
		    case EDITSAVEBUTTON:    return new String(AddHtml("Click here to <b>save</b> the \"edit selected player\" settings now."));
	    
	    //CM_newPlayer
		    case NEWABORTBUTTON:    return new String(AddHtml("Click here to <B>abort</b> the creation prozess of a new Player."));
		    case NEWNEXTBUTTON:     return new String(AddHtml("Click here to enter the <b>next</b> Step."));
		    case NEWLASTBUTTON:     return new String(AddHtml("Click here to enter the <b>last</b> Step again."));
		    case NEWTOPIC:          return new String(" Create a New Player");

		    //Wizard Page.1
		    case HEADWIZARDINFO_01: return new String(AddHtml("<font color='#ffffff'>Here you could set up your Player Name and the Name of your Clan. It will be put together to one Name. And it will be stored in the var.: <b>QuakeName$</b></font>"));
		    case CLANNAME:          return new String(AddHtml(""));
		    case PLAYERNAME:        return new String(AddHtml(""));
		    case PC_OUTPUT:         return new String(AddHtml("<center><font size='5'>Output:</font> <i><font size='4'>(Please enter a name.)</font></i></center>"));
		    case PLAYERCLANOUTPUT:  return new String(AddHtml(""));
		    case COLORSELECTOR:     return new String(AddHtml(""));

		    //Wizard Page.2
		    case HEADWIZARDINFO_02: return new String(AddHtml("<font color='#ffffff'>Here you could setup the default Fov angel in Quake.<br>It changes the spectrum sice of the angel you see in the play mode.</font>"));
		    case FOVSCROLLER:       return new String(AddHtml("Move the slider to change the Fov Angel."));
		    case FOVOUTPUT:         return new String("Current FOV angel = ");
		    case FOVPIC:            return new String(AddHtml("Here you could see how the FOV angel will work in Quake. <i>Only every 5th tick will be show as Pic.</i>"));

		//CM_newPlayer
		    case CONFIGABORTBUTTON: return new String(AddHtml("Click here to <B>abort</b> the config area of the \"Quake 3 Client Manager 2oo5\" now."));
		    case CONFIGSAVEBUTTON:  return new String(AddHtml("Click here to <B>save</b> the config changes you made."));
		        
        }
        return new String("");
    }

	private static String AddHtml(String AddHtmlStringToText){
	    // TODO: Automatische Farbanpassung der HTML Boxen zum Theme Background
		return new String ("<html><body><font face='verdana' size='2'>" + AddHtmlStringToText + "</font></body></html>\n");
	}
};