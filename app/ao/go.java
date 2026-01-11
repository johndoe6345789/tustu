package ao;

import V.a;
import W.j;
import W.n;
import aw.a;
import ax.U;
import bH.D;
import bH.S;
import bx.j;
import bx.l;
import com.efiAnalytics.ui.BinTableView;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.c;
import com.efiAnalytics.ui.cF;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.dD;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.de;
import com.efiAnalytics.ui.do;
import com.efiAnalytics.ui.e;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.fF;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.fp;
import com.efiAnalytics.ui.s;
import com.efiAnalytics.ui.w;
import g.g;
import g.k;
import h.b;
import h.g;
import h.i;
import i.a;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;
import k.a;
import k.d;

public class go extends JPanel implements a {
  JPanel a = new JPanel();
  
  e b = new e();
  
  e c = new e();
  
  e d = new e();
  
  e e = new e();
  
  de f = new de();
  
  de g = new de();
  
  de h = new de();
  
  de i = new de();
  
  de j = new de();
  
  gX k = new gX(this);
  
  w l = new w(this.k);
  
  JLabel m = new JLabel(" ", 0);
  
  JLabel n = new JLabel(" ", 0);
  
  JLabel o = new JLabel("0.00", 0);
  
  JLabel p = new JLabel("0.00", 0);
  
  JSlider q = null;
  
  JSlider r = null;
  
  fF s = new fF();
  
  a t = null;
  
  JPanel u = null;
  
  JToggleButton v = new JToggleButton("Scales");
  
  private et af = null;
  
  private int ag = 100000000;
  
  private int ah = 0;
  
  private String ai = null;
  
  private String aj = null;
  
  private String ak = null;
  
  HashMap w = new HashMap<>();
  
  JPanel x;
  
  ArrayList y = new ArrayList();
  
  private gW al = null;
  
  private boolean am = false;
  
  JButton z = null;
  
  JButton A = null;
  
  JButton B = null;
  
  JButton C = null;
  
  JButton D = null;
  
  de E = new de();
  
  JButton F;
  
  JPanel G = new JPanel();
  
  do H;
  
  do I;
  
  JButton J;
  
  do K;
  
  do L;
  
  JLabel M;
  
  JLabel N;
  
  gY O = new gY(this);
  
  public static String P = "Current View";
  
  private static String an = "Save Current View As";
  
  private static String ao = "Delete View";
  
  static String Q = "Color based on Value";
  
  static String R = "Color based on Hit Weight";
  
  static String S = "No Color";
  
  static String T = "TableGenColorMode";
  
  static String U = "TableGenDisplayMode";
  
  JScrollPane V;
  
  dD W;
  
  JComboBox X;
  
  JButton Y = new JButton("Toggle Expand");
  
  JPanel Z = new JPanel();
  
  JPanel aa = new JPanel();
  
  bx ab = new bx(this);
  
  int ac = eJ.a(14);
  
  boolean ad = true;
  
  int ae = -10;
  
  public go() {
    setLayout(new BorderLayout());
    this.al = new gW(this, (Component)this.l);
    this.W = new dD((Component)this.l);
    this.al.a(250);
    this.l.h().a(1);
    this.l.e(true);
    this.l.setName("Histogram");
    this.l.c(this.ac);
    this.l.h().g(false);
    this.l.f(true);
    this.l.h().f(BinTableView.g);
    this.l.h().h(false);
    this.l.h().getSelectionModel().addListSelectionListener(new gp(this));
    this.l.h().getColumnModel().addColumnModelListener(new gA(this));
    this.l.a(new gL(this));
    this.l.h().a((et)new dQ(i.f(), "TableGenBinTablePrefs_"));
    setBorder(BorderFactory.createLineBorder(Color.darkGray));
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BoxLayout(jPanel1, 1));
    jPanel1.setBorder(BorderFactory.createTitledBorder("Histogram View Settings"));
    this.F = new JButton("Saved Histogram Views");
    this.F.addActionListener(new gQ(this));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new GridLayout(1, 1));
    jPanel2.add(this.F);
    jPanel1.add(jPanel2);
    this.x = new JPanel();
    this.x.setLayout(new BorderLayout());
    this.a.setLayout(new GridLayout(0, 1, 3, 3));
    this.a.add(a(" X Axis:", (Component)this.b));
    this.a.add(a(" Y Axis:", (Component)this.c));
    this.a.add(a(" Z Axis:", (Component)this.d));
    this.a.add(new JLabel("Z Axis Delta (Optional)", 0));
    this.a.setBorder(BorderFactory.createTitledBorder("Axis Fields"));
    this.a.add((Component)this.e);
    this.b.addItemListener(new gR(this));
    this.c.addItemListener(new gS(this));
    this.d.addItemListener(new gT(this));
    this.e.addItemListener(new gU(this));
    this.a.add(new JLabel(" "));
    byte b;
    for (b = 0; b < 5; b++)
      this.f.addItem(Integer.valueOf(b)); 
    this.a.add(a(" X Digits: ", (Component)this.f));
    this.f.addActionListener(new gV(this));
    for (b = 0; b < 5; b++)
      this.g.addItem(Integer.valueOf(b)); 
    this.a.add(a(" Y Digits: ", (Component)this.g));
    this.g.addActionListener(new gq(this));
    for (b = 0; b < 5; b++)
      this.h.addItem(Integer.valueOf(b)); 
    this.f.setEnabled(false);
    this.g.setEnabled(false);
    this.h.setEnabled(false);
    this.a.add(a(" Z Digits: ", (Component)this.h));
    this.h.addActionListener(new gr(this));
    this.X = new JComboBox();
    this.X.addItem(bx.e);
    this.X.addItem(bx.d);
    this.X.addItem(bx.f);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    jPanel3.add("West", this.X);
    add("North", jPanel3);
    this.X.addItemListener(new gs(this));
    this.Z.setLayout(new BorderLayout());
    this.Z.add("Center", this.m);
    this.Z.add("East", this.X);
    this.Y.addActionListener(new gt(this));
    try {
      Image image = cO.a().a(cO.ar, this, 18);
      this.Y.setText("");
      ImageIcon imageIcon = new ImageIcon(image);
      this.Y.setIcon(imageIcon);
      this.Z.add("West", this.Y);
      Dimension dimension1 = eJ.a(18, 18);
      this.Y.setMinimumSize(dimension1);
      this.Y.setPreferredSize(dimension1);
    } catch (a a1) {
      Logger.getLogger(fK.class.getName()).log(Level.WARNING, "Failed to load Scatter plot full screen image.", (Throwable)a1);
    } 
    this.Y.setToolTipText("Toggle Expand");
    this.G.setLayout(new BorderLayout());
    this.aa.setLayout(new BorderLayout());
    this.aa.add("Center", (Component)this.l);
    this.V = new JScrollPane(this.aa);
    this.G.add("Center", this.V);
    this.G.add("North", this.Z);
    this.G.add("West", (Component)this.s);
    this.G.add("South", this.n);
    this.m.setFont(new Font("Times", 1, eJ.a(18)));
    add("Center", this.G);
    jPanel1.add(this.a);
    JPanel jPanel4 = new JPanel();
    jPanel4.setBorder(BorderFactory.createTitledBorder("Table Dimensions"));
    jPanel4.setLayout(new BorderLayout());
    this.H = new do("", 1);
    this.I = new do("", 1);
    gu gu = new gu(this);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new GridLayout(2, 2));
    jPanel5.add(new JLabel("Rows", 0));
    jPanel5.add(new JLabel("Columns", 0));
    this.H.addFocusListener(gu);
    this.I.addFocusListener(gu);
    jPanel5.add((Component)this.H);
    jPanel5.add((Component)this.I);
    gv gv = new gv(this);
    this.H.addKeyListener(gv);
    this.I.addKeyListener(gv);
    jPanel4.add(jPanel5, "Center");
    this.J = new JButton("Resize Table");
    this.J.addActionListener(new gw(this));
    this.H.setEnabled(false);
    this.I.setEnabled(false);
    this.J.setEnabled(false);
    jPanel4.add(this.J, "South");
    JPanel jPanel6 = new JPanel();
    jPanel6.setLayout(new GridLayout(1, 1));
    jPanel6.add(jPanel4);
    jPanel1.add(jPanel6);
    JPanel jPanel7 = new JPanel();
    jPanel7.setBorder(BorderFactory.createTitledBorder("Table Display Options"));
    jPanel7.setLayout(new GridLayout(0, 1, 4, 4));
    this.i.a(S);
    this.i.a(Q);
    this.i.a(R);
    this.i.addActionListener(new gx(this));
    jPanel7.add((Component)this.i);
    this.K = new do("Auto", 1);
    this.L = new do("Auto", 1);
    gy gy = new gy(this);
    this.K.addKeyListener(gy);
    this.L.addKeyListener(gy);
    JPanel jPanel8 = new JPanel();
    jPanel8.setLayout(new GridLayout(1, 4));
    this.M = new JLabel("Color Min", 0);
    jPanel8.add(this.M);
    jPanel8.add((Component)this.K);
    this.N = new JLabel("Color Max", 0);
    jPanel8.add(this.N);
    jPanel8.add((Component)this.L);
    this.K.addFocusListener(gu);
    this.L.addFocusListener(gu);
    jPanel7.add(jPanel8);
    this.j.a("Weighted Averages (Default)");
    this.j.a("Minimum Values");
    this.j.a("Maximum Values");
    this.j.addActionListener(new gz(this));
    jPanel7.add((Component)this.j);
    Dimension dimension = eJ.a(35, 20);
    String str = "Minimum Individual Hit Weight - the minimum weight of each hit before it will be included. This can be used to filter data that hit the edgest of the cell. Valid values are 0.0 to 1.0 where the closer to 1, the more centered a hit needs to be before it is included. 0 all hits will be counted with the associated weighting, a value of 1 requires a direct center hit to be included.";
    JPanel jPanel9 = new JPanel();
    jPanel9.setLayout(new BorderLayout());
    this.q = new JSlider(0, 0, 100, 0);
    this.q.addChangeListener(new gB(this));
    jPanel9.add("Center", this.q);
    this.o.setMinimumSize(dimension);
    this.o.setPreferredSize(dimension);
    JPanel jPanel10 = new JPanel();
    jPanel10.setLayout(new BorderLayout());
    jPanel10.add("Center", this.o);
    jPanel10.add("East", (Component)new cF(str, null));
    jPanel9.add("East", jPanel10);
    jPanel7.add(jPanel9);
    jPanel9 = new JPanel();
    jPanel9.setLayout(new BorderLayout());
    this.r = new JSlider(0, 0, 1000, 0);
    this.r.addChangeListener(new gC(this));
    jPanel9.add("Center", this.r);
    this.p.setMinimumSize(dimension);
    this.p.setPreferredSize(dimension);
    str = "Minimum Total Hit Weight - The minimum cumulative weight a cell must have before it is displayed. This can be used to filter cells that are displaying a value that doesn't have much data generating the value, so less certainty.";
    jPanel10 = new JPanel();
    jPanel10.setLayout(new BorderLayout());
    jPanel10.add("Center", this.p);
    jPanel10.add("East", (Component)new cF(str, null));
    jPanel9.add("East", jPanel10);
    jPanel7.add(jPanel9);
    jPanel1.add(jPanel7);
    JPanel jPanel11 = new JPanel();
    jPanel11.setBorder(BorderFactory.createTitledBorder("Populate X & Y Axis"));
    jPanel11.setLayout(new GridLayout(0, 1));
    this.E.a("Don't Generate X & Y Axis");
    this.E.a("Auto-Generate axis High at top");
    this.E.a("Auto-Generate axis Low at top");
    jPanel11.add((Component)this.E);
    this.E.addActionListener(new gD(this));
    this.D = new JButton("Import From Loaded Tune");
    this.D.addActionListener(new gE(this));
    jPanel11.add(this.D);
    jPanel1.add(jPanel11);
    jPanel1.add(new JLabel(" "));
    jPanel1.add(this.O);
    JButton jButton = new JButton("Generate histogram");
    jButton.addActionListener(new gF(this));
    JPanel jPanel12 = new JPanel();
    jPanel12.setLayout(new BorderLayout());
    jPanel12.add("Center", jPanel1);
    jPanel2 = new JPanel();
    jPanel2.setPreferredSize(eJ.a(16, 20));
    jPanel2.setMinimumSize(eJ.a(16, 20));
    jPanel12.add("East", jPanel2);
    JScrollPane jScrollPane = new JScrollPane(jPanel12);
    jScrollPane.setHorizontalScrollBarPolicy(31);
    add("West", jScrollPane);
    a(true);
    b().c(1);
    c c = new c();
    c.f(0.0D);
    c.f();
    c.d(Double.MAX_VALUE);
    c.a(0.0D);
    c.g(Double.MAX_VALUE);
    c.c(0.0D);
    b().a(c);
  }
  
  private void h() {
    if (this.l.p() > 2) {
      this.l.c(1);
    } else {
      this.l.c(this.ac);
    } 
    o();
  }
  
  private double i() {
    return this.q.getValue() / 100.0D;
  }
  
  public double a() {
    return Math.pow(this.r.getValue() / 20.0D, 2.0D);
  }
  
  private void j() {
    double d1 = Double.NaN;
    double d2 = Double.NaN;
    try {
      d1 = Double.parseDouble(this.K.getText());
    } catch (NumberFormatException numberFormatException) {}
    try {
      d2 = Double.parseDouble(this.L.getText());
    } catch (NumberFormatException numberFormatException) {}
    this.l.h().h(d1);
    this.l.h().g(d2);
    b().C();
    a(hx.a().p());
    this.W.a();
  }
  
  public gX b() {
    return (gX)this.l.g();
  }
  
  private void k() {
    if (!this.E.getSelectedItem().equals("Don't Generate X & Y Axis") && b().c() != null && b().getRowCount() > 0 && b().getColumnCount() > 0) {
      j j1 = b().c().a((String)this.b.getSelectedItem());
      j j2 = b().c().a((String)this.c.getSelectedItem());
      if (j1 != null)
        b().a(j1.e(), j1.f()); 
      if (j2 != null)
        if (this.E.getSelectedItem().equals("Auto-Generate axis High at top")) {
          b().b(j2.e(), j2.f());
        } else {
          b().b(j2.f(), j2.e());
        }  
      try {
        this.l.k();
      } catch (Exception exception) {}
    } 
  }
  
  public void b(int paramInt) {
    if (paramInt == BinTableView.g || paramInt == BinTableView.f || paramInt == BinTableView.e) {
      this.l.h().f(paramInt);
      this.W.a();
      b(T, paramInt + "");
      if (this.i.getSelectedIndex() != paramInt)
        this.i.setSelectedIndex(paramInt); 
    } 
    this.K.setEnabled((paramInt == BinTableView.f));
    this.L.setEnabled((paramInt == BinTableView.f));
    this.M.setEnabled((paramInt == BinTableView.f));
    this.N.setEnabled((paramInt == BinTableView.f));
  }
  
  public void c(int paramInt) {
    D.c("##### display mode: " + paramInt);
    if (paramInt != 1 && paramInt != 3 && paramInt != 2) {
      D.b("Invalid mode for histogram display: " + paramInt);
      paramInt = 1;
    } 
    if (paramInt != this.l.g().E() || this.l.g().E() != this.j.getSelectedIndex() + 1) {
      this.l.g().c(paramInt);
      b(U, paramInt + "");
      if (this.j.getSelectedIndex() + 1 != paramInt)
        this.j.setSelectedIndex(paramInt - 1); 
      this.W.a();
    } 
  }
  
  private void l() {
    JPopupMenu jPopupMenu = new JPopupMenu();
    jPopupMenu.add(an).addActionListener(new gG(this));
    JMenu jMenu = new JMenu("Delete Saved View");
    gH gH = new gH(this);
    List list = hC.a();
    for (String str : list) {
      if (!str.equals(P))
        jMenu.add(str).addActionListener(gH); 
    } 
    jPopupMenu.add(jMenu);
    jPopupMenu.addSeparator();
    gI gI = new gI(this);
    for (String str : list) {
      if (!str.equals(P))
        jPopupMenu.add(str).addActionListener(gI); 
    } 
    this.F.add(jPopupMenu);
    jPopupMenu.show(this.F, 0, this.F.getHeight());
  }
  
  private void m() {
    try {
      hC.a(c());
    } catch (a a1) {
      Logger.getLogger(go.class.getName()).log(Level.SEVERE, "Ouch", (Throwable)a1);
    } 
  }
  
  private void n() {
    String str = "Histogram View Name";
    i.c("userParameter_" + str, this.m.getText());
    g g = new g(k.a(this), "{Histogram View Name}", false, "       Save current Histogram View As", true);
    if (g.a) {
      String str1 = g.a();
      hD hD = c();
      hD.e(str1);
      try {
        hC.a(hD);
      } catch (a a1) {
        a1.printStackTrace();
        bV.d(a1.getLocalizedMessage(), this);
      } 
    } 
  }
  
  private void a(String paramString) {
    if (bV.a("Are you sure you want to delete the view: " + paramString, this, true))
      hC.b(paramString); 
  }
  
  private void b(String paramString) {
    try {
      hD hD = hC.a(paramString);
      if (hD != null)
        a(hD); 
    } catch (a a1) {
      a1.printStackTrace();
      bV.d(a1.getLocalizedMessage(), this);
    } 
  }
  
  private void o() {
    if (this.b.getSelectedItem() == null || this.c.getSelectedItem() == null || this.d.getSelectedItem() == null || b().a() == null || b().a()[0] == null)
      return; 
    n n = hx.a().r();
    j j1 = n.a(this.b.getSelectedItem().toString());
    j j2 = n.a(this.d.getSelectedItem().toString());
    if (j1 != null && j2 != null) {
      this.ad = false;
      this.al.a();
    } else {
      c c = new c();
      c.f(0.0D);
      c.f();
      c.d(Double.MAX_VALUE);
      c.a(i());
      c.b(a());
      c.g(Double.MAX_VALUE);
      c.c(0.0D);
      b().a(c);
      this.l.h().l();
    } 
  }
  
  private synchronized void p() {
    if (b.a().a("tableGenerator")) {
      this.ad = true;
      long l = System.currentTimeMillis();
      k();
      c c = new c();
      c.f(0.0D);
      c.f();
      c.d(Double.MAX_VALUE);
      c.a(i());
      c.b(a());
      c.g(Double.MAX_VALUE);
      c.c(0.0D);
      b().a(c);
      if (this.b.getSelectedItem() == null || this.c.getSelectedItem() == null || this.d.getSelectedItem() == null || b().a() == null || b().a()[0] == null)
        return; 
      n n = hx.a().r();
      j j1 = n.a(this.b.getSelectedItem().toString());
      j j2 = n.a(this.c.getSelectedItem().toString());
      j j3 = n.a(this.d.getSelectedItem().toString());
      j j4 = null;
      if (this.e.getSelectedItem() != null)
        j4 = n.a(this.e.getSelectedItem().toString()); 
      Collection collection = this.t.a();
      byte b = 0;
      if (j1 == null || j3 == null)
        return; 
      for (int i = this.ah; i < n.d() && i < this.ag && this.ad; i++) {
        if (!a(n, i)) {
          double d;
          float f1 = j1.d(i);
          float f2 = (j2 != null) ? j2.d(i) : Float.NaN;
          if (j4 == null) {
            d = j3.d(i);
          } else {
            d = (j3.d(i) - j4.d(i));
          } 
          if (!Double.isNaN(d)) {
            double d1 = fh.b(b().b(), f1);
            double d2 = b().H() ? ((b().getRowCount() - 1) - fh.a(b().a(), f2)) : ((b().getRowCount() - 1) - fh.b(b().a(), f2));
            d1 = (b().getColumnCount() == 1) ? 0.0D : ((d1 < b().getColumnCount() - 1.000001D) ? (d1 + 1.0E-6D) : (d1 - 1.0E-6D));
            d2 = (b().getRowCount() == 1) ? 0.0D : ((d2 < b().getRowCount() - 1.000001D) ? (d2 + 1.0E-6D) : (d2 - 1.0E-6D));
            double d3 = Math.ceil(d1) - d1;
            double d4 = (b().getRowCount() > 1) ? (Math.ceil(d2) - d2) : 1.0D;
            double d5 = d3 * d4;
            b().D()[(int)Math.floor(d2)][(int)Math.floor(d1)].a(Double.valueOf(d), d5);
            d3 = d1 - Math.floor(d1);
            d4 = (b().getRowCount() > 1) ? (Math.ceil(d2) - d2) : 1.0D;
            d5 = d3 * d4;
            b().D()[(int)Math.floor(d2)][(int)Math.ceil(d1)].a(Double.valueOf(d), d5);
            if (b().getColumnCount() > 1) {
              d3 = Math.ceil(d1) - d1;
              d4 = d2 - Math.floor(d2);
              d5 = d3 * d4;
              b().D()[(int)Math.ceil(d2)][(int)Math.floor(d1)].a(Double.valueOf(d), d5);
            } 
            if (b().getRowCount() > 1 && b().getColumnCount() > 1) {
              d3 = Math.abs(d1 - Math.floor(d1));
              d4 = Math.abs(d2 - Math.floor(d2));
              d5 = d3 * d4;
              b().D()[(int)Math.ceil(d2)][(int)Math.ceil(d1)].a(Double.valueOf(d), d5);
            } 
          } 
        } else {
          b++;
        } 
      } 
      if (b().getRowCount() == 1) {
        if (!fp.a(this.aa.getComponents(), this.ab)) {
          this.aa.removeAll();
          this.aa.add("South", (Component)this.l);
          this.aa.add("Center", this.ab);
        } 
        this.ab.setVisible(true);
        this.ab.b();
      } else if (fp.a(this.aa.getComponents(), this.ab)) {
        this.aa.removeAll();
        this.aa.add("Center", (Component)this.l);
      } 
      this.aa.setPreferredSize(this.l.getPreferredSize());
      this.l.setVisible(true);
      this.Y.setVisible((b().getRowCount() > 24 || b().getColumnCount() > 24));
      this.X.setVisible((b().getRowCount() == 1));
      if (b().d() != null && b().d().n() != null) {
        this.ab.c(b().d().n());
      } else {
        this.ab.c("");
      } 
      this.ab.c();
      for (String str1 : b().b())
        this.ab.b(str1); 
      try {
        hC.a(c());
      } catch (a a1) {
        a1.printStackTrace();
      } 
      String str = b + "";
      gJ gJ = new gJ(this, n, str);
      SwingUtilities.invokeLater(gJ);
    } 
  }
  
  public hD c() {
    hD hD = new hD();
    hD.e(P);
    hD.b(b().getColumnCount());
    hD.a(b().getRowCount());
    hD.c(this.f.getSelectedIndex());
    hD.d(this.g.getSelectedIndex());
    hD.e(this.h.getSelectedIndex());
    if (this.b.getSelectedItem() != null) {
      hD.a(g.a().d(this.b.getSelectedItem().toString()));
    } else {
      hD.a("");
    } 
    if (this.c.getSelectedItem() != null) {
      hD.b(g.a().d(this.c.getSelectedItem().toString()));
    } else {
      hD.b("");
    } 
    if (this.d.getSelectedItem() != null) {
      hD.c(g.a().d(this.d.getSelectedItem().toString()));
    } else {
      hD.c("");
    } 
    if (this.e.getSelectedItem() != null) {
      hD.d(g.a().d(this.e.getSelectedItem().toString()));
    } else {
      hD.d("");
    } 
    hD.f(this.ab.a());
    hD.b(b().a());
    hD.a(b().b());
    hD.f(this.i.getSelectedIndex());
    hD.g(this.j.getSelectedIndex() + 1);
    hD.g((String)this.E.getSelectedItem());
    hD.h(this.q.getValue());
    hD.i(this.r.getValue());
    return hD;
  }
  
  public void a(hD paramhD) {
    if (b().getRowCount() != paramhD.a() || b().getColumnCount() != paramhD.b())
      b().a(paramhD.a(), paramhD.b()); 
    b().e(paramhD.g());
    b().c(paramhD.f());
    this.l.h().b(paramhD.j());
    this.l.b(paramhD.k());
    this.l.h().a(paramhD.l());
    this.f.setSelectedItem(Integer.valueOf(paramhD.j()));
    this.g.setSelectedItem(Integer.valueOf(paramhD.k()));
    this.h.setSelectedItem(Integer.valueOf(paramhD.l()));
    this.b.setSelectedItem(g.a().a(paramhD.c()));
    this.c.setSelectedItem(g.a().a(paramhD.d()));
    this.d.setSelectedItem(g.a().a(paramhD.e()));
    this.e.setSelectedItem(g.a().a(paramhD.h()));
    this.H.setText("" + paramhD.a());
    this.I.setText("" + paramhD.b());
    this.ab.a(paramhD.m());
    b(paramhD.n());
    this.j.setSelectedIndex(paramhD.o() - 1);
    e(paramhD.p());
    this.q.setValue(paramhD.q());
    this.r.setValue(paramhD.r());
    this.l.k();
    o();
  }
  
  private boolean a(n paramn, int paramInt) {
    for (j j : this.t.a()) {
      try {
        String str = c(j.c());
        a a1 = d.a().a(str);
        if (a1.a(paramn, paramInt) != 0.0D)
          return true; 
      } catch (U u) {
        this.t.a(j.a(), false);
        D.d("Filter: " + j.a() + " caused errors with this log, disabling.");
        u.printStackTrace();
      } 
    } 
    return false;
  }
  
  private String c(String paramString) {
    String str = (String)this.w.get(paramString);
    if (str == null) {
      str = g.a().c(paramString);
      this.w.put(paramString, str);
    } 
    return str;
  }
  
  private void q() {
    int i = (int)Math.round(this.H.e());
    int j = (int)Math.round(this.I.e());
    if (i > 0 && j > 0 && (i != this.l.g().getRowCount() || j != this.l.g().getColumnCount())) {
      gX gX1 = new gX(this);
      gX1.a = this.k.a;
      gX1.b = this.k.b;
      gX1.c = this.k.c;
      gX1.a(i, j);
      fh.c(this.l.g(), gX1);
      gX1.c(this.j.getSelectedIndex() + 1);
      this.l.setVisible(false);
      this.ab.setVisible(false);
      this.l.a(gX1);
      gX1.a(hx.a().r());
      this.k = gX1;
      o();
    } 
  }
  
  private void r() {
    hE hE = (bq.a().e()).g;
    if (hE != null && hE.m() != null) {
      hW hW = hE.m();
      JPopupMenu jPopupMenu = new JPopupMenu();
      String[] arrayOfString = new String[hW.d()];
      byte b1 = 0;
      Iterator<String> iterator = hW.c();
      while (iterator.hasNext()) {
        arrayOfString[b1] = iterator.next();
        b1++;
      } 
      gK gK = new gK(this);
      arrayOfString = k.b(arrayOfString);
      for (byte b2 = 0; b2 < arrayOfString.length; b2++)
        jPopupMenu.add(arrayOfString[b2]).addActionListener(gK); 
      this.D.add(jPopupMenu);
      jPopupMenu.show(this.D, 0, this.D.getHeight());
    } else {
      bV.d("No Tune Loaded.", this);
    } 
  }
  
  private void d(String paramString) {
    D.c("Import: " + paramString);
    hE hE = (bq.a().e()).g;
    hW hW = hE.m();
    hY hY = hW.b(paramString);
    s s = this.l.g();
    if (s.getColumnCount() != hY.getColumnCount() || s.getRowCount() != hY.getRowCount())
      s.a(hY.getRowCount(), hY.getColumnCount()); 
    fh.c(hY, s);
    this.I.setText(s.getColumnCount() + "");
    this.H.setText(s.getRowCount() + "");
    e("Don't Generate X & Y Axis");
    o();
  }
  
  private void e(String paramString) {
    this.E.setSelectedItem(paramString);
    b("autoGenerateXY", "" + paramString);
  }
  
  private JPanel a(String paramString, Component paramComponent) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    JLabel jLabel = new JLabel(paramString);
    jLabel.setMinimumSize(new Dimension(80, 20));
    jPanel.add("West", jLabel);
    jPanel.add(paramComponent, "Center");
    return jPanel;
  }
  
  public void a(boolean paramBoolean) {
    if (this.t == null) {
      this.u = new JPanel();
      this.u.setLayout(new BorderLayout());
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new BorderLayout());
      Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/edit-icon.png"));
      ImageIcon imageIcon = new ImageIcon(image);
      this.B = new JButton(null, imageIcon);
      this.B.setFocusable(false);
      this.B.setToolTipText("Show Filters");
      this.B.addActionListener(new gM(this));
      this.B.setPreferredSize(new Dimension(18, 18));
      jPanel.add("West", this.B);
      this.t = new a(null);
      this.t.a(new gN(this));
      this.u.add("North", jPanel);
      M.a().a((l)this.t);
      this.u.add("Center", (Component)this.t);
      add("East", this.u);
    } 
    if (paramBoolean);
  }
  
  public void a(h paramh) {
    this.y.add(paramh);
  }
  
  private void s() {
    String str = (this.b.getSelectedItem() == null) ? "" : this.b.getSelectedItem().toString();
    Iterator<h> iterator = this.y.iterator();
    while (iterator.hasNext())
      ((h)iterator.next()).a(str); 
  }
  
  private void t() {
    String str = (this.c.getSelectedItem() == null) ? "" : this.c.getSelectedItem().toString();
    Iterator<h> iterator = this.y.iterator();
    while (iterator.hasNext())
      ((h)iterator.next()).b(str); 
  }
  
  private void u() {
    String str = (this.d.getSelectedItem() == null) ? "" : this.d.getSelectedItem().toString();
    Iterator<h> iterator = this.y.iterator();
    while (iterator.hasNext())
      ((h)iterator.next()).c(str); 
  }
  
  public void a(n paramn) {
    b().a(paramn);
    this.w.clear();
    b(paramn);
    D.c("Dataset size: " + paramn.d());
    String str = (String)this.b.getSelectedItem();
    b().a(str);
    str = (String)this.c.getSelectedItem();
    b().b(str);
    str = (String)this.d.getSelectedItem();
    b().c(str);
    try {
      hD hD = hC.a(P);
      if (hD != null) {
        gO gO = new gO(this, hD);
        SwingUtilities.invokeLater(gO);
      } 
    } catch (a a1) {
      a1.printStackTrace();
    } 
    if (paramn != null) {
      this.f.setEnabled(true);
      this.g.setEnabled(true);
      this.h.setEnabled(true);
      this.H.setEnabled(true);
      this.I.setEnabled(true);
      this.J.setEnabled(true);
    } 
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dimension dimension;
    int i = (this.b.getPreferredSize()).width;
    int j = (paramInt3 - 200) / 3;
    if (i < j) {
      dimension = new Dimension(i, 20);
    } else {
      dimension = new Dimension(j, 20);
    } 
    this.b.setMinimumSize(dimension);
    this.c.setMinimumSize(dimension);
    this.d.setMinimumSize(dimension);
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  private void b(n paramn) {
    this.am = true;
    a(this.b, paramn, " ");
    a(this.c, paramn, " ");
    a(this.d, paramn, " ");
    a(this.e, paramn, " ");
    this.am = false;
  }
  
  private void a(e parame, n paramn, String paramString) {
    if (paramn == null)
      return; 
    String str = (String)parame.getSelectedItem();
    boolean bool1 = false;
    String[] arrayOfString1 = parame.b();
    String[] arrayOfString2 = new String[paramn.size()];
    boolean bool2 = (arrayOfString1.length == arrayOfString2.length + 1) ? true : false;
    byte b;
    for (b = 0; b < paramn.size(); b++) {
      j j = (j)paramn.get(b);
      arrayOfString2[b] = j.a();
      if (bool2 && !arrayOfString2[b].equals(arrayOfString1[b + 1]))
        bool2 = false; 
    } 
    if (!bool2) {
      parame.removeAllItems();
      if (parame.getItemCount() == 0)
        parame.a(paramString); 
      if (i.a(i.E, i.F))
        arrayOfString2 = S.a(arrayOfString2); 
      b = 1;
      for (byte b1 = 0; b1 < arrayOfString2.length; b1++) {
        if (!bool1 && arrayOfString2[b1].equals(str))
          bool1 = true; 
        int i = b1 + b;
        parame.a(arrayOfString2[b1]);
      } 
    } 
    try {
      if (!bool1)
        parame.b(str); 
    } catch (Exception exception) {
      parame.b(paramString);
    } 
  }
  
  protected void d() {
    if (this.b.getSelectedItem() != null && this.c.getSelectedItem() != null && this.d.getSelectedItem() != null && ((String)this.b.getSelectedItem()).length() > 0 && ((String)this.c.getSelectedItem()).length() > 0 && ((String)this.d.getSelectedItem()).length() > 0) {
      String str = this.b.getSelectedItem() + " vs. " + this.c.getSelectedItem() + " vs. ";
      if (this.e.getSelectedItem() != null && !this.e.getSelectedItem().toString().isEmpty()) {
        str = str + "( " + this.d.getSelectedItem() + " - " + this.e.getSelectedItem() + " )";
      } else {
        str = str + this.d.getSelectedItem();
      } 
      this.m.setText(str);
      this.n.setText(this.b.getSelectedItem().toString());
      this.s.setText(this.c.getSelectedItem().toString());
      this.l.g().e(this.b.getSelectedItem().toString());
      this.l.g().d(this.c.getSelectedItem().toString());
    } 
  }
  
  public void a(et paramet) {
    this.af = paramet;
    e();
  }
  
  public void e() {
    if (this.af != null) {
      String str1 = a("autoGenerateXY", "Don't Generate X & Y Axis");
      this.E.setSelectedItem(str1);
    } 
    String str = a(T, "2");
    b(Integer.parseInt(str));
    str = a(U, "1");
    c(Integer.parseInt(str));
  }
  
  private String a(String paramString1, String paramString2) {
    if (this.af != null) {
      String str = this.af.a(paramString1);
      return (str != null) ? str : paramString2;
    } 
    return paramString2;
  }
  
  private void b(String paramString1, String paramString2) {
    if (this.af != null)
      this.af.a(paramString1, paramString2); 
  }
  
  public void d(int paramInt) {
    this.ag = paramInt;
    o();
  }
  
  public void e(int paramInt) {
    this.ah = paramInt;
    o();
  }
  
  public String f() {
    return (String)this.e.getSelectedItem();
  }
  
  public boolean g() {
    return (b().a() != null && b().a()[0] != null && b().b() != null && b().b()[0] != null);
  }
  
  public void a(int paramInt) {
    gP gP = new gP(this, paramInt);
    SwingUtilities.invokeLater(gP);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/go.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */