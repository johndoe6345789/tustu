package aE;

import A.AInterfaceVictor;
import G.R;
import G.r;
import W.ap;
import W.ar;
import bH.D;
import bH.R;
import bH.S;
import bH.X;
import bH.t;
import bQ.BqInterfaceJuliet;
import NetworkInFPackage.NetworkInFPackage;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PropertiesExtension extends Properties {
  public static c a = null;
  
  public static String b = "15";
  
  public static String c = "lastDisplayedTuneFile";
  
  public static String d = "useCommonDashboardDir";
  
  public static boolean e = false;
  
  public static String NetworkInFPackage = "useCommonTuneViewDir";
  
  public static boolean g = false;
  
  public static final String h = "projectCfg" + File.separator;
  
  public static final String i = "restorePoints" + File.separator;
  
  public static final String BqInterfaceJuliet = "DataLogs" + File.separator;
  
  public static String k = "inc" + File.separator;
  
  public static final String l = "dashboard" + File.separator;
  
  private static boolean m = true;
  
  private boolean n = false;
  
  private final ArrayList o = new ArrayList();
  
  private static a p = null;
  
  private String q = "";
  
  private g r = null;
  
  private final ArrayList s = new ArrayList();
  
  private final ArrayList t = new ArrayList();
  
  private static File u = null;
  
  private final Properties AInterfaceVictor = new Properties();
  
  private final String w = "projectId";
  
  private boolean x = false;
  
  public PropertiesExtension() {
    AInterfaceVictor.a().a((ap)new ar(this, "CommSetting"));
    BqInterfaceJuliet.a().a((ap)new ar(this, "CommSetting"));
  }
  
  public void a() {
    if (t() == null || t().equals(""))
      throw new V.a("Project working directory must be set before creating project"); 
    File file1 = NetworkInFPackage();
    if (file1.exists())
      throw new V.a("Project already exists, can not create in \n" + t()); 
    try {
      file1.getParentFile().mkdirs();
      file1.createNewFile();
    } catch (Exception exception) {
      D.a(exception);
      throw new V.a("Error creating project file, message:\n" + exception.getMessage());
    } 
    File file2 = new File(t() + File.separator + BqInterfaceJuliet, "dummy");
    file2.mkdirs();
    file2.delete();
    file2 = new File(t() + File.separator + k, "dummy");
    file2.mkdirs();
    file2.delete();
    file2 = new File(t() + File.separator + l, "dummy");
    file2.mkdirs();
    file2.delete();
  }
  
  private void X() {
    File file = NetworkInFPackage();
    D.c("############################################# Save Project Backup ##########################################");
    if (d(file)) {
      File file1 = new File(file.getParentFile(), file.getName() + ".bkup");
      if (!file1.exists() || file1.delete()) {
        try {
          t.a(file, file1);
        } catch (V.a a1) {
          Logger.getLogger(a.class.getName()).log(Level.WARNING, "Failed to save project file backup:", (Throwable)a1);
        } 
      } else {
        D.c("Unable to delete project backup.");
      } 
    } 
  }
  
  public synchronized void b() {
    BufferedOutputStream bufferedOutputStream = null;
    try {
      X();
      Z();
      Y();
      z("userDash");
      ab();
      File file = NetworkInFPackage();
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
      store(bufferedOutputStream, "Project Attributes.\n#" + a.a() + " by EFI Analytics, Inc\n#Last Saved on: " + (new Date()).toString());
      bufferedOutputStream.flush();
      if (this.r != null) {
        File file1 = h();
        if (!file1.exists()) {
          file1.getParentFile().mkdirs();
          file1.createNewFile();
        } 
        this.r.a(file1);
      } 
      if (U() && this.n) {
        File file1 = ac();
        BufferedOutputStream bufferedOutputStream1 = null;
        try {
          bufferedOutputStream1 = new BufferedOutputStream(new FileOutputStream(file1));
          this.AInterfaceVictor.store(bufferedOutputStream1, "Common Dash.\n#" + a.a() + " by EFI Analytics, Inc\n#Last Saved on: " + (new Date()).toString());
          bufferedOutputStream1.flush();
        } catch (Exception exception) {
          D.a("Failed to save Common Dash Properties: " + exception.getLocalizedMessage());
        } finally {
          if (bufferedOutputStream1 != null)
            try {
              bufferedOutputStream1.close();
            } catch (Exception exception) {} 
        } 
      } 
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new V.a("Error Saving Project. \n" + exception.getMessage() + "\nSee log file for more detail.");
    } finally {
      try {
        bufferedOutputStream.close();
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
    } 
  }
  
  public static boolean a(File paramFile) {
    if (!paramFile.isDirectory() || t.a(paramFile))
      return false; 
    File file = new File(paramFile, h + "project.properties");
    if (file.exists())
      return true; 
    file = new File(paramFile, h + "project.properties" + ".bkup");
    return file.exists();
  }
  
  public a a(String paramString) {
    return b(new File(paramString));
  }
  
  private boolean d(File paramFile) {
    if (!paramFile.exists() || paramFile.length() < 100L)
      return false; 
    BufferedReader bufferedReader = null;
    try {
      bufferedReader = new BufferedReader(new FileReader(paramFile));
      String str = bufferedReader.readLine();
      return (str != null && str.startsWith("#Project"));
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
  
  public a b(File paramFile) {
    return a(paramFile, false);
  }
  
  public a a(File paramFile, boolean paramBoolean) {
    if (!a(paramFile))
      throw new V.a("Valid " + a.a() + " Project not found at:\n" + paramFile); 
    h(paramFile.getAbsolutePath());
    File file1 = null;
    File file2 = NetworkInFPackage();
    try {
      if (paramBoolean || !d(file2)) {
        file1 = new File(file2.getParentFile(), file2.getName() + ".bkup");
        if (d(file1)) {
          file2 = file1;
          D.b("project.properties bad! Using backup file.");
        } else {
          D.b("project.properties bad!, no valid backup file.");
        } 
      } 
      FileInputStream fileInputStream = new FileInputStream(file2);
      load(fileInputStream);
      try {
        fileInputStream.close();
      } catch (Exception exception) {}
    } catch (Exception exception) {
      exception.printStackTrace();
      throw new V.a("Error occured trying to open project in directory\n" + paramFile + "\nError Message: " + exception.getMessage() + "\nCheck Log for details.");
    } 
    if (U())
      try {
        File file = ac();
        if (file.exists()) {
          FileInputStream fileInputStream = new FileInputStream(file);
          this.AInterfaceVictor.load(fileInputStream);
          this.n = false;
        } 
      } catch (Exception exception) {
        exception.printStackTrace();
        throw new V.a("Error occured trying to open common dash properties.\n" + ac() + "\nError Message: " + exception.getMessage() + "\nCheck Log for details.");
      }  
    try {
      aa();
    } catch (Exception exception) {
      if (paramBoolean) {
        exception.printStackTrace();
        throw new V.a("Failed to load CAN devices, project CAN devices appear corrupt.");
      } 
      D.a("Project CAN Devices appears corrupt, trying backup file.");
      return a(paramFile, true);
    } 
    try {
      e();
    } catch (Exception exception) {
      if (paramBoolean) {
        exception.printStackTrace();
        D.a("Failed to load User Dashboards, project.properties appears corrupt.");
      } else {
        D.a("Project user dashboards appear corrupt, trying backup file.");
        return a(paramFile, true);
      } 
    } 
    if (!paramBoolean && z() == null) {
      D.a("Project configuration options corrupt, trying backup file.");
      return a(paramFile, true);
    } 
    if (paramBoolean && file1 != null) {
      D.b("Backup project.properties appears to work");
      try {
        t.a(file1, NetworkInFPackage());
      } catch (V.a a1) {
        D.c("Failed to copy back up project.properties back to primary.");
      } 
    } 
    return this;
  }
  
  public void a(int paramInt) {
    setProperty("canId", "" + paramInt);
  }
  
  public int c() {
    try {
      return Integer.parseInt(getProperty("canId"));
    } catch (NumberFormatException numberFormatException) {
      return 0;
    } 
  }
  
  public int b(int paramInt) {
    try {
      return Integer.parseInt(getProperty("canId"));
    } catch (NumberFormatException numberFormatException) {
      a(paramInt);
      return paramInt;
    } 
  }
  
  public String d() {
    String str = getProperty("protocolEnvelope");
    return (str == null) ? "" : str;
  }
  
  public void b(String paramString) {
    setProperty("protocolEnvelope", paramString);
  }
  
  private void Y() {
    for (byte b = 0; b < this.s.size(); b++) {
      d d = this.s.get(b);
      String str = "CAN_Device_" + b + ".";
      setProperty(str + "deviceName", d.a());
      setProperty(str + "deviceDescription", d.b());
      setProperty(str + "ecuConfigFile", d.c());
      setProperty(str + "canId", "" + d.e());
      setProperty(str + "runtimeActive", "" + (!d.NetworkInFPackage() ? 1 : 0));
      b(str + "ecuSettings", d.d());
    } 
  }
  
  private void Z() {
    z("CAN_Device_");
  }
  
  private void z(String paramString) {
    Iterator<String> iterator = keySet().iterator();
    while (iterator.hasNext()) {
      String str = iterator.next();
      if (str.startsWith(paramString))
        iterator.remove(); 
    } 
    iterator = this.AInterfaceVictor.keySet().iterator();
    while (iterator.hasNext()) {
      String str = iterator.next();
      if (str.startsWith(paramString))
        iterator.remove(); 
    } 
  }
  
  private void aa() {
    byte b = 0;
    String str1 = "CAN_Device_" + b + ".";
    for (String str2 = str1 + "deviceName"; getProperty(str2) != null; str2 = str1 + "deviceName") {
      d d = new d();
      d.a(getProperty(str1 + "deviceName"));
      d.b(getProperty(str1 + "deviceDescription"));
      d.c(getProperty(str1 + "ecuConfigFile"));
      d.a(A(str1 + "ecuSettings"));
      try {
        int i = Integer.parseInt(getProperty(str1 + "canId"));
        d.a(i);
      } catch (NumberFormatException numberFormatException) {}
      String str = getProperty(str1 + "runtimeActive");
      boolean bool = (str == null || str.equals("false")) ? true : false;
      d.a(bool);
      this.s.add(d);
      str1 = "CAN_Device_" + ++b + ".";
    } 
  }
  
  public void e() {
    byte b = 0;
    String str1 = "userDash" + b + ".";
    for (String str2 = str1 + "DashName"; NetworkInFPackage(true).getProperty(str2) != null; str2 = str1 + "DashName") {
      NetworkInFPackage NetworkInFPackage = new NetworkInFPackage();
      NetworkInFPackage.a(NetworkInFPackage(true).getProperty(str1 + "DashName"));
      NetworkInFPackage.b(NetworkInFPackage(true).getProperty(str1 + "FileName"));
      this.t.add(NetworkInFPackage);
      str1 = "userDash" + ++b + ".";
    } 
  }
  
  private void ab() {
    for (byte b = 0; b < this.t.size(); b++) {
      NetworkInFPackage NetworkInFPackage = this.t.get(b);
      String str = "userDash" + b + ".";
      NetworkInFPackage(false).setProperty(str + "DashName", NetworkInFPackage.a());
      NetworkInFPackage(false).setProperty(str + "FileName", NetworkInFPackage.b());
    } 
  }
  
  private Properties NetworkInFPackage(boolean paramBoolean) {
    if (U()) {
      if (paramBoolean && this.AInterfaceVictor.isEmpty())
        try {
          File file = ac();
          if (file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            this.AInterfaceVictor.load(fileInputStream);
          } 
        } catch (Exception exception) {
          D.a("Error occured trying to open common dash properties.\n" + ac() + "\nError Message: " + exception.getMessage() + "\nCheck Log for details.");
        }  
      return this.AInterfaceVictor;
    } 
    return this;
  }
  
  private File ac() {
    return new File(m(), "dashboards.properties");
  }
  
  public File NetworkInFPackage() {
    return new File(t() + File.separator + h, "project.properties");
  }
  
  public File g() {
    return new File(t() + File.separator + h, "persistedChannelValues.properties");
  }
  
  public File h() {
    return new File(t() + File.separator + h, "vehicle.properties");
  }
  
  public File c(String paramString) {
    return paramString.equals(u()) ? new File(t() + File.separator, N()) : new File(t() + File.separator, paramString + "_" + N());
  }
  
  public File d(String paramString) {
    return paramString.equals(u()) ? new File(t() + File.separator, h + M()) : new File(t() + File.separator, h + paramString + "_" + M());
  }
  
  public g i() {
    if (this.r != null)
      return this.r; 
    this.r = new g(a.a());
    File file = h();
    if (file.exists())
      this.r.b(file); 
    return this.r;
  }
  
  public File BqInterfaceJuliet() {
    return new File(AInterfaceVictor());
  }
  
  public String k() {
    String str = getProperty("lastSdLogFileName", "");
    if (str == null || str.equals(""))
      str = q(); 
    return str;
  }
  
  public void e(String paramString) {
    setProperty("lastSdLogFileName", paramString);
  }
  
  public File NetworkInFPackage(String paramString) {
    if (paramString.equals(u()))
      return BqInterfaceJuliet(); 
    d d = t(paramString);
    return (d != null) ? new File(t() + h, d.c()) : null;
  }
  
  public File l() {
    return U() ? new File(T(), l + File.separator + "dashboard.dash") : new File(t() + File.separator + l + File.separator + "dashboard.dash");
  }
  
  public String m() {
    return U() ? (T().getAbsolutePath() + File.separator + l) : (t() + File.separator + l);
  }
  
  public String n() {
    return File.separator + l + File.separator + "dashboard.dash";
  }
  
  public File o() {
    null = new File(y());
    return new File(m() + File.separator + "dashboard.dash");
  }
  
  public String p() {
    return t() + File.separator + k;
  }
  
  public String q() {
    return t() + File.separator + BqInterfaceJuliet;
  }
  
  public void a(boolean paramBoolean) {
    setProperty("verifyOnBurn", "" + paramBoolean);
  }
  
  public boolean r() {
    String str = getProperty("verifyOnBurn", "");
    return str.equals("true");
  }
  
  public String s() {
    return t();
  }
  
  public void g(String paramString) {
    setProperty("tuneFileDir", paramString);
  }
  
  public String t() {
    return this.q;
  }
  
  public void h(String paramString) {
    if (!paramString.endsWith("/") && !paramString.endsWith("\""))
      paramString = paramString + File.separator; 
    this.q = paramString;
  }
  
  public String u() {
    return getProperty("projectName");
  }
  
  public void i(String paramString) {
    setProperty("projectName", paramString);
  }
  
  public void BqInterfaceJuliet(String paramString) {
    setProperty("logFileDir", paramString);
  }
  
  public String AInterfaceVictor() {
    return (getProperty("ecuConfigFile") != null) ? (t() + h + getProperty("ecuConfigFile")) : (t() + h + "mainController.ini");
  }
  
  public String k(String paramString) {
    return paramString.equals(u()) ? x() : (t() + h + paramString + "_" + "custom.ini");
  }
  
  public File w() {
    return new File(t(), h);
  }
  
  public String x() {
    return t() + h + "custom.ini";
  }
  
  public void l(String paramString) {
    setProperty("ecuConfigFile", paramString);
  }
  
  public String m(String paramString) {
    return paramString.equals(u()) ? getProperty("baudRate", getProperty("baudRate")) : getProperty("baudRate", getProperty(paramString + "_" + "baudRate"));
  }
  
  public void a(String paramString1, String paramString2) {
    if (paramString1.equals(u())) {
      setProperty("baudRate", paramString2);
    } else {
      setProperty(paramString1 + "_" + "baudRate", paramString2);
    } 
  }
  
  public String n(String paramString) {
    return getProperty("commPort", getProperty(paramString + "_" + "commPort"));
  }
  
  public void b(String paramString1, String paramString2) {
    if (paramString2 == null)
      paramString2 = ""; 
    if (paramString1.equals(u())) {
      setProperty("commPort", paramString2);
    } else {
      setProperty(paramString1 + "_" + "commPort", paramString2);
    } 
  }
  
  public String y() {
    return getProperty("dashBoardFile", "dashboard.dash");
  }
  
  public void o(String paramString) {
    setProperty("dashBoardFile", X.b(paramString, t(), ""));
  }
  
  public boolean a(r[] paramArrayOfr) {
    String str1 = getProperty("ecuSettings");
    a("ecuSettings", paramArrayOfr);
    String str2 = getProperty("ecuSettings");
    return (str1 == null || str2 == null || !str1.equals(str2));
  }
  
  private void a(String paramString, r[] paramArrayOfr) {
    String str = "";
    if (paramArrayOfr != null) {
      for (byte b = 0; b < paramArrayOfr.length; b++) {
        b b1 = new b(this, paramArrayOfr[b]);
        paramArrayOfr[b].a(b1);
      } 
      paramArrayOfr = (r[])S.a((R[])paramArrayOfr);
    } 
    if (paramArrayOfr != null)
      for (byte b = 0; b < paramArrayOfr.length; b++) {
        if (!paramArrayOfr[b].aL().equals("DEFAULT"))
          str = str + paramArrayOfr[b].aL() + "|"; 
      }  
    setProperty(paramString, str);
  }
  
  private void b(String paramString, String[] paramArrayOfString) {
    String str = "";
    if (paramArrayOfString != null)
      for (byte b = 0; b < paramArrayOfString.length; b++)
        str = str + paramArrayOfString[b] + "|";  
    setProperty(paramString, str);
  }
  
  public String[] z() {
    return A("ecuSettings");
  }
  
  private String[] A(String paramString) {
    String str = getProperty(paramString);
    if (str == null)
      return null; 
    StringTokenizer stringTokenizer = new StringTokenizer(str, "|");
    String[] arrayOfString = new String[stringTokenizer.countTokens()];
    for (byte b = 0; stringTokenizer.hasMoreTokens(); b++) {
      String str1 = stringTokenizer.nextToken();
      if (!str1.equals("DEFAULT")) {
        arrayOfString[b] = str1;
      } else {
        arrayOfString[b] = "";
      } 
    } 
    return arrayOfString;
  }
  
  public static a A() {
    return p;
  }
  
  public static void a(a parama) {
    p = parama;
  }
  
  public void p(String paramString) {
    setProperty("projectDescription", paramString);
  }
  
  public String B() {
    return getProperty("projectDescription", "");
  }
  
  public void q(String paramString) {
    setProperty("recordsPerSec", paramString);
  }
  
  public int c(int paramInt) {
    String str = getProperty("recordsPerSec");
    return (str == null || str.isEmpty()) ? paramInt : Integer.parseInt(str);
  }
  
  public void c(String paramString1, String paramString2) {
    setProperty("selectedComDriver", paramString2);
  }
  
  public String C() {
    return getProperty("selectedComDriver");
  }
  
  public ArrayList D() {
    return this.o;
  }
  
  public R E() {
    return (this.o.size() > 0) ? this.o.get(0) : null;
  }
  
  public void a(R paramR) {
    this.o.add(paramR);
  }
  
  public void a(NetworkInFPackage paramf) {
    this.t.add(paramf);
  }
  
  public String r(String paramString) {
    if (!paramString.equals(u())) {
      d d = t(paramString);
      if (d == null) {
        D.a("Request for Config UID, but this is not a valid device name: " + paramString);
        return "XXXXX-Invalid-Device-Name-XXXXX";
      } 
      return d.h();
    } 
    String str = getProperty("ecuUid");
    if (this.x) {
      String str1 = NetworkInFPackage.d();
      if (str1 == null || str1.isEmpty())
        str1 = NetworkInFPackage.h(); 
      if (str == null || str.isEmpty() || !str.startsWith(str1)) {
        str = str1 + UUID.randomUUID().toString();
        setProperty("ecuUid", str);
      } 
    } else if (str == null || str.isEmpty()) {
      str = UUID.randomUUID().toString();
      setProperty("ecuUid", str);
    } 
    return str;
  }
  
  public boolean s(String paramString) {
    Iterator<NetworkInFPackage> iterator = this.t.iterator();
    while (iterator.hasNext()) {
      NetworkInFPackage NetworkInFPackage = iterator.next();
      if (NetworkInFPackage.a().equals(paramString)) {
        iterator.remove();
        return true;
      } 
    } 
    return false;
  }
  
  public Iterator F() {
    return this.t.iterator();
  }
  
  public int G() {
    return this.t.size();
  }
  
  public void a(d paramd) {
    this.s.add(paramd);
  }
  
  public void H() {
    this.s.clear();
  }
  
  public Iterator I() {
    return this.s.iterator();
  }
  
  public d t(String paramString) {
    Iterator<d> iterator = I();
    while (iterator.hasNext()) {
      d d = iterator.next();
      if (d.a().equals(paramString))
        return d; 
    } 
    return null;
  }
  
  public static boolean u(String paramString) {
    return (paramString.indexOf(File.separator + "Temp" + File.separator) != -1 || paramString.indexOf(File.separator + "Temp/") != -1);
  }
  
  public boolean J() {
    return u(t());
  }
  
  public File K() {
    return new File(t() + i);
  }
  
  public File L() {
    return new File(t(), BqInterfaceJuliet);
  }
  
  public static String M() {
    return "pcVariableValues." + a.b();
  }
  
  public static String N() {
    return "CurrentTune." + a.b();
  }
  
  public void a(String paramString, String[] paramArrayOfString) {
    String str = "disabledLogFields." + paramString;
    b(str, paramArrayOfString);
  }
  
  public void AInterfaceVictor(String paramString) {
    setProperty("selectedDatalogProfiles", paramString);
  }
  
  public String O() {
    return getProperty("selectedDatalogProfiles", "");
  }
  
  public String[] w(String paramString) {
    String str = "disabledLogFields." + paramString;
    null = A(str);
    if (null == null)
      null = new String[0]; 
    for (byte b = 0; b < null.length; b++) {
      if (null[b] != null)
        null[b] = null[b].trim(); 
    } 
    return S.a(null);
  }
  
  public void a(String[] paramArrayOfString) {
    String str = "datalogProfiles";
    b(str, paramArrayOfString);
  }
  
  public String[] P() {
    String str = "datalogProfiles";
    String[] arrayOfString = A(str);
    if (arrayOfString == null) {
      arrayOfString = new String[1];
      arrayOfString[0] = "";
    } 
    return arrayOfString;
  }
  
  public void b(boolean paramBoolean) {
    setProperty("slaveServerActive", Boolean.toString(paramBoolean));
  }
  
  public boolean Q() {
    return Boolean.parseBoolean(getProperty("slaveServerActive", Boolean.toString(false)));
  }
  
  public static void c(boolean paramBoolean) {
    m = paramBoolean;
  }
  
  public String R() {
    return getProperty("appVersionCheckedForNewerIni", "0.0");
  }
  
  public void x(String paramString) {
    setProperty("appVersionCheckedForNewerIni", paramString);
  }
  
  public boolean S() {
    boolean bool;
    if (u == null) {
      D.a("Project set to use common TuningViews, but no common root folder set.");
      return false;
    } 
    String str = getProperty(NetworkInFPackage, "" + g);
    try {
      bool = Boolean.parseBoolean(str);
      setProperty(NetworkInFPackage, "" + bool);
    } catch (Exception exception) {
      setProperty(NetworkInFPackage, "" + g);
      bool = g;
    } 
    return bool;
  }
  
  public static File T() {
    return u;
  }
  
  public static void c(File paramFile) {
    u = paramFile;
  }
  
  public boolean U() {
    boolean bool;
    String str = getProperty(d, "" + e);
    if (u == null) {
      if (Boolean.parseBoolean(str))
        D.a("Project set to use common Dashboards, but no common root folder set."); 
      return false;
    } 
    try {
      bool = Boolean.parseBoolean(str);
      setProperty(d, "" + bool);
    } catch (Exception exception) {
      setProperty(d, "" + e);
      bool = e;
    } 
    return bool;
  }
  
  public String V() {
    String str = getProperty("projectUuid");
    if (this.x) {
      String str1 = NetworkInFPackage.d();
      if (str1 == null || str1.isEmpty())
        str1 = NetworkInFPackage.h(); 
      if (str == null || str.isEmpty() || !str.startsWith(str1)) {
        str = str1 + UUID.randomUUID().toString();
        setProperty("projectUuid", str);
        try {
          b();
        } catch (V.a a1) {
          Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
        } 
      } 
    } else if (str == null || str.isEmpty()) {
      str = UUID.randomUUID().toString();
      setProperty("projectUuid", str);
      try {
        b();
      } catch (V.a a1) {
        Logger.getLogger(a.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
      } 
    } 
    return str;
  }
  
  public void d(boolean paramBoolean) {
    this.n = paramBoolean;
  }
  
  public void e(boolean paramBoolean) {
    this.x = paramBoolean;
  }
  
  public void y(String paramString) {
    setProperty(c, paramString);
  }
  
  public String W() {
    return getProperty(c, "");
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aE/a.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */