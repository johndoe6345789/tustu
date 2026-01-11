package t;

import bH.D;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.Indicator;
import com.efiAnalytics.apps.ts.dashboard.f;
import com.efiAnalytics.apps.ts.dashboard.s;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bd;
import com.efiAnalytics.ui.eJ;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import o.a;
import r.j;
import s.g;

public class GaugePropertiesMenu extends JMenu implements f {
  ai a = new ai();
  
  aA b = null;
  
  bi c = null;
  
  aO d = null;
  
  aK e = null;
  
  aF f = null;
  
  be g = null;
  
  as h = null;
  
  r i = null;
  
  private bd ak = null;
  
  private bn al = null;
  
  private bn am = null;
  
  private bn an = null;
  
  private String ao = "";
  
  JCheckBoxMenuItem j = null;
  
  JCheckBoxMenuItem k = null;
  
  JCheckBoxMenuItem l = null;
  
  JCheckBoxMenuItem m = null;
  
  JCheckBoxMenuItem n = null;
  
  JCheckBoxMenuItem o = null;
  
  av p = null;
  
  d q = null;
  
  public static String r = g.b("Value");
  
  public static String s = g.b("Component ID");
  
  public static String t = g.b("Face Angle");
  
  public static String u = g.b("Face Start Angle");
  
  public static String v = g.b("Needle Start Angle");
  
  public static String w = g.b("Sweep Angle");
  
  public static String x = g.b("Border Thickness");
  
  public static String y = g.b("Font Size");
  
  public static String z = g.b("Needle Smoothing Method");
  
  public static String A = g.b("Border Color");
  
  public static String B = g.b("Face Color");
  
  public static String C = g.b("Font Color");
  
  public static String D = g.b("Needle Color");
  
  public static String E = g.b("Warning Color");
  
  public static String F = g.b("Critical Color");
  
  public static String G = g.b("Color Dialog");
  
  public static String H = g.b("Decimal Places");
  
  public static String I = g.b("History tell tail");
  
  public static String J = g.b("Counter Clockwise Rotation");
  
  public static String K = g.b("Show Value at 180 degrees");
  
  public static String L = g.b("Peg Needle at Limits");
  
  public static String M = g.b("Needle Movement Smoothing");
  
  public static String N = g.b("None");
  
  public static String O = g.b("Time Based Averaging");
  
  public static String P = g.b("On Text Color");
  
  public static String Q = g.b("Off Text Color");
  
  public static String R = g.b("On Background Color");
  
  public static String S = g.b("Off Background Color");
  
  public static String T = g.b("Gauge Limits & Values");
  
  public static String U = g.b("Gauge Text");
  
  public static String V = g.b("Gauge Colors");
  
  public static String W = g.b("Gauge Angles");
  
  public static String X = g.b("Indicator Colors");
  
  public static String Y = g.b("Indicator Text");
  
  public static String Z = g.b("Background Image");
  
  public static String aa = g.b("Needle Image");
  
  public static String ab = g.b("On Image");
  
  public static String ac = g.b("Off Image");
  
  public static String ad = g.b("Set Text");
  
  public static String ae = g.b("Size and Position");
  
  public static String af = g.b("Background Color");
  
  public static String ag = g.b("Text Color");
  
  int ah = eJ.a(-10);
  
  int ai = eJ.a(10);
  
  ButtonGroup aj = new ButtonGroup();
  
  public w() {
    super(g.b("Gauge Properties"));
  }
  
  public void b(ArrayList<Gauge> paramArrayList) {
    this.a.a(paramArrayList);
    removeAll();
    if (paramArrayList != null && paramArrayList.size() > 0) {
      f();
      addSeparator();
      if (this.a.b(paramArrayList)) {
        h();
        if (this.a.c(paramArrayList))
          addSeparator(); 
      } 
      if (this.a.c(paramArrayList))
        i(); 
      if (this.a.d(paramArrayList))
        g(); 
    } 
    if (this.d != null && paramArrayList.size() <= 1)
      this.d.e(paramArrayList); 
    if (this.e != null && paramArrayList.size() <= 1)
      this.e.e(paramArrayList); 
    if (this.f != null && paramArrayList.size() <= 1)
      this.f.e(paramArrayList); 
    if (this.b != null && paramArrayList.size() <= 1)
      this.b.e(paramArrayList); 
    if (this.c != null && paramArrayList.size() <= 1)
      this.c.e(paramArrayList); 
    if (this.g != null && paramArrayList.size() <= 1)
      this.g.e(paramArrayList); 
    if (this.h != null && paramArrayList.size() <= 1)
      this.h.e(paramArrayList); 
    if (this.i != null)
      this.i.e(paramArrayList); 
    if (this.j != null && paramArrayList.size() >= 1 && paramArrayList.get(0) instanceof Gauge) {
      Gauge gauge = paramArrayList.get(0);
      this.j.setState(gauge.isShowHistory());
      this.j.setText(g.b(I) + " (" + (gauge.getHistoryDelay() / 1000) + "s.)");
    } 
    if (this.o != null && paramArrayList.size() >= 1 && paramArrayList.get(0) instanceof Gauge) {
      Gauge gauge = paramArrayList.get(0);
      this.o.setState((gauge.getNeedleSmoothing() == Gauge.G));
    } 
    if (this.n != null && paramArrayList.size() >= 1 && paramArrayList.get(0) instanceof Gauge) {
      Gauge gauge = paramArrayList.get(0);
      this.n.setState((gauge.getNeedleSmoothing() == Gauge.F));
    } 
    if (this.k != null && paramArrayList.size() >= 1 && paramArrayList.get(0) instanceof Gauge) {
      Gauge gauge = paramArrayList.get(0);
      this.k.setState(gauge.isCounterClockwise());
    } 
    if (this.l != null && paramArrayList.size() >= 1 && paramArrayList.get(0) instanceof Gauge) {
      Gauge gauge = paramArrayList.get(0);
      this.l.setState(gauge.isDisplayValueAt180());
    } 
    if (this.m != null && paramArrayList.size() >= 1 && paramArrayList.get(0) instanceof Gauge) {
      Gauge gauge = paramArrayList.get(0);
      this.m.setState(gauge.isPegLimits());
    } 
    if (this.an != null && paramArrayList.size() >= 1 && paramArrayList.get(0) instanceof Gauge) {
      Gauge gauge = paramArrayList.get(0);
      this.an.a(gauge.valueDigits(), 0, 5, "Display Digits");
    } 
    if (this.al != null && paramArrayList.size() >= 1 && paramArrayList.get(0) instanceof Gauge) {
      Gauge gauge = paramArrayList.get(0);
      this.al.a(gauge.getBorderWidth(), 0, 25, "Border Width");
    } 
    if (this.am != null && paramArrayList.size() >= 1 && paramArrayList.get(0) instanceof Gauge) {
      Gauge gauge = paramArrayList.get(0);
      this.am.a(gauge.getFontSizeAdjustment(), this.ah, this.ai, "Font Size");
    } 
    if (this.p != null)
      this.p.a(paramArrayList); 
    if (this.q != null)
      this.q.a(this.a.a()); 
    this.ao = "";
  }
  
  private void f() {
    x x = new x(this);
    JMenuItem jMenuItem1 = new JMenuItem(g.b(s));
    jMenuItem1.addActionListener(new I(this));
    add(jMenuItem1);
    JMenuItem jMenuItem2 = new JMenuItem(g.b("Properties Dialog"));
    jMenuItem2.addActionListener(new T(this));
    add(jMenuItem2);
    JMenuItem jMenuItem3 = new JMenuItem(G);
    jMenuItem3.addActionListener(new ab(this));
    add(jMenuItem3);
    a a = new a(g.b("Set Single Click Action"), this.a.a());
    a.a(new ac(this));
    add((JMenuItem)a);
    a = new a(g.b("Set Long Click Action"), this.a.a());
    a.a(new ad(this));
    add((JMenuItem)a);
  }
  
  private void g() {
    ae ae = new ae(this);
    add(af).addActionListener(ae);
    add(ag).addActionListener(ae);
    add(ad).addActionListener(ae);
  }
  
  private void h() {
    af af = new af(this);
    add(ab).addActionListener(af);
    add(ac).addActionListener(af);
  }
  
  private void i() {
    ag ag = new ag(this);
    JMenuItem jMenuItem = new JMenuItem(g.b(Z));
    jMenuItem.setActionCommand(Z);
    jMenuItem.addActionListener(new y(this));
    add(jMenuItem);
    jMenuItem = new JMenuItem(g.b(aa));
    jMenuItem.setActionCommand(aa);
    jMenuItem.addActionListener(new z(this));
    add(jMenuItem);
    this.j = new JCheckBoxMenuItem(I);
    this.j.addActionListener(new A(this));
    add(this.j);
    this.k = new JCheckBoxMenuItem(J);
    this.k.addActionListener(new B(this));
    add(this.k);
    this.n = new JCheckBoxMenuItem(N);
    this.n.addActionListener(new C(this));
    this.o = new JCheckBoxMenuItem(O);
    this.o.addActionListener(new D(this));
    this.aj.add(this.n);
    this.aj.add(this.o);
    JMenu jMenu = new JMenu(M);
    add(jMenu);
    jMenu.add(this.n);
    jMenu.add(this.o);
    this.l = new JCheckBoxMenuItem(K);
    this.l.addActionListener(new E(this));
    add(this.l);
    this.m = new JCheckBoxMenuItem(L);
    this.m.addActionListener(new F(this));
    add(this.m);
  }
  
  protected void a(boolean paramBoolean) {
    this.a.c(paramBoolean);
  }
  
  protected void b(boolean paramBoolean) {
    this.a.d(paramBoolean);
  }
  
  protected void c(boolean paramBoolean) {
    this.a.e(paramBoolean);
  }
  
  protected void d(boolean paramBoolean) {
    this.a.b(paramBoolean);
  }
  
  protected void a(String paramString) {
    if (paramString == null) {
      D.a("DashCompPropertiesMenu::menuItemClicked called with null for command, that shouldn't happen");
    } else if (paramString.equals(D)) {
      e().a(new G(this));
      Gauge gauge = this.a.a().get(0);
      if (a((Component)gauge, D))
        e().a((Component)gauge, g.b("Select") + " " + D, gauge.getNeedleColor()); 
    } else if (paramString.equals(A)) {
      e().a(new H(this));
      Gauge gauge = this.a.a().get(0);
      if (a((Component)gauge, A))
        e().a((Component)gauge, g.b("Select") + " " + A, gauge.getTrimColor()); 
    } else if (paramString.equals(B)) {
      e().a(new J(this));
      Gauge gauge = this.a.a().get(0);
      if (a((Component)gauge, B))
        e().a((Component)gauge, g.b("Select") + " " + B, gauge.getBackColor()); 
    } else if (paramString.equals(C)) {
      e().a(new K(this));
      Gauge gauge = this.a.a().get(0);
      if (a((Component)gauge, C))
        e().a((Component)gauge, g.b("Select") + " " + C, gauge.getFontColor()); 
    } else if (paramString.equals(E)) {
      e().a(new L(this));
      Gauge gauge = this.a.a().get(0);
      if (a((Component)gauge, E))
        e().a((Component)gauge, g.b("Select") + " " + E, gauge.getWarnColor()); 
    } else if (paramString.equals(F)) {
      e().a(new M(this));
      Gauge gauge = this.a.a().get(0);
      if (a((Component)gauge, F))
        e().a((Component)gauge, g.b("Select") + " " + F, gauge.getCriticalColor()); 
    } else if (paramString.equals(P)) {
      e().a(new N(this));
      Indicator indicator = this.a.a().get(0);
      if (a((Component)indicator, P))
        e().a((Component)indicator, g.b("Select") + " " + P, indicator.getOnTextColor()); 
    } else if (paramString.equals(Q)) {
      e().a(new O(this));
      Indicator indicator = this.a.a().get(0);
      if (a((Component)indicator, Q))
        e().a((Component)indicator, g.b("Select") + " " + Q, indicator.getOffTextColor()); 
    } else if (paramString.equals(R)) {
      e().a(new P(this));
      Indicator indicator = this.a.a().get(0);
      if (a((Component)indicator, R))
        e().a((Component)indicator, g.b("Select") + " " + R, indicator.getOnBackgroundColor()); 
    } else if (paramString.equals(S)) {
      e().a(new Q(this));
      Indicator indicator = this.a.a().get(0);
      if (a((Component)indicator, S))
        e().a((Component)indicator, g.b("Select") + " " + S, indicator.getOffBackgroundColor()); 
    } else if (paramString.equals(x)) {
      Gauge gauge = this.a.a().get(0);
      this.al = a((Component)gauge, gauge.getBorderWidth(), 0, 25, x);
    } else if (paramString.equals(Z)) {
      p();
    } else if (paramString.equals(aa)) {
      q();
    } else if (paramString.equals(ac)) {
      s();
    } else if (paramString.equals(ab)) {
      r();
    } else if (paramString.equals(y)) {
      Gauge gauge = this.a.a().get(0);
      this.am = b((Component)gauge, gauge.getFontSizeAdjustment(), this.ah, this.ai, y);
    } else if (paramString.equals(T)) {
      j();
    } else if (paramString.equals(U)) {
      k();
    } else if (paramString.equals(Y)) {
      m();
    } else if (paramString.equals(W)) {
      l();
    } else if (paramString.equals(H)) {
      b();
    } else if (paramString.equals(af)) {
      e().a(new R(this));
    } else if (paramString.equals(ag)) {
      e().a(new S(this));
    } else if (paramString.equals(ad)) {
      n();
    } else if (paramString.equals(ae)) {
      o();
    } else if (paramString.equals(s)) {
      a();
    } 
  }
  
  private boolean a(Component paramComponent, String paramString) {
    if (this.a.a().size() <= 1 || this.ao.equals(paramString))
      return true; 
    this.ao = paramString;
    return true;
  }
  
  public void a() {
    if (this.a.a().size() > 0) {
      String str1 = ((s)this.a.a().get(0)).getId();
      String str2 = bV.a(this.a.a().get(0), false, g.b("Set Dashboard Component ID (not Required)"), str1);
      if (str2 != null && str2.trim().length() > 0)
        this.a.h(str2); 
    } 
  }
  
  protected void b() {
    Gauge gauge = this.a.a().get(0);
    if (this.an == null) {
      this.an = new bn(bV.b((Component)gauge), g.b("Display Digits"));
      this.an.a(gauge.getLabelDigits(), 0, 5, g.b("Display Digits"));
      this.an.a(new ah(this, this.an.getTitle()));
      this.an.pack();
      a(this.an, this.a.a().get(0));
    } 
    this.an.a(gauge.getLabelDigits(), 0, 5, g.b("Display Digits"));
    this.an.a(new U(this));
    this.an.setVisible(true);
  }
  
  public static void a(a parama, Component paramComponent) {
    int i = paramComponent.getX() + paramComponent.getWidth() / 2;
    int j = paramComponent.getY();
    try {
      ah ah = (ah)parama.b();
      String str1 = ah.b("X", i + "");
      String str2 = ah.b("Y", i + "");
      i = Integer.parseInt(str1);
      j = Integer.parseInt(str2);
    } catch (Exception exception) {}
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    i = (i < 0) ? 0 : i;
    i = (i > dimension.width - parama.getWidth()) ? (dimension.width - parama.getWidth()) : i;
    j = (j < 0) ? 0 : j;
    j = (j > dimension.height - parama.getHeight()) ? (dimension.height - parama.getHeight()) : j;
    parama.setLocation(i, j);
  }
  
  protected void c() {
    if (!this.a.a().isEmpty()) {
      if (this.q == null) {
        this.q = new d(bV.b(this.a.a().get(0)), this.a, g.b("Component Colors"));
        this.q.pack();
        a(this.q, this.a.a().get(0));
      } 
      this.q.a(this.a.a());
      this.q.setVisible(true);
    } 
  }
  
  protected void d() {
    if (!this.a.a().isEmpty()) {
      if (this.p == null) {
        this.p = new av(bV.a(this.a.a().get(0)), this.a, g.b("Properties"));
        this.p.a(new ah(this, "DashComp " + this.p.getTitle()));
        this.p.pack();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        if (this.p.getHeight() > dimension.height - 50)
          this.p.setSize(this.p.getWidth() + 40, dimension.height - 50); 
        a(this.p, this.a.a().get(0));
      } 
      this.p.a(this.a.a());
      this.p.setVisible(true);
    } 
  }
  
  protected bn a(Component paramComponent, int paramInt1, int paramInt2, int paramInt3, String paramString) {
    if (this.al == null) {
      this.al = new bn(bV.b(paramComponent), paramString);
      this.al.a(paramInt1, paramInt2, paramInt3, paramString);
      this.al.a(new ah(this, this.al.getTitle()));
      this.al.pack();
      a(this.al, this.a.a().get(0));
      this.al.a(new V(this));
    } 
    this.al.a(paramInt1, paramInt2, paramInt3, paramString);
    this.al.setVisible(true);
    return this.al;
  }
  
  protected bn b(Component paramComponent, int paramInt1, int paramInt2, int paramInt3, String paramString) {
    if (this.am == null) {
      this.am = new bn(bV.b(paramComponent), paramString);
      this.am.a(paramInt1, paramInt2, paramInt3, paramString);
      this.am.a(new ah(this, this.am.getTitle()));
      this.am.pack();
      a(this.am, this.a.a().get(0));
      this.am.a(new W(this));
    } 
    this.am.a(paramInt1, paramInt2, paramInt3, paramString);
    this.am.setVisible(true);
    return this.am;
  }
  
  public bd e() {
    if (this.ak == null)
      this.ak = new bd(); 
    return this.ak;
  }
  
  public void a(ArrayList paramArrayList) {
    b(paramArrayList);
  }
  
  private aO j() {
    if (this.d == null) {
      s s = this.a.a().get(0);
      this.d = new aO(bV.b((Component)s), this.a);
      this.d.a(new ah(this, this.d.getTitle()));
      this.d.pack();
      a(this.d, this.a.a().get(0));
    } 
    this.d.e(this.a.a());
    this.d.setVisible(true);
    return this.d;
  }
  
  private aK k() {
    if (this.e == null) {
      s s = this.a.a().get(0);
      this.e = new aK(bV.b((Component)s), this.a);
      this.e.a(new ah(this, this.e.getTitle()));
      this.e.pack();
      a(this.e, this.a.a().get(0));
    } 
    this.e.e(this.a.a());
    this.e.setVisible(true);
    return this.e;
  }
  
  private aF l() {
    if (this.f == null) {
      s s = this.a.a().get(0);
      this.f = new aF(bV.b((Component)s), this.a);
      this.f.a(new ah(this, this.f.getTitle()));
      this.f.pack();
      a(this.f, this.a.a().get(0));
    } 
    this.f.e(this.a.a());
    this.f.setVisible(true);
    return this.f;
  }
  
  private be m() {
    if (this.g == null) {
      s s = this.a.a().get(0);
      this.g = new be(bV.b((Component)s), this.a);
      this.g.a(new ah(this, this.g.getTitle()));
      this.g.pack();
      a(this.g, this.a.a().get(0));
    } 
    this.g.e(this.a.a());
    this.g.setVisible(true);
    return this.g;
  }
  
  private as n() {
    if (this.h == null) {
      s s = this.a.a().get(0);
      this.h = new as(bV.b((Component)s), this.a);
      this.h.a(new ah(this, this.h.getTitle()));
      this.h.pack();
      a(this.h, this.a.a().get(0));
    } 
    this.h.e(this.a.a());
    this.h.setVisible(true);
    return this.h;
  }
  
  private r o() {
    if (this.i == null) {
      s s = this.a.a().get(0);
      this.i = new r(bV.b((Component)s), this.a, g.b("Component Position"));
      this.i.a(new ah(this, this.i.getTitle()));
      this.i.pack();
      a(this.i, this.a.a().get(0));
    } 
    this.i.e(this.a.a());
    this.i.setVisible(true);
    return this.i;
  }
  
  private void p() {
    String str = "Select Gauge background Image";
    aj aj = new aj(bV.c(), j.G(), str);
    a(aj, this.a.a().get(0));
    aj.a(new ah(this, str));
    aj.a(new X(this));
    aj.setVisible(true);
  }
  
  private void q() {
    String str = "Select Gauge Needle Image";
    ArrayList<File> arrayList = new ArrayList();
    File file = new File(j.x());
    arrayList.add(file);
    arrayList.add(j.G());
    aj aj = new aj(bV.c(), arrayList, str);
    aj.a(new ah(this, str));
    a(aj, this.a.a().get(0));
    aj.a(new Y(this));
    aj.setVisible(true);
  }
  
  private void r() {
    String str = "Select Indicator On Image";
    aj aj = new aj(bV.c(), j.G(), str);
    a(aj, this.a.a().get(0));
    aj.a(new ah(this, str));
    aj.a(new Z(this));
    aj.setVisible(true);
  }
  
  private void s() {
    String str = "Select Indicator Off Image";
    aj aj = new aj(bV.c(), j.G(), str);
    a(aj, this.a.a().get(0));
    aj.a(new ah(this, str));
    aj.a(new aa(this));
    aj.setVisible(true);
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */