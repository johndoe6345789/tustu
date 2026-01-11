package com.efiAnalytics.tunerStudio.panels;

import B.n;
import G.R;
import G.S;
import G.T;
import G.aG;
import G.bT;
import G.cd;
import G.ce;
import G.cf;
import G.ci;
import V.a;
import V.g;
import W.j;
import W.n;
import aE.a;
import aZ.d;
import aj.a;
import aj.b;
import aj.c;
import aj.d;
import aj.k;
import ao.aV;
import bB.l;
import bH.D;
import bq.a;
import com.efiAnalytics.apps.ts.dashboard.Z;
import com.efiAnalytics.apps.ts.dashboard.aa;
import com.efiAnalytics.apps.ts.dashboard.x;
import com.efiAnalytics.tuningwidgets.panels.I;
import com.efiAnalytics.ui.aS;
import com.efiAnalytics.ui.aU;
import com.efiAnalytics.ui.aZ;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bq;
import com.efiAnalytics.ui.cZ;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.fl;
import com.efiAnalytics.ui.fn;
import com.efiAnalytics.ui.q;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.geom.Point2D;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import n.g;
import n.n;
import r.a;
import s.g;

public class TriggerLoggerPanel extends JPanel implements S, aG, b, g {
  o a = null;
  
  JTextArea b = new JTextArea();
  
  al c = new al(this);
  
  JTable d = new JTable(this.c);
  
  private ai ah = new ai(this);
  
  q e = new q();
  
  cZ f = new cZ();
  
  boolean g = true;
  
  JPanel h = (JPanel)new fl();
  
  JPanel i = new JPanel();
  
  JComboBox j = new JComboBox();
  
  List k = new ArrayList();
  
  List l = new ArrayList();
  
  int m = 3;
  
  JComboBox n = new JComboBox();
  
  JCheckBox o = new JCheckBox();
  
  JSplitPane p = new JSplitPane();
  
  aU q = new aU();
  
  JPanel r = new JPanel();
  
  JPanel s = new JPanel();
  
  x t = null;
  
  HashMap u = new HashMap<>();
  
  d v = null;
  
  boolean w = false;
  
  ao x = new ao(this);
  
  aS y = null;
  
  private n ai = null;
  
  double z = 1.0D;
  
  int A = 0;
  
  int B = 0;
  
  private et aj = null;
  
  I C = new I();
  
  n D = new n();
  
  boolean E = true;
  
  T F = new T();
  
  static String G = g.b("Raw Log Page");
  
  static String H = g.b("Data View");
  
  static String I = g.b("Gauges");
  
  static String J = g.b("Set Y-Axis Min / Max");
  
  static String K = "IgnitionLoggerCluster";
  
  static String L = "splitPanePosition";
  
  static String M = "scrollBarPosition";
  
  static String N = "selectedGaugeTab";
  
  static String O = "zoom";
  
  static String P = "pollingDelay";
  
  public static boolean Q = false;
  
  a R = null;
  
  private boolean ak = false;
  
  private boolean al = Q;
  
  public static int S = 250;
  
  R T = null;
  
  private static String am = "Record#";
  
  static float U = 0.03125F;
  
  float V = U;
  
  static float W = 1.0F;
  
  float X = W;
  
  JScrollPane Y;
  
  boolean Z = true;
  
  ax aa = null;
  
  a ab = new a();
  
  aj ac = null;
  
  boolean ad = false;
  
  int ae = 1;
  
  n af = new n();
  
  int ag = 0;
  
  public TriggerLoggerPanel(boolean paramBoolean) {
    this.ak = paramBoolean;
    this.Z = paramBoolean;
    this.T = T.a().c();
    this.a = new o(this);
    this.q.a(Color.yellow);
    this.q.d(3.0D);
    this.q.c(-1.0D);
    this.q.f(4);
    this.q.a(new an(this));
    this.q.addMouseWheelListener(new ah(this));
    this.e.addMouseWheelListener(new ah(this));
    this.f.addMouseWheelListener(new ah(this));
    am am = new am(this);
    this.f.addMouseListener(am);
    this.f.addMouseMotionListener(am);
    this.f.a(g.d());
    this.f.c(!this.g);
    this.C.a(new V(this));
    setLayout(new BorderLayout());
    this.b.setBorder(BorderFactory.createLoweredBevelBorder());
    this.b.setColumns(35);
    this.b.setTabSize(5);
    this.b.setEditable(false);
    this.b.setFont(UIManager.getFont("TextField.font"));
    this.Y = new JScrollPane(this.d);
    JScrollPane jScrollPane = new JScrollPane(this.b);
    this.D.addTab(I, this.s);
    if (this.Z) {
      this.D.addTab(H, this.Y);
      int i = getFont().getSize() + eJ.a(4);
      this.d.setRowHeight(i);
    } 
    this.D.addTab(G, jScrollPane);
    this.D.setTabPlacement(3);
    add("North", this.a);
    add("Center", this.p);
    this.r.setLayout(new BorderLayout());
    this.s.setLayout(new BorderLayout());
    this.p.setRightComponent(this.r);
    add("South", this.x);
    if (paramBoolean) {
      this.p.setLeftComponent((Component)this.D);
    } else {
      this.p.setLeftComponent(jScrollPane);
    } 
    this.p.setOneTouchExpandable(true);
    this.p.addPropertyChangeListener("dividerLocation", new Z(this));
    aa aa = new aa(this);
    this.j.addItem(" ");
    this.j.addItemListener(aa);
    this.j.addItemListener(new ab(this));
    if (!this.g)
      for (byte b2 = 0; b2 < this.m; b2++) {
        JComboBox<String> jComboBox = new JComboBox();
        jComboBox.addItem(" ");
        jComboBox.addItemListener(aa);
        this.k.add(jComboBox);
      }  
    this.i.setLayout(new BorderLayout(eJ.a(5), eJ.a(5)));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new GridLayout(1, 0, eJ.a(10), eJ.a(5)));
    this.i.add("Center", jPanel1);
    this.o.setText("Show Lines");
    this.o.addActionListener(new ac(this));
    this.n.addItem(Integer.valueOf(1));
    this.n.addItem(Integer.valueOf(2));
    this.n.addItem(Integer.valueOf(3));
    this.n.addItem(Integer.valueOf(4));
    this.n.addItem(Integer.valueOf(5));
    this.n.addItem(Integer.valueOf(10));
    this.n.addItem(Integer.valueOf(15));
    this.n.addItem(Integer.valueOf(20));
    this.n.addItem(Integer.valueOf(30));
    this.n.addItem(Integer.valueOf(40));
    this.n.addActionListener(new ad(this));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("West", new JLabel(g.b("X Axis") + ": "));
    jPanel2.add("Center", this.j);
    jPanel1.add(jPanel2);
    for (byte b1 = 0; b1 < this.k.size(); b1++) {
      JComboBox jComboBox = this.k.get(b1);
      jPanel2 = new JPanel();
      jPanel2.setLayout(new BorderLayout());
      jPanel2.add("West", new JLabel(g.b("Y Axis") + " " + (b1 + 1) + ": "));
      jPanel2.add("Center", jComboBox);
      jPanel1.add(jPanel2);
    } 
    if (this.g)
      jPanel1.add(new JPanel()); 
    jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout());
    jPanel2.add("West", new JLabel(g.b("Chart Options") + ": "));
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new GridLayout(1, 0));
    jPanel3.add(this.o);
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    jPanel4.add("Center", new JLabel(g.b("Page Overlays") + ": ", 4));
    jPanel4.add("East", this.n);
    jPanel3.add(jPanel4);
    jPanel2.add("Center", jPanel3);
    this.i.add("East", jPanel2);
    this.F.a(new ae(this));
  }
  
  public void a(File paramFile) {
    this.a.a(paramFile.getAbsolutePath());
  }
  
  private void o() {
    if (this.ai == null)
      return; 
    cd cd = h(this.ai);
    if (cd == null)
      return; 
    String str = (String)this.j.getSelectedItem();
    if (str != null && !str.isEmpty()) {
      ci ci = cd.h(str);
      if (ci != null && ci.d().equals(str)) {
        this.f.e(ci.c());
        this.f.g(ci.b());
      } 
      for (JComboBox jComboBox : this.k) {
        String str1 = (String)jComboBox.getSelectedItem();
        if (str1 != null && !str1.trim().isEmpty()) {
          ci = cd.h(str1);
          if (ci != null && ci.d().equals(str)) {
            this.f.e(ci.c());
            this.f.g(ci.b());
          } 
        } 
      } 
    } 
  }
  
  protected d a() {
    cd cd = this.a.j();
    return (cd != null) ? b(cd.n()) : b("Standard");
  }
  
  protected d b(String paramString) {
    d d1 = (d)this.u.get(paramString);
    if (d1 == null) {
      if (paramString.equals("UDP_Stream")) {
        cd cd = this.a.j();
        k k2 = new k(p());
        D.d("Got high Speed logger for IP: " + k2.m());
        k2.d(cd.o());
        k2.a(this.T);
        k2.a(this);
        k k1 = k2;
        this.u.put("UDP_Stream", k1);
      } else {
        d d2 = new d();
        d2.a(this.T);
        d2.a(this);
        d1 = d2;
        this.u.put("Standard", d1);
      } 
    } else if (paramString.equals("UDP_Stream")) {
      cd cd = this.a.j();
      ((k)d1).d(cd.o());
      ((k)d1).h(p());
      d1.a(this.T);
    } 
    return d1;
  }
  
  private String p() {
    String str = a.a().d(a.bb);
    if (str != null && !str.isEmpty()) {
      if (str.equals("localhost") || str.equals("127.0.0.1"))
        try {
          return InetAddress.getLocalHost().getHostAddress();
        } catch (Exception exception) {
          Logger.getLogger(TriggerLoggerPanel.class.getName()).log(Level.SEVERE, (String)null, exception);
          return null;
        }  
      return str;
    } 
    return n.a(this.T);
  }
  
  private void q() {
    if (this.ad || this.a.j() == null)
      return; 
    String str = "Logger." + this.a.j().g() + ".";
    if (this.j.getSelectedItem() != null)
      b(str + "X", this.j.getSelectedItem().toString()); 
    if (!this.g) {
      for (byte b1 = 0; b1 < this.k.size(); b1++) {
        JComboBox jComboBox = this.k.get(b1);
        if (jComboBox.getSelectedItem() != null)
          b(str + "Y" + (b1 + 1), jComboBox.getSelectedItem().toString()); 
      } 
    } else {
      for (byte b1 = 0; b1 < this.l.size(); b1++) {
        fn fn = this.l.get(b1);
        if (fn.d()) {
          b(str + "Y_" + fn.b(), Boolean.toString(true));
        } else {
          b(str + "Y_" + fn.b(), Boolean.toString(false));
        } 
      } 
    } 
  }
  
  private void r() {
    if (this.a.j() == null)
      return; 
    this.ad = true;
    String str1 = "Logger." + this.a.j().g() + ".";
    String str2 = am;
    if (this.a.j().q() != null && !this.a.j().q().isEmpty())
      str2 = this.a.j().q(); 
    this.j.setSelectedItem(a(str1 + "X", str2));
    if (!this.g) {
      for (byte b1 = 0; b1 < this.k.size(); b1++) {
        JComboBox jComboBox = this.k.get(b1);
        jComboBox.setSelectedItem(a(str1 + "Y" + (b1 + 1), " "));
      } 
    } else {
      for (byte b1 = 0; b1 < this.l.size(); b1++) {
        fn fn = this.l.get(b1);
        boolean bool = Boolean.parseBoolean(a(str1 + "Y_" + fn.b(), "true"));
        fn.a(bool);
      } 
    } 
    this.ad = false;
  }
  
  private x e(R paramR) {
    this.R = a.A();
    Z z1 = (new aa()).a(paramR, a.A(), K, 5);
    x x1 = new x(paramR);
    x1.a(z1);
    x1.setName(K);
    Z z2 = (new aa()).a(paramR, K, 5);
    x1.b(z2);
    x1.n(a.A().m());
    x1.setMinimumSize(eJ.a(1, 150));
    return x1;
  }
  
  public void c() {
    if (this.aj == null)
      return; 
    int i = Integer.parseInt(a(L, "" + (this.D.getPreferredSize()).width));
    this.p.setDividerLocation(i);
    String str = a(N, I);
    this.D.g(str);
    int j = Integer.parseInt(a(P, "1000"));
    this.a.a(j);
    boolean bool = Boolean.getBoolean(a("Show Lines", "false"));
    this.o.setSelected(bool);
  }
  
  public void d() {
    if (this.aj == null)
      return; 
    b(L, "" + this.p.getDividerLocation());
    b(O, this.z + "");
    b(N, this.D.getTitleAt(this.D.getSelectedIndex()));
    b(P, this.a.o() + "");
    b("Show Lines", Boolean.toString(this.o.isSelected()));
    double d1 = (this.x.a.getMaximum() - this.x.a.getMinimum() <= 0) ? 0.0D : ((this.x.a.getValue() - this.x.a.getMinimum()) / (this.x.a.getMaximum() - this.x.a.getMinimum()));
    b(M, Double.toString(d1));
  }
  
  private String a(String paramString1, String paramString2) {
    String str = null;
    if (this.aj != null)
      str = this.aj.a(paramString1); 
    return (str != null && !str.equals("")) ? str : paramString2;
  }
  
  private void b(String paramString1, String paramString2) {
    if (this.aj != null)
      this.aj.a(paramString1, paramString2); 
  }
  
  public void e() {
    cd cd = this.a.j();
    try {
      cd.c();
    } catch (g g1) {
      throw new a("Failed to reset logger fields:\n" + g1.getLocalizedMessage());
    } 
    boolean bool = (cd.f() == -1) ? true : cd.f();
    a().b(bool);
    a().a(cd);
    a().f(cd.d());
    a().c(cd.i());
    try {
      a().a(cd.h());
      a().b(cd.j());
      a().c(cd.k());
    } catch (g g1) {
      g1.printStackTrace();
      throw new a(g1.getMessage());
    } 
    a().g(cd.e());
    this.w = false;
    this.E = true;
    a().b();
    this.a.b(true);
  }
  
  public void f() {
    a().c();
    this.a.b(false);
    if (this.ah.size() > 0)
      this.x.a(true); 
  }
  
  public void a(R paramR) {
    d(paramR);
    this.E = true;
  }
  
  public void d(R paramR) {
    a().a();
    a().a(paramR);
    ArrayList arrayList = (new c()).a(paramR);
    if (this.ak)
      arrayList.addAll(paramR.x()); 
    this.a.a(arrayList);
    if (this.a.j() != null) {
      a(this.a.j());
      try {
        a(e(paramR));
        c();
      } catch (a a1) {
        D.a(g.b("Problem creating Logger Gauge Cluster"), (Exception)a1, this);
      } 
    } 
  }
  
  private void a(x paramx) {
    if (this.t != null)
      this.t.c(); 
    this.s.removeAll();
    this.s.add("Center", (Component)paramx);
    this.t = paramx;
  }
  
  protected void a(cd paramcd) {
    this.ah.clear();
    try {
      paramcd.c();
    } catch (g g1) {
      g1.printStackTrace();
    } 
    this.ai = null;
    this.b.setText("");
    this.c.getDataVector().clear();
    this.c.fireTableDataChanged();
    this.a.n();
    a().a();
    if (paramcd.d().equals(cd.a)) {
      a((aS)this.q, false);
      this.q.b(g.b(paramcd.g()));
      this.q.c(paramcd.a());
      this.q.a();
      this.q.repaint();
      ce ce = paramcd.b().a("ToothTime");
      String str = (ce != null) ? ce.d() : "";
      this.q.d(str);
    } else if (paramcd.d().equals(cd.d)) {
      a((aS)this.f, true);
      if (this.g) {
        this.f.b("");
      } else if (paramcd != null) {
        this.f.b(g.b(paramcd.g()));
      } else {
        this.f.b(g.b("Generic Data Mode"));
      } 
      this.f.b(this.o.isSelected());
      this.f.c(paramcd.a());
      this.f.a();
      this.f.repaint();
      this.ad = true;
      this.j.removeAllItems();
      this.j.addItem(am);
      byte b1;
      for (b1 = 0; b1 < paramcd.b().i(); b1++) {
        ce ce = paramcd.b().a(b1);
        if (!ce.i())
          this.j.addItem(ce.g()); 
      } 
      if (!this.g) {
        for (JComboBox<String> jComboBox : (Iterable<JComboBox<String>>)this.k) {
          jComboBox.removeAllItems();
          jComboBox.addItem(" ");
          for (byte b2 = 0; b2 < paramcd.b().i(); b2++) {
            ce ce = paramcd.b().a(b2);
            if (!ce.i())
              jComboBox.addItem(ce.g()); 
          } 
        } 
      } else {
        this.h.removeAll();
        this.l.clear();
        for (b1 = 0; b1 < paramcd.b().i(); b1++) {
          ce ce = paramcd.b().a(b1);
          if (!ce.i()) {
            fn fn = new fn(ce.g(), aV.a().a(b1));
            this.h.add((Component)fn);
            this.l.add(fn);
            fn.a(new af(this));
          } 
        } 
        ag ag = new ag(this);
        SwingUtilities.invokeLater(ag);
        b(paramcd);
        r();
      } 
      b(paramcd);
      r();
      this.ad = false;
    } else {
      a((aS)this.e, false);
      this.e.b(g.b(paramcd.g()));
      this.e.c(paramcd.a());
      this.e.a();
      this.e.d(0.0D);
      ce ce = paramcd.b().a("ToothTime");
      if (ce == null)
        ce = paramcd.b().a("TriggerTime"); 
      String str = (ce != null) ? ce.d() : "";
      this.e.e(str);
      this.e.repaint();
    } 
  }
  
  private void b(cd paramcd) {
    this.ad = true;
    String str = this.j.getSelectedItem().toString();
    if (!this.g) {
      for (JComboBox<String> jComboBox : (Iterable<JComboBox<String>>)this.k) {
        jComboBox.removeAllItems();
        jComboBox.addItem(" ");
        for (byte b1 = 0; b1 < paramcd.b().i(); b1++) {
          ce ce = paramcd.b().a(b1);
          if (!ce.i() && !ce.g().equals(str))
            jComboBox.addItem(ce.g()); 
        } 
      } 
    } else {
      this.h.removeAll();
      this.l.clear();
      byte b1 = 0;
      for (byte b2 = 0; b2 < paramcd.b().i(); b2++) {
        ce ce = paramcd.b().a(b2);
        if (!ce.i() && !ce.g().equals(str)) {
          fn fn = new fn(ce.g(), aV.a().a(b1++));
          this.h.add((Component)fn);
          this.l.add(fn);
          fn.a(new W(this));
        } 
      } 
      this.h.validate();
      this.r.doLayout();
    } 
    r();
    this.ad = false;
  }
  
  public void a(int paramInt) {
    b("Standard").a(paramInt);
  }
  
  void g() {
    try {
      this.v.a();
    } catch (Exception exception) {}
    this.v = null;
  }
  
  private void a(aS paramaS, boolean paramBoolean) {
    if (this.y != null) {
      this.r.remove((Component)this.y);
      this.y.c();
    } 
    this.y = paramaS;
    this.r.add("Center", (Component)paramaS);
    if (paramBoolean) {
      this.r.add("South", this.i);
      if (this.g)
        this.r.add("North", this.h); 
      if (paramaS instanceof cZ)
        ((cZ)paramaS).c(!this.g); 
      this.r.validate();
    } else {
      this.r.remove(this.h);
      this.r.remove(this.i);
      this.r.validate();
    } 
    this.r.doLayout();
  }
  
  public void b(R paramR) {
    d();
    if (this.t != null && this.t.getComponentCount() > 0) {
      this.t.f();
      (new aa()).a(this.t, this.R, K);
      this.t.c();
    } 
  }
  
  public void c(R paramR) {}
  
  private cd h(n paramn) {
    ArrayList arrayList = this.a.h();
    for (cd cd : arrayList) {
      cf cf = cd.b();
      if (a(paramn, cf))
        return cd; 
    } 
    return null;
  }
  
  private boolean a(n paramn, cf paramcf) {
    List list = paramcf.j();
    for (String str : list) {
      if (paramn.a(str) == null)
        return false; 
    } 
    return true;
  }
  
  public void a(ArrayList<n> paramArrayList) {
    this.E = false;
    if (paramArrayList.size() == 0) {
      bV.d("Data set empty, can't load it.", this);
      return;
    } 
    cd cd = h(paramArrayList.get(0));
    if (cd == null) {
      bV.d("Unable to identify log file type.", this);
      return;
    } 
    this.a.b(cd.g());
    this.ah.clear();
    int i = 0;
    int j = this.ah.d();
    boolean bool = true;
    Iterator<n> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      if (i == j) {
        bV.d("Data set size exceeds current maximum of " + j + ".\nOnly the first " + j + " will be loaded.", this);
        break;
      } 
      n n1 = iterator.next();
      if (bool) {
        a(n1);
        bool = false;
      } else {
        this.ah.a(n1);
      } 
      i++;
    } 
    b(0);
    o();
  }
  
  public void b(int paramInt) {
    try {
      n n1 = this.ah.a(paramInt);
      i(n1);
    } catch (a a1) {
      D.a("Unable to display page " + paramInt, (Exception)a1, this);
    } 
  }
  
  public void a(n paramn) {
    cd cd = this.a.j();
    if (this.E && this.a.j().l()) {
      this.E = false;
      if (cd == null || cd.l())
        return; 
    } 
    this.ah.a(paramn);
    if (this.ac == null || !this.ac.isAlive()) {
      this.ac = new aj(this);
      this.ac.start();
    } 
    this.ac.a();
    try {
      g(paramn);
    } catch (IOException iOException) {
      if (!this.w) {
        D.a("Unable to write data to log file.", iOException, this);
        this.w = true;
      } 
    } 
    if (cd != null && !cd.l()) {
      X x1 = new X(this);
      SwingUtilities.invokeLater(x1);
    } 
  }
  
  public void b(n paramn) {
    if (this.E)
      this.E = false; 
    this.ah.a(paramn);
    i(this.ah.e());
    try {
      g(paramn);
    } catch (IOException iOException) {
      if (!this.w) {
        D.a("Unable to write data to log file.", iOException, this);
        this.w = true;
      } 
    } 
  }
  
  protected void h() {
    this.x.a(this.ah.size());
    this.x.b(this.ah.c() + 1);
  }
  
  private void i(n paramn) {
    if (paramn == null)
      return; 
    this.ai = paramn;
    for (j j : paramn) {
      if (this.C.a(j.a())) {
        j.b(true);
        j.g(this.C.b(j.a()));
      } 
    } 
    if (paramn.d() != this.B) {
      this.B = paramn.d();
      if (this.B > 1000) {
        this.X = 1000.0F / this.B;
        this.V = this.X / 32.0F;
      } else {
        this.X = W;
        this.V = U;
      } 
      if (this.z > this.X) {
        this.z = this.X;
      } else if (this.z < this.V) {
        this.z = this.V;
      } 
      this.x.a();
    } 
    h();
    try {
      m(paramn);
    } catch (a a1) {
      D.a("There was an error reading this log file.", (Exception)a1, this);
    } 
    d(paramn);
    this.ab.a(0, paramn);
  }
  
  private n j(n paramn) {
    for (j j1 : paramn) {
      j j2 = this.af.a(j1.a());
      if (j2 == null) {
        j2 = new j(j1.a());
        this.af.a(j2);
      } 
      j2.b(j1.r());
      j2.g(j1.s());
      for (byte b1 = 0; b1 < j1.i(); b1++) {
        float f = j1.d(b1);
        j2.a(f);
        while (j2.v() > this.ae * j1.v())
          j2.h(0); 
      } 
    } 
    this.af.a(this.af.d() - 1, "End of read " + this.ag++);
    return this.af;
  }
  
  protected void c(n paramn) {
    if (this.ae > 1)
      if (a().f()) {
        paramn = j(paramn);
      } else {
        this.af.clear();
        int i = this.x.d() - 1;
        int j = Math.max(0, i - this.ae);
        while (j <= i) {
          n n1 = (n)this.ah.get(j++);
          paramn = j(n1);
        } 
      }  
    if (this.y instanceof cZ) {
      j[] arrayOfJ;
      String str = (this.j.getSelectedItem() != null) ? this.j.getSelectedItem().toString() : "";
      int i = (int)(paramn.d() * this.z);
      j j = paramn.a(str);
      if (j != null) {
        double d1 = (j.f() - j.e());
        double d2 = (this.x.a.getMaximum() - this.x.a.getMinimum() == 0) ? 0.0D : ((this.x.a.getValue() - this.x.a.getMinimum()) / (this.x.a.getMaximum() - this.x.a.getMinimum()));
        double d3 = 1.0D - this.z;
        double d4 = j.e() + d2 * d3 * d1;
        double d5 = d4 + this.z * d1;
        this.f.a(d5);
        this.f.b(d4);
        this.f.a(j.a());
      } else if (j == null) {
        this.f.a((this.A + i));
        this.f.b(this.A);
        this.f.a(am);
      } else {
        return;
      } 
      if (!this.g) {
        arrayOfJ = new j[this.k.size()];
        for (byte b1 = 0; b1 < this.k.size(); b1++) {
          JComboBox jComboBox = this.k.get(b1);
          String str1 = (jComboBox.getSelectedItem() != null) ? jComboBox.getSelectedItem().toString() : "";
          arrayOfJ[b1] = paramn.a(str1);
        } 
      } else {
        arrayOfJ = new j[this.l.size()];
        for (byte b1 = 0; b1 < this.l.size(); b1++) {
          fn fn = this.l.get(b1);
          if (fn.d()) {
            String str1 = fn.b();
            arrayOfJ[b1] = paramn.a(str1);
          } else {
            arrayOfJ[b1] = null;
          } 
        } 
      } 
      if (!a(arrayOfJ)) {
        this.f.a();
        o();
        for (byte b1 = 0; b1 < arrayOfJ.length; b1++) {
          j j1 = arrayOfJ[b1];
          if (j1 != null) {
            double d1 = 0.8D * (this.f.h(b1) - this.f.g(b1));
            double d2 = this.f.h(b1) - d1;
            double d3 = d1 + this.f.g(b1);
            double d4 = this.F.c(j1.a());
            double d5 = this.F.d(j1.a());
            if (Double.isNaN(d5) && Double.isNaN(this.f.h(b1))) {
              this.f.a(b1, j1.f());
            } else if (Double.isNaN(d5) && (this.f.h(b1) < j1.f() || this.f.h(b1) < d2)) {
              this.f.a(b1, j1.f());
            } else if (Double.isNaN(d5) && this.f.h(b1) > (j1.f() * 2.0F)) {
              this.f.a(b1, (j1.f() * 3.0F / 2.0F));
            } else if (!Double.isNaN(d5)) {
              this.f.a(b1, d5);
            } 
            if (Double.isNaN(d4) && Double.isNaN(this.f.g(b1))) {
              this.f.b(b1, j1.e());
            } else if (Double.isNaN(d4) && (this.f.g(b1) > j1.e() || this.f.g(b1) > d3)) {
              this.f.b(b1, j1.e());
            } else if (!Double.isNaN(d4)) {
              this.f.b(b1, d4);
            } 
            this.f.b(b1, j1.a());
            for (byte b2 = 0; b2 < paramn.d(); b2++) {
              float f = (j != null) ? j.c(b2) : b2;
              Point2D.Float float_ = new Point2D.Float(f, j1.c(b2));
              this.f.a(float_, b1);
            } 
          } else {
            this.f.b(b1, "");
            this.f.b(b1, Double.NaN);
            this.f.a(b1, Double.NaN);
          } 
        } 
        this.f.repaint();
      } else {
        this.f.a();
        this.f.d(0.0D);
        this.f.c(0.0D);
        this.f.a(0.0D);
        this.f.b(0.0D);
        this.f.repaint();
      } 
    } else if (this.y instanceof q) {
      String str = (this.j.getSelectedItem() != null) ? this.j.getSelectedItem().toString() : "";
      int i = (int)(paramn.d() * this.z);
      j j = paramn.a(str);
      if (j != null) {
        this.e.a();
        this.e.d(j.f());
        this.e.c(j.e());
        for (int k = this.A; k < i + this.A && k < paramn.d(); k++)
          this.e.a(j.c(k)); 
        this.e.repaint();
      } 
    } 
  }
  
  private boolean a(j[] paramArrayOfj) {
    for (j j1 : paramArrayOfj) {
      if (j1 != null)
        return false; 
    } 
    return true;
  }
  
  protected void d(n paramn) {
    cd cd = this.a.j();
    if (cd.d().equals(cd.d)) {
      c(paramn);
    } else if (m()) {
      f(paramn);
    } else {
      e(paramn);
    } 
  }
  
  protected void e(n paramn) {
    // Byte code:
    //   0: aload_0
    //   1: getfield y : Lcom/efiAnalytics/ui/aS;
    //   4: ifnull -> 14
    //   7: aload_1
    //   8: invokevirtual isEmpty : ()Z
    //   11: ifeq -> 15
    //   14: return
    //   15: aload_0
    //   16: getfield y : Lcom/efiAnalytics/ui/aS;
    //   19: aload_0
    //   20: getfield e : Lcom/efiAnalytics/ui/q;
    //   23: invokevirtual equals : (Ljava/lang/Object;)Z
    //   26: ifeq -> 163
    //   29: aload_1
    //   30: invokevirtual d : ()I
    //   33: i2d
    //   34: aload_0
    //   35: getfield z : D
    //   38: dmul
    //   39: d2i
    //   40: istore_2
    //   41: aload_1
    //   42: ldc 'ToothTime'
    //   44: invokevirtual a : (Ljava/lang/String;)LW/j;
    //   47: astore_3
    //   48: aload_3
    //   49: ifnonnull -> 59
    //   52: aload_1
    //   53: ldc 'TriggerTime'
    //   55: invokevirtual a : (Ljava/lang/String;)LW/j;
    //   58: astore_3
    //   59: aload_3
    //   60: ifnonnull -> 72
    //   63: aload_1
    //   64: iconst_0
    //   65: invokevirtual get : (I)Ljava/lang/Object;
    //   68: checkcast W/j
    //   71: astore_3
    //   72: aload_0
    //   73: getfield e : Lcom/efiAnalytics/ui/q;
    //   76: invokevirtual a : ()V
    //   79: aload_3
    //   80: invokevirtual f : ()F
    //   83: f2d
    //   84: aload_0
    //   85: getfield e : Lcom/efiAnalytics/ui/q;
    //   88: invokevirtual i : ()D
    //   91: ldc2_w 2.0
    //   94: ddiv
    //   95: dcmpg
    //   96: ifge -> 107
    //   99: aload_0
    //   100: getfield e : Lcom/efiAnalytics/ui/q;
    //   103: dconst_0
    //   104: invokevirtual d : (D)V
    //   107: aload_0
    //   108: getfield A : I
    //   111: istore #4
    //   113: iload #4
    //   115: iload_2
    //   116: aload_0
    //   117: getfield A : I
    //   120: iadd
    //   121: if_icmpge -> 153
    //   124: iload #4
    //   126: aload_1
    //   127: invokevirtual d : ()I
    //   130: if_icmpge -> 153
    //   133: aload_0
    //   134: getfield e : Lcom/efiAnalytics/ui/q;
    //   137: aload_3
    //   138: iload #4
    //   140: invokevirtual c : (I)F
    //   143: f2d
    //   144: invokevirtual a : (D)V
    //   147: iinc #4, 1
    //   150: goto -> 113
    //   153: aload_0
    //   154: getfield e : Lcom/efiAnalytics/ui/q;
    //   157: invokevirtual repaint : ()V
    //   160: goto -> 2490
    //   163: aload_0
    //   164: getfield y : Lcom/efiAnalytics/ui/aS;
    //   167: aload_0
    //   168: getfield q : Lcom/efiAnalytics/ui/aU;
    //   171: invokevirtual equals : (Ljava/lang/Object;)Z
    //   174: ifeq -> 2490
    //   177: aload_1
    //   178: invokevirtual d : ()I
    //   181: i2d
    //   182: aload_0
    //   183: getfield z : D
    //   186: dmul
    //   187: d2i
    //   188: istore_2
    //   189: aload_1
    //   190: ldc 'Time'
    //   192: invokevirtual a : (Ljava/lang/String;)LW/j;
    //   195: astore_3
    //   196: aload_1
    //   197: ldc 'ToothTime'
    //   199: invokevirtual a : (Ljava/lang/String;)LW/j;
    //   202: astore #4
    //   204: aload_1
    //   205: ldc 'PriLevel'
    //   207: invokevirtual a : (Ljava/lang/String;)LW/j;
    //   210: astore #5
    //   212: aload_1
    //   213: ldc 'SecLevel'
    //   215: invokevirtual a : (Ljava/lang/String;)LW/j;
    //   218: astore #6
    //   220: aload_1
    //   221: ldc 'Sync'
    //   223: invokevirtual a : (Ljava/lang/String;)LW/j;
    //   226: astore #7
    //   228: aload_1
    //   229: ldc 'Trigger'
    //   231: invokevirtual a : (Ljava/lang/String;)LW/j;
    //   234: astore #8
    //   236: aload_3
    //   237: ifnonnull -> 246
    //   240: ldc 'Empty Dataset, exiting.'
    //   242: invokestatic d : (Ljava/lang/String;)V
    //   245: return
    //   246: aload_0
    //   247: getfield q : Lcom/efiAnalytics/ui/aU;
    //   250: invokevirtual a : ()V
    //   253: aload_3
    //   254: aload_0
    //   255: getfield A : I
    //   258: invokevirtual c : (I)F
    //   261: fconst_0
    //   262: fcmpl
    //   263: ifle -> 278
    //   266: aload_3
    //   267: aload_0
    //   268: getfield A : I
    //   271: invokevirtual c : (I)F
    //   274: f2d
    //   275: goto -> 283
    //   278: aload_0
    //   279: aload_1
    //   280: invokespecial k : (LW/n;)D
    //   283: dstore #9
    //   285: aload_3
    //   286: iload_2
    //   287: aload_0
    //   288: getfield A : I
    //   291: iadd
    //   292: iconst_1
    //   293: isub
    //   294: invokevirtual c : (I)F
    //   297: fconst_0
    //   298: fcmpl
    //   299: ifle -> 318
    //   302: aload_3
    //   303: iload_2
    //   304: aload_0
    //   305: getfield A : I
    //   308: iadd
    //   309: iconst_1
    //   310: isub
    //   311: invokevirtual c : (I)F
    //   314: f2d
    //   315: goto -> 323
    //   318: aload_0
    //   319: aload_1
    //   320: invokespecial l : (LW/n;)D
    //   323: dstore #11
    //   325: aload_0
    //   326: getfield q : Lcom/efiAnalytics/ui/aU;
    //   329: dload #9
    //   331: invokevirtual b : (D)V
    //   334: aload_0
    //   335: getfield q : Lcom/efiAnalytics/ui/aU;
    //   338: dload #11
    //   340: invokevirtual e : (D)V
    //   343: aload #8
    //   345: invokevirtual f : ()F
    //   348: fconst_0
    //   349: fcmpl
    //   350: ifne -> 366
    //   353: aload_0
    //   354: getfield q : Lcom/efiAnalytics/ui/aU;
    //   357: ldc2_w 2.0
    //   360: invokevirtual d : (D)V
    //   363: goto -> 376
    //   366: aload_0
    //   367: getfield q : Lcom/efiAnalytics/ui/aU;
    //   370: ldc2_w 3.0
    //   373: invokevirtual d : (D)V
    //   376: iconst_0
    //   377: istore #13
    //   379: iconst_0
    //   380: istore #14
    //   382: invokestatic currentTimeMillis : ()J
    //   385: lstore #15
    //   387: ldc2_w -1.0
    //   390: dstore #17
    //   392: ldc2_w -1.0
    //   395: dstore #19
    //   397: iconst_0
    //   398: istore #21
    //   400: iconst_0
    //   401: istore #22
    //   403: iconst_0
    //   404: istore #23
    //   406: iconst_0
    //   407: istore #24
    //   409: iconst_0
    //   410: istore #25
    //   412: ldc -1.0
    //   414: fstore #26
    //   416: iconst_0
    //   417: istore #27
    //   419: iconst_0
    //   420: istore #28
    //   422: iconst_2
    //   423: istore #29
    //   425: iload #29
    //   427: aload_1
    //   428: invokevirtual d : ()I
    //   431: if_icmpge -> 728
    //   434: aload #4
    //   436: iload #29
    //   438: invokevirtual c : (I)F
    //   441: f2d
    //   442: dconst_0
    //   443: dcmpl
    //   444: ifne -> 461
    //   447: iinc #25, 1
    //   450: iload #27
    //   452: ifne -> 467
    //   455: iinc #28, 1
    //   458: goto -> 467
    //   461: iconst_0
    //   462: istore #25
    //   464: iconst_1
    //   465: istore #27
    //   467: iload #25
    //   469: iconst_2
    //   470: if_icmple -> 476
    //   473: goto -> 722
    //   476: iload #13
    //   478: ifne -> 556
    //   481: aload #5
    //   483: invokevirtual f : ()F
    //   486: aload #5
    //   488: invokevirtual e : ()F
    //   491: fcmpl
    //   492: ifeq -> 556
    //   495: aload #8
    //   497: iload #29
    //   499: invokevirtual c : (I)F
    //   502: fconst_0
    //   503: fcmpl
    //   504: ifne -> 556
    //   507: aload #4
    //   509: iload #29
    //   511: invokevirtual c : (I)F
    //   514: f2d
    //   515: dconst_0
    //   516: dcmpl
    //   517: ifle -> 556
    //   520: dload #17
    //   522: ldc2_w -1.0
    //   525: dcmpl
    //   526: ifeq -> 546
    //   529: dload #17
    //   531: aload #5
    //   533: iload #29
    //   535: invokevirtual c : (I)F
    //   538: f2d
    //   539: dcmpl
    //   540: ifeq -> 546
    //   543: iconst_1
    //   544: istore #13
    //   546: aload #5
    //   548: iload #29
    //   550: invokevirtual c : (I)F
    //   553: f2d
    //   554: dstore #17
    //   556: iload #14
    //   558: ifne -> 642
    //   561: aload #6
    //   563: invokevirtual f : ()F
    //   566: aload #6
    //   568: invokevirtual e : ()F
    //   571: fcmpl
    //   572: ifeq -> 642
    //   575: aload #8
    //   577: iload #29
    //   579: invokevirtual c : (I)F
    //   582: fconst_1
    //   583: fcmpl
    //   584: ifne -> 642
    //   587: aload #4
    //   589: iload #29
    //   591: invokevirtual c : (I)F
    //   594: f2d
    //   595: dconst_0
    //   596: dcmpl
    //   597: ifle -> 642
    //   600: dload #19
    //   602: ldc2_w -1.0
    //   605: dcmpl
    //   606: ifeq -> 633
    //   609: fload #26
    //   611: ldc -1.0
    //   613: fcmpl
    //   614: ifeq -> 633
    //   617: fload #26
    //   619: aload #6
    //   621: iload #29
    //   623: invokevirtual c : (I)F
    //   626: fcmpl
    //   627: ifeq -> 633
    //   630: iconst_1
    //   631: istore #14
    //   633: aload #6
    //   635: iload #29
    //   637: invokevirtual c : (I)F
    //   640: fstore #26
    //   642: aload #6
    //   644: iload #29
    //   646: invokevirtual c : (I)F
    //   649: f2d
    //   650: dstore #19
    //   652: aload #8
    //   654: iload #29
    //   656: invokevirtual c : (I)F
    //   659: fconst_1
    //   660: fcmpl
    //   661: ifne -> 701
    //   664: aload #6
    //   666: iload #29
    //   668: invokevirtual c : (I)F
    //   671: fconst_1
    //   672: fcmpl
    //   673: ifne -> 682
    //   676: iinc #21, 1
    //   679: goto -> 685
    //   682: iinc #22, 1
    //   685: iload #21
    //   687: ifle -> 722
    //   690: iload #22
    //   692: ifle -> 722
    //   695: iconst_1
    //   696: istore #14
    //   698: goto -> 722
    //   701: aload #5
    //   703: iload #29
    //   705: invokevirtual c : (I)F
    //   708: fconst_1
    //   709: fcmpl
    //   710: ifne -> 719
    //   713: iinc #23, 1
    //   716: goto -> 722
    //   719: iinc #24, 1
    //   722: iinc #29, 1
    //   725: goto -> 425
    //   728: iload #21
    //   730: iload #22
    //   732: if_icmplt -> 763
    //   735: iload #21
    //   737: iload #22
    //   739: if_icmpne -> 746
    //   742: iconst_1
    //   743: goto -> 747
    //   746: iconst_0
    //   747: dload #19
    //   749: dconst_1
    //   750: dcmpl
    //   751: ifne -> 758
    //   754: iconst_1
    //   755: goto -> 759
    //   758: iconst_0
    //   759: iand
    //   760: ifeq -> 767
    //   763: iconst_1
    //   764: goto -> 768
    //   767: iconst_0
    //   768: istore #29
    //   770: iload #23
    //   772: iload #24
    //   774: if_icmple -> 781
    //   777: iconst_1
    //   778: goto -> 782
    //   781: iconst_0
    //   782: istore #30
    //   784: ldc2_w -1.0
    //   787: dstore #17
    //   789: ldc2_w -1.0
    //   792: dstore #19
    //   794: ldc2_w -1.0
    //   797: dstore #31
    //   799: ldc2_w 1.5
    //   802: dstore #33
    //   804: aload_0
    //   805: getfield A : I
    //   808: istore #35
    //   810: iload #35
    //   812: iload_2
    //   813: aload_0
    //   814: getfield A : I
    //   817: iadd
    //   818: if_icmpge -> 2030
    //   821: iload #35
    //   823: aload_1
    //   824: invokevirtual d : ()I
    //   827: if_icmpge -> 2030
    //   830: aload #8
    //   832: iload #35
    //   834: invokevirtual c : (I)F
    //   837: fconst_0
    //   838: fcmpl
    //   839: ifne -> 1248
    //   842: aload #5
    //   844: iload #35
    //   846: invokevirtual c : (I)F
    //   849: f2d
    //   850: dstore #36
    //   852: dload #17
    //   854: ldc2_w -1.0
    //   857: dcmpl
    //   858: ifne -> 976
    //   861: iload #13
    //   863: ifne -> 911
    //   866: iload #30
    //   868: iconst_1
    //   869: if_icmpne -> 876
    //   872: iconst_0
    //   873: goto -> 877
    //   876: iconst_1
    //   877: istore #38
    //   879: new com/efiAnalytics/ui/aZ
    //   882: dup
    //   883: aload_3
    //   884: iload #35
    //   886: invokevirtual c : (I)F
    //   889: f2d
    //   890: iload #38
    //   892: i2d
    //   893: invokespecial <init> : (DD)V
    //   896: astore #39
    //   898: aload_0
    //   899: getfield q : Lcom/efiAnalytics/ui/aU;
    //   902: iconst_0
    //   903: aload #39
    //   905: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   908: goto -> 1241
    //   911: new com/efiAnalytics/ui/aZ
    //   914: dup
    //   915: aload_0
    //   916: getfield q : Lcom/efiAnalytics/ui/aU;
    //   919: invokevirtual b : ()D
    //   922: dload #36
    //   924: invokespecial <init> : (DD)V
    //   927: astore #38
    //   929: aload #38
    //   931: iconst_1
    //   932: invokevirtual a : (Z)V
    //   935: aload_0
    //   936: getfield q : Lcom/efiAnalytics/ui/aU;
    //   939: iconst_0
    //   940: aload #38
    //   942: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   945: new com/efiAnalytics/ui/aZ
    //   948: dup
    //   949: aload_3
    //   950: iload #35
    //   952: invokevirtual c : (I)F
    //   955: f2d
    //   956: dload #36
    //   958: invokespecial <init> : (DD)V
    //   961: astore #38
    //   963: aload_0
    //   964: getfield q : Lcom/efiAnalytics/ui/aU;
    //   967: iconst_0
    //   968: aload #38
    //   970: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   973: goto -> 1241
    //   976: iload #13
    //   978: ifeq -> 1046
    //   981: new com/efiAnalytics/ui/aZ
    //   984: dup
    //   985: aload_3
    //   986: iload #35
    //   988: invokevirtual c : (I)F
    //   991: f2d
    //   992: dload #17
    //   994: invokespecial <init> : (DD)V
    //   997: astore #38
    //   999: aload #38
    //   1001: iconst_1
    //   1002: invokevirtual a : (Z)V
    //   1005: aload_0
    //   1006: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1009: iconst_0
    //   1010: aload #38
    //   1012: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1015: new com/efiAnalytics/ui/aZ
    //   1018: dup
    //   1019: aload_3
    //   1020: iload #35
    //   1022: invokevirtual c : (I)F
    //   1025: f2d
    //   1026: dload #36
    //   1028: invokespecial <init> : (DD)V
    //   1031: astore #38
    //   1033: aload_0
    //   1034: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1037: iconst_0
    //   1038: aload #38
    //   1040: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1043: goto -> 1241
    //   1046: iload #35
    //   1048: iload_2
    //   1049: aload_0
    //   1050: getfield A : I
    //   1053: iadd
    //   1054: iconst_1
    //   1055: isub
    //   1056: if_icmpeq -> 1070
    //   1059: iload #35
    //   1061: aload_1
    //   1062: invokevirtual d : ()I
    //   1065: iconst_1
    //   1066: isub
    //   1067: if_icmpne -> 1120
    //   1070: iload #13
    //   1072: ifne -> 1241
    //   1075: iload #30
    //   1077: iconst_1
    //   1078: if_icmpne -> 1085
    //   1081: iconst_0
    //   1082: goto -> 1086
    //   1085: iconst_1
    //   1086: istore #38
    //   1088: new com/efiAnalytics/ui/aZ
    //   1091: dup
    //   1092: aload_3
    //   1093: iload #35
    //   1095: invokevirtual c : (I)F
    //   1098: f2d
    //   1099: iload #38
    //   1101: i2d
    //   1102: invokespecial <init> : (DD)V
    //   1105: astore #39
    //   1107: aload_0
    //   1108: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1111: iconst_0
    //   1112: aload #39
    //   1114: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1117: goto -> 1241
    //   1120: dload #36
    //   1122: iload #30
    //   1124: i2d
    //   1125: dcmpl
    //   1126: ifne -> 1241
    //   1129: iload #30
    //   1131: iconst_1
    //   1132: if_icmpne -> 1139
    //   1135: iconst_0
    //   1136: goto -> 1140
    //   1139: iconst_1
    //   1140: istore #38
    //   1142: new com/efiAnalytics/ui/aZ
    //   1145: dup
    //   1146: aload_3
    //   1147: iload #35
    //   1149: invokevirtual c : (I)F
    //   1152: f2d
    //   1153: iload #38
    //   1155: i2d
    //   1156: invokespecial <init> : (DD)V
    //   1159: astore #39
    //   1161: aload #39
    //   1163: iconst_1
    //   1164: invokevirtual a : (Z)V
    //   1167: aload_0
    //   1168: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1171: iconst_0
    //   1172: aload #39
    //   1174: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1177: new com/efiAnalytics/ui/aZ
    //   1180: dup
    //   1181: aload_3
    //   1182: iload #35
    //   1184: invokevirtual c : (I)F
    //   1187: f2d
    //   1188: iload #30
    //   1190: i2d
    //   1191: invokespecial <init> : (DD)V
    //   1194: astore #39
    //   1196: aload_0
    //   1197: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1200: iconst_0
    //   1201: aload #39
    //   1203: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1206: new com/efiAnalytics/ui/aZ
    //   1209: dup
    //   1210: aload_3
    //   1211: iload #35
    //   1213: invokevirtual c : (I)F
    //   1216: f2d
    //   1217: iload #38
    //   1219: i2d
    //   1220: invokespecial <init> : (DD)V
    //   1223: astore #39
    //   1225: aload #39
    //   1227: iconst_1
    //   1228: invokevirtual a : (Z)V
    //   1231: aload_0
    //   1232: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1235: iconst_0
    //   1236: aload #39
    //   1238: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1241: dload #36
    //   1243: dstore #17
    //   1245: goto -> 1835
    //   1248: aload #6
    //   1250: iload #35
    //   1252: invokevirtual c : (I)F
    //   1255: f2d
    //   1256: dstore #36
    //   1258: dload #36
    //   1260: dload #33
    //   1262: dadd
    //   1263: dstore #38
    //   1265: dload #19
    //   1267: ldc2_w -1.0
    //   1270: dcmpl
    //   1271: ifne -> 1539
    //   1274: iload #14
    //   1276: ifne -> 1431
    //   1279: dload #38
    //   1281: dload #33
    //   1283: dcmpl
    //   1284: ifne -> 1294
    //   1287: dconst_1
    //   1288: dload #33
    //   1290: dadd
    //   1291: goto -> 1296
    //   1294: dload #33
    //   1296: dstore #40
    //   1298: new com/efiAnalytics/ui/aZ
    //   1301: dup
    //   1302: aload_0
    //   1303: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1306: invokevirtual b : ()D
    //   1309: dload #40
    //   1311: invokespecial <init> : (DD)V
    //   1314: astore #42
    //   1316: aload #42
    //   1318: iconst_1
    //   1319: invokevirtual a : (Z)V
    //   1322: aload_0
    //   1323: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1326: iconst_1
    //   1327: aload #42
    //   1329: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1332: new com/efiAnalytics/ui/aZ
    //   1335: dup
    //   1336: aload_3
    //   1337: iload #35
    //   1339: invokevirtual c : (I)F
    //   1342: f2d
    //   1343: dload #40
    //   1345: invokespecial <init> : (DD)V
    //   1348: astore #42
    //   1350: aload #42
    //   1352: iconst_1
    //   1353: invokevirtual a : (Z)V
    //   1356: aload_0
    //   1357: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1360: iconst_1
    //   1361: aload #42
    //   1363: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1366: new com/efiAnalytics/ui/aZ
    //   1369: dup
    //   1370: aload_3
    //   1371: iload #35
    //   1373: invokevirtual c : (I)F
    //   1376: f2d
    //   1377: dload #38
    //   1379: invokespecial <init> : (DD)V
    //   1382: astore #42
    //   1384: aload_0
    //   1385: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1388: iconst_1
    //   1389: aload #42
    //   1391: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1394: new com/efiAnalytics/ui/aZ
    //   1397: dup
    //   1398: aload_3
    //   1399: iload #35
    //   1401: invokevirtual c : (I)F
    //   1404: f2d
    //   1405: dload #40
    //   1407: invokespecial <init> : (DD)V
    //   1410: astore #42
    //   1412: aload #42
    //   1414: iconst_1
    //   1415: invokevirtual a : (Z)V
    //   1418: aload_0
    //   1419: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1422: iconst_1
    //   1423: aload #42
    //   1425: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1428: goto -> 1827
    //   1431: aload #6
    //   1433: aload_0
    //   1434: getfield A : I
    //   1437: invokevirtual c : (I)F
    //   1440: f2d
    //   1441: dload #33
    //   1443: dadd
    //   1444: dstore #31
    //   1446: new com/efiAnalytics/ui/aZ
    //   1449: dup
    //   1450: aload_0
    //   1451: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1454: invokevirtual b : ()D
    //   1457: dload #31
    //   1459: invokespecial <init> : (DD)V
    //   1462: astore #40
    //   1464: aload_0
    //   1465: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1468: iconst_1
    //   1469: aload #40
    //   1471: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1474: new com/efiAnalytics/ui/aZ
    //   1477: dup
    //   1478: aload_3
    //   1479: iload #35
    //   1481: invokevirtual c : (I)F
    //   1484: f2d
    //   1485: dload #31
    //   1487: invokespecial <init> : (DD)V
    //   1490: astore #40
    //   1492: aload #40
    //   1494: iconst_1
    //   1495: invokevirtual a : (Z)V
    //   1498: aload_0
    //   1499: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1502: iconst_1
    //   1503: aload #40
    //   1505: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1508: new com/efiAnalytics/ui/aZ
    //   1511: dup
    //   1512: aload_3
    //   1513: iload #35
    //   1515: invokevirtual c : (I)F
    //   1518: f2d
    //   1519: dload #38
    //   1521: invokespecial <init> : (DD)V
    //   1524: astore #40
    //   1526: aload_0
    //   1527: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1530: iconst_1
    //   1531: aload #40
    //   1533: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1536: goto -> 1827
    //   1539: iload #14
    //   1541: ifeq -> 1609
    //   1544: new com/efiAnalytics/ui/aZ
    //   1547: dup
    //   1548: aload_3
    //   1549: iload #35
    //   1551: invokevirtual c : (I)F
    //   1554: f2d
    //   1555: dload #31
    //   1557: invokespecial <init> : (DD)V
    //   1560: astore #40
    //   1562: aload #40
    //   1564: iconst_1
    //   1565: invokevirtual a : (Z)V
    //   1568: aload_0
    //   1569: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1572: iconst_1
    //   1573: aload #40
    //   1575: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1578: new com/efiAnalytics/ui/aZ
    //   1581: dup
    //   1582: aload_3
    //   1583: iload #35
    //   1585: invokevirtual c : (I)F
    //   1588: f2d
    //   1589: dload #38
    //   1591: invokespecial <init> : (DD)V
    //   1594: astore #40
    //   1596: aload_0
    //   1597: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1600: iconst_1
    //   1601: aload #40
    //   1603: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1606: goto -> 1827
    //   1609: iload #35
    //   1611: iload_2
    //   1612: aload_0
    //   1613: getfield A : I
    //   1616: iadd
    //   1617: iconst_1
    //   1618: isub
    //   1619: if_icmpeq -> 1633
    //   1622: iload #35
    //   1624: aload_1
    //   1625: invokevirtual d : ()I
    //   1628: iconst_1
    //   1629: isub
    //   1630: if_icmpne -> 1683
    //   1633: iload #14
    //   1635: ifne -> 1827
    //   1638: iload #29
    //   1640: i2d
    //   1641: dload #33
    //   1643: dadd
    //   1644: dstore #40
    //   1646: new com/efiAnalytics/ui/aZ
    //   1649: dup
    //   1650: aload_3
    //   1651: iload #35
    //   1653: invokevirtual c : (I)F
    //   1656: f2d
    //   1657: dload #40
    //   1659: invokespecial <init> : (DD)V
    //   1662: astore #42
    //   1664: aload #42
    //   1666: iconst_1
    //   1667: invokevirtual a : (Z)V
    //   1670: aload_0
    //   1671: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1674: iconst_1
    //   1675: aload #42
    //   1677: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1680: goto -> 1827
    //   1683: aload #8
    //   1685: iload #35
    //   1687: invokevirtual c : (I)F
    //   1690: fconst_1
    //   1691: fcmpl
    //   1692: ifeq -> 1712
    //   1695: iload #29
    //   1697: i2d
    //   1698: dload #36
    //   1700: dcmpl
    //   1701: ifeq -> 1827
    //   1704: dload #38
    //   1706: dload #31
    //   1708: dcmpl
    //   1709: ifeq -> 1827
    //   1712: dload #38
    //   1714: dload #33
    //   1716: dcmpl
    //   1717: ifne -> 1727
    //   1720: dconst_1
    //   1721: dload #33
    //   1723: dadd
    //   1724: goto -> 1729
    //   1727: dload #33
    //   1729: dstore #40
    //   1731: new com/efiAnalytics/ui/aZ
    //   1734: dup
    //   1735: aload_3
    //   1736: iload #35
    //   1738: invokevirtual c : (I)F
    //   1741: f2d
    //   1742: dload #40
    //   1744: invokespecial <init> : (DD)V
    //   1747: astore #42
    //   1749: aload #42
    //   1751: iconst_1
    //   1752: invokevirtual a : (Z)V
    //   1755: aload_0
    //   1756: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1759: iconst_1
    //   1760: aload #42
    //   1762: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1765: new com/efiAnalytics/ui/aZ
    //   1768: dup
    //   1769: aload_3
    //   1770: iload #35
    //   1772: invokevirtual c : (I)F
    //   1775: f2d
    //   1776: dload #38
    //   1778: invokespecial <init> : (DD)V
    //   1781: astore #42
    //   1783: aload_0
    //   1784: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1787: iconst_1
    //   1788: aload #42
    //   1790: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1793: new com/efiAnalytics/ui/aZ
    //   1796: dup
    //   1797: aload_3
    //   1798: iload #35
    //   1800: invokevirtual c : (I)F
    //   1803: f2d
    //   1804: dload #40
    //   1806: invokespecial <init> : (DD)V
    //   1809: astore #42
    //   1811: aload #42
    //   1813: iconst_1
    //   1814: invokevirtual a : (Z)V
    //   1817: aload_0
    //   1818: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1821: iconst_1
    //   1822: aload #42
    //   1824: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1827: dload #38
    //   1829: dstore #31
    //   1831: dload #36
    //   1833: dstore #19
    //   1835: aload #7
    //   1837: iload #35
    //   1839: invokevirtual c : (I)F
    //   1842: fconst_0
    //   1843: fcmpl
    //   1844: ifne -> 1967
    //   1847: aload #4
    //   1849: iload #35
    //   1851: invokevirtual c : (I)F
    //   1854: fconst_0
    //   1855: fcmpl
    //   1856: ifle -> 1967
    //   1859: new com/efiAnalytics/ui/aZ
    //   1862: dup
    //   1863: aload_3
    //   1864: iload #35
    //   1866: invokevirtual c : (I)F
    //   1869: f2d
    //   1870: ldc2_w -0.75
    //   1873: invokespecial <init> : (DD)V
    //   1876: astore #36
    //   1878: aload #36
    //   1880: iconst_1
    //   1881: invokevirtual a : (Z)V
    //   1884: aload_0
    //   1885: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1888: iconst_2
    //   1889: aload #36
    //   1891: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1894: new com/efiAnalytics/ui/aZ
    //   1897: dup
    //   1898: aload_3
    //   1899: iload #35
    //   1901: invokevirtual c : (I)F
    //   1904: f2d
    //   1905: ldc2_w -0.5
    //   1908: invokespecial <init> : (DD)V
    //   1911: astore #36
    //   1913: aload #36
    //   1915: iconst_1
    //   1916: invokevirtual a : (Z)V
    //   1919: aload_0
    //   1920: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1923: iconst_2
    //   1924: aload #36
    //   1926: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1929: new com/efiAnalytics/ui/aZ
    //   1932: dup
    //   1933: aload_3
    //   1934: iload #35
    //   1936: invokevirtual c : (I)F
    //   1939: f2d
    //   1940: ldc2_w -0.75
    //   1943: invokespecial <init> : (DD)V
    //   1946: astore #36
    //   1948: aload #36
    //   1950: iconst_1
    //   1951: invokevirtual a : (Z)V
    //   1954: aload_0
    //   1955: getfield q : Lcom/efiAnalytics/ui/aU;
    //   1958: iconst_2
    //   1959: aload #36
    //   1961: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   1964: goto -> 2024
    //   1967: iload #35
    //   1969: aload_0
    //   1970: getfield A : I
    //   1973: if_icmpeq -> 1989
    //   1976: iload #35
    //   1978: iload_2
    //   1979: aload_0
    //   1980: getfield A : I
    //   1983: iadd
    //   1984: iconst_1
    //   1985: isub
    //   1986: if_icmpne -> 2024
    //   1989: new com/efiAnalytics/ui/aZ
    //   1992: dup
    //   1993: aload_3
    //   1994: iload #35
    //   1996: invokevirtual c : (I)F
    //   1999: f2d
    //   2000: ldc2_w -0.75
    //   2003: invokespecial <init> : (DD)V
    //   2006: astore #36
    //   2008: aload #36
    //   2010: iconst_1
    //   2011: invokevirtual a : (Z)V
    //   2014: aload_0
    //   2015: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2018: iconst_2
    //   2019: aload #36
    //   2021: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   2024: iinc #35, 1
    //   2027: goto -> 810
    //   2030: aload #8
    //   2032: invokevirtual f : ()F
    //   2035: fconst_1
    //   2036: fcmpl
    //   2037: ifne -> 2325
    //   2040: iload #14
    //   2042: ifeq -> 2248
    //   2045: dload #31
    //   2047: dconst_0
    //   2048: dcmpl
    //   2049: ifle -> 2089
    //   2052: new com/efiAnalytics/ui/aZ
    //   2055: dup
    //   2056: aload_0
    //   2057: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2060: invokevirtual t : ()D
    //   2063: dload #31
    //   2065: invokespecial <init> : (DD)V
    //   2068: astore #35
    //   2070: aload #35
    //   2072: iconst_1
    //   2073: invokevirtual a : (Z)V
    //   2076: aload_0
    //   2077: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2080: iconst_1
    //   2081: aload #35
    //   2083: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   2086: goto -> 2325
    //   2089: aload_0
    //   2090: aload_1
    //   2091: aload_0
    //   2092: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2095: invokevirtual t : ()D
    //   2098: invokespecial a : (LW/n;D)D
    //   2101: dstore #35
    //   2103: dload #35
    //   2105: dconst_0
    //   2106: dcmpl
    //   2107: iflt -> 2131
    //   2110: dload #35
    //   2112: dconst_0
    //   2113: dcmpl
    //   2114: ifne -> 2124
    //   2117: dconst_1
    //   2118: dload #33
    //   2120: dadd
    //   2121: goto -> 2126
    //   2124: dload #33
    //   2126: dstore #31
    //   2128: goto -> 2170
    //   2131: aload_0
    //   2132: aload_1
    //   2133: aload_0
    //   2134: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2137: invokevirtual t : ()D
    //   2140: invokespecial b : (LW/n;D)D
    //   2143: dstore #37
    //   2145: dload #37
    //   2147: dconst_0
    //   2148: dcmpl
    //   2149: iflt -> 2170
    //   2152: dload #37
    //   2154: dconst_0
    //   2155: dcmpl
    //   2156: ifne -> 2164
    //   2159: dload #33
    //   2161: goto -> 2168
    //   2164: dconst_1
    //   2165: dload #33
    //   2167: dadd
    //   2168: dstore #31
    //   2170: dload #31
    //   2172: dconst_0
    //   2173: dcmpl
    //   2174: ifle -> 2245
    //   2177: new com/efiAnalytics/ui/aZ
    //   2180: dup
    //   2181: aload_0
    //   2182: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2185: invokevirtual b : ()D
    //   2188: dload #31
    //   2190: invokespecial <init> : (DD)V
    //   2193: astore #37
    //   2195: aload #37
    //   2197: iconst_1
    //   2198: invokevirtual a : (Z)V
    //   2201: aload_0
    //   2202: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2205: iconst_1
    //   2206: aload #37
    //   2208: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   2211: new com/efiAnalytics/ui/aZ
    //   2214: dup
    //   2215: aload_0
    //   2216: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2219: invokevirtual t : ()D
    //   2222: dload #31
    //   2224: invokespecial <init> : (DD)V
    //   2227: astore #37
    //   2229: aload #37
    //   2231: iconst_1
    //   2232: invokevirtual a : (Z)V
    //   2235: aload_0
    //   2236: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2239: iconst_1
    //   2240: aload #37
    //   2242: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   2245: goto -> 2325
    //   2248: iload #29
    //   2250: i2d
    //   2251: dload #33
    //   2253: dadd
    //   2254: dstore #35
    //   2256: new com/efiAnalytics/ui/aZ
    //   2259: dup
    //   2260: aload_0
    //   2261: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2264: invokevirtual b : ()D
    //   2267: dload #35
    //   2269: invokespecial <init> : (DD)V
    //   2272: astore #37
    //   2274: aload #37
    //   2276: iconst_1
    //   2277: invokevirtual a : (Z)V
    //   2280: aload_0
    //   2281: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2284: iconst_0
    //   2285: iconst_1
    //   2286: aload #37
    //   2288: invokevirtual a : (IILcom/efiAnalytics/ui/aZ;)V
    //   2291: new com/efiAnalytics/ui/aZ
    //   2294: dup
    //   2295: aload_0
    //   2296: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2299: invokevirtual t : ()D
    //   2302: dload #35
    //   2304: invokespecial <init> : (DD)V
    //   2307: astore #37
    //   2309: aload #37
    //   2311: iconst_1
    //   2312: invokevirtual a : (Z)V
    //   2315: aload_0
    //   2316: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2319: iconst_1
    //   2320: aload #37
    //   2322: invokevirtual a : (ILcom/efiAnalytics/ui/aZ;)V
    //   2325: aload_1
    //   2326: invokevirtual d : ()I
    //   2329: istore #35
    //   2331: iload #35
    //   2333: iload #25
    //   2335: isub
    //   2336: aload_0
    //   2337: getfield A : I
    //   2340: isub
    //   2341: istore #36
    //   2343: iload #25
    //   2345: ifle -> 2483
    //   2348: aload_0
    //   2349: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2352: invokevirtual t : ()D
    //   2355: aload_0
    //   2356: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2359: invokevirtual b : ()D
    //   2362: dsub
    //   2363: iload #36
    //   2365: i2d
    //   2366: ddiv
    //   2367: dstore #37
    //   2369: iload #25
    //   2371: iload #28
    //   2373: isub
    //   2374: istore #39
    //   2376: iload_2
    //   2377: aload_0
    //   2378: getfield A : I
    //   2381: iadd
    //   2382: iload #35
    //   2384: iload #39
    //   2386: isub
    //   2387: isub
    //   2388: istore #39
    //   2390: iload #28
    //   2392: aload_0
    //   2393: getfield A : I
    //   2396: isub
    //   2397: istore #28
    //   2399: iload #28
    //   2401: i2d
    //   2402: dload #37
    //   2404: dmul
    //   2405: dstore #40
    //   2407: iload #39
    //   2409: i2d
    //   2410: dload #37
    //   2412: dmul
    //   2413: dstore #42
    //   2415: dload #40
    //   2417: dconst_0
    //   2418: dcmpl
    //   2419: ifle -> 2459
    //   2422: aload_0
    //   2423: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2426: aload_0
    //   2427: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2430: invokevirtual b : ()D
    //   2433: dload #40
    //   2435: dsub
    //   2436: invokevirtual b : (D)V
    //   2439: aload_0
    //   2440: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2443: aload_0
    //   2444: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2447: invokevirtual b : ()D
    //   2450: iload_2
    //   2451: i2d
    //   2452: dload #37
    //   2454: dmul
    //   2455: dadd
    //   2456: invokevirtual e : (D)V
    //   2459: dload #42
    //   2461: dconst_0
    //   2462: dcmpl
    //   2463: ifle -> 2483
    //   2466: aload_0
    //   2467: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2470: aload_0
    //   2471: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2474: invokevirtual t : ()D
    //   2477: dload #42
    //   2479: dadd
    //   2480: invokevirtual e : (D)V
    //   2483: aload_0
    //   2484: getfield q : Lcom/efiAnalytics/ui/aU;
    //   2487: invokevirtual repaint : ()V
    //   2490: return
  }
  
  protected void f(n paramn) {
    if (this.y == null)
      return; 
    if (this.y.equals(this.e)) {
      int i = (int)(paramn.d() * this.z);
      j j = (j)paramn.get(0);
      this.e.a();
      if (j.f() < this.e.i() / 2.0D)
        this.e.d(0.0D); 
      for (int k = this.A; k < i + this.A && k < paramn.d(); k++)
        this.e.a(j.c(k)); 
      this.e.repaint();
    } else if (this.y.equals(this.q)) {
      int i = (int)(paramn.d() * this.z);
      j j1 = paramn.a("Time");
      j j2 = paramn.a("ToothTime");
      j j3 = paramn.a("PriLevel");
      j j4 = paramn.a("SecLevel");
      j j5 = paramn.a("Sync");
      j j6 = paramn.a("Trigger");
      this.q.a();
      double d1 = (j1.c(this.A) > 0.0F) ? j1.c(this.A) : k(paramn);
      double d2 = (j1.c(i + this.A - 1) > 0.0F) ? j1.c(i + this.A - 1) : l(paramn);
      this.q.b(d1);
      this.q.e(d2);
      if (j6.f() == 0.0F && j4.e() == j4.f()) {
        this.q.d(2.0D);
      } else {
        this.q.d(3.0D);
      } 
      boolean bool1 = false;
      boolean bool2 = false;
      long l = System.currentTimeMillis();
      double d3 = -1.0D;
      double d4 = -1.0D;
      byte b1 = 0;
      byte b2 = 0;
      byte b3 = 0;
      byte b4 = 0;
      byte b5 = 0;
      float f = -1.0F;
      boolean bool3 = false;
      int j = 0;
      byte b6;
      for (b6 = 2; b6 < paramn.d(); b6++) {
        if (j2.c(b6) == 0.0D) {
          b5++;
          if (!bool3)
            j++; 
        } else {
          b5 = 0;
          bool3 = true;
        } 
        if (b5 <= 2) {
          if (!bool1 && j3.f() != j3.e() && j2.c(b6) > 0.0D) {
            if (d3 != -1.0D && d3 != j3.c(b6))
              bool1 = true; 
            d3 = j3.c(b6);
          } 
          if (!bool2 && j4.f() != j4.e() && j2.c(b6) > 0.0D) {
            if (d4 != -1.0D && f != -1.0F && f != j4.c(b6))
              bool2 = true; 
            f = j4.c(b6);
          } 
          d4 = j4.c(b6);
          if (j4.c(b6) == 1.0F) {
            b1++;
          } else {
            b2++;
          } 
          if (j3.c(b6) == 1.0F) {
            b3++;
          } else {
            b4++;
          } 
        } 
      } 
      b6 = (b1 < b2) ? 1 : 0;
      boolean bool4 = (b3 > b4) ? true : false;
      d3 = -1.0D;
      d4 = -1.0D;
      double d5 = -1.0D;
      double d6 = 1.5D;
      int k;
      for (k = this.A; k < i + this.A && k < paramn.d(); k++) {
        if (bool1 || j6.c(k) == 0.0F) {
          double d7 = j3.c(k);
          if (d3 == -1.0D) {
            if (!bool1) {
              boolean bool = (bool4 == true) ? false : true;
              aZ aZ = new aZ(j1.c(k), bool);
              this.q.a(0, aZ);
            } else {
              aZ aZ = new aZ(this.q.b(), d7);
              aZ.a(true);
              this.q.a(0, aZ);
              aZ = new aZ(j1.c(k), d7);
              this.q.a(0, aZ);
            } 
          } else if (bool1) {
            aZ aZ = new aZ(j1.c(k), d3);
            aZ.a(true);
            this.q.a(0, aZ);
            aZ = new aZ(j1.c(k), d7);
            this.q.a(0, aZ);
          } else if (k == i + this.A - 1 || k == paramn.d() - 1) {
            if (!bool1) {
              boolean bool = (bool4 == true) ? false : true;
              aZ aZ = new aZ(j1.c(k), bool);
              this.q.a(0, aZ);
            } 
          } else if (d7 == bool4) {
            boolean bool = (bool4 == true) ? false : true;
            aZ aZ = new aZ(j1.c(k), bool);
            aZ.a(true);
            this.q.a(0, aZ);
            aZ = new aZ(j1.c(k), bool4);
            this.q.a(0, aZ);
            aZ = new aZ(j1.c(k), bool);
            aZ.a(true);
            this.q.a(0, aZ);
          } 
          d3 = d7;
        } 
        if (bool2 || j6.c(k) == 1.0F) {
          double d7 = j4.c(k);
          double d8 = d7 + d6;
          if (d4 == -1.0D) {
            if (!bool2) {
              double d9 = (d8 == d6) ? (1.0D + d6) : d6;
              aZ aZ = new aZ(this.q.b(), d9);
              aZ.a(true);
              this.q.a(1, aZ);
              aZ = new aZ(j1.c(k), d9);
              aZ.a(true);
              this.q.a(1, aZ);
              aZ = new aZ(j1.c(k), d8);
              this.q.a(1, aZ);
              aZ = new aZ(j1.c(k), d9);
              aZ.a(true);
              this.q.a(1, aZ);
            } else {
              d5 = (d8 == d6) ? d6 : (1.0D + d6);
              aZ aZ = new aZ(this.q.b(), d5);
              this.q.a(1, aZ);
              aZ = new aZ(j1.c(k), d5);
              aZ.a(true);
              this.q.a(1, aZ);
              aZ = new aZ(j1.c(k), d8);
              this.q.a(1, aZ);
            } 
          } else if (bool2) {
            aZ aZ = new aZ(j1.c(k), d5);
            aZ.a(true);
            this.q.a(1, aZ);
            aZ = new aZ(j1.c(k), d8);
            this.q.a(1, aZ);
          } else if (k == i + this.A - 1 || k == paramn.d() - 1) {
            if (!bool2) {
              double d9 = b6 + d6;
              aZ aZ = new aZ(j1.c(k), d9);
              aZ.a(true);
              this.q.a(1, aZ);
            } 
          } else if (j6.c(k) == 1.0F || (b6 != d7 && d8 != d5)) {
            double d9 = (d8 == d6) ? (1.0D + d6) : d6;
            aZ aZ = new aZ(j1.c(k), d9);
            aZ.a(true);
            this.q.a(1, aZ);
            aZ = new aZ(j1.c(k), d8);
            this.q.a(1, aZ);
            aZ = new aZ(j1.c(k), d9);
            aZ.a(true);
            this.q.a(1, aZ);
          } 
          d5 = d8;
          d4 = d7;
        } 
        if (j5.c(k) == 0.0F && j2.c(k) > 0.0F) {
          aZ aZ = new aZ(j1.c(k), -0.75D);
          aZ.a(true);
          this.q.a(2, aZ);
          aZ = new aZ(j1.c(k), -0.5D);
          aZ.a(true);
          this.q.a(2, aZ);
          aZ = new aZ(j1.c(k), -0.75D);
          aZ.a(true);
          this.q.a(2, aZ);
        } else if (k == this.A || k == i + this.A - 1) {
          aZ aZ = new aZ(j1.c(k), -0.75D);
          aZ.a(true);
          this.q.a(2, aZ);
        } 
      } 
      if (j6.f() == 1.0F)
        if (bool2) {
          if (d5 > 0.0D) {
            aZ aZ = new aZ(this.q.t(), d5);
            aZ.a(true);
            this.q.a(1, aZ);
          } else {
            double d7 = a(paramn, this.q.t());
            if (d7 >= 0.0D) {
              d5 = (d7 == 0.0D) ? (1.0D + d6) : d6;
            } else {
              double d8 = b(paramn, this.q.t());
              if (d8 >= 0.0D)
                d5 = (d8 == 0.0D) ? d6 : (1.0D + d6); 
            } 
            if (d5 > 0.0D) {
              aZ aZ = new aZ(this.q.b(), d5);
              aZ.a(true);
              this.q.a(1, aZ);
              aZ = new aZ(this.q.t(), d5);
              aZ.a(true);
              this.q.a(1, aZ);
            } 
          } 
        } else {
          double d7 = b6 + d6;
          aZ aZ = new aZ(this.q.b(), d7);
          aZ.a(true);
          this.q.a(1, aZ);
          aZ = new aZ(this.q.t(), d7);
          aZ.a(true);
          this.q.a(1, aZ);
        }  
      k = paramn.d();
      int m = k - b5 - this.A;
      if (b5 > 0) {
        double d7 = (this.q.t() - this.q.b()) / m;
        int i1 = b5 - j;
        i1 = i + this.A - k - i1;
        j -= this.A;
        double d8 = j * d7;
        double d9 = i1 * d7;
        if (d8 > 0.0D) {
          this.q.b(this.q.b() - d8);
          this.q.e(this.q.b() + i * d7);
        } 
        if (d9 > 0.0D)
          this.q.e(this.q.t() + d9); 
      } 
      this.q.repaint();
    } 
  }
  
  private double k(n paramn) {
    j j = paramn.a("Time");
    for (byte b1 = 0; b1 < paramn.d(); b1++) {
      if (j.c(b1) != 0.0F)
        return j.c(b1); 
    } 
    return 0.0D;
  }
  
  private double l(n paramn) {
    j j = paramn.a("Time");
    for (int i = paramn.d() - 1; i >= 0; i--) {
      if (j.c(i) != 0.0F)
        return j.c(i); 
    } 
    return 0.0D;
  }
  
  private double a(n paramn, double paramDouble) {
    j j1 = paramn.a("Time");
    j j2 = paramn.a("SecLevel");
    j j3 = paramn.a("Trigger");
    for (byte b1 = 0; b1 < paramn.d(); b1++) {
      if (j1.c(b1) > paramDouble && j3.c(b1) == 1.0F)
        return j2.c(b1); 
    } 
    return -1.0D;
  }
  
  private double b(n paramn, double paramDouble) {
    j j1 = paramn.a("Time");
    j j2 = paramn.a("SecLevel");
    j j3 = paramn.a("Trigger");
    for (int i = paramn.d() - 1; i >= 0; i--) {
      if (j1.c(i) < paramDouble && j3.c(i) == 1.0F)
        return j2.c(i); 
    } 
    return -1.0D;
  }
  
  protected void i() {
    this.A = this.x.c();
    if (this.ai != null) {
      cd cd = this.a.j();
      if (cd.d().equals(cd.d)) {
        if (this.j.getSelectedItem() != null) {
          j j = this.ai.a(this.j.getSelectedItem().toString());
          if (j != null)
            this.f.f(j.n()); 
        } 
        if (!this.g) {
          for (byte b1 = 0; b1 < this.k.size(); b1++) {
            JComboBox jComboBox = this.k.get(b1);
            if (jComboBox.getSelectedItem() != null) {
              j j = this.ai.a(jComboBox.getSelectedItem().toString());
              if (j != null)
                this.f.a(b1, j.n()); 
            } 
          } 
        } else {
          for (byte b1 = 0; b1 < this.l.size(); b1++) {
            fn fn = this.l.get(b1);
            if (fn.d()) {
              j j = this.ai.a(fn.b());
              if (j != null) {
                this.f.a(b1, j.n());
                this.f.a(b1, fn.c());
              } 
            } 
          } 
        } 
      } 
      d(this.ai);
    } 
  }
  
  private void m(n paramn) {
    if (!this.b.isDisplayable() && !this.d.isDisplayable())
      return; 
    if (paramn.d() == 0) {
      this.b.setText("Empty read, No Data Received from Controller");
      this.c.getDataVector().clear();
      this.c.fireTableDataChanged();
    } else {
      this.b.setText("");
      Vector<String> vector = new Vector();
      Vector<Vector> vector1 = new Vector();
      StringBuffer stringBuffer = new StringBuffer();
      stringBuffer.append(paramn.g() + "\n");
      byte b1;
      for (b1 = 0; b1 < paramn.size(); b1++) {
        j j = (j)paramn.get(b1);
        stringBuffer.append(j.a());
        vector.add(j.a());
        if (b1 < paramn.size() - 1)
          stringBuffer.append("\t"); 
      } 
      stringBuffer.append("\n");
      try {
        for (b1 = 0; b1 < paramn.size(); b1++) {
          j j = (j)paramn.get(b1);
          stringBuffer.append(j.n());
          if (b1 < paramn.size() - 1)
            stringBuffer.append("\t"); 
        } 
      } catch (Exception exception) {
        throw new a("Invalid units row in log file.");
      } 
      stringBuffer.append("\n");
      if (this.Z) {
        for (b1 = 0; b1 < paramn.d(); b1++) {
          Vector<Float> vector2 = new Vector();
          vector1.add(vector2);
          for (byte b2 = 0; b2 < paramn.size(); b2++) {
            j j = (j)paramn.get(b2);
            vector2.add(Float.valueOf(j.d(b1)));
          } 
        } 
        synchronized (this.c) {
          this.c.setDataVector(vector1, vector);
        } 
      } 
      for (b1 = 0; b1 < paramn.d(); b1++) {
        try {
          for (byte b2 = 0; b2 < paramn.size(); b2++) {
            j j = (j)paramn.get(b2);
            stringBuffer.append(j.c(b1) + "");
            if (b2 < paramn.size() - 1)
              stringBuffer.append("\t"); 
          } 
        } catch (Exception exception) {
          throw new a("Invalid data found at record: " + b1 + "\nThis file does not appear valid.");
        } 
        stringBuffer.append("\n");
      } 
      this.b.setText(stringBuffer.toString());
    } 
    this.b.setCaretPosition(0);
  }
  
  public void g(n paramn) {
    String str = this.a.m();
    if (!this.a.f() && (str == null || str.equals("")))
      return; 
    if (this.v == null && (paramn.isEmpty() || ((j)paramn.get(0)).x()))
      return; 
    if (this.v == null) {
      String str1 = this.T.P();
      if (str1 == null || str1.isEmpty())
        str1 = this.T.i(); 
      String str2 = "Firmware: " + str1;
      if (paramn.g() != null && !paramn.g().equals(""))
        str2 = str2 + "\nHeader: " + paramn.g(); 
      paramn.d(str2);
      this.v = d.a(paramn, str, ',');
    } 
    this.v.a(paramn);
  }
  
  protected void a(double paramDouble) {
    if (this.z / 2.0D > this.V) {
      a(this.z / 2.0D, paramDouble);
    } else {
      a(this.V, paramDouble);
    } 
  }
  
  private int s() {
    return (int)Math.round(this.B * this.z);
  }
  
  public void a(double paramDouble1, double paramDouble2) {
    double d1 = this.x.b();
    double d2 = 0.0D;
    if (paramDouble1 == this.z)
      return; 
    if (paramDouble1 > this.z) {
      this.z = paramDouble1;
      d2 = -(s() * paramDouble2 / this.B) / 2.0D;
    } else {
      d2 = s() * paramDouble2 / this.B / 2.0D;
      this.z = paramDouble1;
    } 
    b(O, paramDouble1 + "");
    this.x.a();
    this.x.a(d1 + d2);
    i();
  }
  
  protected void b(double paramDouble) {
    if (this.z * 2.0D < this.X) {
      a(this.z * 2.0D, paramDouble);
    } else {
      a(this.X, paramDouble);
    } 
  }
  
  public void a(et paramet) {
    this.aj = paramet;
    this.C.a(paramet);
  }
  
  public boolean a(String paramString, bT parambT) {
    this.E = true;
    return true;
  }
  
  public void a(String paramString) {
    this.a.l();
  }
  
  public boolean j() {
    return this.ak;
  }
  
  public void k() {
    this.ah.clear();
    this.af.clear();
    this.b.setText("");
    this.c.getDataVector().clear();
    this.c.fireTableDataChanged();
    this.y.c();
    this.y.repaint();
    this.x.a(false);
    h();
  }
  
  public boolean l() {
    return (this.ah.size() > 0);
  }
  
  public boolean m() {
    return this.al;
  }
  
  public void a(boolean paramBoolean) {
    this.al = paramBoolean;
  }
  
  protected ai n() {
    return this.ah;
  }
  
  private void t() {
    if (this.aa != null && this.aa.a) {
      this.aa.a();
      ao.a(this.x, true);
    } else {
      this.aa = new ax(this);
      this.aa.start();
      ao.a(this.x, false);
    } 
  }
  
  private void a(int paramInt1, int paramInt2) {
    JPopupMenu jPopupMenu = new JPopupMenu();
    JMenuItem jMenuItem = jPopupMenu.add(J);
    jMenuItem.addActionListener(new Y(this));
    List list = u();
    if (!list.isEmpty()) {
      a a1 = new a(g.b("Field Smoothing"));
      jPopupMenu.add((JMenuItem)a1);
      for (String str : list) {
        j j = this.ai.a(str);
        if (j != null) {
          a a2 = new a(str);
          this.C.a((bq)a2, j, this);
          a1.add((JMenuItem)a2);
        } 
      } 
    } 
    this.f.add(jPopupMenu);
    jPopupMenu.show((Component)this.f, paramInt1, paramInt2);
  }
  
  private List u() {
    ArrayList<String> arrayList = new ArrayList();
    if (this.j.getSelectedItem() != null && !this.j.getSelectedItem().toString().trim().isEmpty())
      arrayList.add(this.j.getSelectedItem().toString()); 
    if (!this.g) {
      for (JComboBox jComboBox : this.k) {
        if (jComboBox.getSelectedItem() != null && !jComboBox.getSelectedItem().toString().trim().isEmpty())
          arrayList.add(jComboBox.getSelectedItem().toString()); 
      } 
    } else {
      for (fn fn : this.l) {
        if (fn.d())
          arrayList.add(fn.b()); 
      } 
    } 
    return arrayList;
  }
  
  private void v() {
    if (this.ai != null) {
      this.F.a(this.ai);
      l l = new l(g.d(), this.F);
      l.a(bV.b(this));
    } 
  }
  
  public void b() {
    if (a() != null && a().f() && a().h() != null && a().h().r())
      f(); 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/com/efiAnalytics/tunerStudio/panels/TriggerLoggerPanel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */