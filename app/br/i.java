package br;

import G.R;
import G.ah;
import G.bM;
import G.br;
import G.bs;
import G.bv;
import G.de;
import G.dm;
import V.a;
import V.g;
import aE.a;
import bH.D;
import bH.J;
import bH.K;
import bH.p;
import bt.bh;
import bt.d;
import com.efiAnalytics.apps.ts.dashboard.Gauge;
import com.efiAnalytics.apps.ts.dashboard.Z;
import com.efiAnalytics.apps.ts.dashboard.aa;
import com.efiAnalytics.apps.ts.dashboard.x;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.bc;
import com.efiAnalytics.ui.dQ;
import com.efiAnalytics.ui.dn;
import com.efiAnalytics.ui.eJ;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import n.a;
import n.n;
import r.a;
import s.g;

public class i extends d implements bc, a {
  n a = null;
  
  x b = null;
  
  x c = null;
  
  dQ d = null;
  
  JSplitPane e = new JSplitPane();
  
  JSplitPane f = new JSplitPane();
  
  al g = null;
  
  private a q = null;
  
  private Window r = null;
  
  private Container s = null;
  
  m h = null;
  
  dm i = null;
  
  R j = null;
  
  String k = null;
  
  private static final String t = eJ.a(200) + "";
  
  static String l = "_histogram";
  
  private String u = null;
  
  boolean m = false;
  
  boolean n = false;
  
  boolean o = false;
  
  boolean p = false;
  
  public i(R paramR, dm paramdm) {
    this.j = paramR;
    this.i = paramdm;
    this.k = bM.a(paramR, paramdm.b());
    this.d = new dQ((Properties)a.A(), "VeAnalyzeConsole." + paramdm.b());
    try {
      if (this.k == null || this.k.equals("") || p.a(this.k, paramR))
        f(); 
    } catch (g g) {
      D.b("Unable to determine if table " + paramdm.b() + " should be active, so defaulting to yes...");
      f();
    } 
  }
  
  private void f() {
    setLayout(new BorderLayout());
    this.u = this.i.b();
    this.e.setOrientation(1);
    this.f.setOrientation(0);
    try {
      if (this.i instanceof de) {
        this.g = new P(this.j, (de)this.i);
      } else {
        this.g = new s(this.j, this.i);
      } 
      f.a().a(this.g);
    } catch (a a1) {
      D.a("Error creating VE Analyze Console.", (Exception)a1, this);
    } 
    this.f.setOneTouchExpandable(true);
    this.e.setOneTouchExpandable(true);
    this.f.setTopComponent((Component)this.g);
    br br = a(this.j, this.i);
    bh bh = new bh(this.j, (bv)br);
    a((bc)bh);
    this.f.setBottomComponent((Component)bh);
    if (r.i.a().a("gd09ifdspokrwpo3209") || !a.a().c(a.bN, a.bO)) {
      this.f.remove((Component)bh);
      this.f.setDividerSize(0);
      bh = null;
      this.o = true;
    } 
    if (!r.i.a().a("h98oiu32lkpk3209") && a.a().c(a.bL, a.bM)) {
      this.b = new x(this.j);
      this.b.setName("VeAnalyzeConsole." + this.i.b());
      KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher((KeyEventDispatcher)this.b.X());
      if (r.i.a().a("64865e43s5hjhcurd")) {
        this.a = new n();
        this.a.setTabPlacement(3);
        this.e.setTopComponent((Component)this.a);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add("Center", (Component)this.b);
        this.a.addTab(g.b("Standard"), jPanel);
        this.b.setMinimumSize(new Dimension(eJ.a(1), eJ.a(150)));
        this.c = new x(this.j);
        this.c.setName("VeAnalyzeConsole.Histogram." + this.i.b());
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher((KeyEventDispatcher)this.c.X());
        jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add("Center", (Component)this.c);
        this.a.addTab(g.b("Histogram"), jPanel);
        this.c.setMinimumSize(new Dimension(eJ.a(1), eJ.a(150)));
      } else {
        this.e.setTopComponent((Component)this.b);
      } 
      try {
        Z z1 = (new aa()).a(this.j, a.A(), "veAnalyze_" + this.u, 6);
        this.b.a(z1);
        Z z2 = (new aa()).a(this.j, "veAnalyze_" + this.u, 6);
        this.b.b(z2);
        this.b.n(a.A().m());
        Component[] arrayOfComponent = this.b.getComponents();
        byte b;
        for (b = 0; b < arrayOfComponent.length; b++) {
          if (arrayOfComponent[b] instanceof Gauge) {
            Gauge gauge = (Gauge)arrayOfComponent[b];
            if (gauge.getOutputChannel().equals("veTuneValue"));
          } 
        } 
        if (this.c != null) {
          z1 = (new aa()).a(this.j, a.A(), "veAnalyze_" + this.u + l, 5);
          this.c.a(z1);
          z2 = (new aa()).a(this.j, "veAnalyze_" + this.u + l, 5);
          this.c.b(z2);
          this.c.n(a.A().m());
          arrayOfComponent = this.c.getComponents();
          for (b = 0; b < arrayOfComponent.length; b++) {
            if (arrayOfComponent[b] instanceof Gauge) {
              Gauge gauge = (Gauge)arrayOfComponent[b];
              if (gauge.getOutputChannel().equals("veTuneValue"));
            } 
          } 
          this.a.g(this.d.b("selectedDash", g.b("Standard")));
        } 
      } catch (Exception exception) {
        bV.d("Error setting gauges, check log for detail.\nMessage:\n" + exception.getMessage(), (Component)this);
        exception.printStackTrace();
      } 
      this.e.setBottomComponent(this.f);
      add("Center", this.e);
    } else {
      add("Center", this.f);
      this.p = true;
    } 
    this.g.a(new JLabel("     "));
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("fullscreen.png")).getScaledInstance(22, 22, 1);
    image = eJ.a(image, (Component)this);
    ImageIcon imageIcon = new ImageIcon(image);
    JButton jButton = new JButton(null, imageIcon);
    jButton.setToolTipText(g.b("Display VE Analyze Full Screen"));
    jButton.addActionListener(new j(this));
    Dimension dimension = new Dimension(eJ.a(25), eJ.a(25));
    jButton.setPreferredSize(dimension);
    jButton.setMaximumSize(dimension);
    this.g.a(jButton);
    g();
    this.n = true;
  }
  
  public boolean a() {
    try {
      if (!this.n && this.u == null && (this.k == null || this.k.equals("") || p.a(this.k, this.j))) {
        f();
        this.m = true;
        return true;
      } 
      if (!this.m)
        this.m = true; 
    } catch (g g) {
      Logger.getLogger(i.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
    } 
    return true;
  }
  
  private void g() {
    h();
    this.e.addPropertyChangeListener("dividerLocation", new k(this));
    this.f.addPropertyChangeListener("dividerLocation", new l(this));
  }
  
  private void h() {
    int j = Integer.parseInt(this.d.b("horizontalSplitPos", "" + t));
    this.e.setDividerLocation(eJ.a(j));
    int k = (this.f.getPreferredSize()).height - (this.g.getPreferredSize()).height;
    int i1 = this.f.getHeight() - k;
    if (i1 < 0)
      i1 = (int)((this.g.getPreferredSize()).height * 1.2D); 
    double d1 = Double.parseDouble(this.d.b("verticalSplitPos", "" + i1));
    if (d1 > 1.0D) {
      this.f.setDividerLocation(eJ.a((int)d1));
    } else {
      this.f.setDividerLocation(i1);
      D.c("Tried to set horizontal divider to negative value, set to default." + i1);
    } 
  }
  
  private void i() {
    int j = this.f.getDividerLocation();
    double d1 = j / this.f.getHeight();
    if (isVisible() && d1 > 0.0D)
      this.d.a("verticalSplitPos", eJ.b(j) + ""); 
  }
  
  private br a(R paramR, dm paramdm) {
    br br = new br();
    bs bs = a(paramR, paramdm.g());
    if (bs != null)
      br.a(bs); 
    bs = a(paramR, paramdm.h());
    if (bs != null)
      br.a(bs); 
    bs = a(paramR, paramdm.f());
    if (bs != null)
      br.a(bs); 
    bs = a(paramR, paramdm.e());
    if (bs != null)
      br.a(bs); 
    return br;
  }
  
  private bs a(R paramR, String paramString) {
    aa aa = new aa();
    ah ah = aa.a(paramR, paramString);
    bs bs = new bs();
    if (ah != null) {
      try {
        bs.a(ah.i());
        bs.a(ah.a());
        bs.b(ah.d());
        bs.b(ah.j().a());
      } catch (g g) {
        Logger.getLogger(i.class.getName()).log(Level.SEVERE, (String)null, (Throwable)g);
      } 
    } else {
      bs.b(true);
      bs.a(true);
      bs.a(paramString);
    } 
    return bs;
  }
  
  public void close() {
    l();
    if (this.g instanceof bc)
      ((bc)this.g).close(); 
    if (this.b != null && this.b.getComponentCount() > 0) {
      this.b.f();
      (new aa()).a(this.b, this.q, "veAnalyze_" + this.u);
      this.b.c();
      KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher((KeyEventDispatcher)this.b.X());
    } 
    if (this.c != null && this.c.getComponentCount() > 0) {
      this.b.f();
      (new aa()).a(this.c, this.q, "veAnalyze_" + this.u + l);
      this.c.c();
      KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher((KeyEventDispatcher)this.c.X());
    } 
    if (this.a != null)
      this.d.a("selectedDash", this.a.getTitleAt(this.a.getSelectedIndex())); 
    this.u = null;
    removeAll();
  }
  
  public void a(a parama) {
    this.q = parama;
  }
  
  public boolean b() {
    return (this.r != null);
  }
  
  public void c() {
    if (!b()) {
      this.s = getParent();
      double d1 = this.f.getDividerLocation() / (this.e.getRightComponent().getHeight() - this.f.getDividerSize());
      double d2 = this.e.getDividerLocation() / (this.e.getWidth() - this.e.getDividerSize());
      JDialog jDialog = new JDialog(bV.a((Component)this));
      jDialog.setUndecorated(true);
      this.r = jDialog;
      this.r.setLayout(new BorderLayout());
      Point point = MouseInfo.getPointerInfo().getLocation();
      GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
      Rectangle rectangle = dn.a(point.x, point.y);
      this.r.setBounds(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new GridLayout(1, 1));
      jPanel.add((Component)this);
      this.r.add("Center", jPanel);
      if (J.c()) {
        K.a(this.r);
        K.b(this.r);
      } else if (!J.a() && graphicsDevice.isFullScreenSupported()) {
        graphicsDevice.setFullScreenWindow(this.r);
      } 
      this.r.setVisible(true);
      this.r.validate();
      if (d2 >= 0.0D && d2 <= 1.0D)
        this.e.setDividerLocation(d2); 
      if (d1 >= 0.0D && d1 <= 1.0D)
        this.f.setDividerLocation(d1); 
      this.r.validate();
      this.h = new m(this);
      KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this.h);
    } 
  }
  
  public void d() {
    if (this.s != null && this.r != null) {
      double d1 = this.f.getDividerLocation() / (this.e.getRightComponent().getHeight() - this.f.getDividerSize());
      double d2 = this.e.getDividerLocation() / (this.e.getWidth() - this.e.getDividerSize() / 2);
      this.s.add((Component)this);
      doLayout();
      this.s.validate();
      if (d2 >= 0.0D && d2 <= 1.0D)
        this.e.setDividerLocation(d2); 
      if (d1 >= 0.0D && d1 <= 1.0D)
        this.f.setDividerLocation(d1); 
      if (J.c());
      this.r.dispose();
      this.r = null;
      if (this.h != null)
        KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher(this.h); 
    } 
  }
  
  public void e() {
    if (this.r == null) {
      c();
    } else {
      d();
    } 
  }
}


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/br/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */