package ao;

import ChangeListener.ClassTypeInHPackage;
import IOProperties.ArComponentCharlie;
import IOProperties.ClassTypeInHPackage;
import V.ExceptionInVPackage;
import W.j;
import W.n;
import ar.ArComponentCharlie;
import ar.ArComponentFoxtrot;
import ar.ChangeListener;
import bH.D;
import bH.X;
import com.efiAnalytics.ui.bV;
import com.efiAnalytics.ui.cO;
import com.efiAnalytics.ui.eJ;
import h.ChangeListener;
import h.ClassTypeInHPackage;
import h.ExceptionInVPackage;
import h.IOProperties;
import j.ArComponentCharlie;
import j.ClassTypeInHPackage;
import j.ExceptionInVPackage;
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

public class aX extends JPanel implements hB, k, l, ClassTypeInHPackage {
  private hx n = hx.ExceptionInVPackage();

  aw ExceptionInVPackage = new aw(this.n);

  protected u ClassTypeInHPackage = new u(this.n);

  JScrollPane ArComponentCharlie = null;

  bn d = null;

  m e = new m(this.n);

  private ClassTypeInHPackage o = null;

  ClassTypeInHPackage ArComponentFoxtrot = null;

  hE ChangeListener = null;

  String h = null;

  boolean IOProperties = false;

  private JSplitPane p = new JSplitPane();

  private JSplitPane q = new JSplitPane();

  boolean j = true;

  ChangeListener k = new ChangeListener();

  protected boolean l = false;

  boolean m = false;

  public aX() {
    this.p.setOrientation(1);
    this.q.setOrientation(0);
    this.q.setOneTouchExpandable(true);
    this.p.setOneTouchExpandable(true);
    this.p.setDividerSize(eJ.ExceptionInVPackage(8));
    this.q.setDividerSize(eJ.ExceptionInVPackage(8));
    this.p.setResizeWeight(1.0D);
    this.q.setResizeWeight(1.0D);
    this.p.setFont(getFont());
    bq.ExceptionInVPackage().ExceptionInVPackage(this.e);
    boolean bool1 = IOProperties.ExceptionInVPackage("showDashboard", true);
    aY aY = new aY(this);
    this.q.addPropertyChangeListener("dividerLocation", aY);
    ba ba = new ba(this);
    this.p.addPropertyChangeListener("dividerLocation", ba);
    bq.ExceptionInVPackage().ExceptionInVPackage(this.ClassTypeInHPackage);
    bq.ExceptionInVPackage().ExceptionInVPackage(this);
    int IOProperties = IOProperties.ClassTypeInHPackage("lineTraceSize", IOProperties.ae);
    this.ExceptionInVPackage.ArComponentCharlie(IOProperties);
    boolean bool2 = IOProperties.ExceptionInVPackage(IOProperties.af, IOProperties.ag);
    this.ExceptionInVPackage.ClassTypeInHPackage(bool2);
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
    if (ClassTypeInHPackage.ExceptionInVPackage().ExceptionInVPackage("optionalQuickSelect")
        && IOProperties.ExceptionInVPackage("fieldSelectionStyle", "standardSelection")
            .equals("selectFromDash")) {
      A ExceptionInVPackage = new A();
      this.ClassTypeInHPackage.ExceptionInVPackage(ExceptionInVPackage);
      this.d = ExceptionInVPackage;
    } else {
      this.d = new hj(this.n);
      jPanel2.add((hj) this.d, "West", 0);
    }
    bq.ExceptionInVPackage().ExceptionInVPackage(this.d);
    JPanel jPanel3 = new JPanel();
    jPanel3.setLayout(new BorderLayout());
    jPanel3.add(this.e, "South");
    if (ClassTypeInHPackage.ExceptionInVPackage().ExceptionInVPackage(";lkewlk nbi3k48tjh265'")
        && IOProperties.ExceptionInVPackage(IOProperties.aJ, IOProperties.aK)) {
      aj aj = new aj();
      aj.ArComponentCharlie();
      bq.ExceptionInVPackage().ExceptionInVPackage(aj);
      jPanel3.add("North", aj);
    }
    add(jPanel3, "North");
    jPanel2.add(this.ExceptionInVPackage, "Center");
    if (ClassTypeInHPackage.ExceptionInVPackage().ExceptionInVPackage("tabbedQuickViews")) {
      jPanel2.add("North", (Component) this.k);
      this.k.setVisible(false);
    }
    JPanel jPanel4 = new JPanel();
    jPanel4.setLayout(new BorderLayout());
    this.ArComponentCharlie = new JScrollPane(this.ClassTypeInHPackage);
    jPanel4.add("Center", this.ArComponentCharlie);
    this.q.setBottomComponent(jPanel4);
    bm.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionInVPackage);
    if (IOProperties.aL != null) this.ExceptionInVPackage.ExceptionInVPackage(IOProperties.aL);
    this.e.ExceptionInVPackage(this.ExceptionInVPackage);
    this.e.ExceptionInVPackage(this);
    this.e.ExceptionInVPackage(this.ClassTypeInHPackage);
    n().ExceptionInVPackage(this);
    n().ExceptionInVPackage(this.d);
    if (this.d instanceof hj) n().ExceptionInVPackage((hj) this.d);
    n().ExceptionInVPackage(this.ExceptionInVPackage);
    n().ExceptionInVPackage(this.ExceptionInVPackage);
    n().ExceptionInVPackage(aV.ExceptionInVPackage());
    n().ExceptionInVPackage(this.ClassTypeInHPackage);
    n().ExceptionInVPackage(this.ClassTypeInHPackage);
    n().ExceptionInVPackage(this.ClassTypeInHPackage);
    n().ExceptionInVPackage(this.ExceptionInVPackage);
    n().ExceptionInVPackage(this.ExceptionInVPackage);
    n().ExceptionInVPackage(this.ExceptionInVPackage);
    n().ArComponentCharlie(this.ClassTypeInHPackage);
    this.ExceptionInVPackage.ExceptionInVPackage(n());
    bZ bZ = new bZ(n());
    this.ExceptionInVPackage.addMouseListener(bZ);
    this.ExceptionInVPackage.addMouseMotionListener(bZ);
    this.ExceptionInVPackage.addMouseWheelListener(bZ);
    bq.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionInVPackage);
    if (bq.ExceptionInVPackage().ArComponentFoxtrot() != null)
      bq.ExceptionInVPackage().ArComponentFoxtrot().ExceptionInVPackage(this);
    d(Boolean.parseBoolean(IOProperties.ExceptionInVPackage("showGauges", "true")));
    ArComponentCharlie(IOProperties.ExceptionInVPackage("adjustGaugeBackgroudToVal", false));
    n().ClassTypeInHPackage(IOProperties.ExceptionInVPackage("zoom", 2.0D), false);
    this.e.ArComponentCharlie(IOProperties.ClassTypeInHPackage("compareOffset", 0));
    int j =
        IOProperties.ExceptionInVPackage("numberOfOverlays", IOProperties.u)
            * IOProperties.ExceptionInVPackage("numberOfGraphs", IOProperties.t);
    byte b1 = 0;
    for (byte b2 = 0; b2 < j; b2++) {
      String str1 = "graphForeColor" + (b2 - b1);
      String str2 = IOProperties.ArComponentCharlie(str1);
      Color color = null;
      try {
        color = new Color(Integer.parseInt(str2));
      } catch (Exception exception) {
      }
      if (color != null && this.d instanceof A) {
        n().ExceptionInVPackage(color, b2);
      } else if (IOProperties.ExceptionInVPackage(str1, null) != null) {
        n().ExceptionInVPackage(IOProperties.ExceptionInVPackage(str1, Color.cyan), b2);
      }
    }
    n().ArComponentCharlie(bool1);
    n().ExceptionInVPackage(IOProperties.ExceptionInVPackage("hideSelector", IOProperties.q));
    ArComponentCharlie.ExceptionInVPackage().ExceptionInVPackage(m());
    ArComponentCharlie.ExceptionInVPackage().ExceptionInVPackage(this.ExceptionInVPackage);
    ArComponentCharlie.ExceptionInVPackage().ExceptionInVPackage(this.ClassTypeInHPackage);
    hx.ExceptionInVPackage().ExceptionInVPackage(this.ClassTypeInHPackage);
    ArComponentCharlie.ExceptionInVPackage().ExceptionInVPackage(this);
    if (ClassTypeInHPackage.ExceptionInVPackage().ExceptionInVPackage("tabbedQuickViews")
        && IOProperties.ExceptionInVPackage(IOProperties.aj, IOProperties.ak)) {
      String str = IOProperties.e("lastSelectedQuickViewName", "Default");
      if (!ArComponentFoxtrot.ExceptionInVPackage().ExceptionInVPackage(str))
        ArComponentFoxtrot.ExceptionInVPackage().ExceptionInVPackage("Default");
      this.ExceptionInVPackage.k();
    } else {
      ArComponentFoxtrot.ExceptionInVPackage().ExceptionInVPackage("Default");
      this.ExceptionInVPackage.k();
    }
    ArComponentFoxtrot.ExceptionInVPackage().ExceptionInVPackage(new bk(this, this.d));
    o();
    (new bj(this)).start();
  }

  protected JPanel e() {
    return this.ChangeListener;
  }

  public void ExceptionInVPackage(String paramString1, String paramString2, String paramString3) {
    if (paramString1 != null
        && paramString2 != null
        && paramString3 != null
        && !paramString1.equals("")
        && !paramString2.equals("")
        && !paramString3.equals("")) {
      this.ExceptionInVPackage.ExceptionInVPackage(
          "Thank You for registering: "
              + paramString1
              + " "
              + paramString2
              + "<"
              + paramString3
              + ">");
    } else {
      this.ExceptionInVPackage.ExceptionInVPackage(
          "Support " + IOProperties.ClassTypeInHPackage + ", register today.");
    }
  }

  public boolean ArComponentFoxtrot() {
    return this.IOProperties;
  }

  public void ArComponentCharlie(n paramn) {
    if (this.o != null)
      ;
    this.n.ArComponentCharlie(0);
    if (ClassTypeInHPackage.ExceptionInVPackage().ExceptionInVPackage("tabbedQuickViews"))
      this.k.setVisible(true);
    n().ClassTypeInHPackage(paramn);
    n().ArComponentCharlie((n) null);
    if (paramn != null) {
      this.ExceptionInVPackage.ExceptionInVPackage(paramn.ExceptionInVPackage());
      this.ExceptionInVPackage.ClassTypeInHPackage(paramn.ArComponentCharlie());
      int i1 = (int) (this.ExceptionInVPackage.getWidth() / 2.0D * this.n.t());
      if (i1 > paramn.d()) i1 = paramn.d() - 1;
      this.n.ArComponentCharlie(i1);
      j j1 = null;
      for (j j2 : paramn) {
        ChangeListener g1 = ChangeListener.ExceptionInVPackage();
        String str = g1.ExceptionInVPackage("Time");
        if (j2.ExceptionInVPackage().equalsIgnoreCase(str)) j1 = j2;
      }
      this.ExceptionInVPackage.ExceptionInVPackage(j1);
      this.ExceptionInVPackage.p();
      boolean bool = this.ExceptionInVPackage.j();
      this.d.ExceptionInVPackage();
      if (!bool) this.ExceptionInVPackage.k();
    } else {
      this.ExceptionInVPackage.ExceptionInVPackage(new HashMap<>());
      this.ExceptionInVPackage.ClassTypeInHPackage(new HashMap<>());
      this.n.ArComponentCharlie(0);
    }
    ClassTypeInHPackage(IOProperties.ExceptionInVPackage("showTuningConsole", IOProperties.p));
    this.IOProperties = false;
    Dimension dimension = this.ClassTypeInHPackage.getPreferredSize();
    if (dimension.getHeight() > eJ.ExceptionInVPackage(240)) {
      this.ArComponentCharlie.setPreferredSize(eJ.ExceptionInVPackage(200, 240));
    } else {
      this.ArComponentCharlie.setPreferredSize(dimension);
    }
    int IOProperties =
        getHeight() - (this.ArComponentCharlie.getPreferredSize()).height - this.q.getDividerSize();
    int j = this.q.getDividerLocation();
    if (this.j || IOProperties > j) {
      if (this.j) n().ClassTypeInHPackage(new bc(this));
      bd bd = new bd(this);
      bd.start();
      this.j = false;
    }
    requestFocus();
  }

  public void ChangeListener() {
    this.IOProperties = false;
    n().ArComponentCharlie((n) null);
    this.ExceptionInVPackage.ClassTypeInHPackage((n) null);
    System.gc();
  }

  public boolean h() {
    if (this.ChangeListener != null && this.ChangeListener.isVisible() && this.ChangeListener.h()) {
      String str =
          "Tune Settings changes have not been saved.\nWould you like to save before exiting?";
      int IOProperties = JOptionPane.showConfirmDialog(this, str);
      if (IOProperties == 0) {
        this.ChangeListener.k();
        System.out.println("Ignore following stack, it is generated on purpose to end shutdown.");
        ((String) null).toString();
      } else {
        if (IOProperties == 1) return true;
        if (IOProperties == 2) {
          System.out.println("Ignore following stack, it is generated on purpose to end shutdown.");
          ((String) null).toString();
        }
      }
    }
    IOProperties();
    return true;
  }

  public void IOProperties() {
    if (bq.ExceptionInVPackage().ArComponentCharlie().j()) {
      String str = ArComponentFoxtrot.ExceptionInVPackage().ChangeListener();
      D.ArComponentCharlie("Current Log View: " + str);
      if (str != null && !str.isEmpty()) {
        ArComponentCharlie c1 = ArComponentFoxtrot.ExceptionInVPackage().ArComponentCharlie(str);
        ArComponentCharlie c2 = this.ExceptionInVPackage.B();
        if (bq.ExceptionInVPackage().ArComponentCharlie().j()) {
          D.ArComponentCharlie(
              "View Changed: " + bq.ExceptionInVPackage().ArComponentCharlie().j());
          c2.ExceptionInVPackage(c1.ClassTypeInHPackage());
          ArComponentFoxtrot.ExceptionInVPackage().ExceptionInVPackage(c2);
        }
      }
    } else {
      D.ArComponentCharlie("Graph Selection not changed.");
    }
    ArComponentCharlie ArComponentCharlie =
        ArComponentFoxtrot.ExceptionInVPackage().ArComponentCharlie("Default");
    if (ArComponentCharlie != null
        && hx.ExceptionInVPackage().r() != null
        && !hx.ExceptionInVPackage().r().isEmpty())
      ArComponentFoxtrot.ExceptionInVPackage().ClassTypeInHPackage(ArComponentCharlie);
    if (ArComponentFoxtrot.ExceptionInVPackage().d()
        && hx.ExceptionInVPackage().r() != null
        && !hx.ExceptionInVPackage().r().isEmpty()) {
      String str = "The Following Quick Views have changed:";
      for (ArComponentCharlie c1 : ArComponentFoxtrot.ExceptionInVPackage().ArComponentCharlie())
        str = str + "\n" + c1.ClassTypeInHPackage();
      str = str + "\n\nWould you like to save the changes?";
      if (bV.ExceptionInVPackage(str, this, true)) ArComponentFoxtrot.ExceptionInVPackage().e();
    }
  }

  public void j() {
    Container container = getParent();
    String str =
        "CTRL+N or Right - Advance 1 Record\n"
            + "CTRL+B or Left - Back 1 Record\n"
            + "Page UP - Advance ExceptionInVPackage graph page worth of records\n"
            + "Page Down - Decrease ExceptionInVPackage graph page of records\n"
            + "Home - Jump to 1st Record\n"
            + "End - Jump to last Record\n"
            + "Shift + Right - Select Range to display Average\n"
            + "Up - Rescale graph, Zoom in\n"
            + "Down - Rescale graph, Zoom out\n"
            + "CTRL+P - Play\n"
            + "CTRL+S - Stop Playback\n"
            + "Space - Pause playback\n"
            + "CTRL+U - Speed playback\n"
            + "CTRL+D - Slow playback\n"
            + "CTRL+Delete - Clear graphs\n"
            + "F3 - Repeat Last Search\n"
            + "F2 - Scale to Fit";
    ExceptionInVPackage(str, container);
  }

  public void k() {
    Container container = getParent();
    ExceptionInVPackage(IOProperties.IOProperties(), container);
  }

  public void ExceptionInVPackage(String paramString, Component paramComponent) {
    bV.ArComponentCharlie(paramString, paramComponent);
  }

  public String l() {
    return this.h;
  }

  public void ExceptionInVPackage(String[] paramArrayOfString, boolean paramBoolean) {
    if (this.n.r() != null && !this.n.r().isEmpty()) IOProperties();
    this.h = paramArrayOfString[0];
    ChangeListener();
    if (this.o != null && this.o.isAlive()) this.o.ArComponentCharlie();
    hx.ExceptionInVPackage().ExceptionInVPackage(paramArrayOfString);
    this.o = new ClassTypeInHPackage(this);
    this.o.ClassTypeInHPackage(IOProperties.ExceptionInVPackage("fillNaN", IOProperties.z));
    String str = IOProperties.ExceptionInVPackage("fieldMapping", "Auto");
    if (str == null || str.length() == 0 || str.equals("Auto")) {
      D.ArComponentCharlie("Auto Detect Field mapping");
      if (ClassTypeInHPackage.n != null) {
        try {
          this.o.ExceptionInVPackage(ClassTypeInHPackage.n.newInstance());
        } catch (InstantiationException instantiationException) {
          Logger.getLogger(aX.class.getName())
              .log(Level.SEVERE, (String) null, instantiationException);
        } catch (IllegalAccessException illegalAccessException) {
          Logger.getLogger(aX.class.getName())
              .log(Level.SEVERE, (String) null, illegalAccessException);
        }
      } else if (IOProperties.ClassTypeInHPackage.equals(ClassTypeInHPackage.j)) {
        String str1 =
            X.ClassTypeInHPackage(
                IOProperties.ArComponentCharlie, ClassTypeInHPackage.ClassTypeInHPackage, "");
        if (str1.equals(ClassTypeInHPackage.IOProperties)) {
          this.o.ExceptionInVPackage((ExceptionInVPackage) new ClassTypeInHPackage());
        } else if (str1.equals(ClassTypeInHPackage.e)) {
          this.o.ExceptionInVPackage((ExceptionInVPackage) new ExceptionInVPackage());
        } else {
          this.o.ExceptionInVPackage((ExceptionInVPackage) new ArComponentCharlie());
        }
      } else if (IOProperties.ClassTypeInHPackage.equals(ClassTypeInHPackage.k)) {
        this.o.ExceptionInVPackage((ExceptionInVPackage) new ExceptionInVPackage());
      } else {
        this.o.ExceptionInVPackage((ExceptionInVPackage) new ArComponentCharlie());
      }
    } else {
      D.ArComponentCharlie("Setting Field mapping to:" + str);
      ChangeListener.ExceptionInVPackage();
      ChangeListener.ClassTypeInHPackage(str);
    }
    this.o.ExceptionInVPackage(paramBoolean);
    Iterator<ClassTypeInHPackage> iterator =
        ArComponentCharlie.ExceptionInVPackage().ChangeListener();
    while (iterator.hasNext()) this.o.ExceptionInVPackage(iterator.next());
    this.o.ExceptionInVPackage(paramArrayOfString);
    this.o.start();
  }

  public boolean ClassTypeInHPackage(boolean paramBoolean) {
    if (!ClassTypeInHPackage.ExceptionInVPackage().ExceptionInVPackage("tuningPanelVisible"))
      return false;
    if (this.ChangeListener == null) {
      JButton jButton;
      JPanel jPanel1 = new JPanel();
      jPanel1.setLayout(new BorderLayout());
      JPanel jPanel2 = new JPanel();
      jPanel2.setLayout(new BorderLayout());
      try {
        Image image = cO.ExceptionInVPackage().ExceptionInVPackage(cO.as, jPanel2, 16);
        ImageIcon imageIcon = new ImageIcon(image);
        jButton = new JButton(imageIcon);
      } catch (ExceptionInVPackage ExceptionInVPackage) {
        Logger.getLogger(aX.class.getName())
            .log(Level.SEVERE, (String) null, (Throwable) ExceptionInVPackage);
        jButton = new JButton("X");
      }
      jButton.setToolTipText("Close any open tune file.");
      Dimension dimension = eJ.ExceptionInVPackage(16, 16);
      jButton.setMinimumSize(dimension);
      jButton.setPreferredSize(dimension);
      jButton.addActionListener(new bf(this));
      jPanel2.add("East", jButton);
      jPanel1.add("North", jPanel2);
      this.ChangeListener = new hE();
      this.ChangeListener.d();
      n().ExceptionInVPackage(this.ChangeListener);
      n().ExceptionInVPackage(this.ChangeListener);
      if (n().r() != null) this.ChangeListener.ExceptionInVPackage(n().r());
      int IOProperties = IOProperties.ExceptionInVPackage("prefFontSize", eJ.ExceptionInVPackage());
      ArComponentCharlie(IOProperties);
      jPanel1.add("Center", this.ChangeListener);
      this.ChangeListener.setVisible(paramBoolean);
      q().setBottomComponent(jPanel1);
      double d = IOProperties.ExceptionInVPackage(IOProperties.X, -1.0D);
      if (d > 0.2D && d < 0.98D) q().setDividerLocation(d);
      e(IOProperties.ArComponentFoxtrot(IOProperties.N, IOProperties.Q));
      this.l = true;
    }
    this.ChangeListener.setVisible(paramBoolean);
    IOProperties.ArComponentCharlie("showTuningConsole", "" + paramBoolean);
    if (paramBoolean) {
      u();
    } else {
      q().setDividerLocation(1.0D);
    }
    return paramBoolean;
  }

  public void ArComponentCharlie(String paramString) {
    if (n().r() == null) {
      ExceptionInVPackage("Please Open ExceptionInVPackage file before the compare file", this);
      return;
    }
    if (this.ArComponentFoxtrot != null && this.ArComponentFoxtrot.isAlive())
      this.ArComponentFoxtrot.ArComponentCharlie();
    this.ArComponentFoxtrot = new ClassTypeInHPackage(this, true);
    if (m() != null) this.ArComponentFoxtrot.ExceptionInVPackage(m());
    this.ArComponentFoxtrot.ExceptionInVPackage(this.ExceptionInVPackage);
    this.ArComponentFoxtrot.ExceptionInVPackage(this);
    this.ArComponentFoxtrot.ExceptionInVPackage(this.ClassTypeInHPackage);
    if (bq.ExceptionInVPackage().k() != null)
      this.ArComponentFoxtrot.ExceptionInVPackage(bq.ExceptionInVPackage().k());
    this.ArComponentFoxtrot.ExceptionInVPackage(paramString);
    this.ArComponentFoxtrot.start();
  }

  public ClassTypeInHPackage m() {
    return bq.ExceptionInVPackage().ArComponentFoxtrot();
  }

  public hx n() {
    return hx.ExceptionInVPackage();
  }

  public void ExceptionInVPackage(Color paramColor) {}

  public void ArComponentCharlie(boolean paramBoolean) {
    this.ClassTypeInHPackage.d(paramBoolean);
  }

  public void d(boolean paramBoolean) {
    this.ClassTypeInHPackage.e(paramBoolean);
  }

  public void ExceptionInVPackage(Color paramColor, int paramInt) {}

  public void ExceptionInVPackage() {}

  public void ExceptionInVPackage(double paramDouble) {
    if (paramDouble == 1.0D) {
      n().ArComponentCharlie(n().p());
      if (n().s() != null) {
        this.e.d(-n().s().d());
        this.e.e(n().r().d());
        n n1 = hx.ExceptionInVPackage().r();
        n n2 = hx.ExceptionInVPackage().s();
        if (this.e != null && n1 != null) {
          this.e.d(-n1.d());
          this.e.e(n().r().d());
          if (hx.ExceptionInVPackage().r() != null) {
            j j1 = this.ExceptionInVPackage.C();
            j j2 = (j1 != null) ? n2.ExceptionInVPackage(j1.ExceptionInVPackage()) : null;
            if (j1 != null
                && j2 != null
                && !j1.x()
                && !j2.x()
                && j1.d(0) < 0.1D
                && j2.d(0) < 0.1D) {
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
              this.e.ArComponentCharlie(b1 - b2);
              if (hx.ExceptionInVPackage().p() <= 0)
                hx.ExceptionInVPackage().ArComponentCharlie(b1);
            } else {
              this.e.ArComponentCharlie(0);
            }
          } else {
            this.e.ArComponentCharlie(0);
          }
        }
        bg bg = new bg(this);
        SwingUtilities.invokeLater(bg);
        d(n().s());
      } else if (n().r() != null) {
        d(n().r());
      }
    } else if (IOProperties.ExceptionInVPackage(IOProperties.U, IOProperties.V)
        && paramDouble >= 0.05D
        && !Double.isInfinite(paramDouble)) {
      if (this.o == null || !this.o.e())
        if (this.n.r() != null) {
          int IOProperties = this.n.r().d();
          int j = (int) (IOProperties / paramDouble);
          ExceptionInVPackage(j);
        } else {
          D.ArComponentCharlie("No DataSet, can't scale.");
        }
    } else if (!this.m && paramDouble < 0.05D) {
      this.m = true;
    }
  }

  public void ExceptionInVPackage(int paramInt) {
    this.ExceptionInVPackage.j(paramInt);
  }

  public void ClassTypeInHPackage() {
    this.IOProperties = true;
  }

  public void d(n paramn) {
    if (IOProperties.o) {
      for (j j : paramn) {
        ChangeListener g1 = ChangeListener.ExceptionInVPackage();
        String str = g1.ExceptionInVPackage("Time");
        if (!j.ExceptionInVPackage().equalsIgnoreCase(str)) j.ExceptionInVPackage(true);
      }
    } else if (!ArComponentCharlie()) {
      for (j j : paramn) j.ExceptionInVPackage(true);
    }
  }

  private boolean ArComponentCharlie() {
    j j = this.ExceptionInVPackage.C();
    return true;
  }

  public void ExceptionInVPackage(n paramn) {
    if (SwingUtilities.isEventDispatchThread()) {
      ArComponentCharlie(paramn);
    } else {
      long l1 = System.currentTimeMillis();
      bh bh = new bh(this, l1, paramn);
      SwingUtilities.invokeLater(bh);
    }
  }

  public void ClassTypeInHPackage(n paramn) {
    n().ArComponentCharlie(paramn);
    if (this.e != null && paramn != null) {
      this.e.d(-paramn.d());
      this.e.e(n().r().d());
      if (hx.ExceptionInVPackage().r() != null) {
        j j1 = this.ExceptionInVPackage.C();
        j j2 = paramn.ExceptionInVPackage(j1.ExceptionInVPackage());
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
          this.e.ArComponentCharlie(b1 - b2);
          if (hx.ExceptionInVPackage().p() <= 0) hx.ExceptionInVPackage().ArComponentCharlie(b1);
        } else {
          this.e.ArComponentCharlie(0);
        }
      } else {
        this.e.ArComponentCharlie(0);
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
    F ArComponentFoxtrot = new F(this.ExceptionInVPackage, 500L);
  }

  public void ClassTypeInHPackage(int paramInt) {
    IOProperties.ArComponentCharlie("compareOffset", paramInt + "");
  }

  public void ExceptionInVPackage(boolean paramBoolean) {}

  public void doLayout() {
    this.e.setVisible((n().s() != null));
    super.doLayout();
  }

  public void ClassTypeInHPackage(double paramDouble) {
    if (n().r() == null) return;
    int IOProperties = (int) ((n().r().d() - 1.0D) * paramDouble);
    n().ArComponentCharlie(IOProperties);
    o();
  }

  void ArComponentCharlie(int paramInt) {
    if (this.ChangeListener != null) {
      this.ChangeListener.ArComponentCharlie(paramInt);
      doLayout();
      this.ChangeListener.doLayout();
    }
    float ArComponentFoxtrot = paramInt / eJ.ExceptionInVPackage();
  }

  public void d(String paramString) {
    if (ClassTypeInHPackage(true)) this.ChangeListener.ClassTypeInHPackage(paramString);
  }

  public aw p() {
    return this.ExceptionInVPackage;
  }

  public JSplitPane q() {
    return this.p;
  }

  public JSplitPane r() {
    return this.q;
  }

  public ClassTypeInHPackage s() {
    return this.o;
  }

  public void e(String paramString) {
    if (paramString.equals(IOProperties.P)) {
      this.ChangeListener.ExceptionInVPackage(this.ClassTypeInHPackage.d());
      this.ChangeListener.ExceptionInVPackage(false);
      this.ClassTypeInHPackage.doLayout();
      this.ChangeListener.ArComponentCharlie().doLayout();
      this.ChangeListener.ArComponentCharlie().validate();
      bi bi = new bi(this);
      SwingUtilities.invokeLater(bi);
    } else {
      this.ClassTypeInHPackage.ExceptionInVPackage(this.ClassTypeInHPackage.d());
      this.ChangeListener.ExceptionInVPackage(true);
      this.ChangeListener.doLayout();
      this.ClassTypeInHPackage.doLayout();
      aZ aZ = new aZ(this);
      SwingUtilities.invokeLater(aZ);
    }
    validate();
  }

  public void t() {
    if (this.ArComponentCharlie != null)
      if (IOProperties.ExceptionInVPackage("showDashboard", true)) {
        Dimension dimension = this.ClassTypeInHPackage.getPreferredSize();
        int IOProperties = getHeight() / 5;
        if (dimension.getHeight() > IOProperties * 1.5D) {
          this.ArComponentCharlie.setPreferredSize(new Dimension(200, IOProperties));
        } else {
          this.ArComponentCharlie.setPreferredSize(dimension);
        }
        double d = IOProperties.ExceptionInVPackage(IOProperties.W, -1.0D);
        if (hx.ExceptionInVPackage().r() == null || d < 0.1D || d > 0.9D) {
          r().setDividerLocation(
                  getHeight()
                      - (this.ArComponentCharlie.getPreferredSize()).height
                      - r().getDividerSize());
        } else {
          r().setDividerLocation(d);
        }
      } else {
        r().setDividerLocation(
                getHeight()
                    - (this.ArComponentCharlie.getMinimumSize()).height
                    - r().getDividerSize());
      }
  }

  public void u() {
    if (e() != null && IOProperties.ExceptionInVPackage("showTuningConsole", IOProperties.p)) {
      double d = IOProperties.ExceptionInVPackage(IOProperties.X, -1.0D);
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
    String str = ArComponentFoxtrot.ExceptionInVPackage().ChangeListener();
    if (str != null && !str.isEmpty()) ArComponentFoxtrot(str);
  }

  public void ArComponentFoxtrot(String paramString) {
    if (paramString != null && !paramString.isEmpty()) {
      ArComponentCharlie c1 =
          ArComponentFoxtrot.ExceptionInVPackage().ArComponentCharlie(paramString);
      ArComponentCharlie c2 = this.ExceptionInVPackage.B();
      if (c1 != null && bq.ExceptionInVPackage().ArComponentCharlie().j()) {
        D.ArComponentCharlie("View Changed: " + bq.ExceptionInVPackage().ArComponentCharlie().j());
        c2.ExceptionInVPackage(c1.ClassTypeInHPackage());
        c2.ExceptionInVPackage(c1.ArComponentFoxtrot());
        ArComponentFoxtrot.ExceptionInVPackage().ExceptionInVPackage(c2);
      }
    }
  }
}

/* Location:              /home/rewrich/Downloads/TunerStudioMS/TunerStudioMS/!/ao/aX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */
