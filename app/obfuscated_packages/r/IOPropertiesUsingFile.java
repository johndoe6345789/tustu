package r;

import bH.D;
import bH.X;
import com.efiAnalytics.ui.bU;
import com.efiAnalytics.ui.eJ;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

public class IOPropertiesUsingFile implements bU {
  public static String a = "3.3.01";
  
  public static String b = "TunerStudio";
  
  public static String c = "MS";
  
  public static String d = "com.efiAnalytics.proprietary.MegaSquirtDashFilter";
  
  public static long e = System.currentTimeMillis();
  
  public static String f = "Controller";
  
  public static String g = "controller";
  
  public static String h = "https://www.efianalytics.com/register/viewProduct.jsp?productCode=TunerStudioMS";
  
  public static String i = "TunerStudioMS.jar";
  
  public static String j = "activationKey";
  
  public static String k = "Dash Echo";
  
  public static String l = "Seat";
  
  public static String m = "dashEchoActivationKey";
  
  public static String n = "registeredEdition";
  
  public static String o = "hardwareId";
  
  public static String p = "Hardware ID";
  
  public static String q = "defaultProject";
  
  public static String r = "uiPattern";
  
  public static String s = "previousUiPattern";
  
  public static String t = "tsproj";
  
  public static String u = "lastProjectArchiveDir";
  
  public static String v = "register.html";
  
  public static String w = "registerAppNotConnected.html";
  
  public static String x = "lastAdIndex";
  
  public static String y = "completeUpdate";
  
  public static String z = "userDashDir";
  
  public static String A = "userWheelDir";
  
  public static String B = "userTuneView";
  
  public static String C = "bin";
  
  public static String D = "http://www.efianalytics.com/MegaLogViewerHD/download/";
  
  public static String E = "lastFirmwareDir";
  
  public static String F = "forceOpenGL";
  
  public static boolean G = false;
  
  public static String H = "disableD3d";
  
  public static boolean I = true;
  
  public static String J = "disableRegistration";
  
  public static String K = "promptOnNoControllerFound";
  
  public static boolean L = true;
  
  public static String M = "https://www.efianalytics.com/register/browseProducts.jsp?ecuFamily=MegaSquirt&productCategory=Upgrades";
  
  public static String N = "https://www.efianalytics.com/register/resendRegistrationEmail.jsp";
  
  public static String O = "lastImportDir";
  
  public static String P = "publishDataLogValues";
  
  public static boolean Q = true;
  
  public static String R = "datalogAudioDeviceName";
  
  public static String S = "datalogAudioEnabled";
  
  public static boolean T = false;
  
  public static String U = "projectForSerial_";
  
  public static String V = "firmwareFileExtensions";
  
  public static String W = "queuedIniSignature_";
  
  public static String X = "queuedIniInfo_";
  
  public static String Y = "configServerPort";
  
  public static String Z = "configServerPassword";
  
  public static String aa = "preventSleep";
  
  public static boolean ab = false;
  
  public static String ac = "slaveServerEnabled";
  
  public static String ad = "downloadIniWithoutAsking";
  
  public static String ae = "saveTuneToDataLog";
  
  public static boolean af = true;
  
  public static String ag = "userPasswordTimeoutPeriod";
  
  public static String ah = "10";
  
  public static String ai = "yAxisBarometricPressure";
  
  public static int aj = 2024;
  
  public static String ak = "onlySubscibeActiveDash";
  
  public static String al = "maskIndicatorImages";
  
  public Properties am = null;
  
  public Properties an = null;
  
  public static Properties ao = null;
  
  public static String ap = null;
  
  public static String aq = null;
  
  public static String ar = "TS Dash";
  
  public static String as = "BigComm";
  
  public static String at = "BigComm Gen4";
  
  public static String au = "Grass Roots";
  
  public static String av = "Tune Monster";
  
  public static String aw = "Fuel Monster";
  
  public static String ax = "baudRate";
  
  public static String ay = "miniTermBaudRate";
  
  public static String az = "miniTermcommPort";
  
  public static String aA = "miniTermOutputFormat";
  
  public static String aB = "commLoggingActive";
  
  public static String aC = "false";
  
  public static String aD = "numOfCommDebugToCache";
  
  public static String aE = "protocolInitializer";
  
  public static String aF = "dashTargetFpsWindowed";
  
  public static String aG = "dashMaxCpuWindowed";
  
  public static String aH = "fieldFontSize";
  
  public static String aI = "defaultFontSizeAdjustment";
  
  public static String aJ = "lastFileDir";
  
  public static String aK = "delimiter";
  
  public static String aL = "fileExtensions";
  
  public static String aM = "lastJpegDir";
  
  public static String aN = "uid";
  
  public static String aO = "installDate";
  
  public static String aP = "version";
  
  public static String aQ = "automaticUpdates";
  
  public static String aR = "lastUpdateCheckDate";
  
  public static String aS = "lastDate";
  
  public static String aT = "loopCount";
  
  public static String aU = "tableEditorDisplayFormat";
  
  public static String aV = "projectsDir";
  
  public static String aW = "appDebugDir";
  
  public static String aX = "dashSplashImage";
  
  public static String aY = "gpsEnabled";
  
  public static String aZ = "pcShutDownCommand";
  
  public static String ba = "Multi Interface MegaSquirt Driver";
  
  public static String bb = "updStreamIpAddress";
  
  public static String bc = "promptWithConfigurationWarnings";
  
  public static boolean bd = false;
  
  public static boolean be = true;
  
  public static String bf = "loadLastProjectOnStart2";
  
  public static String bg = "openProjectFullScreenDash";
  
  public static String bh = "menuVisibleWhenDisabled";
  
  public static boolean bi = true;
  
  public static String bj = "promptWhenTuneChangedExternally";
  
  public static boolean bk = true;
  
  public static String bl = "showTooltipEnableConditions";
  
  public static boolean bm = false;
  
  public static String bn = "modalDialogs";
  
  public static String bo = "gaugeFloatDown";
  
  public static String bp = "runInLiteMode";
  
  public static String bq = "showDashOnlyMenu";
  
  public static boolean br = false;
  
  public static String bs = "runInDashOnlyMode";
  
  public static boolean bt = false;
  
  public static String bu = "performDiffOnConnect";
  
  public static boolean bv = true;
  
  public static String bw = "autoSaveOfflineTune";
  
  public static String bx = "alwaysPromptSaveTune";
  
  public static boolean by = false;
  
  public static String bz = "saveRestorePointOnProjectClose";
  
  public static boolean bA = true;
  
  public static String bB = "saveRestorePointOnLoad";
  
  public static boolean bC = true;
  
  public static String bD = "saveRestorePointOnConnect";
  
  public static boolean bE = true;
  
  public static String bF = "saveRestorePointOnLoad";
  
  public static boolean bG = true;
  
  public static String bH = "maxRestorePointSpace";
  
  public static int bI = 10;
  
  public static String bJ = "skipRestorePointWhenNoChange";
  
  public static boolean bK = true;
  
  public static String bL = "showVeAnalyzeGauges";
  
  public static boolean bM = true;
  
  public static String bN = "showVeAnalyzeLiveGraph";
  
  public static boolean bO = true;
  
  public static String bP = "alwaysAllowMultipleInstances";
  
  public static boolean bQ = false;
  
  public static String bR = "boldTableColoring";
  
  public static boolean bS = false;
  
  public static String bT = "alwaysLaunchNewMlv";
  
  public static boolean bU = false;
  
  public static String bV = "blackTableBackgrounds";
  
  public static boolean bW = false;
  
  public static String bX = "dataLogNamingOnStop";
  
  public static String bY = "dataLogNamingOnStart";
  
  public static String bZ = "dataLogNamingAuto";
  
  public static String ca = "sdRenameOnDownload";
  
  public static boolean cb = false;
  
  public static String cc = "showPsiOnYAxis";
  
  public static boolean cd = false;
  
  public static String ce = "dataLogNamingMode";
  
  public static String cf = bY;
  
  public static String cg = "mouseWheelTableActions";
  
  public static boolean ch = true;
  
  public static String ci = "showDialogHelpPane";
  
  public static boolean cj = true;
  
  public static String ck = "dashShowFPS";
  
  public static String cl = "autoBurnOnCloseDialog";
  
  public static String cm = "autoBurnOnPageChange";
  
  public static String cn = "selectedEdition";
  
  public static String co = "dash";
  
  public static String cp = "tuneView";
  
  public static String cq = "gauge";
  
  public static String cr = "mlg";
  
  public static String cs = "msl";
  
  public static String ct = "csv";
  
  public static String cu = "frd";
  
  public static String cv = "ms3";
  
  public static String cw = "msq";
  
  public static String cx = "validTuneFileExtensions";
  
  public static String cy = "part";
  
  public static String cz = cw + cy;
  
  public static String cA = "dataLogFormat";
  
  public static String cB = cr;
  
  public static String cC = "firstName";
  
  public static String cD = "lastName";
  
  public static String cE = "userEmail";
  
  public static String cF = "registrationKey";
  
  public static String cG = "dashEchoRegistrationKey";
  
  public static String cH = "hubRegistrationKey";
  
  public static String cI = "fallbackRegistrationKey";
  
  public static String cJ = "registrationUrl";
  
  public static String cK = "valid";
  
  public static String cL = "quadraticInterpolation";
  
  public static String cM = "immutableInterpolation";
  
  public static String cN = "triedBadKeys";
  
  public static String cO = "lastConnectedFirmwareSignature";
  
  private static a dq = null;
  
  public static boolean cP = false;
  
  public static String cQ = "hideGaugeDesignerMode";
  
  public static boolean cR = false;
  
  public static String cS = "hideMenuLookAndFeel";
  
  public static boolean cT = false;
  
  public static String cU = "hideMenuOptions";
  
  public static boolean cV = false;
  
  public static String cW = "hideDevTools";
  
  public static boolean cX = false;
  
  public static String cY = "hideFileImport";
  
  public static boolean cZ = false;
  
  public static String da = "hideGaugeClusterRightClick";
  
  public static boolean db = false;
  
  public static String dc = "hideMiniTerm";
  
  public static boolean dd = false;
  
  public static String de = "hideCommLogging";
  
  public static boolean df = false;
  
  public static String dg = "hideHelpMenu";
  
  public static boolean dh = false;
  
  public static String di = "veAnalyzeRunCount";
  
  public static String dj = "userReviewActive";
  
  public static String dk = "userReviewPrompted";
  
  public static String dl = "defaultTuneMenuStyle";
  
  public static String dm = "lastPluginDir";
  
  public static String dn = "logFileTransformMenuText";
  
  public static String[] do = new String[] { i.f, i.g, i.h };
  
  private boolean dr = false;
  
  List dp = new ArrayList();
  
  private boolean ds = false;
  
  private File dt = null;
  
  public static a a() {
    if (dq == null)
      dq = new a(); 
    return dq;
  }
  
  public void a(String paramString) {
    this.dp.add(paramString);
  }
  
  public boolean b(String paramString) {
    return this.dp.contains(paramString);
  }
  
  public String b() {
    return b + " " + c;
  }
  
  public Properties c() {
    if (this.am == null) {
      this.am = new Properties();
      String str = b + ".properties";
      try {
        str = X.b(str, " ", "");
        FileInputStream fileInputStream = new FileInputStream(str);
        this.am.load(fileInputStream);
      } catch (FileNotFoundException fileNotFoundException) {
        D.b("File Not Found: " + str);
      } catch (Exception exception) {
        System.out.println("ERROR loading " + str);
        exception.printStackTrace();
        System.out.println("Looking in: " + (new File(".")).getAbsolutePath());
      } 
    } 
    return this.am;
  }
  
  public String a(String paramString1, String paramString2) {
    String str = c(paramString1);
    return (str == null || str.equals("")) ? paramString2 : str;
  }
  
  public boolean a(String paramString, boolean paramBoolean) {
    String str = a(paramString, "" + paramBoolean);
    return (str != null && str.equals("true"));
  }
  
  public String c(String paramString) {
    String str = c(paramString, (String)null);
    if (str == null || str.equals(""))
      str = d(paramString); 
    return str;
  }
  
  public String d(String paramString) {
    return c().getProperty(paramString);
  }
  
  public boolean b(String paramString, boolean paramBoolean) {
    String str = c().getProperty(paramString);
    return (str != null) ? Boolean.parseBoolean(str) : paramBoolean;
  }
  
  public void b(String paramString1, String paramString2) {
    if (paramString2 == null || paramString2.equals("")) {
      d().remove(paramString1);
    } else {
      d().setProperty(paramString1, paramString2);
    } 
  }
  
  public void e(String paramString) {
    d().remove(paramString);
  }
  
  public String c(String paramString1, String paramString2) {
    String str = d().getProperty(paramString1);
    if (str == null || str.trim().equals(""))
      str = h().getProperty(paramString1); 
    if (str == null || str.trim().equals(""))
      str = d(paramString1); 
    if (str == null || str.equals(""))
      str = paramString2; 
    return str;
  }
  
  private String u() {
    String str;
    if (aq == null || aq.isEmpty()) {
      str = X.a(b).toLowerCase() + "User.properties";
    } else {
      str = aq;
    } 
    File file = new File(System.getProperty("user.home") + File.separator + ".efiAnalytics" + File.separator + str);
    return !a("storePropertiesLocal", "false").equals("true") ? file.getAbsolutePath() : str;
  }
  
  private String v() {
    String str = X.a(b).toLowerCase() + "User.properties";
    File file = new File(System.getProperty("user.home") + File.separator + str);
    return !a("storePropertiesLocal", "false").equals("true") ? file.getAbsolutePath() : str;
  }
  
  public Properties d() {
    if (this.an == null) {
      this.an = new Properties();
      try {
        String str = u();
        if (!(new File(str)).exists()) {
          String str1 = v();
          if (str1 != null && !str1.equals(str)) {
            str = str1;
            File file = new File(str1);
            if (file.exists())
              file.deleteOnExit(); 
          } 
        } 
        FileInputStream fileInputStream = new FileInputStream(str);
        this.an.load(fileInputStream);
      } catch (FileNotFoundException fileNotFoundException) {
        D.c("Unable to load user properties, looking in:\n" + (new File(".")).getAbsolutePath());
      } catch (Exception exception) {
        D.c("ERROR loading tsUser.properties");
        exception.printStackTrace();
        D.c("Looking in: " + (new File(".")).getAbsolutePath());
      } 
    } 
    return this.an;
  }
  
  public void e() {
    if (d() != null) {
      File file = null;
      file = new File(u());
      if (!file.getParentFile().exists())
        file.getParentFile().mkdirs(); 
      byte b = 0;
      while (b < 3) {
        try {
          FileOutputStream fileOutputStream = new FileOutputStream(file);
          d().store(fileOutputStream, "Do not edit this file the Application will maintain this.");
          System.out.println("Saved user properties successfully");
          break;
        } catch (Exception exception) {
          if (b >= 2) {
            System.out.println("Error saving user properties, giving up.:");
            exception.printStackTrace();
            throw new V.a("Unable to save user preferences.\nError message:\n" + exception.getMessage());
          } 
          System.out.println("Error saving user properties, trying again.");
          try {
            Thread.sleep(100L);
          } catch (InterruptedException interruptedException) {}
          b++;
        } 
      } 
    } 
  }
  
  public void d(String paramString1, String paramString2) {
    if (paramString2 == null || paramString2.equals("")) {
      h().remove(paramString1);
    } else {
      h().setProperty(paramString1, paramString2.trim());
    } 
  }
  
  public String f() {
    if (ap == null || ap.isEmpty()) {
      String str1 = X.a(b).toLowerCase();
      String str2 = X.b(c, " Lite!", "");
      str2 = X.b(str2, "(Beta)", "");
      if (str2.contains(" "))
        str2 = str2.substring(0, str2.indexOf(" ")); 
      ap = str1 + str2 + ".reg";
    } 
    File file = new File(System.getProperty("user.home") + File.separator + ".efiAnalytics" + File.separator + ap);
    return !a("storePropertiesLocal", "false").equals("true") ? file.getAbsolutePath() : ap;
  }
  
  public String g() {
    String str1 = X.a(b).toLowerCase();
    String str2 = X.b(c, " Lite!", "");
    str2 = X.b(str2, "(Beta)", "");
    String str3 = str1 + str2 + ".reg";
    File file = new File(System.getProperty("user.home") + File.separator + str3);
    return !a("storePropertiesLocal", "false").equals("true") ? file.getAbsolutePath() : str3;
  }
  
  public Properties h() {
    if (ao == null) {
      ao = new Properties();
      try {
        boolean bool = false;
        String str = f();
        str = g();
        if (!(new File(str)).exists() && (new File(str)).exists())
          bool = true; 
        FileInputStream fileInputStream = new FileInputStream(str);
        ao.load(fileInputStream);
        if (bool)
          i(); 
      } catch (Exception exception) {
        System.out.println("Registration file not found. ");
      } 
    } 
    return ao;
  }
  
  public void i() {
    String str1 = f();
    File file1 = new File(str1);
    if (!file1.getParentFile().exists())
      file1.getParentFile().mkdirs(); 
    String str2 = file1.getAbsolutePath();
    File file2 = new File(str2);
    try {
      D.d("write to reg file");
      FileOutputStream fileOutputStream = new FileOutputStream(file2);
      h().store(fileOutputStream, b + " registration info. EFI Analytics.");
      fileOutputStream.flush();
      D.d("wrote to reg file");
    } catch (Exception exception) {
      System.out.println("Error saving: " + str2);
      exception.printStackTrace();
      throw new V.a("Unable to save registration information to disk.\nIs '" + str2 + "' write protected?");
    } 
  }
  
  public int a(String paramString, int paramInt) {
    try {
      String str = c(paramString);
      return Integer.parseInt(str);
    } catch (Exception exception) {
      return paramInt;
    } 
  }
  
  public int b(String paramString, int paramInt) {
    try {
      return Integer.parseInt(d(paramString));
    } catch (Exception exception) {
      return paramInt;
    } 
  }
  
  public float a(String paramString, float paramFloat) {
    try {
      return Float.parseFloat(c(paramString, "" + paramFloat));
    } catch (Exception exception) {
      D.c("Invalid value for " + paramString);
      return paramFloat;
    } 
  }
  
  public int c(String paramString, int paramInt) {
    try {
      return Integer.parseInt(c(paramString, "" + paramInt));
    } catch (Exception exception) {
      return paramInt;
    } 
  }
  
  public long a(String paramString, long paramLong) {
    try {
      return Long.parseLong(c(paramString, "" + paramLong));
    } catch (Exception exception) {
      return paramLong;
    } 
  }
  
  public double a(String paramString, double paramDouble) {
    try {
      return Double.parseDouble(c(paramString, "" + paramDouble));
    } catch (Exception exception) {
      return paramDouble;
    } 
  }
  
  public boolean c(String paramString, boolean paramBoolean) {
    try {
      return c(paramString, "" + paramBoolean).equals("true");
    } catch (Exception exception) {
      return paramBoolean;
    } 
  }
  
  public String[] f(String paramString) {
    ArrayList<String> arrayList = new ArrayList();
    for (String str : d().keySet()) {
      if (str.startsWith(paramString))
        arrayList.add(str); 
    } 
    Object[] arrayOfObject = arrayList.toArray();
    String[] arrayOfString = new String[arrayOfObject.length];
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfString[b] = (String)arrayOfObject[b]; 
    return arrayOfString;
  }
  
  public boolean j() {
    return Boolean.parseBoolean(a("debugCommTimings", "false"));
  }
  
  public String k() {
    return a().b() + " v" + a + "\nBy\nEFI Analytics\n \nSimplifying EFI\n \nPerformance, Drivability & Efficiency Simplified! \nTuning, dashboard and higher level analytics \nMulti-Platform Windows, Linux, OS X\nJava Runtime version: " + System.getProperty("java.version") + " " + System.getProperty("os.arch") + "\nProcessor Score: " + a().a(aT, "") + "\n \nhttps://www.EFIAnalytics.com/ \nsupport@efianalytics.com copyright 2007-" + Calendar.getInstance().get(1) + "\n";
  }
  
  public String l() {
    return b;
  }
  
  public String m() {
    return c;
  }
  
  public String n() {
    return aJ;
  }
  
  public int o() {
    int i = 0;
    try {
      i = Integer.parseInt(a(aI, "0"));
    } catch (Exception exception) {
      D.a("Invalid defaultFontSizeAdjustment in properties, value must be an integer");
    } 
    return eJ.a() + i;
  }
  
  public int p() {
    int i = 0;
    try {
      i = Integer.parseInt(a(aI, "0"));
    } catch (Exception exception) {
      D.a("Invalid defaultFontSizeAdjustment in properties, value must be an integer");
    } 
    return i;
  }
  
  public void a(boolean paramBoolean) {
    b(paramBoolean);
  }
  
  public boolean q() {
    return this.ds;
  }
  
  public void b(boolean paramBoolean) {
    this.ds = paramBoolean;
  }
  
  public void a(File paramFile) {
    this.dt = paramFile;
  }
  
  public File r() {
    return this.dt;
  }
  
  public boolean s() {
    return this.dr;
  }
  
  public void c(boolean paramBoolean) {
    this.dr = paramBoolean;
  }
  
  public File t() {
    return new File(u());
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/r/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */