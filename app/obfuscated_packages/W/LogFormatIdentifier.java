package W;

import V.a;
import ak.V;
import ak.aa;
import bH.D;
import bH.I;
import bH.t;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class X {
  public static String a = "delimitedAscii";
  
  public static String b = "VTune Data+";
  
  public static String c = "VTune Data1";
  
  public static String d = "CAM Tune Data%";
  
  public static String e = "Generic O2 Data7";
  
  public static String f = "Generic Data1";
  
  public static String g = "DBW DataC";
  
  public static String h = "Dyno Data";
  
  public static String i = "Oxygen Sensor Data=";
  
  public static String j = "Spark Data";
  
  public static String k = "Engine Data 17";
  
  public static String l = "Engine Data 2I";
  
  public static String m = "TunerPro v5 Log";
  
  public static String n = "Power Vision Log";
  
  public static String o = "MX2_ATHENA";
  
  public static String p = "Torque Log";
  
  public static String q = "ECUDataScan";
  
  public static String r = "Dynojet Export";
  
  public static String s = "Dynomite";
  
  public static String t = "Evo Scan";
  
  public static String u = "OBDTester";
  
  public static String v = "ProEFI";
  
  public static String w = "BigStuffDelimited";
  
  public static String x = "HPTunerExport";
  
  public static String y = "HPTunerCvsLog";
  
  public static String z = "HaltechESP";
  
  public static String A = "TCFI Delimited";
  
  public static String B = "ThunderMaxAFR";
  
  public static String C = "HolleyExport";
  
  public static String D = "unknownFormat";
  
  public static String E = "VCDSLog";
  
  public static String F = "DTALog";
  
  public static String G = "FAPLog";
  
  public static String H = "Electromotive/WINTEC";
  
  public static String I = "MegaLogViewer Log";
  
  public static String J = "COBB Tuning";
  
  public static String K = "EFI Technology/ECT";
  
  public static String L = "ASAM MDF Log";
  
  public static String M = "ASAM MDF4 Log";
  
  public static String N = "AEM Export";
  
  public static String O = "Race Technology";
  
  public static String P = "Fuel Tech";
  
  public static String Q = "ECU Master";
  
  public static String R = "EMtron";
  
  public static String S = "MicroTech";
  
  public static String T = "Race Capture Pro";
  
  public static String U = "AIM CSV";
  
  public static String V = "LifRacer CSV";
  
  public static String W = "MAXX_ECU";
  
  public static String X = "Motronic_CVS";
  
  public static String Y = "Scanmatik_CVS";
  
  public static String Z = "NSFW_PCM_Logger_CVS";
  
  public static String aa = "Serdia_Log";
  
  public static String ab = "VehiCAL_Log";
  
  public static String ac = "G4x_Log";
  
  public static String ad = "edgeAutonomy";
  
  public static String ae = "AutoEnginuityGiotto";
  
  public static String af = "HWiNFO";
  
  public static String ag = "Durametric";
  
  public static String a(File paramFile) {
    if (!paramFile.exists())
      throw new FileNotFoundException("Log File not found:\n" + paramFile.getAbsolutePath()); 
    String str = paramFile.getName().toLowerCase();
    if (str.endsWith(".xls") || str.endsWith(".msl"))
      return c(paramFile) ? I : a; 
    if (str.endsWith(".mlg"))
      return I; 
    if (str.endsWith(".mtl"))
      return S; 
    if (str.endsWith(".emulog") || str.endsWith(".emublog"))
      return Q; 
    if (str.endsWith(".etl"))
      return K; 
    if (str.endsWith(".mdf") || str.endsWith(".mf4") || (str.endsWith(".dat") && t.a(paramFile, aa.f)))
      return t.a(paramFile, V.a) ? M : L; 
    if (str.endsWith(".dm3")) {
      String str1 = b(paramFile);
      D.c("'" + str1 + "'");
      return str1;
    } 
    if (str.toLowerCase().endsWith(".maxxecu-zip-log") || str.toLowerCase().endsWith(".maxxecu-log"))
      return W; 
    if (str.endsWith(".csv") || str.endsWith(".txt") || str.endsWith(".dat") || str.endsWith(".rec") || str.endsWith(".log")) {
      String str1 = d(paramFile);
      D.c("'" + str1 + "'");
      return str1;
    } 
    return a;
  }
  
  private static String b(File paramFile) {
    FileInputStream fileInputStream = new FileInputStream(paramFile);
    String str = "";
    try {
      fileInputStream.skip(1638L);
      int i;
      for (i = fileInputStream.read(); i != 0 && i != 19; i = fileInputStream.read())
        str = str + (char)i; 
      if (str.length() == 0) {
        while (i < 65 || i > 90)
          i = fileInputStream.read(); 
        while (i != 0 && i != 19) {
          str = str + (char)i;
          i = fileInputStream.read();
        } 
      } 
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new a("Unable to read DM3 file type identifier.");
    } finally {
      try {
        fileInputStream.close();
      } catch (IOException iOException) {
        iOException.printStackTrace();
      } 
    } 
    return str;
  }
  
  private static boolean c(File paramFile) {
    FileInputStream fileInputStream = new FileInputStream(paramFile);
    try {
      byte[] arrayOfByte = new byte[6];
      fileInputStream.read(arrayOfByte);
      return (arrayOfByte[0] == 77 && arrayOfByte[1] == 76 && arrayOfByte[2] == 86 && arrayOfByte[3] == 76 && arrayOfByte[4] == 71 && arrayOfByte[5] == 0);
    } catch (IOException iOException) {
      Logger.getLogger(X.class.getName()).log(Level.WARNING, "File not readable.", iOException);
      return false;
    } finally {
      try {
        fileInputStream.close();
      } catch (Exception exception) {
        Logger.getLogger(X.class.getName()).log(Level.INFO, "Odd, nut no biggie", exception);
      } 
    } 
  }
  
  private static String d(File paramFile) {
    FileInputStream fileInputStream = new FileInputStream(paramFile);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
    try {
      String str = bufferedReader.readLine();
      byte b = 0;
      boolean bool = false;
      while (str != null && b < 100) {
        if (str.startsWith("ScannerPro Engine") || str.startsWith("TunerPro"))
          return m; 
        if (str.startsWith("\"Time Line\";\""))
          return P; 
        if (str.contains("Dynojet Power Vision Log File"))
          return n; 
        if (str.indexOf("\"Time, sec\";") >= 0)
          return Y; 
        if (str.startsWith("Time_s;"))
          return o; 
        if (str.startsWith("Device Time") || str.startsWith("GPS Time"))
          return p; 
        if (str.startsWith("#ECUDatascan"))
          return q; 
        if (b == 0 && str.contains(".djl"))
          return r; 
        if (b == 0 && str.contains("LogEntryDate,LogEntryTime"))
          return t; 
        if (str.contains("***_Parameter_End***"))
          return s; 
        if (b == 0 && str.startsWith(",\""))
          return u; 
        if (b == 0 && str.startsWith("Interval (ms)"))
          return v; 
        if (b == 0 && str.startsWith("Vehicle Type:"))
          return x; 
        if (b == 0 && str.startsWith("HP Tuners CSV"))
          return y; 
        if (str.startsWith("Software : Haltech ESP") || str.startsWith("Software : Haltech NSP") || str.startsWith("Software : ECU Manager"))
          return z; 
        if (str.startsWith("\"DataFlash Configuration Flag"))
          return A; 
        if (str.startsWith("Point Number"))
          return C; 
        if (str.contains("Afr Adjustment Required"))
          return B; 
        if (str.contains("Replay Data Uploaded") || str.startsWith("Log Window - Logged On"))
          return w; 
        if (str.contains("VCDS") || str.startsWith("Marker,STAMP,"))
          return E; 
        if (str.startsWith("WINTEC"))
          return H; 
        if (str.contains(",AP Info:[") || str.contains(",\"AP Info:["))
          return J; 
        if (str.startsWith("SESSION"))
          return F; 
        if (str.startsWith("Date;Time;"))
          return G; 
        if (str.startsWith("       Time/s\t"))
          return N; 
        if (str.startsWith("Data Output From Race Technology Data Logging System"))
          return O; 
        if (str.matches("TimeStamp(,\\d+)+") || str.indexOf(".ecf") != -1)
          return R; 
        if (str.startsWith("\"Interval\"|"))
          return T; 
        if (str.toUpperCase().indexOf("AIM CSV") != -1)
          return U; 
        if (str.indexOf("####, ##") > 0)
          return V; 
        if (str.indexOf("VAGHWNumber") >= 0)
          return X; 
        if (str.indexOf("SiE MDT Graph Log") >= 0)
          return aa; 
        if (bool && b == 1 && str.indexOf("Elapsed time") >= 0)
          return ab; 
        if (str.startsWith("Clock Time, Elapsed Time"))
          return Z; 
        if (str.startsWith("Name,PC Datalog"))
          return ac; 
        if (str.startsWith("<Clock>[ms]"))
          return ad; 
        if (b == 0 && str.startsWith("Time;Engine"))
          return ag; 
        if (b == 3 && a(str))
          return ae; 
        if (str.startsWith("\"Time,"))
          return a; 
        if (b == 0 && str.startsWith("Date,Time,") && str.indexOf(" Memory ") > 10)
          return af; 
        if (b == 0 && str.startsWith("Time", 1))
          bool = true; 
        str = bufferedReader.readLine();
        b++;
      } 
      return a;
    } catch (IOException iOException) {
      iOException.printStackTrace();
      throw new a("Unable to read CSV file type.");
    } finally {
      try {
        bufferedReader.close();
      } catch (IOException iOException) {
        iOException.printStackTrace();
      } 
    } 
  }
  
  private static boolean a(String paramString) {
    if (bH.X.e(paramString, ",") < bH.X.e(paramString, ";"))
      return false; 
    String[] arrayOfString = paramString.split(",");
    for (byte b = 0; b < arrayOfString.length && b < 5; b++) {
      if (b % 2 == 0) {
        if (bH.X.e(arrayOfString[b], ":") != 2)
          return false; 
      } else if (!I.a(arrayOfString[b])) {
        return false;
      } 
    } 
    return true;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/W/X.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */