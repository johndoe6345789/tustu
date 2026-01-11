package h;

import V.a;
import bH.D;
import bH.X;
import g.k;
import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class i {
  public static String a = "4.5.28";
  
  public static String b = "MegaLogViewer";
  
  public static String c = b.c + b.b;
  
  public static Properties d = null;
  
  public static Properties e = null;
  
  public static Properties f = null;
  
  public static String g = "mlv.reg";
  
  public static String h = ".mlvreg";
  
  public static String i = "mlvUser.properties";
  
  public static String j = null;
  
  public static String k = "MegaLogViewer.exe";
  
  public static String l = "MegaLogViewer.jar";
  
  public static String m = "https://www.efiAnalytics.com/MegaLogViewer/";
  
  public static String n = "https://www.efianalytics.com/register/viewProduct.jsp?productCode=MegaLogViewer";
  
  public static boolean o = false;
  
  public static boolean p = true;
  
  public static boolean q = false;
  
  public static int r = 30;
  
  public static int s = 8;
  
  public static int t = 4;
  
  public static int u = 4;
  
  public static String v = "\t";
  
  public static String w = "bin";
  
  public static boolean x = true;
  
  public static String y = "completeUpdate";
  
  public static boolean z = false;
  
  public static String A = "./resources/MLVLogoB.gif";
  
  public static String B = "resources/icon.gif";
  
  public static String C = "projectDirs";
  
  public static String D = "loggerFileDir";
  
  public static String E = "alphabetizeFieldLists";
  
  public static boolean F = true;
  
  public static String G = "mouseWheelAction";
  
  public static String H = "mouseWheelActionZoom";
  
  public static String I = "mouseWheelActionPage";
  
  public static String J = H;
  
  public static String K = "showGraphText";
  
  public static String L = "showGraphMinMax";
  
  public static boolean M = true;
  
  public static String N = "viewTableLayout";
  
  public static String O = "0TableLayout";
  
  public static String P = "1TableLayout";
  
  public static String Q = "2TablesLayout";
  
  public static String R = Q;
  
  public static String S = "paintCursorValuesPosition";
  
  public static String T = "withLabels";
  
  public static String U = "scaleToFitFullLogOnLoad";
  
  public static boolean V = false;
  
  public static String W = "verticalDividerLocation";
  
  public static String X = "horizontalDividerLocation";
  
  public static String Y = "Tmr_Enable";
  
  public static String Z = "forceOpenGL";
  
  public static String aa = "repeatGraphColors";
  
  public static boolean ab = true;
  
  public static String ac = "preferredVeAnalyzeAfrField";
  
  public static String ad = "preferredVeAnalyzeGegoField";
  
  public static int ae = 1;
  
  public static String af = "antialiasGraphLine";
  
  public static boolean ag = false;
  
  public static String ah = "patterenedGraphLine";
  
  public static boolean ai = false;
  
  public static String aj = "openLastQuickView";
  
  public static boolean ak = true;
  
  public static String al = "windowMaximized";
  
  private static String aM = null;
  
  private static List aN = new ArrayList();
  
  public static String am = "remoteFileDialogWidth";
  
  public static String an = "remoteFileDialogHeight";
  
  public static String ao = "remoteFileExists";
  
  public static int ap = 0;
  
  public static int aq = 1;
  
  public static int ar = 3;
  
  public static String as = "remoteFileDownloadLocation";
  
  public static String at = "remoteFileDownloadLocationPref";
  
  public static int au = 0;
  
  public static int av = 1;
  
  public static String aw = "timeslipRolloutTime";
  
  public static String ax = "jumpToTimeslipLaunch";
  
  public static boolean ay = true;
  
  public static String az = "generateTimeslip";
  
  public static boolean aA = true;
  
  public static String aB = "showTimeslip";
  
  public static boolean aC = true;
  
  public static String aD = "keepSyncWith2ndInstance";
  
  public static boolean aE = true;
  
  public static String aF = "autoZeroExpression";
  
  public static String aG = "enableDeadO2Filter";
  
  public static boolean aH = true;
  
  public static boolean aI = false;
  
  public static String aJ = "useMultipleDataSets";
  
  public static boolean aK = true;
  
  public static Image aL = null;
  
  public static void a(j paramj) {
    aN.add(paramj);
  }
  
  private static void l() {
    for (j j : aN)
      j.a(); 
  }
  
  public static Properties a() {
    if (d == null) {
      d = new Properties();
      String str = X.b(b, " ", "") + ".properties";
      if (j != null && j.length() > 0)
        str = j; 
      try {
        FileInputStream fileInputStream = new FileInputStream(str);
        d.load(fileInputStream);
      } catch (Exception exception) {
        System.out.println("ERROR loading " + str);
        exception.printStackTrace();
        System.out.println("Looking in: " + (new File(".")).getAbsolutePath());
      } 
    } 
    return d;
  }
  
  public static String b() {
    if (a("storePropertiesLocal", "false").equals("true"))
      return g; 
    File file = new File(h.a() + File.separator + g);
    if (file.exists())
      return file.getAbsolutePath(); 
    if (c.equals("MS") || c.equals(b.c + b.b)) {
      file = new File(System.getProperty("user.home") + File.separator + h);
    } else {
      file = new File(System.getProperty("user.home") + File.separator + g);
    } 
    return file.exists() ? file.getAbsolutePath() : (new File(h.a() + File.separator + g)).getAbsolutePath();
  }
  
  public static Properties c() {
    if (f == null) {
      f = new Properties();
      try {
        FileInputStream fileInputStream = new FileInputStream(b());
        f.load(fileInputStream);
      } catch (Exception exception) {
        System.out.println("Registration file not found. ");
      } 
    } 
    return f;
  }
  
  public static String a(String paramString) {
    String str = null;
    if (paramString.equals(D))
      str = h.d(); 
    return str;
  }
  
  public static String a(String paramString1, String paramString2) {
    String str = b(paramString1);
    return (str == null || str.equals("")) ? paramString2 : str;
  }
  
  public static String b(String paramString) {
    String str = e(paramString, null);
    if (str == null || str.equals(""))
      str = c(paramString); 
    return str;
  }
  
  public static String b(String paramString1, String paramString2) {
    String str = c(paramString1);
    if (str == null || str.isEmpty())
      str = paramString2; 
    return str;
  }
  
  public static String c(String paramString) {
    null = a().getProperty(paramString);
    return h(null);
  }
  
  private static String h(String paramString) {
    if (paramString == null)
      return paramString; 
    while (paramString.indexOf("SUB_FORMULA") != -1) {
      String str1 = paramString.substring(paramString.indexOf("SUB_FORMULA"), paramString.indexOf(")", paramString.indexOf("SUB_FORMULA")) + 1);
      String str2 = str1.substring(str1.indexOf("(") + 1, str1.length() - 1);
      String str3 = "(" + a("SUB_FORMULA_" + str2, "") + ")";
      paramString = k.a(paramString, str1, str3);
    } 
    return paramString;
  }
  
  public static void c(String paramString1, String paramString2) {
    if (paramString2 == null || paramString2.equals("")) {
      f().remove(paramString1);
    } else {
      f().setProperty(paramString1, paramString2);
    } 
  }
  
  public static void d(String paramString1, String paramString2) {
    if (paramString2 == null || paramString2.equals("")) {
      c().remove(paramString1);
    } else {
      c().setProperty(paramString1, paramString2);
    } 
  }
  
  public static String d() {
    if (aM == null) {
      byte[] arrayOfByte = { 42 };
      try {
        aM = new String(arrayOfByte, "UTF-8");
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        Logger.getLogger(i.class.getName()).log(Level.WARNING, "Bad Asterick??", unsupportedEncodingException);
        aM = "~";
      } 
    } 
    return aM;
  }
  
  public static void d(String paramString) {
    f().remove(paramString);
  }
  
  public static String e(String paramString1, String paramString2) {
    String str = f().getProperty(paramString1);
    if (str == null || str.equals(""))
      str = c().getProperty(paramString1); 
    if (str == null || str.equals(""))
      str = paramString2; 
    return str;
  }
  
  public static String f(String paramString1, String paramString2) {
    String str = f().getProperty(paramString1);
    if (str == null || str.equals(""))
      str = c().getProperty(paramString1); 
    if (str == null || str.equals(""))
      str = c(paramString1); 
    if (str == null || str.equals(""))
      str = paramString2; 
    return str;
  }
  
  public static boolean e() {
    String str = f().getProperty("uid");
    return (str != null && str.length() > 0);
  }
  
  private static String m() {
    File file = new File(h.a() + File.separator + i);
    if (!a("storePropertiesLocal", "false").equals("true")) {
      if (!file.exists()) {
        file = new File(System.getProperty("user.home") + File.separator + i);
        file.deleteOnExit();
      } 
      if (!file.exists())
        file = new File(n().getAbsolutePath() + ".bak"); 
      if (file.exists())
        return file.getAbsolutePath(); 
    } 
    return i;
  }
  
  private static File n() {
    return a("storePropertiesLocal", "false").equals("true") ? new File(i) : new File(h.a() + File.separator + i);
  }
  
  public static Properties f() {
    if (e == null) {
      e = new Properties();
      try {
        String str = m();
        File file1 = new File(str);
        File file2 = new File(n() + ".bak");
        if (a(file1)) {
          FileInputStream fileInputStream = new FileInputStream(file1);
          e.load(fileInputStream);
        } else if (a(file2)) {
          FileInputStream fileInputStream = new FileInputStream(file2);
          e.load(fileInputStream);
        } 
      } catch (FileNotFoundException fileNotFoundException) {
        D.c("user Properties file not found. " + fileNotFoundException.getLocalizedMessage());
      } catch (Exception exception) {
        System.out.println("ERROR loadinguser properties");
        exception.printStackTrace();
      } 
    } 
    return e;
  }
  
  private static boolean a(File paramFile) {
    if (!paramFile.exists() || paramFile.length() < 150L)
      return false; 
    BufferedReader bufferedReader = null;
    try {
      bufferedReader = new BufferedReader(new FileReader(paramFile));
      String str = bufferedReader.readLine();
      return (str != null && str.startsWith("#Do not edit this file the Application will maintain this."));
    } catch (FileNotFoundException fileNotFoundException) {
      return false;
    } catch (IOException iOException) {
      return false;
    } finally {
      if (bufferedReader != null)
        try {
          bufferedReader.close();
        } catch (IOException iOException) {} 
    } 
  }
  
  public static void g() {
    if (e != null && e.get("version") != null) {
      File file = n();
      FileOutputStream fileOutputStream = null;
      try {
        File file1 = new File(file.getAbsolutePath() + ".bak");
        if (a(file) && file.length() > 300L)
          try {
            file1.delete();
            file1 = new File(file.getAbsolutePath() + ".bak");
            if (!file.renameTo(file1)) {
              D.c("Save user properties backup failed rename, try again.");
              Thread.sleep(250L);
              file1.delete();
              file1 = new File(file.getAbsolutePath() + ".bak");
              file.renameTo(file1);
            } 
          } catch (Exception exception) {
            D.a("Error saving User Setting Backup.");
          }  
        fileOutputStream = new FileOutputStream(file);
        e.store(fileOutputStream, "Do not edit this file the Application will maintain this.\nAll editable properties are in " + j);
        D.c("Saved user log settings.");
        l();
      } catch (Exception exception) {
        System.out.println("Error saving user.properties:");
        exception.printStackTrace();
      } finally {
        try {
          if (fileOutputStream != null)
            fileOutputStream.close(); 
        } catch (Exception exception) {}
      } 
    } 
  }
  
  public static void h() {
    if (e != null) {
      String str = g;
      if (!a("storePropertiesLocal", "false").equals("true"))
        str = h.a() + File.separator + g; 
      File file = new File(str);
      try {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        c().store(fileOutputStream, b + " " + c + " registration info. EFI Analytics.");
        fileOutputStream.flush();
      } catch (Exception exception) {
        System.out.println("Error saving: " + str);
        exception.printStackTrace();
        throw new a("Unable to save registration information to disk.\nDo you have write access to the installation folder?");
      } 
    } 
  }
  
  public static Color a(String paramString, Color paramColor) {
    try {
      String str1 = e(paramString, null);
      if (str1 == null || str1.equals(""))
        str1 = c(paramString); 
      if (str1 == null)
        str1 = c(paramString.toLowerCase()); 
      String str2 = c(str1);
      return new Color(Integer.parseInt(str2));
    } catch (Exception exception) {
      return paramColor;
    } 
  }
  
  public static int a(String paramString, int paramInt) {
    try {
      String str = b(paramString);
      return Integer.parseInt(str);
    } catch (Exception exception) {
      return paramInt;
    } 
  }
  
  public static int b(String paramString, int paramInt) {
    try {
      return Integer.parseInt(e(paramString, "" + paramInt));
    } catch (Exception exception) {
      return paramInt;
    } 
  }
  
  public static long a(String paramString, long paramLong) {
    try {
      return Long.parseLong(e(paramString, "" + paramLong));
    } catch (Exception exception) {
      return paramLong;
    } 
  }
  
  public static double a(String paramString, double paramDouble) {
    try {
      return Double.parseDouble(e(paramString, "" + paramDouble));
    } catch (Exception exception) {
      return paramDouble;
    } 
  }
  
  public static boolean a(String paramString, boolean paramBoolean) {
    try {
      return f(paramString, "" + paramBoolean).equals("true");
    } catch (Exception exception) {
      return paramBoolean;
    } 
  }
  
  public static String[] e(String paramString) {
    ArrayList<String> arrayList = new ArrayList();
    for (String str : a().keySet()) {
      if (str.startsWith(paramString) && !arrayList.contains(str))
        arrayList.add(str); 
    } 
    for (String str : f().keySet()) {
      if (str.startsWith(paramString) && !arrayList.contains(str))
        arrayList.add(str); 
    } 
    Object[] arrayOfObject = arrayList.toArray();
    String[] arrayOfString = new String[arrayOfObject.length];
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfString[b] = (String)arrayOfObject[b]; 
    return arrayOfString;
  }
  
  public static String[] f(String paramString) {
    ArrayList<String> arrayList = new ArrayList();
    for (String str : f().keySet()) {
      if (str.startsWith(paramString))
        arrayList.add(str); 
    } 
    Object[] arrayOfObject = arrayList.toArray();
    String[] arrayOfString = new String[arrayOfObject.length];
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfString[b] = (String)arrayOfObject[b]; 
    return arrayOfString;
  }
  
  public static String[] g(String paramString) {
    ArrayList<String> arrayList = new ArrayList();
    for (String str : a().keySet()) {
      if (str.startsWith(paramString))
        arrayList.add(str); 
    } 
    Object[] arrayOfObject = arrayList.toArray();
    String[] arrayOfString = new String[arrayOfObject.length];
    for (byte b = 0; b < arrayOfString.length; b++)
      arrayOfString[b] = (String)arrayOfObject[b]; 
    return arrayOfString;
  }
  
  public static String i() {
    return b + " v" + a + "\nBy\nEFI Analytics\n \n \nMulti-Platform Windows, Linux and MAC\nJava Runtime version: " + System.getProperty("java.vendor") + " - " + System.getProperty("os.arch") + " " + System.getProperty("java.version") + "\nProcessor Score: " + a("loopCount", "") + "\n \n \n" + m + " \nsupport@efianalytics.com ©2005-" + Calendar.getInstance().get(1) + "\n";
  }
  
  public static boolean j() {
    return a("delimiter", "Auto").equals("Auto");
  }
  
  public static String k() {
    null = X.b(b + X.b(c, b.b, ""), " ", "");
    return X.b(null, b.b, "");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/h/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */