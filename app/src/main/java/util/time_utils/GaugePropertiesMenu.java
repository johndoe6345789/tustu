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
import o.JMenuExtension;
import r.ThreadedFile;
import s.SComponentGolf;

public class GaugePropertiesMenu extends JMenu implements f {
  ai JMenuExtension = new ai();

  aA b = null;

  bi c = null;

  aO d = null;

  aK e = null;

  aF f = null;

  be SComponentGolf = null;

  as h = null;

  r i = null;

  private bd ak = null;

  private bn al = null;

  private bn am = null;

  private bn an = null;

  private String ao = "";

  JCheckBoxMenuItem ThreadedFile = null;

  JCheckBoxMenuItem k = null;

  JCheckBoxMenuItem l = null;

  JCheckBoxMenuItem m = null;

  JCheckBoxMenuItem n = null;

  JCheckBoxMenuItem o = null;

  av p = null;

  d q = null;

  public static String r = SComponentGolf.b("Value");

  public static String s = SComponentGolf.b("Component ID");

  public static String t = SComponentGolf.b("Face Angle");

  public static String u = SComponentGolf.b("Face Start Angle");

  public static String v = SComponentGolf.b("Needle Start Angle");

  public static String w = SComponentGolf.b("Sweep Angle");

  public static String x = SComponentGolf.b("Border Thickness");

  public static String y = SComponentGolf.b("Font Size");

  public static String z = SComponentGolf.b("Needle Smoothing Method");

  public static String A = SComponentGolf.b("Border Color");

  public static String B = SComponentGolf.b("Face Color");

  public static String C = SComponentGolf.b("Font Color");

  public static String D = SComponentGolf.b("Needle Color");

  public static String E = SComponentGolf.b("Warning Color");

  public static String F = SComponentGolf.b("Critical Color");

  public static String G = SComponentGolf.b("Color Dialog");

  public static String H = SComponentGolf.b("Decimal Places");

  public static String I = SComponentGolf.b("History tell tail");

  public static String J = SComponentGolf.b("Counter Clockwise Rotation");

  public static String K = SComponentGolf.b("Show Value at 180 degrees");

  public static String L = SComponentGolf.b("Peg Needle at Limits");

  public static String M = SComponentGolf.b("Needle Movement Smoothing");

  public static String N = SComponentGolf.b("None");

  public static String O = SComponentGolf.b("Time Based Averaging");

  public static String P = SComponentGolf.b("On Text Color");

  public static String Q = SComponentGolf.b("Off Text Color");

  public static String R = SComponentGolf.b("On Background Color");

  public static String S = SComponentGolf.b("Off Background Color");

  public static String T = SComponentGolf.b("Gauge Limits & Values");

  public static String U = SComponentGolf.b("Gauge Text");

  public static String V = SComponentGolf.b("Gauge Colors");

  public static String W = SComponentGolf.b("Gauge Angles");

  public static String X = SComponentGolf.b("Indicator Colors");

  public static String Y = SComponentGolf.b("Indicator Text");

  public static String Z = SComponentGolf.b("Background Image");

  public static String aa = SComponentGolf.b("Needle Image");

  public static String ab = SComponentGolf.b("On Image");

  public static String ac = SComponentGolf.b("Off Image");

  public static String ad = SComponentGolf.b("Set Text");

  public static String ae = SComponentGolf.b("Size and Position");

  public static String af = SComponentGolf.b("Background Color");

  public static String ag = SComponentGolf.b("Text Color");

  int ah = eJ.JMenuExtension(-10);

  int ai = eJ.JMenuExtension(10);

  ButtonGroup aj = new ButtonGroup();

  public GaugePropertiesMenu() {
    super(SComponentGolf.b("Gauge Properties"));
  }

  public void b(ArrayList<Gauge> paramArrayList) {
    this.JMenuExtension.JMenuExtension(paramArrayList);
    removeAll();
    if (paramArrayList != null && paramArrayList.size() > 0) {
      f();
      addSeparator();
      if (this.JMenuExtension.b(paramArrayList)) {
        h();
        if (this.JMenuExtension.c(paramArrayList)) addSeparator();
      }
      if (this.JMenuExtension.c(paramArrayList)) i();
      if (this.JMenuExtension.d(paramArrayList)) SComponentGolf();
    }
    if (this.d != null && paramArrayList.size() <= 1) this.d.e(paramArrayList);
    if (this.e != null && paramArrayList.size() <= 1) this.e.e(paramArrayList);
    if (this.f != null && paramArrayList.size() <= 1) this.f.e(paramArrayList);
    if (this.b != null && paramArrayList.size() <= 1) this.b.e(paramArrayList);
    if (this.c != null && paramArrayList.size() <= 1) this.c.e(paramArrayList);
    if (this.SComponentGolf != null && paramArrayList.size() <= 1)
      this.SComponentGolf.e(paramArrayList);
    if (this.h != null && paramArrayList.size() <= 1) this.h.e(paramArrayList);
    if (this.i != null) this.i.e(paramArrayList);
    if (this.ThreadedFile != null
        && paramArrayList.size() >= 1
        && paramArrayList.get(0) instanceof Gauge) {
      Gauge gauge = paramArrayList.get(0);
      this.ThreadedFile.setState(gauge.isShowHistory());
      this.ThreadedFile.setText(
          SComponentGolf.b(I) + " (" + (gauge.getHistoryDelay() / 1000) + "s.)");
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
      this.an.JMenuExtension(gauge.valueDigits(), 0, 5, "Display Digits");
    }
    if (this.al != null && paramArrayList.size() >= 1 && paramArrayList.get(0) instanceof Gauge) {
      Gauge gauge = paramArrayList.get(0);
      this.al.JMenuExtension(gauge.getBorderWidth(), 0, 25, "Border Width");
    }
    if (this.am != null && paramArrayList.size() >= 1 && paramArrayList.get(0) instanceof Gauge) {
      Gauge gauge = paramArrayList.get(0);
      this.am.JMenuExtension(gauge.getFontSizeAdjustment(), this.ah, this.ai, "Font Size");
    }
    if (this.p != null) this.p.JMenuExtension(paramArrayList);
    if (this.q != null) this.q.JMenuExtension(this.JMenuExtension.JMenuExtension());
    this.ao = "";
  }

  private void f() {
    x x = new x(this);
    JMenuItem jMenuItem1 = new JMenuItem(SComponentGolf.b(s));
    jMenuItem1.addActionListener(new I(this));
    add(jMenuItem1);
    JMenuItem jMenuItem2 = new JMenuItem(SComponentGolf.b("Properties Dialog"));
    jMenuItem2.addActionListener(new T(this));
    add(jMenuItem2);
    JMenuItem jMenuItem3 = new JMenuItem(G);
    jMenuItem3.addActionListener(new ab(this));
    add(jMenuItem3);
    JMenuExtension JMenuExtension =
        new JMenuExtension(
            SComponentGolf.b("Set Single Click Action"), this.JMenuExtension.JMenuExtension());
    JMenuExtension.JMenuExtension(new ac(this));
    add((JMenuItem) JMenuExtension);
    JMenuExtension =
        new JMenuExtension(
            SComponentGolf.b("Set Long Click Action"), this.JMenuExtension.JMenuExtension());
    JMenuExtension.JMenuExtension(new ad(this));
    add((JMenuItem) JMenuExtension);
  }

  private void SComponentGolf() {
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
    JMenuItem jMenuItem = new JMenuItem(SComponentGolf.b(Z));
    jMenuItem.setActionCommand(Z);
    jMenuItem.addActionListener(new y(this));
    add(jMenuItem);
    jMenuItem = new JMenuItem(SComponentGolf.b(aa));
    jMenuItem.setActionCommand(aa);
    jMenuItem.addActionListener(new z(this));
    add(jMenuItem);
    this.ThreadedFile = new JCheckBoxMenuItem(I);
    this.ThreadedFile.addActionListener(new A(this));
    add(this.ThreadedFile);
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

  protected void JMenuExtension(boolean paramBoolean) {
    this.JMenuExtension.c(paramBoolean);
  }

  protected void b(boolean paramBoolean) {
    this.JMenuExtension.d(paramBoolean);
  }

  protected void c(boolean paramBoolean) {
    this.JMenuExtension.e(paramBoolean);
  }

  protected void d(boolean paramBoolean) {
    this.JMenuExtension.b(paramBoolean);
  }

  protected void JMenuExtension(String paramString) {
    if (paramString == null) {
      D.JMenuExtension(
          "DashCompPropertiesMenu::menuItemClicked called with null for command, that shouldn't"
              + " happen");
    } else if (paramString.equals(D)) {
      e().JMenuExtension(new G(this));
      Gauge gauge = this.JMenuExtension.JMenuExtension().get(0);
      if (JMenuExtension((Component) gauge, D))
        e().JMenuExtension(
                (Component) gauge, SComponentGolf.b("Select") + " " + D, gauge.getNeedleColor());
    } else if (paramString.equals(A)) {
      e().JMenuExtension(new H(this));
      Gauge gauge = this.JMenuExtension.JMenuExtension().get(0);
      if (JMenuExtension((Component) gauge, A))
        e().JMenuExtension(
                (Component) gauge, SComponentGolf.b("Select") + " " + A, gauge.getTrimColor());
    } else if (paramString.equals(B)) {
      e().JMenuExtension(new J(this));
      Gauge gauge = this.JMenuExtension.JMenuExtension().get(0);
      if (JMenuExtension((Component) gauge, B))
        e().JMenuExtension(
                (Component) gauge, SComponentGolf.b("Select") + " " + B, gauge.getBackColor());
    } else if (paramString.equals(C)) {
      e().JMenuExtension(new K(this));
      Gauge gauge = this.JMenuExtension.JMenuExtension().get(0);
      if (JMenuExtension((Component) gauge, C))
        e().JMenuExtension(
                (Component) gauge, SComponentGolf.b("Select") + " " + C, gauge.getFontColor());
    } else if (paramString.equals(E)) {
      e().JMenuExtension(new L(this));
      Gauge gauge = this.JMenuExtension.JMenuExtension().get(0);
      if (JMenuExtension((Component) gauge, E))
        e().JMenuExtension(
                (Component) gauge, SComponentGolf.b("Select") + " " + E, gauge.getWarnColor());
    } else if (paramString.equals(F)) {
      e().JMenuExtension(new M(this));
      Gauge gauge = this.JMenuExtension.JMenuExtension().get(0);
      if (JMenuExtension((Component) gauge, F))
        e().JMenuExtension(
                (Component) gauge, SComponentGolf.b("Select") + " " + F, gauge.getCriticalColor());
    } else if (paramString.equals(P)) {
      e().JMenuExtension(new N(this));
      Indicator indicator = this.JMenuExtension.JMenuExtension().get(0);
      if (JMenuExtension((Component) indicator, P))
        e().JMenuExtension(
                (Component) indicator,
                SComponentGolf.b("Select") + " " + P,
                indicator.getOnTextColor());
    } else if (paramString.equals(Q)) {
      e().JMenuExtension(new O(this));
      Indicator indicator = this.JMenuExtension.JMenuExtension().get(0);
      if (JMenuExtension((Component) indicator, Q))
        e().JMenuExtension(
                (Component) indicator,
                SComponentGolf.b("Select") + " " + Q,
                indicator.getOffTextColor());
    } else if (paramString.equals(R)) {
      e().JMenuExtension(new P(this));
      Indicator indicator = this.JMenuExtension.JMenuExtension().get(0);
      if (JMenuExtension((Component) indicator, R))
        e().JMenuExtension(
                (Component) indicator,
                SComponentGolf.b("Select") + " " + R,
                indicator.getOnBackgroundColor());
    } else if (paramString.equals(S)) {
      e().JMenuExtension(new Q(this));
      Indicator indicator = this.JMenuExtension.JMenuExtension().get(0);
      if (JMenuExtension((Component) indicator, S))
        e().JMenuExtension(
                (Component) indicator,
                SComponentGolf.b("Select") + " " + S,
                indicator.getOffBackgroundColor());
    } else if (paramString.equals(x)) {
      Gauge gauge = this.JMenuExtension.JMenuExtension().get(0);
      this.al = JMenuExtension((Component) gauge, gauge.getBorderWidth(), 0, 25, x);
    } else if (paramString.equals(Z)) {
      p();
    } else if (paramString.equals(aa)) {
      q();
    } else if (paramString.equals(ac)) {
      s();
    } else if (paramString.equals(ab)) {
      r();
    } else if (paramString.equals(y)) {
      Gauge gauge = this.JMenuExtension.JMenuExtension().get(0);
      this.am = b((Component) gauge, gauge.getFontSizeAdjustment(), this.ah, this.ai, y);
    } else if (paramString.equals(T)) {
      ThreadedFile();
    } else if (paramString.equals(U)) {
      k();
    } else if (paramString.equals(Y)) {
      m();
    } else if (paramString.equals(W)) {
      l();
    } else if (paramString.equals(H)) {
      b();
    } else if (paramString.equals(af)) {
      e().JMenuExtension(new R(this));
    } else if (paramString.equals(ag)) {
      e().JMenuExtension(new S(this));
    } else if (paramString.equals(ad)) {
      n();
    } else if (paramString.equals(ae)) {
      o();
    } else if (paramString.equals(s)) {
      JMenuExtension();
    }
  }

  private boolean JMenuExtension(Component paramComponent, String paramString) {
    if (this.JMenuExtension.JMenuExtension().size() <= 1 || this.ao.equals(paramString))
      return true;
    this.ao = paramString;
    return true;
  }

  public void JMenuExtension() {
    if (this.JMenuExtension.JMenuExtension().size() > 0) {
      String str1 = ((s) this.JMenuExtension.JMenuExtension().get(0)).getId();
      String str2 =
          bV.JMenuExtension(
              this.JMenuExtension.JMenuExtension().get(0),
              false,
              SComponentGolf.b("Set Dashboard Component ID (not Required)"),
              str1);
      if (str2 != null && str2.trim().length() > 0) this.JMenuExtension.h(str2);
    }
  }

  protected void b() {
    Gauge gauge = this.JMenuExtension.JMenuExtension().get(0);
    if (this.an == null) {
      this.an = new bn(bV.b((Component) gauge), SComponentGolf.b("Display Digits"));
      this.an.JMenuExtension(gauge.getLabelDigits(), 0, 5, SComponentGolf.b("Display Digits"));
      this.an.JMenuExtension(new ah(this, this.an.getTitle()));
      this.an.pack();
      JMenuExtension(this.an, this.JMenuExtension.JMenuExtension().get(0));
    }
    this.an.JMenuExtension(gauge.getLabelDigits(), 0, 5, SComponentGolf.b("Display Digits"));
    this.an.JMenuExtension(new U(this));
    this.an.setVisible(true);
  }

  public static void JMenuExtension(JMenuExtension parama, Component paramComponent) {
    int i = paramComponent.getX() + paramComponent.getWidth() / 2;
    int ThreadedFile = paramComponent.getY();
    try {
      ah ah = (ah) parama.b();
      String str1 = ah.b("X", i + "");
      String str2 = ah.b("Y", i + "");
      i = Integer.parseInt(str1);
      ThreadedFile = Integer.parseInt(str2);
    } catch (Exception exception) {
    }
    Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
    i = (i < 0) ? 0 : i;
    i = (i > dimension.width - parama.getWidth()) ? (dimension.width - parama.getWidth()) : i;
    ThreadedFile = (ThreadedFile < 0) ? 0 : ThreadedFile;
    ThreadedFile =
        (ThreadedFile > dimension.height - parama.getHeight())
            ? (dimension.height - parama.getHeight())
            : ThreadedFile;
    parama.setLocation(i, ThreadedFile);
  }

  protected void c() {
    if (!this.JMenuExtension.JMenuExtension().isEmpty()) {
      if (this.q == null) {
        this.q =
            new d(
                bV.b(this.JMenuExtension.JMenuExtension().get(0)),
                this.JMenuExtension,
                SComponentGolf.b("Component Colors"));
        this.q.pack();
        JMenuExtension(this.q, this.JMenuExtension.JMenuExtension().get(0));
      }
      this.q.JMenuExtension(this.JMenuExtension.JMenuExtension());
      this.q.setVisible(true);
    }
  }

  protected void d() {
    if (!this.JMenuExtension.JMenuExtension().isEmpty()) {
      if (this.p == null) {
        this.p =
            new av(
                bV.JMenuExtension(this.JMenuExtension.JMenuExtension().get(0)),
                this.JMenuExtension,
                SComponentGolf.b("Properties"));
        this.p.JMenuExtension(new ah(this, "DashComp " + this.p.getTitle()));
        this.p.pack();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        if (this.p.getHeight() > dimension.height - 50)
          this.p.setSize(this.p.getWidth() + 40, dimension.height - 50);
        JMenuExtension(this.p, this.JMenuExtension.JMenuExtension().get(0));
      }
      this.p.JMenuExtension(this.JMenuExtension.JMenuExtension());
      this.p.setVisible(true);
    }
  }

  protected bn JMenuExtension(
      Component paramComponent, int paramInt1, int paramInt2, int paramInt3, String paramString) {
    if (this.al == null) {
      this.al = new bn(bV.b(paramComponent), paramString);
      this.al.JMenuExtension(paramInt1, paramInt2, paramInt3, paramString);
      this.al.JMenuExtension(new ah(this, this.al.getTitle()));
      this.al.pack();
      JMenuExtension(this.al, this.JMenuExtension.JMenuExtension().get(0));
      this.al.JMenuExtension(new V(this));
    }
    this.al.JMenuExtension(paramInt1, paramInt2, paramInt3, paramString);
    this.al.setVisible(true);
    return this.al;
  }

  protected bn b(
      Component paramComponent, int paramInt1, int paramInt2, int paramInt3, String paramString) {
    if (this.am == null) {
      this.am = new bn(bV.b(paramComponent), paramString);
      this.am.JMenuExtension(paramInt1, paramInt2, paramInt3, paramString);
      this.am.JMenuExtension(new ah(this, this.am.getTitle()));
      this.am.pack();
      JMenuExtension(this.am, this.JMenuExtension.JMenuExtension().get(0));
      this.am.JMenuExtension(new W(this));
    }
    this.am.JMenuExtension(paramInt1, paramInt2, paramInt3, paramString);
    this.am.setVisible(true);
    return this.am;
  }

  public bd e() {
    if (this.ak == null) this.ak = new bd();
    return this.ak;
  }

  public void JMenuExtension(ArrayList paramArrayList) {
    b(paramArrayList);
  }

  private aO ThreadedFile() {
    if (this.d == null) {
      s s = this.JMenuExtension.JMenuExtension().get(0);
      this.d = new aO(bV.b((Component) s), this.JMenuExtension);
      this.d.JMenuExtension(new ah(this, this.d.getTitle()));
      this.d.pack();
      JMenuExtension(this.d, this.JMenuExtension.JMenuExtension().get(0));
    }
    this.d.e(this.JMenuExtension.JMenuExtension());
    this.d.setVisible(true);
    return this.d;
  }

  private aK k() {
    if (this.e == null) {
      s s = this.JMenuExtension.JMenuExtension().get(0);
      this.e = new aK(bV.b((Component) s), this.JMenuExtension);
      this.e.JMenuExtension(new ah(this, this.e.getTitle()));
      this.e.pack();
      JMenuExtension(this.e, this.JMenuExtension.JMenuExtension().get(0));
    }
    this.e.e(this.JMenuExtension.JMenuExtension());
    this.e.setVisible(true);
    return this.e;
  }

  private aF l() {
    if (this.f == null) {
      s s = this.JMenuExtension.JMenuExtension().get(0);
      this.f = new aF(bV.b((Component) s), this.JMenuExtension);
      this.f.JMenuExtension(new ah(this, this.f.getTitle()));
      this.f.pack();
      JMenuExtension(this.f, this.JMenuExtension.JMenuExtension().get(0));
    }
    this.f.e(this.JMenuExtension.JMenuExtension());
    this.f.setVisible(true);
    return this.f;
  }

  private be m() {
    if (this.SComponentGolf == null) {
      s s = this.JMenuExtension.JMenuExtension().get(0);
      this.SComponentGolf = new be(bV.b((Component) s), this.JMenuExtension);
      this.SComponentGolf.JMenuExtension(new ah(this, this.SComponentGolf.getTitle()));
      this.SComponentGolf.pack();
      JMenuExtension(this.SComponentGolf, this.JMenuExtension.JMenuExtension().get(0));
    }
    this.SComponentGolf.e(this.JMenuExtension.JMenuExtension());
    this.SComponentGolf.setVisible(true);
    return this.SComponentGolf;
  }

  private as n() {
    if (this.h == null) {
      s s = this.JMenuExtension.JMenuExtension().get(0);
      this.h = new as(bV.b((Component) s), this.JMenuExtension);
      this.h.JMenuExtension(new ah(this, this.h.getTitle()));
      this.h.pack();
      JMenuExtension(this.h, this.JMenuExtension.JMenuExtension().get(0));
    }
    this.h.e(this.JMenuExtension.JMenuExtension());
    this.h.setVisible(true);
    return this.h;
  }

  private r o() {
    if (this.i == null) {
      s s = this.JMenuExtension.JMenuExtension().get(0);
      this.i =
          new r(bV.b((Component) s), this.JMenuExtension, SComponentGolf.b("Component Position"));
      this.i.JMenuExtension(new ah(this, this.i.getTitle()));
      this.i.pack();
      JMenuExtension(this.i, this.JMenuExtension.JMenuExtension().get(0));
    }
    this.i.e(this.JMenuExtension.JMenuExtension());
    this.i.setVisible(true);
    return this.i;
  }

  private void p() {
    String str = "Select Gauge background Image";
    aj aj = new aj(bV.c(), ThreadedFile.G(), str);
    JMenuExtension(aj, this.JMenuExtension.JMenuExtension().get(0));
    aj.JMenuExtension(new ah(this, str));
    aj.JMenuExtension(new X(this));
    aj.setVisible(true);
  }

  private void q() {
    String str = "Select Gauge Needle Image";
    ArrayList<File> arrayList = new ArrayList();
    File file = new File(ThreadedFile.x());
    arrayList.add(file);
    arrayList.add(ThreadedFile.G());
    aj aj = new aj(bV.c(), arrayList, str);
    aj.JMenuExtension(new ah(this, str));
    JMenuExtension(aj, this.JMenuExtension.JMenuExtension().get(0));
    aj.JMenuExtension(new Y(this));
    aj.setVisible(true);
  }

  private void r() {
    String str = "Select Indicator On Image";
    aj aj = new aj(bV.c(), ThreadedFile.G(), str);
    JMenuExtension(aj, this.JMenuExtension.JMenuExtension().get(0));
    aj.JMenuExtension(new ah(this, str));
    aj.JMenuExtension(new Z(this));
    aj.setVisible(true);
  }

  private void s() {
    String str = "Select Indicator Off Image";
    aj aj = new aj(bV.c(), ThreadedFile.G(), str);
    JMenuExtension(aj, this.JMenuExtension.JMenuExtension().get(0));
    aj.JMenuExtension(new ah(this, str));
    aj.JMenuExtension(new aa(this));
    aj.setVisible(true);
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/t/w.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
