package ao;

import V.a;
import W.j;
import W.n;
import ar.c;
import ar.f;
import ar.g;
import bH.D;
import bH.X;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import g.b;
import h.a;
import h.b;
import h.g;
import h.i;
import i.b;
import i.c;
import j.a;
import j.b;
import j.c;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Image;
import java.util.HashMap;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.SwingUtilities;

public class aX extends JPanel implements hB, k, l, b {
  private hx n = hx.a();
  
  aw a = new aw(this.n);
  
  protected u b = new u(this.n);
  
  JScrollPane c = null;
  
  bn d = null;
  
  m e = new m(this.n);
  
  private b o = null;
  
  b f = null;
  
  hE g = null;
  
  String h = null;
  
  boolean i = false;
  
  private JSplitPane p = new JSplitPane();
  
  private JSplitPane q = new JSplitPane();
  
  boolean j = true;
  
  g k = new g();
  
  protected boolean l = false;
  
  boolean m = false;
  
  public aX() {
    this.p.setOrientation(1);
    this.q.setOrientation(0);
    this.q.setOneTouchExpandable(true);
    this.p.setOneTouchExpandable(true);
    this.p.setDividerSize(eJ.a(8));
    this.q.setDividerSize(eJ.a(8));
    this.p.setResizeWeight(1.0D);
    this.q.setResizeWeight(1.0D);
    this.p.setFont(getFont());
    bq.a().a(this.e);
    boolean bool1 = i.a("showDashboard", true);
    aY aY = new aY(this);
    this.q.addPropertyChangeListener("dividerLocation", aY);
    ba ba = new ba(this);
    this.p.addPropertyChangeListener("dividerLocation", ba);
    bq.a().a(this.b);
    bq.a().a(this);
    int i = i.b("lineTraceSize", i.ae);
    this.a.c(i);
    boolean bool2 = i.a(i.af, i.ag);
    this.a.b(bool2);
    JPanel jPanel1 = new JPanel();
    jPanel1.setLayout(new BorderLayout(1, 2));
    JPanel jPanel2 = new JPanel();
    jPanel2.setLayout(new BorderLayout(1, 2));
    setLayout(new BorderLayout(1, 2));
    this.p.setTopComponent(jPanel2);
    this.q.setTopComponent(this.p);
    add("Center", this.q);
    this.p.setBottomComponent(new JLabel());
    SwingUtilities.invokeLater(new bb(this));
    if (b.a().a("optionalQuickSelect") && i.a("fieldSelectionStyle", "standardSelection").equals("selectFromDash")) {
      A a = new A();
      this.b.a(a);
      this.d = a;
    } else {
      this.d = new hj(this.n);
      jPanel2.add((hj)this.d, "West", 0);
    } 
    bq.a().a(this.d);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    jPanel3.add(this.e, "South");
    if (b.a().a(";lkewlk nbi3k48tjh265'") && i.a(i.aJ, i.aK)) {
      aj aj = new aj();
      aj.c();
      bq.a().a(aj);
      jPanel3.add("North", aj);
    } 
    add(jPanel3, "North");
    jPanel2.add(this.a, "Center");
    if (b.a().a("tabbedQuickViews")) {
      jPanel2.add("North", (Component)this.k);
      this.k.setVisible(false);
    } 
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    this.c = new JScrollPane(this.b);
    jPanel4.add("Center", this.c);
    this.q.setBottomComponent(jPanel4);
    bm.a().a(this.a);
    if (i.aL != null)
      this.a.a(i.aL); 
    this.e.a(this.a);
    this.e.a(this);
    this.e.a(this.b);
    n().a(this);
    n().a(this.d);
    if (this.d instanceof hj)
      n().a((hj)this.d); 
    n().a(this.a);
    n().a(this.a);
    n().a(aV.a());
    n().a(this.b);
    n().a(this.b);
    n().a(this.b);
    n().a(this.a);
    n().a(this.a);
    n().a(this.a);
    n().c(this.b);
    this.a.a(n());
    bZ bZ = new bZ(n());
    this.a.addMouseListener(bZ);
    this.a.addMouseMotionListener(bZ);
    this.a.addMouseWheelListener(bZ);
    bq.a().a(this.a);
    if (bq.a().f() != null)
      bq.a().f().a(this); 
    d(Boolean.parseBoolean(i.a("showGauges", "true")));
    c(i.a("adjustGaugeBackgroudToVal", false));
    n().b(i.a("zoom", 2.0D), false);
    this.e.c(i.b("compareOffset", 0));
    int j = i.a("numberOfOverlays", i.u) * i.a("numberOfGraphs", i.t);
    byte b1 = 0;
    for (byte b2 = 0; b2 < j; b2++) {
      String str1 = "graphForeColor" + (b2 - b1);
      String str2 = i.c(str1);
      Color color = null;
      try {
        color = new Color(Integer.parseInt(str2));
      } catch (Exception exception) {}
      if (color != null && this.d instanceof A) {
        n().a(color, b2);
      } else if (i.a(str1, null) != null) {
        n().a(i.a(str1, Color.cyan), b2);
      } 
    } 
    n().c(bool1);
    n().a(i.a("hideSelector", i.q));
    c.a().a(m());
    c.a().a(this.a);
    c.a().a(this.b);
    hx.a().a(this.b);
    c.a().a(this);
    if (b.a().a("tabbedQuickViews") && i.a(i.aj, i.ak)) {
      String str = i.e("lastSelectedQuickViewName", "Default");
      if (!f.a().a(str))
        f.a().a("Default"); 
      this.a.k();
    } else {
      f.a().a("Default");
      this.a.k();
    } 
    f.a().a(new bk(this, this.d));
    o();
    (new bj(this)).start();
  }
  
  protected JPanel e() {
    return this.g;
  }
  
  public void a(String paramString1, String paramString2, String paramString3) {
    if (paramString1 != null && paramString2 != null && paramString3 != null && !paramString1.equals("") && !paramString2.equals("") && !paramString3.equals("")) {
      this.a.a("Thank You for registering: " + paramString1 + " " + paramString2 + "<" + paramString3 + ">");
    } else {
      this.a.a("Support " + i.b + ", register today.");
    } 
  }
  
  public boolean f() {
    return this.i;
  }
  
  public void c(n paramn) {
    if (this.o != null);
    this.n.c(0);
    if (b.a().a("tabbedQuickViews"))
      this.k.setVisible(true); 
    n().b(paramn);
    n().c((n)null);
    if (paramn != null) {
      this.a.a(paramn.a());
      this.a.b(paramn.c());
      int i1 = (int)(this.a.getWidth() / 2.0D * this.n.t());
      if (i1 > paramn.d())
        i1 = paramn.d() - 1; 
      this.n.c(i1);
      j j1 = null;
      for (j j2 : paramn) {
        g g1 = g.a();
        String str = g1.a("Time");
        if (j2.a().equalsIgnoreCase(str))
          j1 = j2; 
      } 
      this.a.a(j1);
      this.a.p();
      boolean bool = this.a.j();
      this.d.a();
      if (!bool)
        this.a.k(); 
    } else {
      this.a.a(new HashMap<>());
      this.a.b(new HashMap<>());
      this.n.c(0);
    } 
    b(i.a("showTuningConsole", i.p));
    this.i = false;
    Dimension dimension = this.b.getPreferredSize();
    if (dimension.getHeight() > eJ.a(240)) {
      this.c.setPreferredSize(eJ.a(200, 240));
    } else {
      this.c.setPreferredSize(dimension);
    } 
    int i = getHeight() - (this.c.getPreferredSize()).height - this.q.getDividerSize();
    int j = this.q.getDividerLocation();
    if (this.j || i > j) {
      if (this.j)
        n().b(new bc(this)); 
      bd bd = new bd(this);
      bd.start();
      this.j = false;
    } 
    requestFocus();
  }
  
  public void g() {
    this.i = false;
    n().c((n)null);
    this.a.b((n)null);
    System.gc();
  }
  
  public boolean h() {
    if (this.g != null && this.g.isVisible() && this.g.h()) {
      String str = "Tune Settings changes have not been saved.\nWould you like to save before exiting?";
      int i = JOptionPane.showConfirmDialog(this, str);
      if (i == 0) {
        this.g.k();
        System.out.println("Ignore following stack, it is generated on purpose to end shutdown.");
        ((String)null).toString();
      } else {
        if (i == 1)
          return true; 
        if (i == 2) {
          System.out.println("Ignore following stack, it is generated on purpose to end shutdown.");
          ((String)null).toString();
        } 
      } 
    } 
    i();
    return true;
  }
  
  public void i() {
    if (bq.a().c().j()) {
      String str = f.a().g();
      D.c("Current Log View: " + str);
      if (str != null && !str.isEmpty()) {
        c c1 = f.a().c(str);
        c c2 = this.a.B();
        if (bq.a().c().j()) {
          D.c("View Changed: " + bq.a().c().j());
          c2.a(c1.b());
          f.a().a(c2);
        } 
      } 
    } else {
      D.c("Graph Selection not changed.");
    } 
    c c = f.a().c("Default");
    if (c != null && hx.a().r() != null && !hx.a().r().isEmpty())
      f.a().b(c); 
    if (f.a().d() && hx.a().r() != null && !hx.a().r().isEmpty()) {
      String str = "The Following Quick Views have changed:";
      for (c c1 : f.a().c())
        str = str + "\n" + c1.b(); 
      str = str + "\n\nWould you like to save the changes?";
      if (bV.a(str, this, true))
        f.a().e(); 
    } 
  }
  
  public void j() {
    Container container = getParent();
    String str = "CTRL+N or Right - Advance 1 Record\nCTRL+B or Left - Back 1 Record\nPage UP - Advance a graph page worth of records\nPage Down - Decrease a graph page of records\nHome - Jump to 1st Record\nEnd - Jump to last Record\nShift + Right - Select Range to display Average\nUp - Rescale graph, Zoom in\nDown - Rescale graph, Zoom out\nCTRL+P - Play\nCTRL+S - Stop Playback\nSpace - Pause playback\nCTRL+U - Speed playback\nCTRL+D - Slow playback\nCTRL+Delete - Clear graphs\nF3 - Repeat Last Search\nF2 - Scale to Fit";
    a(str, container);
  }
  
  public void k() {
    Container container = getParent();
    a(i.i(), container);
  }
  
  public void a(String paramString, Component paramComponent) {
    bV.c(paramString, paramComponent);
  }
  
  public String l() {
    return this.h;
  }
  
  public void a(String[] paramArrayOfString, boolean paramBoolean) {
    if (this.n.r() != null && !this.n.r().isEmpty())
      i(); 
    this.h = paramArrayOfString[0];
    g();
    if (this.o != null && this.o.isAlive())
      this.o.c(); 
    hx.a().a(paramArrayOfString);
    this.o = new b(this);
    this.o.b(i.a("fillNaN", i.z));
    String str = i.a("fieldMapping", "Auto");
    if (str == null || str.length() == 0 || str.equals("Auto")) {
      D.c("Auto Detect Field mapping");
      if (b.n != null) {
        try {
          this.o.a(b.n.newInstance());
        } catch (InstantiationException instantiationException) {
          Logger.getLogger(aX.class.getName()).log(Level.SEVERE, (String)null, instantiationException);
        } catch (IllegalAccessException illegalAccessException) {
          Logger.getLogger(aX.class.getName()).log(Level.SEVERE, (String)null, illegalAccessException);
        } 
      } else if (i.b.equals(b.j)) {
        String str1 = X.b(i.c, b.b, "");
        if (str1.equals(b.i)) {
          this.o.a((a)new b());
        } else if (str1.equals(b.e)) {
          this.o.a((a)new a());
        } else {
          this.o.a((a)new c());
        } 
      } else if (i.b.equals(b.k)) {
        this.o.a((a)new a());
      } else {
        this.o.a((a)new c());
      } 
    } else {
      D.c("Setting Field mapping to:" + str);
      g.a();
      g.b(str);
    } 
    this.o.a(paramBoolean);
    Iterator<b> iterator = c.a().g();
    while (iterator.hasNext())
      this.o.a(iterator.next()); 
    this.o.a(paramArrayOfString);
    this.o.start();
  }
  
  public boolean b(boolean paramBoolean) {
    if (!b.a().a("tuningPanelVisible"))
      return false; 
    if (this.g == null) {
      JButton jButton;
      JPanel jPanel1 = new JPanel();
      jPanel1.setLayout(new BorderLayout());
      JPanel jPanel2 = new JPanel();
      jPanel2.setLayout(new BorderLayout());
      try {
        Image image = cO.a().a(cO.as, jPanel2, 16);
        ImageIcon imageIcon = new ImageIcon(image);
        jButton = new JButton(imageIcon);
      } catch (a a) {
        Logger.getLogger(aX.class.getName()).log(Level.SEVERE, (String)null, (Throwable)a);
        jButton = new JButton("X");
      } 
      jButton.setToolTipText("Close any open tune file.");
      Dimension dimension = eJ.a(16, 16);
      jButton.setMinimumSize(dimension);
      jButton.setPreferredSize(dimension);
      jButton.addActionListener(new bf(this));
      jPanel2.add("East", jButton);
      jPanel1.add("North", jPanel2);
      this.g = new hE();
      this.g.d();
      n().a(this.g);
      n().a(this.g);
      if (n().r() != null)
        this.g.a(n().r()); 
      int i = i.a("prefFontSize", eJ.a());
      c(i);
      jPanel1.add("Center", this.g);
      this.g.setVisible(paramBoolean);
      q().setBottomComponent(jPanel1);
      double d = i.a(i.X, -1.0D);
      if (d > 0.2D && d < 0.98D)
        q().setDividerLocation(d); 
      e(i.f(i.N, i.Q));
      this.l = true;
    } 
    this.g.setVisible(paramBoolean);
    i.c("showTuningConsole", "" + paramBoolean);
    if (paramBoolean) {
      u();
    } else {
      q().setDividerLocation(1.0D);
    } 
    return paramBoolean;
  }
  
  public void c(String paramString) {
    if (n().r() == null) {
      a("Please Open a file before the compare file", this);
      return;
    } 
    if (this.f != null && this.f.isAlive())
      this.f.c(); 
    this.f = new b(this, true);
    if (m() != null)
      this.f.a(m()); 
    this.f.a(this.a);
    this.f.a(this);
    this.f.a(this.b);
    if (bq.a().k() != null)
      this.f.a(bq.a().k()); 
    this.f.a(paramString);
    this.f.start();
  }
  
  public b m() {
    return bq.a().f();
  }
  
  public hx n() {
    return hx.a();
  }
  
  public void a(Color paramColor) {}
  
  public void c(boolean paramBoolean) {
    this.b.d(paramBoolean);
  }
  
  public void d(boolean paramBoolean) {
    this.b.e(paramBoolean);
  }
  
  public void a(Color paramColor, int paramInt) {}
  
  public void a() {}
  
  public void a(double paramDouble) {
    if (paramDouble == 1.0D) {
      n().c(n().p());
      if (n().s() != null) {
        this.e.d(-n().s().d());
        this.e.e(n().r().d());
        n n1 = hx.a().r();
        n n2 = hx.a().s();
        if (this.e != null && n1 != null) {
          this.e.d(-n1.d());
          this.e.e(n().r().d());
          if (hx.a().r() != null) {
            j j1 = this.a.C();
            j j2 = (j1 != null) ? n2.a(j1.a()) : null;
            if (j1 != null && j2 != null && !j1.x() && !j2.x() && j1.d(0) < 0.1D && j2.d(0) < 0.1D) {
              byte b1 = 0;
              byte b2 = 0;
              byte b3;
              for (b3 = 0; b3 < j1.v(); b3++) {
                if (j1.d(b3) >= 0.0F) {
                  b1 = b3;
                  break;
                } 
              } 
              for (b3 = 0; b3 < j2.v(); b3++) {
                if (j2.d(b3) >= 0.0F) {
                  b2 = b3;
                  break;
                } 
              } 
              this.e.c(b1 - b2);
              if (hx.a().p() <= 0)
                hx.a().c(b1); 
            } else {
              this.e.c(0);
            } 
          } else {
            this.e.c(0);
          } 
        } 
        bg bg = new bg(this);
        SwingUtilities.invokeLater(bg);
        d(n().s());
      } else if (n().r() != null) {
        d(n().r());
      } 
    } else if (i.a(i.U, i.V) && paramDouble >= 0.05D && !Double.isInfinite(paramDouble)) {
      if (this.o == null || !this.o.e())
        if (this.n.r() != null) {
          int i = this.n.r().d();
          int j = (int)(i / paramDouble);
          a(j);
        } else {
          D.c("No DataSet, can't scale.");
        }  
    } else if (!this.m && paramDouble < 0.05D) {
      this.m = true;
    } 
  }
  
  public void a(int paramInt) {
    this.a.j(paramInt);
  }
  
  public void b() {
    this.i = true;
  }
  
  public void d(n paramn) {
    if (i.o) {
      for (j j : paramn) {
        g g1 = g.a();
        String str = g1.a("Time");
        if (!j.a().equalsIgnoreCase(str))
          j.a(true); 
      } 
    } else if (!c()) {
      for (j j : paramn)
        j.a(true); 
    } 
  }
  
  private boolean c() {
    j j = this.a.C();
    return true;
  }
  
  public void a(n paramn) {
    if (SwingUtilities.isEventDispatchThread()) {
      c(paramn);
    } else {
      long l1 = System.currentTimeMillis();
      bh bh = new bh(this, l1, paramn);
      SwingUtilities.invokeLater(bh);
    } 
  }
  
  public void b(n paramn) {
    n().c(paramn);
    if (this.e != null && paramn != null) {
      this.e.d(-paramn.d());
      this.e.e(n().r().d());
      if (hx.a().r() != null) {
        j j1 = this.a.C();
        j j2 = paramn.a(j1.a());
        if (j1 != null && j2 != null && !j1.x() && !j2.x() && j1.d(0) < 0.0F && j2.d(0) < 0.0F) {
          byte b1 = 0;
          byte b2 = 0;
          byte b3;
          for (b3 = 0; b3 < j1.v(); b3++) {
            if (j1.d(b3) >= 0.0F) {
              b1 = b3;
              break;
            } 
          } 
          for (b3 = 0; b3 < j2.v(); b3++) {
            if (j2.d(b3) >= 0.0F) {
              b2 = b3;
              break;
            } 
          } 
          this.e.c(b1 - b2);
          if (hx.a().p() <= 0)
            hx.a().c(b1); 
        } else {
          this.e.c(0);
        } 
      } else {
        this.e.c(0);
      } 
    } 
    validate();
    doLayout();
  }
  
  public void setBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    super.setBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void setBackground(Color paramColor) {
    super.setBackground(paramColor);
    if (this.e != null) {
      this.e.setBackground(paramColor);
      this.e.invalidate();
      this.e.validate();
    } 
  }
  
  public void o() {
    F f = new F(this.a, 500L);
  }
  
  public void b(int paramInt) {
    i.c("compareOffset", paramInt + "");
  }
  
  public void a(boolean paramBoolean) {}
  
  public void doLayout() {
    this.e.setVisible((n().s() != null));
    super.doLayout();
  }
  
  public void b(double paramDouble) {
    if (n().r() == null)
      return; 
    int i = (int)((n().r().d() - 1.0D) * paramDouble);
    n().c(i);
    o();
  }
  
  void c(int paramInt) {
    if (this.g != null) {
      this.g.c(paramInt);
      doLayout();
      this.g.doLayout();
    } 
    float f = paramInt / eJ.a();
  }
  
  public void d(String paramString) {
    if (b(true))
      this.g.b(paramString); 
  }
  
  public aw p() {
    return this.a;
  }
  
  public JSplitPane q() {
    return this.p;
  }
  
  public JSplitPane r() {
    return this.q;
  }
  
  public b s() {
    return this.o;
  }
  
  public void e(String paramString) {
    if (paramString.equals(i.P)) {
      this.g.a(this.b.d());
      this.g.a(false);
      this.b.doLayout();
      this.g.c().doLayout();
      this.g.c().validate();
      bi bi = new bi(this);
      SwingUtilities.invokeLater(bi);
    } else {
      this.b.a(this.b.d());
      this.g.a(true);
      this.g.doLayout();
      this.b.doLayout();
      aZ aZ = new aZ(this);
      SwingUtilities.invokeLater(aZ);
    } 
    validate();
  }
  
  public void t() {
    if (this.c != null)
      if (i.a("showDashboard", true)) {
        Dimension dimension = this.b.getPreferredSize();
        int i = getHeight() / 5;
        if (dimension.getHeight() > i * 1.5D) {
          this.c.setPreferredSize(new Dimension(200, i));
        } else {
          this.c.setPreferredSize(dimension);
        } 
        double d = i.a(i.W, -1.0D);
        if (hx.a().r() == null || d < 0.1D || d > 0.9D) {
          r().setDividerLocation(getHeight() - (this.c.getPreferredSize()).height - r().getDividerSize());
        } else {
          r().setDividerLocation(d);
        } 
      } else {
        r().setDividerLocation(getHeight() - (this.c.getMinimumSize()).height - r().getDividerSize());
      }  
  }
  
  public void u() {
    if (e() != null && i.a("showTuningConsole", i.p)) {
      double d = i.a(i.X, -1.0D);
      if (d < 0.05D || d > 0.98D) {
        q().setDividerLocation(getWidth() - (e().getPreferredSize()).width - q().getDividerSize());
      } else {
        q().setDividerLocation(d);
      } 
    } else {
      q().setDividerLocation(1.0D);
    } 
  }
  
  public void v() {
    String str = f.a().g();
    if (str != null && !str.isEmpty())
      f(str); 
  }
  
  public void f(String paramString) {
    if (paramString != null && !paramString.isEmpty()) {
      c c1 = f.a().c(paramString);
      c c2 = this.a.B();
      if (c1 != null && bq.a().c().j()) {
        D.c("View Changed: " + bq.a().c().j());
        c2.a(c1.b());
        c2.a(c1.f());
        f.a().a(c2);
      } 
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/aX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */