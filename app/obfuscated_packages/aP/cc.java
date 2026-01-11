package aP;

import G.R;
import G.T;
import V.a;
import W.n;
import aE.a;
import aE.e;
import ac.c;
import ac.f;
import ac.r;
import ao.aw;
import ao.bB;
import ao.bK;
import ao.bY;
import ao.bq;
import ao.by;
import ao.hx;
import ao.i;
import as.b;
import as.g;
import ay.a;
import bA.e;
import bH.D;
import bH.X;
import bh.b;
import bh.v;
import bt.d;
import bu.a;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.fp;
import g.k;
import h.b;
import h.i;
import i.a;
import i.c;
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
import n.a;
import n.g;
import r.a;
import r.i;
import r.j;
import s.g;

public class cc extends d implements e, f, a, g {
  R a = null;
  
  b b = null;
  
  bY c = null;
  
  public static String d = g.b("Start Data Logging");
  
  public static String e = g.b("Start capturing a new Data Log to a file.");
  
  public static String f = g.b("Open Data Log");
  
  public static String g = g.b("Compare Log");
  
  public static String h = g.b("Open 2nd Data Log");
  
  public static String i = g.b("Open an existing data log file.");
  
  public static String j = g.b("Open TS-Dash Log");
  
  public static String k = g.b("Only enabled if a TS Dash is detected on the same subnet. You are then able to download and open a log directly from your Dashboard.");
  
  public static String l = g.b("Stop Data Logging");
  
  public static String m = g.b("Stop capturing Log to a file.");
  
  public static String n = g.b("Log Viewing Settings.");
  
  public static String o = g.b("View Hot Key List.");
  
  public static String p = g.b("View in MegaLogViewer");
  
  public static String q = g.b("When checked, log file values will be published to the entire application if offline.");
  
  JButton r = null;
  
  JButton s = null;
  
  JButton t = null;
  
  JButton u = null;
  
  JButton v = null;
  
  JButton w = null;
  
  JButton x = null;
  
  JButton y = null;
  
  JCheckBox z = null;
  
  JLabel A = null;
  
  JLabel B = null;
  
  String C = "";
  
  File D = null;
  
  v E = new v();
  
  g F = null;
  
  boolean G = true;
  
  public cc() {
    bK bK = new bK(hx.a());
    bq.a().a(bK);
    hx.a().a((a)bK);
    this.b = new b();
    this.b.setOpaque(true);
    this.b.p().f(false);
    setLayout(new BorderLayout());
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout());
    JMenuBar jMenuBar = new JMenuBar();
    JMenu jMenu = new JMenu(g.b("File"));
    JMenuItem jMenuItem = new JMenuItem(g.b("Open Log"));
    jMenuItem.addActionListener(new cd(this));
    jMenu.add(jMenuItem);
    jMenuBar.add(jMenu);
    JToolBar jToolBar = new JToolBar();
    try {
      Image image = cO.a().a(cO.n, (Component)this);
      ImageIcon imageIcon = new ImageIcon(image);
      this.r = new JButton(d, imageIcon);
      this.r.setFocusable(false);
      this.r.setToolTipText(e);
      this.r.addActionListener(new cn(this));
      jToolBar.add(this.r);
      image = cO.a().a(cO.p, (Component)this);
      imageIcon = new ImageIcon(image);
      this.s = new JButton(l, imageIcon);
      this.s.setFocusable(false);
      this.s.setToolTipText(m);
      this.s.addActionListener(new cy(this));
      jToolBar.add(this.s);
      image = cO.a().a(cO.r, (Component)this);
      imageIcon = new ImageIcon(image);
      this.t = new JButton(f, imageIcon);
      this.t.setFocusable(false);
      this.t.setToolTipText(i);
      this.t.addActionListener(new cJ(this));
      jToolBar.add(this.t);
      this.u = new JButton(g, imageIcon);
      this.u.setFocusable(false);
      this.u.setToolTipText(h);
      this.u.addActionListener(new cU(this));
      jToolBar.add(this.u);
      this.v = new JButton(j, imageIcon);
      this.v.setFocusable(false);
      this.v.setToolTipText(k);
      this.v.addActionListener(new cW(this));
      jToolBar.add(this.v);
      this.v.setVisible(false);
      jToolBar.add(new JLabel("     "));
      image = cO.a().a(cO.C, (Component)this);
      imageIcon = new ImageIcon(image);
      this.y = new JButton(null, imageIcon);
      this.y.setFocusable(false);
      this.y.setToolTipText(p);
      this.y.addActionListener(new cX(this));
      jToolBar.add(this.y);
      jToolBar.add(new JLabel("     "));
      image = cO.a().a(cO.s, (Component)this);
      imageIcon = new ImageIcon(image);
      this.w = new JButton(null, imageIcon);
      this.w.setFocusable(false);
      this.w.setToolTipText(n);
      this.w.addActionListener(new cY(this));
      jToolBar.add(this.w);
      jToolBar.add(new JLabel("     "));
      image = cO.a().a(cO.f, (Component)this);
      imageIcon = new ImageIcon(image);
      this.x = new JButton(null, imageIcon);
      this.x.setFocusable(false);
      this.x.setToolTipText(o);
      this.x.addActionListener(new cZ(this));
      jToolBar.add(this.x);
      this.z = new JCheckBox(g.b("Full Application Playback"));
      if (i.a().a(" a09kmfds098432lkg89vlk")) {
        this.z.setToolTipText(g.b(q));
        this.z.setSelected(a.a().c(a.P, a.Q));
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
    } catch (a a1) {
      bV.d(a1.getMessage(), (Component)this);
    } 
    jPanel1.add("South", jToolBar);
    add("North", jPanel1);
    add("Center", (Component)this.b);
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 1));
    bq.a().a(jPanel2);
    add(jPanel2, "South");
    e();
    c.a().a(this);
    c.a().a((a)this.E);
    c.a().a(new cf(this));
    a.c().a(new db(this));
    if (!a.c().e())
      a.c().g(); 
  }
  
  public void e() {
    cg cg = new cg(this);
    if (SwingUtilities.isEventDispatchThread()) {
      cg.run();
    } else {
      SwingUtilities.invokeLater(cg);
    } 
  }
  
  private void i() {
    n n = hx.a().r();
    if (n != null) {
      a a1 = a.a(n);
      if (a1.h()) {
        String str1 = "";
        String str2 = "";
        double d1 = a1.a();
        if (!Double.isNaN(d1) && d1 > 0.0D) {
          str1 = str1 + "60ft: " + d1;
          str2 = str2 + "60 ft: " + d1 + "<br>";
        } 
        d1 = a1.g();
        if (!Double.isNaN(d1) && d1 > 0.0D) {
          str1 = str1 + " 330ft: " + d1;
          str2 = str2 + "330 ft: " + d1 + "<br>";
        } 
        d1 = a1.b();
        if (!Double.isNaN(d1) && d1 > 0.0D) {
          str1 = str1 + " 660ft: " + d1;
          str2 = str2 + "660 ft: " + d1 + "<br>";
        } 
        d1 = a1.c();
        if (!Double.isNaN(d1) && d1 > 0.0D) {
          str1 = str1 + " 660MPH: " + d1;
          str2 = str2 + "660 MPH: " + d1 + "<br>";
        } 
        d1 = a1.d();
        if (!Double.isNaN(d1) && d1 > 0.0D) {
          str1 = str1 + " 1320ft: " + d1;
          str2 = str2 + "1320 ft: " + d1 + "<br>";
        } 
        d1 = a1.e();
        if (!Double.isNaN(d1) && d1 > 0.0D) {
          str1 = str1 + " 1320MPH: " + d1;
          str2 = str2 + "1320 MPH: " + d1 + "<br>";
        } 
        d1 = a1.f();
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
    if (this.r != null) {
      ch ch = new ch(this);
      ci ci = new ci(this, ch);
      ci.start();
    } 
  }
  
  private void k() {
    this.b.j();
  }
  
  private void m() {
    JPopupMenu jPopupMenu = new JPopupMenu();
    a(jPopupMenu);
    this.w.add(jPopupMenu);
    jPopupMenu.show(this.w, 0, this.w.getHeight());
  }
  
  private void a(JPopupMenu paramJPopupMenu) {
    JMenu jMenu1 = new JMenu(g.b("Graphing View Layout"));
    i i = new i();
    String str1 = i.a(i.N, i.R);
    JCheckBoxMenuItem jCheckBoxMenuItem1 = new JCheckBoxMenuItem(g.b("2 Table View (Default)"), i.Q.equals(str1));
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/layout2Tables.png"));
    ImageIcon imageIcon = new ImageIcon(image);
    jCheckBoxMenuItem1.setIcon(imageIcon);
    jCheckBoxMenuItem1.addItemListener(new cj(this));
    i.a(jCheckBoxMenuItem1);
    jMenu1.add(jCheckBoxMenuItem1);
    jCheckBoxMenuItem1 = new JCheckBoxMenuItem(g.b("1 Table View"), i.P.equals(str1));
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/layout1Table.png"));
    imageIcon = new ImageIcon(image);
    jCheckBoxMenuItem1.setIcon(imageIcon);
    jCheckBoxMenuItem1.addItemListener(new ck(this));
    i.a(jCheckBoxMenuItem1);
    jMenu1.add(jCheckBoxMenuItem1);
    jCheckBoxMenuItem1 = new JCheckBoxMenuItem(g.b("No Table View"), i.O.equals(str1));
    image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/layout1Table.png"));
    imageIcon = new ImageIcon(image);
    jCheckBoxMenuItem1.setIcon(imageIcon);
    jCheckBoxMenuItem1.addItemListener(new cl(this));
    i.a(jCheckBoxMenuItem1);
    jMenu1.add(jCheckBoxMenuItem1);
    paramJPopupMenu.add(jMenu1);
    boolean bool1 = b.a().a("fileEditing");
    if (bool1 && this.C.toLowerCase().endsWith(".mlg")) {
      JMenuItem jMenuItem = new JMenuItem("Export Data to " + a.cs);
      jMenuItem.addActionListener(new cm(this));
      jMenuItem.setEnabled(!r.a());
      paramJPopupMenu.add(jMenuItem);
    } 
    paramJPopupMenu.add(n());
    paramJPopupMenu.addSeparator();
    JMenu jMenu2 = new JMenu(g.b("Mouse Wheel Action"));
    i = new i();
    String str2 = i.a(i.G, i.J);
    JCheckBoxMenuItem jCheckBoxMenuItem2 = new JCheckBoxMenuItem(g.b("Zoom Graph In / Out (Default)"), i.H.equals(str2));
    jCheckBoxMenuItem2.addItemListener(new co(this));
    i.a(jCheckBoxMenuItem2);
    jMenu2.add(jCheckBoxMenuItem2);
    jCheckBoxMenuItem2 = new JCheckBoxMenuItem(g.b("Page Data Forward / Back"), i.I.equals(str2));
    jCheckBoxMenuItem2.addItemListener(new cp(this));
    i.a(jCheckBoxMenuItem2);
    jMenu2.add(jCheckBoxMenuItem2);
    paramJPopupMenu.add(jMenu2);
    JCheckBoxMenuItem jCheckBoxMenuItem3 = new JCheckBoxMenuItem(g.b("Show 50% Graph Line"));
    jCheckBoxMenuItem3.setState(i.a("showGraphHalfMark", false));
    jCheckBoxMenuItem3.addItemListener(new cq(this));
    paramJPopupMenu.add(jCheckBoxMenuItem3);
    i = new i();
    boolean bool2 = i.a(i.K, true);
    boolean bool3 = i.a(i.L, i.M);
    JMenu jMenu3 = new JMenu("Graph Text Options");
    JCheckBoxMenuItem jCheckBoxMenuItem4 = new JCheckBoxMenuItem(g.b("Show Graph Text"));
    jCheckBoxMenuItem4.setState((bool2 && bool3));
    jCheckBoxMenuItem4.addItemListener(new cr(this));
    jMenu3.add(jCheckBoxMenuItem4);
    i.a(jCheckBoxMenuItem4);
    jCheckBoxMenuItem4 = new JCheckBoxMenuItem(g.b("Show Graph Text without Min/Max"));
    jCheckBoxMenuItem4.setState((bool2 && !bool3));
    jCheckBoxMenuItem4.addItemListener(new cs(this));
    jMenu3.add(jCheckBoxMenuItem4);
    i.a(jCheckBoxMenuItem4);
    jCheckBoxMenuItem4 = new JCheckBoxMenuItem(g.b("No Text, Values only"));
    jCheckBoxMenuItem4.setState((!bool2 && !bool3));
    jCheckBoxMenuItem4.addItemListener(new ct(this));
    jMenu3.add(jCheckBoxMenuItem4);
    i.a(jCheckBoxMenuItem4);
    paramJPopupMenu.add(jMenu3);
    cu cu = new cu(this);
    i = new i();
    int j = i.b("lineTraceSize", i.ae);
    JMenu jMenu4 = new JMenu("Trace Line Style");
    JMenu jMenu5 = new JMenu("Line width");
    for (byte b1 = 1; b1 < 6; b1++) {
      String str = b1 + "";
      if (b1 == 1)
        str = str + " (Default)"; 
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(str, (j == b1));
      jCheckBoxMenuItem.setActionCommand("" + b1);
      jCheckBoxMenuItem.addItemListener(cu);
      i.a(jCheckBoxMenuItem);
      jMenu5.add(jCheckBoxMenuItem);
    } 
    jMenu4.add(jMenu5);
    boolean bool4 = i.a(i.af, i.ag);
    JCheckBoxMenuItem jCheckBoxMenuItem5 = new JCheckBoxMenuItem("Antialias Line", bool4);
    jMenu4.add(jCheckBoxMenuItem5);
    jCheckBoxMenuItem5.addActionListener(new cv(this));
    boolean bool5 = i.a(i.ah, i.ai);
    aw.g(bool5);
    jCheckBoxMenuItem5 = new JCheckBoxMenuItem("Patterned Graph Lines", bool5);
    jMenu4.add(jCheckBoxMenuItem5);
    jCheckBoxMenuItem5.addActionListener(new cw(this));
    paramJPopupMenu.add(jMenu4);
    JMenuItem jMenuItem1 = new JMenuItem(g.b("Field Limits editor"));
    jMenuItem1.addActionListener(new cx(this));
    paramJPopupMenu.add(jMenuItem1);
    JCheckBoxMenuItem jCheckBoxMenuItem6 = new JCheckBoxMenuItem(g.b("Keep Graph Centered"));
    jCheckBoxMenuItem6.setState(i.a("holdGraphCentered", i.x));
    jCheckBoxMenuItem6.addItemListener(new cz(this));
    paramJPopupMenu.add(jCheckBoxMenuItem6);
    i = new i();
    JMenu jMenu6 = new JMenu(g.b("Trace Value Positions"));
    String str3 = i.e(i.S, i.T);
    JCheckBoxMenuItem jCheckBoxMenuItem7 = new JCheckBoxMenuItem(g.b("Show Cursor Values At Top"), str3.equals("top"));
    jCheckBoxMenuItem7.addItemListener(new cA(this));
    i.a(jCheckBoxMenuItem7);
    jMenu6.add(jCheckBoxMenuItem7);
    JCheckBoxMenuItem jCheckBoxMenuItem8 = new JCheckBoxMenuItem(g.b("Show Cursor Values At Bottom"), str3.equals("bottom"));
    jCheckBoxMenuItem8.addItemListener(new cB(this));
    i.a(jCheckBoxMenuItem8);
    jMenu6.add(jCheckBoxMenuItem8);
    JCheckBoxMenuItem jCheckBoxMenuItem9 = new JCheckBoxMenuItem(g.b("Show Cursor Values by Field Name"), str3.equals("withLabels"));
    jCheckBoxMenuItem9.addItemListener(new cC(this));
    i.a(jCheckBoxMenuItem9);
    jMenu6.add(jCheckBoxMenuItem9);
    paramJPopupMenu.add(jMenu6);
    JCheckBoxMenuItem jCheckBoxMenuItem10 = new JCheckBoxMenuItem(g.b("Alphabetize Field Lists"));
    jCheckBoxMenuItem10.setState(i.a(i.E, i.F));
    jCheckBoxMenuItem10.addItemListener(new cD(this));
    paramJPopupMenu.add(jCheckBoxMenuItem10);
    JCheckBoxMenuItem jCheckBoxMenuItem11 = new JCheckBoxMenuItem(g.b("Scale to Log Length on load"));
    jCheckBoxMenuItem11.setState(i.a(i.U, i.V));
    jCheckBoxMenuItem11.addItemListener(new cE(this));
    paramJPopupMenu.add(jCheckBoxMenuItem11);
    JMenu jMenu7 = new JMenu("Maximum Number of Graphs");
    paramJPopupMenu.add(jMenu7);
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
      jCheckBoxMenuItem.addActionListener(new cF(this));
      jMenu7.add(jCheckBoxMenuItem);
    } 
    JMenu jMenu8 = new JMenu("Maximum Traces Per Graph");
    paramJPopupMenu.add(jMenu8);
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
      jCheckBoxMenuItem.addActionListener(new cG(this));
      jMenu8.add(jCheckBoxMenuItem);
    } 
    JMenuItem jMenuItem2 = new JMenuItem(g.b("Select Displayed Fields"));
    jMenuItem2.addActionListener(new cH(this));
    jMenuItem2.setEnabled(b.a().a("selectableFields"));
    paramJPopupMenu.add(jMenuItem2);
    JCheckBoxMenuItem jCheckBoxMenuItem12 = new JCheckBoxMenuItem(g.b("Quick Trace Selection"));
    boolean bool6 = i.a("fieldSelectionStyle", "standardSelection").equals("selectFromDash");
    jCheckBoxMenuItem12.setSelected(bool6);
    jCheckBoxMenuItem12.addActionListener(new cI(this));
    paramJPopupMenu.add(jCheckBoxMenuItem12);
    if (!bool6) {
      JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(g.b("Hiding Field Select"));
      boolean bool = i.a("hideSelector", i.q);
      jCheckBoxMenuItem.setSelected(bool);
      jCheckBoxMenuItem.addActionListener(new cK(this));
      paramJPopupMenu.add(jCheckBoxMenuItem);
    } 
    JCheckBoxMenuItem jCheckBoxMenuItem13 = new JCheckBoxMenuItem("Keep Logs Loaded for Selection");
    jCheckBoxMenuItem13.setState(i.a(i.aJ, i.aK));
    jCheckBoxMenuItem13.setToolTipText("Will place a toolbar above graph to quickly switch and commpare loaded logs.");
    jCheckBoxMenuItem13.addItemListener(new cL(this));
    paramJPopupMenu.add(jCheckBoxMenuItem13);
    JCheckBoxMenuItem jCheckBoxMenuItem14 = new JCheckBoxMenuItem("Keep Index in sync with MegaLogViewer");
    jCheckBoxMenuItem14.setState(i.a(i.aD, i.aE));
    jCheckBoxMenuItem14.addItemListener(new cM(this));
    paramJPopupMenu.add(jCheckBoxMenuItem14);
    if (i.a().a("timeslipData")) {
      e e1 = new e("View / Edit Timeslip", true);
      e1.a(new cN(this));
      e1.addActionListener(new cO(this));
      paramJPopupMenu.add((JMenuItem)e1);
      JMenu jMenu = new JMenu("Drag Timeslip Preferences");
      JCheckBoxMenuItem jCheckBoxMenuItem15 = new JCheckBoxMenuItem("Show Time Slips");
      jCheckBoxMenuItem15.setState(i.a(i.aB, i.aC));
      jCheckBoxMenuItem15.setToolTipText("<html>When checked, key Timeslip event data<br>will displayed on graph as yellow vertical bars.");
      jCheckBoxMenuItem15.addActionListener(new cP(this));
      jMenu.add(jCheckBoxMenuItem15);
      JCheckBoxMenuItem jCheckBoxMenuItem16 = new JCheckBoxMenuItem("Generate Time Slips");
      jCheckBoxMenuItem16.setState(i.a(i.az, i.aA));
      jCheckBoxMenuItem16.setToolTipText("<html>When checked, Timeslip data will be generated from the<br>launch condition if no time slip data has been entered.");
      jCheckBoxMenuItem16.addActionListener(new cQ(this));
      jMenu.add(jCheckBoxMenuItem16);
      JCheckBoxMenuItem jCheckBoxMenuItem17 = new JCheckBoxMenuItem("Jump to Launch");
      jCheckBoxMenuItem17.setState(i.a(i.ax, i.ay));
      jCheckBoxMenuItem17.setToolTipText("<html>When checked, upon opening a log file the cursor<br>will jump to the launch point of the log.");
      jCheckBoxMenuItem17.addActionListener(new cR(this));
      jMenu.add(jCheckBoxMenuItem17);
      paramJPopupMenu.add(jMenu);
    } 
    paramJPopupMenu = fp.a(paramJPopupMenu);
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
  
  public void f() {
    ArrayList<bB> arrayList = new ArrayList();
    bB bB = new bB("FIELD_GROUP_NAME_", "Quick View Tabs");
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
    by by = new by(arrayList, true);
    by.a(bV.b((Component)this));
    List list = by.b();
    if (list.isEmpty())
      return; 
    String[] arrayOfString = { "settings" };
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String str1 = simpleDateFormat.format(new Date());
    String str2 = k.a((Component)this, "Export Settings", arrayOfString, "LogViewerSettings_" + str1 + ".settings");
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
    if (file.exists() && !bV.a("The file " + file.getName() + " already exists.\n\nOverwrite?", (Component)this, true))
      return; 
    try {
      FileOutputStream fileOutputStream = new FileOutputStream(file);
      properties.store(fileOutputStream, "Embedded LogViewer Settings");
      fileOutputStream.close();
    } catch (Exception exception) {
      k.a("Unable to save settings to " + str2 + "\nSee log for more detail.", (Component)this);
      exception.printStackTrace();
    } 
  }
  
  public void g() {
    String[] arrayOfString = { "settings" };
    String str = k.a((Component)this, "Import Settings", arrayOfString, "*.settings");
    if (str == null || str.equals(""))
      return; 
    Properties properties = new Properties();
    try {
      FileInputStream fileInputStream = new FileInputStream(str);
      properties.load(fileInputStream);
      fileInputStream.close();
    } catch (Exception exception) {
      k.a("Unable to open settings file " + str + "\nSee log for more detail.", (Component)this);
      exception.printStackTrace();
    } 
    ArrayList<bB> arrayList = new ArrayList();
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
    if (a(properties, i.S)) {
      bB bB = new bB(i.S, "Viewing preferences");
      bB.b("numberOfGraphs");
      bB.b("numberOfOverlays");
      bB.b("numberOfOverlayGraphs");
      bB.a("Import number of graphs, traces per graph, Trace Value Position, etc.");
      arrayList.add(bB);
    } 
    if (arrayList.isEmpty()) {
      bV.d("There are no settings in this file to import.", (Component)this);
      return;
    } 
    by by = new by(arrayList, false);
    by.a(bV.b((Component)this));
    List list = by.b();
    if (list.isEmpty())
      return; 
    if (!by.a()) {
      int i = JOptionPane.showConfirmDialog((Component)this, "Warning!!!!\nAny Quick Views settings of the same name will be overridden\n\nContinue?");
      if (i != 0)
        return; 
    } else {
      for (String str1 : i.e.stringPropertyNames()) {
        if (a(str1, list))
          i.d(str1); 
      } 
    } 
    for (String str1 : properties.keySet()) {
      if (a(str1, list)) {
        String str2 = properties.getProperty(str1);
        i.e.setProperty(str1, str2);
      } 
    } 
    k.a("The Application will now restart for changes to take effect.", (Component)bq.a().b());
    f.a().d(bV.c());
  }
  
  private boolean a(Properties paramProperties, String paramString) {
    for (String str : paramProperties.stringPropertyNames()) {
      if (str.startsWith(paramString))
        return true; 
    } 
    return false;
  }
  
  private boolean a(String paramString, List paramList) {
    for (String str : paramList) {
      if (paramString.startsWith(str))
        return true; 
    } 
    return false;
  }
  
  public void a(String paramString, boolean paramBoolean) {
    i.c(paramString, paramBoolean + "");
    if (this.b.l() != null && k.a(g.b("Log file must be reloaded for change to take effect.") + "\n" + g.b("Reload now?"), (Component)this, true)) {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = this.b.l();
      this.b.a(arrayOfString, false);
    } 
  }
  
  private void o() {
    String[] arrayOfString = a("Open Log File");
    if (this.b.s() != null)
      this.b.s().c(); 
    if (arrayOfString != null && arrayOfString.length > 0) {
      File[] arrayOfFile = new File[arrayOfString.length];
      for (byte b1 = 0; b1 < arrayOfFile.length; b1++)
        arrayOfFile[b1] = new File(arrayOfString[b1]); 
      a(arrayOfFile);
    } 
    i.g();
  }
  
  private void p() {
    String[] arrayOfString = a("Compare Log File");
    if (arrayOfString != null && arrayOfString.length > 0)
      c(arrayOfString[0]); 
    i.g();
  }
  
  private void q() {
    if (this.F == null) {
      if (b.a() == null)
        b.a(new dc(this)); 
      da da = new da(this);
      this.F = new g(bV.c(), da, false);
      this.F.a(da);
      int i = i.b(i.am, -1);
      int j = i.b(i.an, -1);
      if (j <= 0 || i <= 0) {
        this.F.pack();
      } else {
        this.F.setSize(i, j);
      } 
      bV.a(bV.c(), (Component)this.F);
      this.F.setVisible(true);
    } 
  }
  
  private void r() {
    if (this.F != null) {
      this.F.dispose();
      this.F = null;
    } 
  }
  
  public void a(File[] paramArrayOfFile) {
    if (paramArrayOfFile != null && paramArrayOfFile.length > 0 && paramArrayOfFile[0].exists()) {
      hx.a().j();
      if (this.b.s() != null)
        this.b.s().c(); 
      hx.a().j();
      this.C = paramArrayOfFile[0].getName();
      this.D = paramArrayOfFile[0];
      String[] arrayOfString = new String[paramArrayOfFile.length];
      for (byte b1 = 0; b1 < paramArrayOfFile.length; b1++)
        arrayOfString[b1] = paramArrayOfFile[b1].getAbsolutePath(); 
      arrayOfString[0] = paramArrayOfFile[0].getAbsolutePath();
      hx.a().a(arrayOfString);
      a(arrayOfString, false);
      cV cV = new cV(this);
      cV.start();
    } 
  }
  
  public String[] a(String paramString) {
    String str2;
    String str1 = i.a("fileExtensions", "msl;csv;mlg;");
    String[] arrayOfString1 = X.c(str1, ";");
    if (a.A() == null) {
      str2 = i.e("lastFileDir", j.u());
    } else {
      str2 = a.A().L().getAbsolutePath();
    } 
    String[] arrayOfString2 = bV.a((Component)this, paramString, arrayOfString1, (String)null, str2, true, null, true);
    if (arrayOfString2 != null && arrayOfString2.length >= 1 && arrayOfString2[0] != null && arrayOfString2[0].lastIndexOf(File.separator) != -1) {
      String str = arrayOfString2[0].substring(0, arrayOfString2[0].lastIndexOf(File.separator));
      i.c("lastFileDir", str);
    } 
    return arrayOfString2;
  }
  
  public void a(String[] paramArrayOfString, boolean paramBoolean) {
    File file = new File(paramArrayOfString[0]);
    this.b.a(paramArrayOfString, paramBoolean);
    hx.a().a(paramArrayOfString);
    String str = paramArrayOfString[0].substring(paramArrayOfString[0].lastIndexOf(File.separator) + 1);
    this.C = str;
    this.D = new File(paramArrayOfString[0]);
  }
  
  public void c(String paramString) {
    this.b.c(paramString);
    File file = new File(paramString);
    this.A.setText("1: " + this.D.getName() + " - 2:" + file.getName());
    this.A.setToolTipText("<html>" + X.b(this.A.getText(), " - ", "<br>"));
  }
  
  public void a(a parama, R paramR) {
    this.a = paramR;
    this.b.a(paramR);
  }
  
  public void e_() {
    this.b.close();
    n n = new n();
    hx.a().b(n);
    this.b.c(n);
    this.a = null;
    i.g();
    this.E.a();
    this.A.setText("");
  }
  
  public boolean a() {
    D.c("Activate Graphing Tabs");
    if (this.c == null)
      this.c = bY.a(); 
    this.b.p().f(true);
    j();
    bq.a().f().a(false);
    String str = c.a().n();
    if (this.G && str != null && hx.a().r() == null && !T.a().c().R()) {
      String[] arrayOfString = new String[1];
      arrayOfString[0] = str;
      a(arrayOfString, false);
    } 
    this.G = false;
    return true;
  }
  
  public void a(a parama) {}
  
  public void b() {
    if (this.c != null) {
      cb.a().b((KeyEventDispatcher)this.c);
      this.c.b();
    } 
    if (!a.a().c(a.P, a.Q))
      hx.a().j(); 
    bq.a().f().a(true);
    D.c("Deactivate Analysis Tabs");
  }
  
  public void a(File paramFile) {
    j();
    String str = paramFile.getName();
    this.C = str;
    this.D = paramFile;
  }
  
  public void c() {}
  
  public void d() {
    j();
  }
  
  public void b(String paramString) {}
  
  protected File h() {
    return this.D;
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/aP/cc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */