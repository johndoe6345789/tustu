import HInterfaceHotel.HInterfaceHotel;
import HInterfaceHotel.i;
import ao.I;
import ao.b;
import ao.bD;
import ao.cd;
import bH.D;
import bH.J;
import bH.X;
import bH.i;
import com.efiAnalytics.ui.aN;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.fh;
import g.IOJFileChooser;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class MegaLogViewer {
  static cd a = null;

  public static void main(String[] paramArrayOfString) {
    Locale.setDefault(Locale.US);
    a();
    String str1 = "MegaLogViewer.jar";
    String str2 = ".";
    String str3 =
        J.d()
            ? UIManager.getCrossPlatformLookAndFeelClassName()
            : UIManager.getSystemLookAndFeelClassName();
    boolean bool1 = false;
    boolean bool2 = false;
    try {
      File file =
          new File(
              (new MegaLogViewer())
                  .getClass()
                  .getProtectionDomain()
                  .getCodeSource()
                  .getLocation()
                  .toURI());
      if (!file.getName().equals("classes")) str1 = file.getName();
      System.out.println("App Path:" + file.getAbsolutePath());
      str2 = file.getParentFile().getAbsolutePath();
      System.out.println("Jar Name:" + str1);
      i.l = str1;
    } catch (URISyntaxException uRISyntaxException) {
      uRISyntaxException.printStackTrace();
    }
    bD bD = null;
    if (paramArrayOfString.length > 0
        && (paramArrayOfString[paramArrayOfString.length - 1].endsWith(".properties")
            || paramArrayOfString[paramArrayOfString.length - 1].endsWith(".properties\""))) {
      File file = new File(paramArrayOfString[paramArrayOfString.length - 1]);
      if (file.exists()) {
        Properties properties = new Properties();
        try {
          InputStreamReader inputStreamReader =
              new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8);
          properties.load(inputStreamReader);
          bD = new bD();
          bD.b(properties.getProperty("displayView"));
          bD.a(properties.getProperty("fileName"));
          bD.a(Boolean.parseBoolean(properties.getProperty("trailFile", Boolean.FALSE.toString())));
          bD.b(
              Boolean.parseBoolean(
                  properties.getProperty("startPlayback", Boolean.FALSE.toString())));
        } catch (IOException iOException) {
          D.a("Unable to load file: " + file.getAbsolutePath());
        }
      } else {
        D.b(
            "Passed Parameter looked like a LoadCommand, but file not found: "
                + paramArrayOfString[0]);
      }
    }
    i.b().a();
    (new I()).a(paramArrayOfString, str1);
    if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("hog"))
        || str1.equals("HogLogViewer.jar")) {
      if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("hog"))
        paramArrayOfString = new String[0];
      bool2 = true;
    } else if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("dyno"))
        || str1.equals("DynoSpectrum.jar")) {
      if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("dyno"))
        paramArrayOfString = new String[0];
      bool2 = true;
    } else if ((paramArrayOfString.length > 0 && paramArrayOfString[0].equals("big"))
        || str1.equals("BigStuffLog.jar")) {
      if (paramArrayOfString.length > 0 && paramArrayOfString[0].equals("big"))
        paramArrayOfString = new String[0];
      str3 = "de.muntjak.tinylookandfeel.TinyLookAndFeel";
      bool2 = true;
      bool1 = true;
    }
    String str4 = i.IOJFileChooser();
    boolean bool3 = i.a("debug", "false").equals("true");
    if (!bool3) {
      File file = new File(HInterfaceHotel.a() + File.separator + str4 + "LogFile.txt");
      try {
        if (file.exists() && file.length() > 1000000L) file.delete();
      } catch (Exception exception) {
        System.out.println("Error deleting log file Output");
      }
      try {
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        PrintStream printStream = new PrintStream(fileOutputStream);
        System.setOut(printStream);
        System.setErr(printStream);
      } catch (Exception exception) {
        System.out.println("Error creating log file Output");
      }
    }
    System.out.println("App Edition:" + i.c);
    System.out.println("Jar Name:" + str1);
    System.out.println(i.b + " " + i.a + " started on " + (new Date()).toString());
    System.out.println(
        "JRE "
            + System.getProperty("java.version")
            + ", "
            + System.getProperty("os.name")
            + " "
            + System.getProperty("os.version")
            + ", "
            + System.getProperty("os.arch"));
    System.out.println("Working Dir:" + str2);
    boolean bool4 = i.a(i.Z, false);
    if (bool4) System.setProperty("sun.java2d.opengl", "true");
    try {
      if (bool2 || str3.equals("de.muntjak.tinylookandfeel.TinyLookAndFeel"))
        UIManager.installLookAndFeel("Night Shade", "de.muntjak.tinylookandfeel.TinyLookAndFeel");
      UIManager.LookAndFeelInfo[] arrayOfLookAndFeelInfo = UIManager.getInstalledLookAndFeels();
      for (UIManager.LookAndFeelInfo lookAndFeelInfo : arrayOfLookAndFeelInfo)
        System.out.println(
            "Look:"
                + lookAndFeelInfo.getName()
                + ", ClassName:'"
                + lookAndFeelInfo.getClassName()
                + "'");
    } catch (Exception exception) {
      exception.printStackTrace();
    }
    if (i.a("forceOpenGL", false)) {
      System.setProperty("sun.java2d.opengl", "true");
    } else if (i.a("disableD3d", true)) {
      System.setProperty("sun.java2d.d3d", "false");
    }
    try {
      String str = X.b(i.c, "Lite!", "");
      System.setProperty("apple.laf.useScreenMenuBar", "true");
      System.setProperty(
          "com.apple.mrj.application.apple.menu.about.name", i.b + " " + str + " " + i.a);
    } catch (Exception exception) {
      System.out.println("Exception while setting OS X properties: " + exception.getMessage());
    }
    String str5 = i.e("lookAndFeelClass", str3);
    if (bool1) str5 = "de.muntjak.tinylookandfeel.TinyLookAndFeel";
    try {
      System.out.println("Setting Look & Feel to:" + str5);
      boolean bool = str5.equals("de.muntjak.tinylookandfeel.TinyLookAndFeel");
      if (str5.equals("de.muntjak.tinylookandfeel.TinyLookAndFeel")) fh.a(true);
      if (bool && !eJ.b()) {
        Toolkit.getDefaultToolkit().setDynamicLayout(true);
        System.setProperty("sun.awt.noerasebackground", "true");
        JFrame.setDefaultLookAndFeelDecorated(false);
      } else {
        Toolkit.getDefaultToolkit().setDynamicLayout(false);
        System.setProperty("sun.awt.noerasebackground", "false");
        JFrame.setDefaultLookAndFeelDecorated(false);
      }
      UIManager.setLookAndFeel(str5);
      UIManager.put("FileChooser.useSystemExtensionHiding", Boolean.valueOf(false));
      b.a().b();
    } catch (Exception exception) {
      D.c("Exception setting look to " + str5);
      exception.printStackTrace();
    }
    a a = new a();
    try {
      SwingUtilities.invokeAndWait(a);
    } catch (Exception exception) {
      Logger.getLogger(MegaLogViewer.class.getName())
          .log(Level.WARNING, "Failed to init MainFrame in event thread, trying here..", exception);
      a = new cd();
    }
    cd cd1 = a;
    if (bD != null && bD.a() != null) {
      File file = new File(bD.a());
      if (file.exists()) {
        bD bD1 = bD;
        b b = new b(bD1, cd1, file);
        SwingUtilities.invokeLater(b);
      } else {
        D.b("LoadCommand Found, but pointed to an invalid file: \n" + bD.a());
      }
    } else if (paramArrayOfString.length > 0
        && paramArrayOfString[0] != null
        && paramArrayOfString[0].trim().length() > 0) {
      System.out.println("reopening log file: " + paramArrayOfString[0]);
      cd1.a(paramArrayOfString, false);
    }
    Runtime.getRuntime().addShutdownHook(new e(cd1));
  }

  public static void a() {
    try {
      double d = Double.parseDouble(System.getProperty("java.specification.version"));
      String str = "http://www.java.com/en/download/manual.jsp";
      if (d < 1.6D
          && IOJFileChooser.a(
              "You are currently have JRE version "
                  + d
                  + " installed.\n"
                  + "This application requires JRE 1.6 or higher.\n"
                  + "If you continue, you will experience problems.\n"
                  + " \n"
                  + "Would you like to get the latest JRE now?",
              null,
              true)) aN.a(str);
    } catch (Exception exception) {
      IOJFileChooser.a(
          "Unable to determine the JRE version.\nJRE version 1.5 is required for this application",
          null);
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/MegaLogViewer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
