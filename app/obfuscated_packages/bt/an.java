package bt;

import G.R;
import G.aI;
import G.aM;
import G.aN;
import G.aR;
import G.bM;
import G.bj;
import G.bm;
import G.bv;
import G.c;
import G.cl;
import G.cq;
import G.cu;
import G.db;
import G.dj;
import G.i;
import G.k;
import V.a;
import V.g;
import V.j;
import W.i;
import W.j;
import W.n;
import ax.U;
import bH.D;
import bH.X;
import bH.p;
import bH.u;
import bH.w;
import c.d;
import com.efiAnalytics.tuningwidgets.panels.a;
import com.efiAnalytics.ui.bN;
import com.efiAnalytics.ui.bS;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.eJ;
import com.efiAnalytics.ui.ef;
import com.efiAnalytics.ui.et;
import com.efiAnalytics.ui.fp;
import com.efiAnalytics.ui.r;
import i.c;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComponent;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;
import k.a;
import k.d;
import r.i;
import s.g;

public class an extends JPanel implements aN, cq, L, d, bS, bc {
  R a = null;
  
  ArrayList b = new ArrayList();
  
  ArrayList c = new ArrayList();
  
  static final String d = g.b("Set X Axis Minimum");
  
  static final String e = g.b("Set X Axis Maximum");
  
  static final String f = g.b("Auto Scale X Axis Maximum");
  
  static final String g = g.b("Set Y Axis Minimum");
  
  static final String h = g.b("Set Y Axis Maximum");
  
  static final String i = g.b("Auto Scale Y Axis Maximum");
  
  static final String j = g.b("Selection Follow Mode") + " (CTRL+F)";
  
  static final String k = g.b("Set History Timeout");
  
  static final String l = g.b("Show baseline graph") + " (CTRL+B)";
  
  static final String m = g.b("Revert to baseline");
  
  static final String n = g.b("Show X-Y Data Log Plot") + " (CTRL+X)";
  
  static final String o = g.b("Set Coarse Step Count");
  
  private String P = null;
  
  private boolean Q = true;
  
  bN p = null;
  
  bm q = null;
  
  aI r = null;
  
  aH s;
  
  JPanel t = null;
  
  aL u = null;
  
  T v = null;
  
  T w = null;
  
  int[] x = null;
  
  boolean y = false;
  
  et z;
  
  aP A = null;
  
  aR B = null;
  
  aS C = null;
  
  aU D = null;
  
  boolean E = false;
  
  boolean F = true;
  
  aT G = new aT(this);
  
  boolean H = false;
  
  aO I;
  
  bP J = null;
  
  aK K = new aK(this);
  
  a L = null;
  
  aJ M = null;
  
  i N = new aM(this);
  
  List O = new ArrayList();
  
  public an(R paramR, bm parambm, boolean paramBoolean, et paramet) {
    this.a = paramR;
    this.q = parambm;
    if (paramet == null)
      paramet = new aQ(this); 
    this.z = paramet;
    this.E = i.a().a("09LKFDSLK4K ");
    this.F = i.a().a(";'DS;'G-043LF;L");
    setLayout(new BorderLayout());
    if (parambm.E()) {
      b(paramBoolean);
    } else {
      this.p = new bN();
      if (i.a().a("joijt;i609tr0932")) {
        this.p.h(true);
      } else {
        this.p.h(false);
      } 
      byte b1;
      for (b1 = 0; b1 < parambm.j(); b1++) {
        aM aM = paramR.c(parambm.d(b1));
        if (aM == null)
          throw new a("CurveGraph X Parameter " + parambm.d(b1) + " not found in the current configuration."); 
        this.c.add(aM);
        i.a(paramR.c(), aM, this);
      } 
      for (b1 = 0; b1 < parambm.d(); b1++) {
        aM aM = paramR.c(parambm.b(b1));
        String str = parambm.a(b1);
        boolean bool = true;
        try {
          bool = (str != null && i.a(str, (aI)paramR) != 0.0D) ? true : false;
        } catch (U u) {}
        if (bool) {
          if (aM == null)
            throw new a("CurveGraph Y Parameter " + parambm.b(b1) + " not found in the current configuration."); 
          this.b.add(aM);
          i.a(paramR.c(), aM, this);
        } 
      } 
      if (this.b.size() == 0)
        bV.d("No Y Axis Bins for CurveGraph " + parambm.aL() + "\nthe Y Axis must have at least 1 Y Axis Bin assigned.", this); 
      add("Center", (Component)this.p);
      c_(parambm.aJ());
      this.Q = parambm.v();
      this.p.k((int)a(k, 10000.0D));
      this.p.h(parambm.p());
      this.p.i(parambm.o());
      this.p.addMouseListener(new ao(this));
      if (this.b.size() > 0 && ((aM)this.b.get(0)).aL() != null) {
        this.t = new JPanel();
        this.t.setLayout(new GridLayout(1, 2, 1, 1));
        a a1 = new a(paramR, ((aM)this.b.get(0)).aL());
        this.t.add(a1);
        l l = new l(paramR, ((aM)this.b.get(0)).aL());
        this.t.add(l);
        this.t.setBackground(Color.BLACK);
        this.p.add(this.t);
      } 
      if (this.c.size() > 0) {
        this.x = new int[this.c.size()];
      } else {
        this.x = new int[1];
      } 
      this.p.a(this);
      this.p.a(new az(this));
      cl cl = new cl(this.b.get(0));
      this.p.a((dj)cl);
      this.p.h(Math.max(((aM)this.b.get(0)).s(), parambm.c()));
      this.p.i(((aM)this.b.get(0)).r());
      this.C = new aS(this);
      if (parambm.N() != null)
        i.a(paramR.c(), parambm.N(), this.C); 
      this.p.b(g.b(parambm.M()));
      this.B = new aR(this);
      byte b2;
      for (b2 = 0; b2 < parambm.k(); b2++)
        i.a(paramR.c(), parambm.e(b2), this.B); 
      for (b2 = 0; b2 < parambm.m(); b2++)
        i.a(paramR.c(), parambm.f(b2), this); 
      for (b2 = 0; b2 < parambm.g(); b2++)
        i.a(paramR.c(), parambm.c(b2), this); 
      t();
      b2 = 0;
      for (byte b3 = 0; b3 < this.b.size(); b3++) {
        aR aR1 = aR.a();
        try {
          aR1.a(paramR.c(), ((aM)this.b.get(b3)).aL(), this);
          if (this.c != null && this.c.size() > b2)
            aR1.a(paramR.c(), ((aM)this.c.get(b2)).aL(), this); 
        } catch (a a1) {
          a1.printStackTrace();
          D.a("Error subscribing to ParameterValue Changes.", (Exception)a1, this);
        } 
        if (this.c.size() > b2 + 1)
          b2++; 
      } 
      try {
        v();
      } catch (g g) {
        D.a("Error accessing curve parameters", (Exception)g, this);
      } 
      try {
        if (parambm.l() != null)
          cu.a().a(paramR.c(), parambm.l(), this); 
      } catch (a a1) {
        D.a("Unable to subscribe x or y axis for hightlights.", (Exception)a1, this);
      } 
      this.p.addFocusListener(new aA(this));
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new BorderLayout());
      jPanel.setBackground(Color.BLACK);
      if (parambm.r() != null) {
        String[] arrayOfString = parambm.r();
        JPanel jPanel1 = new JPanel();
        jPanel1.setLayout(new GridLayout(0, 1));
        for (byte b = 0; b < arrayOfString.length; b++) {
          if (arrayOfString[b] != null && !arrayOfString[b].equals("")) {
            bI bI = new bI();
            bI.setBackground(Color.BLACK);
            bI.b(arrayOfString[b]);
            jPanel1.add(bI);
          } 
        } 
        jPanel.add("North", jPanel1);
      } 
      this.r = new aI(this);
      this.r.setLayout(new FlowLayout(1));
      if (!this.F) {
        bv bv = new bv();
        bv.i(0);
        b2 = 0;
        for (byte b = 0; b < this.b.size(); b++) {
          db db;
          if (this.c != null && this.c.size() > b2 && !((aM)this.c.get(b2)).H() && !this.p.l()) {
            bj bj1 = new bj();
            bj1.s(this.p.b(b));
            bj1.b(((aM)this.c.get(b2)).aL());
            bj1.a(new aN(this, b2));
            bj1.a(this.E);
            if (this.b.size() > 1)
              bj1.a(new k(this.p.a(b).getRGB())); 
            bv.a((bv)bj1);
          } 
          bj bj = new bj();
          c c = new c((this.p.c(b) != null) ? this.p.c(b) : ((aM)this.b.get(b)).aL());
          if (parambm.k() > b)
            db = parambm.e(b); 
          bj.d(db);
          bj.b(((aM)this.b.get(b)).aL());
          bj.a(this.E);
          bj.a(new aN(this, b2));
          if (this.b.size() > 1) {
            bj.a(new k(this.p.a(b).getRGB()));
          } else {
            Color color = UIManager.getColor("TextField.background");
            bj.a(new k(color.getRGB()));
          } 
          if (this.c == null && this.c.isEmpty() && this.p.l() && parambm.s() != null) {
            double[] arrayOfDouble = parambm.s();
            String[] arrayOfString = new String[arrayOfDouble.length];
            for (byte b4 = 0; b4 < arrayOfDouble.length; b4++)
              arrayOfString[b4] = X.a(arrayOfDouble[b4]); 
            bj.a(arrayOfString);
          } 
          bv.a((bv)bj);
          b2++;
        } 
        bh bh = new bh(paramR, bv);
        this.r.add(bh);
      } 
      JButton jButton1 = new JButton("#");
      jButton1.setPreferredSize(eJ.a(15, 15));
      jButton1.setToolTipText("Click or Press A to show or hide text based arrays");
      jButton1.addActionListener(new aB(this));
      jButton1.setFocusable(false);
      this.p.add(jButton1);
      JButton jButton2 = new JButton("#");
      jButton2.setPreferredSize(eJ.a(15, 15));
      jButton2.setToolTipText(g.b("Click For Options Menu"));
      jButton2.addActionListener(new aC(this));
      jButton2.setFocusable(false);
      this.p.add(jButton2);
      if (parambm.r() != null || parambm.w()) {
        try {
          if (this.F) {
            this.v = new T(paramR, parambm, true, paramBoolean);
            this.v.a(this.G);
            if (parambm.d() > 1)
              try {
                for (byte b = 0; b < parambm.d(); b++)
                  this.w.a(this.p.a(b)); 
                this.w.a(Color.LIGHT_GRAY);
              } catch (Exception exception) {} 
            this.v.a(paramet);
            this.u = new aL(this, this.v);
            this.u.getVerticalScrollBar().addAdjustmentListener(new aD(this));
            jPanel.add("Center", this.u);
          } else {
            this.u = new aL(this, this.r);
            jPanel.add("South", this.u);
          } 
        } catch (g g) {
          Logger.getLogger(an.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        } 
        this.p.setLayout(this.s = new aH(this, null, jButton1, jButton2));
      } else if (this.F && this.E) {
        try {
          this.w = new T(paramR, parambm, false, paramBoolean);
          this.w.a(this.G);
          this.w.setBorder(BorderFactory.createEmptyBorder(5, 8, 5, 8));
          if (parambm.d() > 1) {
            for (byte b = 0; b < parambm.d(); b++)
              this.w.a(this.p.a(b)); 
            this.w.a(Color.LIGHT_GRAY);
          } 
          this.r.setLayout(new GridLayout(1, 1));
          this.r.add(this.w);
          add("South", this.r);
          this.p.setLayout(this.s = new aH(this, null, jButton1, jButton2));
          this.r.setVisible((parambm.d() <= 1));
          this.w.a(paramet);
          boolean bool = Boolean.parseBoolean(paramet.b("showText", parambm.u() + ""));
          this.r.setVisible(bool);
        } catch (g g) {}
      } else if (this.F) {
        try {
          this.v = new T(paramR, parambm, !this.E, paramBoolean);
          this.v.a(this.G);
          this.u = new aL(this, this.v);
          if (parambm.d() > 1) {
            for (byte b = 0; b < parambm.d(); b++)
              this.v.a(this.p.a(b)); 
            this.w.a(Color.LIGHT_GRAY);
          } 
          this.p.add(this.u);
          if (!parambm.u()) {
            this.u.setVisible(false);
            this.r.setVisible(false);
          } else {
            this.u.setVisible(true);
            this.r.setVisible(true);
          } 
          this.p.setLayout(this.s = new aH(this, this.u, jButton1, jButton2));
        } catch (g g) {
          D.a("Configuration File Error.", (Exception)g, this);
        } 
      } else {
        this.u = new aL(this, this.r);
        this.p.add(this.u);
        if (!parambm.u()) {
          this.u.setVisible(false);
          this.r.setVisible(false);
        } else {
          this.u.setVisible(true);
          this.r.setVisible(true);
        } 
        this.p.setLayout(this.s = new aH(this, this.u, jButton1, jButton2));
      } 
      this.p.u();
      if (i.a().a(";lkdsaop9ewqewqgd")) {
        boolean bool = Boolean.parseBoolean(paramet.b(l, "" + parambm.x()));
        this.p.f(bool);
      } 
      if (i.a().a("67hgyusg432gvrewhgfds")) {
        s();
        c.a().a(this.K);
      } 
      add("East", jPanel);
      this.p.setFocusable(true);
      this.I = new aO(this);
      this.p.addKeyListener(this.I);
    } 
    c();
  }
  
  private void b(boolean paramBoolean) {
    this.r = new aI(this);
    byte b;
    for (b = 0; b < this.q.j(); b++) {
      aM aM = this.a.c(this.q.d(b));
      if (aM == null)
        throw new a("CurveGraph X Parameter " + this.q.d(b) + " not found in the current configuration."); 
      this.c.add(aM);
    } 
    for (b = 0; b < this.q.d(); b++) {
      aM aM = this.a.c(this.q.b(b));
      this.b.add(aM);
    } 
    if (this.b.size() == 0)
      bV.d("No Y Axis Bins for 1D Arrays " + this.q.aL() + "\nthe Y Axis must have at least 1 Y Axis Bin assigned.", this); 
    if (this.F && this.E) {
      try {
        this.w = new T(this.a, this.q, false, paramBoolean);
        this.w.a(this.G);
        this.w.setBorder(BorderFactory.createEmptyBorder(5, 8, 5, 8));
        ArrayList<Color> arrayList = new ArrayList();
        arrayList.add(Color.GREEN);
        arrayList.add(Color.RED);
        arrayList.add(Color.CYAN);
        arrayList.add(Color.YELLOW);
        arrayList.add(Color.MAGENTA);
        arrayList.add(Color.WHITE);
        arrayList.add(Color.GRAY);
        arrayList.add(Color.ORANGE);
        arrayList.add(Color.PINK);
        arrayList.add(Color.BLUE);
        if (this.q.d() > 1)
          for (byte b1 = 0; b1 < this.q.d(); b1++)
            this.w.a(arrayList.get(b1 % arrayList.size()));  
        this.w.a(Color.LIGHT_GRAY);
        this.r.setLayout(new GridLayout(1, 1));
        this.r.add(this.w);
        add("Center", this.r);
        this.r.setVisible((this.q.d() <= 1));
        this.r.setVisible(true);
      } catch (g g) {}
    } else if (this.F) {
      try {
        this.v = new T(this.a, this.q, !this.E, paramBoolean);
        this.v.a(this.G);
        this.u = new aL(this, this.v);
        if (this.q.d() > 1) {
          for (b = 0; b < this.q.d(); b++)
            this.v.a(this.p.a(b)); 
          this.w.a(Color.LIGHT_GRAY);
        } 
        add("Center", this.u);
        if (!this.q.u()) {
          this.u.setVisible(false);
          this.r.setVisible(false);
        } else {
          this.u.setVisible(true);
          this.r.setVisible(true);
        } 
      } catch (g g) {
        D.a("Configuration File Error.", (Exception)g, this);
      } 
    } else {
      this.u = new aL(this, this.r);
      this.p.add(this.u);
      if (!this.q.u()) {
        this.u.setVisible(false);
        this.r.setVisible(false);
      } else {
        this.u.setVisible(true);
        this.r.setVisible(true);
      } 
      add("Center", this.u);
    } 
  }
  
  private void p() {
    boolean bool = Boolean.parseBoolean(this.z.b(n, "" + this.q.A()));
    if (bool) {
      if (!q().isShowing()) {
        add("North", (Component)q());
        validate();
        doLayout();
      } 
    } else if (this.L != null && this.L.isShowing()) {
      remove((Component)this.L);
      doLayout();
    } 
  }
  
  private a q() {
    if (this.L == null) {
      this.L = new a();
      this.L.a(new aE(this));
    } 
    return this.L;
  }
  
  private boolean c(String paramString) {
    if (paramString == null || paramString.trim().isEmpty())
      return true; 
    try {
      a a1 = d.a().a(paramString);
      double d1 = a1.a(c.a().e(), 0);
      return true;
    } catch (Exception exception) {
      String str = g.b("Invalid Expression! Expression should reference fields within the data log.") + "\n" + g.b("Example Expression") + ":\n[MAP] > 90";
      bV.d(str, this);
      return false;
    } 
  }
  
  public void b(String paramString) {
    this.M.a(paramString);
    q().c(paramString);
    this.p.o();
    this.p.repaint();
  }
  
  private void r() {
    if (this.p.A() != null && !this.p.A().x() && this.p.B() != null) {
      double[] arrayOfDouble;
      int[] arrayOfInt;
      u u = new u();
      if (this.p.z() == 0) {
        arrayOfDouble = new double[this.p.d(0)];
        arrayOfInt = new int[this.p.d(0)];
        for (byte b = 0; b < arrayOfInt.length; b++)
          arrayOfInt[b] = b; 
      } else {
        arrayOfInt = this.p.j(0);
        arrayOfDouble = new double[arrayOfInt.length];
      } 
      for (byte b1 = 0; b1 < arrayOfDouble.length; b1++)
        arrayOfDouble[b1] = this.p.a(0, arrayOfInt[b1]); 
      aF aF = new aF(this, arrayOfDouble);
      List<w> list = u.a(this.p.A(), this.p.B(), aF, arrayOfDouble);
      int j = this.p.C();
      int k = this.p.D();
      for (byte b2 = 0; b2 < list.size(); b2++) {
        if (arrayOfInt[b2] >= j && arrayOfInt[b2] <= k)
          this.p.b(0, arrayOfInt[b2], ((w)list.get(b2)).a()); 
      } 
    } 
  }
  
  private void s() {
    boolean bool = false;
    if (this.q.l() != null) {
      String str = bM.j(this.a, this.q.l());
      bool = (str != null && !str.isEmpty()) ? true : false;
    } 
    boolean bool1 = Boolean.parseBoolean(this.z.b(n, "" + ((this.q.A() || bool) ? 1 : 0)));
    this.p.i(bool1);
    this.p.a(null);
    this.p.b(null);
    if (bool1) {
      n n = c.a().e();
      if (n != null) {
        p();
        String str1 = this.z.b("xPlotColumnName", this.q.B());
        String str2 = this.z.b("yPlotColumnName", this.q.C());
        if (str1 != null && n.a(str1) != null) {
          if (this.p.A() != null)
            this.p.A().b(this.N); 
          j j = n.a(str1);
          j.a(this.N);
          this.p.a(j);
          q().a(str1);
        } 
        if (str2 != null && n.a(str2) != null) {
          if (this.p.B() != null)
            this.p.B().b(this.N); 
          j j = n.a(str2);
          j.a(this.N);
          this.p.b(j);
          q().b(str2);
        } 
        this.M = new aJ(this, n, this.q.D());
        String str3 = this.z.b("xyPlotFilterExp", "");
        b(str3);
        this.p.a(this.M);
        this.p.o();
        this.p.repaint();
      } 
    } else {
      p();
    } 
  }
  
  private void t() {
    this.p.a();
    for (byte b = 0; b < this.q.k(); b++) {
      String str = this.q.a(b);
      boolean bool = true;
      try {
        bool = (str != null && i.a(str, (aI)this.a) != 0.0D) ? true : false;
      } catch (U u) {}
      if (bool)
        try {
          this.p.a(g.b(this.q.e(b).a()));
        } catch (g g) {
          Logger.getLogger(an.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        }  
    } 
    this.p.o();
    this.p.repaint();
  }
  
  private double a(ArrayList paramArrayList) {
    double d1 = Double.MAX_VALUE;
    Iterator<aM> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      double d2 = ((aM)iterator.next()).r();
      if (d2 < d1)
        d1 = d2; 
    } 
    return d1;
  }
  
  private double b(ArrayList paramArrayList) {
    double d1 = Double.MIN_VALUE;
    Iterator<aM> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      double d2 = ((aM)iterator.next()).s();
      if (d2 > d1)
        d1 = d2; 
    } 
    return d1;
  }
  
  private double c(ArrayList paramArrayList) {
    double d1 = Double.MIN_VALUE;
    Iterator<aM> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      double d2 = ((aM)iterator.next()).s();
      if (d2 > d1)
        d1 = d2; 
    } 
    return d1;
  }
  
  private void u() {
    if (this.p.z() > 0) {
      String str = bV.a("{" + g.b("Set Selected Cells to") + ":}", true, g.b("Set Cell Values"), true, this);
      requestFocus();
      if (str != null && !str.equals("")) {
        double d1 = Double.parseDouble(str);
        this.p.j(d1);
      } 
    } 
  }
  
  public Dimension getPreferredSize() {
    Dimension dimension = super.getPreferredSize();
    if (this.L != null && (this.L.getPreferredSize()).width > 100) {
      Dimension dimension1 = this.L.getPreferredSize();
      dimension1.width = 20;
      this.L.setPreferredSize(dimension1);
      dimension = super.getPreferredSize();
    } 
    return dimension;
  }
  
  public Dimension getMinimumSize() {
    Dimension dimension = super.getMinimumSize();
    if (this.L != null && (this.L.getMinimumSize()).width > 100) {
      Dimension dimension1 = this.L.getMinimumSize();
      dimension1.width = 20;
      this.L.setMinimumSize(dimension1);
      dimension = super.getMinimumSize();
    } 
    return dimension;
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (this.w != null && this.w.isVisible()) {
      Dimension dimension1 = (this.p != null) ? this.p.getPreferredSize() : new Dimension(0, 0);
      int j = eJ.a() + 2;
      Dimension dimension2 = this.w.b(j);
      int k = dimension1.height + dimension2.height;
      int m = paramInt4 - k;
      m = m * 17 / 100;
      int n = j + m / (this.b.size() + 1);
      int i1 = Math.round(j * paramInt3 / dimension2.width);
      int i2 = (i1 > n) ? n : i1;
      i2 = (i2 > 3 * j) ? (3 * j) : i2;
      i2 = (i2 < j * 4 / 5) ? (j * 4 / 5) : i2;
      int i3 = i2;
      aG aG = new aG(this, i3);
      this.w.a(i3);
    } 
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void c() {
    if (this.p != null) {
      if (this.J == null) {
        this.J = new G(this.a, this.q, this);
      } else {
        this.J.b();
      } 
      this.J.a();
    } 
    if (this.v != null)
      this.v.a(); 
    if (this.w != null)
      this.w.a(); 
  }
  
  public void e() {
    if (this.J != null)
      this.J.b(); 
    if (this.v != null)
      this.v.b(); 
    if (this.w != null)
      this.w.b(); 
  }
  
  public void a(bP parambP) {
    e();
    this.J = parambP;
    if (parambP != null)
      parambP.a(); 
  }
  
  public void b(bP parambP) {
    if (this.v != null)
      this.v.a(parambP); 
    if (this.w != null)
      this.w.a(parambP); 
  }
  
  public boolean f() {
    if (!this.r.isVisible() && this.p.w() < 0)
      this.p.b(this.I.a); 
    this.r.setVisible(!this.r.isVisible());
    this.z.a("showText", this.r.isVisible() + "");
    if (this.u != null)
      this.u.setVisible(this.r.isVisible()); 
    return this.r.isVisible();
  }
  
  protected void g() {
    try {
      for (byte b = 0; b < this.b.size(); b++) {
        double[][] arrayOfDouble = ((aM)this.b.get(b)).i(this.a.p());
        for (byte b1 = 0; b1 < arrayOfDouble.length; b1++) {
          this.p.b(b, b1, arrayOfDouble[b1][0]);
          if (arrayOfDouble[b1][0] > this.p.j())
            this.p.d(arrayOfDouble[b1][0]); 
          if (arrayOfDouble[b1][0] < this.p.k())
            this.p.e(arrayOfDouble[b1][0]); 
        } 
      } 
    } catch (g g) {
      D.a("Error pulling curve y parameter values for CurveGraph: " + this.p, (Exception)g, this);
    } 
    this.p.repaint();
  }
  
  protected void h() {
    try {
      double[][] arrayOfDouble = null;
      if (this.c != null && this.c.size() > 0) {
        for (byte b = 0; b < this.c.size(); b++) {
          arrayOfDouble = ((aM)this.c.get(b)).i(this.a.p());
          for (byte b1 = 0; b1 < arrayOfDouble.length; b1++) {
            if (b == this.c.size() - 1 && this.b.size() > this.c.size()) {
              for (byte b2 = b; b2 < this.b.size(); b2++)
                this.p.a(b2, b1, arrayOfDouble[b1][0]); 
            } else {
              this.p.a(b, b1, arrayOfDouble[b1][0]);
            } 
            if (arrayOfDouble[b1][0] > this.p.h())
              this.p.b(arrayOfDouble[b1][0]); 
            if (arrayOfDouble[b1][0] < this.p.i())
              this.p.c(arrayOfDouble[b1][0]); 
          } 
        } 
      } else {
        arrayOfDouble = new double[((aM)this.b.get(0)).b()][1];
        for (byte b = 0; b < arrayOfDouble.length; b++)
          arrayOfDouble[b][0] = (this.p.h() - this.p.i()) * b / arrayOfDouble.length; 
      } 
    } catch (g g) {
      D.a("Error pulling x curve parameters", (Exception)g, this);
    } 
    this.p.repaint();
  }
  
  private void a(ef[] paramArrayOfef) {
    if (this.r != null)
      if (paramArrayOfef != null && paramArrayOfef.length > 0) {
        a(this.r, paramArrayOfef[paramArrayOfef.length - 1].b());
      } else {
        a(this.r, -1);
      }  
    if (this.v != null)
      this.v.a(paramArrayOfef); 
    if (this.w != null)
      this.w.a(paramArrayOfef); 
  }
  
  private void a(JPanel paramJPanel, int paramInt) {
    if (!this.F)
      for (byte b = 0; b < paramJPanel.getComponentCount(); b++) {
        Component component = paramJPanel.getComponent(b);
        if (component instanceof R) {
          R r = (R)component;
          r.b(paramInt);
          JComponent jComponent = r.b();
          if (jComponent != null) {
            Rectangle rectangle = jComponent.getBounds();
            rectangle.y -= 15;
            rectangle.height += 25;
            this.r.scrollRectToVisible(rectangle);
          } 
        } else if (component instanceof JPanel) {
          a((JPanel)component, paramInt);
        } 
      }  
  }
  
  private void a(int paramInt) {
    if (this.r != null)
      b(this.r, paramInt); 
  }
  
  private void b(JPanel paramJPanel, int paramInt) {
    if (!this.F)
      for (byte b = 0; b < paramJPanel.getComponentCount(); b++) {
        Component component = paramJPanel.getComponent(b);
        if (component instanceof R) {
          R r = (R)component;
          r.a(paramInt);
        } else if (component instanceof JPanel) {
          b((JPanel)component, paramInt);
        } 
      }  
  }
  
  private int a(double paramDouble) {
    double d1 = this.p.a(0, 0);
    for (byte b = 0; b < this.p.d(0); b++) {
      double d2 = this.p.a(0, b);
      if (d2 > paramDouble)
        return (b == 0 || Math.abs(d2 - paramDouble) < Math.abs(paramDouble - d1)) ? b : (b - 1); 
      d1 = d2;
    } 
    return this.p.d(0) - 1;
  }
  
  public void close() {
    cu.a().a(this);
    aR.a().a(this);
    if (this.B != null)
      aR.a().a(this.B); 
    if (this.C != null)
      aR.a().a(this.C); 
    if (this.r != null)
      this.r.a(); 
    if (this.v != null)
      this.v.close(); 
    if (this.w != null)
      this.w.close(); 
    e();
    this.H = true;
    if (this.K != null)
      c.a().b(this.K); 
    if (this.p != null && this.p.A() != null)
      this.p.A().b(this.N); 
    if (this.p != null && this.p.B() != null)
      this.p.B().b(this.N); 
  }
  
  public void setCurrentOutputChannelValue(String paramString, double paramDouble) {
    if (!isEnabled())
      return; 
    int j = a(paramDouble);
    if (this.x[0] != j) {
      this.x[0] = j;
      a(j);
    } 
    if (this.y && j != this.p.w()) {
      boolean bool = (this.p.x() >= 0) ? this.p.x() : false;
      a(bool, j);
      r[] arrayOfR = new r[1];
      arrayOfR[0] = new r(bool, j);
      a((ef[])arrayOfR);
      this.p.repaint();
    } 
  }
  
  private void c(boolean paramBoolean) {
    this.y = paramBoolean;
  }
  
  private boolean a(ArrayList paramArrayList, String paramString) {
    Iterator<aM> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      if (((aM)iterator.next()).aL().equals(paramString))
        return true; 
    } 
    return false;
  }
  
  public void a(String paramString1, String paramString2) {
    if (a(this.b, paramString2)) {
      g();
    } else if (a(this.c, paramString2)) {
      h();
    } else {
      this.p.h(((aM)this.b.get(0)).s());
      this.p.i(((aM)this.b.get(0)).r());
      g();
      h();
      try {
        v();
      } catch (g g) {
        Logger.getLogger(an.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      } 
    } 
  }
  
  public void a(int paramInt1, int paramInt2, double paramDouble) {
    if (this.c.isEmpty())
      return; 
    paramInt1 = (paramInt1 < this.c.size()) ? paramInt1 : (this.c.size() - 1);
    try {
      if (!this.a.p().j() && p.a(this.P, this.a))
        try {
          ((aM)this.c.get(paramInt1)).a(this.a.p(), paramDouble, paramInt2, 0);
        } catch (j j) {
          this.p.a(paramInt1, paramInt2, j.c());
        } catch (g g) {
          D.a("Unable to set Curve X value of " + paramDouble, (Exception)g, this);
        }  
    } catch (g g) {
      D.b("Failed to update Curve Array Constant");
    } 
  }
  
  public void b(int paramInt1, int paramInt2, double paramDouble) {
    if (!this.a.p().j())
      try {
        ((aM)this.b.get(paramInt1)).a(this.a.p(), paramDouble, paramInt2, 0);
      } catch (j j) {
        if (w())
          this.p.b(paramInt1, paramInt2, j.c()); 
      } catch (g g) {
        D.a("Unable to set Curve Y value of " + paramDouble, (Exception)g, this);
      }  
  }
  
  private void v() {
    boolean bool1 = Boolean.parseBoolean(this.z.b(i, "" + this.q.v()));
    boolean bool2 = Boolean.parseBoolean(this.z.b(f, "" + this.q.v()));
    this.p.d(bool2);
    this.p.e(bool1);
    this.p.f();
    String str1 = null;
    byte b1;
    for (b1 = 0; b1 < this.b.size(); b1++) {
      String str = (this.q.f(b1) != null) ? g.b(this.q.f(b1).a()) : null;
      if (str == null || str.length() == 0)
        if (this.q.m() > 0) {
          str = this.q.f(this.q.m() - 1).a();
        } else if (this.c.size() > b1) {
          str = ((aM)this.c.get(b1)).aL();
        } else if (!this.c.isEmpty()) {
          str = ((aM)this.c.get(this.c.size() - 1)).aL();
        } else {
          str = "";
        }  
      if (this.c.size() > 0) {
        boolean bool = (b1 < this.c.size()) ? b1 : (this.c.size() - 1);
        if (!((aM)this.c.get(bool)).p().equals(""))
          str = str + " (" + g.b(((aM)this.c.get(bool)).p()) + ")"; 
        if (str1 == null || !str1.equals(str)) {
          this.p.a(str, b1);
          str1 = str;
        } 
        if (b1 == 0)
          this.p.g(Math.max(c(this.c), this.p.q())); 
      } else {
        this.p.a(str, b1);
      } 
    } 
    b1 = 0;
    String str2 = null;
    for (byte b2 = 0; b2 < this.b.size(); b2++) {
      String str;
      if (this.q.c(b2) != null) {
        str = g.b(this.q.c(b2).a()) + " " + g.b(((aM)this.b.get(b2)).p());
      } else {
        str = g.b(((aM)this.b.get(b2)).p());
      } 
      this.p.b(str, b2);
      str2 = str;
    } 
    double d1 = a(h, this.q.c() / 2.0D);
    double d2 = a(g, this.q.b());
    if (d2 < this.q.b() || d2 > this.q.c())
      d2 = this.q.b(); 
    if (d1 == d2) {
      d1 = this.q.c();
      d2 = this.q.b();
      this.z.a(g, "");
      this.z.a(h, "");
    } 
    if (bool1) {
      d1 = Double.NEGATIVE_INFINITY;
      d2 = Double.MAX_VALUE;
    } 
    double d3 = a(o, this.q.a());
    for (byte b3 = 0; b3 < this.b.size(); b3++) {
      double[][] arrayOfDouble1 = ((aM)this.b.get(b3)).i(this.a.p());
      double[][] arrayOfDouble2 = null;
      if (this.c != null && this.c.size() > 0) {
        arrayOfDouble2 = ((aM)this.c.get(b1)).i(this.a.p());
        this.p.a(((aM)this.c.get(b1)).B());
        this.p.a(((aM)this.c.get(b1)).H());
      } else {
        if (this.q.s() == null) {
          arrayOfDouble2 = new double[((aM)this.b.get(b3)).b()][1];
          for (byte b = 0; b < arrayOfDouble2.length; b++)
            arrayOfDouble2[b][0] = (this.q.i() - this.q.h()) * b / arrayOfDouble2.length; 
        } else {
          double[] arrayOfDouble = this.q.s();
          arrayOfDouble2 = new double[arrayOfDouble.length][1];
          for (byte b = 0; b < arrayOfDouble2.length; b++)
            arrayOfDouble2[b][0] = arrayOfDouble[b]; 
        } 
        this.p.a(true);
      } 
      if (arrayOfDouble1.length != arrayOfDouble2.length)
        D.a("SettingsCurve:" + this.q.aL() + " x/y size mismatch."); 
      double d4 = a(e, this.q.i());
      double d5 = a(d, this.q.h());
      if (d4 == d5) {
        d4 = this.q.i();
        d5 = this.q.h();
        this.z.a(d, "");
        this.z.a(e, "");
      } 
      if (this.c.size() > 0 && (d5 < a(this.c) || d5 > b(this.c))) {
        d5 = this.q.h();
        this.z.a(d, "" + this.q.h());
      } 
      if (bool2 && this.c != null) {
        d4 = Double.NEGATIVE_INFINITY;
        if (d4 > this.p.q()) {
          d4 = this.p.q();
        } else if (d4 < this.q.h()) {
          d4 = this.q.h();
        } 
        for (byte b = 0; b < arrayOfDouble2.length; b++) {
          this.p.a(b3, arrayOfDouble2[b][0], arrayOfDouble1[b][0]);
          if (arrayOfDouble2[b][0] > d4 + ((aM)this.c.get(0)).B() * 2.0D) {
            double d6 = (arrayOfDouble2[b][0] + ((aM)this.c.get(0)).B() * 2.0D > this.p.q()) ? arrayOfDouble2[b][0] : (arrayOfDouble2[b][0] + ((aM)this.c.get(0)).B() * 2.0D);
            d4 = d6;
          } 
          this.p.c(b3, b, ((aM)this.b.get(b3)).b(b));
        } 
      } else {
        for (byte b = 0; b < arrayOfDouble2.length; b++) {
          try {
            this.p.a(b3, arrayOfDouble2[b][0], arrayOfDouble1[b][0]);
          } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            bV.d("Invalid number of values for curve. All X and Y arrats must be of the same size.", this);
          } 
        } 
      } 
      if (bool1) {
        if (d1 > this.p.r()) {
          d1 = this.p.r();
        } else if (d1 < this.q.b()) {
          d1 = this.q.b();
        } 
        for (byte b = 0; b < arrayOfDouble1.length; b++) {
          if (arrayOfDouble1[b][0] > d1 + ((aM)this.b.get(b3)).B() * 2.0D) {
            double d6 = (arrayOfDouble1[b][0] + ((aM)this.b.get(b3)).B() * 2.0D > this.p.r()) ? arrayOfDouble1[b][0] : (arrayOfDouble1[b][0] + ((aM)this.b.get(b3)).B() * 2.0D);
            d1 = d6;
          } 
          if (arrayOfDouble1[b][0] < d2 - ((aM)this.b.get(b3)).B() * 2.0D) {
            double d6 = arrayOfDouble1[b][0];
            d2 = d6 - ((aM)this.b.get(b3)).B() * 2.0D;
          } 
        } 
      } else {
        d1 = a(h, this.q.c());
      } 
      this.p.e(d2);
      this.p.d(d1);
      this.p.c(d5);
      this.p.b(d4);
      this.p.l((int)d3);
      if (this.c.size() > b1 + 1)
        b1++; 
    } 
    if (this.q.z())
      this.p.a(true); 
  }
  
  public boolean hasFocus() {
    return a(this);
  }
  
  private boolean a(Component paramComponent) {
    if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      for (Component component : container.getComponents()) {
        if (a(component))
          return true; 
      } 
    } 
    return paramComponent.equals(this) ? false : paramComponent.hasFocus();
  }
  
  public R b_() {
    return this.a;
  }
  
  public bN i() {
    return this.p;
  }
  
  public T j() {
    return (this.v != null) ? this.v : ((this.w != null) ? this.w : null);
  }
  
  public boolean k() {
    return (this.q.u() || (this.q.q() != null && !this.q.q().isEmpty()));
  }
  
  public bm l() {
    return this.q;
  }
  
  public String a_() {
    return this.P;
  }
  
  public void c_(String paramString) {
    this.P = paramString;
  }
  
  public void m() {
    if (a_() != null) {
      boolean bool = true;
      try {
        bool = p.a(a_(), this.a);
        setEnabled(bool);
      } catch (Exception exception) {
        D.a(exception.getMessage());
        exception.printStackTrace();
      } 
    } 
  }
  
  private boolean w() {
    boolean bool = true;
    if (a_() != null)
      try {
        bool = p.a(a_(), this.a);
      } catch (Exception exception) {
        D.a(exception.getMessage());
        exception.printStackTrace();
      }  
    return bool;
  }
  
  public void a(K paramK) {
    this.O.add(paramK);
  }
  
  public void b(K paramK) {
    this.O.remove(paramK);
  }
  
  private void d(String paramString) {
    for (K k : this.O)
      k.b(paramString); 
  }
  
  private void e(String paramString) {
    for (K k : this.O)
      k.a(paramString); 
  }
  
  public String d() {
    return ((aM)this.b.get(0)).aL();
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    this.p.setEnabled(paramBoolean);
    fp.a((Component)this.p, paramBoolean);
    if (this.u != null)
      this.u.setEnabled(paramBoolean); 
    if (this.r != null)
      this.r.setEnabled(paramBoolean); 
    if (this.v != null)
      this.v.setEnabled(paramBoolean); 
    if (this.w != null)
      this.w.setEnabled(paramBoolean); 
  }
  
  public void n() {
    if (this.A == null || !this.A.isAlive())
      this.A = new aP(this); 
    this.A.a();
  }
  
  private void f(String paramString) {
    if (paramString.startsWith(d)) {
      String str = bV.a(this, true, d, X.a(this.p.i()));
      if (str != null && !str.equals("")) {
        double d1 = Double.parseDouble(str);
        if (d1 < a(this.c) || d1 > b(this.c)) {
          bV.d(str + " is out of range, value must be between " + a(this.c) + " and " + b(this.c), this);
          return;
        } 
        this.p.c(d1);
        this.z.a(d, d1 + "");
      } 
    } else if (paramString.startsWith(e)) {
      String str = bV.a(this, true, e, X.a(this.p.h()));
      if (str != null && !str.equals("")) {
        double d1 = Double.parseDouble(str);
        if (d1 < a(this.c) || d1 > b(this.c)) {
          bV.d(str + " is out of range, value must be between " + a(this.c) + " and " + b(this.c), this);
          return;
        } 
        this.z.a(f, "false");
        this.p.b(d1);
        this.z.a(e, d1 + "");
      } 
    } else if (paramString.startsWith(g)) {
      String str = bV.a(this, true, g, X.a(this.p.k()));
      if (str != null && !str.equals("")) {
        double d1 = Double.parseDouble(str);
        if (d1 < a(this.b) || d1 > b(this.b)) {
          bV.d(str + " is out of range, value must be between " + a(this.b) + " and " + b(this.b), this);
          return;
        } 
        this.p.e(d1);
        this.z.a(g, d1 + "");
      } 
    } else if (paramString.startsWith(o)) {
      String str = bV.a(this, true, o, X.a(this.p.K()));
      if (str != null && !str.equals("")) {
        double d1 = Double.parseDouble(str);
        if (d1 < 1.0D) {
          bV.d(str + " is out of range, value must be greater than 1", this);
          return;
        } 
        this.p.l((int)d1);
        this.z.a(o, d1 + "");
      } 
    } else if (paramString.startsWith(h)) {
      String str = bV.a(this, true, h, X.a(this.p.j()));
      if (str != null && !str.equals("")) {
        double d1 = Double.parseDouble(str);
        if (d1 < a(this.b) || d1 > b(this.b)) {
          bV.d(str + " is out of range, value must be between " + a(this.b) + " and " + b(this.b), this);
          return;
        } 
        this.z.a(i, "false");
        this.p.d(d1);
        this.z.a(h, d1 + "");
      } 
    } else if (paramString.equals(k)) {
      String str = bV.a(this, true, k + " (s)", X.a((this.p.G() / 1000)));
      if (str != null && !str.equals("")) {
        int j = (int)(Double.parseDouble(str) * 1000.0D);
        this.p.k(j);
        this.z.a(k, j + "");
      } 
    } else if (paramString.equals(m)) {
      this.p.v();
      this.p.o();
      this.p.repaint();
    } else if (paramString.equals(j)) {
      c(!this.y);
      this.p.repaint();
    } 
    this.p.repaint();
  }
  
  private void b(int paramInt1, int paramInt2) {
    JPopupMenu jPopupMenu = new JPopupMenu();
    ap ap = new ap(this);
    String str1 = this.z.b(g, "");
    String str2 = (str1.length() == 0) ? g : (g + " (" + str1 + ")");
    JMenuItem jMenuItem = jPopupMenu.add(str2);
    jMenuItem.setActionCommand(g);
    jMenuItem.addActionListener(ap);
    if (str1.length() > 0) {
      jMenuItem = jPopupMenu.add("Reset Y Axis Minimum to Default (" + this.q.b() + ")");
      jMenuItem.addActionListener(new aq(this));
    } 
    str1 = this.z.b(h, "");
    str2 = (str1.length() == 0) ? h : (h + " (" + str1 + ")");
    jMenuItem = jPopupMenu.add(str2);
    jMenuItem.setActionCommand(h);
    jMenuItem.addActionListener(ap);
    if (str1.length() > 0) {
      jMenuItem = jPopupMenu.add("Reset Y Axis Maximum to Default (" + this.q.c() + ")");
      jMenuItem.addActionListener(new ar(this));
    } 
    boolean bool = Boolean.parseBoolean(this.z.b(i, "" + this.Q));
    JCheckBoxMenuItem jCheckBoxMenuItem = new JCheckBoxMenuItem(i, bool);
    jCheckBoxMenuItem.addActionListener(new as(this));
    jPopupMenu.add(jCheckBoxMenuItem);
    str1 = this.z.b(d, "");
    str2 = (str1.length() == 0) ? d : (d + " (" + str1 + ")");
    jMenuItem = jPopupMenu.add(str2);
    jMenuItem.setActionCommand(d);
    jMenuItem.addActionListener(ap);
    if (str1.length() > 0) {
      jMenuItem = jPopupMenu.add("Reset X Axis Minimum to Default (" + this.q.h() + ")");
      jMenuItem.addActionListener(new at(this));
    } 
    str1 = this.z.b(e, "");
    str2 = (str1.length() == 0) ? e : (e + " (" + str1 + ")");
    jMenuItem = jPopupMenu.add(str2);
    jMenuItem.setActionCommand(e);
    jMenuItem.addActionListener(ap);
    if (str1.length() > 0) {
      jMenuItem = jPopupMenu.add("Reset X Axis Maximum to Default (" + this.q.i() + ")");
      jMenuItem.addActionListener(new au(this));
    } 
    bool = Boolean.parseBoolean(this.z.b(f, "" + this.Q));
    jCheckBoxMenuItem = new JCheckBoxMenuItem(f, bool);
    jCheckBoxMenuItem.addActionListener(new av(this));
    jPopupMenu.add(jCheckBoxMenuItem);
    if (i.a().a(";lkdsaop9ewqewqgd")) {
      jPopupMenu.addSeparator();
      jPopupMenu.add(k).addActionListener(ap);
      boolean bool1 = Boolean.parseBoolean(this.z.b(l, "false"));
      jCheckBoxMenuItem = new JCheckBoxMenuItem(l, bool1);
      jCheckBoxMenuItem.addActionListener(new aw(this));
      jPopupMenu.add(jCheckBoxMenuItem);
      jPopupMenu.add(m).addActionListener(ap);
      if (i.a().a("67hgyusg432gvrewhgfds")) {
        boolean bool2 = Boolean.parseBoolean(this.z.b(n, "" + this.q.A()));
        jCheckBoxMenuItem = new JCheckBoxMenuItem(n, bool2);
        jCheckBoxMenuItem.addActionListener(new ax(this));
        jCheckBoxMenuItem.setEnabled((c.a().e() != null));
        jPopupMenu.add(jCheckBoxMenuItem);
      } 
      jCheckBoxMenuItem = new JCheckBoxMenuItem(j, this.y);
      jCheckBoxMenuItem.addActionListener(ap);
      jPopupMenu.add(jCheckBoxMenuItem);
      str1 = this.z.b(o, "");
      str2 = (str1.length() == 0) ? o : (o + " (" + str1 + ")");
      jMenuItem = jPopupMenu.add(str2);
      jMenuItem.setActionCommand(o);
      jMenuItem.addActionListener(ap);
      if (str1.length() > 0) {
        jMenuItem = jPopupMenu.add("Reset Coarse Step Count to Default (" + this.q.a() + ")");
        jMenuItem.addActionListener(new ay(this));
      } 
    } 
    this.p.add(jPopupMenu);
    jPopupMenu.show(this, paramInt1, paramInt2);
  }
  
  private void x() {
    boolean bool = !Boolean.parseBoolean(this.z.b(l, "false")) ? true : false;
    this.z.a(l, bool + "");
    this.p.f(bool);
    this.p.o();
    this.p.repaint();
  }
  
  public double a(String paramString, double paramDouble) {
    String str = this.z.a(paramString);
    if (str == null || str.equals(""))
      return paramDouble; 
    try {
      return Double.parseDouble(str);
    } catch (Exception exception) {
      return paramDouble;
    } 
  }
  
  public Double[][] o() {
    Double[][] arrayOfDouble;
    if (this.F && this.v != null)
      return this.v.e().i(); 
    if (this.F && this.w != null)
      return this.w.e().i(); 
    int j = 0;
    if (this.q.z()) {
      arrayOfDouble = new Double[this.b.size()][((aM)this.b.get(0)).b()];
    } else {
      arrayOfDouble = new Double[this.b.size() + this.c.size()][((aM)this.b.get(0)).b()];
      for (byte b = 0; b < this.c.size(); b++) {
        aM aM = this.c.get(b);
        try {
          double[][] arrayOfDouble1 = aM.i(this.a.h());
          for (byte b1 = 0; b1 < aM.b(); b1++)
            arrayOfDouble[b][b1] = Double.valueOf(arrayOfDouble1[b1][0]); 
        } catch (g g) {
          D.a("Failed to get values for Curve xParam: " + aM.aL());
          Logger.getLogger(an.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
        } 
      } 
      j = this.c.size();
    } 
    for (int k = j; k < this.b.size(); k++) {
      aM aM = this.b.get(k - j);
      try {
        double[][] arrayOfDouble1 = aM.i(this.a.h());
        for (byte b = 0; b < aM.b(); b++)
          arrayOfDouble[k][b] = Double.valueOf(arrayOfDouble1[b][0]); 
      } catch (g g) {
        D.a("Failed to get values for Curve yParam: " + aM.aL());
        Logger.getLogger(an.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      } 
    } 
    return arrayOfDouble;
  }
  
  public void a(Double[][] paramArrayOfDouble) {
    if (this.F && this.v != null) {
      this.v.e().a(paramArrayOfDouble);
    } else if (this.F && this.w != null) {
      this.w.e().a(paramArrayOfDouble);
    } 
  }
  
  public void a(boolean paramBoolean) {
    this.r.setVisible(paramBoolean);
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.p.b(paramInt1, paramInt2);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/bt/an.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */