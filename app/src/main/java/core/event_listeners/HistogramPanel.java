package ao;

import ActionListenerInGPackage.ActionListenerInGPackage;
import ActionListenerInGPackage.k;
import IOProperties.ExceptionInVPackage;
import V.ExceptionInVPackage;
import W.BxInterfaceJuliet;
import W.n;
import aw.ExceptionInVPackage;
import ax.ExceptionInAxPackage;
import bH.D;
import bH.S;
import bx.BxInterfaceJuliet;
import bx.BxInterfaceLima;
import com.efiAnalytics.ui.BinTableView;
import com.efiAnalytics.ui.NumericTextField;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.c;
import com.efiAnalytics.ui.cF;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.dD;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.de;
import com.efiAnalytics.ui.e;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.fF;
import com.efiAnalytics.ui.fh;
import com.efiAnalytics.ui.fp;
import com.efiAnalytics.ui.s;
import com.efiAnalytics.ui.w;
import h.ActionListenerInGPackage;
import h.ClassTypeInHPackage;
import h.IOProperties;
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
import k.ExceptionInVPackage;
import k.KComponentDelta;

public class go extends JPanel implements ExceptionInVPackage {
  JPanel ExceptionInVPackage = new JPanel();

  e ClassTypeInHPackage = new e();

  e c = new e();

  e KComponentDelta = new e();

  e e = new e();

  de f = new de();

  de ActionListenerInGPackage = new de();

  de h = new de();

  de IOProperties = new de();

  de BxInterfaceJuliet = new de();

  gX k = new gX(this);

  w BxInterfaceLima = new w(this.k);

  JLabel m = new JLabel(" ", 0);

  JLabel n = new JLabel(" ", 0);

  JLabel o = new JLabel("0.00", 0);

  JLabel p = new JLabel("0.00", 0);

  JSlider q = null;

  JSlider r = null;

  fF s = new fF();

  ExceptionInVPackage t = null;

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

  NumericTextField H;

  NumericTextField I;

  JButton J;

  NumericTextField K;

  NumericTextField L;

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

  static String ExceptionInAxPackage = "TableGenDisplayMode";

  JScrollPane V;

  dD W;

  JComboBox X;

  JButton Y = new JButton("Toggle Expand");

  JPanel Z = new JPanel();

  JPanel aa = new JPanel();

  bx ab = new bx(this);

  int ac = eJ.ExceptionInVPackage(14);

  boolean ad = true;

  int ae = -10;

  public go() {
    setLayout(new BorderLayout());
    this.al = new gW(this, (Component) this.BxInterfaceLima);
    this.W = new dD((Component) this.BxInterfaceLima);
    this.al.ExceptionInVPackage(250);
    this.BxInterfaceLima.h().ExceptionInVPackage(1);
    this.BxInterfaceLima.e(true);
    this.BxInterfaceLima.setName("Histogram");
    this.BxInterfaceLima.c(this.ac);
    this.BxInterfaceLima.h().ActionListenerInGPackage(false);
    this.BxInterfaceLima.f(true);
    this.BxInterfaceLima.h().f(BinTableView.ActionListenerInGPackage);
    this.BxInterfaceLima.h().h(false);
    this.BxInterfaceLima.h().getSelectionModel().addListSelectionListener(new gp(this));
    this.BxInterfaceLima.h().getColumnModel().addColumnModelListener(new gA(this));
    this.BxInterfaceLima.ExceptionInVPackage(new gL(this));
    this.BxInterfaceLima.h()
        .ExceptionInVPackage((et) new dQ(IOProperties.f(), "TableGenBinTablePrefs_"));
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
    this.ExceptionInVPackage.setLayout(new GridLayout(0, 1, 3, 3));
    this.ExceptionInVPackage.add(
        ExceptionInVPackage(" X Axis:", (Component) this.ClassTypeInHPackage));
    this.ExceptionInVPackage.add(ExceptionInVPackage(" Y Axis:", (Component) this.c));
    this.ExceptionInVPackage.add(ExceptionInVPackage(" Z Axis:", (Component) this.KComponentDelta));
    this.ExceptionInVPackage.add(new JLabel("Z Axis Delta (Optional)", 0));
    this.ExceptionInVPackage.setBorder(BorderFactory.createTitledBorder("Axis Fields"));
    this.ExceptionInVPackage.add((Component) this.e);
    this.ClassTypeInHPackage.addItemListener(new gR(this));
    this.c.addItemListener(new gS(this));
    this.KComponentDelta.addItemListener(new gT(this));
    this.e.addItemListener(new gU(this));
    this.ExceptionInVPackage.add(new JLabel(" "));
    byte ClassTypeInHPackage;
    for (ClassTypeInHPackage = 0; ClassTypeInHPackage < 5; ClassTypeInHPackage++)
      this.f.addItem(Integer.valueOf(ClassTypeInHPackage));
    this.ExceptionInVPackage.add(ExceptionInVPackage(" X Digits: ", (Component) this.f));
    this.f.addActionListener(new gV(this));
    for (ClassTypeInHPackage = 0; ClassTypeInHPackage < 5; ClassTypeInHPackage++)
      this.ActionListenerInGPackage.addItem(Integer.valueOf(ClassTypeInHPackage));
    this.ExceptionInVPackage.add(
        ExceptionInVPackage(" Y Digits: ", (Component) this.ActionListenerInGPackage));
    this.ActionListenerInGPackage.addActionListener(new gq(this));
    for (ClassTypeInHPackage = 0; ClassTypeInHPackage < 5; ClassTypeInHPackage++)
      this.h.addItem(Integer.valueOf(ClassTypeInHPackage));
    this.f.setEnabled(false);
    this.ActionListenerInGPackage.setEnabled(false);
    this.h.setEnabled(false);
    this.ExceptionInVPackage.add(ExceptionInVPackage(" Z Digits: ", (Component) this.h));
    this.h.addActionListener(new gr(this));
    this.X = new JComboBox();
    this.X.addItem(bx.e);
    this.X.addItem(bx.KComponentDelta);
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
      Image image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.ar, this, 18);
      this.Y.setText("");
      ImageIcon imageIcon = new ImageIcon(image);
      this.Y.setIcon(imageIcon);
      this.Z.add("West", this.Y);
      Dimension dimension1 = eJ.ExceptionInVPackage(18, 18);
      this.Y.setMinimumSize(dimension1);
      this.Y.setPreferredSize(dimension1);
    } catch (ExceptionInVPackage a1) {
      Logger.getLogger(fK.class.getName())
          .log(Level.WARNING, "Failed to load Scatter plot full screen image.", (Throwable) a1);
    }
    this.Y.setToolTipText("Toggle Expand");
    this.G.setLayout(new BorderLayout());
    this.aa.setLayout(new BorderLayout());
    this.aa.add("Center", (Component) this.BxInterfaceLima);
    this.V = new JScrollPane(this.aa);
    this.G.add("Center", this.V);
    this.G.add("North", this.Z);
    this.G.add("West", (Component) this.s);
    this.G.add("South", this.n);
    this.m.setFont(new Font("Times", 1, eJ.ExceptionInVPackage(18)));
    add("Center", this.G);
    jPanel1.add(this.ExceptionInVPackage);
    JPanel jPanel4 = new JPanel();
    jPanel4.setBorder(BorderFactory.createTitledBorder("Table Dimensions"));
    jPanel4.setLayout(new BorderLayout());
    this.H = new NumericTextField("", 1);
    this.I = new NumericTextField("", 1);
    gu gu = new gu(this);
    JPanel jPanel5 = new JPanel();
    jPanel5.setLayout(new GridLayout(2, 2));
    jPanel5.add(new JLabel("Rows", 0));
    jPanel5.add(new JLabel("Columns", 0));
    this.H.addFocusListener(gu);
    this.I.addFocusListener(gu);
    jPanel5.add((Component) this.H);
    jPanel5.add((Component) this.I);
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
    this.IOProperties.ExceptionInVPackage(S);
    this.IOProperties.ExceptionInVPackage(Q);
    this.IOProperties.ExceptionInVPackage(R);
    this.IOProperties.addActionListener(new gx(this));
    jPanel7.add((Component) this.IOProperties);
    this.K = new NumericTextField("Auto", 1);
    this.L = new NumericTextField("Auto", 1);
    gy gy = new gy(this);
    this.K.addKeyListener(gy);
    this.L.addKeyListener(gy);
    JPanel jPanel8 = new JPanel();
    jPanel8.setLayout(new GridLayout(1, 4));
    this.M = new JLabel("Color Min", 0);
    jPanel8.add(this.M);
    jPanel8.add((Component) this.K);
    this.N = new JLabel("Color Max", 0);
    jPanel8.add(this.N);
    jPanel8.add((Component) this.L);
    this.K.addFocusListener(gu);
    this.L.addFocusListener(gu);
    jPanel7.add(jPanel8);
    this.BxInterfaceJuliet.ExceptionInVPackage("Weighted Averages (Default)");
    this.BxInterfaceJuliet.ExceptionInVPackage("Minimum Values");
    this.BxInterfaceJuliet.ExceptionInVPackage("Maximum Values");
    this.BxInterfaceJuliet.addActionListener(new gz(this));
    jPanel7.add((Component) this.BxInterfaceJuliet);
    Dimension dimension = eJ.ExceptionInVPackage(35, 20);
    String str =
        "Minimum Individual Hit Weight - the minimum weight of each hit before it will be included."
            + " This can be used to filter data that hit the edgest of the cell. Valid values are"
            + " 0.0 to 1.0 where the closer to 1, the more centered ExceptionInVPackage hit needs"
            + " to be before it is included. 0 all hits will be counted with the associated"
            + " weighting, ExceptionInVPackage value of 1 requires ExceptionInVPackage direct"
            + " center hit to be included.";
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
    jPanel10.add("East", (Component) new cF(str, null));
    jPanel9.add("East", jPanel10);
    jPanel7.add(jPanel9);
    jPanel9 = new JPanel();
    jPanel9.setLayout(new BorderLayout());
    this.r = new JSlider(0, 0, 1000, 0);
    this.r.addChangeListener(new gC(this));
    jPanel9.add("Center", this.r);
    this.p.setMinimumSize(dimension);
    this.p.setPreferredSize(dimension);
    str =
        "Minimum Total Hit Weight - The minimum cumulative weight ExceptionInVPackage cell must"
            + " have before it is displayed. This can be used to filter cells that are displaying"
            + " ExceptionInVPackage value that doesn't have much data generating the value, so less"
            + " certainty.";
    jPanel10 = new JPanel();
    jPanel10.setLayout(new BorderLayout());
    jPanel10.add("Center", this.p);
    jPanel10.add("East", (Component) new cF(str, null));
    jPanel9.add("East", jPanel10);
    jPanel7.add(jPanel9);
    jPanel1.add(jPanel7);
    JPanel jPanel11 = new JPanel();
    jPanel11.setBorder(BorderFactory.createTitledBorder("Populate X & Y Axis"));
    jPanel11.setLayout(new GridLayout(0, 1));
    this.E.ExceptionInVPackage("Don't Generate X & Y Axis");
    this.E.ExceptionInVPackage("Auto-Generate axis High at top");
    this.E.ExceptionInVPackage("Auto-Generate axis Low at top");
    jPanel11.add((Component) this.E);
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
    jPanel2.setPreferredSize(eJ.ExceptionInVPackage(16, 20));
    jPanel2.setMinimumSize(eJ.ExceptionInVPackage(16, 20));
    jPanel12.add("East", jPanel2);
    JScrollPane jScrollPane = new JScrollPane(jPanel12);
    jScrollPane.setHorizontalScrollBarPolicy(31);
    add("West", jScrollPane);
    ExceptionInVPackage(true);
    ClassTypeInHPackage().c(1);
    c c = new c();
    c.f(0.0D);
    c.f();
    c.KComponentDelta(Double.MAX_VALUE);
    c.ExceptionInVPackage(0.0D);
    c.ActionListenerInGPackage(Double.MAX_VALUE);
    c.c(0.0D);
    ClassTypeInHPackage().ExceptionInVPackage(c);
  }

  private void h() {
    if (this.BxInterfaceLima.p() > 2) {
      this.BxInterfaceLima.c(1);
    } else {
      this.BxInterfaceLima.c(this.ac);
    }
    o();
  }

  private double IOProperties() {
    return this.q.getValue() / 100.0D;
  }

  public double ExceptionInVPackage() {
    return Math.pow(this.r.getValue() / 20.0D, 2.0D);
  }

  private void BxInterfaceJuliet() {
    double d1 = Double.NaN;
    double d2 = Double.NaN;
    try {
      d1 = Double.parseDouble(this.K.getText());
    } catch (NumberFormatException numberFormatException) {
    }
    try {
      d2 = Double.parseDouble(this.L.getText());
    } catch (NumberFormatException numberFormatException) {
    }
    this.BxInterfaceLima.h().h(d1);
    this.BxInterfaceLima.h().ActionListenerInGPackage(d2);
    ClassTypeInHPackage().C();
    ExceptionInVPackage(hx.ExceptionInVPackage().p());
    this.W.ExceptionInVPackage();
  }

  public gX ClassTypeInHPackage() {
    return (gX) this.BxInterfaceLima.ActionListenerInGPackage();
  }

  private void k() {
    if (!this.E.getSelectedItem().equals("Don't Generate X & Y Axis")
        && ClassTypeInHPackage().c() != null
        && ClassTypeInHPackage().getRowCount() > 0
        && ClassTypeInHPackage().getColumnCount() > 0) {
      BxInterfaceJuliet j1 =
          ClassTypeInHPackage()
              .c()
              .ExceptionInVPackage((String) this.ClassTypeInHPackage.getSelectedItem());
      BxInterfaceJuliet j2 =
          ClassTypeInHPackage().c().ExceptionInVPackage((String) this.c.getSelectedItem());
      if (j1 != null) ClassTypeInHPackage().ExceptionInVPackage(j1.e(), j1.f());
      if (j2 != null)
        if (this.E.getSelectedItem().equals("Auto-Generate axis High at top")) {
          ClassTypeInHPackage().ClassTypeInHPackage(j2.e(), j2.f());
        } else {
          ClassTypeInHPackage().ClassTypeInHPackage(j2.f(), j2.e());
        }
      try {
        this.BxInterfaceLima.k();
      } catch (Exception exception) {
      }
    }
  }

  public void ClassTypeInHPackage(int paramInt) {
    if (paramInt == BinTableView.ActionListenerInGPackage
        || paramInt == BinTableView.f
        || paramInt == BinTableView.e) {
      this.BxInterfaceLima.h().f(paramInt);
      this.W.ExceptionInVPackage();
      ClassTypeInHPackage(T, paramInt + "");
      if (this.IOProperties.getSelectedIndex() != paramInt)
        this.IOProperties.setSelectedIndex(paramInt);
    }
    this.K.setEnabled((paramInt == BinTableView.f));
    this.L.setEnabled((paramInt == BinTableView.f));
    this.M.setEnabled((paramInt == BinTableView.f));
    this.N.setEnabled((paramInt == BinTableView.f));
  }

  public void c(int paramInt) {
    D.c("##### display mode: " + paramInt);
    if (paramInt != 1 && paramInt != 3 && paramInt != 2) {
      D.ClassTypeInHPackage("Invalid mode for histogram display: " + paramInt);
      paramInt = 1;
    }
    if (paramInt != this.BxInterfaceLima.ActionListenerInGPackage().E()
        || this.BxInterfaceLima.ActionListenerInGPackage().E()
            != this.BxInterfaceJuliet.getSelectedIndex() + 1) {
      this.BxInterfaceLima.ActionListenerInGPackage().c(paramInt);
      ClassTypeInHPackage(ExceptionInAxPackage, paramInt + "");
      if (this.BxInterfaceJuliet.getSelectedIndex() + 1 != paramInt)
        this.BxInterfaceJuliet.setSelectedIndex(paramInt - 1);
      this.W.ExceptionInVPackage();
    }
  }

  private void BxInterfaceLima() {
    JPopupMenu jPopupMenu = new JPopupMenu();
    jPopupMenu.add(an).addActionListener(new gG(this));
    JMenu jMenu = new JMenu("Delete Saved View");
    gH gH = new gH(this);
    List list = hC.ExceptionInVPackage();
    for (String str : list) {
      if (!str.equals(P)) jMenu.add(str).addActionListener(gH);
    }
    jPopupMenu.add(jMenu);
    jPopupMenu.addSeparator();
    gI gI = new gI(this);
    for (String str : list) {
      if (!str.equals(P)) jPopupMenu.add(str).addActionListener(gI);
    }
    this.F.add(jPopupMenu);
    jPopupMenu.show(this.F, 0, this.F.getHeight());
  }

  private void m() {
    try {
      hC.ExceptionInVPackage(c());
    } catch (ExceptionInVPackage a1) {
      Logger.getLogger(go.class.getName()).log(Level.SEVERE, "Ouch", (Throwable) a1);
    }
  }

  private void n() {
    String str = "Histogram View Name";
    IOProperties.c("userParameter_" + str, this.m.getText());
    ActionListenerInGPackage ActionListenerInGPackage =
        new ActionListenerInGPackage(
            k.ExceptionInVPackage(this),
            "{Histogram View Name}",
            false,
            "       Save current Histogram View As",
            true);
    if (ActionListenerInGPackage.ExceptionInVPackage) {
      String str1 = ActionListenerInGPackage.ExceptionInVPackage();
      hD hD = c();
      hD.e(str1);
      try {
        hC.ExceptionInVPackage(hD);
      } catch (ExceptionInVPackage a1) {
        a1.printStackTrace();
        bV.KComponentDelta(a1.getLocalizedMessage(), this);
      }
    }
  }

  private void ExceptionInVPackage(String paramString) {
    if (bV.ExceptionInVPackage(
        "Are you sure you want to delete the view: " + paramString, this, true))
      hC.ClassTypeInHPackage(paramString);
  }

  private void ClassTypeInHPackage(String paramString) {
    try {
      hD hD = hC.ExceptionInVPackage(paramString);
      if (hD != null) ExceptionInVPackage(hD);
    } catch (ExceptionInVPackage a1) {
      a1.printStackTrace();
      bV.KComponentDelta(a1.getLocalizedMessage(), this);
    }
  }

  private void o() {
    if (this.ClassTypeInHPackage.getSelectedItem() == null
        || this.c.getSelectedItem() == null
        || this.KComponentDelta.getSelectedItem() == null
        || ClassTypeInHPackage().ExceptionInVPackage() == null
        || ClassTypeInHPackage().ExceptionInVPackage()[0] == null) return;
    n n = hx.ExceptionInVPackage().r();
    BxInterfaceJuliet j1 =
        n.ExceptionInVPackage(this.ClassTypeInHPackage.getSelectedItem().toString());
    BxInterfaceJuliet j2 = n.ExceptionInVPackage(this.KComponentDelta.getSelectedItem().toString());
    if (j1 != null && j2 != null) {
      this.ad = false;
      this.al.ExceptionInVPackage();
    } else {
      c c = new c();
      c.f(0.0D);
      c.f();
      c.KComponentDelta(Double.MAX_VALUE);
      c.ExceptionInVPackage(IOProperties());
      c.ClassTypeInHPackage(ExceptionInVPackage());
      c.ActionListenerInGPackage(Double.MAX_VALUE);
      c.c(0.0D);
      ClassTypeInHPackage().ExceptionInVPackage(c);
      this.BxInterfaceLima.h().BxInterfaceLima();
    }
  }

  private synchronized void p() {
    if (ClassTypeInHPackage.ExceptionInVPackage().ExceptionInVPackage("tableGenerator")) {
      this.ad = true;
      long BxInterfaceLima = System.currentTimeMillis();
      k();
      c c = new c();
      c.f(0.0D);
      c.f();
      c.KComponentDelta(Double.MAX_VALUE);
      c.ExceptionInVPackage(IOProperties());
      c.ClassTypeInHPackage(ExceptionInVPackage());
      c.ActionListenerInGPackage(Double.MAX_VALUE);
      c.c(0.0D);
      ClassTypeInHPackage().ExceptionInVPackage(c);
      if (this.ClassTypeInHPackage.getSelectedItem() == null
          || this.c.getSelectedItem() == null
          || this.KComponentDelta.getSelectedItem() == null
          || ClassTypeInHPackage().ExceptionInVPackage() == null
          || ClassTypeInHPackage().ExceptionInVPackage()[0] == null) return;
      n n = hx.ExceptionInVPackage().r();
      BxInterfaceJuliet j1 =
          n.ExceptionInVPackage(this.ClassTypeInHPackage.getSelectedItem().toString());
      BxInterfaceJuliet j2 = n.ExceptionInVPackage(this.c.getSelectedItem().toString());
      BxInterfaceJuliet j3 =
          n.ExceptionInVPackage(this.KComponentDelta.getSelectedItem().toString());
      BxInterfaceJuliet j4 = null;
      if (this.e.getSelectedItem() != null)
        j4 = n.ExceptionInVPackage(this.e.getSelectedItem().toString());
      Collection collection = this.t.ExceptionInVPackage();
      byte ClassTypeInHPackage = 0;
      if (j1 == null || j3 == null) return;
      for (int IOProperties = this.ah;
          IOProperties < n.KComponentDelta() && IOProperties < this.ag && this.ad;
          IOProperties++) {
        if (!ExceptionInVPackage(n, IOProperties)) {
          double KComponentDelta;
          float f1 = j1.KComponentDelta(IOProperties);
          float f2 = (j2 != null) ? j2.KComponentDelta(IOProperties) : Float.NaN;
          if (j4 == null) {
            KComponentDelta = j3.KComponentDelta(IOProperties);
          } else {
            KComponentDelta = (j3.KComponentDelta(IOProperties) - j4.KComponentDelta(IOProperties));
          }
          if (!Double.isNaN(KComponentDelta)) {
            double d1 = fh.ClassTypeInHPackage(ClassTypeInHPackage().ClassTypeInHPackage(), f1);
            double d2 =
                ClassTypeInHPackage().H()
                    ? ((ClassTypeInHPackage().getRowCount() - 1)
                        - fh.ExceptionInVPackage(ClassTypeInHPackage().ExceptionInVPackage(), f2))
                    : ((ClassTypeInHPackage().getRowCount() - 1)
                        - fh.ClassTypeInHPackage(ClassTypeInHPackage().ExceptionInVPackage(), f2));
            d1 =
                (ClassTypeInHPackage().getColumnCount() == 1)
                    ? 0.0D
                    : ((d1 < ClassTypeInHPackage().getColumnCount() - 1.000001D)
                        ? (d1 + 1.0E-6D)
                        : (d1 - 1.0E-6D));
            d2 =
                (ClassTypeInHPackage().getRowCount() == 1)
                    ? 0.0D
                    : ((d2 < ClassTypeInHPackage().getRowCount() - 1.000001D)
                        ? (d2 + 1.0E-6D)
                        : (d2 - 1.0E-6D));
            double d3 = Math.ceil(d1) - d1;
            double d4 = (ClassTypeInHPackage().getRowCount() > 1) ? (Math.ceil(d2) - d2) : 1.0D;
            double d5 = d3 * d4;
            ClassTypeInHPackage()
                .D()[(int) Math.floor(d2)][(int) Math.floor(d1)]
                .ExceptionInVPackage(Double.valueOf(KComponentDelta), d5);
            d3 = d1 - Math.floor(d1);
            d4 = (ClassTypeInHPackage().getRowCount() > 1) ? (Math.ceil(d2) - d2) : 1.0D;
            d5 = d3 * d4;
            ClassTypeInHPackage()
                .D()[(int) Math.floor(d2)][(int) Math.ceil(d1)]
                .ExceptionInVPackage(Double.valueOf(KComponentDelta), d5);
            if (ClassTypeInHPackage().getColumnCount() > 1) {
              d3 = Math.ceil(d1) - d1;
              d4 = d2 - Math.floor(d2);
              d5 = d3 * d4;
              ClassTypeInHPackage()
                  .D()[(int) Math.ceil(d2)][(int) Math.floor(d1)]
                  .ExceptionInVPackage(Double.valueOf(KComponentDelta), d5);
            }
            if (ClassTypeInHPackage().getRowCount() > 1
                && ClassTypeInHPackage().getColumnCount() > 1) {
              d3 = Math.abs(d1 - Math.floor(d1));
              d4 = Math.abs(d2 - Math.floor(d2));
              d5 = d3 * d4;
              ClassTypeInHPackage()
                  .D()[(int) Math.ceil(d2)][(int) Math.ceil(d1)]
                  .ExceptionInVPackage(Double.valueOf(KComponentDelta), d5);
            }
          }
        } else {
          ClassTypeInHPackage++;
        }
      }
      if (ClassTypeInHPackage().getRowCount() == 1) {
        if (!fp.ExceptionInVPackage(this.aa.getComponents(), this.ab)) {
          this.aa.removeAll();
          this.aa.add("South", (Component) this.BxInterfaceLima);
          this.aa.add("Center", this.ab);
        }
        this.ab.setVisible(true);
        this.ab.ClassTypeInHPackage();
      } else if (fp.ExceptionInVPackage(this.aa.getComponents(), this.ab)) {
        this.aa.removeAll();
        this.aa.add("Center", (Component) this.BxInterfaceLima);
      }
      this.aa.setPreferredSize(this.BxInterfaceLima.getPreferredSize());
      this.BxInterfaceLima.setVisible(true);
      this.Y.setVisible(
          (ClassTypeInHPackage().getRowCount() > 24
              || ClassTypeInHPackage().getColumnCount() > 24));
      this.X.setVisible((ClassTypeInHPackage().getRowCount() == 1));
      if (ClassTypeInHPackage().KComponentDelta() != null
          && ClassTypeInHPackage().KComponentDelta().n() != null) {
        this.ab.c(ClassTypeInHPackage().KComponentDelta().n());
      } else {
        this.ab.c("");
      }
      this.ab.c();
      for (String str1 : ClassTypeInHPackage().ClassTypeInHPackage())
        this.ab.ClassTypeInHPackage(str1);
      try {
        hC.ExceptionInVPackage(c());
      } catch (ExceptionInVPackage a1) {
        a1.printStackTrace();
      }
      String str = ClassTypeInHPackage + "";
      gJ gJ = new gJ(this, n, str);
      SwingUtilities.invokeLater(gJ);
    }
  }

  public hD c() {
    hD hD = new hD();
    hD.e(P);
    hD.ClassTypeInHPackage(ClassTypeInHPackage().getColumnCount());
    hD.ExceptionInVPackage(ClassTypeInHPackage().getRowCount());
    hD.c(this.f.getSelectedIndex());
    hD.KComponentDelta(this.ActionListenerInGPackage.getSelectedIndex());
    hD.e(this.h.getSelectedIndex());
    if (this.ClassTypeInHPackage.getSelectedItem() != null) {
      hD.ExceptionInVPackage(
          ActionListenerInGPackage.ExceptionInVPackage()
              .KComponentDelta(this.ClassTypeInHPackage.getSelectedItem().toString()));
    } else {
      hD.ExceptionInVPackage("");
    }
    if (this.c.getSelectedItem() != null) {
      hD.ClassTypeInHPackage(
          ActionListenerInGPackage.ExceptionInVPackage()
              .KComponentDelta(this.c.getSelectedItem().toString()));
    } else {
      hD.ClassTypeInHPackage("");
    }
    if (this.KComponentDelta.getSelectedItem() != null) {
      hD.c(
          ActionListenerInGPackage.ExceptionInVPackage()
              .KComponentDelta(this.KComponentDelta.getSelectedItem().toString()));
    } else {
      hD.c("");
    }
    if (this.e.getSelectedItem() != null) {
      hD.KComponentDelta(
          ActionListenerInGPackage.ExceptionInVPackage()
              .KComponentDelta(this.e.getSelectedItem().toString()));
    } else {
      hD.KComponentDelta("");
    }
    hD.f(this.ab.ExceptionInVPackage());
    hD.ClassTypeInHPackage(ClassTypeInHPackage().ExceptionInVPackage());
    hD.ExceptionInVPackage(ClassTypeInHPackage().ClassTypeInHPackage());
    hD.f(this.IOProperties.getSelectedIndex());
    hD.ActionListenerInGPackage(this.BxInterfaceJuliet.getSelectedIndex() + 1);
    hD.ActionListenerInGPackage((String) this.E.getSelectedItem());
    hD.h(this.q.getValue());
    hD.IOProperties(this.r.getValue());
    return hD;
  }

  public void ExceptionInVPackage(hD paramhD) {
    if (ClassTypeInHPackage().getRowCount() != paramhD.ExceptionInVPackage()
        || ClassTypeInHPackage().getColumnCount() != paramhD.ClassTypeInHPackage())
      ClassTypeInHPackage()
          .ExceptionInVPackage(paramhD.ExceptionInVPackage(), paramhD.ClassTypeInHPackage());
    ClassTypeInHPackage().e(paramhD.ActionListenerInGPackage());
    ClassTypeInHPackage().c(paramhD.f());
    this.BxInterfaceLima.h().ClassTypeInHPackage(paramhD.BxInterfaceJuliet());
    this.BxInterfaceLima.ClassTypeInHPackage(paramhD.k());
    this.BxInterfaceLima.h().ExceptionInVPackage(paramhD.BxInterfaceLima());
    this.f.setSelectedItem(Integer.valueOf(paramhD.BxInterfaceJuliet()));
    this.ActionListenerInGPackage.setSelectedItem(Integer.valueOf(paramhD.k()));
    this.h.setSelectedItem(Integer.valueOf(paramhD.BxInterfaceLima()));
    this.ClassTypeInHPackage.setSelectedItem(
        ActionListenerInGPackage.ExceptionInVPackage().ExceptionInVPackage(paramhD.c()));
    this.c.setSelectedItem(
        ActionListenerInGPackage.ExceptionInVPackage()
            .ExceptionInVPackage(paramhD.KComponentDelta()));
    this.KComponentDelta.setSelectedItem(
        ActionListenerInGPackage.ExceptionInVPackage().ExceptionInVPackage(paramhD.e()));
    this.e.setSelectedItem(
        ActionListenerInGPackage.ExceptionInVPackage().ExceptionInVPackage(paramhD.h()));
    this.H.setText("" + paramhD.ExceptionInVPackage());
    this.I.setText("" + paramhD.ClassTypeInHPackage());
    this.ab.ExceptionInVPackage(paramhD.m());
    ClassTypeInHPackage(paramhD.n());
    this.BxInterfaceJuliet.setSelectedIndex(paramhD.o() - 1);
    e(paramhD.p());
    this.q.setValue(paramhD.q());
    this.r.setValue(paramhD.r());
    this.BxInterfaceLima.k();
    o();
  }

  private boolean ExceptionInVPackage(n paramn, int paramInt) {
    for (BxInterfaceJuliet BxInterfaceJuliet : this.t.ExceptionInVPackage()) {
      try {
        String str = c(BxInterfaceJuliet.c());
        ExceptionInVPackage a1 = KComponentDelta.ExceptionInVPackage().ExceptionInVPackage(str);
        if (a1.ExceptionInVPackage(paramn, paramInt) != 0.0D) return true;
      } catch (ExceptionInAxPackage u) {
        this.t.ExceptionInVPackage(BxInterfaceJuliet.ExceptionInVPackage(), false);
        D.KComponentDelta(
            "Filter: "
                + BxInterfaceJuliet.ExceptionInVPackage()
                + " caused errors with this log, disabling.");
        u.printStackTrace();
      }
    }
    return false;
  }

  private String c(String paramString) {
    String str = (String) this.w.get(paramString);
    if (str == null) {
      str = ActionListenerInGPackage.ExceptionInVPackage().c(paramString);
      this.w.put(paramString, str);
    }
    return str;
  }

  private void q() {
    int IOProperties = (int) Math.round(this.H.e());
    int BxInterfaceJuliet = (int) Math.round(this.I.e());
    if (IOProperties > 0
        && BxInterfaceJuliet > 0
        && (IOProperties != this.BxInterfaceLima.ActionListenerInGPackage().getRowCount()
            || BxInterfaceJuliet
                != this.BxInterfaceLima.ActionListenerInGPackage().getColumnCount())) {
      gX gX1 = new gX(this);
      gX1.ExceptionInVPackage = this.k.ExceptionInVPackage;
      gX1.ClassTypeInHPackage = this.k.ClassTypeInHPackage;
      gX1.c = this.k.c;
      gX1.ExceptionInVPackage(IOProperties, BxInterfaceJuliet);
      fh.c(this.BxInterfaceLima.ActionListenerInGPackage(), gX1);
      gX1.c(this.BxInterfaceJuliet.getSelectedIndex() + 1);
      this.BxInterfaceLima.setVisible(false);
      this.ab.setVisible(false);
      this.BxInterfaceLima.ExceptionInVPackage(gX1);
      gX1.ExceptionInVPackage(hx.ExceptionInVPackage().r());
      this.k = gX1;
      o();
    }
  }

  private void r() {
    hE hE = (bq.ExceptionInVPackage().e()).ActionListenerInGPackage;
    if (hE != null && hE.m() != null) {
      hW hW = hE.m();
      JPopupMenu jPopupMenu = new JPopupMenu();
      String[] arrayOfString = new String[hW.KComponentDelta()];
      byte b1 = 0;
      Iterator<String> iterator = hW.c();
      while (iterator.hasNext()) {
        arrayOfString[b1] = iterator.next();
        b1++;
      }
      gK gK = new gK(this);
      arrayOfString = k.ClassTypeInHPackage(arrayOfString);
      for (byte b2 = 0; b2 < arrayOfString.length; b2++)
        jPopupMenu.add(arrayOfString[b2]).addActionListener(gK);
      this.D.add(jPopupMenu);
      jPopupMenu.show(this.D, 0, this.D.getHeight());
    } else {
      bV.KComponentDelta("No Tune Loaded.", this);
    }
  }

  private void KComponentDelta(String paramString) {
    D.c("Import: " + paramString);
    hE hE = (bq.ExceptionInVPackage().e()).ActionListenerInGPackage;
    hW hW = hE.m();
    hY hY = hW.ClassTypeInHPackage(paramString);
    s s = this.BxInterfaceLima.ActionListenerInGPackage();
    if (s.getColumnCount() != hY.getColumnCount() || s.getRowCount() != hY.getRowCount())
      s.ExceptionInVPackage(hY.getRowCount(), hY.getColumnCount());
    fh.c(hY, s);
    this.I.setText(s.getColumnCount() + "");
    this.H.setText(s.getRowCount() + "");
    e("Don't Generate X & Y Axis");
    o();
  }

  private void e(String paramString) {
    this.E.setSelectedItem(paramString);
    ClassTypeInHPackage("autoGenerateXY", "" + paramString);
  }

  private JPanel ExceptionInVPackage(String paramString, Component paramComponent) {
    JPanel jPanel = new JPanel();
    jPanel.setLayout(new BorderLayout());
    JLabel jLabel = new JLabel(paramString);
    jLabel.setMinimumSize(new Dimension(80, 20));
    jPanel.add("West", jLabel);
    jPanel.add(paramComponent, "Center");
    return jPanel;
  }

  public void ExceptionInVPackage(boolean paramBoolean) {
    if (this.t == null) {
      this.u = new JPanel();
      this.u.setLayout(new BorderLayout());
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new BorderLayout());
      Image image =
          Toolkit.getDefaultToolkit().getImage(getClass().getResource("resources/edit-icon.png"));
      ImageIcon imageIcon = new ImageIcon(image);
      this.B = new JButton(null, imageIcon);
      this.B.setFocusable(false);
      this.B.setToolTipText("Show Filters");
      this.B.addActionListener(new gM(this));
      this.B.setPreferredSize(new Dimension(18, 18));
      jPanel.add("West", this.B);
      this.t = new ExceptionInVPackage(null);
      this.t.ExceptionInVPackage(new gN(this));
      this.u.add("North", jPanel);
      M.ExceptionInVPackage().ExceptionInVPackage((BxInterfaceLima) this.t);
      this.u.add("Center", (Component) this.t);
      add("East", this.u);
    }
    if (paramBoolean)
      ;
  }

  public void ExceptionInVPackage(h paramh) {
    this.y.add(paramh);
  }

  private void s() {
    String str =
        (this.ClassTypeInHPackage.getSelectedItem() == null)
            ? ""
            : this.ClassTypeInHPackage.getSelectedItem().toString();
    Iterator<h> iterator = this.y.iterator();
    while (iterator.hasNext()) ((h) iterator.next()).ExceptionInVPackage(str);
  }

  private void t() {
    String str = (this.c.getSelectedItem() == null) ? "" : this.c.getSelectedItem().toString();
    Iterator<h> iterator = this.y.iterator();
    while (iterator.hasNext()) ((h) iterator.next()).ClassTypeInHPackage(str);
  }

  private void u() {
    String str =
        (this.KComponentDelta.getSelectedItem() == null)
            ? ""
            : this.KComponentDelta.getSelectedItem().toString();
    Iterator<h> iterator = this.y.iterator();
    while (iterator.hasNext()) ((h) iterator.next()).c(str);
  }

  public void ExceptionInVPackage(n paramn) {
    ClassTypeInHPackage().ExceptionInVPackage(paramn);
    this.w.clear();
    ClassTypeInHPackage(paramn);
    D.c("Dataset size: " + paramn.KComponentDelta());
    String str = (String) this.ClassTypeInHPackage.getSelectedItem();
    ClassTypeInHPackage().ExceptionInVPackage(str);
    str = (String) this.c.getSelectedItem();
    ClassTypeInHPackage().ClassTypeInHPackage(str);
    str = (String) this.KComponentDelta.getSelectedItem();
    ClassTypeInHPackage().c(str);
    try {
      hD hD = hC.ExceptionInVPackage(P);
      if (hD != null) {
        gO gO = new gO(this, hD);
        SwingUtilities.invokeLater(gO);
      }
    } catch (ExceptionInVPackage a1) {
      a1.printStackTrace();
    }
    if (paramn != null) {
      this.f.setEnabled(true);
      this.ActionListenerInGPackage.setEnabled(true);
      this.h.setEnabled(true);
      this.H.setEnabled(true);
      this.I.setEnabled(true);
      this.J.setEnabled(true);
    }
  }

  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    Dimension dimension;
    int IOProperties = (this.ClassTypeInHPackage.getPreferredSize()).width;
    int BxInterfaceJuliet = (paramInt3 - 200) / 3;
    if (IOProperties < BxInterfaceJuliet) {
      dimension = new Dimension(IOProperties, 20);
    } else {
      dimension = new Dimension(BxInterfaceJuliet, 20);
    }
    this.ClassTypeInHPackage.setMinimumSize(dimension);
    this.c.setMinimumSize(dimension);
    this.KComponentDelta.setMinimumSize(dimension);
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }

  private void ClassTypeInHPackage(n paramn) {
    this.am = true;
    ExceptionInVPackage(this.ClassTypeInHPackage, paramn, " ");
    ExceptionInVPackage(this.c, paramn, " ");
    ExceptionInVPackage(this.KComponentDelta, paramn, " ");
    ExceptionInVPackage(this.e, paramn, " ");
    this.am = false;
  }

  private void ExceptionInVPackage(e parame, n paramn, String paramString) {
    if (paramn == null) return;
    String str = (String) parame.getSelectedItem();
    boolean bool1 = false;
    String[] arrayOfString1 = parame.ClassTypeInHPackage();
    String[] arrayOfString2 = new String[paramn.size()];
    boolean bool2 = (arrayOfString1.length == arrayOfString2.length + 1) ? true : false;
    byte ClassTypeInHPackage;
    for (ClassTypeInHPackage = 0; ClassTypeInHPackage < paramn.size(); ClassTypeInHPackage++) {
      BxInterfaceJuliet BxInterfaceJuliet = (BxInterfaceJuliet) paramn.get(ClassTypeInHPackage);
      arrayOfString2[ClassTypeInHPackage] = BxInterfaceJuliet.ExceptionInVPackage();
      if (bool2
          && !arrayOfString2[ClassTypeInHPackage].equals(arrayOfString1[ClassTypeInHPackage + 1]))
        bool2 = false;
    }
    if (!bool2) {
      parame.removeAllItems();
      if (parame.getItemCount() == 0) parame.ExceptionInVPackage(paramString);
      if (IOProperties.ExceptionInVPackage(IOProperties.E, IOProperties.F))
        arrayOfString2 = S.ExceptionInVPackage(arrayOfString2);
      ClassTypeInHPackage = 1;
      for (byte b1 = 0; b1 < arrayOfString2.length; b1++) {
        if (!bool1 && arrayOfString2[b1].equals(str)) bool1 = true;
        int IOProperties = b1 + ClassTypeInHPackage;
        parame.ExceptionInVPackage(arrayOfString2[b1]);
      }
    }
    try {
      if (!bool1) parame.ClassTypeInHPackage(str);
    } catch (Exception exception) {
      parame.ClassTypeInHPackage(paramString);
    }
  }

  protected void KComponentDelta() {
    if (this.ClassTypeInHPackage.getSelectedItem() != null
        && this.c.getSelectedItem() != null
        && this.KComponentDelta.getSelectedItem() != null
        && ((String) this.ClassTypeInHPackage.getSelectedItem()).length() > 0
        && ((String) this.c.getSelectedItem()).length() > 0
        && ((String) this.KComponentDelta.getSelectedItem()).length() > 0) {
      String str =
          this.ClassTypeInHPackage.getSelectedItem() + " vs. " + this.c.getSelectedItem() + " vs. ";
      if (this.e.getSelectedItem() != null && !this.e.getSelectedItem().toString().isEmpty()) {
        str =
            str
                + "( "
                + this.KComponentDelta.getSelectedItem()
                + " - "
                + this.e.getSelectedItem()
                + " )";
      } else {
        str = str + this.KComponentDelta.getSelectedItem();
      }
      this.m.setText(str);
      this.n.setText(this.ClassTypeInHPackage.getSelectedItem().toString());
      this.s.setText(this.c.getSelectedItem().toString());
      this.BxInterfaceLima.ActionListenerInGPackage()
          .e(this.ClassTypeInHPackage.getSelectedItem().toString());
      this.BxInterfaceLima.ActionListenerInGPackage()
          .KComponentDelta(this.c.getSelectedItem().toString());
    }
  }

  public void ExceptionInVPackage(et paramet) {
    this.af = paramet;
    e();
  }

  public void e() {
    if (this.af != null) {
      String str1 = ExceptionInVPackage("autoGenerateXY", "Don't Generate X & Y Axis");
      this.E.setSelectedItem(str1);
    }
    String str = ExceptionInVPackage(T, "2");
    ClassTypeInHPackage(Integer.parseInt(str));
    str = ExceptionInVPackage(ExceptionInAxPackage, "1");
    c(Integer.parseInt(str));
  }

  private String ExceptionInVPackage(String paramString1, String paramString2) {
    if (this.af != null) {
      String str = this.af.ExceptionInVPackage(paramString1);
      return (str != null) ? str : paramString2;
    }
    return paramString2;
  }

  private void ClassTypeInHPackage(String paramString1, String paramString2) {
    if (this.af != null) this.af.ExceptionInVPackage(paramString1, paramString2);
  }

  public void KComponentDelta(int paramInt) {
    this.ag = paramInt;
    o();
  }

  public void e(int paramInt) {
    this.ah = paramInt;
    o();
  }

  public String f() {
    return (String) this.e.getSelectedItem();
  }

  public boolean ActionListenerInGPackage() {
    return (ClassTypeInHPackage().ExceptionInVPackage() != null
        && ClassTypeInHPackage().ExceptionInVPackage()[0] != null
        && ClassTypeInHPackage().ClassTypeInHPackage() != null
        && ClassTypeInHPackage().ClassTypeInHPackage()[0] != null);
  }

  public void ExceptionInVPackage(int paramInt) {
    gP gP = new gP(this, paramInt);
    SwingUtilities.invokeLater(gP);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/go.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
