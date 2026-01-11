package r;

import B.i;
import G.R;
import V.ExceptionInVPackage;
import W.R;
import W.t;
import W.z;
import aE.ExceptionInVPackage;
import bH.D;
import bH.J;
import bH.X;
import bH.ae;
import bH.t;
import com.efiAnalytics.ui.bV;
import java.awt.Window;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipException;
import javax.swing.filechooser.FileSystemView;
import v.VComponentFoxtrot;

public class ThreadedFile {
  public static String ExceptionInVPackage = "config" + File.separator + "settingGroups.xml";
  
  public static final String b = "config" + File.separator + "ecuDef" + File.separator;
  
  public static final String c = "startScreenRoot" + File.separator;
  
  public static final String d = "plugins" + File.separator;
  
  public static final String e = "Dash" + File.separator;
  
  public static final String VComponentFoxtrot = "TuneView" + File.separator;
  
  public static final String g = ExceptionInVPackage.h;
  
  public static String h = ExceptionInVPackage.k;
  
  public static final String i = "." + File.separator + "Dash" + File.separator + "backgrounds" + File.separator;
  
  public static final String j = "." + File.separator + "Dash" + File.separator + "Needles" + File.separator;
  
  public static final String k = "." + File.separator + "inc" + File.separator + "ms2ReferenceTables.ini";
  
  public static final String l = "." + File.separator + "inc" + File.separator + "ms2GeneralPorts.ini";
  
  public static final String m = "." + File.separator + "inc" + File.separator + "ms1BaseVeAnalyzeMaps.ini";
  
  public static final String n = "." + File.separator + "inc" + File.separator + "ms1ExtraVeAnalyzeMaps.ini";
  
  public static final String o = "." + File.separator + "inc" + File.separator + "ms3VeAnalyzeMaps.ini";
  
  public static final String p = "." + File.separator + "inc" + File.separator + "ms2ExtraVeAnalyzeMaps.ini";
  
  public static final String q = "." + File.separator + "inc" + File.separator + "ms2VeAnalyzeMaps.ini";
  
  public static final String r = "." + File.separator + "inc" + File.separator + "monsterFirmware1VeAnalyzeMaps.ini";
  
  public static final String s = "." + File.separator + "inc" + File.separator + "bs3Gen4VEAnalyzeMaps.ini";
  
  public static final String t = "." + File.separator + "inc" + File.separator + "ms1BaseWueAnalyzeMaps.ecu";
  
  public static final String u = "." + File.separator + "inc" + File.separator + "ms1ExtraWueAnalyzeMaps.ecu";
  
  public static final String v = "." + File.separator + "inc" + File.separator + "ms2WueAnalyzeMaps.ecu";
  
  public static final String w = "." + File.separator + "inc" + File.separator + "ms3_1.2_WueAnalyzeMap.ecu";
  
  public static final String x = "." + File.separator + "inc" + File.separator + "ms3_1.0_WueAnalyzeMap.ecu";
  
  public static final String y = v;
  
  public static final String z = v;
  
  public static final String A = "." + File.separator + "inc" + File.separator + "ms1BaseDefaultTools.ini";
  
  public static final String B = "." + File.separator + "inc" + File.separator + "ms1ExtraDefaultTools.ini";
  
  public static final String C = "." + File.separator + "inc" + File.separator + "msIIBGDefaultTools.ini";
  
  public static final String D = "." + File.separator + "inc" + File.separator + "ms2ExtraDefaultTools.ini";
  
  public static final String E = "." + File.separator + "inc" + File.separator + "ms3DefaultTools.ini";
  
  public static final String F = "content" + File.separator;
  
  public static final String G = "." + File.separator + "inc" + File.separator + "canPcVariables.ini";
  
  public static String[] H = new String[] { "BigStuff3_Gen4_ExampleProject" };
  
  private static File I = null;
  
  public static boolean ExceptionInVPackage(String paramString) {
    File file = new File(paramString + File.separator + "test123555.4");
    try {
      if (file.exists()) {
        if (!file.delete())
          return false; 
      } else {
        file.createNewFile();
        if (!file.delete())
          return false; 
      } 
    } catch (Exception exception) {
      return false;
    } 
    return true;
  }
  
  public static File ExceptionInVPackage() {
    return new File(F);
  }
  
  public static File ExceptionInVPackage(Locale paramLocale) {
    return new File("." + File.separator + F + paramLocale.getLanguage());
  }
  
  public static File b(Locale paramLocale) {
    File file = new File(A().getAbsolutePath() + File.separator + F + paramLocale.getLanguage());
    if (!file.exists())
      file.mkdirs(); 
    return file;
  }
  
  public static File b() {
    File file = new File(A().getAbsolutePath() + File.separator + d);
    if (!file.exists()) {
      File file1 = new File(file, "tmp");
      if (!file1.mkdirs())
        throw new ExceptionInVPackage("Unable to create user ECU definition dir:\n" + file.getAbsolutePath()); 
      file1.delete();
    } else if (file.isFile()) {
      file.delete();
      file.mkdir();
    } 
    return file;
  }
  
  public static File c() {
    File file = new File(A().getAbsolutePath() + File.separator + b);
    if (!file.exists()) {
      File file1 = new File(file, "tmp");
      if (!file1.mkdirs())
        throw new ExceptionInVPackage("Unable to create user ECU definition dir:\n" + file.getAbsolutePath()); 
      file1.delete();
    } else if (file.isFile()) {
      file.delete();
      file.mkdir();
    } 
    return file;
  }
  
  public static File c(Locale paramLocale) {
    String str1 = ExceptionInVPackage(paramLocale).getAbsolutePath() + File.separator;
    File file = new File(str1 + "staticText.txt");
    if (file.exists())
      return file; 
    String str2 = str1 + "staticText.res";
    return new File(str2);
  }
  
  public static File d(Locale paramLocale) {
    String str1 = b(paramLocale).getAbsolutePath() + File.separator;
    String str2 = str1 + "staticText.res";
    return new File(str2);
  }
  
  public static long ExceptionInVPackage(File paramFile) {
    long l = 0L;
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile != null) {
      for (byte b = 0; b < arrayOfFile.length; b++)
        l += arrayOfFile[b].length(); 
      return l;
    } 
    return 0L;
  }
  
  public static void ExceptionInVPackage(File paramFile, double paramDouble) {
    for (long l = ExceptionInVPackage(paramFile); l > paramDouble * 1024.0D * 1024.0D; l = ExceptionInVPackage(paramFile)) {
      File file = null;
      File[] arrayOfFile = paramFile.listFiles();
      for (byte b = 0; b < arrayOfFile.length; b++) {
        if (!arrayOfFile[b].isDirectory() && arrayOfFile[b].canWrite() && (file == null || arrayOfFile[b].lastModified() < file.lastModified()))
          file = arrayOfFile[b]; 
      } 
      if (file != null)
        D.d("Maintain Restore Point size to " + paramDouble + " size. Deleting:\n" + file.getAbsolutePath()); 
      if (file != null && !file.delete()) {
        D.ExceptionInVPackage("Unable to delete oldest restore point file:\n" + file.getAbsolutePath());
        break;
      } 
    } 
  }
  
  public static File ExceptionInVPackage(File paramFile, FileFilter paramFileFilter) {
    File file = null;
    File[] arrayOfFile = paramFile.listFiles(paramFileFilter);
    if (arrayOfFile != null)
      for (byte b = 0; b < arrayOfFile.length; b++) {
        if (file == null || arrayOfFile[b].lastModified() > file.lastModified())
          file = arrayOfFile[b]; 
      }  
    return file;
  }
  
  public static File d() {
    File file = new File(A().getAbsolutePath() + File.separator + c);
    if (!file.exists()) {
      File file1 = new File(file, "tmp");
      if (!file1.mkdirs())
        throw new ExceptionInVPackage("Unable to create Start Screen Root dir:\n" + file.getAbsolutePath()); 
      file1.delete();
    } else if (file.isFile()) {
      file.delete();
      file.mkdir();
    } 
    return file;
  }
  
  public static File e() {
    String str = ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.A, u());
    File file = new File(str);
    return file.exists() ? file : new File(u());
  }
  
  public static void b(File paramFile) {
    if (!paramFile.isDirectory())
      paramFile = paramFile.getParentFile(); 
    ExceptionInVPackage.ExceptionInVPackage().b(ExceptionInVPackage.A, paramFile.getAbsolutePath());
  }
  
  public static File VComponentFoxtrot() {
    File file = new File(A(), "Devices");
    if (!file.exists()) {
      File file1 = new File(file, "temp");
      file1.mkdirs();
      file1.delete();
    } 
    return file;
  }
  
  public static File c(File paramFile) {
    return new File(paramFile, "projectCfg/serial.cfg");
  }
  
  public static i d(File paramFile) {
    File file = c(paramFile);
    FileReader fileReader = null;
    if (file.exists())
      try {
        Properties properties = new Properties();
        fileReader = new FileReader(file);
        properties.load(fileReader);
        i i = i.ExceptionInVPackage(properties);
        return i;
      } catch (IOException iOException) {
        D.ExceptionInVPackage(iOException);
      } finally {
        if (fileReader != null)
          try {
            fileReader.close();
          } catch (Exception exception) {} 
      }  
    return null;
  }
  
  public static void ExceptionInVPackage(File paramFile, i parami) {
    i i1 = d(paramFile);
    if (i1 == null || !i1.e().equals(parami.e()) || !i1.i().equals(parami.i()) || (parami.n() != null && (i1.n() == null || !i1.n().equals(parami.n()))) || !i1.j().equals(parami.j())) {
      File file = c(paramFile);
      file.delete();
      FileWriter fileWriter = null;
      try {
        parami.g(paramFile.getName());
        Properties properties = parami.ExceptionInVPackage();
        properties.remove("protocol");
        fileWriter = new FileWriter(file);
        properties.store(fileWriter, "Project Device Info");
      } catch (IOException iOException) {
        Logger.getLogger(j.class.getName()).log(Level.SEVERE, "Failed to save Serial File to project.", iOException);
      } finally {
        if (fileWriter != null)
          try {
            fileWriter.close();
          } catch (Exception exception) {} 
      } 
    } 
  }
  
  public static List b(String paramString) {
    File file = new File(u());
    ArrayList<File> arrayList = new ArrayList();
    k k = new k();
    for (File file1 : file.listFiles(k)) {
      i i = d(file1);
      if (i != null && i.e().equalsIgnoreCase(paramString))
        arrayList.add(file1); 
    } 
    return arrayList;
  }
  
  public static File g() {
    return new File(h(), "Acceleration_Performance.dash");
  }
  
  public static String c(String paramString) {
    try {
      String str = (new File(".")).getCanonicalPath();
      if (str.endsWith("/"))
        str = str.substring(0, str.length() - 1); 
      paramString = X.b(paramString, str, ".");
      paramString = paramString.replace('\\', '/');
    } catch (IOException iOException) {}
    return paramString;
  }
  
  public static File h() {
    return new File(e);
  }
  
  public static File i() {
    return new File(h(), "Backgrounds");
  }
  
  public static File j() {
    File file1 = new File(u(), e);
    String str = ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.z, file1.getAbsolutePath());
    File file2 = new File(str);
    return file2.exists() ? file2 : new File(u());
  }
  
  public static File k() {
    File file1 = new File(u(), VComponentFoxtrot);
    String str = ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.B, file1.getAbsolutePath());
    File file2 = new File(str);
    return file2.exists() ? file2 : ExceptionInVPackage((ExceptionInVPackage)null);
  }
  
  public static File ExceptionInVPackage(ExceptionInVPackage parama) {
    File file;
    if (parama == null) {
      file = new File(u(), VComponentFoxtrot);
    } else if (parama.S()) {
      file = new File(q(), VComponentFoxtrot);
    } else {
      file = new File(ExceptionInVPackage.A().t(), VComponentFoxtrot);
    } 
    if (!file.exists()) {
      File file1 = new File(file, "temp");
      file1.mkdirs();
      file1.delete();
    } 
    return file;
  }
  
  public static File l() {
    return new File(".", VComponentFoxtrot);
  }
  
  public static void e(File paramFile) {
    if (!paramFile.isDirectory())
      paramFile = paramFile.getParentFile(); 
    ExceptionInVPackage.ExceptionInVPackage().b(ExceptionInVPackage.z, paramFile.getAbsolutePath());
  }
  
  public static String m() {
    return (new File(b)).getAbsolutePath() + File.separator;
  }
  
  public static File[] n() {
    try {
      return t.ExceptionInVPackage(o());
    } catch (IOException iOException) {
      throw new ExceptionInVPackage(iOException.getMessage());
    } 
  }
  
  public static File[] o() {
    File[] arrayOfFile = new File[2];
    arrayOfFile[0] = new File(m());
    arrayOfFile[1] = c();
    return arrayOfFile;
  }
  
  public static File ExceptionInVPackage(Window paramWindow, String paramString) {
    File file = d(paramString);
    if (file == null)
      try {
        R r = VComponentFoxtrot.ExceptionInVPackage(paramWindow, paramString);
        if (r != null && r.ExceptionInVPackage())
          file = r.c(); 
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        bV.d(ExceptionInVPackage.getMessage(), paramWindow);
      }  
    if (file == null) {
      D.c("No Config File found, prompting user.");
      bV.d("Can not find the Controller Definition file (ini,ecu) for\nSerial Signature: '" + paramString + "'\n\nPlease select the appropriate configuration file.", paramWindow);
      String[] arrayOfString = { "ini", "ecu" };
      String str1 = bV.b(paramWindow, "Find ecu definition file", arrayOfString, "", "");
      if (str1 == null || str1.equals(""))
        return null; 
      File file1 = new File(str1);
      if (!file1.exists()) {
        bV.d("File not found:\n" + str1, paramWindow);
        return null;
      } 
      String str2 = z.ExceptionInVPackage(str1);
      if (str2 == null || str2.equals("")) {
        String str = "The ECU Definition File:\n" + str1 + "\nDoes not appear valid, there is no serial signature defined.";
        if (!bV.ExceptionInVPackage(str, paramWindow, true))
          return null; 
      } else if (!paramString.equals(str2)) {
        String str = "Signatures do not match!\nIn Tune File (" + ExceptionInVPackage.cw + "): " + paramString + "\nIn Definition file: " + str2 + "\n\nAre you sure you want to load the ." + ExceptionInVPackage.cw + " with this ECU Definition (ini)?";
        if (!bV.ExceptionInVPackage(str, paramWindow, true))
          return null; 
      } 
      try {
        String str = z.b(str2);
        t.ExceptionInVPackage(file1, new File(c(), str));
      } catch (Exception exception) {
        D.d("Unable to copy ini file " + str1 + " for future use, no directory access");
      } 
      file = new File(str1);
    } 
    return file;
  }
  
  public static File d(String paramString) {
    try {
      return t.ExceptionInVPackage(o(), paramString);
    } catch (IOException iOException) {
      throw new ExceptionInVPackage(iOException.getMessage());
    } 
  }
  
  public static File e(String paramString) {
    try {
      File[] arrayOfFile = new File[2];
      arrayOfFile[0] = c();
      arrayOfFile[1] = new File(m());
      return t.ExceptionInVPackage(arrayOfFile, paramString);
    } catch (IOException iOException) {
      throw new ExceptionInVPackage(iOException.getMessage());
    } 
  }
  
  public static File[] p() {
    return VComponentFoxtrot(e);
  }
  
  public static File[] VComponentFoxtrot(String paramString) {
    l l = new l();
    File file = new File(paramString);
    if (!file.exists())
      throw new ExceptionInVPackage("Dash & Gauge directory not found, expected at:\n" + file.getAbsolutePath() + "\nYour installation appears corrupt."); 
    return file.listFiles(l);
  }
  
  public static File ExceptionInVPackage(String paramString1, String paramString2) {
    return new File(g(paramString1), paramString2 + ".table");
  }
  
  public static File b(ExceptionInVPackage parama) {
    return parama.K();
  }
  
  public static File ExceptionInVPackage(ExceptionInVPackage parama, R paramR) {
    String str = paramR.c() + "_" + X.ExceptionInVPackage() + "." + ExceptionInVPackage.cw;
    return new File(b(parama), str);
  }
  
  public static File g(String paramString) {
    File file = new File(paramString, g);
    if (!file.exists()) {
      D.c("projectCfg directory not found, creating new folder:\n\t" + file.getAbsolutePath());
      file.mkdirs();
    } 
    return file;
  }
  
  public static File q() {
    return new File(u(), "SharedProjectComps");
  }
  
  public static File r() {
    return J.ExceptionInVPackage() ? new File(FileSystemView.getFileSystemView().getDefaultDirectory() + File.separator + X.b(ExceptionInVPackage.b, " ", "") + "Projects/") : new File(FileSystemView.getFileSystemView().getHomeDirectory() + File.separator + X.b(ExceptionInVPackage.b, " ", "") + "Projects/");
  }
  
  public static String s() {
    return u() + ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage(ExceptionInVPackage.q, "DefaultProject");
  }
  
  public static String t() {
    String str = ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.aW, "");
    if (str.equals("") || !(new File(str)).exists()) {
      String str1 = ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.aV, r().getAbsolutePath());
      File file = new File(str1);
      if (!file.exists())
        file.mkdir(); 
      return str1;
    } 
    return str;
  }
  
  public static String u() {
    String str = ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.aV, r().getAbsolutePath());
    boolean bool = false;
    boolean bool1 = (new File(str)).exists();
    if (bool1) {
      bool1 = false;
      for (File file : (new File(str)).listFiles()) {
        if (file.isDirectory() && !file.getName().equals("SharedProjectComps")) {
          bool1 = true;
          break;
        } 
      } 
    } 
    if (!bool1 || bool) {
      n.j.ExceptionInVPackage().ExceptionInVPackage("One time setup, Copying Default Projects and components..");
      str = r().getAbsolutePath();
      File file1 = new File(str);
      if (!file1.exists())
        file1.mkdir(); 
      File file2 = new File("Projects");
      File[] arrayOfFile = file2.listFiles();
      n n = new n();
      for (byte b = 0; arrayOfFile != null && b < arrayOfFile.length; b++) {
        String str1 = file2.getAbsolutePath() + File.separator + arrayOfFile[b].getName();
        boolean bool2 = ((new File(str1)).isDirectory() && (new File(str1 + File.separator + "projectCfg" + File.separator + "project.properties")).exists()) ? true : false;
        if (bool2) {
          File file = new File(str1);
          try {
            str1 = file.getCanonicalPath();
            str = (new File(str)).getCanonicalPath();
            File file3 = new File(str + File.separator + arrayOfFile[b].getName());
            file3.mkdir();
            String str2 = "";
            if (bV.d()) {
              str2 = "xcopy /E/I \"" + str1 + "\" \"" + str + File.separator + arrayOfFile[b].getName() + "\"";
            } else {
              str2 = "cp -r " + str1 + " " + str;
            } 
            File file4 = new File(str, file.getName());
            n.ExceptionInVPackage(file4.getAbsolutePath());
            D.d(str2);
            Process process = Runtime.getRuntime().exec(str2);
            Thread.sleep(1500L);
            process = Runtime.getRuntime().exec(str2);
            if (b + 1 < arrayOfFile.length)
              Thread.sleep(500L); 
          } catch (InterruptedException interruptedException) {
            D.b("copy project process interrupted. Copying to project folder.\n" + interruptedException.getMessage());
          } catch (IOException iOException) {
            D.b("Failed to copy example project to project folder.\n" + iOException.getMessage());
          } 
        } else if (str1.toLowerCase().endsWith(".zip")) {
          try {
            String str2 = ae.ExceptionInVPackage(str1, str, null);
            if (!str2.equals(ae.ExceptionInVPackage)) {
              D.b("Tried to extract sample Project, but failed. Will try again:\n" + str1);
              str2 = ae.ExceptionInVPackage(str1, str, null);
              if (!str2.equals(ae.ExceptionInVPackage)) {
                D.ExceptionInVPackage("Failed second attempt to extract sample Project, Giving up:\n" + str1);
              } else {
                D.d("Second attempt to extract sample Project Succeded:\n" + str1);
              } 
            } 
            File file = new File(str, arrayOfFile[b].getName().substring(0, arrayOfFile[b].getName().lastIndexOf(".")));
            n.ExceptionInVPackage(file.getAbsolutePath());
          } catch (ZipException zipException) {
            D.ExceptionInVPackage("Failed to extract sample Project, Will try any others:\n" + str1, zipException, null);
          } catch (IOException iOException) {
            D.ExceptionInVPackage("Failed to extract sample Project, Will try any others:\n" + str1, iOException, null);
          } 
        } else {
          D.d("Found file " + arrayOfFile[b].getName() + " in the example projects dir, but it is not ExceptionInVPackage valid project or archive.");
        } 
      } 
      ExceptionInVPackage.ExceptionInVPackage().b(ExceptionInVPackage.aV, str);
      try {
        Thread.sleep(1000L);
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(j.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } 
    } 
    if (!str.endsWith(File.separator))
      str = str + File.separator; 
    if (i.ExceptionInVPackage().ExceptionInVPackage("09u8 geaphg3098ulk5")) {
      File file = new File(str, "SharedProjectComps");
      bool = (!file.exists() || (file.list()).length == 0) ? true : false;
    } 
    if (bool) {
      D.d("sharedCompsMissing = true");
      File file = new File("Projects", "SharedProjectComps.zip");
      if (file.exists()) {
        String str1 = file.getAbsolutePath();
        try {
          String str2 = ae.ExceptionInVPackage(str1, str, null);
          if (!str2.equals(ae.ExceptionInVPackage)) {
            D.b("Tried to extract sample Project, but failed. Will try again:\n" + str1);
            str2 = ae.ExceptionInVPackage(str1, str, null);
            if (!str2.equals(ae.ExceptionInVPackage)) {
              D.ExceptionInVPackage("Failed second attempt to extract sample Project, Giving up:\n" + str1);
            } else {
              D.d("Second attempt to extract sample Project Succeded:\n" + str1);
            } 
          } 
        } catch (ZipException zipException) {
          D.ExceptionInVPackage("Failed to extract sample Project, Will try any others:\n" + str1, zipException, null);
        } catch (IOException iOException) {
          D.ExceptionInVPackage("Failed to extract sample Project, Will try any others:\n" + str1, iOException, null);
        } 
      } else {
        D.b("Shared Project Comps file not found:\n" + file.getAbsolutePath());
      } 
    } 
    return str;
  }
  
  public static String[] v() {
    return H;
  }
  
  public static String w() {
    return i;
  }
  
  public static String x() {
    return j;
  }
  
  public static File y() {
    File file = new File(A(), "dashCache");
    if (!file.exists()) {
      File file1 = new File(file, "tmp");
      file1.mkdirs();
      file1.delete();
    } 
    return file;
  }
  
  public static File z() {
    File file = new File(System.getProperty("user.home"), ".efiAnalytics");
    if (!file.exists()) {
      File file1 = new File(file, "test");
      file1.mkdirs();
      file1.delete();
    } 
    return file;
  }
  
  public static File A() {
    File file = new File(z(), ExceptionInVPackage.b);
    if (!file.exists()) {
      File file1 = new File(file, "tmp");
      file1.mkdirs();
      file1.delete();
    } 
    if (J.d()) {
      File file1 = new File(E() + ".efianalytics" + File.separator + ExceptionInVPackage.b + File.separator);
      if (file1.exists() && !file1.equals(file))
        try {
          t.ExceptionInVPackage(file, file1, false);
          t.b(file1);
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          Logger.getLogger(j.class.getName()).log(Level.WARNING, "Files to migrate .efianalytics to .efiAnalytics", (Throwable)ExceptionInVPackage);
        }  
    } 
    return file;
  }
  
  public static File B() {
    File file = new File(A(), "userActions");
    if (!file.exists()) {
      File file1 = new File(file, "ewq98ewq");
      file1.mkdirs();
      file1.delete();
    } 
    return file;
  }
  
  public static File C() {
    File file = new File(A(), "help");
    if (!file.exists()) {
      File file1 = new File(file, "tmp");
      file1.mkdirs();
      file1.delete();
    } 
    return file;
  }
  
  public static File D() {
    return new File(".", "help");
  }
  
  public static String E() {
    return System.getProperty("user.home") + File.separator;
  }
  
  public static File F() {
    File file = new File(G(), "fonts");
    if (!file.exists()) {
      File file1 = new File(file, "temp");
      file1.mkdirs();
      file1.delete();
    } 
    return file;
  }
  
  public static File G() {
    File file = new File(A(), "dashImages");
    if (!file.exists()) {
      File file1 = new File(file, "temp");
      file1.mkdirs();
      file1.delete();
    } 
    return file;
  }
  
  public static File H() {
    File file = new File(A(), "cache");
    if (!file.exists()) {
      File file1 = new File(file, "temp");
      file1.mkdirs();
      file1.delete();
    } 
    return file;
  }
  
  public static File I() {
    File file = new File(A(), "inc");
    if (!file.exists()) {
      File file1 = new File(file, "temp");
      file1.mkdirs();
      file1.delete();
    } 
    return file;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/r/j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */