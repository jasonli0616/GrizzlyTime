package helpers;

public class Constants {
    //spreadsheet layout
    public static final int LOGGEDINCOLUMN = 10;
    public static final int TOTALHOURSCOLUMN = 9;
    public static final int HOURSCOLUMN = 8;
    public static final int LASTLOGOUTCOLUMN = 7;
    public static final int LASTLOGINCOLUMN = 6;
    public static final int STUDENTIDCOLUMN = 0;
    public static final int FIRSTNAMECOLUMN = 1;
    public static final int LASTNAMECOLUMN = 2;

    //camera feed size
    public static final int cameraHeight = 400;
    public static final int cameraWidth = 610;

    //window constants
    public static final boolean windowResizable = false;

    //sheet codes
    public static final int mainSheet = 0;
    public static final int logSheet = 1;
    public static final int registrationSheet = 2;

    //configuration locations
    public static final String configLocal = "config.json";
    public static final String VERSION = "2.0.0";
    public static final String CREDITS = "Dalton Smith of Grizzly Robotics";

    //image constants minus our padding
    public static final int splashWidth = 400 - 10;
    public static final int splashHeight = 200 - 10;

    public static final boolean grizzlyPrompt = false;

    public static final String updateUrl = "https://raw.githubusercontent.com/Daltz333/GrizzlyTime-JavaFX/master/version.txt";

    public static final String releaseUrl = "https://github.com/Daltz333/GrizzlyTime-JavaFX/releases/latest";

}
