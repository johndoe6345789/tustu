import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Staging implements ActionListener {
  JTextPane a = new JTextPane();

  JLabel b = new JLabel("Waiting for Application to Exit.");

  JButton c = new JButton("Cancel");

  public static String d = i();

  private static String f = "File Still Locked, waiting.";

  public static String e = "Successful";

  private static String g =
      "<html><body><center><h1>Completing EFI Analytics Update</h1></center>Please wait while"
          + " updated files are extracted. <br>This may take a moment. <br><br>Please"
          + " wait....<br></body></html>";

  private static String h =
      "<html><body><center><h1>Completing EFI Analytics Update</h1></center>If You see a message of"
          + " locked files, <br>make sure all instances of "
          + d
          + " are closed. <br><br>Please wait....<br></body></html>";

  private static String i =
      "<html><body><center><h1>Completing EFI Analytics Update</h1></center>Restarting "
          + d
          + ", <br><br>Please wait....<br></body></html>";

  private static String j = "DIE";

  private HashMap k = new HashMap<>();

  private static float l = -1.0F;

  public Staging() {
    d();
  }

  public static void main(String[] paramArrayOfString) {
    File file1 = new File(".", "Staging.log");
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(file1, false);
      PrintStream printStream = new PrintStream(fileOutputStream);
      System.setOut(printStream);
      System.setErr(printStream);
    } catch (Exception exception) {
      System.out.println("Error creating log file Output");
    }
    System.out.println("Updated: " + (new Date()).toString());
    System.out.println("Completing Installation, args: ");
    if (paramArrayOfString == null) {
      System.out.println("null");
    } else {
      System.out.println("args len: " + paramArrayOfString.length);
      for (String str : paramArrayOfString) System.out.println(str);
    }
    Staging staging = new Staging();
    JFrame jFrame = null;
    byte b = 0;
    File file2 = new File(".");
    String[] arrayOfString = file2.list();
    byte b1;
    for (b1 = 0; b1 < arrayOfString.length; b1++) {
      if (arrayOfString[b1].endsWith("temp") || arrayOfString[b1].toLowerCase().endsWith(".zip")) {
        jFrame = staging.f();
        break;
      }
    }
    b1 = 0;
    byte b2;
    for (b2 = 0; b2 < arrayOfString.length; b2++) {
      if (arrayOfString[b2].toLowerCase().endsWith(".zip")) {
        b1 = 1;
        break;
      }
    }
    if (b1 != 0 && !a()) {
      System.out.println("zip files detected on non windows");
      try {
        Process process = Runtime.getRuntime().exec(new String[] {"bash", "-c", "chmod -R 777 *"});
        process.waitFor();
      } catch (Exception exception) {
        exception.printStackTrace();
      }
    }
    h();
    try {
      Thread.sleep(2000L);
    } catch (Exception exception) {
    }
    arrayOfString = file2.list();
    for (b2 = 0; b2 < arrayOfString.length; b2++) {
      if (arrayOfString[b2].toLowerCase().endsWith(".zip")) {
        System.out.println("Finishing installation, expanding: " + arrayOfString[b2]);
        String str = arrayOfString[b2].substring(0, arrayOfString[b2].length() - 4);
        staging.b.setText("Updating files in: " + str);
        try {
          if (a(arrayOfString[b2], arrayOfString[b2].replace(".zip", ""), (String) null).equals(e))
            (new File(arrayOfString[b2])).delete();
        } catch (ZipException zipException) {
          staging.b.setText("ERROR While Extracting: " + arrayOfString[b2]);
          zipException.printStackTrace();
        } catch (IOException iOException) {
          staging.b.setText("ERROR While Extracting: " + arrayOfString[b2]);
          iOException.printStackTrace();
        }
      }
    }
    staging.a.setText(h);
    while (b++ >= 0) {
      arrayOfString = file2.list();
      b2 = 1;
      for (byte b3 = 0; b3 < arrayOfString.length; b3++) {
        System.out.print("#");
        if (arrayOfString[b3].endsWith("temp")) {
          String str1 = arrayOfString[b3];
          String str2 = str1.substring(0, str1.indexOf(".temp"));
          File file3 = new File(str2);
          File file4 = new File(str1);
          if (file4.exists()) {
            if (!file3.exists() || file3.delete()) {
              if (file4.renameTo(new File(str2))) {
                staging.b.setText("Updated File: " + file3.getName());
              } else {
                System.out.println(
                    "Error completing installation. Unable to rename new file to "
                        + file3.getName());
                staging.b.setText("Unable to rename new file to " + file3.getName());
                b2 = 0;
              }
            } else {
              f += ".";
              staging.b.setText(f);
              b2 = 0;
            }
          } else {
            staging.b.setText("Updated File: " + file3.getName());
            System.out.println("Updated File: " + file3.getName());
          }
        }
      }
      if (b == 15) staging.c.setEnabled(true);
      h();
      if (b2 != 0) {
        b = -2;
        staging.b.setText("Completed File Updates, Restarting Application.");
        System.out.println("Completed File Updates, Restarting Application.");
        break;
      }
      try {
        Thread.sleep(2000L);
      } catch (Exception exception) {
      }
    }
    if (paramArrayOfString != null && paramArrayOfString.length > 0) {
      String str = paramArrayOfString[0];
      str = b(str, "(Beta)", "");
      if (str != null && str.length() > 0)
        try {
          staging.a.setText(i);
          File file = (new File(".")).getAbsoluteFile();
          System.out.println("Setting launch dir to:\n" + file.getAbsolutePath());
          System.out.println("Launching app:\n" + str);
          Process process = Runtime.getRuntime().exec(str, (String[]) null, file);
          try {
            Thread.sleep(2000L);
          } catch (Exception exception) {
            exception.printStackTrace();
          }
          if (jFrame != null) jFrame.dispose();
          BufferedReader bufferedReader =
              new BufferedReader(new InputStreamReader(process.getInputStream()));
          String str1;
          while ((str1 = bufferedReader.readLine()) != null) System.out.println(str1);
          bufferedReader.close();
        } catch (Exception exception) {
          exception.printStackTrace();
        }
    }
    if (jFrame != null) jFrame.dispose();
  }

  private JFrame f() {
    JFrame jFrame = new JFrame("Completing Auto Update");
    jFrame.setLayout(new BorderLayout(8, 8));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    jPanel1.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
    this.a.setEditable(false);
    this.a.setOpaque(false);
    this.a.setContentType("text/html");
    this.a.setText(g);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("North", this.b);
    JProgressBar jProgressBar = new JProgressBar(0, 100);
    jProgressBar.setIndeterminate(true);
    jProgressBar.setStringPainted(false);
    jPanel2.add("Center", jProgressBar);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new FlowLayout(2));
    jPanel3.add(this.c);
    jPanel2.add("South", jPanel3);
    this.c.setEnabled(false);
    this.c.addActionListener(this);
    jPanel1.add("South", jPanel2);
    jPanel1.add("Center", this.a);
    jFrame.add("Center", jPanel1);
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    char c1 = 'Ɛ';
    char c2 = 'Ĭ';
    int i = (dimension.width - c1) / 2;
    int j = (dimension.height - c2) / 2;
    jFrame.setSize(c1, c2);
    jFrame.setLocation(i, j);
    jFrame.setVisible(true);
    jFrame.setAlwaysOnTop(true);
    return jFrame;
  }

  private void g() {
    String str =
        "<html><body><center><h1>Update Cancelled</h1></center>It is taking an excessively long"
            + " time to update all files.<br><br>Some files appear to be locked, this usually"
            + " indicates<br> there is still and instance of "
            + d
            + " running.<br>Make sure all instances of "
            + d
            + " are closed, <br>reboot your computer if nessecary.<br><br>Then Run "
            + d
            + " as Administrator.<br>The update will then be completed"
            + " automatically.</body></html>";
    JOptionPane.showMessageDialog(this.c, str);
    System.exit(0);
  }

  private static String b(String paramString1, String paramString2, String paramString3) {
    for (int i = paramString1.indexOf(paramString2); i >= 0; i = paramString1.indexOf(paramString2))
      paramString1 =
          paramString1.substring(0, i)
              + paramString3
              + paramString1.substring(i + paramString2.length());
    return paramString1;
  }

  public void actionPerformed(ActionEvent paramActionEvent) {
    if (paramActionEvent.getSource().equals(this.c)) g();
  }

  public static boolean a() {
    String str = System.getProperty("os.name", "Windows");
    return str.startsWith("Win");
  }

  public static String a(String paramString1, String paramString2, String paramString3) {
    ZipFile zipFile = new ZipFile(paramString1);
    Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
    while (enumeration.hasMoreElements()) {
      ZipEntry zipEntry = enumeration.nextElement();
      String str = zipEntry.getName();
      if (str.length() > 4) str = str.substring(str.length() - 4, str.length()).toLowerCase();
      if (paramString3 == null
          || zipEntry.isDirectory()
          || str.equals(".jpg")
          || str.equals("jpeg")
          || str.equals(".gif")) {
        String str1 = a(zipFile, zipEntry, paramString2);
        if (!str1.equals(e)) return str1;
      }
    }
    zipFile.close();
    return e;
  }

  public static String a(ZipFile paramZipFile, ZipEntry paramZipEntry, String paramString) {
    InputStream inputStream = paramZipFile.getInputStream(paramZipEntry);
    File file1 = new File(paramString + "/" + paramZipEntry.getName());
    String str = file1.getAbsolutePath();
    File file2 = new File(str.substring(0, str.lastIndexOf(File.separator)));
    file2.mkdirs();
    file1.setLastModified(paramZipEntry.getTime());
    if (paramZipEntry.isDirectory()) {
      file1.mkdir();
    } else {
      if (file1.exists()) file1.delete();
      file1.createNewFile();
      BufferedOutputStream bufferedOutputStream =
          new BufferedOutputStream(new FileOutputStream(file1));
      int i;
      while ((i = inputStream.read()) != -1) bufferedOutputStream.write(i);
      bufferedOutputStream.flush();
      bufferedOutputStream.close();
    }
    inputStream.close();
    return e;
  }

  private static void h() {
    try {
      File file = new File(b(), d + ".pipe");
      file.delete();
      file.createNewFile();
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      fileOutputStream.write(j.getBytes());
      fileOutputStream.close();
      file.deleteOnExit();
    } catch (IOException iOException) {
      Logger.getLogger(Staging.class.getName())
          .log(Level.WARNING, "Unable to create instance monitor file", iOException);
    }
  }

  public static File b() {
    File file = new File(c() + ".efiAnalytics" + File.separator + d + File.separator);
    if (!file.exists()) file.mkdirs();
    return file;
  }

  public static String c() {
    return System.getProperty("user.home") + File.separator;
  }

  private static String i() {
    File file = new File("BigComm.properties");
    if (file.exists()) return "BigComm";
    file = new File("FuelMonster.properties");
    if (file.exists()) return "Fuel Monster";
    file = new File("TuneMonster.properties");
    if (file.exists()) return "Tune Monster";
    file = new File("BigCommGen4.properties");
    if (file.exists()) return "BigComm Gen4";
    file = new File("TunerStudio.properties");
    if (file.exists()) return "TunerStudio";
    file = new File("TSDash.properties");
    if (file.exists()) return "TS Dash";
    file = new File("MegaLogViewer.properties");
    if (file.exists()) return "MegaLogViewer";
    file = new File("HogLogViewer.properties");
    if (file.exists()) return "MegaLogViewer";
    file = new File("BigStuff3.properties");
    return file.exists() ? "MegaLogViewer" : "TunerStudio";
  }

  public void d() {
    boolean bool = (a() && UIManager.getLookAndFeel().isNativeLookAndFeel()) ? true : false;
    try {
      UIManager.setLookAndFeel(UIManager.getLookAndFeel());
    } catch (UnsupportedLookAndFeelException unsupportedLookAndFeelException) {
      Logger.getLogger(Staging.class.getName())
          .log(Level.SEVERE, (String) null, unsupportedLookAndFeelException);
    }
    Font font1 = UIManager.getFont("Label.font");
    byte b = 12;
    int i = e();
    float f = i / b;
    Set set = UIManager.getLookAndFeelDefaults().keySet();
    Object[] arrayOfObject1 = set.toArray(new Object[set.size()]);
    Object[] arrayOfObject2 = new Object[arrayOfObject1.length + 1];
    System.arraycopy(arrayOfObject1, 0, arrayOfObject2, 0, arrayOfObject1.length);
    arrayOfObject2[arrayOfObject2.length - 1] = "defaultFont";
    arrayOfObject1 = arrayOfObject2;
    Font font2 = UIManager.getFont("defaultFont");
    for (Object object : arrayOfObject1) {
      if (object != null && object.toString().toLowerCase().contains("font")) {
        Font font = UIManager.getFont(object);
        if (font != null && !bool) {
          Float float_ = (Float) this.k.get(object);
          if (float_ == null) {
            this.k.put(object, Float.valueOf(font.getSize2D()));
            float_ = Float.valueOf(font.getSize2D());
          }
          Font font3 =
              new Font(font.getFamily(), font.getStyle(), Math.round(a(float_.floatValue() * f)));
          UIManager.put(object, font3);
        } else if (font == null) {
          System.out.println("no update:" + object);
        }
      } else if (object != null && object.toString().equals("ScrollBar.width")) {
        System.out.println(object);
        if (UIManager.getInt(object) < 20)
          UIManager.put(object, Float.valueOf(a(UIManager.getInt(object))));
      } else if (UIManager.get(object) instanceof Font) {
        System.out.println("no update:" + object);
      }
    }
    if (font2 != null) {
      Font font = new Font(font2.getFamily(), font2.getStyle(), (int) a(12.0F));
      UIManager.getLookAndFeel().getDefaults().put("defaultFont", font);
    }
  }

  public static int e() {
    byte b = 12;
    if (a()) {
      int i = Toolkit.getDefaultToolkit().getScreenResolution();
      return Math.round(b * i / 96.0F);
    }
    return b;
  }

  public static float a(float paramFloat) {
    return a() ? (paramFloat * j() / 96.0F) : paramFloat;
  }

  private static float j() {
    if (l < 0.0F)
      try {
        l = Toolkit.getDefaultToolkit().getScreenResolution();
      } catch (Error error) {
        l = Toolkit.getDefaultToolkit().getScreenResolution();
      }
    return l;
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/Staging.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
