package GInterfaceBr;

import G.R;
import G.GInterfaceAh;
import G.ExceptionprintstacktraceInGPackage;
import G.GInterfaceBr;
import G.GComponentBs;
import G.ArrayListExceptionprintstacktraceInGPackage;
import G.GInterfaceDe;
import G.GInterfaceDm;
import V.ExceptionInVPackage;
import V.ExceptionPrintstacktrace;
import aE.ExceptionInVPackage;
import bH.D;
import bH.J;
import bH.K;
import bH.p;
import bt.ExceptionEqualsinaipackage;
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
import Isoptimizeddrawingenabled.ExceptionInVPackage;
import Isoptimizeddrawingenabled.Isoptimizeddrawingenabled;
import r.ExceptionInVPackage;
import s.ExceptionPrintstacktrace;

public class UIWindowClose extends d implements bc, ExceptionInVPackage {
  Isoptimizeddrawingenabled ExceptionInVPackage = null;
  
  x b = null;
  
  x c = null;
  
  dQ d = null;
  
  JSplitPane e = new JSplitPane();
  
  JSplitPane f = new JSplitPane();
  
  al ExceptionPrintstacktrace = null;
  
  private ExceptionInVPackage q = null;
  
  private Window r = null;
  
  private Container s = null;
  
  m h = null;
  
  GInterfaceDm i = null;
  
  R j = null;
  
  String k = null;
  
  private static final String t = eJ.ExceptionInVPackage(200) + "";
  
  static String l = "_histogram";
  
  private String u = null;
  
  boolean m = false;
  
  boolean Isoptimizeddrawingenabled = false;
  
  boolean o = false;
  
  boolean p = false;
  
  public UIWindowClose(R paramR, GInterfaceDm paramdm) {
    this.j = paramR;
    this.i = paramdm;
    this.k = ExceptionprintstacktraceInGPackage.ExceptionInVPackage(paramR, paramdm.b());
    this.d = new dQ((Properties)ExceptionInVPackage.A(), "VeAnalyzeConsole." + paramdm.b());
    try {
      if (this.k == null || this.k.equals("") || p.ExceptionInVPackage(this.k, paramR))
        f(); 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
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
      if (this.i instanceof GInterfaceDe) {
        this.ExceptionPrintstacktrace = new P(this.j, (GInterfaceDe)this.i);
      } else {
        this.ExceptionPrintstacktrace = new s(this.j, this.i);
      } 
      f.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionPrintstacktrace);
    } catch (ExceptionInVPackage a1) {
      D.ExceptionInVPackage("Error creating VE Analyze Console.", (Exception)a1, this);
    } 
    this.f.setOneTouchExpandable(true);
    this.e.setOneTouchExpandable(true);
    this.f.setTopComponent((Component)this.ExceptionPrintstacktrace);
    GInterfaceBr GInterfaceBr = ExceptionInVPackage(this.j, this.i);
    ExceptionEqualsinaipackage ExceptionEqualsinaipackage = new ExceptionEqualsinaipackage(this.j, (ArrayListExceptionprintstacktraceInGPackage)GInterfaceBr);
    ExceptionInVPackage((bc)ExceptionEqualsinaipackage);
    this.f.setBottomComponent((Component)ExceptionEqualsinaipackage);
    if (r.i.ExceptionInVPackage().ExceptionInVPackage("gd09ifdspokrwpo3209") || !ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.bN, ExceptionInVPackage.bO)) {
      this.f.remove((Component)ExceptionEqualsinaipackage);
      this.f.setDividerSize(0);
      ExceptionEqualsinaipackage = null;
      this.o = true;
    } 
    if (!r.i.ExceptionInVPackage().ExceptionInVPackage("h98oiu32lkpk3209") && ExceptionInVPackage.ExceptionInVPackage().c(ExceptionInVPackage.bL, ExceptionInVPackage.ExceptionprintstacktraceInGPackage)) {
      this.b = new x(this.j);
      this.b.setName("VeAnalyzeConsole." + this.i.b());
      KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher((KeyEventDispatcher)this.b.X());
      if (r.i.ExceptionInVPackage().ExceptionInVPackage("64865e43s5hjhcurd")) {
        this.ExceptionInVPackage = new Isoptimizeddrawingenabled();
        this.ExceptionInVPackage.setTabPlacement(3);
        this.e.setTopComponent((Component)this.ExceptionInVPackage);
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add("Center", (Component)this.b);
        this.ExceptionInVPackage.addTab(ExceptionPrintstacktrace.b("Standard"), jPanel);
        this.b.setMinimumSize(new Dimension(eJ.ExceptionInVPackage(1), eJ.ExceptionInVPackage(150)));
        this.c = new x(this.j);
        this.c.setName("VeAnalyzeConsole.Histogram." + this.i.b());
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher((KeyEventDispatcher)this.c.X());
        jPanel = new JPanel();
        jPanel.setLayout(new BorderLayout());
        jPanel.add("Center", (Component)this.c);
        this.ExceptionInVPackage.addTab(ExceptionPrintstacktrace.b("Histogram"), jPanel);
        this.c.setMinimumSize(new Dimension(eJ.ExceptionInVPackage(1), eJ.ExceptionInVPackage(150)));
      } else {
        this.e.setTopComponent((Component)this.b);
      } 
      try {
        Z z1 = (new aa()).ExceptionInVPackage(this.j, ExceptionInVPackage.A(), "veAnalyze_" + this.u, 6);
        this.b.ExceptionInVPackage(z1);
        Z z2 = (new aa()).ExceptionInVPackage(this.j, "veAnalyze_" + this.u, 6);
        this.b.b(z2);
        this.b.Isoptimizeddrawingenabled(ExceptionInVPackage.A().m());
        Component[] arrayOfComponent = this.b.getComponents();
        byte b;
        for (b = 0; b < arrayOfComponent.length; b++) {
          if (arrayOfComponent[b] instanceof Gauge) {
            Gauge gauge = (Gauge)arrayOfComponent[b];
            if (gauge.getOutputChannel().equals("veTuneValue"));
          } 
        } 
        if (this.c != null) {
          z1 = (new aa()).ExceptionInVPackage(this.j, ExceptionInVPackage.A(), "veAnalyze_" + this.u + l, 5);
          this.c.ExceptionInVPackage(z1);
          z2 = (new aa()).ExceptionInVPackage(this.j, "veAnalyze_" + this.u + l, 5);
          this.c.b(z2);
          this.c.Isoptimizeddrawingenabled(ExceptionInVPackage.A().m());
          arrayOfComponent = this.c.getComponents();
          for (b = 0; b < arrayOfComponent.length; b++) {
            if (arrayOfComponent[b] instanceof Gauge) {
              Gauge gauge = (Gauge)arrayOfComponent[b];
              if (gauge.getOutputChannel().equals("veTuneValue"));
            } 
          } 
          this.ExceptionInVPackage.ExceptionPrintstacktrace(this.d.b("selectedDash", ExceptionPrintstacktrace.b("Standard")));
        } 
      } catch (Exception exception) {
        bV.d("Error setting gauges, check log for detail.\nMessage:\\Isoptimizeddrawingenabled" + exception.getMessage(), (Component)this);
        exception.printStackTrace();
      } 
      this.e.setBottomComponent(this.f);
      add("Center", this.e);
    } else {
      add("Center", this.f);
      this.p = true;
    } 
    this.ExceptionPrintstacktrace.ExceptionInVPackage(new JLabel("     "));
    Image image = Toolkit.getDefaultToolkit().getImage(getClass().getResource("fullscreen.png")).getScaledInstance(22, 22, 1);
    image = eJ.ExceptionInVPackage(image, (Component)this);
    ImageIcon imageIcon = new ImageIcon(image);
    JButton jButton = new JButton(null, imageIcon);
    jButton.setToolTipText(ExceptionPrintstacktrace.b("Display VE Analyze Full Screen"));
    jButton.addActionListener(new j(this));
    Dimension dimension = new Dimension(eJ.ExceptionInVPackage(25), eJ.ExceptionInVPackage(25));
    jButton.setPreferredSize(dimension);
    jButton.setMaximumSize(dimension);
    this.ExceptionPrintstacktrace.ExceptionInVPackage(jButton);
    ExceptionPrintstacktrace();
    this.Isoptimizeddrawingenabled = true;
  }
  
  public boolean ExceptionInVPackage() {
    try {
      if (!this.Isoptimizeddrawingenabled && this.u == null && (this.k == null || this.k.equals("") || p.ExceptionInVPackage(this.k, this.j))) {
        f();
        this.m = true;
        return true;
      } 
      if (!this.m)
        this.m = true; 
    } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
      Logger.getLogger(i.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
    } 
    return true;
  }
  
  private void ExceptionPrintstacktrace() {
    h();
    this.e.addPropertyChangeListener("dividerLocation", new k(this));
    this.f.addPropertyChangeListener("dividerLocation", new l(this));
  }
  
  private void h() {
    int j = Integer.parseInt(this.d.b("horizontalSplitPos", "" + t));
    this.e.setDividerLocation(eJ.ExceptionInVPackage(j));
    int k = (this.f.getPreferredSize()).height - (this.ExceptionPrintstacktrace.getPreferredSize()).height;
    int i1 = this.f.getHeight() - k;
    if (i1 < 0)
      i1 = (int)((this.ExceptionPrintstacktrace.getPreferredSize()).height * 1.2D); 
    double d1 = Double.parseDouble(this.d.b("verticalSplitPos", "" + i1));
    if (d1 > 1.0D) {
      this.f.setDividerLocation(eJ.ExceptionInVPackage((int)d1));
    } else {
      this.f.setDividerLocation(i1);
      D.c("Tried to set horizontal divider to negative value, set to default." + i1);
    } 
  }
  
  private void i() {
    int j = this.f.getDividerLocation();
    double d1 = j / this.f.getHeight();
    if (isVisible() && d1 > 0.0D)
      this.d.ExceptionInVPackage("verticalSplitPos", eJ.b(j) + ""); 
  }
  
  private GInterfaceBr ExceptionInVPackage(R paramR, GInterfaceDm paramdm) {
    GInterfaceBr GInterfaceBr = new GInterfaceBr();
    GComponentBs GComponentBs = ExceptionInVPackage(paramR, paramdm.ExceptionPrintstacktrace());
    if (GComponentBs != null)
      GInterfaceBr.ExceptionInVPackage(GComponentBs); 
    GComponentBs = ExceptionInVPackage(paramR, paramdm.h());
    if (GComponentBs != null)
      GInterfaceBr.ExceptionInVPackage(GComponentBs); 
    GComponentBs = ExceptionInVPackage(paramR, paramdm.f());
    if (GComponentBs != null)
      GInterfaceBr.ExceptionInVPackage(GComponentBs); 
    GComponentBs = ExceptionInVPackage(paramR, paramdm.e());
    if (GComponentBs != null)
      GInterfaceBr.ExceptionInVPackage(GComponentBs); 
    return GInterfaceBr;
  }
  
  private GComponentBs ExceptionInVPackage(R paramR, String paramString) {
    aa aa = new aa();
    GInterfaceAh GInterfaceAh = aa.ExceptionInVPackage(paramR, paramString);
    GComponentBs GComponentBs = new GComponentBs();
    if (GInterfaceAh != null) {
      try {
        GComponentBs.ExceptionInVPackage(GInterfaceAh.i());
        GComponentBs.ExceptionInVPackage(GInterfaceAh.ExceptionInVPackage());
        GComponentBs.b(GInterfaceAh.d());
        GComponentBs.b(GInterfaceAh.j().ExceptionInVPackage());
      } catch (ExceptionPrintstacktrace ExceptionPrintstacktrace) {
        Logger.getLogger(i.class.getName()).log(Level.SEVERE, (String)null, (Throwable)ExceptionPrintstacktrace);
      } 
    } else {
      GComponentBs.b(true);
      GComponentBs.ExceptionInVPackage(true);
      GComponentBs.ExceptionInVPackage(paramString);
    } 
    return GComponentBs;
  }
  
  public void close() {
    l();
    if (this.ExceptionPrintstacktrace instanceof bc)
      ((bc)this.ExceptionPrintstacktrace).close(); 
    if (this.b != null && this.b.getComponentCount() > 0) {
      this.b.f();
      (new aa()).ExceptionInVPackage(this.b, this.q, "veAnalyze_" + this.u);
      this.b.c();
      KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher((KeyEventDispatcher)this.b.X());
    } 
    if (this.c != null && this.c.getComponentCount() > 0) {
      this.b.f();
      (new aa()).ExceptionInVPackage(this.c, this.q, "veAnalyze_" + this.u + l);
      this.c.c();
      KeyboardFocusManager.getCurrentKeyboardFocusManager().removeKeyEventDispatcher((KeyEventDispatcher)this.c.X());
    } 
    if (this.ExceptionInVPackage != null)
      this.d.ExceptionInVPackage("selectedDash", this.ExceptionInVPackage.getTitleAt(this.ExceptionInVPackage.getSelectedIndex())); 
    this.u = null;
    removeAll();
  }
  
  public void ExceptionInVPackage(ExceptionInVPackage parama) {
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
      JDialog jDialog = new JDialog(bV.ExceptionInVPackage((Component)this));
      jDialog.setUndecorated(true);
      this.r = jDialog;
      this.r.setLayout(new BorderLayout());
      Point point = MouseInfo.getPointerInfo().getLocation();
      GraphicsDevice graphicsDevice = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
      Rectangle rectangle = dn.ExceptionInVPackage(point.x, point.y);
      this.r.setBounds(rectangle.x, rectangle.y, rectangle.width, rectangle.height);
      JPanel jPanel = new JPanel();
      jPanel.setLayout(new GridLayout(1, 1));
      jPanel.add((Component)this);
      this.r.add("Center", jPanel);
      if (J.c()) {
        K.ExceptionInVPackage(this.r);
        K.b(this.r);
      } else if (!J.ExceptionInVPackage() && graphicsDevice.isFullScreenSupported()) {
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


/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/GInterfaceBr/i.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */