package ao;

import V.a;
import W.U;
import W.X;
import W.ap;
import W.ar;
import ai.f;
import as.a;
import as.g;
import at.a;
import at.c;
import au.c;
import ay.a;
import az.c;
import az.o;
import az.t;
import bA.e;
import bH.C;
import bH.D;
import bH.J;
import bH.S;
import bH.U;
import bH.X;
import bH.aa;
import bH.ae;
import bH.c;
import bI.f;
import bI.h;
import bV.a;
import bV.d;
import com.efiAnalytics.ui.aN;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cS;
import com.efiAnalytics.ui.cz;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.dS;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.eK;
import com.efiAnalytics.ui.et;
import f.d;
import g.c;
import g.k;
import h.b;
import h.h;
import h.i;
import i.g;
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
import k.d;

public class cd extends JFrame implements hi, WindowListener {
  aX a = null;
  
  bK b = null;
  
  String[] c = aV.a().b();
  
  JMenuItem d;
  
  JMenuItem e;
  
  JMenu f;
  
  JMenu g;
  
  JMenu h = null;
  
  Frame i = null;
  
  JMenuItem j = null;
  
  JMenu k = null;
  
  JCheckBoxMenuItem l = null;
  
  eK m = null;
  
  c n = null;
  
  er o = null;
  
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
  
  File t = null;
  
  private boolean I = false;
  
  fA u = new fA();
  
  gZ v = new gZ();
  
  g w = null;
  
  a x = null;
  
  JMenu y = new ee(this, "Calculated Fields");
  
  int z = 1;
  
  public cd() {
    aa aa = new aa();
    aa.a();
    boolean bool1 = true;
    setTitle("");
    this.i = this;
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource(i.B));
    setIconImage(image);
    bV.a(this);
    bq.a().a(this);
    bV.a(new ce(this));
    I();
    if (G()) {
      K();
      o.a(true);
      i.c("lastUpdateCheckDate", "" + (System.currentTimeMillis() - this.q - 1000L));
    } 
    t t = new t();
    h.a().a((f)t);
    eg eg = new eg(this);
    cS.a((C)eg);
    boolean bool2 = false;
    if (!bool2 && cS.a((C)eg).a(eg.f()) && B()) {
      i.c = X.b(i.c, G, "");
      this.s = true;
    } else if (!bool2 && cS.a((C)eg).a(eg.g(), 1)) {
      String str = hU.b;
      Properties properties = new Properties();
      properties.setProperty(hU.a, eg.d());
      str = hU.a(properties, str);
      int n = JOptionPane.showConfirmDialog(this, str, "Upgrade Registration", 0);
      if (n == 0)
        aN.a("https://www.efianalytics.com/register/upgradeMlvRegistrationKey.jsp?email=" + eg.d()); 
    } 
    setTitle("");
    if (bool1) {
      D.c("Check 1: " + aa.d());
      aa.e();
      aa.a();
    } 
    b.a().a(i.b, i.c);
    if (bool1) {
      D.c("Set Features: " + aa.d());
      aa.e();
      aa.a();
    } 
    this.b = new bK(hx.a());
    if (bool1) {
      D.c("Create Lower Toolbar: " + aa.d());
      aa.e();
      aa.a();
    } 
    add(this.b, "South");
    bq.a().a(this.b);
    if (bool1) {
      D.c("Add Lower Toolbar: " + aa.d());
      aa.e();
      aa.a();
    } 
    (new fw()).a();
    this.a = new aX();
    if (bool1) {
      D.c("Create GraphPanel: " + aa.d());
      aa.e();
      aa.a();
    } 
    if (this.s) {
      this.a.a(eg.b(), eg.c(), eg.d());
    } else {
      this.a.a(null, null, null);
    } 
    if (bool1) {
      D.c("Check 2: " + aa.d());
      aa.e();
      aa.a();
    } 
    D.c("init components: " + aa.d());
    aa.e();
    aa.a();
    setJMenuBar(L());
    if (bool1) {
      D.c("Build Menu: " + aa.d());
      aa.e();
      aa.a();
    } 
    this.m = new eK();
    this.m.add("Log Viewer", this.a);
    cs cs = new cs(this);
    cs.run();
    if (b.a().a("showRegisterTab")) {
      fC fC = new fC();
      this.m.add("Purchase Registration", fC);
      this.m.g("Purchase Registration");
    } 
    add((Component)this.m, "Center");
    this.a.n().a(i.a("playbackSpeed", 1.0D), false);
    this.a.n().a(this);
    if (bool1) {
      D.c("Build tabs: " + aa.d());
      aa.e();
      aa.a();
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
    boolean bool = i.a(i.al, false);
    if (bool)
      setExtendedState(6); 
    doLayout();
    enableEvents(1L);
    enableEvents(262144L);
    D.c("Layout: " + aa.d());
    aa.e();
    aa.a();
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(bY.a());
    KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new ec(this));
    k.a = new JFileChooser();
    k.a.setFileView((FileView)new c());
    if (bool1) {
      D.c("init File Chooser: " + aa.d());
      aa.e();
      aa.a();
    } 
    setVisible(true);
    if (bool1) {
      D.c("Set Visible: " + aa.d());
      aa.e();
      aa.a();
    } 
    d.a();
    if (i.a(i.y, false) && h.a(".")) {
      i.c("lastUpdateCheckDate", "0");
      b.a().a("Updating Application Files");
      this.I = true;
      (new en(this, true, this)).start();
    } else if (i.a("automaticUpdates", true) || !i.a("valid", false)) {
      (new en(this, false, this)).start();
    } 
    a.c().a(this.v);
    a.c().g();
    setTransferHandler(new eb(this));
  }
  
  private void z() {
    i.d("registrationKeyV2", "");
    i.d("userEmail", "");
    i.d("firstName", "");
    i.d("lastName", "");
    i.h();
    i.g();
  }
  
  public int a() {
    int i = i.b("loopCount", 0);
    U u = new U();
    u.a();
    u.a();
    int j = u.a();
    i.c("loopCount", "" + j);
    return j;
  }
  
  private void e(String paramString) {
    String str = i.e("disabledKeys", "");
    str = str + paramString + ";";
    i.c("disabledKeys", str);
    i.g();
  }
  
  private ArrayList A() {
    ArrayList<String> arrayList = new ArrayList();
    String str = i.e("disabledKeys", "");
    StringTokenizer stringTokenizer = new StringTokenizer(str, ";");
    while (stringTokenizer.hasMoreTokens())
      arrayList.add(stringTokenizer.nextToken()); 
    return arrayList;
  }
  
  private boolean f(String paramString) {
    ArrayList arrayList = A();
    return arrayList.contains(paramString);
  }
  
  private boolean B() {
    cD cD = new cD(this);
    o o = o.a(new bW(), cD);
    d d = o.h();
    if (d != null) {
      if (d.a() == 0) {
        this.s = true;
      } else if (d.a() == 4) {
        bV.d(c.h + "\n" + c.f, this);
        this.s = false;
      } else if (d.a() == 1) {
        D.c("renewal over due");
        this.s = true;
      } else if (d.a() == 2) {
        bV.d(c.h + "\n" + d.b(), this);
        this.s = false;
      } else if (d.a() == 7) {
        bV.d(c.j + "\n" + d.b(), this);
        this.s = false;
      } else if (d.a() == 5) {
        bV.d(c.c(cD) + "\n" + d.b(), this);
        this.s = false;
      } else if (d.a() == 6) {
        String str = X.b(i.c, b.b, "");
        str = X.b(str, "(Beta)", "");
        bV.d("The registration info provided is no longer valid.\n\nPlease contact EFI Analytics if you are the rightful owner of the registration.", bq.a().b());
        aN.a(i.n);
        try {
          z();
        } catch (a a1) {
          Logger.getLogger(cd.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a1);
        } 
        this.s = false;
      } 
    } else {
      i.c += G;
      this.s = false;
    } 
    return this.s;
  }
  
  public boolean b() {
    Date date1 = new Date();
    date1.setTime(i.a("lastUpdateCheckDate", (new Date()).getTime() - this.q - 1L));
    Date date2 = new Date();
    date2.setTime(System.currentTimeMillis() - this.q);
    boolean bool = false;
    if (date1.before(date2)) {
      System.out.println("processor score: " + a());
      a a1 = new a();
      d d = null;
      try {
        String str = X.b(i.c, G, "").trim();
        d = a1.a(i.e("uid", ""), i.b, i.e("version", "" + i.a), i.e("installDate", ""), i.e("loopCount", ""), i.e("registrationKeyV2", ""), str, i.e("lastFileFormat", ""));
      } catch (IOException iOException) {
        System.out.println("Unable to read from update server, connection to server unavailable");
        return false;
      } 
      if (d == null)
        return false; 
      if (d.a() == 0) {
        r = false;
        F();
        i.c("lastUpdateCheckDate", "" + (new Date()).getTime());
        i.c(i.y, "false");
        i.g();
      } else if (d.a() == 2) {
        F();
        String[] arrayOfString = { "Complete Update", "Update Later" };
        boolean bool1 = (this.I || bV.a(d.b(), "Update Available", this, arrayOfString)) ? true : false;
        if (bool1) {
          if (!h.a(".") && bV.d()) {
            String str = "Elevate.exe";
            if ((new File(str)).exists()) {
              boolean bool2 = true;
              if (bool2) {
                i.c(i.y, "true");
                i.g();
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
              if (bV.a(str1, this, true))
                aN.a(i.m); 
            } 
            return true;
          } 
          try {
            b.a().a("Initializing downloads........");
            cO cO = new cO(this);
            a1.a(cO);
            a1.a(d);
            i.c(i.y, "false");
            i.g();
            bool = true;
          } catch (IOException iOException) {
            String str = "Auto update is unable to upgrade " + i.b + "\nThis is usually due to a lost connection to the internet or insufficient access \nto write to the installation directory.\n\nInternal Error:\n" + iOException.getMessage();
            bV.d(str, this);
            iOException.printStackTrace();
          } 
        } else {
          return true;
        } 
      } else if (d.a() == 1) {
        k.a(d.b(), this);
      } else if (d.a() == 8) {
        e(i.e("registrationKeyV2", ""));
        i.c("immutableInterpolation", "true");
      } else if (d.a() == 4) {
        e(i.e("registrationKeyV2", ""));
        if (d.b() != null && !d.b().equals(""))
          k.a(d.b(), this); 
        i.c("quadraticInterpolation", "true");
        i.d("valid");
        i.g();
        try {
          z();
        } catch (a a2) {
          Logger.getLogger(cd.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a2);
        } 
        System.exit(0);
      } 
      i.c("lastUpdateCheckDate", "" + (new Date()).getTime());
      i.g();
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
        if (this.a.l() != null && !this.a.l().equals(""))
          str4 = this.a.l(); 
        if (k.a()) {
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
  
  public void c() {
    EventQueue.invokeLater(new cZ(this));
  }
  
  private void C() {
    if (!isVisible())
      setVisible(true); 
    int i = getExtendedState();
    i &= 0xFFFFFFFE;
    if (bV.d()) {
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
    if (bV.a(i.b + " " + X.b(i.c, b.b, "") + " needs to restart for changes to take effect.\n\nWould you like to restart Now?", bq.a().b(), true))
      b.a().b(bq.a().b()); 
  }
  
  private void E() {
    if (bV.a("All " + i.b + " " + X.b(i.c, b.b, "") + " features will be enabled after restarting.\n\nWould you like to restart Now?", bq.a().b(), true))
      b.a().b(bq.a().b()); 
  }
  
  private void F() {
    if (cS.a().a(i.e("registrationKeyV2", "")))
      i.c("valid", "true"); 
  }
  
  private boolean G() {
    String str = i.e("version", "");
    if (!i.a.equals(str)) {
      i.c("version", i.a);
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
      String str = i.e("uid", "");
      if (!g(str)) {
        Date date = new Date();
        i.d("uid", J());
        i.d("installDate", "" + date.getTime());
        i.h();
      } 
    } catch (Exception exception) {
      System.out.println("Failed to set uid");
      exception.printStackTrace();
    } 
  }
  
  private boolean g(String paramString) {
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
      int[] arrayOfInt = c.b(networkInterface.getHardwareAddress());
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
    i.c("automaticUpdates", null);
    String str = i.a("fieldMapping", "Auto");
    if (str.equals("FieldMaps/BigStuff.properties"))
      i.c("fieldMapping", "Auto"); 
    i.c("automaticUpdates", null);
    if (!i.e("APPEND_FIELD_HP", "").trim().startsWith("[Field.TP]<"))
      i.c("APPEND_FIELD_HP", ""); 
    if (i.e("userParameter_Smoothing factor 1-10, higher makes smoother", "").equals(""))
      i.c("userParameter_Smoothing factor 1-10, higher makes smoother", "4"); 
    if (i.e("FIELD_MIN_MAX_TQ", "").equals("0;800"))
      i.c("FIELD_MIN_MAX_TQ", ""); 
    if (i.e("FIELD_MIN_MAX_HP", "").equals("0;800"))
      i.c("FIELD_MIN_MAX_HP", ""); 
    if (i.e()) {
      String str1 = i.e("firstName", "");
      String str2 = i.e("lastName", "");
      String str3 = i.e("registrationKeyV2", "");
      String str4 = i.e("userEmail", "");
      String str5 = i.e("uid", "");
      String str6 = i.e("installDate", "");
      i.d("firstName", str1);
      i.d("lastName", str2);
      i.d("registrationKeyV2", str3);
      i.d("userEmail", str4);
      i.d("uid", str5);
      i.d("installDate", str6);
      i.d("firstName");
      i.d("lastName");
      i.d("registrationKeyV2");
      i.d("userEmail");
      i.d("uid");
      i.d("installDate");
      try {
        i.h();
        i.g();
      } catch (a a1) {
        k.a(a1.getMessage(), this.i);
      } 
    } 
    String[] arrayOfString = (new File(".")).list();
    for (byte b = 0; b < arrayOfString.length; b++) {
      if (arrayOfString[b].toLowerCase().endsWith(".zip")) {
        System.out.println("Finishing installation, expanding: " + arrayOfString[b]);
        File file = new File(arrayOfString[b]);
        try {
          if (ae.a(arrayOfString[b], X.b(arrayOfString[b], ".zip", ""), null).equals(ae.a))
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
    a(jMenuBar);
    return jMenuBar;
  }
  
  private JMenuBar a(JMenuBar paramJMenuBar) {
    ee ee = new ee(this, "File");
    ee.setMnemonic('F');
    paramJMenuBar.add(ee);
    JMenuItem jMenuItem1 = new JMenuItem("Open");
    jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(79, 128));
    jMenuItem1.addActionListener(new di(this));
    ee.add(jMenuItem1);
    if (b.a().a("spoji[asfi2309jdi234iofwae2344")) {
      e e = new e("Open File on TS-Dash", true);
      e.setAccelerator(KeyStroke.getKeyStroke(67, 128));
      e.addActionListener(new dt(this));
      e.a(new dE(this));
      ee.add((JMenuItem)e);
    } 
    if (b.a().a("compareMode")) {
      e e = new e("Compare to", true);
      e.setAccelerator(KeyStroke.getKeyStroke(67, 128));
      e.addActionListener(new dP(this));
      e.a(new cf(this));
      ee.add((JMenuItem)e);
      JMenuItem jMenuItem = new JMenuItem("Trail Live File");
      jMenuItem.setAccelerator(KeyStroke.getKeyStroke(84, 128));
      jMenuItem.addActionListener(new cj(this));
      ee.add(jMenuItem);
      ej ej = new ej(this);
      ee.add((JMenuItem)ej);
    } 
    boolean bool1 = b.a().a("fileEditing");
    JMenuItem jMenuItem2 = new JMenuItem("Export Loaded Log As");
    jMenuItem2.setAccelerator(KeyStroke.getKeyStroke(69, 2));
    jMenuItem2.addActionListener(new ck(this));
    jMenuItem2.setEnabled(bool1);
    ee.add(jMenuItem2);
    JPopupMenu.Separator separator = new JPopupMenu.Separator();
    ee.add(separator);
    ee.add(U());
    ee.addSeparator();
    boolean bool2 = b.a().a("optionalFields");
    JMenu jMenu1 = O();
    jMenu1.setEnabled(bool2);
    ee.add(jMenu1);
    if (b.a().a("fa-9fdspoijoijnfdz09jfdsa098j"))
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
    e e = new e("View Log Header", true);
    e.a(new cn(this));
    e.addActionListener(new co(this));
    ee.add((JMenuItem)e);
    if (b.a().a("timeslipData")) {
      ee ee1 = new ee(this, "Drag Timeslip Preferences");
      e e1 = new e("View / Edit Timeslip", true);
      e1.a(new cp(this));
      e1.addActionListener(new cq(this));
      ee.add((JMenuItem)e1);
      JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem("Show Time Slips");
      jCheckBoxMenuItem1.setState(i.a(i.aB, i.aC));
      jCheckBoxMenuItem1.setToolTipText("<html>When checked, key Timeslip event data<br>will displayed on graph as yellow vertical bars.");
      jCheckBoxMenuItem1.addActionListener(new cr(this));
      ee1.add(jCheckBoxMenuItem1);
      JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem("Generate Time Slips");
      jCheckBoxMenuItem2.setState(i.a(i.az, i.aA));
      jCheckBoxMenuItem2.setToolTipText("<html>When checked, Timeslip data will be generated from the<br>launch condition if no time slip data has been entered.");
      jCheckBoxMenuItem2.addActionListener(new ct(this));
      ee1.add(jCheckBoxMenuItem2);
      JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem("Jump to Launch");
      jCheckBoxMenuItem3.setState(i.a(i.ax, i.ay));
      jCheckBoxMenuItem3.setToolTipText("<html>When checked, upon opening a log file the cursor<br>will jump to the launch point of the log.");
      jCheckBoxMenuItem3.addActionListener(new cu(this));
      ee1.add(jCheckBoxMenuItem3);
      ee.add(ee1);
    } 
    return ee;
  }
  
  private JMenu N() {
    ee ee = new ee(this, "Search");
    ee.setMnemonic('S');
    if (b.a().a("searchLogFiles")) {
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
    if (b.a().a("fa-9fdspoijoijnfdz09jfdsa098j")) {
      JMenu jMenu1 = new JMenu("Settings Profiles");
      c.a().a(jMenu1);
      JMenuItem jMenuItem = new JMenuItem("New Setting Profile");
      jMenuItem.addActionListener(new cz(this));
      jMenu1.add(jMenuItem);
      String str = c.a().d();
      if (!str.equals("")) {
        JMenuItem jMenuItem1 = new JMenuItem("Update Setting Profile: " + str);
        jMenuItem1.addActionListener(new cA(this));
        jMenu1.add(jMenuItem1);
      } 
      String[] arrayOfString = a.a();
      arrayOfString = S.a(arrayOfString);
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
      c.a().a(buttonGroup);
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
    if (b.a().a("tuningPanelVisible")) {
      jMenuItem2 = new JMenuItem("VE Analyze");
      jMenuItem2.addActionListener(new cG(this));
      jMenu.add(jMenuItem2);
    } 
    jMenuItem2 = new JMenuItem("Online Help");
    jMenuItem2.addActionListener(new cH(this));
    jMenu.add(jMenuItem2);
    jMenu.addSeparator();
    if (!this.s)
      i.c("automaticUpdates", "true"); 
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Automatic Update Check", i.a("automaticUpdates", true));
    jCheckBoxMenuItem.setEnabled(i.a("valid", false));
    jCheckBoxMenuItem.addItemListener(new cI(this));
    if (!this.s)
      jCheckBoxMenuItem.setEnabled(false); 
    jMenu.add(jCheckBoxMenuItem);
    JMenuItem jMenuItem3 = new JMenuItem("Check for Updates Now");
    jMenuItem3.addActionListener(new cJ(this));
    jMenu.add(jMenuItem3);
    jMenu.addSeparator();
    if (!b.a().a("hideRegisterMenu") && !this.s) {
      JMenuItem jMenuItem6 = new JMenuItem("Purchase Registration");
      jMenuItem6.addActionListener(new cK(this));
      jMenu.add(jMenuItem6);
      JMenuItem jMenuItem7 = new JMenuItem("Enter Registration");
      jMenuItem7.addActionListener(new cL(this));
      jMenu.add(jMenuItem7);
      jMenu.addSeparator();
    } 
    if (J.a()) {
      JMenu jMenu1 = new JMenu("Video driver work arounds");
      ButtonGroup buttonGroup = new ButtonGroup();
      JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem("Force OpenGL Active");
      jCheckBoxMenuItem1.addActionListener(new cM(this));
      boolean bool1 = i.a("forceOpenGL", false);
      jCheckBoxMenuItem1.setState(bool1);
      jCheckBoxMenuItem1.setToolTipText("When on will force the use of OpenGL for rendering over the default Direct X normally used on Windows.");
      jMenu1.add(jCheckBoxMenuItem1);
      buttonGroup.add(jCheckBoxMenuItem1);
      JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem("Disable Direct 3D");
      jCheckBoxMenuItem2.addActionListener(new cN(this));
      boolean bool2 = i.a("disableD3d", true);
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
    if (!b.a().a("hideTunerStudioPromo") && i.b.equals("MegaLogViewer")) {
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
  
  public void d() {
    cT cT = new cT(this);
    cT.start();
  }
  
  public void e() {
    String[] arrayOfString = { "settings" };
    String str1 = k.a(this, "Import Settings", arrayOfString, "*.settings");
    if (str1 == null || str1.equals(""))
      return; 
    File file = new File(str1);
    Properties properties = new Properties();
    try {
      FileInputStream fileInputStream = new FileInputStream(str1);
      properties.load(fileInputStream);
      fileInputStream.close();
    } catch (Exception exception) {
      k.a("Unable to open settings file " + str1 + "\nSee log for more detail.", this);
      exception.printStackTrace();
    } 
    ha ha = new ha();
    String str2 = file.getName();
    if (str2.contains("."))
      str2 = str2.substring(0, str2.lastIndexOf(".")); 
    ha.a(str2);
    ha.a(this);
    if (ha.c())
      return; 
    if (ha.b()) {
      c.a().a(ha.a(), file);
    } else {
      ArrayList<bB> arrayList = new ArrayList();
      if (a(properties, "ROOT_FIELD_")) {
        bB bB = new bB("ROOT_FIELD_", "Normalized Field Name Mapping");
        bB.a("Import Field Name Mappings in this settings file.");
        arrayList.add(bB);
      } 
      if (a(properties, "USER_FIELD_")) {
        bB bB = new bB("USER_FIELD_", "User Calculated Math Fields");
        bB.a("Import custom created Calculated Fields in this settings file.");
        arrayList.add(bB);
      } 
      if (a(properties, "APPEND_FIELD_")) {
        bB bB = new bB("APPEND_FIELD_", "Active Optional and Calculated Fields");
        bB.a("Imports which Optional and Calculated Fields are active.");
        arrayList.add(bB);
      } 
      if (a(properties, "FIELD_GROUP_NAME_")) {
        bB bB = new bB("FIELD_GROUP_NAME_", "Quick View Tabs");
        bB.a("All Quick View tabs on this PC");
        bB.b("FIELD_SELECTED_GROUP_");
        arrayList.add(bB);
      } 
      if (a(properties, "FIELD_MIN_MAX_")) {
        bB bB = new bB("FIELD_MIN_MAX_", "Field Min/Max Settings");
        bB.a("Import set Min & Max values and autoscale settings.");
        arrayList.add(bB);
      } 
      if (b.a().a("tableGenerator") && a(properties, "TABLE_GEN_VIEW_")) {
        bB bB = new bB("TABLE_GEN_VIEW_", "Histogram views");
        bB.a("Import Histogram / Table Generator views.");
        arrayList.add(bB);
      } 
      if (b.a().a("scatterPlots") && a(properties, "SCATTER_PLOT_VIEW_")) {
        bB bB = new bB("SCATTER_PLOT_VIEW_", "Scatter Plot Views");
        bB.a("Import Scatter Plot views.");
        arrayList.add(bB);
      } 
      if (b.a().a("fieldSmoothing") && a(properties, "fieldSmoothingFactor_")) {
        bB bB = new bB("fieldSmoothingFactor_", "Field Smoothing");
        bB.a("Export Smoothing factor for each field it has been set on.");
        arrayList.add(bB);
      } 
      if (a(properties, i.S)) {
        bB bB = new bB(i.S, "Viewing preferences");
        bB.b("numberOfGraphs");
        bB.b("numberOfOverlays");
        bB.b("numberOfOverlayGraphs");
        bB.a("Import number of graphs, traces per graph, Trace Value Position, etc.");
        arrayList.add(bB);
      } 
      if (a(properties, "DATA_FILTER_")) {
        bB bB = new bB("DATA_FILTER_", "Data Filters");
        bB.a("Import data filters defined for Histograms and Scatter Plots.");
        arrayList.add(bB);
      } 
      if (arrayList.isEmpty()) {
        bV.d("There are no settings in this file to import.", this);
        return;
      } 
      by by = new by(arrayList, false);
      by.a(this);
      List list = by.b();
      if (list.isEmpty())
        return; 
      if (!by.a()) {
        int i = JOptionPane.showConfirmDialog(this, "Warning!!!!\nAny formulas or settings of the same name will be overridden\n\nContinue?");
        if (i != 0)
          return; 
      } else {
        for (String str : i.e.stringPropertyNames()) {
          if (a(str, list))
            i.d(str); 
        } 
      } 
      for (String str : properties.keySet()) {
        if (a(str, list)) {
          String str3 = properties.getProperty(str);
          i.e.setProperty(str, str3);
        } 
      } 
      k.a("The Application will now restart for changes to take effect.", bq.a().b());
      b.a().b(bq.a().b());
    } 
  }
  
  private boolean a(Properties paramProperties, String paramString) {
    for (String str : paramProperties.stringPropertyNames()) {
      if (str.startsWith(paramString))
        return true; 
    } 
    return false;
  }
  
  public void f() {
    ArrayList<bB> arrayList = new ArrayList();
    bB bB = new bB("ROOT_FIELD_", "Normalized Field Name Mapping");
    bB.a("Export Field Name Mappings in the currently active Settings Profile.");
    arrayList.add(bB);
    bB = new bB("USER_FIELD_", "User Calculated Math Fields");
    bB.a("Your custom created Calculated Fields");
    arrayList.add(bB);
    bB = new bB("APPEND_FIELD_", "Active Optional and Calculated Fields");
    bB.a("Exports which Optional and Calculated Fields are active.");
    arrayList.add(bB);
    bB = new bB("FIELD_GROUP_NAME_", "Quick View Tabs");
    bB.a("All Quick View tabs on this PC");
    bB.b("FIELD_SELECTED_GROUP_");
    arrayList.add(bB);
    bB = new bB("FIELD_MIN_MAX_", "Field Min/Max Settings");
    bB.a("Export set Min & Max values and autoscale settings.");
    arrayList.add(bB);
    bB = new bB(i.S, "Viewing preferences");
    bB.b("numberOfGraphs");
    bB.b("numberOfOverlays");
    bB.b("numberOfOverlayGraphs");
    bB.a("Export number of graphs, traces per graph, Trace Value Position, etc.");
    arrayList.add(bB);
    if (b.a().a("tableGenerator")) {
      bB = new bB("TABLE_GEN_VIEW_", "Histogram Views");
      bB.a("Export Histogram / Table Generator views.");
      arrayList.add(bB);
    } 
    if (b.a().a("scatterPlots")) {
      bB = new bB("SCATTER_PLOT_VIEW_", "Scatter Plot Views");
      bB.a("Export Scatter Plot views.");
      arrayList.add(bB);
    } 
    if (b.a().a("fieldSmoothing")) {
      bB = new bB("fieldSmoothingFactor_", "Field Smoothing");
      bB.a("Export Smoothing factor for each field it has been set on.");
      arrayList.add(bB);
    } 
    if (b.a().a("scatterPlots")) {
      bB = new bB("DATA_FILTER_", "Data Filters");
      bB.a("Export data filters defined for Histograms and Scatter Plots.");
      arrayList.add(bB);
    } 
    by by = new by(arrayList, true);
    by.a(this);
    List list = by.b();
    if (list.isEmpty())
      return; 
    this.a.i();
    String[] arrayOfString = { "settings" };
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String str1 = simpleDateFormat.format(new Date());
    String str2 = k.a(this, "Export Settings", arrayOfString, "MLV" + i.c + "_" + str1 + ".settings");
    if (str2 == null || str2.equals(""))
      return; 
    if (!str2.toLowerCase().endsWith("settings"))
      str2 = str2 + ".settings"; 
    Properties properties = new Properties();
    for (String str : i.e.keySet()) {
      if (a(str, list)) {
        String str3 = i.e.getProperty(str);
        properties.setProperty(str, str3);
      } 
    } 
    File file = new File(str2);
    if (file.exists() && !bV.a("The file " + file.getName() + " already exists.\n\nOverwrite?", this, true))
      return; 
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      properties.store(fileOutputStream, "MegaLogViewer Settings");
      fileOutputStream.close();
    } catch (Exception exception) {
      k.a("Unable to save settings to " + str2 + "\nSee log for more detail.", this);
      exception.printStackTrace();
    } 
  }
  
  private boolean a(String paramString, List paramList) {
    for (String str : paramList) {
      if (paramString.startsWith(str))
        return true; 
    } 
    return false;
  }
  
  public void g() {
    k.a("No Updates Available, " + i.a + " is the latest version.", this.i);
  }
  
  public void a(JCheckBoxMenuItem paramJCheckBoxMenuItem) {
    i.c("automaticUpdates", "" + paramJCheckBoxMenuItem.getState());
  }
  
  public void c(double paramDouble) {
    String str = paramDouble + "";
    for (byte b = 0; b < this.f.getItemCount(); b++) {
      JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)this.f.getItem(b);
      ItemListener[] arrayOfItemListener = jCheckBoxMenuItem.getItemListeners();
      byte b1;
      for (b1 = 0; b1 < arrayOfItemListener.length; b1++)
        jCheckBoxMenuItem.removeItemListener(arrayOfItemListener[b1]); 
      jCheckBoxMenuItem.setState(jCheckBoxMenuItem.getName().equals(str));
      for (b1 = 0; b1 < arrayOfItemListener.length; b1++)
        jCheckBoxMenuItem.addItemListener(arrayOfItemListener[b1]); 
    } 
  }
  
  public void a(boolean paramBoolean) {
    i.c("showGraphHalfMark", paramBoolean + "");
    this.a.o();
  }
  
  public void b(boolean paramBoolean) {
    this.a.d(paramBoolean);
    i.c("showGauges", paramBoolean + "");
  }
  
  public void c(boolean paramBoolean) {
    this.a.n().c(paramBoolean);
    this.a.t();
    i.c("showDashboard", paramBoolean + "");
  }
  
  public void d(boolean paramBoolean) {
    this.a.n().a(paramBoolean);
    i.c("hideSelector", paramBoolean + "");
  }
  
  private JMenu Q() {
    boolean bool1 = b.a().a("optionalFields");
    String[] arrayOfString1 = i.e("FORMULA_GROUP_");
    for (byte b1 = 0; b1 < arrayOfString1.length; b1++) {
      String str = k.a(arrayOfString1[b1], "FORMULA_GROUP_", "");
      JMenu jMenu = b(str, "APPEND_FIELD_");
      jMenu.setText(i.b(arrayOfString1[b1]));
      jMenu.setEnabled(b.a().b(str));
      this.y.add(jMenu);
    } 
    this.y.addSeparator();
    String[] arrayOfString2 = i.g("APPEND_FIELD_");
    arrayOfString2 = k.b(arrayOfString2);
    byte b2 = 25;
    byte b3 = 1;
    this.h = new JMenu("Optional Fields");
    this.y.add(this.h);
    if (!bool1) {
      JMenuItem jMenuItem = new JMenuItem("Enable Optional Fields!");
      jMenuItem.addActionListener(new cU(this));
      this.h.add(jMenuItem);
    } 
    ArrayList<JCheckBoxMenuItem> arrayList = new ArrayList();
    for (byte b4 = 0; b4 < arrayOfString2.length; b4++) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(k.a(arrayOfString2[b4], "APPEND_FIELD_", ""));
      jCheckBoxMenuItem.setEnabled(bool1);
      String str = i.c(arrayOfString2[b4]);
      jCheckBoxMenuItem.setActionCommand(str);
      jCheckBoxMenuItem.setName(arrayOfString2[b4]);
      arrayList.add(jCheckBoxMenuItem);
      jCheckBoxMenuItem.setState(!i.e(arrayOfString2[b4], "").equals(""));
      jCheckBoxMenuItem.addItemListener(new cV(this));
      this.h.add(jCheckBoxMenuItem);
      if (b4 > 0 && b4 % b2 == 0 && b4 < arrayOfString2.length - 1) {
        this.h = new JMenu("Optional Fields " + ++b3);
        this.y.add(this.h);
      } 
    } 
    cW cW = new cW(this, arrayList);
    cW.start();
    this.y.addSeparator();
    boolean bool2 = b.a().a("customFields");
    this.g = new JMenu("Custom Fields");
    b3 = 1;
    if (!bool2) {
      JMenuItem jMenuItem = new JMenuItem("Enable Custom Fields!");
      jMenuItem.addActionListener(new cX(this));
      this.g.add(jMenuItem);
    } 
    this.y.add(this.g);
    JMenuItem jMenuItem1 = new JMenuItem("Add Custom Field");
    jMenuItem1.setAccelerator(KeyStroke.getKeyStroke(78, 3));
    jMenuItem1.addActionListener(new cY(this));
    jMenuItem1.setEnabled(bool2);
    this.g.add(jMenuItem1);
    this.g.addSeparator();
    String[] arrayOfString3 = i.f("USER_FIELD_");
    arrayOfString3 = k.a(arrayOfString3);
    for (byte b5 = 0; b5 < arrayOfString3.length; b5++) {
      String str = k.a(arrayOfString3[b5], "USER_FIELD_", "");
      a(b(str, i.e(arrayOfString3[b5], ""), !i.e("APPEND_FIELD_" + str, "").equals("")));
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
  
  public void a(String paramString1, String paramString2) {
    r r = new r(this, paramString1, paramString2);
    boolean bool = r.a();
    if (bool) {
      paramString1 = r.b();
      paramString2 = r.c();
      JMenu jMenu = b(paramString1, paramString2, true);
      if (!a(paramString1, jMenu))
        a(jMenu); 
      c("APPEND_FIELD_" + paramString1, paramString2, true);
      i.c("USER_FIELD_" + paramString1, r.c());
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
  
  private void a(JMenu paramJMenu) {
    byte b = 25;
    if ((this.z == 1 && this.g.getMenuComponentCount() == b + 2) || (this.z > 1 && this.g.getMenuComponentCount() == b)) {
      this.g = new JMenu("Custom Fields " + ++this.z);
      this.y.add(this.g);
    } 
    this.g.add(paramJMenu);
  }
  
  private boolean a(String paramString, JMenu paramJMenu) {
    i.d("USER_FIELD_" + paramString);
    i.d("APPEND_FIELD_" + paramString);
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
    String[] arrayOfString1 = k.a(i.a(paramString1 + "_OPTIONS", ""), ";");
    String[] arrayOfString2 = k.a(i.a(paramString1 + "_SOLUTIONS", ""), ";");
    JMenu jMenu = new JMenu(paramString1);
    i i = new i();
    for (byte b = 0; b < arrayOfString1.length; b++) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(X.b(arrayOfString1[b], "<semi>", ";"));
      i.a(jCheckBoxMenuItem);
      if (i.c("DEFAULT_" + paramString2 + paramString1) != null && i.c("DEFAULT_" + paramString2 + paramString1).equals(arrayOfString2[b]))
        jCheckBoxMenuItem.setText(arrayOfString1[b] + " (Default)"); 
      jCheckBoxMenuItem.setName(X.b(arrayOfString2[b], "<semi>", ";"));
      jCheckBoxMenuItem.setActionCommand(paramString2 + paramString1);
      if (i.a(paramString2 + paramString1, i.c("DEFAULT_" + paramString2 + paramString1)).equals(arrayOfString2[b]) || (i.b == null && b == arrayOfString1.length - 1 && arrayOfString2[b].indexOf("{") != -1)) {
        jCheckBoxMenuItem.setState(true);
        i.b = jCheckBoxMenuItem;
      } else {
        jCheckBoxMenuItem.setState(false);
      } 
      jCheckBoxMenuItem.addItemListener(new df(this));
      jMenu.add(jCheckBoxMenuItem);
    } 
    if (i.c("DEFAULT_" + paramString2 + paramString1) != null && !i.c("DEFAULT_" + paramString2 + paramString1).equals("")) {
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
    String str1 = i.a(i.N, i.R);
    JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem("2 Table View (Default)", i.Q.equals(str1));
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/layout2Tables.png"));
    ImageIcon imageIcon = new ImageIcon(image);
    jCheckBoxMenuItem1.setIcon(imageIcon);
    jCheckBoxMenuItem1.addItemListener(new dh(this));
    i.a(jCheckBoxMenuItem1);
    jCheckBoxMenuItem1.setEnabled(b.a().a("optionalTableLayouts"));
    jMenu1.add(jCheckBoxMenuItem1);
    jCheckBoxMenuItem1 = new JCheckBoxMenuItem("1 Table View", i.P.equals(str1));
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/layout1Table.png"));
    imageIcon = new ImageIcon(image);
    jCheckBoxMenuItem1.setIcon(imageIcon);
    jCheckBoxMenuItem1.addItemListener(new dj(this));
    i.a(jCheckBoxMenuItem1);
    jCheckBoxMenuItem1.setEnabled(b.a().a("optionalTableLayouts"));
    jMenu1.add(jCheckBoxMenuItem1);
    ee.add(jMenu1);
    if (b.a().a("selectableLookAndFeel")) {
      JMenu jMenu = new JMenu("Look and Feel");
      UIManager.LookAndFeelInfo[] arrayOfLookAndFeelInfo = UIManager.getInstalledLookAndFeels();
      i = new i();
      for (UIManager.LookAndFeelInfo lookAndFeelInfo : arrayOfLookAndFeelInfo) {
        String str3 = lookAndFeelInfo.getName();
        String str4 = i.a("lookAndFeelClass", UIManager.getSystemLookAndFeelClassName());
        if (lookAndFeelInfo.getClassName().equals(str4))
          str3 = str3 + " (Default)"; 
        if (!str3.equals("Windows Classic") && !str3.startsWith("TinyLookAndFeel")) {
          JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str3, true);
          i.a(jCheckBoxMenuItem);
          jCheckBoxMenuItem.setActionCommand(lookAndFeelInfo.getClassName());
          jCheckBoxMenuItem.setSelected(lookAndFeelInfo.getClassName().equals(i.e("lookAndFeelClass", UIManager.getSystemLookAndFeelClassName())));
          jCheckBoxMenuItem.addActionListener(new dk(this));
          jMenu.add(jCheckBoxMenuItem);
        } 
      } 
      ee.add(jMenu);
    } 
    i = new i();
    JMenu jMenu2 = new JMenu("Trace Value Positions");
    String str2 = i.e(i.S, i.T);
    JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem("Show Cursor Values At Top", str2.equals("top"));
    jCheckBoxMenuItem2.addItemListener(new dl(this));
    i.a(jCheckBoxMenuItem2);
    jMenu2.add(jCheckBoxMenuItem2);
    JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem("Show Cursor Values At Bottom", str2.equals("bottom"));
    jCheckBoxMenuItem3.addItemListener(new dm(this));
    i.a(jCheckBoxMenuItem3);
    jMenu2.add(jCheckBoxMenuItem3);
    JCheckBoxMenuItem jCheckBoxMenuItem4 = new JCheckBoxMenuItem("Show Cursor Values by Field Name", str2.equals("withLabels"));
    jCheckBoxMenuItem4.addItemListener(new dn(this));
    i.a(jCheckBoxMenuItem4);
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
      i.a(jCheckBoxMenuItem);
      jMenu4.add(jCheckBoxMenuItem);
    } 
    jMenu3.add(jMenu4);
    boolean bool1 = i.a(i.af, i.ag);
    JCheckBoxMenuItem jCheckBoxMenuItem5 = new JCheckBoxMenuItem("Antialias Line", bool1);
    jMenu3.add(jCheckBoxMenuItem5);
    jCheckBoxMenuItem5.addActionListener(new dp(this));
    boolean bool2 = i.a(i.ah, i.ai);
    aw.g(bool2);
    jCheckBoxMenuItem5 = new JCheckBoxMenuItem("Patterned Graph Lines", bool2);
    jMenu3.add(jCheckBoxMenuItem5);
    jCheckBoxMenuItem5.addActionListener(new dq(this));
    ee.add(jMenu3);
    JCheckBoxMenuItem jCheckBoxMenuItem6 = new JCheckBoxMenuItem("Quick Trace Selection");
    boolean bool3 = i.a("fieldSelectionStyle", "standardSelection").equals("selectFromDash");
    jCheckBoxMenuItem6.setState(bool3);
    jCheckBoxMenuItem6.addItemListener(new dr(this));
    jCheckBoxMenuItem6.setEnabled(b.a().a("optionalQuickSelect"));
    ee.add(jCheckBoxMenuItem6);
    e e = new e("Select Displayed Dashboard Fields", true);
    e.a(new ds(this));
    e.addActionListener(new du(this));
    e.setEnabled(b.a().a("selectableFields"));
    ee.add((JMenuItem)e);
    ee.addMenuListener(new dv(this));
    JMenu jMenu5 = new JMenu("Maximum Number of Graphs");
    ee.add(jMenu5);
    i = new i();
    int k = Integer.parseInt(i.b("numberOfGraphs", "" + i.t));
    int m = i.b("numberOfGraphs", k);
    for (byte b2 = 0; b2 < i.s; b2++) {
      String str;
      if (b2 + 1 == k) {
        str = "Up to " + (b2 + 1) + " Graphs (Default)";
      } else {
        str = "Up to " + (b2 + 1) + " Graphs";
      } 
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str);
      i.a(jCheckBoxMenuItem);
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
      i.a(jCheckBoxMenuItem);
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
    jCheckBoxMenuItem7.setState(i.a("showGauges", true));
    jCheckBoxMenuItem7.addItemListener(new dy(this));
    ee.add(jCheckBoxMenuItem7);
    JCheckBoxMenuItem jCheckBoxMenuItem8 = new JCheckBoxMenuItem("Show 50% Graph Line");
    jCheckBoxMenuItem8.setState(i.a("showGraphHalfMark", false));
    jCheckBoxMenuItem8.addItemListener(new dz(this));
    ee.add(jCheckBoxMenuItem8);
    JCheckBoxMenuItem jCheckBoxMenuItem9 = new JCheckBoxMenuItem("Keep Graph Centered");
    jCheckBoxMenuItem9.setState(i.a("holdGraphCentered", i.x));
    jCheckBoxMenuItem9.addItemListener(new dA(this));
    ee.add(jCheckBoxMenuItem9);
    if (b.a().a("tabbedQuickViews")) {
      boolean bool = i.a(i.aj, i.ak);
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Go to last Quick View on open");
      jCheckBoxMenuItem.setState(bool);
      jCheckBoxMenuItem.addItemListener(new dB(this));
      jCheckBoxMenuItem.setToolTipText("If checked, the last used Quick View tab will be selected on open, otherwise it will open to the Default tab on open");
      ee.add(jCheckBoxMenuItem);
    } 
    ee.addSeparator();
    boolean bool4 = i.a("useSwingFileDialog", true);
    if (b.a().a(";lkewlk nbi3k48tjh265'")) {
      boolean bool = i.a(i.aJ, i.aK);
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Show Multi-Log Compare Bar");
      jCheckBoxMenuItem.setState(!bool);
      jCheckBoxMenuItem.addItemListener(new dC(this));
      ee.add(jCheckBoxMenuItem);
    } 
    JCheckBoxMenuItem jCheckBoxMenuItem10 = new JCheckBoxMenuItem("Show Dashboard");
    jCheckBoxMenuItem10.setState(i.a("showDashboard", true));
    jCheckBoxMenuItem10.addItemListener(new dD(this));
    hx.a().c(new dF(this, jCheckBoxMenuItem10));
    ee.add(jCheckBoxMenuItem10);
    JCheckBoxMenuItem jCheckBoxMenuItem11 = new JCheckBoxMenuItem("Auto Hide Field Select");
    jCheckBoxMenuItem11.setState(i.a("hideSelector", i.q));
    jCheckBoxMenuItem11.addItemListener(new dG(this));
    ee.add(jCheckBoxMenuItem11);
    if (b.a().a("tuningPanelVisible")) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Show Tuning Console");
      jCheckBoxMenuItem.setState(i.a("showTuningConsole", i.p));
      jCheckBoxMenuItem.addItemListener(new dH(this));
      hx.a().b(new dI(this, jCheckBoxMenuItem));
      ee.add(jCheckBoxMenuItem);
    } else {
      i.c("showTuningConsole", "false");
    } 
    JCheckBoxMenuItem jCheckBoxMenuItem12 = new JCheckBoxMenuItem("Scale to Fit Full Log On load");
    jCheckBoxMenuItem12.setState(i.a(i.U, i.V));
    jCheckBoxMenuItem12.addItemListener(new dJ(this));
    ee.add(jCheckBoxMenuItem12);
    return ee;
  }
  
  private JMenu S() {
    ee ee = new ee(this, "Options");
    if (!b.a().a("hideRpmX100Option")) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("RPM x 100");
      jCheckBoxMenuItem.setState(i.a("RPM_USE_FORMULA", false));
      jCheckBoxMenuItem.addItemListener(new dK(this));
      ee.add(jCheckBoxMenuItem);
    } 
    if (b.a().a("fillNaN")) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Fill NaN Values with Last");
      jCheckBoxMenuItem.setState(i.a("fillNaN", i.z));
      jCheckBoxMenuItem.addItemListener(new dL(this));
      ee.add(jCheckBoxMenuItem);
    } 
    JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem("Fill Time Gaps");
    jCheckBoxMenuItem1.setState(i.a("timeGapsOn", false));
    jCheckBoxMenuItem1.addItemListener(new dM(this));
    ee.add(jCheckBoxMenuItem1);
    JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem("Alphabetize Field Lists");
    jCheckBoxMenuItem2.setState(i.a(i.E, i.F));
    jCheckBoxMenuItem2.addItemListener(new dN(this));
    ee.add(jCheckBoxMenuItem2);
    String[] arrayOfString1 = b.m;
    if (arrayOfString1 != null && arrayOfString1.length > 0 && !b.a().a("hideYaxisSelection")) {
      JMenu jMenu = new JMenu("Default Y Axis field");
      boolean bool2 = false;
      i i3 = new i();
      String str = i.a("yAxisField", "MAP");
      byte b;
      for (b = 0; b < arrayOfString1.length; b++) {
        JCheckBoxMenuItem jCheckBoxMenuItem6 = new JCheckBoxMenuItem(arrayOfString1[b], arrayOfString1[b].equals(str));
        if (arrayOfString1[b].equals(str))
          bool2 = true; 
        jCheckBoxMenuItem6.addItemListener(new dO(this));
        i3.a(jCheckBoxMenuItem6);
        jMenu.add(jCheckBoxMenuItem6);
      } 
      b = !bool2 ? 1 : 0;
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Other", b);
      jCheckBoxMenuItem.addItemListener(new dQ(this));
      i3.a(jCheckBoxMenuItem);
      jMenu.add(jCheckBoxMenuItem);
      ee.add(jMenu);
    } 
    JMenu jMenu1 = new JMenu("Mouse Wheel Action");
    i i1 = new i();
    String str1 = i.a(i.G, i.J);
    JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem("Zoom Graph In / Out (Default)", i.H.equals(str1));
    jCheckBoxMenuItem3.addItemListener(new dR(this));
    i1.a(jCheckBoxMenuItem3);
    jMenu1.add(jCheckBoxMenuItem3);
    jCheckBoxMenuItem3 = new JCheckBoxMenuItem("Page Data Forward / Back", i.I.equals(str1));
    jCheckBoxMenuItem3.addItemListener(new dS(this));
    i1.a(jCheckBoxMenuItem3);
    jMenu1.add(jCheckBoxMenuItem3);
    ee.add(jMenu1);
    JCheckBoxMenuItem jCheckBoxMenuItem4 = new JCheckBoxMenuItem("Keep Index in sync with 2nd instance");
    jCheckBoxMenuItem4.setState(i.a(i.aD, i.aE));
    jCheckBoxMenuItem4.addItemListener(new dT(this));
    ee.add(jCheckBoxMenuItem4);
    if (b.a().a(";lkewlk nbi3k48tjh265'")) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Keep Multiple Logs Open");
      jCheckBoxMenuItem.setState(i.a(i.aJ, i.aK));
      jCheckBoxMenuItem.addItemListener(new dU(this));
      ee.add(jCheckBoxMenuItem);
    } 
    if (!b.a().a("hideLoadReversedOption")) {
      this.l = new JCheckBoxMenuItem("Load File Reversed");
      this.l.setToolTipText("Only Applies to DTA logs");
      this.l.setState(i.a("loadReverse", true));
      this.l.addItemListener(new dV(this));
      this.l.setVisible(false);
      ee.add(this.l);
    } 
    ee.addSeparator();
    if (b.a().a("fieldNameNormalizationEditable")) {
      JMenu jMenu = new JMenu("Field Name Standardization");
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem("Use Name Standardization");
      boolean bool2 = i.a("fieldNameNormaization", true);
      jCheckBoxMenuItem.setSelected(bool2);
      jCheckBoxMenuItem.addActionListener(new dW(this));
      jMenu.add(jCheckBoxMenuItem);
      this.j = new JMenuItem("Edit Standardized Field Mapping");
      this.j.addActionListener(new dX(this));
      this.j.setEnabled(bool2);
      jMenu.add(this.j);
      ee.add(jMenu);
    } 
    String[] arrayOfString2 = i.e("APP_OPTION_");
    for (byte b1 = 0; b1 < arrayOfString2.length; b1++) {
      JMenu jMenu = b(k.a(arrayOfString2[b1], "APP_OPTION_", ""), "");
      String str = i.b(arrayOfString2[b1]);
      jMenu.setText(str);
      ee.add(jMenu);
    } 
    ee.addSeparator();
    String str2 = i.e("prefFontSize", eJ.a() + "");
    dY dY = new dY(this);
    int[] arrayOfInt = { 
        8, 9, 10, 11, 12, 14, 16, 17, 18, 19, 
        20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 
        30, 31, 32, 38, 44, 50 };
    int i = eJ.a();
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
        i2.a(jCheckBoxMenuItem6);
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
      i2.a(jCheckBoxMenuItem);
      jCheckBoxMenuItem.addItemListener(dY);
      jMenu2.add(jCheckBoxMenuItem);
    } 
    ee.add(jMenu2);
    JMenu jMenu3 = new JMenu("Graph Background");
    ea ea = new ea(this, this.a.n());
    a(jMenu3, ea, "graphBackColor", -1);
    ee.add(jMenu3);
    boolean bool1 = i.a(i.aa, i.ab);
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
    int i = i.a("numberOfGraphs", i.t);
    int j = i.a("numberOfOverlays", i.u);
    ea ea = new ea(this, this.a.n());
    boolean bool = i.a(i.aa, i.ab);
    if (bool) {
      k = j;
    } else {
      k = j * i;
    } 
    i.a("numberOfGraphs", i.t);
    byte b;
    for (b = 0; b < k; b++) {
      JMenu jMenu = new JMenu("Graph Color " + (b + 1));
      ea = new ea(this, this.a.n());
      a(jMenu, ea, "graphForeColor" + b, b);
      this.k.add(jMenu);
    } 
    for (b = 0; b < k; b++)
      hx.a().a(aV.a().a(b), b); 
  }
  
  private void h(String paramString) {
    if (paramString == null) {
      paramString = "{Custom Alpha-N Y axis field, this is case sensitive.}";
      paramString = a((String)null, paramString, false);
      if (paramString == null || paramString.equals(""))
        return; 
    } 
    if (paramString.equals("TP ADC") && i.e("APPEND_FIELD_TP ADC", "").equals(""))
      i.c("APPEND_FIELD_TP ADC", a((String)null, i.c("APPEND_FIELD_TP ADC"), true)); 
    System.out.println("yAxis set to" + paramString);
    i.c("yAxisField", paramString);
    if (this.a.g != null && this.a.g.isVisible() && this.a.g.f != null && k.a("Tune Settings file must be reloaded for change to take effect.\nReload now?", this, true))
      this.a.g.d(); 
  }
  
  private JMenu U() {
    JMenu jMenu = new JMenu("Play Back");
    this.e = new JMenuItem("Start Play back");
    this.e.addActionListener(new cg(this));
    jMenu.add(this.e);
    this.d = new JMenuItem("Stop Play back");
    this.d.addActionListener(new ch(this));
    jMenu.add(this.d);
    this.f = new JMenu("Play Speed");
    i i = new i();
    el el = new el(this, this.a.n());
    double[] arrayOfDouble = (this.a.n()).k;
    for (byte b = 0; b < arrayOfDouble.length; b++) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem((int)(100.0D * arrayOfDouble[b]) + "%");
      jCheckBoxMenuItem.setState((arrayOfDouble[b] == i.a("playbackSpeed", 1.0D)));
      jCheckBoxMenuItem.addItemListener(el);
      jCheckBoxMenuItem.setName(arrayOfDouble[b] + "");
      i.a(jCheckBoxMenuItem);
      this.f.add(jCheckBoxMenuItem);
    } 
    jMenu.add(this.f);
    return jMenu;
  }
  
  private JMenu a(JMenu paramJMenu, ItemListener paramItemListener, String paramString, int paramInt) {
    i i = new i();
    for (byte b = 0; b < this.c.length; b++) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(this.c[b]);
      jCheckBoxMenuItem.setState(this.c[b].equalsIgnoreCase(i.b(paramString)));
      jCheckBoxMenuItem.addItemListener(paramItemListener);
      jCheckBoxMenuItem.setName(paramString);
      i.a(jCheckBoxMenuItem);
      paramJMenu.add(jCheckBoxMenuItem);
    } 
    return paramJMenu;
  }
  
  private boolean c(String paramString1, String paramString2, boolean paramBoolean) {
    if (paramBoolean) {
      String str1 = paramString1;
      String str2 = paramString2;
      String str3 = X.b(paramString1, "APPEND_FIELD_", "");
      String[] arrayOfString = null;
      do {
        if (paramString2.contains("*") || paramString2.contains("+") || paramString2.contains("/") || paramString2.contains("-")) {
          paramString2 = a(str3, paramString2, true);
        } else if (hx.a().r() != null) {
          paramString2 = a(str3, paramString2, false);
        } 
        if (paramString2 == null || paramString2.equals("")) {
          i.d(str1);
          return false;
        } 
        if (paramString2.trim().equals("")) {
          i.d(paramString1);
          c(str3, false);
        } else {
          i.c(paramString1, paramString2);
          c(str3, true);
        } 
        arrayOfString = ai.a(str3, str2);
        if (arrayOfString == null || arrayOfString.length <= 0)
          continue; 
        paramString1 = ai.c(arrayOfString[0]);
        paramString2 = i.c(paramString1);
      } while (arrayOfString != null && arrayOfString.length > 0);
      e(paramBoolean);
    } else {
      i.d(paramString1);
    } 
    return true;
  }
  
  private void c(String paramString, boolean paramBoolean) {
    for (byte b = 0; b < this.h.getMenuComponentCount(); b++) {
      if (this.h.getMenuComponent(b) instanceof JMenu) {
        JCheckBoxMenuItem jCheckBoxMenuItem = (JCheckBoxMenuItem)this.h.getMenuComponent(b);
        if (jCheckBoxMenuItem.getText().equals(paramString)) {
          jCheckBoxMenuItem.setSelected(paramBoolean);
          return;
        } 
      } 
    } 
  }
  
  public String a(String paramString1, String paramString2, boolean paramBoolean) {
    return k.a(paramString1, paramString2, paramBoolean, null, true, this, hx.a().r());
  }
  
  public void h() {
    this.a.n().e();
  }
  
  public void i() {
    this.a.n().j();
  }
  
  public void a(String paramString, boolean paramBoolean) {
    i.c(paramString, paramBoolean + "");
    if (this.a.l() != null && k.a("Log file must be reloaded for change to take effect.\nReload now?", this, true))
      b(this.a.l(), false); 
  }
  
  public void a(String paramString, int paramInt) {
    i.c(paramString, paramInt + "");
    if (this.a.l() != null && k.a("Log file must be reloaded for change to take effect.\nReload now?", this, true))
      b(this.a.l(), false); 
  }
  
  public void j() {
    this.a.j();
  }
  
  public void k() {
    this.a.k();
  }
  
  public void l() {
    if (this.a.h()) {
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
      i.c("x", "" + getX());
      i.c("y", "" + getY());
      i.c("width", "" + getWidth());
      i.c("height", "" + getHeight());
    } 
  }
  
  public void n() {
    g.a().c();
    i.g();
    System.out.println(i.b + " shutdown: " + (new Date()).toString());
    System.out.println("##############################################################\n");
  }
  
  public void o() {
    FileDialog fileDialog = new FileDialog(this, "Save Graph to Jpeg or PNG", 1);
    fileDialog.setFile(cz.a("graph.png"));
    fileDialog.setDirectory(i.e("lastJpegDir", "."));
    fileDialog.setVisible(true);
    fileDialog.setFilenameFilter(new fD());
    if (fileDialog.getFile() != null) {
      String str = fileDialog.getFile();
      if (!str.toLowerCase().endsWith(".jpg") && !str.toLowerCase().endsWith(".jpeg") && !str.toLowerCase().endsWith(".png"))
        str = str + ".png"; 
      cz cz = new cz();
      boolean bool = false;
      try {
        bool = cz.a(V(), fileDialog.getDirectory(), str, "Graph by " + i.b + " " + i.c + " " + i.a + " " + i.m);
      } catch (Exception exception) {
        exception.printStackTrace();
      } 
      if (!bool)
        k.a("File Save Failed.", this); 
      i.c("lastJpegDir", fileDialog.getDirectory());
    } 
  }
  
  private Component V() {
    return (this.m == null) ? this.a.p() : (this.m.getTitleAt(this.m.getSelectedIndex()).equals("Log Viewer") ? this.a.p() : (this.m.getTitleAt(this.m.getSelectedIndex()).equals("Ignition Log Viewer") ? this.n.a() : (this.m.getTitleAt(this.m.getSelectedIndex()).equals("Scatter Plots") ? this.o.d() : (this.m.getTitleAt(this.m.getSelectedIndex()).equals("Histogram / Table Generator") ? this.p.e() : this.a.p()))));
  }
  
  public void p() {
    if (this.w == null) {
      if (this.x == null)
        this.x = new ed(this); 
      this.w = new g(this, this.x);
      int i = i.b(i.am, -1);
      int j = i.b(i.an, -1);
      if (j <= 0 || i <= 0) {
        this.w.pack();
      } else {
        this.w.setSize(i, j);
      } 
      this.w.a(new ci(this));
      bV.a(this.i, (Component)this.w);
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
    a((String[])null);
  }
  
  public void a(String[] paramArrayOfString) {
    if (paramArrayOfString == null)
      paramArrayOfString = b("Open Log File"); 
    if (paramArrayOfString != null)
      a(paramArrayOfString, false); 
    cS.a().a(this);
    i.g();
  }
  
  public void s() {
    String[] arrayOfString = b("Trail Log File");
    if (arrayOfString != null)
      b(arrayOfString[0], true); 
    i.g();
    (new em(this)).start();
    cS.a().a(this);
  }
  
  public void t() {
    String[] arrayOfString = b("Open Compare File");
    if (arrayOfString != null)
      c(arrayOfString[0]); 
  }
  
  public void u() {
    String str = bt.a(bt.a);
    a(str);
  }
  
  public void a(String paramString) {
    f f = new f();
    f.a((et)new dQ(i.f(), "AppHelpViewer"));
    try {
      f.b(paramString);
    } catch (a a1) {
      D.a("Unable to open help:\n" + paramString, (Exception)a1, this.i);
    } 
    f.a(this.i, i.b + " Help");
  }
  
  public void v() {
    dS dS = new dS(this, new eg(this));
    k.a(this, (Dialog)dS);
    dS.setModal(true);
    dS.setVisible(true);
  }
  
  public String[] b(String paramString) {
    String[] arrayOfString1 = W();
    String str = i.e("lastFileDir", h.d());
    ar ar = new ar(i.f(), "FileDialog_");
    String[] arrayOfString2 = bV.a(this, paramString, arrayOfString1, (String)null, str, true, null, true, (ap)ar);
    if (arrayOfString2 != null && arrayOfString2.length >= 1 && arrayOfString2[0] != null && arrayOfString2[0].lastIndexOf(File.separator) != -1) {
      String str1 = arrayOfString2[0].substring(0, arrayOfString2[0].lastIndexOf(File.separator));
      i.c("lastFileDir", str1);
    } 
    return arrayOfString2;
  }
  
  private String[] W() {
    String str = i.a("fileExtensions", "msl;xls;txt;dif;msq;csv");
    return k.a(str, ";");
  }
  
  public File w() {
    return this.t;
  }
  
  public void b(String paramString, boolean paramBoolean) {
    String[] arrayOfString = new String[1];
    arrayOfString[0] = paramString;
    this.a.a(arrayOfString, paramBoolean);
    if (this.m != null && this.m.e("Purchase Registration"))
      this.m.g("Log Viewer"); 
    this.t = new File(paramString);
    this.u.a(paramString);
    setTitle(this.t.getName());
  }
  
  public void a(String[] paramArrayOfString, boolean paramBoolean) {
    File file = new File(paramArrayOfString[0]);
    if (b.a().a("triggerLogViewer") && U.a(file)) {
      this.n.a(file.getAbsolutePath());
      if (this.m != null)
        this.m.g("Ignition Log Viewer"); 
    } else if (U.b(file)) {
      if (b.a().a("tuningPanelVisible")) {
        try {
          this.a.b(true);
          i.c("showTuningConsole", "true");
          this.a.d(paramArrayOfString[0]);
        } catch (a a1) {
          bV.d(a1.getMessage(), this);
        } 
        this.m.g("Log Viewer");
      } else {
        String str1 = paramArrayOfString[0].substring(paramArrayOfString[0].lastIndexOf("."));
        bV.d("The Lite! Edition can not load and edit " + str1 + " (tune settings) files. \nPlease Check Out the registered version for \nAdvanced Features to bring you a tune like never before.", this);
      } 
    } else {
      this.a.a(paramArrayOfString, paramBoolean);
      if (this.m != null && !this.m.e("Log Viewer") && !this.m.e("Scatter Plots"))
        this.m.g("Log Viewer"); 
      this.t = file;
      if (this.l != null)
        try {
          this.l.setVisible(X.F.equals(X.a(file)));
        } catch (FileNotFoundException fileNotFoundException) {
        
        } catch (a a1) {} 
    } 
    String str = paramArrayOfString[0].substring(paramArrayOfString[0].lastIndexOf(File.separator) + 1);
    this.u.a(paramArrayOfString[0]);
    setTitle(str);
  }
  
  public void c(String paramString) {
    this.a.c(paramString);
    File file = new File(paramString);
    setTitle(this.t.getName() + " - " + file.getName());
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
        i.c(i.al, "true");
      } else {
        i.c(i.al, "false");
      } 
    } 
    super.processEvent(paramAWTEvent);
  }
  
  public void setTitle(String paramString) {
    super.setTitle(i.b + " " + i.c + " " + i.a + " - " + paramString);
  }
  
  public void d(String paramString) {
    if (paramString != null)
      if (paramString.equals("lineGraph")) {
        if (!this.m.e("Log Viewer"))
          this.m.g("Log Viewer"); 
      } else if (paramString.equals("ignitionLogger")) {
        if (!this.m.e("Ignition Log Viewer"))
          this.m.g("Ignition Log Viewer"); 
      } else if (paramString.equals("scatterPlot")) {
        if (!this.m.e("Scatter Plots"))
          this.m.g("Scatter Plots"); 
      } else if (paramString.equals("histogram") && !this.m.e("Histogram / Table Generator")) {
        this.m.g("Histogram / Table Generator");
      }  
  }
  
  public String x() {
    String str = i.c("registrationUrl");
    if (str == null || str.equals(""))
      try {
        str = "file://" + (new File(".")).getCanonicalPath() + "/help/register.html";
      } catch (Exception exception) {
        k.a("While online go to\n" + i.n, this.i);
      }  
    return str;
  }
  
  protected void y() {
    k.a("Failed to open file for trailing, timeout.", this);
  }
  
  public void e(boolean paramBoolean) {
    if (this.a.l() != null && paramBoolean && 0 == JOptionPane.showConfirmDialog(this, "Log file must be reloaded for change to take effect.\nReload now?", "Reload?", 0)) {
      this.a.v();
      b(this.a.l(), false);
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/cd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */