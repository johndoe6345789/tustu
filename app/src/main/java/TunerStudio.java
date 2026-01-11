import A.AInterfaceVictor;
import V.ExceptionInVPackage;
import aP.Ioinadpackage;
import aP.WindowListenerAzinterfacecharlie;
import aP.NetworkHashMap;
import bH.D;
import bH.J;
import bH.i;
import bH.t;
import com.efiAnalytics.ui.eJ;
import java.awt.Insets;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import r.ExceptionInVPackage;
import r.ThreadedFile;

public class TunerStudio {
  static WindowListenerAzinterfacecharlie ExceptionInVPackage = null;
  
  static String b = "AppDebug";
  
  static boolean c = false;
  
  static String d = "";
  
  public static void main(String[] paramArrayOfString) {
    String str = "TunerStudioMS.jar";
    int i = 2023;
    try {
      File file = new File((new TunerStudio()).getClass().getProtectionDomain().getCodeSource().getLocation().toURI());
      if (!file.getName().equals("classes"))
        str = file.getName(); 
      if (file != null) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date(file.lastModified()));
        i = gregorianCalendar.get(1);
      } 
      System.out.println("Jar Name:" + str);
    } catch (URISyntaxException uRISyntaxException) {
      uRISyntaxException.printStackTrace();
    } 
    if (J.NetworkHashMap())
      ExceptionInVPackage(); 
    (new Ioinadpackage()).ExceptionInVPackage(paramArrayOfString, str);
    boolean bool1 = true;
    if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("-noSplash")) {
      System.out.println("Splashscreen suppressed.");
      bool1 = false;
      paramArrayOfString[0] = "";
    } 
    boolean bool2 = bool1;
    if (paramArrayOfString.length > 1)
      paramArrayOfString[0] = paramArrayOfString[1]; 
    ExceptionInVPackage.cw = ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage("tuneFileExt", "msq");
    ExceptionInVPackage.aj = i;
    boolean bool3 = ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage("debug", "false").equals("true");
    boolean bool4 = ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage("debug", "false").equals("off");
    if (bool4) {
      D.ExceptionInVPackage(false);
    } else if (!bool3) {
      b = ExceptionInVPackage.b + "AppDebug.txt";
      try {
        String str1 = ThreadedFile.t();
        b = str1 + File.separator + b;
        File file = new File(b);
        if (file.exists() && file.length() > 5000000L)
          c = !file.delete(); 
      } catch (Exception exception) {
        System.out.println("Error deleting log file Output");
      } 
      try {
        ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage(new File(b));
        FileOutputStream fileOutputStream = new FileOutputStream(b, !c);
        PrintStream printStream = new PrintStream(fileOutputStream);
        System.setOut(printStream);
        System.setErr(printStream);
      } catch (Exception exception) {
        System.out.println("Error creating log file Output");
      } 
    } 
    if (!d.isEmpty())
      System.out.println(d); 
    System.out.println("Starting on " + AInterfaceVictor.b());
    System.out.println(ExceptionInVPackage.b + " " + ExceptionInVPackage.ExceptionInVPackage + " started on " + (new Date()).toString());
    System.out.println("JRE " + System.getProperty("java.version") + ", " + System.getProperty("os.name") + " " + System.getProperty("os.version") + ", " + System.getProperty("os.arch"));
    System.out.println("java.library.path=" + System.getProperty("java.library.path"));
    System.out.println(System.getProperty("java.class.path"));
    try {
      System.setProperty("file.encoding", "UTF-8");
      Field field = Charset.class.getDeclaredField("defaultCharset");
      field.setAccessible(true);
      field.set(null, null);
    } catch (Exception exception) {
      exception.printStackTrace();
    } 
    if (ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.F, ExceptionInVPackage.G)) {
      System.setProperty("sun.java2d.opengl", "true");
    } else if (ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.H, ExceptionInVPackage.I)) {
      System.setProperty("sun.java2d.d3d", "false");
    } 
    try {
      Object object = null;
      UIManager.installLookAndFeel("Night Shade", "de.muntjak.tinylookandfeel.TinyLookAndFeel");
      UIManager.LookAndFeelInfo[] arrayOfLookAndFeelInfo = UIManager.getInstalledLookAndFeels();
      for (byte b = 0; b < arrayOfLookAndFeelInfo.length; b++)
        System.out.println("Look:" + arrayOfLookAndFeelInfo[b].getName() + ", ClassName:'" + arrayOfLookAndFeelInfo[b].getClassName() + "'"); 
      try {
        System.setProperty("apple.laf.useScreenMenuBar", "false");
        System.setProperty("com.apple.mrj.application.apple.menu.about.name", ExceptionInVPackage.ExceptionInVPackage().b());
      } catch (Exception exception) {
        System.out.println("Exception while setting OS X properties: " + exception.getMessage());
      } 
      String str1 = ExceptionInVPackage.ExceptionInVPackage().ExceptionInVPackage("defaultLookAndFeelClass", UIManager.getCrossPlatformLookAndFeelClassName());
      if (str1.equals("NATIVE"))
        str1 = UIManager.getSystemLookAndFeelClassName(); 
      String str2 = ExceptionInVPackage.ExceptionInVPackage().c("lookAndFeelClass", str1);
      System.out.println("Setting Look & Feel to:" + str2);
      UIManager.put("FileChooser.useSystemExtensionHiding", Boolean.valueOf(false));
      boolean bool = (str2.equals("de.muntjak.tinylookandfeel.TinyLookAndFeel") && !eJ.b()) ? true : false;
      if (str2.equals("de.muntjak.tinylookandfeel.TinyLookAndFeel"))
        ExceptionInVPackage.bS = true; 
      UIManager.setLookAndFeel(str2);
      if (str2.contains("Nimbus")) {
        UIDefaults uIDefaults = UIManager.getLookAndFeel().getDefaults();
        uIDefaults.put("Table.cellNoFocusBorder", new Insets(0, 0, 0, 0));
        uIDefaults.put("Table.focusCellHighlightBorder", new Insets(0, 0, 0, 0));
        UIManager.getLookAndFeelDefaults().put("Table.cellNoFocusBorder", new Insets(0, 0, 0, 0));
        UIManager.getLookAndFeelDefaults().put("Table.focusCellHighlightBorder", new Insets(0, 0, 0, 0));
      } 
      NetworkHashMap.ExceptionInVPackage().x();
    } catch (Exception exception) {
      System.out.println("Couldn't set UI");
      exception.printStackTrace();
    } 
    if (bool2) {
      NetworkHashMap NetworkHashMap = new NetworkHashMap();
      try {
        SwingUtilities.invokeAndWait(NetworkHashMap);
        if (!J.ExceptionInVPackage())
          Thread.sleep(200L); 
        if (J.e())
          Thread.sleep(400L); 
      } catch (InterruptedException interruptedException) {
        Logger.getLogger(TunerStudio.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
      } catch (InvocationTargetException invocationTargetException) {
        Logger.getLogger(TunerStudio.class.getName()).log(Level.SEVERE, (String)null, invocationTargetException);
      } 
    } 
    g g = new g(bool2, paramArrayOfString);
    i.b().ExceptionInVPackage();
    try {
      SwingUtilities.invokeAndWait(g);
    } catch (InterruptedException interruptedException) {
      Logger.getLogger(TunerStudio.class.getName()).log(Level.SEVERE, (String)null, interruptedException);
    } catch (InvocationTargetException invocationTargetException) {
      Logger.getLogger(TunerStudio.class.getName()).log(Level.SEVERE, (String)null, invocationTargetException);
    } 
    Runtime.getRuntime().addShutdownHook(new h());
  }
  
  private static void ExceptionInVPackage() {
    File file1 = new File("./lib/jssc2.8.jar");
    File file2 = new File("./lib/jssc.jar");
    if (file1.exists() && file1.length() > 0L && file1.length() != file2.length()) {
      d += "Updating JSSC Driver to 2.8 versoin for XP compatability.\n";
      if (file2.delete()) {
        try {
          t.ExceptionInVPackage(file1, file2);
          d += "Successfully changed JSSC Library to 2.8 for XP compatability.\n";
        } catch (ExceptionInVPackage ExceptionInVPackage) {
          d += "Failed to copy jssc2.8.jar to jssc.jar, try it manually.\n";
        } 
      } else {
        d += "Unable to delete existing jssc.jar file, try deleting it manually.\n";
      } 
    } else {
      d += "JSSC library appears to be set to the 2.8 version for XP support.\n";
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/TunerStudio.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */