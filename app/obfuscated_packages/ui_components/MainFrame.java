package ao;

import V.ExceptionInVPackage;
import W.U;
import W.X;
import W.WInterfaceAp;
import W.Properties;
import ai.JPanelExtensionInAiPackage;
import as.ExceptionInVPackage;
import as.JDialogExtensionDispose;
import at.ExceptionInVPackage;
import at.IOJMenu;
import au.IOJMenu;
import ay.ExceptionInVPackage;
import az.IOJMenu;
import az.ThreadedInAzPackage;
import az.AzInterfaceTango;
import bA.JMenuItemExtensionInBaPackage;
import bH.C;
import bH.D;
import bH.J;
import bH.S;
import bH.U;
import bH.X;
import bH.aa;
import bH.ae;
import bH.IOJMenu;
import bI.JPanelExtensionInAiPackage;
import bI.BiInterfaceHotel;
import bV.ExceptionInVPackage;
import bV.ArrayListInBvPackage;
import com.efiAnalytics.ui.aN;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cS;
import com.efiAnalytics.ui.cz;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.dS;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.eK;
import com.efiAnalytics.ui.et;
import JPanelExtensionInAiPackage.ArrayListInBvPackage;
import JDialogExtensionDispose.IOJMenu;
import JDialogExtensionDispose.k;
import BiInterfaceHotel.b;
import BiInterfaceHotel.BiInterfaceHotel;
import BiInterfaceHotel.i;
import i.JDialogExtensionDispose;
import java.awt.AWTEvent;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ItemListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.font.TextAttribute;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipException;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import javax.swing.KeyStroke;
import javax.swing.UIManager;
import javax.swing.filechooser.FileView;
import k.ArrayListInBvPackage;

public class cd extends JFrame implements hi, WindowListener {
  aX ExceptionInVPackage = null;
  
  bK b = null;
  
  String[] IOJMenu = aV.ExceptionInVPackage().b();
  
  JMenuItem ArrayListInBvPackage;
  
  JMenuItem JMenuItemExtensionInBaPackage;
  
  JMenu JPanelExtensionInAiPackage;
  
  JMenu JDialogExtensionDispose;
  
  JMenu BiInterfaceHotel = null;
  
  Frame i = null;
  
  JMenuItem j = null;
  
  JMenu k = null;
  
  JCheckBoxMenuItem l = null;
  
  eK m = null;
  
  IOJMenu n = null;
  
  er ThreadedInAzPackage = null;
  
  eC p = null;
  
  long q = 604800000L;
  
  static boolean r = false;
  
  boolean s = false;
  
  private final String A = "Log Viewer";
  
  private final String B = "Ignition Log Viewer";
  
  private final String C = "Scatter Plots";
  
  private final String D = "Histogram / Table Generator";
  
  private final String E = "Reference Values";
  
  private final String F = "Purchase Registration";
  
  private static final String G = b.b;
  
  private final String H = "Custom Fields";
  
  File AzInterfaceTango = null;
  
  private boolean I = false;
  
  fA u = new fA();
  
  gZ v = new gZ();
  
  JDialogExtensionDispose w = null;
  
  ExceptionInVPackage x = null;
  
  JMenu y = new ee(this, "Calculated Fields");
  
  int z = 1;
  
  public cd() {
    aa aa = new aa();
    aa.ExceptionInVPackage();
    boolean bool1 = true;
    setTitle("");
    this.i = this;
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource(i.B));
    setIconImage(image);
    bV.ExceptionInVPackage(this);
    bq.ExceptionInVPackage().ExceptionInVPackage(this);
    bV.ExceptionInVPackage(new ce(this));
    I();
    if (G()) {
      K();
      ThreadedInAzPackage.ExceptionInVPackage(true);
      i.IOJMenu("lastUpdateCheckDate", "" + (System.currentTimeMillis() - this.q - 1000L));
    } 
    AzInterfaceTango AzInterfaceTango = new AzInterfaceTango();
    BiInterfaceHotel.ExceptionInVPackage().ExceptionInVPackage((JPanelExtensionInAiPackage)AzInterfaceTango);
    eg eg = new eg(this);
    cS.ExceptionInVPackage((C)eg);
    boolean bool2 = false;
    if (!bool2 && cS.ExceptionInVPackage((C)eg).ExceptionInVPackage(eg.JPanelExtensionInAiPackage()) && B()) {
      i.IOJMenu = X.b(i.IOJMenu, G, "");
      this.s = true;
    } else if (!bool2 && cS.ExceptionInVPackage((C)eg).ExceptionInVPackage(eg.JDialogExtensionDispose(), 1)) {
      String str = hU.b;
      Properties properties = new Properties();
      properties.setProperty(hU.ExceptionInVPackage, eg.ArrayListInBvPackage());
      str = hU.ExceptionInVPackage(properties, str);
      int n = JOptionPane.showConfirmDialog(this, str, "Upgrade Registration", 0);
      if (n == 0)
        aN.ExceptionInVPackage("https://www.efianalytics.com/register/upgradeMlvRegistrationKey.jsp?email=" + eg.ArrayListInBvPackage()); 
    } 
    setTitle("");
    if (bool1) {
      D.IOJMenu("Check 1: " + aa.ArrayListInBvPackage());
      aa.JMenuItemExtensionInBaPackage();
      aa.ExceptionInVPackage();
    } 
    b.ExceptionInVPackage().ExceptionInVPackage(i.b, i.IOJMenu);
    if (bool1) {
      D.IOJMenu("Set Features: " + aa.ArrayListInBvPackage());
      aa.JMenuItemExtensionInBaPackage();
      aa.ExceptionInVPackage();
    } 
    this.b = new bK(hx.ExceptionInVPackage());
    if (bool1) {
      D.IOJMenu("Create Lower Toolbar: " + aa.ArrayListInBvPackage());
      aa.JMenuItemExtensionInBaPackage();
      aa.ExceptionInVPackage();
    } 
    add(this.b, "South");
    bq.ExceptionInVPackage().ExceptionInVPackage(this.b);
    if (bool1) {
      D.IOJMenu("Add Lower Toolbar: " + aa.ArrayListInBvPackage());
      aa.JMenuItemExtensionInBaPackage();
      aa.ExceptionInVPackage();
    } 
    (new fw()).ExceptionInVPackage();
    this.ExceptionInVPackage = new aX();
    if (bool1) {
      D.IOJMenu("Create GraphPanel: " + aa.ArrayListInBvPackage());
      aa.JMenuItemExtensionInBaPackage();
      aa.ExceptionInVPackage();
    } 
    if (this.s) {
      this.ExceptionInVPackage.ExceptionInVPackage(eg.b(), eg.IOJMenu(), eg.ArrayListInBvPackage());
    } else {
      this.ExceptionInVPackage.ExceptionInVPackage(null, null, null);
    } 
    if (bool1) {
      D.IOJMenu("Check 2: " + aa.ArrayListInBvPackage());
      aa.JMenuItemExtensionInBaPackage();
      aa.ExceptionInVPackage();
    } 
    D.IOJMenu("init components: " + aa.ArrayListInBvPackage());
    aa.JMenuItemExtensionInBaPackage();
    aa.ExceptionInVPackage();
    setJMenuBar(L());
    if (bool1) {
      D.IOJMenu("Build Menu: " + aa.ArrayListInBvPackage());
      aa.JMenuItemExtensionInBaPackage();
      aa.ExceptionInVPackage();
    } 
    this.m = new eK();
    this.m.add("Log Viewer", this.ExceptionInVPackage);
    cs cs = new cs(this);
    cs.run();
    if (b.ExceptionInVPackage().ExceptionInVPackage("showRegisterTab")) {
      fC fC = new fC();
      this.m.add("Purchase Registration", fC);
      this.m.JDialogExtensionDispose("Purchase Registration");
    } 
    add((Component)this.m, "Center");
    this.ExceptionInVPackage.n().ExceptionInVPackage(i.ExceptionInVPackage("playbackSpeed", 1.0D), false);
    this.ExceptionInVPackage.n().ExceptionInVPackage(this);
    if (bool1) {
      D.IOJMenu("Build tabs: " + aa.ArrayListInBvPackage());
      aa.JMenuItemExtensionInBaPackage();
      aa.ExceptionInVPackage();
    } 
    addWindowListener(this);
    int i = i.b("x", 100);
    int j = i.b("y", 50);
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    int k = i.b("width", dimension.width - 200);
    int m = i.b("height", dimension.height - 200);
    Rectangle rectangle = new Rectangle(i, j, k, m);
    rectangle = bV.b(rectangle);
    setBounds(rectangle);
    boolean bool = i.ExceptionInVPackage(i.al, false);
    if (bool)
      setExtendedState(6); 
    doLayout();
    enableEvents(1L);
    enableEvents(262144L);
    D.IOJMenu("Layout: " + aa.ArrayListInBvPackage());
    aa.JMenuItemExtensionInBaPackage();
    aa.ExceptionInVPackage();
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(bY.ExceptionInVPackage());
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new ec(this));
    k.ExceptionInVPackage = new JFileChooser();
    k.ExceptionInVPackage.setFileView((FileView)new IOJMenu());
    if (bool1) {
      D.IOJMenu("init File Chooser: " + aa.ArrayListInBvPackage());
      aa.JMenuItemExtensionInBaPackage();
      aa.ExceptionInVPackage();
    } 
    setVisible(true);
    if (bool1) {
      D.IOJMenu("Set Visible: " + aa.ArrayListInBvPackage());
      aa.JMenuItemExtensionInBaPackage();
      aa.ExceptionInVPackage();
    } 
    ArrayListInBvPackage.ExceptionInVPackage();
    if (i.ExceptionInVPackage(i.y, false) && BiInterfaceHotel.ExceptionInVPackage(".")) {
      i.IOJMenu("lastUpdateCheckDate", "0");
      b.ExceptionInVPackage().ExceptionInVPackage("Updating Application Files");
      this.I = true;
      (new en(this, true, this)).start();
    } else if (i.ExceptionInVPackage("automaticUpdates", true) || !i.ExceptionInVPackage("valid", false)) {
      (new en(this, false, this)).start();
    } 
    ExceptionInVPackage.IOJMenu().ExceptionInVPackage(this.v);
    ExceptionInVPackage.IOJMenu().JDialogExtensionDispose();
    setTransferHandler(new eb(this));
  }
  
  private void z() {
    i.ArrayListInBvPackage("registrationKeyV2", "");
    i.ArrayListInBvPackage("userEmail", "");
    i.ArrayListInBvPackage("firstName", "");
    i.ArrayListInBvPackage("lastName", "");
    i.BiInterfaceHotel();
    i.JDialogExtensionDispose();
  }
  
  public int ExceptionInVPackage() {
    int i = i.b("loopCount", 0);
    U u = new U();
    u.ExceptionInVPackage();
    u.ExceptionInVPackage();
    int j = u.ExceptionInVPackage();
    i.IOJMenu("loopCount", "" + j);
    return j;
  }
  
  private void JMenuItemExtensionInBaPackage(String paramString) {
    String str = i.JMenuItemExtensionInBaPackage("disabledKeys", "");
    str = str + paramString + ";";
    i.IOJMenu("disabledKeys", str);
    i.JDialogExtensionDispose();
  }
  
  private ArrayList A() {
    ArrayList<String> arrayList = new ArrayList();
    String str = i.JMenuItemExtensionInBaPackage("disabledKeys", "");
    StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
    while (stringTokenizer.hasMoreTokens())
      arrayList.add(stringTokenizer.nextToken()); 
    return arrayList;
  }
  
  private boolean JPanelExtensionInAiPackage(String paramString) {
    ArrayList arrayList = A();
    return arrayList.contains(paramString);
  }
  
  private boolean B() {
    cD cD = new cD(this);
    ThreadedInAzPackage ThreadedInAzPackage = ThreadedInAzPackage.ExceptionInVPackage(new bW(), cD);
    ArrayListInBvPackage ArrayListInBvPackage = ThreadedInAzPackage.BiInterfaceHotel();
    if (ArrayListInBvPackage != null) {
      if (ArrayListInBvPackage.ExceptionInVPackage() == 0) {
        this.s = true;
      } else if (ArrayListInBvPackage.ExceptionInVPackage() == 4) {
        bV.ArrayListInBvPackage(IOJMenu.BiInterfaceHotel + "\n" + IOJMenu.JPanelExtensionInAiPackage, this);
        this.s = false;
      } else if (ArrayListInBvPackage.ExceptionInVPackage() == 1) {
        D.IOJMenu("renewal over due");
        this.s = true;
      } else if (ArrayListInBvPackage.ExceptionInVPackage() == 2) {
        bV.ArrayListInBvPackage(IOJMenu.BiInterfaceHotel + "\n" + ArrayListInBvPackage.b(), this);
        this.s = false;
      } else if (ArrayListInBvPackage.ExceptionInVPackage() == 7) {
        bV.ArrayListInBvPackage(IOJMenu.j + "\n" + ArrayListInBvPackage.b(), this);
        this.s = false;
      } else if (ArrayListInBvPackage.ExceptionInVPackage() == 5) {
        bV.ArrayListInBvPackage(IOJMenu.IOJMenu(cD) + "\n" + ArrayListInBvPackage.b(), this);
        this.s = false;
      } else if (ArrayListInBvPackage.ExceptionInVPackage() == 6) {
        String str = X.b(i.IOJMenu, b.b, "");
        str = X.b(str, "(Beta)", "");
        bV.ArrayListInBvPackage("The registration info provided is no longer valid.\n\nPlease contact EFI Analytics if you are the rightful owner of the registration.", bq.ExceptionInVPackage().b());
        aN.ExceptionInVPackage(i.n);
        try {
          z();
        } catch (ExceptionInVPackage a1) {
          Logger.getLogger(cd.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
        } 
        this.s = false;
      } 
    } else {
      i.IOJMenu += G;
      this.s = false;
    } 
    return this.s;
  }
  
  public boolean b() {
    Date date1 = new Date();
    date1.setTime(i.ExceptionInVPackage("lastUpdateCheckDate", (new Date()).getTime() - this.q - 1L));
    Date date2 = new Date();
    date2.setTime(System.currentTimeMillis() - this.q);
    boolean bool = false;
    if (date1.before(date2)) {
      System.out.println("processor score: " + ExceptionInVPackage());
      ExceptionInVPackage a1 = new ExceptionInVPackage();
      ArrayListInBvPackage ArrayListInBvPackage = null;
      try {
        String str = X.b(i.IOJMenu, G, "").trim();
        ArrayListInBvPackage = a1.ExceptionInVPackage(i.JMenuItemExtensionInBaPackage("uid", ""), i.b, i.JMenuItemExtensionInBaPackage("version", "" + i.ExceptionInVPackage), i.JMenuItemExtensionInBaPackage("installDate", ""), i.JMenuItemExtensionInBaPackage("loopCount", ""), i.JMenuItemExtensionInBaPackage("registrationKeyV2", ""), str, i.JMenuItemExtensionInBaPackage("lastFileFormat", ""));
      } catch (IOException iOException) {
        System.out.println("Unable to read from update server, connection to server unavailable");
        return false;
      } 
      if (ArrayListInBvPackage == null)
        return false; 
      if (ArrayListInBvPackage.ExceptionInVPackage() == 0) {
        r = false;
        F();
        i.IOJMenu("lastUpdateCheckDate", "" + (new Date()).getTime());
        i.IOJMenu(i.y, "false");
        i.JDialogExtensionDispose();
      } else if (ArrayListInBvPackage.ExceptionInVPackage() == 2) {
        F();
        String[] arrayOfString = { "Complete Update", "Update Later" };
        boolean bool1 = (this.I || bV.ExceptionInVPackage(ArrayListInBvPackage.b(), "Update Available", this, arrayOfString)) ? true : false;
        if (bool1) {
          if (!BiInterfaceHotel.ExceptionInVPackage(".") && bV.ArrayListInBvPackage()) {
            String str = "Elevate.exe";
            if ((new File(str)).exists()) {
              boolean bool2 = true;
              if (bool2) {
                i.IOJMenu(i.y, "true");
                i.JDialogExtensionDispose();
                try {
                  Runtime.getRuntime().exec("Elevate.exe " + i.k);
                  System.exit(0);
                } catch (IOException iOException) {
                  Logger.getLogger(b.class.getName()).log(Level.SEVERE, (String)null, iOException);
                } 
              } else {
                return false;
              } 
            } else {
              String str1 = i.b + " does not currently have write access to the installation folder.\n\nUsing Windows 7 and Vista Operating Systems Auto Update requires \nAdministrator rights. Please start " + i.b + "\nUsing Run As Administrator to complete Auto Update. \nWith Windows 7 the \"Run As Administrator\" Option can be found by \nPressing the Shift Key and right clicking on the icon you used to start " + i.b + "\n\nAlternatively you can download the latest installer from:\n" + i.m + "\n\nWould you like to go to the download site now?";
              if (bV.ExceptionInVPackage(str1, this, true))
                aN.ExceptionInVPackage(i.m); 
            } 
            return true;
          } 
          try {
            b.ExceptionInVPackage().ExceptionInVPackage("Initializing downloads........");
            cO cO = new cO(this);
            a1.ExceptionInVPackage(cO);
            a1.ExceptionInVPackage(ArrayListInBvPackage);
            i.IOJMenu(i.y, "false");
            i.JDialogExtensionDispose();
            bool = true;
          } catch (IOException iOException) {
            String str = "Auto update is unable to upgrade " + i.b + "\nThis is usually due to ExceptionInVPackage lost connection to the internet or insufficient access \nto write to the installation directory.\n\nInternal Error:\n" + iOException.getMessage();
            bV.ArrayListInBvPackage(str, this);
            iOException.printStackTrace();
          } 
        } else {
          return true;
        } 
      } else if (ArrayListInBvPackage.ExceptionInVPackage() == 1) {
        k.ExceptionInVPackage(ArrayListInBvPackage.b(), this);
      } else if (ArrayListInBvPackage.ExceptionInVPackage() == 8) {
        JMenuItemExtensionInBaPackage(i.JMenuItemExtensionInBaPackage("registrationKeyV2", ""));
        i.IOJMenu("immutableInterpolation", "true");
      } else if (ArrayListInBvPackage.ExceptionInVPackage() == 4) {
        JMenuItemExtensionInBaPackage(i.JMenuItemExtensionInBaPackage("registrationKeyV2", ""));
        if (ArrayListInBvPackage.b() != null && !ArrayListInBvPackage.b().equals(""))
          k.ExceptionInVPackage(ArrayListInBvPackage.b(), this); 
        i.IOJMenu("quadraticInterpolation", "true");
        i.ArrayListInBvPackage("valid");
        i.JDialogExtensionDispose();
        try {
          z();
        } catch (ExceptionInVPackage a2) {
          Logger.getLogger(cd.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a2);
        } 
        System.exit(0);
      } 
      i.IOJMenu("lastUpdateCheckDate", "" + (new Date()).getTime());
      i.JDialogExtensionDispose();
    } else {
      System.out.println("No check, last update check=" + date1.toString());
    } 
    r = false;
    if (bool)
      try {
        String str1 = i.l;
        String str2 = i.k;
        String str3 = null;
        String str4 = "";
        if (this.ExceptionInVPackage.l() != null && !this.ExceptionInVPackage.l().equals(""))
          str4 = this.ExceptionInVPackage.l(); 
        if (k.ExceptionInVPackage()) {
          str3 = str2 + " \\\"" + str4 + "\\\"";
        } else {
          str3 = "java -jar " + str1 + " " + str4;
        } 
        Runtime.getRuntime().exec("java Staging \"" + str3 + "\"");
        l();
      } catch (Exception exception) {
        exception.printStackTrace();
      }  
    return false;
  }
  
  public void IOJMenu() {
    EventQueue.invokeLater(new cZ(this));
  }
  
  private void C() {
    if (!isVisible())
      setVisible(true); 
    int i = getExtendedState();
    i &= 0xFFFFFFFE;
    if (bV.ArrayListInBvPackage()) {
      setExtendedState(i);
      setAlwaysOnTop(true);
      toFront();
      requestFocus();
      setAlwaysOnTop(false);
    } else {
      setVisible(false);
      setVisible(true);
      setExtendedState(i);
    } 
  }
  
  private void D() {
    if (bV.ExceptionInVPackage(i.b + " " + X.b(i.IOJMenu, b.b, "") + " needs to restart for changes to take effect.\n\nWould you like to restart Now?", bq.ExceptionInVPackage().b(), true))
      b.ExceptionInVPackage().b(bq.ExceptionInVPackage().b()); 
  }
  
  private void E() {
    if (bV.ExceptionInVPackage("All " + i.b + " " + X.b(i.IOJMenu, b.b, "") + " features will be enabled after restarting.\n\nWould you like to restart Now?", bq.ExceptionInVPackage().b(), true))
      b.ExceptionInVPackage().b(bq.ExceptionInVPackage().b()); 
  }
  
  private void F() {
    if (cS.ExceptionInVPackage().ExceptionInVPackage(i.JMenuItemExtensionInBaPackage("registrationKeyV2", "")))
      i.IOJMenu("valid", "true"); 
  }
  
  private boolean G() {
    String str = i.JMenuItemExtensionInBaPackage("version", "");
    if (!i.ExceptionInVPackage.equals(str)) {
      i.IOJMenu("version", i.ExceptionInVPackage);
      return true;
    } 
    return H();
  }
  
  private boolean H() {
    String[] arrayOfString = (new File(".")).list();
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (arrayOfString[b].toLowerCase().endsWith(".zip"))
        return true; 
    } 
    return false;
  }
  
  private void I() {
    try {
      String str = i.JMenuItemExtensionInBaPackage("uid", "");
      if (!JDialogExtensionDispose(str)) {
        Date date = new Date();
        i.ArrayListInBvPackage("uid", J());
        i.ArrayListInBvPackage("installDate", "" + date.getTime());
        i.BiInterfaceHotel();
      } 
    } catch (Exception exception) {
      System.out.println("Failed to set uid");
      exception.printStackTrace();
    } 
  }
  
  private boolean JDialogExtensionDispose(String paramString) {
    try {
      long l = Long.parseLong(paramString);
      if (l == 0L)
        return false; 
    } catch (Exception exception) {
      return false;
    } 
    ArrayList<Character> arrayList = new ArrayList();
    Character character = null;
    byte b1 = 0;
    char[] arrayOfChar = paramString.toCharArray();
    int i = arrayOfChar.length;
    for (byte b2 = 0; b2 < i; b2++) {
      Character character1 = Character.valueOf(arrayOfChar[b2]);
      if (!arrayList.contains(character1))
        arrayList.add(character1); 
      if (character != null && character1.equals(character))
        b1++; 
      character = character1;
    } 
    return (!paramString.contains("234") && !paramString.contains("678") && arrayList.size() >= 4 && b1 < 4);
  }
  
  private String J() {
    String str = null;
    try {
      InetAddress inetAddress = InetAddress.getLocalHost();
      NetworkInterface networkInterface = NetworkInterface.getByInetAddress(inetAddress);
      int[] arrayOfInt = IOJMenu.b(networkInterface.getHardwareAddress());
      StringBuilder stringBuilder = new StringBuilder();
      for (int i = arrayOfInt.length - 1; i >= 0; i--) {
        stringBuilder.append(String.format("%03d", new Object[] { Integer.valueOf(arrayOfInt[i]) }));
      } 
      str = stringBuilder.toString();
    } catch (Exception exception) {}
    if (str == null || str.length() < 10)
      str = "964" + (long)(3.602879701896397E16D * Math.random()); 
    return str;
  }
  
  private void K() {
    i.IOJMenu("automaticUpdates", null);
    String str = i.ExceptionInVPackage("fieldMapping", "Auto");
    if (str.equals("FieldMaps/BigStuff.properties"))
      i.IOJMenu("fieldMapping", "Auto"); 
    i.IOJMenu("automaticUpdates", null);
    if (!i.JMenuItemExtensionInBaPackage("APPEND_FIELD_HP", "").trim().startsWith("[Field.TP]<"))
      i.IOJMenu("APPEND_FIELD_HP", ""); 
    if (i.JMenuItemExtensionInBaPackage("userParameter_Smoothing factor 1-10, higher makes smoother", "").equals(""))
      i.IOJMenu("userParameter_Smoothing factor 1-10, higher makes smoother", "4"); 
    if (i.JMenuItemExtensionInBaPackage("FIELD_MIN_MAX_TQ", "").equals("0;800"))
      i.IOJMenu("FIELD_MIN_MAX_TQ", ""); 
    if (i.JMenuItemExtensionInBaPackage("FIELD_MIN_MAX_HP", "").equals("0;800"))
      i.IOJMenu("FIELD_MIN_MAX_HP", ""); 
    if (i.JMenuItemExtensionInBaPackage()) {
      String str1 = i.JMenuItemExtensionInBaPackage("firstName", "");
      String str2 = i.JMenuItemExtensionInBaPackage("lastName", "");
      String str3 = i.JMenuItemExtensionInBaPackage("registrationKeyV2", "");
      String str4 = i.JMenuItemExtensionInBaPackage("userEmail", "");
      String str5 = i.JMenuItemExtensionInBaPackage("uid", "");
      String str6 = i.JMenuItemExtensionInBaPackage("installDate", "");
      i.ArrayListInBvPackage("firstName", str1);
      i.ArrayListInBvPackage("lastName", str2);
      i.ArrayListInBvPackage("registrationKeyV2", str3);
      i.ArrayListInBvPackage("userEmail", str4);
      i.ArrayListInBvPackage("uid", str5);
      i.ArrayListInBvPackage("installDate", str6);
      i.ArrayListInBvPackage("firstName");
      i.ArrayListInBvPackage("lastName");
      i.ArrayListInBvPackage("registrationKeyV2");
      i.ArrayListInBvPackage("userEmail");
      i.ArrayListInBvPackage("uid");
      i.ArrayListInBvPackage("installDate");
      try {
        i.BiInterfaceHotel();
        i.JDialogExtensionDispose();
      } catch (ExceptionInVPackage a1) {
        k.ExceptionInVPackage(a1.getMessage(), this.i);
      } 
    } 
    String[] arrayOfString = (new File(".")).list();
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (arrayOfString[b].toLowerCase().endsWith(".zip")) {
        System.out.println("Finishing installation, expanding: " + arrayOfString[b]);
        File file = new File(arrayOfString[b]);
        try {
          if (ae.ExceptionInVPackage(arrayOfString[b], X.b(arrayOfString[b], ".zip", ""), null).equals(ae.ExceptionInVPackage))
            (new File(arrayOfString[b])).delete(); 
        } catch (ZipException zipException) {
          zipException.printStackTrace();
        } catch (IOException iOException) {
          iOException.printStackTrace();
        } 
      } 
    } 
  }
  
  private JMenuBar L() {
    JMenuBar jMenuBar = new JMenuBar();
    ExceptionInVPackage(jMenuBar);
    return jMenuBar;
  }
  
  private JMenuBar ExceptionInVPackage(JMenuBar paramJMenuBar) {
    ee ee = new ee(this, "File");
    ee.setMnemonic('F');
    paramJMenuBar.add(ee);
    JMenuItem jMenuItem1 = new JMenuItem("Open");
    jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(79, 128));
    jMenuItem1.addActionListener(new di(this));
    ee.add(jMenuItem1);
    if (b.ExceptionInVPackage().ExceptionInVPackage("spoji[asfi2309jdi234iofwae2344")) {
      JMenuItemExtensionInBaPackage JMenuItemExtensionInBaPackage = new JMenuItemExtensionInBaPackage("Open File on TS-Dash", true);
      JMenuItemExtensionInBaPackage.setAccelerator(KeyStroke.getKeyStroke(67, 128));
      JMenuItemExtensionInBaPackage.addActionListener(new dt(this));
      JMenuItemExtensionInBaPackage.ExceptionInVPackage(new dE(this));
      ee.add((JMenuItem)JMenuItemExtensionInBaPackage);
    } 
    if (b.ExceptionInVPackage().ExceptionInVPackage("compareMode")) {
      JMenuItemExtensionInBaPackage JMenuItemExtensionInBaPackage = new JMenuItemExtensionInBaPackage("Compare to", true);
      JMenuItemExtensionInBaPackage.setAccelerator(KeyStroke.getKeyStroke(67, 128));
      JMenuItemExtensionInBaPackage.addActionListener(new dP(this));
      JMenuItemExtensionInBaPackage.ExceptionInVPackage(new cf(this));
      ee.add((JMenuItem)JMenuItemExtensionInBaPackage);
      JMenuItem jMenuItem = new JMenuItem("Trail Live File");
      jMenuItem.setAccelerator(KeyStroke.getKeyStroke(84, 128));
      jMenuItem.addActionListener(new cj(this));
      ee.add(jMenuItem);
      ej ej = new ej(this);
      ee.add((JMenuItem)ej);
    } 
    boolean bool1 = b.ExceptionInVPackage().ExceptionInVPackage("fileEditing");
    JMenuItem jMenuItem2 = new JMenuItem("Export Loaded Log As");
    jMenuItem2.setAccelerator(KeyStroke.getKeyStroke(69, 2));
    jMenuItem2.addActionListener(new ck(this));
    jMenuItem2.setEnabled(bool1);
    ee.add(jMenuItem2);
    JPopupMenu.Separator separator = new JPopupMenu.Separator();
    ee.add(separator);
    ee.add(U());
    ee.addSeparator();
    boolean bool2 = b.ExceptionInVPackage().ExceptionInVPackage("optionalFields");
    JMenu jMenu1 = O();
    jMenu1.setEnabled(bool2);
    ee.add(jMenu1);
    if (b.ExceptionInVPackage().ExceptionInVPackage("fa-9fdspoijoijnfdz09jfdsa098j"))
      ee.add(P()); 
    ee.addSeparator();
    JMenuItem jMenuItem3 = new JMenuItem("Save Graph as PNG or Jpeg");
    jMenuItem3.addActionListener(new cl(this));
    ee.add(jMenuItem3);
    ee.addSeparator();
    JMenuItem jMenuItem4 = new JMenuItem("Exit");
    jMenuItem4.addActionListener(new cm(this));
    ee.add(jMenuItem4);
    paramJMenuBar.add(N());
    JMenu jMenu2 = R();
    jMenu2.setMnemonic('V');
    paramJMenuBar.add(jMenu2);
    JMenu jMenu3 = S();
    jMenu3.setMnemonic('O');
    paramJMenuBar.add(jMenu3);
    JMenu jMenu4 = Q();
    jMenu4.setMnemonic('C');
    paramJMenuBar.add(jMenu4);
    JMenu jMenu5 = M();
    jMenu5.setMnemonic('L');
    paramJMenuBar.add(jMenu5);
    b(paramJMenuBar);
    return paramJMenuBar;
  }
  
  private JMenu M() {
    ee ee = new ee(this, "Log Info");
    JMenuItemExtensionInBaPackage JMenuItemExtensionInBaPackage = new JMenuItemExtensionInBaPackage("View Log Header", true);
    JMenuItemExtensionInBaPackage.ExceptionInVPackage(new cn(this));
    JMenuItemExtensionInBaPackage.addActionListener(new co(this));
    ee.add((JMenuItem)JMenuItemExtensionInBaPackage);
    if (b.ExceptionInVPackage().ExceptionInVPackage("timeslipData")) {
      ee ee1 = new ee(this, "Drag Timeslip Preferences");
      JMenuItemExtensionInBaPackage e1 = new JMenuItemExtensionInBaPackage("View / Edit Timeslip", true);
      e1.ExceptionInVPackage(new cp(this));
      e1.addActionListener(new cq(this));
      ee.add((JMenuItem)e1);
      JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem("Show Time Slips");
      jCheckBoxMenuItem1.setState(i.ExceptionInVPackage(i.aB, i.aC));
      jCheckBoxMenuItem1.setToolTipText("<html>When checked, key Timeslip event data<br>will displayed on graph as yellow vertical bars.");
      jCheckBoxMenuItem1.addActionListener(new cr(this));
      ee1.add(jCheckBoxMenuItem1);
      JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem("Generate Time Slips");
      jCheckBoxMenuItem2.setState(i.ExceptionInVPackage(i.az, i.aA));
      jCheckBoxMenuItem2.setToolTipText("<html>When checked, Timeslip data will be generated from the<br>launch condition if no time slip data has been entered.");
      jCheckBoxMenuItem2.addActionListener(new ct(this));
      ee1.add(jCheckBoxMenuItem2);
      JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem("Jump to Launch");
      jCheckBoxMenuItem3.setState(i.ExceptionInVPackage(i.ax, i.ay));
      jCheckBoxMenuItem3.setToolTipText("<html>When checked, upon opening ExceptionInVPackage log file the cursor<br>will jump to the launch point of the log.");
      jCheckBoxMenuItem3.addActionListener(new cu(this));
      ee1.add(jCheckBoxMenuItem3);
      ee.add(ee1);
    } 
    return ee;
  }
  
  private JMenu N() {
    ee ee = new ee(this, "Search");
    ee.setMnemonic('S');
    if (b.ExceptionInVPackage().ExceptionInVPackage("searchLogFiles")) {
      ee.addMenuListener(new cv(this));
    } else {
      ee.add("Enable Search").addActionListener(new cw(this));
    } 
    return ee;
  }
  
  private JMenu O() {
    JMenu jMenu = new JMenu("Settings import / export");
    JMenuItem jMenuItem1 = new JMenuItem("Export Settings to file");
    jMenuItem1.addActionListener(new cx(this));
    jMenu.add(jMenuItem1);
    JMenuItem jMenuItem2 = new JMenuItem("Import Settings file");
    jMenuItem2.addActionListener(new cy(this));
    jMenu.add(jMenuItem2);
    return jMenu;
  }
  
  private JMenu P() {
    if (b.ExceptionInVPackage().ExceptionInVPackage("fa-9fdspoijoijnfdz09jfdsa098j")) {
      JMenu jMenu1 = new JMenu("Settings Profiles");
      IOJMenu.ExceptionInVPackage().ExceptionInVPackage(jMenu1);
      JMenuItem jMenuItem = new JMenuItem("New Setting Profile");
      jMenuItem.addActionListener(new cz(this));
      jMenu1.add(jMenuItem);
      String str = IOJMenu.ExceptionInVPackage().ArrayListInBvPackage();
      if (!str.equals("")) {
        JMenuItem jMenuItem1 = new JMenuItem("Update Setting Profile: " + str);
        jMenuItem1.addActionListener(new cA(this));
        jMenu1.add(jMenuItem1);
      } 
      String[] arrayOfString = ExceptionInVPackage.ExceptionInVPackage();
      arrayOfString = S.ExceptionInVPackage(arrayOfString);
      JMenu jMenu2 = new JMenu("Delete Profile");
      jMenu1.add(jMenu2);
      cB cB = new cB(this, jMenu2);
      for (String str1 : arrayOfString) {
        JMenuItem jMenuItem1 = new JMenuItem(str1);
        jMenu2.add(jMenuItem1);
        jMenuItem1.setActionCommand(str1);
        jMenuItem1.addActionListener(cB);
      } 
      cC cC = new cC(this);
      jMenu1.addSeparator();
      ButtonGroup buttonGroup = new ButtonGroup();
      IOJMenu.ExceptionInVPackage().ExceptionInVPackage(buttonGroup);
      for (String str1 : arrayOfString) {
        JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str1, str1.equals(str));
        jMenu1.add(jCheckBoxMenuItem);
        jCheckBoxMenuItem.setActionCommand(str1);
        jCheckBoxMenuItem.addActionListener(cC);
        buttonGroup.add(jCheckBoxMenuItem);
      } 
      return jMenu1;
    } 
    return null;
  }
  
  private void b(JMenuBar paramJMenuBar) {
    JMenu jMenu = new JMenu("Help");
    jMenu.setMnemonic('H');
    paramJMenuBar.add(jMenu);
    JMenuItem jMenuItem1 = new JMenuItem("Hot Keys");
    jMenuItem1.addActionListener(new cE(this));
    jMenu.add(jMenuItem1);
    JMenuItem jMenuItem2 = new JMenuItem("Help Topics");
    jMenuItem2.addActionListener(new cF(this));
    jMenu.add(jMenuItem2);
    if (b.ExceptionInVPackage().ExceptionInVPackage("tuningPanelVisible")) {
      jMenuItem2 = new JMenuItem("VE Analyze");
      jMenuItem2.addActionListener(new cG(this));
      jMenu.add(jMenuItem2);
    } 
    jMenuItem2 = new JMenuItem("Online Help");
    jMenuItem2.addActionListener(new cH(this));
    jMenu.add(jMenuItem2);
    jMenu.addSeparator();
    if (!this.s)
      i.IOJMenu("automaticUpdates", "true"); 
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Automatic Update Check", i.ExceptionInVPackage("automaticUpdates", true));
    jCheckBoxMenuItem.setEnabled(i.ExceptionInVPackage("valid", false));
    jCheckBoxMenuItem.addItemListener(new cI(this));
    if (!this.s)
      jCheckBoxMenuItem.setEnabled(false); 
    jMenu.add(jCheckBoxMenuItem);
    JMenuItem jMenuItem3 = new JMenuItem("Check for Updates Now");
    jMenuItem3.addActionListener(new cJ(this));
    jMenu.add(jMenuItem3);
    jMenu.addSeparator();
    if (!b.ExceptionInVPackage().ExceptionInVPackage("hideRegisterMenu") && !this.s) {
      JMenuItem jMenuItem6 = new JMenuItem("Purchase Registration");
      jMenuItem6.addActionListener(new cK(this));
      jMenu.add(jMenuItem6);
      JMenuItem jMenuItem7 = new JMenuItem("Enter Registration");
      jMenuItem7.addActionListener(new cL(this));
      jMenu.add(jMenuItem7);
      jMenu.addSeparator();
    } 
    if (J.ExceptionInVPackage()) {
      JMenu jMenu1 = new JMenu("Video driver work arounds");
      ButtonGroup buttonGroup = new ButtonGroup();
      JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem("Force OpenGL Active");
      jCheckBoxMenuItem1.addActionListener(new cM(this));
      boolean bool1 = i.ExceptionInVPackage("forceOpenGL", false);
      jCheckBoxMenuItem1.setState(bool1);
      jCheckBoxMenuItem1.setToolTipText("When on will force the use of OpenGL for rendering over the default Direct X normally used on Windows.");
      jMenu1.add(jCheckBoxMenuItem1);
      buttonGroup.add(jCheckBoxMenuItem1);
      JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem("Disable Direct 3D");
      jCheckBoxMenuItem2.addActionListener(new cN(this));
      boolean bool2 = i.ExceptionInVPackage("disableD3d", true);
      jCheckBoxMenuItem2.setState(bool2);
      jMenu1.add(jCheckBoxMenuItem2);
      buttonGroup.add(jCheckBoxMenuItem2);
      JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem("Java Default (D3D On)");
      jCheckBoxMenuItem3.addActionListener(new cP(this));
      boolean bool = (!bool2 && !bool1) ? true : false;
      jCheckBoxMenuItem3.setState(bool);
      jMenu1.add(jCheckBoxMenuItem3);
      buttonGroup.add(jCheckBoxMenuItem3);
      jMenu.add(jMenu1);
    } 
    if (!b.ExceptionInVPackage().ExceptionInVPackage("hideTunerStudioPromo") && i.b.equals("MegaLogViewer")) {
      jMenuItem2 = new JMenuItem("Learn About TunerStudio");
      jMenuItem2.addActionListener(new cQ(this));
      jMenu.add(jMenuItem2);
      jMenu.addSeparator();
    } 
    JMenuItem jMenuItem4 = new JMenuItem("Create Support Debug Package");
    jMenuItem4.addActionListener(new cR(this));
    jMenu.add(jMenuItem4);
    JMenuItem jMenuItem5 = new JMenuItem("About");
    jMenuItem5.setAccelerator(KeyStroke.getKeyStroke(65, 128));
    jMenuItem5.addActionListener(new cS(this));
    jMenu.add(jMenuItem5);
  }
  
  public void ArrayListInBvPackage() {
    cT cT = new cT(this);
    cT.start();
  }
  
  public void JMenuItemExtensionInBaPackage() {
    String[] arrayOfString = { "settings" };
    String str1 = k.ExceptionInVPackage(this, "Import Settings", arrayOfString, "*.settings");
    if (str1 == null || str1.equals(""))
      return; 
    File file = new File(str1);
    Properties properties = new Properties();
    try {
      FileInputStream fileInputStream = new FileInputStream(str1);
      properties.load(fileInputStream);
      fileInputStream.close();
    } catch (Exception exception) {
      k.ExceptionInVPackage("Unable to open settings file " + str1 + "\nSee log for more detail.", this);
      exception.printStackTrace();
    } 
    ha ha = new ha();
    String str2 = file.getName();
    if (str2.contains("."))
      str2 = str2.substring(0, str2.lastIndexOf(".")); 
    ha.ExceptionInVPackage(str2);
    ha.ExceptionInVPackage(this);
    if (ha.IOJMenu())
      return; 
    if (ha.b()) {
      IOJMenu.ExceptionInVPackage().ExceptionInVPackage(ha.ExceptionInVPackage(), file);
    } else {
      ArrayList<bB> arrayList = new ArrayList();
      if (ExceptionInVPackage(properties, "ROOT_FIELD_")) {
        bB bB = new bB("ROOT_FIELD_", "Normalized Field Name Mapping");
        bB.ExceptionInVPackage("Import Field Name Mappings in this settings file.");
        arrayList.add(bB);
      } 
      if (ExceptionInVPackage(properties, "USER_FIELD_")) {
        bB bB = new bB("USER_FIELD_", "User Calculated Math Fields");
        bB.ExceptionInVPackage("Import custom created Calculated Fields in this settings file.");
        arrayList.add(bB);
      } 
      if (ExceptionInVPackage(properties, "APPEND_FIELD_")) {
        bB bB = new bB("APPEND_FIELD_", "Active Optional and Calculated Fields");
        bB.ExceptionInVPackage("Imports which Optional and Calculated Fields are active.");
        arrayList.add(bB);
      } 
      if (ExceptionInVPackage(properties, "FIELD_GROUP_NAME_")) {
        bB bB = new bB("FIELD_GROUP_NAME_", "Quick View Tabs");
        bB.ExceptionInVPackage("All Quick View tabs on this PC");
        bB.b("FIELD_SELECTED_GROUP_");
        arrayList.add(bB);
      } 
      if (ExceptionInVPackage(properties, "FIELD_MIN_MAX_")) {
        bB bB = new bB("FIELD_MIN_MAX_", "Field Min/Max Settings");
        bB.ExceptionInVPackage("Import set Min & Max values and autoscale settings.");
        arrayList.add(bB);
      } 
      if (b.ExceptionInVPackage().ExceptionInVPackage("tableGenerator") && ExceptionInVPackage(properties, "TABLE_GEN_VIEW_")) {
        bB bB = new bB("TABLE_GEN_VIEW_", "Histogram views");
        bB.ExceptionInVPackage("Import Histogram / Table Generator views.");
        arrayList.add(bB);
      } 
      if (b.ExceptionInVPackage().ExceptionInVPackage("scatterPlots") && ExceptionInVPackage(properties, "SCATTER_PLOT_VIEW_")) {
        bB bB = new bB("SCATTER_PLOT_VIEW_", "Scatter Plot Views");
        bB.ExceptionInVPackage("Import Scatter Plot views.");
        arrayList.add(bB);
      } 
      if (b.ExceptionInVPackage().ExceptionInVPackage("fieldSmoothing") && ExceptionInVPackage(properties, "fieldSmoothingFactor_")) {
        bB bB = new bB("fieldSmoothingFactor_", "Field Smoothing");
        bB.ExceptionInVPackage("Export Smoothing factor for each field it has been set on.");
        arrayList.add(bB);
      } 
      if (ExceptionInVPackage(properties, i.S)) {
        bB bB = new bB(i.S, "Viewing preferences");
        bB.b("numberOfGraphs");
        bB.b("numberOfOverlays");
        bB.b("numberOfOverlayGraphs");
        bB.ExceptionInVPackage("Import number of graphs, traces per graph, Trace Value Position, etc.");
        arrayList.add(bB);
      } 
      if (ExceptionInVPackage(properties, "DATA_FILTER_")) {
        bB bB = new bB("DATA_FILTER_", "Data Filters");
        bB.ExceptionInVPackage("Import data filters defined for Histograms and Scatter Plots.");
        arrayList.add(bB);
      } 
      if (arrayList.isEmpty()) {
        bV.ArrayListInBvPackage("There are no settings in this file to import.", this);
        return;
      } 
      by by = new by(arrayList, false);
      by.ExceptionInVPackage(this);
      List list = by.b();
      if (list.isEmpty())
        return; 
      if (!by.ExceptionInVPackage()) {
        int i = JOptionPane.showConfirmDialog(this, "Warning!!!!\nAny formulas or settings of the same name will be overridden\n\nContinue?");
        if (i != 0)
          return; 
      } else {
        for (String str : i.JMenuItemExtensionInBaPackage.stringPropertyNames()) {
          if (ExceptionInVPackage(str, list))
            i.ArrayListInBvPackage(str); 
        } 
      } 
      for (String str : properties.keySet()) {
        if (ExceptionInVPackage(str, list)) {
          String str3 = properties.getProperty(str);
          i.JMenuItemExtensionInBaPackage.setProperty(str, str3);
        } 
      } 
      k.ExceptionInVPackage("The Application will now restart for changes to take effect.", bq.ExceptionInVPackage().b());
      b.ExceptionInVPackage().b(bq.ExceptionInVPackage().b());
    } 
  }
  
  private boolean ExceptionInVPackage(Properties paramProperties, String paramString) {
    for (String str : paramProperties.stringPropertyNames()) {
      if (str.startsWith(paramString))
        return true; 
    } 
    return false;
  }
  
  public void JPanelExtensionInAiPackage() {
    ArrayList<bB> arrayList = new ArrayList();
    bB bB = new bB("ROOT_FIELD_", "Normalized Field Name Mapping");
    bB.ExceptionInVPackage("Export Field Name Mappings in the currently active Settings Profile.");
    arrayList.add(bB);
    bB = new bB("USER_FIELD_", "User Calculated Math Fields");
    bB.ExceptionInVPackage("Your custom created Calculated Fields");
    arrayList.add(bB);
    bB = new bB("APPEND_FIELD_", "Active Optional and Calculated Fields");
    bB.ExceptionInVPackage("Exports which Optional and Calculated Fields are active.");
    arrayList.add(bB);
    bB = new bB("FIELD_GROUP_NAME_", "Quick View Tabs");
    bB.ExceptionInVPackage("All Quick View tabs on this PC");
    bB.b("FIELD_SELECTED_GROUP_");
    arrayList.add(bB);
    bB = new bB("FIELD_MIN_MAX_", "Field Min/Max Settings");
    bB.ExceptionInVPackage("Export set Min & Max values and autoscale settings.");
    arrayList.add(bB);
    bB = new bB(i.S, "Viewing preferences");
    bB.b("numberOfGraphs");
    bB.b("numberOfOverlays");
    bB.b("numberOfOverlayGraphs");
    bB.ExceptionInVPackage("Export number of graphs, traces per graph, Trace Value Position, etc.");
    arrayList.add(bB);
    if (b.ExceptionInVPackage().ExceptionInVPackage("tableGenerator")) {
      bB = new bB("TABLE_GEN_VIEW_", "Histogram Views");
      bB.ExceptionInVPackage("Export Histogram / Table Generator views.");
      arrayList.add(bB);
    } 
    if (b.ExceptionInVPackage().ExceptionInVPackage("scatterPlots")) {
      bB = new bB("SCATTER_PLOT_VIEW_", "Scatter Plot Views");
      bB.ExceptionInVPackage("Export Scatter Plot views.");
      arrayList.add(bB);
    } 
    if (b.ExceptionInVPackage().ExceptionInVPackage("fieldSmoothing")) {
      bB = new bB("fieldSmoothingFactor_", "Field Smoothing");
      bB.ExceptionInVPackage("Export Smoothing factor for each field it has been set on.");
      arrayList.add(bB);
    } 
    if (b.ExceptionInVPackage().ExceptionInVPackage("scatterPlots")) {
      bB = new bB("DATA_FILTER_", "Data Filters");
      bB.ExceptionInVPackage("Export data filters defined for Histograms and Scatter Plots.");
      arrayList.add(bB);
    } 
    by by = new by(arrayList, true);
    by.ExceptionInVPackage(this);
    List list = by.b();
    if (list.isEmpty())
      return; 
    this.ExceptionInVPackage.i();
    String[] arrayOfString = { "settings" };
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String str1 = simpleDateFormat.format(new Date());
    String str2 = k.ExceptionInVPackage(this, "Export Settings", arrayOfString, "MLV" + i.IOJMenu + "_" + str1 + ".settings");
    if (str2 == null || str2.equals(""))
      return; 
    if (!str2.toLowerCase().endsWith("settings"))
      str2 = str2 + ".settings"; 
    Properties properties = new Properties();
    for (String str : i.JMenuItemExtensionInBaPackage.keySet()) {
      if (ExceptionInVPackage(str, list)) {
        String str3 = i.JMenuItemExtensionInBaPackage.getProperty(str);
        properties.setProperty(str, str3);
      } 
    } 
    File file = new File(str2);
    if (file.exists() && !bV.ExceptionInVPackage("The file " + file.getName() + " already exists.\n\nOverwrite?", this, true))
      return; 
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      properties.store(fileOutputStream, "MegaLogViewer Settings");
      fileOutputStream.close();
    } catch (Exception exception) {
      k.ExceptionInVPackage("Unable to save settings to " + str2 + "\nSee log for more detail.", this);
      exception.printStackTrace();
    } 
  }
  
  private boolean ExceptionInVPackage(String paramString, List paramList) {
    for (String str : paramList) {
      if (paramString.startsWith(str))
        return true; 
    } 
    return false;
  }
  
  public void JDialogExtensionDispose() {
    k.ExceptionInVPackage("No Updates Available, " + i.ExceptionInVPackage + " is the latest version.", this.i);
  }
  
  public void ExceptionInVPackage(JCheckBoxMenuItem paramJCheckBoxMenuItem) {
    i.IOJMenu("automaticUpdates", "" + paramJCheckBoxMenuItem.getState());
  }
  
  public void IOJMenu(double paramDouble) {
    String str = paramDouble + "";
    for (byte b = 0; b < this.JPanelExtensionInAiPackage.getItemCount(); b++) {
      JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)this.JPanelExtensionInAiPackage.getItem(b);
      ItemListener[] arrayOfItemListener = jCheckBoxMenuItem.getItemListeners();
      byte b1;
      for (b1 = 0; b1 < arrayOfItemListener.length; b1++)
        jCheckBoxMenuItem.removeItemListener(arrayOfItemListener[b1]); 
      jCheckBoxMenuItem.setState(jCheckBoxMenuItem.getName().equals(str));
      for (b1 = 0; b1 < arrayOfItemListener.length; b1++)
        jCheckBoxMenuItem.addItemListener(arrayOfItemListener[b1]); 
    } 
  }
  
  public void ExceptionInVPackage(boolean paramBoolean) {
    i.IOJMenu("showGraphHalfMark", paramBoolean + "");
    this.ExceptionInVPackage.ThreadedInAzPackage();
  }
  
  public void b(boolean paramBoolean) {
    this.ExceptionInVPackage.ArrayListInBvPackage(paramBoolean);
    i.IOJMenu("showGauges", paramBoolean + "");
  }
  
  public void IOJMenu(boolean paramBoolean) {
    this.ExceptionInVPackage.n().IOJMenu(paramBoolean);
    this.ExceptionInVPackage.AzInterfaceTango();
    i.IOJMenu("showDashboard", paramBoolean + "");
  }
  
  public void ArrayListInBvPackage(boolean paramBoolean) {
    this.ExceptionInVPackage.n().ExceptionInVPackage(paramBoolean);
    i.IOJMenu("hideSelector", paramBoolean + "");
  }
  
  private JMenu Q() {
    boolean bool1 = b.ExceptionInVPackage().ExceptionInVPackage("optionalFields");
    String[] arrayOfString1 = i.JMenuItemExtensionInBaPackage("FORMULA_GROUP_");
    for (byte b1 = 0; b1 < arrayOfString1.length; b1++) {
      String str = k.ExceptionInVPackage(arrayOfString1[b1], "FORMULA_GROUP_", "");
      JMenu jMenu = b(str, "APPEND_FIELD_");
      jMenu.setText(i.b(arrayOfString1[b1]));
      jMenu.setEnabled(b.ExceptionInVPackage().b(str));
      this.y.add(jMenu);
    } 
    this.y.addSeparator();
    String[] arrayOfString2 = i.JDialogExtensionDispose("APPEND_FIELD_");
    arrayOfString2 = k.b(arrayOfString2);
    byte b2 = 25;
    byte b3 = 1;
    this.BiInterfaceHotel = new JMenu("Optional Fields");
    this.y.add(this.BiInterfaceHotel);
    if (!bool1) {
      JMenuItem jMenuItem = new JMenuItem("Enable Optional Fields!");
      jMenuItem.addActionListener(new cU(this));
      this.BiInterfaceHotel.add(jMenuItem);
    } 
    ArrayList<JCheckBoxMenuItem> arrayList = new ArrayList();
    for (byte b4 = 0; b4 < arrayOfString2.length; b4++) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(k.ExceptionInVPackage(arrayOfString2[b4], "APPEND_FIELD_", ""));
      jCheckBoxMenuItem.setEnabled(bool1);
      String str = i.IOJMenu(arrayOfString2[b4]);
      jCheckBoxMenuItem.setActionCommand(str);
      jCheckBoxMenuItem.setName(arrayOfString2[b4]);
      arrayList.add(jCheckBoxMenuItem);
      jCheckBoxMenuItem.setState(!i.JMenuItemExtensionInBaPackage(arrayOfString2[b4], "").equals(""));
      jCheckBoxMenuItem.addItemListener(new cV(this));
      this.BiInterfaceHotel.add(jCheckBoxMenuItem);
      if (b4 > 0 && b4 % b2 == 0 && b4 < arrayOfString2.length - 1) {
        this.BiInterfaceHotel = new JMenu("Optional Fields " + ++b3);
        this.y.add(this.BiInterfaceHotel);
      } 
    } 
    cW cW = new cW(this, arrayList);
    cW.start();
    this.y.addSeparator();
    boolean bool2 = b.ExceptionInVPackage().ExceptionInVPackage("customFields");
    this.JDialogExtensionDispose = new JMenu("Custom Fields");
    b3 = 1;
    if (!bool2) {
      JMenuItem jMenuItem = new JMenuItem("Enable Custom Fields!");
      jMenuItem.addActionListener(new cX(this));
      this.JDialogExtensionDispose.add(jMenuItem);
    } 
    this.y.add(this.JDialogExtensionDispose);
    JMenuItem jMenuItem1 = new JMenuItem("Add Custom Field");
    jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(78, 3));
    jMenuItem1.addActionListener(new cY(this));
    jMenuItem1.setEnabled(bool2);
    this.JDialogExtensionDispose.add(jMenuItem1);
    this.JDialogExtensionDispose.addSeparator();
    String[] arrayOfString3 = i.JPanelExtensionInAiPackage("USER_FIELD_");
    arrayOfString3 = k.ExceptionInVPackage(arrayOfString3);
    for (byte b5 = 0; b5 < arrayOfString3.length; b5++) {
      String str = k.ExceptionInVPackage(arrayOfString3[b5], "USER_FIELD_", "");
      ExceptionInVPackage(b(str, i.JMenuItemExtensionInBaPackage(arrayOfString3[b5], ""), !i.JMenuItemExtensionInBaPackage("APPEND_FIELD_" + str, "").equals("")));
    } 
    this.y.addSeparator();
    JMenuItem jMenuItem2 = new JMenuItem("Data Filter Editor");
    jMenuItem2.setEnabled(bool2);
    this.y.add(jMenuItem2);
    jMenuItem2.addActionListener(new da(this));
    this.y.addSeparator();
    JMenuItem jMenuItem3 = new JMenuItem("Field Properties Editor");
    jMenuItem3.addActionListener(new db(this));
    this.y.add(jMenuItem3);
    return this.y;
  }
  
  public void ExceptionInVPackage(String paramString1, String paramString2) {
    r r = new r(this, paramString1, paramString2);
    boolean bool = r.ExceptionInVPackage();
    if (bool) {
      paramString1 = r.b();
      paramString2 = r.IOJMenu();
      JMenu jMenu = b(paramString1, paramString2, true);
      if (!ExceptionInVPackage(paramString1, jMenu))
        ExceptionInVPackage(jMenu); 
      IOJMenu("APPEND_FIELD_" + paramString1, paramString2, true);
      i.IOJMenu("USER_FIELD_" + paramString1, r.IOJMenu());
    } 
  }
  
  private JMenu b(String paramString1, String paramString2, boolean paramBoolean) {
    JMenu jMenu = new JMenu(paramString1);
    jMenu.setName(paramString1);
    Map<TextAttribute, ?> map = jMenu.getFont().getAttributes();
    map.put(TextAttribute.STRIKETHROUGH, Boolean.valueOf(!paramBoolean));
    jMenu.setFont(new Font((Map)map));
    jMenu.add(new JMenuItem("Formula = " + paramString2));
    jMenu.add(new JSeparator());
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Enabled");
    String str1 = "USER_FIELD_" + paramString1;
    String str2 = "APPEND_FIELD_" + paramString1;
    jCheckBoxMenuItem.setActionCommand(paramString2);
    jCheckBoxMenuItem.setName(str2);
    jCheckBoxMenuItem.setState(paramBoolean);
    jCheckBoxMenuItem.addItemListener(new dc(this, jMenu));
    jMenu.add(jCheckBoxMenuItem);
    JMenuItem jMenuItem1 = new JMenuItem("Edit");
    jMenuItem1.setActionCommand(paramString2);
    jMenuItem1.setName(paramString1);
    jMenuItem1.addActionListener(new dd(this));
    jMenu.add(jMenuItem1);
    JMenuItem jMenuItem2 = new JMenuItem("Delete");
    jMenuItem2.setActionCommand(paramString1);
    jMenuItem2.addActionListener(new de(this));
    jMenu.add(jMenuItem2);
    return jMenu;
  }
  
  private void ExceptionInVPackage(JMenu paramJMenu) {
    byte b = 25;
    if ((this.z == 1 && this.JDialogExtensionDispose.getMenuComponentCount() == b + 2) || (this.z > 1 && this.JDialogExtensionDispose.getMenuComponentCount() == b)) {
      this.JDialogExtensionDispose = new JMenu("Custom Fields " + ++this.z);
      this.y.add(this.JDialogExtensionDispose);
    } 
    this.JDialogExtensionDispose.add(paramJMenu);
  }
  
  private boolean ExceptionInVPackage(String paramString, JMenu paramJMenu) {
    i.ArrayListInBvPackage("USER_FIELD_" + paramString);
    i.ArrayListInBvPackage("APPEND_FIELD_" + paramString);
    for (byte b = 0; b < this.y.getItemCount(); b++) {
      JMenuItem jMenuItem = this.y.getItem(b);
      if (jMenuItem instanceof JMenu && jMenuItem.getText() != null && jMenuItem.getText().startsWith("Custom Fields")) {
        JMenu jMenu = (JMenu)this.y.getItem(b);
        for (byte b1 = 0; b1 < jMenu.getItemCount(); b1++) {
          if (jMenu.getItem(b1) instanceof JMenu) {
            JMenu jMenu1 = (JMenu)jMenu.getItem(b1);
            if (jMenu1.getName() != null && jMenu1.getName().equals(paramString)) {
              jMenu.remove(b1);
              if (paramJMenu != null)
                jMenu.add(paramJMenu, b1); 
              return true;
            } 
          } 
        } 
      } 
    } 
    return false;
  }
  
  private JMenu b(String paramString1, String paramString2) {
    String[] arrayOfString1 = k.ExceptionInVPackage(i.ExceptionInVPackage(paramString1 + "_OPTIONS", ""), ";");
    String[] arrayOfString2 = k.ExceptionInVPackage(i.ExceptionInVPackage(paramString1 + "_SOLUTIONS", ""), ";");
    JMenu jMenu = new JMenu(paramString1);
    i i = new i();
    for (byte b = 0; b < arrayOfString1.length; b++) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(X.b(arrayOfString1[b], "<semi>", ";"));
      i.ExceptionInVPackage(jCheckBoxMenuItem);
      if (i.IOJMenu("DEFAULT_" + paramString2 + paramString1) != null && i.IOJMenu("DEFAULT_" + paramString2 + paramString1).equals(arrayOfString2[b]))
        jCheckBoxMenuItem.setText(arrayOfString1[b] + " (Default)"); 
      jCheckBoxMenuItem.setName(X.b(arrayOfString2[b], "<semi>", ";"));
      jCheckBoxMenuItem.setActionCommand(paramString2 + paramString1);
      if (i.ExceptionInVPackage(paramString2 + paramString1, i.IOJMenu("DEFAULT_" + paramString2 + paramString1)).equals(arrayOfString2[b]) || (i.b == null && b == arrayOfString1.length - 1 && arrayOfString2[b].indexOf("{") != -1)) {
        jCheckBoxMenuItem.setState(true);
        i.b = jCheckBoxMenuItem;
      } else {
        jCheckBoxMenuItem.setState(false);
      } 
      jCheckBoxMenuItem.addItemListener(new df(this));
      jMenu.add(jCheckBoxMenuItem);
    } 
    if (i.IOJMenu("DEFAULT_" + paramString2 + paramString1) != null && !i.IOJMenu("DEFAULT_" + paramString2 + paramString1).equals("")) {
      jMenu.addSeparator();
      JMenuItem jMenuItem = new JMenuItem("Reset to Default");
      jMenuItem.setActionCommand(paramString2 + paramString1);
      jMenuItem.addActionListener(new dg(this));
      jMenu.add(jMenuItem);
    } 
    return jMenu;
  }
  
  private JMenu R() {
    ee ee = new ee(this, "View");
    JMenu jMenu1 = new JMenu("Graphing View Layout");
    i i = new i();
    String str1 = i.ExceptionInVPackage(i.N, i.R);
    JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem("2 Table View (Default)", i.Q.equals(str1));
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/layout2Tables.png"));
    ImageIcon imageIcon = new ImageIcon(image);
    jCheckBoxMenuItem1.setIcon(imageIcon);
    jCheckBoxMenuItem1.addItemListener(new dh(this));
    i.ExceptionInVPackage(jCheckBoxMenuItem1);
    jCheckBoxMenuItem1.setEnabled(b.ExceptionInVPackage().ExceptionInVPackage("optionalTableLayouts"));
    jMenu1.add(jCheckBoxMenuItem1);
    jCheckBoxMenuItem1 = new JCheckBoxMenuItem("1 Table View", i.P.equals(str1));
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/layout1Table.png"));
    imageIcon = new ImageIcon(image);
    jCheckBoxMenuItem1.setIcon(imageIcon);
    jCheckBoxMenuItem1.addItemListener(new dj(this));
    i.ExceptionInVPackage(jCheckBoxMenuItem1);
    jCheckBoxMenuItem1.setEnabled(b.ExceptionInVPackage().ExceptionInVPackage("optionalTableLayouts"));
    jMenu1.add(jCheckBoxMenuItem1);
    ee.add(jMenu1);
    if (b.ExceptionInVPackage().ExceptionInVPackage("selectableLookAndFeel")) {
      JMenu jMenu = new JMenu("Look and Feel");
      UIManager.LookAndFeelInfo[] arrayOfLookAndFeelInfo = UIManager.getInstalledLookAndFeels();
      i = new i();
      for (UIManager.LookAndFeelInfo lookAndFeelInfo : arrayOfLookAndFeelInfo) {
        String str3 = lookAndFeelInfo.getName();
        String str4 = i.ExceptionInVPackage("lookAndFeelClass", UIManager.getSystemLookAndFeelClassName());
        if (lookAndFeelInfo.getClassName().equals(str4))
          str3 = str3 + " (Default)"; 
        if (!str3.equals("Windows Classic") && !str3.startsWith("TinyLookAndFeel")) {
          JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str3, true);
          i.ExceptionInVPackage(jCheckBoxMenuItem);
          jCheckBoxMenuItem.setActionCommand(lookAndFeelInfo.getClassName());
          jCheckBoxMenuItem.setSelected(lookAndFeelInfo.getClassName().equals(i.JMenuItemExtensionInBaPackage("lookAndFeelClass", UIManager.getSystemLookAndFeelClassName())));
          jCheckBoxMenuItem.addActionListener(new dk(this));
          jMenu.add(jCheckBoxMenuItem);
        } 
      } 
      ee.add(jMenu);
    } 
    i = new i();
    JMenu jMenu2 = new JMenu("Trace Value Positions");
    String str2 = i.JMenuItemExtensionInBaPackage(i.S, i.T);
    JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem("Show Cursor Values At Top", str2.equals("top"));
    jCheckBoxMenuItem2.addItemListener(new dl(this));
    i.ExceptionInVPackage(jCheckBoxMenuItem2);
    jMenu2.add(jCheckBoxMenuItem2);
    JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem("Show Cursor Values At Bottom", str2.equals("bottom"));
    jCheckBoxMenuItem3.addItemListener(new dm(this));
    i.ExceptionInVPackage(jCheckBoxMenuItem3);
    jMenu2.add(jCheckBoxMenuItem3);
    JCheckBoxMenuItem jCheckBoxMenuItem4 = new JCheckBoxMenuItem("Show Cursor Values by Field Name", str2.equals("withLabels"));
    jCheckBoxMenuItem4.addItemListener(new dn(this));
    i.ExceptionInVPackage(jCheckBoxMenuItem4);
    jMenu2.add(jCheckBoxMenuItem4);
    ee.add(jMenu2);
    do do = new do(this);
    i = new i();
    int j = i.b("lineTraceSize", i.ae);
    JMenu jMenu3 = new JMenu("Trace Line Style");
    JMenu jMenu4 = new JMenu("Line width");
    for (byte b1 = 1; b1 < 6; b1++) {
      String str = b1 + "";
      if (b1 == 1)
        str = str + " (Default)"; 
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str, (j == b1));
      jCheckBoxMenuItem.setActionCommand("" + b1);
      jCheckBoxMenuItem.addItemListener(do);
      i.ExceptionInVPackage(jCheckBoxMenuItem);
      jMenu4.add(jCheckBoxMenuItem);
    } 
    jMenu3.add(jMenu4);
    boolean bool1 = i.ExceptionInVPackage(i.af, i.ag);
    JCheckBoxMenuItem jCheckBoxMenuItem5 = new JCheckBoxMenuItem("Antialias Line", bool1);
    jMenu3.add(jCheckBoxMenuItem5);
    jCheckBoxMenuItem5.addActionListener(new dp(this));
    boolean bool2 = i.ExceptionInVPackage(i.ah, i.ai);
    aw.JDialogExtensionDispose(bool2);
    jCheckBoxMenuItem5 = new JCheckBoxMenuItem("Patterned Graph Lines", bool2);
    jMenu3.add(jCheckBoxMenuItem5);
    jCheckBoxMenuItem5.addActionListener(new dq(this));
    ee.add(jMenu3);
    JCheckBoxMenuItem jCheckBoxMenuItem6 = new JCheckBoxMenuItem("Quick Trace Selection");
    boolean bool3 = i.ExceptionInVPackage("fieldSelectionStyle", "standardSelection").equals("selectFromDash");
    jCheckBoxMenuItem6.setState(bool3);
    jCheckBoxMenuItem6.addItemListener(new dr(this));
    jCheckBoxMenuItem6.setEnabled(b.ExceptionInVPackage().ExceptionInVPackage("optionalQuickSelect"));
    ee.add(jCheckBoxMenuItem6);
    JMenuItemExtensionInBaPackage JMenuItemExtensionInBaPackage = new JMenuItemExtensionInBaPackage("Select Displayed Dashboard Fields", true);
    JMenuItemExtensionInBaPackage.ExceptionInVPackage(new ds(this));
    JMenuItemExtensionInBaPackage.addActionListener(new du(this));
    JMenuItemExtensionInBaPackage.setEnabled(b.ExceptionInVPackage().ExceptionInVPackage("selectableFields"));
    ee.add((JMenuItem)JMenuItemExtensionInBaPackage);
    ee.addMenuListener(new dv(this));
    JMenu jMenu5 = new JMenu("Maximum Number of Graphs");
    ee.add(jMenu5);
    i = new i();
    int k = Integer.parseInt(i.b("numberOfGraphs", "" + i.AzInterfaceTango));
    int m = i.b("numberOfGraphs", k);
    for (byte b2 = 0; b2 < i.s; b2++) {
      String str;
      if (b2 + 1 == k) {
        str = "Up to " + (b2 + 1) + " Graphs (Default)";
      } else {
        str = "Up to " + (b2 + 1) + " Graphs";
      } 
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str);
      i.ExceptionInVPackage(jCheckBoxMenuItem);
      jCheckBoxMenuItem.setActionCommand("" + (b2 + 1));
      if (b2 + 1 == m) {
        jCheckBoxMenuItem.setSelected(true);
      } else {
        jCheckBoxMenuItem.setSelected(false);
      } 
      jCheckBoxMenuItem.addActionListener(new dw(this));
      jMenu5.add(jCheckBoxMenuItem);
    } 
    JMenu jMenu6 = new JMenu("Maximum Traces Per Graph");
    ee.add(jMenu6);
    i = new i();
    int n = Integer.parseInt(i.b("numberOfOverlays", "" + i.u));
    int i1 = i.b("numberOfOverlays", n);
    for (byte b3 = 1; b3 < i.r; b3++) {
      String str;
      if (b3 + 1 == n) {
        str = "Up to " + (b3 + 1) + " Traces (Default)";
      } else {
        str = "Up to " + (b3 + 1) + " Traces";
      } 
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str);
      i.ExceptionInVPackage(jCheckBoxMenuItem);
      jCheckBoxMenuItem.setActionCommand("" + (b3 + 1));
      if (b3 + 1 == i1) {
        jCheckBoxMenuItem.setSelected(true);
      } else {
        jCheckBoxMenuItem.setSelected(false);
      } 
      jCheckBoxMenuItem.addActionListener(new dx(this));
      jMenu6.add(jCheckBoxMenuItem);
    } 
    JCheckBoxMenuItem jCheckBoxMenuItem7 = new JCheckBoxMenuItem("Show Gauges");
    jCheckBoxMenuItem7.setState(i.ExceptionInVPackage("showGauges", true));
    jCheckBoxMenuItem7.addItemListener(new dy(this));
    ee.add(jCheckBoxMenuItem7);
    JCheckBoxMenuItem jCheckBoxMenuItem8 = new JCheckBoxMenuItem("Show 50% Graph Line");
    jCheckBoxMenuItem8.setState(i.ExceptionInVPackage("showGraphHalfMark", false));
    jCheckBoxMenuItem8.addItemListener(new dz(this));
    ee.add(jCheckBoxMenuItem8);
    JCheckBoxMenuItem jCheckBoxMenuItem9 = new JCheckBoxMenuItem("Keep Graph Centered");
    jCheckBoxMenuItem9.setState(i.ExceptionInVPackage("holdGraphCentered", i.x));
    jCheckBoxMenuItem9.addItemListener(new dA(this));
    ee.add(jCheckBoxMenuItem9);
    if (b.ExceptionInVPackage().ExceptionInVPackage("tabbedQuickViews")) {
      boolean bool = i.ExceptionInVPackage(i.aj, i.ak);
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Go to last Quick View on open");
      jCheckBoxMenuItem.setState(bool);
      jCheckBoxMenuItem.addItemListener(new dB(this));
      jCheckBoxMenuItem.setToolTipText("If checked, the last used Quick View tab will be selected on open, otherwise it will open to the Default tab on open");
      ee.add(jCheckBoxMenuItem);
    } 
    ee.addSeparator();
    boolean bool4 = i.ExceptionInVPackage("useSwingFileDialog", true);
    if (b.ExceptionInVPackage().ExceptionInVPackage(";lkewlk nbi3k48tjh265'")) {
      boolean bool = i.ExceptionInVPackage(i.aJ, i.aK);
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Show Multi-Log Compare Bar");
      jCheckBoxMenuItem.setState(!bool);
      jCheckBoxMenuItem.addItemListener(new dC(this));
      ee.add(jCheckBoxMenuItem);
    } 
    JCheckBoxMenuItem jCheckBoxMenuItem10 = new JCheckBoxMenuItem("Show Dashboard");
    jCheckBoxMenuItem10.setState(i.ExceptionInVPackage("showDashboard", true));
    jCheckBoxMenuItem10.addItemListener(new dD(this));
    hx.ExceptionInVPackage().IOJMenu(new dF(this, jCheckBoxMenuItem10));
    ee.add(jCheckBoxMenuItem10);
    JCheckBoxMenuItem jCheckBoxMenuItem11 = new JCheckBoxMenuItem("Auto Hide Field Select");
    jCheckBoxMenuItem11.setState(i.ExceptionInVPackage("hideSelector", i.q));
    jCheckBoxMenuItem11.addItemListener(new dG(this));
    ee.add(jCheckBoxMenuItem11);
    if (b.ExceptionInVPackage().ExceptionInVPackage("tuningPanelVisible")) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Show Tuning Console");
      jCheckBoxMenuItem.setState(i.ExceptionInVPackage("showTuningConsole", i.p));
      jCheckBoxMenuItem.addItemListener(new dH(this));
      hx.ExceptionInVPackage().b(new dI(this, jCheckBoxMenuItem));
      ee.add(jCheckBoxMenuItem);
    } else {
      i.IOJMenu("showTuningConsole", "false");
    } 
    JCheckBoxMenuItem jCheckBoxMenuItem12 = new JCheckBoxMenuItem("Scale to Fit Full Log On load");
    jCheckBoxMenuItem12.setState(i.ExceptionInVPackage(i.U, i.V));
    jCheckBoxMenuItem12.addItemListener(new dJ(this));
    ee.add(jCheckBoxMenuItem12);
    return ee;
  }
  
  private JMenu S() {
    ee ee = new ee(this, "Options");
    if (!b.ExceptionInVPackage().ExceptionInVPackage("hideRpmX100Option")) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("RPM x 100");
      jCheckBoxMenuItem.setState(i.ExceptionInVPackage("RPM_USE_FORMULA", false));
      jCheckBoxMenuItem.addItemListener(new dK(this));
      ee.add(jCheckBoxMenuItem);
    } 
    if (b.ExceptionInVPackage().ExceptionInVPackage("fillNaN")) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Fill NaN Values with Last");
      jCheckBoxMenuItem.setState(i.ExceptionInVPackage("fillNaN", i.z));
      jCheckBoxMenuItem.addItemListener(new dL(this));
      ee.add(jCheckBoxMenuItem);
    } 
    JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem("Fill Time Gaps");
    jCheckBoxMenuItem1.setState(i.ExceptionInVPackage("timeGapsOn", false));
    jCheckBoxMenuItem1.addItemListener(new dM(this));
    ee.add(jCheckBoxMenuItem1);
    JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem("Alphabetize Field Lists");
    jCheckBoxMenuItem2.setState(i.ExceptionInVPackage(i.E, i.F));
    jCheckBoxMenuItem2.addItemListener(new dN(this));
    ee.add(jCheckBoxMenuItem2);
    String[] arrayOfString1 = b.m;
    if (arrayOfString1 != null && arrayOfString1.length > 0 && !b.ExceptionInVPackage().ExceptionInVPackage("hideYaxisSelection")) {
      JMenu jMenu = new JMenu("Default Y Axis field");
      boolean bool2 = false;
      i i3 = new i();
      String str = i.ExceptionInVPackage("yAxisField", "MAP");
      byte b;
      for (b = 0; b < arrayOfString1.length; b++) {
        JCheckBoxMenuItem jCheckBoxMenuItem6 = new JCheckBoxMenuItem(arrayOfString1[b], arrayOfString1[b].equals(str));
        if (arrayOfString1[b].equals(str))
          bool2 = true; 
        jCheckBoxMenuItem6.addItemListener(new dO(this));
        i3.ExceptionInVPackage(jCheckBoxMenuItem6);
        jMenu.add(jCheckBoxMenuItem6);
      } 
      b = !bool2 ? 1 : 0;
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Other", b);
      jCheckBoxMenuItem.addItemListener(new dQ(this));
      i3.ExceptionInVPackage(jCheckBoxMenuItem);
      jMenu.add(jCheckBoxMenuItem);
      ee.add(jMenu);
    } 
    JMenu jMenu1 = new JMenu("Mouse Wheel Action");
    i i1 = new i();
    String str1 = i.ExceptionInVPackage(i.G, i.J);
    JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem("Zoom Graph In / Out (Default)", i.H.equals(str1));
    jCheckBoxMenuItem3.addItemListener(new dR(this));
    i1.ExceptionInVPackage(jCheckBoxMenuItem3);
    jMenu1.add(jCheckBoxMenuItem3);
    jCheckBoxMenuItem3 = new JCheckBoxMenuItem("Page Data Forward / Back", i.I.equals(str1));
    jCheckBoxMenuItem3.addItemListener(new dS(this));
    i1.ExceptionInVPackage(jCheckBoxMenuItem3);
    jMenu1.add(jCheckBoxMenuItem3);
    ee.add(jMenu1);
    JCheckBoxMenuItem jCheckBoxMenuItem4 = new JCheckBoxMenuItem("Keep Index in sync with 2nd instance");
    jCheckBoxMenuItem4.setState(i.ExceptionInVPackage(i.aD, i.aE));
    jCheckBoxMenuItem4.addItemListener(new dT(this));
    ee.add(jCheckBoxMenuItem4);
    if (b.ExceptionInVPackage().ExceptionInVPackage(";lkewlk nbi3k48tjh265'")) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Keep Multiple Logs Open");
      jCheckBoxMenuItem.setState(i.ExceptionInVPackage(i.aJ, i.aK));
      jCheckBoxMenuItem.addItemListener(new dU(this));
      ee.add(jCheckBoxMenuItem);
    } 
    if (!b.ExceptionInVPackage().ExceptionInVPackage("hideLoadReversedOption")) {
      this.l = new JCheckBoxMenuItem("Load File Reversed");
      this.l.setToolTipText("Only Applies to DTA logs");
      this.l.setState(i.ExceptionInVPackage("loadReverse", true));
      this.l.addItemListener(new dV(this));
      this.l.setVisible(false);
      ee.add(this.l);
    } 
    ee.addSeparator();
    if (b.ExceptionInVPackage().ExceptionInVPackage("fieldNameNormalizationEditable")) {
      JMenu jMenu = new JMenu("Field Name Standardization");
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Use Name Standardization");
      boolean bool2 = i.ExceptionInVPackage("fieldNameNormaization", true);
      jCheckBoxMenuItem.setSelected(bool2);
      jCheckBoxMenuItem.addActionListener(new dW(this));
      jMenu.add(jCheckBoxMenuItem);
      this.j = new JMenuItem("Edit Standardized Field Mapping");
      this.j.addActionListener(new dX(this));
      this.j.setEnabled(bool2);
      jMenu.add(this.j);
      ee.add(jMenu);
    } 
    String[] arrayOfString2 = i.JMenuItemExtensionInBaPackage("APP_OPTION_");
    for (byte b1 = 0; b1 < arrayOfString2.length; b1++) {
      JMenu jMenu = b(k.ExceptionInVPackage(arrayOfString2[b1], "APP_OPTION_", ""), "");
      String str = i.b(arrayOfString2[b1]);
      jMenu.setText(str);
      ee.add(jMenu);
    } 
    ee.addSeparator();
    String str2 = i.JMenuItemExtensionInBaPackage("prefFontSize", eJ.ExceptionInVPackage() + "");
    dY dY = new dY(this);
    int[] arrayOfInt = { 
        8, 9, 10, 11, 12, 14, 16, 17, 18, 19, 
        20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 
        30, 31, 32, 38, 44, 50 };
    int i = eJ.ExceptionInVPackage();
    boolean bool = false;
    JMenu jMenu2 = new JMenu("Font Size");
    i i2 = new i();
    for (byte b2 = 0; b2 < arrayOfInt.length; b2++) {
      if (!bool && arrayOfInt[b2] > i) {
        String str5 = i + "";
        String str6 = str5 + " (Default)";
        bool = true;
        JCheckBoxMenuItem jCheckBoxMenuItem6 = new JCheckBoxMenuItem(str6, str5.equals(str2));
        jCheckBoxMenuItem6.setActionCommand(str5);
        i2.ExceptionInVPackage(jCheckBoxMenuItem6);
        jCheckBoxMenuItem6.addItemListener(dY);
        jMenu2.add(jCheckBoxMenuItem6);
      } 
      String str3 = arrayOfInt[b2] + "";
      String str4 = str3;
      if (arrayOfInt[b2] == i) {
        str4 = str4 + " (Default)";
        bool = true;
      } 
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str4, str3.equals(str2));
      jCheckBoxMenuItem.setActionCommand(str3);
      i2.ExceptionInVPackage(jCheckBoxMenuItem);
      jCheckBoxMenuItem.addItemListener(dY);
      jMenu2.add(jCheckBoxMenuItem);
    } 
    ee.add(jMenu2);
    JMenu jMenu3 = new JMenu("Graph Background");
    ea ea = new ea(this, this.ExceptionInVPackage.n());
    ExceptionInVPackage(jMenu3, ea, "graphBackColor", -1);
    ee.add(jMenu3);
    boolean bool1 = i.ExceptionInVPackage(i.aa, i.ab);
    JCheckBoxMenuItem jCheckBoxMenuItem5 = new JCheckBoxMenuItem("Repeat Graph Colors");
    jCheckBoxMenuItem5.setSelected(bool1);
    jCheckBoxMenuItem5.addActionListener(new dZ(this));
    ee.add(jCheckBoxMenuItem5);
    this.k = new JMenu("Graph Trace Colors");
    T();
    ee.add(this.k);
    return ee;
  }
  
  private void T() {
    int k;
    this.k.removeAll();
    int i = i.ExceptionInVPackage("numberOfGraphs", i.AzInterfaceTango);
    int j = i.ExceptionInVPackage("numberOfOverlays", i.u);
    ea ea = new ea(this, this.ExceptionInVPackage.n());
    boolean bool = i.ExceptionInVPackage(i.aa, i.ab);
    if (bool) {
      k = j;
    } else {
      k = j * i;
    } 
    i.ExceptionInVPackage("numberOfGraphs", i.AzInterfaceTango);
    byte b;
    for (b = 0; b < k; b++) {
      JMenu jMenu = new JMenu("Graph Color " + (b + 1));
      ea = new ea(this, this.ExceptionInVPackage.n());
      ExceptionInVPackage(jMenu, ea, "graphForeColor" + b, b);
      this.k.add(jMenu);
    } 
    for (b = 0; b < k; b++)
      hx.ExceptionInVPackage().ExceptionInVPackage(aV.ExceptionInVPackage().ExceptionInVPackage(b), b); 
  }
  
  private void BiInterfaceHotel(String paramString) {
    if (paramString == null) {
      paramString = "{Custom Alpha-N Y axis field, this is case sensitive.}";
      paramString = ExceptionInVPackage((String)null, paramString, false);
      if (paramString == null || paramString.equals(""))
        return; 
    } 
    if (paramString.equals("TP ADC") && i.JMenuItemExtensionInBaPackage("APPEND_FIELD_TP ADC", "").equals(""))
      i.IOJMenu("APPEND_FIELD_TP ADC", ExceptionInVPackage((String)null, i.IOJMenu("APPEND_FIELD_TP ADC"), true)); 
    System.out.println("yAxis set to" + paramString);
    i.IOJMenu("yAxisField", paramString);
    if (this.ExceptionInVPackage.JDialogExtensionDispose != null && this.ExceptionInVPackage.JDialogExtensionDispose.isVisible() && this.ExceptionInVPackage.JDialogExtensionDispose.JPanelExtensionInAiPackage != null && k.ExceptionInVPackage("Tune Settings file must be reloaded for change to take effect.\nReload now?", this, true))
      this.ExceptionInVPackage.JDialogExtensionDispose.ArrayListInBvPackage(); 
  }
  
  private JMenu U() {
    JMenu jMenu = new JMenu("Play Back");
    this.JMenuItemExtensionInBaPackage = new JMenuItem("Start Play back");
    this.JMenuItemExtensionInBaPackage.addActionListener(new cg(this));
    jMenu.add(this.JMenuItemExtensionInBaPackage);
    this.ArrayListInBvPackage = new JMenuItem("Stop Play back");
    this.ArrayListInBvPackage.addActionListener(new ch(this));
    jMenu.add(this.ArrayListInBvPackage);
    this.JPanelExtensionInAiPackage = new JMenu("Play Speed");
    i i = new i();
    el el = new el(this, this.ExceptionInVPackage.n());
    double[] arrayOfDouble = (this.ExceptionInVPackage.n()).k;
    for (byte b = 0; b < arrayOfDouble.length; b++) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem((int)(100.0D * arrayOfDouble[b]) + "%");
      jCheckBoxMenuItem.setState((arrayOfDouble[b] == i.ExceptionInVPackage("playbackSpeed", 1.0D)));
      jCheckBoxMenuItem.addItemListener(el);
      jCheckBoxMenuItem.setName(arrayOfDouble[b] + "");
      i.ExceptionInVPackage(jCheckBoxMenuItem);
      this.JPanelExtensionInAiPackage.add(jCheckBoxMenuItem);
    } 
    jMenu.add(this.JPanelExtensionInAiPackage);
    return jMenu;
  }
  
  private JMenu ExceptionInVPackage(JMenu paramJMenu, ItemListener paramItemListener, String paramString, int paramInt) {
    i i = new i();
    for (byte b = 0; b < this.IOJMenu.length; b++) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(this.IOJMenu[b]);
      jCheckBoxMenuItem.setState(this.IOJMenu[b].equalsIgnoreCase(i.b(paramString)));
      jCheckBoxMenuItem.addItemListener(paramItemListener);
      jCheckBoxMenuItem.setName(paramString);
      i.ExceptionInVPackage(jCheckBoxMenuItem);
      paramJMenu.add(jCheckBoxMenuItem);
    } 
    return paramJMenu;
  }
  
  private boolean IOJMenu(String paramString1, String paramString2, boolean paramBoolean) {
    if (paramBoolean) {
      String str1 = paramString1;
      String str2 = paramString2;
      String str3 = X.b(paramString1, "APPEND_FIELD_", "");
      String[] arrayOfString = null;
      do {
        if (paramString2.contains("*") || paramString2.contains("+") || paramString2.contains("/") || paramString2.contains("-")) {
          paramString2 = ExceptionInVPackage(str3, paramString2, true);
        } else if (hx.ExceptionInVPackage().r() != null) {
          paramString2 = ExceptionInVPackage(str3, paramString2, false);
        } 
        if (paramString2 == null || paramString2.equals("")) {
          i.ArrayListInBvPackage(str1);
          return false;
        } 
        if (paramString2.trim().equals("")) {
          i.ArrayListInBvPackage(paramString1);
          IOJMenu(str3, false);
        } else {
          i.IOJMenu(paramString1, paramString2);
          IOJMenu(str3, true);
        } 
        arrayOfString = ai.ExceptionInVPackage(str3, str2);
        if (arrayOfString == null || arrayOfString.length <= 0)
          continue; 
        paramString1 = ai.IOJMenu(arrayOfString[0]);
        paramString2 = i.IOJMenu(paramString1);
      } while (arrayOfString != null && arrayOfString.length > 0);
      JMenuItemExtensionInBaPackage(paramBoolean);
    } else {
      i.ArrayListInBvPackage(paramString1);
    } 
    return true;
  }
  
  private void IOJMenu(String paramString, boolean paramBoolean) {
    for (byte b = 0; b < this.BiInterfaceHotel.getMenuComponentCount(); b++) {
      if (this.BiInterfaceHotel.getMenuComponent(b) instanceof JMenu) {
        JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)this.BiInterfaceHotel.getMenuComponent(b);
        if (jCheckBoxMenuItem.getText().equals(paramString)) {
          jCheckBoxMenuItem.setSelected(paramBoolean);
          return;
        } 
      } 
    } 
  }
  
  public String ExceptionInVPackage(String paramString1, String paramString2, boolean paramBoolean) {
    return k.ExceptionInVPackage(paramString1, paramString2, paramBoolean, null, true, this, hx.ExceptionInVPackage().r());
  }
  
  public void BiInterfaceHotel() {
    this.ExceptionInVPackage.n().JMenuItemExtensionInBaPackage();
  }
  
  public void i() {
    this.ExceptionInVPackage.n().j();
  }
  
  public void ExceptionInVPackage(String paramString, boolean paramBoolean) {
    i.IOJMenu(paramString, paramBoolean + "");
    if (this.ExceptionInVPackage.l() != null && k.ExceptionInVPackage("Log file must be reloaded for change to take effect.\nReload now?", this, true))
      b(this.ExceptionInVPackage.l(), false); 
  }
  
  public void ExceptionInVPackage(String paramString, int paramInt) {
    i.IOJMenu(paramString, paramInt + "");
    if (this.ExceptionInVPackage.l() != null && k.ExceptionInVPackage("Log file must be reloaded for change to take effect.\nReload now?", this, true))
      b(this.ExceptionInVPackage.l(), false); 
  }
  
  public void j() {
    this.ExceptionInVPackage.j();
  }
  
  public void k() {
    this.ExceptionInVPackage.k();
  }
  
  public void l() {
    if (this.ExceptionInVPackage.BiInterfaceHotel()) {
      if (r) {
        setVisible(false);
        System.out.println("Update In Progress, delaying app shut down.");
        long l = System.currentTimeMillis() + 30000L;
        while (r && l > System.currentTimeMillis()) {
          try {
            Thread.currentThread();
            Thread.sleep(200L);
          } catch (Exception exception) {}
        } 
      } 
      System.exit(0);
    } 
  }
  
  public void m() {
    if (getExtendedState() != 6) {
      Insets insets = getInsets();
      i.IOJMenu("x", "" + getX());
      i.IOJMenu("y", "" + getY());
      i.IOJMenu("width", "" + getWidth());
      i.IOJMenu("height", "" + getHeight());
    } 
  }
  
  public void n() {
    JDialogExtensionDispose.ExceptionInVPackage().IOJMenu();
    i.JDialogExtensionDispose();
    System.out.println(i.b + " shutdown: " + (new Date()).toString());
    System.out.println("##############################################################\n");
  }
  
  public void ThreadedInAzPackage() {
    FileDialog fileDialog = new FileDialog(this, "Save Graph to Jpeg or PNG", 1);
    fileDialog.setFile(cz.ExceptionInVPackage("graph.png"));
    fileDialog.setDirectory(i.JMenuItemExtensionInBaPackage("lastJpegDir", "."));
    fileDialog.setVisible(true);
    fileDialog.setFilenameFilter(new fD());
    if (fileDialog.getFile() != null) {
      String str = fileDialog.getFile();
      if (!str.toLowerCase().endsWith(".jpg") && !str.toLowerCase().endsWith(".jpeg") && !str.toLowerCase().endsWith(".png"))
        str = str + ".png"; 
      cz cz = new cz();
      boolean bool = false;
      try {
        bool = cz.ExceptionInVPackage(V(), fileDialog.getDirectory(), str, "Graph by " + i.b + " " + i.IOJMenu + " " + i.ExceptionInVPackage + " " + i.m);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      if (!bool)
        k.ExceptionInVPackage("File Save Failed.", this); 
      i.IOJMenu("lastJpegDir", fileDialog.getDirectory());
    } 
  }
  
  private Component V() {
    return (this.m == null) ? this.ExceptionInVPackage.p() : (this.m.getTitleAt(this.m.getSelectedIndex()).equals("Log Viewer") ? this.ExceptionInVPackage.p() : (this.m.getTitleAt(this.m.getSelectedIndex()).equals("Ignition Log Viewer") ? this.n.ExceptionInVPackage() : (this.m.getTitleAt(this.m.getSelectedIndex()).equals("Scatter Plots") ? this.ThreadedInAzPackage.ArrayListInBvPackage() : (this.m.getTitleAt(this.m.getSelectedIndex()).equals("Histogram / Table Generator") ? this.p.JMenuItemExtensionInBaPackage() : this.ExceptionInVPackage.p()))));
  }
  
  public void p() {
    if (this.w == null) {
      if (this.x == null)
        this.x = new ed(this); 
      this.w = new JDialogExtensionDispose(this, this.x);
      int i = i.b(i.am, -1);
      int j = i.b(i.an, -1);
      if (j <= 0 || i <= 0) {
        this.w.pack();
      } else {
        this.w.setSize(i, j);
      } 
      this.w.ExceptionInVPackage(new ci(this));
      bV.ExceptionInVPackage(this.i, (Component)this.w);
      this.w.setVisible(true);
    } 
  }
  
  public void q() {
    if (this.w != null) {
      this.w.dispose();
      this.w = null;
    } 
  }
  
  public void r() {
    ExceptionInVPackage((String[])null);
  }
  
  public void ExceptionInVPackage(String[] paramArrayOfString) {
    if (paramArrayOfString == null)
      paramArrayOfString = b("Open Log File"); 
    if (paramArrayOfString != null)
      ExceptionInVPackage(paramArrayOfString, false); 
    cS.ExceptionInVPackage().ExceptionInVPackage(this);
    i.JDialogExtensionDispose();
  }
  
  public void s() {
    String[] arrayOfString = b("Trail Log File");
    if (arrayOfString != null)
      b(arrayOfString[0], true); 
    i.JDialogExtensionDispose();
    (new em(this)).start();
    cS.ExceptionInVPackage().ExceptionInVPackage(this);
  }
  
  public void AzInterfaceTango() {
    String[] arrayOfString = b("Open Compare File");
    if (arrayOfString != null)
      IOJMenu(arrayOfString[0]); 
  }
  
  public void u() {
    String str = bt.ExceptionInVPackage(bt.ExceptionInVPackage);
    ExceptionInVPackage(str);
  }
  
  public void ExceptionInVPackage(String paramString) {
    JPanelExtensionInAiPackage JPanelExtensionInAiPackage = new JPanelExtensionInAiPackage();
    JPanelExtensionInAiPackage.ExceptionInVPackage((et)new dQ(i.JPanelExtensionInAiPackage(), "AppHelpViewer"));
    try {
      JPanelExtensionInAiPackage.b(paramString);
    } catch (ExceptionInVPackage a1) {
      D.ExceptionInVPackage("Unable to open help:\n" + paramString, (Exception)a1, this.i);
    } 
    JPanelExtensionInAiPackage.ExceptionInVPackage(this.i, i.b + " Help");
  }
  
  public void v() {
    dS dS = new dS(this, new eg(this));
    k.ExceptionInVPackage(this, (Dialog)dS);
    dS.setModal(true);
    dS.setVisible(true);
  }
  
  public String[] b(String paramString) {
    String[] arrayOfString1 = W();
    String str = i.JMenuItemExtensionInBaPackage("lastFileDir", BiInterfaceHotel.ArrayListInBvPackage());
    Properties Properties = new Properties(i.JPanelExtensionInAiPackage(), "FileDialog_");
    String[] arrayOfString2 = bV.ExceptionInVPackage(this, paramString, arrayOfString1, (String)null, str, true, null, true, (WInterfaceAp)Properties);
    if (arrayOfString2 != null && arrayOfString2.length >= 1 && arrayOfString2[0] != null && arrayOfString2[0].lastIndexOf(File.separator) != -1) {
      String str1 = arrayOfString2[0].substring(0, arrayOfString2[0].lastIndexOf(File.separator));
      i.IOJMenu("lastFileDir", str1);
    } 
    return arrayOfString2;
  }
  
  private String[] W() {
    String str = i.ExceptionInVPackage("fileExtensions", "msl;xls;txt;dif;msq;csv");
    return k.ExceptionInVPackage(str, ";");
  }
  
  public File w() {
    return this.AzInterfaceTango;
  }
  
  public void b(String paramString, boolean paramBoolean) {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramString;
    this.ExceptionInVPackage.ExceptionInVPackage(arrayOfString, paramBoolean);
    if (this.m != null && this.m.JMenuItemExtensionInBaPackage("Purchase Registration"))
      this.m.JDialogExtensionDispose("Log Viewer"); 
    this.AzInterfaceTango = new File(paramString);
    this.u.ExceptionInVPackage(paramString);
    setTitle(this.AzInterfaceTango.getName());
  }
  
  public void ExceptionInVPackage(String[] paramArrayOfString, boolean paramBoolean) {
    File file = new File(paramArrayOfString[0]);
    if (b.ExceptionInVPackage().ExceptionInVPackage("triggerLogViewer") && U.ExceptionInVPackage(file)) {
      this.n.ExceptionInVPackage(file.getAbsolutePath());
      if (this.m != null)
        this.m.JDialogExtensionDispose("Ignition Log Viewer"); 
    } else if (U.b(file)) {
      if (b.ExceptionInVPackage().ExceptionInVPackage("tuningPanelVisible")) {
        try {
          this.ExceptionInVPackage.b(true);
          i.IOJMenu("showTuningConsole", "true");
          this.ExceptionInVPackage.ArrayListInBvPackage(paramArrayOfString[0]);
        } catch (ExceptionInVPackage a1) {
          bV.ArrayListInBvPackage(a1.getMessage(), this);
        } 
        this.m.JDialogExtensionDispose("Log Viewer");
      } else {
        String str1 = paramArrayOfString[0].substring(paramArrayOfString[0].lastIndexOf("."));
        bV.ArrayListInBvPackage("The Lite! Edition can not load and edit " + str1 + " (tune settings) files. \nPlease Check Out the registered version for \nAdvanced Features to bring you ExceptionInVPackage tune like never before.", this);
      } 
    } else {
      this.ExceptionInVPackage.ExceptionInVPackage(paramArrayOfString, paramBoolean);
      if (this.m != null && !this.m.JMenuItemExtensionInBaPackage("Log Viewer") && !this.m.JMenuItemExtensionInBaPackage("Scatter Plots"))
        this.m.JDialogExtensionDispose("Log Viewer"); 
      this.AzInterfaceTango = file;
      if (this.l != null)
        try {
          this.l.setVisible(X.F.equals(X.ExceptionInVPackage(file)));
        } catch (FileNotFoundException fileNotFoundException) {
        
        } catch (ExceptionInVPackage a1) {} 
    } 
    String str = paramArrayOfString[0].substring(paramArrayOfString[0].lastIndexOf(File.separator) + 1);
    this.u.ExceptionInVPackage(paramArrayOfString[0]);
    setTitle(str);
  }
  
  public void IOJMenu(String paramString) {
    this.ExceptionInVPackage.IOJMenu(paramString);
    File file = new File(paramString);
    setTitle(this.AzInterfaceTango.getName() + " - " + file.getName());
  }
  
  public void windowActivated(WindowEvent paramWindowEvent) {}
  
  public void windowClosed(WindowEvent paramWindowEvent) {}
  
  public void windowClosing(WindowEvent paramWindowEvent) {
    l();
  }
  
  public void windowDeactivated(WindowEvent paramWindowEvent) {}
  
  public void windowDeiconified(WindowEvent paramWindowEvent) {}
  
  public void windowIconified(WindowEvent paramWindowEvent) {}
  
  public void windowOpened(WindowEvent paramWindowEvent) {}
  
  public void processEvent(AWTEvent paramAWTEvent) {
    if ((paramAWTEvent.getID() == 101 || paramAWTEvent.getID() == 100) && !J.b()) {
      m();
      if (isAlwaysOnTop())
        setAlwaysOnTop(false); 
    } 
    if (paramAWTEvent.getID() == 201 && J.b()) {
      m();
      if (isAlwaysOnTop())
        setAlwaysOnTop(false); 
    } else if (paramAWTEvent.getID() == 209) {
      if (getExtendedState() == 6) {
        i.IOJMenu(i.al, "true");
      } else {
        i.IOJMenu(i.al, "false");
      } 
    } 
    super.processEvent(paramAWTEvent);
  }
  
  public void setTitle(String paramString) {
    super.setTitle(i.b + " " + i.IOJMenu + " " + i.ExceptionInVPackage + " - " + paramString);
  }
  
  public void ArrayListInBvPackage(String paramString) {
    if (paramString != null)
      if (paramString.equals("lineGraph")) {
        if (!this.m.JMenuItemExtensionInBaPackage("Log Viewer"))
          this.m.JDialogExtensionDispose("Log Viewer"); 
      } else if (paramString.equals("ignitionLogger")) {
        if (!this.m.JMenuItemExtensionInBaPackage("Ignition Log Viewer"))
          this.m.JDialogExtensionDispose("Ignition Log Viewer"); 
      } else if (paramString.equals("scatterPlot")) {
        if (!this.m.JMenuItemExtensionInBaPackage("Scatter Plots"))
          this.m.JDialogExtensionDispose("Scatter Plots"); 
      } else if (paramString.equals("histogram") && !this.m.JMenuItemExtensionInBaPackage("Histogram / Table Generator")) {
        this.m.JDialogExtensionDispose("Histogram / Table Generator");
      }  
  }
  
  public String x() {
    String str = i.IOJMenu("registrationUrl");
    if (str == null || str.equals(""))
      try {
        str = "file://" + (new File(".")).getCanonicalPath() + "/help/register.html";
      } catch (Exception exception) {
        k.ExceptionInVPackage("While online go to\n" + i.n, this.i);
      }  
    return str;
  }
  
  protected void y() {
    k.ExceptionInVPackage("Failed to open file for trailing, timeout.", this);
  }
  
  public void JMenuItemExtensionInBaPackage(boolean paramBoolean) {
    if (this.ExceptionInVPackage.l() != null && paramBoolean && 0 == JOptionPane.showConfirmDialog(this, "Log file must be reloaded for change to take effect.\nReload now?", "Reload?", 0)) {
      this.ExceptionInVPackage.v();
      b(this.ExceptionInVPackage.l(), false);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */