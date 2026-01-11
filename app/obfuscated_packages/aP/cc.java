package aP;

import G.R;
import G.T;
import V.ExceptionInVPackage;
import W.n;
import aE.ExceptionInVPackage;
import aE.AeInterfaceEcho;
import ac.AcComponentCharlie;
import ac.AcInterfaceFoxtrot;
import ac.AcInterfaceRomeo;
import ao.aw;
import ao.bB;
import ao.bK;
import ao.bY;
import ao.bq;
import ao.by;
import ao.hx;
import ao.IOProperties;
import as.JPanelExtensionUsingFileAccessPreferences;
import as.JDialogExtensionDispose;
import ay.ExceptionInVPackage;
import bA.AeInterfaceEcho;
import bH.D;
import bH.X;
import bh.JPanelExtensionUsingFileAccessPreferences;
import bh.BhInterfaceVictor;
import bt.d;
import bu.ExceptionInVPackage;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.fp;
import JDialogExtensionDispose.k;
import h.JPanelExtensionUsingFileAccessPreferences;
import h.IOProperties;
import IOProperties.ExceptionInVPackage;
import IOProperties.AcComponentCharlie;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.KeyEventDispatcher;
import java.awt.Toolkit;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
import n.ExceptionInVPackage;
import n.JDialogExtensionDispose;
import AcInterfaceRomeo.ExceptionInVPackage;
import AcInterfaceRomeo.IOProperties;
import AcInterfaceRomeo.j;
import s.JDialogExtensionDispose;

public class cc extends d implements AeInterfaceEcho, AcInterfaceFoxtrot, ExceptionInVPackage, JDialogExtensionDispose {
  R ExceptionInVPackage = null;
  
  JPanelExtensionUsingFileAccessPreferences JPanelExtensionUsingFileAccessPreferences = null;
  
  bY AcComponentCharlie = null;
  
  public static String d = JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Start Data Logging");
  
  public static String AeInterfaceEcho = JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Start capturing ExceptionInVPackage new Data Log to ExceptionInVPackage file.");
  
  public static String AcInterfaceFoxtrot = JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Open Data Log");
  
  public static String JDialogExtensionDispose = JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Compare Log");
  
  public static String h = JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Open 2nd Data Log");
  
  public static String IOProperties = JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Open an existing data log file.");
  
  public static String j = JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Open TS-Dash Log");
  
  public static String k = JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Only enabled if ExceptionInVPackage TS Dash is detected on the same subnet. You are then able to download and open ExceptionInVPackage log directly from your Dashboard.");
  
  public static String l = JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Stop Data Logging");
  
  public static String m = JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Stop capturing Log to ExceptionInVPackage file.");
  
  public static String n = JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Log Viewing Settings.");
  
  public static String o = JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("View Hot Key List.");
  
  public static String p = JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("View in MegaLogViewer");
  
  public static String q = JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("When checked, log file values will be published to the entire application if offline.");
  
  JButton AcInterfaceRomeo = null;
  
  JButton s = null;
  
  JButton t = null;
  
  JButton u = null;
  
  JButton BhInterfaceVictor = null;
  
  JButton w = null;
  
  JButton x = null;
  
  JButton y = null;
  
  JCheckBox z = null;
  
  JLabel A = null;
  
  JLabel B = null;
  
  String C = "";
  
  File D = null;
  
  BhInterfaceVictor E = new BhInterfaceVictor();
  
  JDialogExtensionDispose F = null;
  
  boolean G = true;
  
  public cc() {
    bK bK = new bK(hx.ExceptionInVPackage());
    bq.ExceptionInVPackage().ExceptionInVPackage(bK);
    hx.ExceptionInVPackage().ExceptionInVPackage((ExceptionInVPackage)bK);
    this.JPanelExtensionUsingFileAccessPreferences = new JPanelExtensionUsingFileAccessPreferences();
    this.JPanelExtensionUsingFileAccessPreferences.setOpaque(true);
    this.JPanelExtensionUsingFileAccessPreferences.p().AcInterfaceFoxtrot(false);
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JMenuBar jMenuBar = new JMenuBar();
    JMenu jMenu = new JMenu(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("File"));
    JMenuItem jMenuItem = new JMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Open Log"));
    jMenuItem.addActionListener(new cd(this));
    jMenu.add(jMenuItem);
    jMenuBar.add(jMenu);
    JToolBar jToolBar = new JToolBar();
    try {
      Image image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.n, (Component)this);
      ImageIcon imageIcon = new ImageIcon(image);
      this.AcInterfaceRomeo = new JButton(d, imageIcon);
      this.AcInterfaceRomeo.setFocusable(false);
      this.AcInterfaceRomeo.setToolTipText(AeInterfaceEcho);
      this.AcInterfaceRomeo.addActionListener(new cn(this));
      jToolBar.add(this.AcInterfaceRomeo);
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.p, (Component)this);
      imageIcon = new ImageIcon(image);
      this.s = new JButton(l, imageIcon);
      this.s.setFocusable(false);
      this.s.setToolTipText(m);
      this.s.addActionListener(new cy(this));
      jToolBar.add(this.s);
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.AcInterfaceRomeo, (Component)this);
      imageIcon = new ImageIcon(image);
      this.t = new JButton(AcInterfaceFoxtrot, imageIcon);
      this.t.setFocusable(false);
      this.t.setToolTipText(IOProperties);
      this.t.addActionListener(new cJ(this));
      jToolBar.add(this.t);
      this.u = new JButton(JDialogExtensionDispose, imageIcon);
      this.u.setFocusable(false);
      this.u.setToolTipText(h);
      this.u.addActionListener(new cU(this));
      jToolBar.add(this.u);
      this.BhInterfaceVictor = new JButton(j, imageIcon);
      this.BhInterfaceVictor.setFocusable(false);
      this.BhInterfaceVictor.setToolTipText(k);
      this.BhInterfaceVictor.addActionListener(new cW(this));
      jToolBar.add(this.BhInterfaceVictor);
      this.BhInterfaceVictor.setVisible(false);
      jToolBar.add(new JLabel("     "));
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.C, (Component)this);
      imageIcon = new ImageIcon(image);
      this.y = new JButton(null, imageIcon);
      this.y.setFocusable(false);
      this.y.setToolTipText(p);
      this.y.addActionListener(new cX(this));
      jToolBar.add(this.y);
      jToolBar.add(new JLabel("     "));
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.s, (Component)this);
      imageIcon = new ImageIcon(image);
      this.w = new JButton(null, imageIcon);
      this.w.setFocusable(false);
      this.w.setToolTipText(n);
      this.w.addActionListener(new cY(this));
      jToolBar.add(this.w);
      jToolBar.add(new JLabel("     "));
      image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.AcInterfaceFoxtrot, (Component)this);
      imageIcon = new ImageIcon(image);
      this.x = new JButton(null, imageIcon);
      this.x.setFocusable(false);
      this.x.setToolTipText(o);
      this.x.addActionListener(new cZ(this));
      jToolBar.add(this.x);
      this.z = new JCheckBox(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Full Application Playback"));
      if (IOProperties.ExceptionInVPackage().ExceptionInVPackage(" a09kmfds098432lkg89vlk")) {
        this.z.setToolTipText(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences(q));
        this.z.setSelected(ExceptionInVPackage.ExceptionInVPackage().AcComponentCharlie(ExceptionInVPackage.P, ExceptionInVPackage.Q));
        this.z.addActionListener(new ce(this));
        boolean bool = true;
        if (bool) {
          this.z.setSelected(true);
        } else {
          jToolBar.add(this.z);
        } 
      } else {
        this.z.setSelected(false);
      } 
      jToolBar.add(new JLabel("     "));
      this.A = new JLabel();
      jToolBar.add(this.A);
      jToolBar.add(new JLabel("     "));
      this.B = new JLabel();
      jToolBar.add(this.B);
    } catch (ExceptionInVPackage a1) {
      bV.d(a1.getMessage(), (Component)this);
    } 
    jPanel1.add("South", jToolBar);
    add("North", jPanel1);
    add("Center", (Component)this.JPanelExtensionUsingFileAccessPreferences);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 1));
    bq.ExceptionInVPackage().ExceptionInVPackage(jPanel2);
    add(jPanel2, "South");
    AeInterfaceEcho();
    AcComponentCharlie.ExceptionInVPackage().ExceptionInVPackage(this);
    AcComponentCharlie.ExceptionInVPackage().ExceptionInVPackage((ExceptionInVPackage)this.E);
    AcComponentCharlie.ExceptionInVPackage().ExceptionInVPackage(new cf(this));
    ExceptionInVPackage.AcComponentCharlie().ExceptionInVPackage(new db(this));
    if (!ExceptionInVPackage.AcComponentCharlie().AeInterfaceEcho())
      ExceptionInVPackage.AcComponentCharlie().JDialogExtensionDispose(); 
  }
  
  public void AeInterfaceEcho() {
    cg cg = new cg(this);
    if (SwingUtilities.isEventDispatchThread()) {
      cg.run();
    } else {
      SwingUtilities.invokeLater(cg);
    } 
  }
  
  private void IOProperties() {
    n n = hx.ExceptionInVPackage().AcInterfaceRomeo();
    if (n != null) {
      ExceptionInVPackage a1 = ExceptionInVPackage.ExceptionInVPackage(n);
      if (a1.h()) {
        String str1 = "";
        String str2 = "";
        double d1 = a1.ExceptionInVPackage();
        if (!Double.isNaN(d1) && d1 > 0.0D) {
          str1 = str1 + "60ft: " + d1;
          str2 = str2 + "60 ft: " + d1 + "<br>";
        } 
        d1 = a1.JDialogExtensionDispose();
        if (!Double.isNaN(d1) && d1 > 0.0D) {
          str1 = str1 + " 330ft: " + d1;
          str2 = str2 + "330 ft: " + d1 + "<br>";
        } 
        d1 = a1.JPanelExtensionUsingFileAccessPreferences();
        if (!Double.isNaN(d1) && d1 > 0.0D) {
          str1 = str1 + " 660ft: " + d1;
          str2 = str2 + "660 ft: " + d1 + "<br>";
        } 
        d1 = a1.AcComponentCharlie();
        if (!Double.isNaN(d1) && d1 > 0.0D) {
          str1 = str1 + " 660MPH: " + d1;
          str2 = str2 + "660 MPH: " + d1 + "<br>";
        } 
        d1 = a1.d();
        if (!Double.isNaN(d1) && d1 > 0.0D) {
          str1 = str1 + " 1320ft: " + d1;
          str2 = str2 + "1320 ft: " + d1 + "<br>";
        } 
        d1 = a1.AeInterfaceEcho();
        if (!Double.isNaN(d1) && d1 > 0.0D) {
          str1 = str1 + " 1320MPH: " + d1;
          str2 = str2 + "1320 MPH: " + d1 + "<br>";
        } 
        d1 = a1.AcInterfaceFoxtrot();
        if (!Double.isNaN(d1) && d1 > 0.0D)
          str2 = str2 + "DA: " + d1 + "<br>"; 
        if (str2.length() > 0) {
          this.B.setText(str1);
          this.B.setToolTipText("<html>" + str2 + "</html>");
        } else {
          this.B.setText("");
          this.B.setToolTipText((String)null);
        } 
      } else {
        this.B.setText("");
        this.B.setToolTipText((String)null);
      } 
    } 
  }
  
  private void j() {
    if (this.AcInterfaceRomeo != null) {
      ch ch = new ch(this);
      ci ci = new ci(this, ch);
      ci.start();
    } 
  }
  
  private void k() {
    this.JPanelExtensionUsingFileAccessPreferences.j();
  }
  
  private void m() {
    JPopupMenu jPopupMenu = new JPopupMenu();
    ExceptionInVPackage(jPopupMenu);
    this.w.add(jPopupMenu);
    jPopupMenu.show(this.w, 0, this.w.getHeight());
  }
  
  private void ExceptionInVPackage(JPopupMenu paramJPopupMenu) {
    JMenu jMenu1 = new JMenu(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Graphing View Layout"));
    IOProperties IOProperties = new IOProperties();
    String str1 = IOProperties.ExceptionInVPackage(IOProperties.N, IOProperties.R);
    JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("2 Table View (Default)"), IOProperties.Q.equals(str1));
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/layout2Tables.png"));
    ImageIcon imageIcon = new ImageIcon(image);
    jCheckBoxMenuItem1.setIcon(imageIcon);
    jCheckBoxMenuItem1.addItemListener(new cj(this));
    IOProperties.ExceptionInVPackage(jCheckBoxMenuItem1);
    jMenu1.add(jCheckBoxMenuItem1);
    jCheckBoxMenuItem1 = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("1 Table View"), IOProperties.P.equals(str1));
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/layout1Table.png"));
    imageIcon = new ImageIcon(image);
    jCheckBoxMenuItem1.setIcon(imageIcon);
    jCheckBoxMenuItem1.addItemListener(new ck(this));
    IOProperties.ExceptionInVPackage(jCheckBoxMenuItem1);
    jMenu1.add(jCheckBoxMenuItem1);
    jCheckBoxMenuItem1 = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("No Table View"), IOProperties.O.equals(str1));
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/layout1Table.png"));
    imageIcon = new ImageIcon(image);
    jCheckBoxMenuItem1.setIcon(imageIcon);
    jCheckBoxMenuItem1.addItemListener(new cl(this));
    IOProperties.ExceptionInVPackage(jCheckBoxMenuItem1);
    jMenu1.add(jCheckBoxMenuItem1);
    paramJPopupMenu.add(jMenu1);
    boolean bool1 = JPanelExtensionUsingFileAccessPreferences.ExceptionInVPackage().ExceptionInVPackage("fileEditing");
    if (bool1 && this.C.toLowerCase().endsWith(".mlg")) {
      JMenuItem jMenuItem = new JMenuItem("Export Data to " + ExceptionInVPackage.cs);
      jMenuItem.addActionListener(new cm(this));
      jMenuItem.setEnabled(!AcInterfaceRomeo.ExceptionInVPackage());
      paramJPopupMenu.add(jMenuItem);
    } 
    paramJPopupMenu.add(n());
    paramJPopupMenu.addSeparator();
    JMenu jMenu2 = new JMenu(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Mouse Wheel Action"));
    IOProperties = new IOProperties();
    String str2 = IOProperties.ExceptionInVPackage(IOProperties.G, IOProperties.J);
    JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Zoom Graph In / Out (Default)"), IOProperties.H.equals(str2));
    jCheckBoxMenuItem2.addItemListener(new co(this));
    IOProperties.ExceptionInVPackage(jCheckBoxMenuItem2);
    jMenu2.add(jCheckBoxMenuItem2);
    jCheckBoxMenuItem2 = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Page Data Forward / Back"), IOProperties.I.equals(str2));
    jCheckBoxMenuItem2.addItemListener(new cp(this));
    IOProperties.ExceptionInVPackage(jCheckBoxMenuItem2);
    jMenu2.add(jCheckBoxMenuItem2);
    paramJPopupMenu.add(jMenu2);
    JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Show 50% Graph Line"));
    jCheckBoxMenuItem3.setState(IOProperties.ExceptionInVPackage("showGraphHalfMark", false));
    jCheckBoxMenuItem3.addItemListener(new cq(this));
    paramJPopupMenu.add(jCheckBoxMenuItem3);
    IOProperties = new IOProperties();
    boolean bool2 = IOProperties.ExceptionInVPackage(IOProperties.K, true);
    boolean bool3 = IOProperties.ExceptionInVPackage(IOProperties.L, IOProperties.M);
    JMenu jMenu3 = new JMenu("Graph Text Options");
    JCheckBoxMenuItem jCheckBoxMenuItem4 = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Show Graph Text"));
    jCheckBoxMenuItem4.setState((bool2 && bool3));
    jCheckBoxMenuItem4.addItemListener(new cr(this));
    jMenu3.add(jCheckBoxMenuItem4);
    IOProperties.ExceptionInVPackage(jCheckBoxMenuItem4);
    jCheckBoxMenuItem4 = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Show Graph Text without Min/Max"));
    jCheckBoxMenuItem4.setState((bool2 && !bool3));
    jCheckBoxMenuItem4.addItemListener(new cs(this));
    jMenu3.add(jCheckBoxMenuItem4);
    IOProperties.ExceptionInVPackage(jCheckBoxMenuItem4);
    jCheckBoxMenuItem4 = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("No Text, Values only"));
    jCheckBoxMenuItem4.setState((!bool2 && !bool3));
    jCheckBoxMenuItem4.addItemListener(new ct(this));
    jMenu3.add(jCheckBoxMenuItem4);
    IOProperties.ExceptionInVPackage(jCheckBoxMenuItem4);
    paramJPopupMenu.add(jMenu3);
    cu cu = new cu(this);
    IOProperties = new IOProperties();
    int j = IOProperties.JPanelExtensionUsingFileAccessPreferences("lineTraceSize", IOProperties.ae);
    JMenu jMenu4 = new JMenu("Trace Line Style");
    JMenu jMenu5 = new JMenu("Line width");
    for (byte b1 = 1; b1 < 6; b1++) {
      String str = b1 + "";
      if (b1 == 1)
        str = str + " (Default)"; 
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str, (j == b1));
      jCheckBoxMenuItem.setActionCommand("" + b1);
      jCheckBoxMenuItem.addItemListener(cu);
      IOProperties.ExceptionInVPackage(jCheckBoxMenuItem);
      jMenu5.add(jCheckBoxMenuItem);
    } 
    jMenu4.add(jMenu5);
    boolean bool4 = IOProperties.ExceptionInVPackage(IOProperties.af, IOProperties.ag);
    JCheckBoxMenuItem jCheckBoxMenuItem5 = new JCheckBoxMenuItem("Antialias Line", bool4);
    jMenu4.add(jCheckBoxMenuItem5);
    jCheckBoxMenuItem5.addActionListener(new cv(this));
    boolean bool5 = IOProperties.ExceptionInVPackage(IOProperties.ah, IOProperties.ai);
    aw.JDialogExtensionDispose(bool5);
    jCheckBoxMenuItem5 = new JCheckBoxMenuItem("Patterned Graph Lines", bool5);
    jMenu4.add(jCheckBoxMenuItem5);
    jCheckBoxMenuItem5.addActionListener(new cw(this));
    paramJPopupMenu.add(jMenu4);
    JMenuItem jMenuItem1 = new JMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Field Limits editor"));
    jMenuItem1.addActionListener(new cx(this));
    paramJPopupMenu.add(jMenuItem1);
    JCheckBoxMenuItem jCheckBoxMenuItem6 = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Keep Graph Centered"));
    jCheckBoxMenuItem6.setState(IOProperties.ExceptionInVPackage("holdGraphCentered", IOProperties.x));
    jCheckBoxMenuItem6.addItemListener(new cz(this));
    paramJPopupMenu.add(jCheckBoxMenuItem6);
    IOProperties = new IOProperties();
    JMenu jMenu6 = new JMenu(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Trace Value Positions"));
    String str3 = IOProperties.AeInterfaceEcho(IOProperties.S, IOProperties.T);
    JCheckBoxMenuItem jCheckBoxMenuItem7 = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Show Cursor Values At Top"), str3.equals("top"));
    jCheckBoxMenuItem7.addItemListener(new cA(this));
    IOProperties.ExceptionInVPackage(jCheckBoxMenuItem7);
    jMenu6.add(jCheckBoxMenuItem7);
    JCheckBoxMenuItem jCheckBoxMenuItem8 = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Show Cursor Values At Bottom"), str3.equals("bottom"));
    jCheckBoxMenuItem8.addItemListener(new cB(this));
    IOProperties.ExceptionInVPackage(jCheckBoxMenuItem8);
    jMenu6.add(jCheckBoxMenuItem8);
    JCheckBoxMenuItem jCheckBoxMenuItem9 = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Show Cursor Values by Field Name"), str3.equals("withLabels"));
    jCheckBoxMenuItem9.addItemListener(new cC(this));
    IOProperties.ExceptionInVPackage(jCheckBoxMenuItem9);
    jMenu6.add(jCheckBoxMenuItem9);
    paramJPopupMenu.add(jMenu6);
    JCheckBoxMenuItem jCheckBoxMenuItem10 = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Alphabetize Field Lists"));
    jCheckBoxMenuItem10.setState(IOProperties.ExceptionInVPackage(IOProperties.E, IOProperties.F));
    jCheckBoxMenuItem10.addItemListener(new cD(this));
    paramJPopupMenu.add(jCheckBoxMenuItem10);
    JCheckBoxMenuItem jCheckBoxMenuItem11 = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Scale to Log Length on load"));
    jCheckBoxMenuItem11.setState(IOProperties.ExceptionInVPackage(IOProperties.U, IOProperties.V));
    jCheckBoxMenuItem11.addItemListener(new cE(this));
    paramJPopupMenu.add(jCheckBoxMenuItem11);
    JMenu jMenu7 = new JMenu("Maximum Number of Graphs");
    paramJPopupMenu.add(jMenu7);
    IOProperties = new IOProperties();
    int k = Integer.parseInt(IOProperties.JPanelExtensionUsingFileAccessPreferences("numberOfGraphs", "" + IOProperties.t));
    int m = IOProperties.JPanelExtensionUsingFileAccessPreferences("numberOfGraphs", k);
    for (byte b2 = 0; b2 < IOProperties.s; b2++) {
      String str;
      if (b2 + 1 == k) {
        str = "Up to " + (b2 + 1) + " Graphs (Default)";
      } else {
        str = "Up to " + (b2 + 1) + " Graphs";
      } 
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str);
      IOProperties.ExceptionInVPackage(jCheckBoxMenuItem);
      jCheckBoxMenuItem.setActionCommand("" + (b2 + 1));
      if (b2 + 1 == m) {
        jCheckBoxMenuItem.setSelected(true);
      } else {
        jCheckBoxMenuItem.setSelected(false);
      } 
      jCheckBoxMenuItem.addActionListener(new cF(this));
      jMenu7.add(jCheckBoxMenuItem);
    } 
    JMenu jMenu8 = new JMenu("Maximum Traces Per Graph");
    paramJPopupMenu.add(jMenu8);
    IOProperties = new IOProperties();
    int n = Integer.parseInt(IOProperties.JPanelExtensionUsingFileAccessPreferences("numberOfOverlays", "" + IOProperties.u));
    int i1 = IOProperties.JPanelExtensionUsingFileAccessPreferences("numberOfOverlays", n);
    for (byte b3 = 1; b3 < IOProperties.AcInterfaceRomeo; b3++) {
      String str;
      if (b3 + 1 == n) {
        str = "Up to " + (b3 + 1) + " Traces (Default)";
      } else {
        str = "Up to " + (b3 + 1) + " Traces";
      } 
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str);
      IOProperties.ExceptionInVPackage(jCheckBoxMenuItem);
      jCheckBoxMenuItem.setActionCommand("" + (b3 + 1));
      if (b3 + 1 == i1) {
        jCheckBoxMenuItem.setSelected(true);
      } else {
        jCheckBoxMenuItem.setSelected(false);
      } 
      jCheckBoxMenuItem.addActionListener(new cG(this));
      jMenu8.add(jCheckBoxMenuItem);
    } 
    JMenuItem jMenuItem2 = new JMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Select Displayed Fields"));
    jMenuItem2.addActionListener(new cH(this));
    jMenuItem2.setEnabled(JPanelExtensionUsingFileAccessPreferences.ExceptionInVPackage().ExceptionInVPackage("selectableFields"));
    paramJPopupMenu.add(jMenuItem2);
    JCheckBoxMenuItem jCheckBoxMenuItem12 = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Quick Trace Selection"));
    boolean bool6 = IOProperties.ExceptionInVPackage("fieldSelectionStyle", "standardSelection").equals("selectFromDash");
    jCheckBoxMenuItem12.setSelected(bool6);
    jCheckBoxMenuItem12.addActionListener(new cI(this));
    paramJPopupMenu.add(jCheckBoxMenuItem12);
    if (!bool6) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Hiding Field Select"));
      boolean bool = IOProperties.ExceptionInVPackage("hideSelector", IOProperties.q);
      jCheckBoxMenuItem.setSelected(bool);
      jCheckBoxMenuItem.addActionListener(new cK(this));
      paramJPopupMenu.add(jCheckBoxMenuItem);
    } 
    JCheckBoxMenuItem jCheckBoxMenuItem13 = new JCheckBoxMenuItem("Keep Logs Loaded for Selection");
    jCheckBoxMenuItem13.setState(IOProperties.ExceptionInVPackage(IOProperties.aJ, IOProperties.aK));
    jCheckBoxMenuItem13.setToolTipText("Will place ExceptionInVPackage toolbar above graph to quickly switch and commpare loaded logs.");
    jCheckBoxMenuItem13.addItemListener(new cL(this));
    paramJPopupMenu.add(jCheckBoxMenuItem13);
    JCheckBoxMenuItem jCheckBoxMenuItem14 = new JCheckBoxMenuItem("Keep Index in sync with MegaLogViewer");
    jCheckBoxMenuItem14.setState(IOProperties.ExceptionInVPackage(IOProperties.aD, IOProperties.aE));
    jCheckBoxMenuItem14.addItemListener(new cM(this));
    paramJPopupMenu.add(jCheckBoxMenuItem14);
    if (IOProperties.ExceptionInVPackage().ExceptionInVPackage("timeslipData")) {
      AeInterfaceEcho e1 = new AeInterfaceEcho("View / Edit Timeslip", true);
      e1.ExceptionInVPackage(new cN(this));
      e1.addActionListener(new cO(this));
      paramJPopupMenu.add((JMenuItem)e1);
      JMenu jMenu = new JMenu("Drag Timeslip Preferences");
      JCheckBoxMenuItem jCheckBoxMenuItem15 = new JCheckBoxMenuItem("Show Time Slips");
      jCheckBoxMenuItem15.setState(IOProperties.ExceptionInVPackage(IOProperties.aB, IOProperties.aC));
      jCheckBoxMenuItem15.setToolTipText("<html>When checked, key Timeslip event data<br>will displayed on graph as yellow vertical bars.");
      jCheckBoxMenuItem15.addActionListener(new cP(this));
      jMenu.add(jCheckBoxMenuItem15);
      JCheckBoxMenuItem jCheckBoxMenuItem16 = new JCheckBoxMenuItem("Generate Time Slips");
      jCheckBoxMenuItem16.setState(IOProperties.ExceptionInVPackage(IOProperties.az, IOProperties.aA));
      jCheckBoxMenuItem16.setToolTipText("<html>When checked, Timeslip data will be generated from the<br>launch condition if no time slip data has been entered.");
      jCheckBoxMenuItem16.addActionListener(new cQ(this));
      jMenu.add(jCheckBoxMenuItem16);
      JCheckBoxMenuItem jCheckBoxMenuItem17 = new JCheckBoxMenuItem("Jump to Launch");
      jCheckBoxMenuItem17.setState(IOProperties.ExceptionInVPackage(IOProperties.ax, IOProperties.ay));
      jCheckBoxMenuItem17.setToolTipText("<html>When checked, upon opening ExceptionInVPackage log file the cursor<br>will jump to the launch point of the log.");
      jCheckBoxMenuItem17.addActionListener(new cR(this));
      jMenu.add(jCheckBoxMenuItem17);
      paramJPopupMenu.add(jMenu);
    } 
    paramJPopupMenu = fp.ExceptionInVPackage(paramJPopupMenu);
  }
  
  private JMenu n() {
    JMenu jMenu = new JMenu("Settings import / export");
    JMenuItem jMenuItem1 = new JMenuItem("Export Settings to file");
    jMenuItem1.addActionListener(new cS(this));
    jMenu.add(jMenuItem1);
    JMenuItem jMenuItem2 = new JMenuItem("Import Settings file");
    jMenuItem2.addActionListener(new cT(this));
    jMenu.add(jMenuItem2);
    return jMenu;
  }
  
  public void AcInterfaceFoxtrot() {
    ArrayList<bB> arrayList = new ArrayList();
    bB bB = new bB("FIELD_GROUP_NAME_", "Quick View Tabs");
    bB.ExceptionInVPackage("All Quick View tabs on this PC");
    bB.JPanelExtensionUsingFileAccessPreferences("FIELD_SELECTED_GROUP_");
    arrayList.add(bB);
    bB = new bB("FIELD_MIN_MAX_", "Field Min/Max Settings");
    bB.ExceptionInVPackage("Export set Min & Max values and autoscale settings.");
    arrayList.add(bB);
    bB = new bB(IOProperties.S, "Viewing preferences");
    bB.JPanelExtensionUsingFileAccessPreferences("numberOfGraphs");
    bB.JPanelExtensionUsingFileAccessPreferences("numberOfOverlays");
    bB.JPanelExtensionUsingFileAccessPreferences("numberOfOverlayGraphs");
    bB.ExceptionInVPackage("Export number of graphs, traces per graph, Trace Value Position, etc.");
    arrayList.add(bB);
    by by = new by(arrayList, true);
    by.ExceptionInVPackage(bV.JPanelExtensionUsingFileAccessPreferences((Component)this));
    List list = by.JPanelExtensionUsingFileAccessPreferences();
    if (list.isEmpty())
      return; 
    String[] arrayOfString = { "settings" };
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String str1 = simpleDateFormat.format(new Date());
    String str2 = k.ExceptionInVPackage((Component)this, "Export Settings", arrayOfString, "LogViewerSettings_" + str1 + ".settings");
    if (str2 == null || str2.equals(""))
      return; 
    if (!str2.toLowerCase().endsWith("settings"))
      str2 = str2 + ".settings"; 
    Properties properties = new Properties();
    for (String str : IOProperties.AeInterfaceEcho.keySet()) {
      if (ExceptionInVPackage(str, list)) {
        String str3 = IOProperties.AeInterfaceEcho.getProperty(str);
        properties.setProperty(str, str3);
      } 
    } 
    File file = new File(str2);
    if (file.exists() && !bV.ExceptionInVPackage("The file " + file.getName() + " already exists.\n\nOverwrite?", (Component)this, true))
      return; 
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      properties.store(fileOutputStream, "Embedded LogViewer Settings");
      fileOutputStream.close();
    } catch (Exception exception) {
      k.ExceptionInVPackage("Unable to save settings to " + str2 + "\nSee log for more detail.", (Component)this);
      exception.printStackTrace();
    } 
  }
  
  public void JDialogExtensionDispose() {
    String[] arrayOfString = { "settings" };
    String str = k.ExceptionInVPackage((Component)this, "Import Settings", arrayOfString, "*.settings");
    if (str == null || str.equals(""))
      return; 
    Properties properties = new Properties();
    try {
      FileInputStream fileInputStream = new FileInputStream(str);
      properties.load(fileInputStream);
      fileInputStream.close();
    } catch (Exception exception) {
      k.ExceptionInVPackage("Unable to open settings file " + str + "\nSee log for more detail.", (Component)this);
      exception.printStackTrace();
    } 
    ArrayList<bB> arrayList = new ArrayList();
    if (ExceptionInVPackage(properties, "FIELD_GROUP_NAME_")) {
      bB bB = new bB("FIELD_GROUP_NAME_", "Quick View Tabs");
      bB.ExceptionInVPackage("All Quick View tabs on this PC");
      bB.JPanelExtensionUsingFileAccessPreferences("FIELD_SELECTED_GROUP_");
      arrayList.add(bB);
    } 
    if (ExceptionInVPackage(properties, "FIELD_MIN_MAX_")) {
      bB bB = new bB("FIELD_MIN_MAX_", "Field Min/Max Settings");
      bB.ExceptionInVPackage("Import set Min & Max values and autoscale settings.");
      arrayList.add(bB);
    } 
    if (ExceptionInVPackage(properties, IOProperties.S)) {
      bB bB = new bB(IOProperties.S, "Viewing preferences");
      bB.JPanelExtensionUsingFileAccessPreferences("numberOfGraphs");
      bB.JPanelExtensionUsingFileAccessPreferences("numberOfOverlays");
      bB.JPanelExtensionUsingFileAccessPreferences("numberOfOverlayGraphs");
      bB.ExceptionInVPackage("Import number of graphs, traces per graph, Trace Value Position, etc.");
      arrayList.add(bB);
    } 
    if (arrayList.isEmpty()) {
      bV.d("There are no settings in this file to import.", (Component)this);
      return;
    } 
    by by = new by(arrayList, false);
    by.ExceptionInVPackage(bV.JPanelExtensionUsingFileAccessPreferences((Component)this));
    List list = by.JPanelExtensionUsingFileAccessPreferences();
    if (list.isEmpty())
      return; 
    if (!by.ExceptionInVPackage()) {
      int IOProperties = JOptionPane.showConfirmDialog((Component)this, "Warning!!!!\nAny Quick Views settings of the same name will be overridden\n\nContinue?");
      if (IOProperties != 0)
        return; 
    } else {
      for (String str1 : IOProperties.AeInterfaceEcho.stringPropertyNames()) {
        if (ExceptionInVPackage(str1, list))
          IOProperties.d(str1); 
      } 
    } 
    for (String str1 : properties.keySet()) {
      if (ExceptionInVPackage(str1, list)) {
        String str2 = properties.getProperty(str1);
        IOProperties.AeInterfaceEcho.setProperty(str1, str2);
      } 
    } 
    k.ExceptionInVPackage("The Application will now restart for changes to take effect.", (Component)bq.ExceptionInVPackage().JPanelExtensionUsingFileAccessPreferences());
    AcInterfaceFoxtrot.ExceptionInVPackage().d(bV.AcComponentCharlie());
  }
  
  private boolean ExceptionInVPackage(Properties paramProperties, String paramString) {
    for (String str : paramProperties.stringPropertyNames()) {
      if (str.startsWith(paramString))
        return true; 
    } 
    return false;
  }
  
  private boolean ExceptionInVPackage(String paramString, List paramList) {
    for (String str : paramList) {
      if (paramString.startsWith(str))
        return true; 
    } 
    return false;
  }
  
  public void ExceptionInVPackage(String paramString, boolean paramBoolean) {
    IOProperties.AcComponentCharlie(paramString, paramBoolean + "");
    if (this.JPanelExtensionUsingFileAccessPreferences.l() != null && k.ExceptionInVPackage(JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Log file must be reloaded for change to take effect.") + "\n" + JDialogExtensionDispose.JPanelExtensionUsingFileAccessPreferences("Reload now?"), (Component)this, true)) {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = this.JPanelExtensionUsingFileAccessPreferences.l();
      this.JPanelExtensionUsingFileAccessPreferences.ExceptionInVPackage(arrayOfString, false);
    } 
  }
  
  private void o() {
    String[] arrayOfString = ExceptionInVPackage("Open Log File");
    if (this.JPanelExtensionUsingFileAccessPreferences.s() != null)
      this.JPanelExtensionUsingFileAccessPreferences.s().AcComponentCharlie(); 
    if (arrayOfString != null && arrayOfString.length > 0) {
      File[] arrayOfFile = new File[arrayOfString.length];
      for (byte b1 = 0; b1 < arrayOfFile.length; b1++)
        arrayOfFile[b1] = new File(arrayOfString[b1]); 
      ExceptionInVPackage(arrayOfFile);
    } 
    IOProperties.JDialogExtensionDispose();
  }
  
  private void p() {
    String[] arrayOfString = ExceptionInVPackage("Compare Log File");
    if (arrayOfString != null && arrayOfString.length > 0)
      AcComponentCharlie(arrayOfString[0]); 
    IOProperties.JDialogExtensionDispose();
  }
  
  private void q() {
    if (this.F == null) {
      if (JPanelExtensionUsingFileAccessPreferences.ExceptionInVPackage() == null)
        JPanelExtensionUsingFileAccessPreferences.ExceptionInVPackage(new dc(this)); 
      da da = new da(this);
      this.F = new JDialogExtensionDispose(bV.AcComponentCharlie(), da, false);
      this.F.ExceptionInVPackage(da);
      int IOProperties = IOProperties.JPanelExtensionUsingFileAccessPreferences(IOProperties.am, -1);
      int j = IOProperties.JPanelExtensionUsingFileAccessPreferences(IOProperties.an, -1);
      if (j <= 0 || IOProperties <= 0) {
        this.F.pack();
      } else {
        this.F.setSize(IOProperties, j);
      } 
      bV.ExceptionInVPackage(bV.AcComponentCharlie(), (Component)this.F);
      this.F.setVisible(true);
    } 
  }
  
  private void AcInterfaceRomeo() {
    if (this.F != null) {
      this.F.dispose();
      this.F = null;
    } 
  }
  
  public void ExceptionInVPackage(File[] paramArrayOfFile) {
    if (paramArrayOfFile != null && paramArrayOfFile.length > 0 && paramArrayOfFile[0].exists()) {
      hx.ExceptionInVPackage().j();
      if (this.JPanelExtensionUsingFileAccessPreferences.s() != null)
        this.JPanelExtensionUsingFileAccessPreferences.s().AcComponentCharlie(); 
      hx.ExceptionInVPackage().j();
      this.C = paramArrayOfFile[0].getName();
      this.D = paramArrayOfFile[0];
      String[] arrayOfString = new String[paramArrayOfFile.length];
      for (byte b1 = 0; b1 < paramArrayOfFile.length; b1++)
        arrayOfString[b1] = paramArrayOfFile[b1].getAbsolutePath(); 
      arrayOfString[0] = paramArrayOfFile[0].getAbsolutePath();
      hx.ExceptionInVPackage().ExceptionInVPackage(arrayOfString);
      ExceptionInVPackage(arrayOfString, false);
      cV cV = new cV(this);
      cV.start();
    } 
  }
  
  public String[] ExceptionInVPackage(String paramString) {
    String str2;
    String str1 = IOProperties.ExceptionInVPackage("fileExtensions", "msl;csv;mlg;");
    String[] arrayOfString1 = X.AcComponentCharlie(str1, ";");
    if (ExceptionInVPackage.A() == null) {
      str2 = IOProperties.AeInterfaceEcho("lastFileDir", j.u());
    } else {
      str2 = ExceptionInVPackage.A().L().getAbsolutePath();
    } 
    String[] arrayOfString2 = bV.ExceptionInVPackage((Component)this, paramString, arrayOfString1, (String)null, str2, true, null, true);
    if (arrayOfString2 != null && arrayOfString2.length >= 1 && arrayOfString2[0] != null && arrayOfString2[0].lastIndexOf(File.separator) != -1) {
      String str = arrayOfString2[0].substring(0, arrayOfString2[0].lastIndexOf(File.separator));
      IOProperties.AcComponentCharlie("lastFileDir", str);
    } 
    return arrayOfString2;
  }
  
  public void ExceptionInVPackage(String[] paramArrayOfString, boolean paramBoolean) {
    File file = new File(paramArrayOfString[0]);
    this.JPanelExtensionUsingFileAccessPreferences.ExceptionInVPackage(paramArrayOfString, paramBoolean);
    hx.ExceptionInVPackage().ExceptionInVPackage(paramArrayOfString);
    String str = paramArrayOfString[0].substring(paramArrayOfString[0].lastIndexOf(File.separator) + 1);
    this.C = str;
    this.D = new File(paramArrayOfString[0]);
  }
  
  public void AcComponentCharlie(String paramString) {
    this.JPanelExtensionUsingFileAccessPreferences.AcComponentCharlie(paramString);
    File file = new File(paramString);
    this.A.setText("1: " + this.D.getName() + " - 2:" + file.getName());
    this.A.setToolTipText("<html>" + X.JPanelExtensionUsingFileAccessPreferences(this.A.getText(), " - ", "<br>"));
  }
  
  public void ExceptionInVPackage(ExceptionInVPackage parama, R paramR) {
    this.ExceptionInVPackage = paramR;
    this.JPanelExtensionUsingFileAccessPreferences.ExceptionInVPackage(paramR);
  }
  
  public void e_() {
    this.JPanelExtensionUsingFileAccessPreferences.close();
    n n = new n();
    hx.ExceptionInVPackage().JPanelExtensionUsingFileAccessPreferences(n);
    this.JPanelExtensionUsingFileAccessPreferences.AcComponentCharlie(n);
    this.ExceptionInVPackage = null;
    IOProperties.JDialogExtensionDispose();
    this.E.ExceptionInVPackage();
    this.A.setText("");
  }
  
  public boolean ExceptionInVPackage() {
    D.AcComponentCharlie("Activate Graphing Tabs");
    if (this.AcComponentCharlie == null)
      this.AcComponentCharlie = bY.ExceptionInVPackage(); 
    this.JPanelExtensionUsingFileAccessPreferences.p().AcInterfaceFoxtrot(true);
    j();
    bq.ExceptionInVPackage().AcInterfaceFoxtrot().ExceptionInVPackage(false);
    String str = AcComponentCharlie.ExceptionInVPackage().n();
    if (this.G && str != null && hx.ExceptionInVPackage().AcInterfaceRomeo() == null && !T.ExceptionInVPackage().AcComponentCharlie().R()) {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = str;
      ExceptionInVPackage(arrayOfString, false);
    } 
    this.G = false;
    return true;
  }
  
  public void ExceptionInVPackage(ExceptionInVPackage parama) {}
  
  public void JPanelExtensionUsingFileAccessPreferences() {
    if (this.AcComponentCharlie != null) {
      cb.ExceptionInVPackage().JPanelExtensionUsingFileAccessPreferences((KeyEventDispatcher)this.AcComponentCharlie);
      this.AcComponentCharlie.JPanelExtensionUsingFileAccessPreferences();
    } 
    if (!ExceptionInVPackage.ExceptionInVPackage().AcComponentCharlie(ExceptionInVPackage.P, ExceptionInVPackage.Q))
      hx.ExceptionInVPackage().j(); 
    bq.ExceptionInVPackage().AcInterfaceFoxtrot().ExceptionInVPackage(true);
    D.AcComponentCharlie("Deactivate Analysis Tabs");
  }
  
  public void ExceptionInVPackage(File paramFile) {
    j();
    String str = paramFile.getName();
    this.C = str;
    this.D = paramFile;
  }
  
  public void AcComponentCharlie() {}
  
  public void d() {
    j();
  }
  
  public void JPanelExtensionUsingFileAccessPreferences(String paramString) {}
  
  protected File h() {
    return this.D;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */